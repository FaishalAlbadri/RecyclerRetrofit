package com.faishalbadri.retrofit.repository;

import android.support.annotation.NonNull;
import com.faishalbadri.retrofit.model.EventCityItem;
import java.util.List;

/**
 * Created by faishal on 22/12/17.
 */

public interface MainDataResource {

  void getData(String apikey, @NonNull DataCallback dataCallback);

  interface DataCallback {

    void onSucces(List<EventCityItem> categoriesItems, String msg);

    void onError(String msg);

  }
}
