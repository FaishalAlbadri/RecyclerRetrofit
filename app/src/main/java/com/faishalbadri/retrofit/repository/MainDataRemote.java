package com.faishalbadri.retrofit.repository;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import com.faishalbadri.retrofit.api.APIClient;
import com.faishalbadri.retrofit.api.APIInterface;
import com.faishalbadri.retrofit.model.city.CityResponse;
import com.faishalbadri.retrofit.model.city.EventCityItem;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by faishal on 22/12/17.
 */

public class MainDataRemote implements MainDataResource {

  Context context;

  public MainDataRemote(Context context) {
    this.context = context;
  }

  @Override
  public void getData(String apikey, @NonNull final DataCallback dataCallback) {
    APIInterface apiInterface = APIClient.getRetrofit().create(APIInterface.class);
    final Call<CityResponse> cityResponseCall = apiInterface.getCity(apikey);
    cityResponseCall.enqueue(new Callback<CityResponse>() {
      @Override
      public void onResponse(Call<CityResponse> call, Response<CityResponse> response) {
        try {
          if (response.body().getEventCity() != null) {
            CityResponse cityResponse = response.body();
            List<EventCityItem> data = cityResponse.getEventCity();
            Log.i("response", String.valueOf(cityResponse.getEventCity()));
            dataCallback.onSucces(data, "Succes");
          } else {
            dataCallback.onError("Null");
          }
        } catch (Exception e) {

        }

      }

      @Override
      public void onFailure(Call<CityResponse> call, Throwable t) {
        dataCallback.onError("No internet connection");
      }
    });
  }
}
