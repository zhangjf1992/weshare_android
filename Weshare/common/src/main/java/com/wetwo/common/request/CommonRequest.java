package com.wetwo.common.request;

import com.wetwo.common.Constant;
import com.wetwo.common.util.Bean2ParamUtils;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * Created by zh on 2017/6/14.
 */

public class CommonRequest {

    private String TAG = CommonRequest.class.getSimpleName();

    private <T> void requestGet(Class<T> reqCls, Callback callback) {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(Bean2ParamUtils.generateGetReqUrl(reqCls))
                .build();
        okHttpClient.newCall(request).enqueue(callback);
    }

    private <T> void requestPost(Class<T> reqCls, Callback callback) {
        OkHttpClient okHttpClient = new OkHttpClient();
        RequestBody requestBody = Bean2ParamUtils.generatePostReqUrl(reqCls);
        Request request = new Request.Builder()
                .url(Constant.reqAddr + reqCls.getSimpleName())
                .post(requestBody)
                .build();
        okHttpClient.newCall(request).enqueue(callback);
    }
}
