package com.faishalbadri.retrofit.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.faishalbadri.retrofit.R;
import com.faishalbadri.retrofit.model.EventCityItem;
import com.faishalbadri.retrofit.ui.MainAdapter.ViewHolder;
import java.util.List;

/**
 * Created by faishal on 22/12/17.
 */

public class MainAdapter extends Adapter<ViewHolder> {

  Context context;
  List<EventCityItem> list;


  public MainAdapter(Context context, List<EventCityItem> list) {
    this.context = context;
    this.list = list;
  }

  @Override
  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
    final ViewHolder viewHolder = new ViewHolder(view);
    return viewHolder;
  }

  @Override
  public void onBindViewHolder(ViewHolder holder, int position) {
    holder.textList.setText(list.get(position).getEventCityName());
  }

  @Override
  public int getItemCount() {
    return list.size();
  }

  public class ViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.text_list)
    TextView textList;

    public ViewHolder(View itemView) {
      super(itemView);
      ButterKnife.bind(this, itemView);

    }
  }
}
