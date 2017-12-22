package com.faishalbadri.retrofit.api;

import com.faishalbadri.retrofit.model.CityResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * Created by faishal on 22/12/17.
 */

public interface APIInterface {

//  @FormUrlEncoded
//  @POST("getTbPerKategori.php")
//  Call<IsiResponse> getIsi(@Field("id_kategori") String id_kategori);

  @GET("event_city")
  Call<CityResponse> getCity(@Header("Authorization") String apikey);
}
