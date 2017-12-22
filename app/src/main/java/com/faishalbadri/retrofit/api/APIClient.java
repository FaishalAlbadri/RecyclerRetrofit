package com.faishalbadri.retrofit.api;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by faishal on 22/12/17.
 */

public class APIClient {

  private static Retrofit retrofit = null;

  public static Retrofit getRetrofit() {

    HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
    interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
    OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();


    retrofit = new Retrofit.Builder()
        .baseUrl("http://api.santriprogrammer.com/pinkyhijab/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build();

    return retrofit;
  }

}
