package com.faishalbadri.retrofit.ui;

import com.faishalbadri.retrofit.base.BasePresenter;
import com.faishalbadri.retrofit.model.categories.CategoriesItem;
import com.faishalbadri.retrofit.model.city.EventCityItem;
import java.util.List;

/**
 * Created by faishal on 22/12/17.
 */

public class MainContract {

  public interface MainView {

    void onSucces(List<EventCityItem> list, String msg);

    void onError(String msg);
  }

  public interface MainPresenter extends BasePresenter<MainView> {

    void getData(String apikey);
  }

}
