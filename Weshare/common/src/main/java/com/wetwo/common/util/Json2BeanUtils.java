package com.wetwo.common.util;

import com.google.gson.Gson;

import org.json.JSONObject;

/**
 * Created by zh on 2017/6/14.
 */

public class Json2BeanUtils {
    public static <T> T parse(JSONObject jsonObject, Class<T> cls)throws IllegalArgumentException{
        if(jsonObject==null||"".equals(jsonObject.toString())){
            throw new IllegalArgumentException();
        }
        T t= new Gson().fromJson(jsonObject.toString(),cls);
        return t;
    }
}
