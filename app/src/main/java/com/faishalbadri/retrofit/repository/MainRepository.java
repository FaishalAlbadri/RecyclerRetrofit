package com.faishalbadri.retrofit.repository;

import android.support.annotation.NonNull;

/**
 * Created by faishal on 22/12/17.
 */

public class MainRepository implements MainDataResource {

  MainDataResource mainDataResource;

  public MainRepository(MainDataResource mainDataResource) {
    this.mainDataResource = mainDataResource;
  }

  @Override
  public void getData(String apikey, @NonNull DataCallback dataCallback) {
    mainDataResource.getData(apikey, dataCallback);
  }
}
