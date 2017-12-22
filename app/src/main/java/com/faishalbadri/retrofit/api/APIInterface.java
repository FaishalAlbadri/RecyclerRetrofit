package com.faishalbadri.retrofit.api;

import com.faishalbadri.retrofit.model.categories.CategoriesResponse;
import com.faishalbadri.retrofit.model.city.CityResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by faishal on 22/12/17.
 */

public interface APIInterface {

//  @FormUrlEncoded
//  @POST("getTbPerKategori.php")
//  Call<IsiResponse> getIsi(@Field("id_kategori") String id_kategori);

  @GET("categories")
  Call<CategoriesResponse> getCategories(@Header("Authorization") String apikey);

  @GET("event_city")
  Call<CityResponse> getCity(@Header("Authorization") String apikey);
}
