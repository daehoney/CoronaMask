package com.soarnine.coronamask.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiRunner {
    private static Retrofit getEndPointInstance() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        return new Retrofit.Builder()
                .client(client)
                .baseUrl("https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static CoronaService getCoronaService() {
        return getEndPointInstance().create(CoronaService.class);
    }
}
