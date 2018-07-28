package com.wetwo.common.utils;


import com.wetwo.common.Constant;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLEncoder;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/**
 * Created by FHZ on 2018/7/19.
 */

public class Bean2ParamUtils {
    private static String TAG =Bean2ParamUtils.class.getSimpleName();
    public static <T> String generateGetReqUrl(T t) {
        //路径首字母小写
        StringBuilder stringBuilderReqUrl=new StringBuilder();
        stringBuilderReqUrl.append(Constant.reqAddr).append(t.getClass().getSimpleName().charAt(0) + 32).append(t.getClass().getSimpleName().substring(1));
        Field[] fields = t.getClass().getDeclaredFields();
        try {
            for (Field field : fields) {
                field.setAccessible(true);
                if (field.get(t) != null) {
                    stringBuilderReqUrl.append("&").append(field.getName()).append("=").append(URLEncoder.encode(("" + field.get(t)), "UTF-8"));
                }
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return stringBuilderReqUrl.toString().trim();
    }

    public static <T> RequestBody generatePostReqUrl(T t) {
        Field[] fields = t.getClass().getDeclaredFields();
        MultipartBody.Builder builder=new MultipartBody.Builder().setType(MultipartBody.FORM);

        String fileName=null;
        RequestBody requestBodyFile=null;
        try {
            for (Field field : fields) {
                field.setAccessible(true);
                if (field.get(t) != null) {
                    if(field.getName().equals("file")){
                        requestBodyFile=RequestBody.create(MediaType.parse("application/octet-stream"),(File)field.get(t));
                        continue;
                    }if(field.getName().equals("fileName")){
                        fileName=URLEncoder.encode(("" + field.get(t)), "UTF-8");
                    }else {
                        builder.addFormDataPart(field.getName(), URLEncoder.encode(("" + field.get(t)), "UTF-8"));
                    }
                }
            }

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return builder.addFormDataPart("file",fileName,requestBodyFile).build();
    }
}
