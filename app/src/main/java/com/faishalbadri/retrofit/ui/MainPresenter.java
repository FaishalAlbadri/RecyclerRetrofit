package com.faishalbadri.retrofit.ui;

import com.faishalbadri.retrofit.model.city.EventCityItem;
import com.faishalbadri.retrofit.repository.MainDataResource.DataCallback;
import com.faishalbadri.retrofit.repository.MainRepository;
import com.faishalbadri.retrofit.ui.MainContract.MainView;
import java.util.List;

/**
 * Created by faishal on 22/12/17.
 */

public class MainPresenter implements MainContract.MainPresenter {

  MainContract.MainView mainView;
  MainRepository mainRepository;

  public MainPresenter(MainRepository mainRepository) {
    this.mainRepository = mainRepository;
  }

  @Override
  public void onAttachView(MainView view) {
    this.mainView = view;
  }

  @Override
  public void onDettachView() {

  }

  @Override
  public void getData(String apikey) {
    mainRepository.getData(apikey, new DataCallback() {
      @Override
      public void onSucces(List<EventCityItem> eventCityItems, String msg) {
        mainView.onSucces(eventCityItems, msg);
      }

      @Override
      public void onError(String msg) {
        mainView.onError(msg);
      }
    });
  }
}
