package com.faishalbadri.retrofit.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.faishalbadri.retrofit.R;
import com.faishalbadri.retrofit.model.EventCityItem;
import com.faishalbadri.retrofit.repository.MainRepositoryInject;
import com.faishalbadri.retrofit.ui.MainContract.MainView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {

  List<EventCityItem> listdata;
  MainPresenter mainPresenter;
  MainAdapter mainAdapter;
  @BindView(R.id.recycler)
  RecyclerView recycler;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    setView();
    mainPresenter.getData("57b44757920f9b2544cd57f1d998e7f7");
  }

  private void setView() {
    listdata = new ArrayList<>();
    mainPresenter = new MainPresenter(
        MainRepositoryInject.provideToInject(getApplicationContext()));
    mainPresenter.onAttachView(this);
    mainAdapter = new MainAdapter(MainActivity.this, listdata);
    recycler.setLayoutManager(new LinearLayoutManager(this));
    recycler.setAdapter(mainAdapter);
  }


  @Override
  public void onSucces(List<EventCityItem> list, String msg) {
    listdata.clear();
    listdata.addAll(list);
    mainAdapter.notifyDataSetChanged();
  }

  @Override
  public void onError(String msg) {
    toast(msg);
  }

  private void toast(String msg) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
  }
}
