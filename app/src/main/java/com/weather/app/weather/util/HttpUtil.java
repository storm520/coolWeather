package com.weather.app.weather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 发起请求方法
 */
public class HttpUtil {
    public static void staticSendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        okHttpClient.newCall(request).enqueue(callback);
    }
}
