package com.faishalbadri.retrofit.repository;

import android.content.Context;

/**
 * Created by faishal on 22/12/17.
 */

public class MainRepositoryInject {

  public static MainRepository provideToInject(Context context){
    return new MainRepository(new MainDataRemote(context));
  }
}
