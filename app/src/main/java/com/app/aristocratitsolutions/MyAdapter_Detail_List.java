package com.app.aristocratitsolutions;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by aristocrat on 11/1/16.
 */
public class MyAdapter_Detail_List extends RecyclerView.Adapter<MyAdapter_Detail_List.DataViewHolder> {

    private int rowLayout;
    private List<MyData> service_list;
    private Context mContext;

    public MyAdapter_Detail_List(List<MyData> service_list, int rowLayout, Context mContext)
    {
        this.service_list = service_list;
        this.rowLayout = rowLayout;
        this.mContext = mContext;
    }

    @Override
    public MyAdapter_Detail_List.DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new DataViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyAdapter_Detail_List.DataViewHolder holder, final int position) {
        MyData md = service_list.get(position);
        holder.service_name.setText(md.service_name);
        holder.service_image.setImageDrawable(mContext.getDrawable(md.getImageResourceId(mContext)));
        holder.service_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (position)
                {
                    case 0:
                        v.getContext().startActivity(new Intent(v.getContext(),softwaresActivity.class));
                        break;
                    case 1:

                    default:
                        Toast.makeText(v.getContext(),"Pressed " + position,Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return service_list == null ? 0 : service_list.size();

    }

    public static class DataViewHolder extends RecyclerView.ViewHolder {

        protected TextView service_name;
        protected ImageView service_image;

        public DataViewHolder(View itemView) {
            super(itemView);
            service_name = (TextView) itemView.findViewById(R.id.text_soft_serv_list);
            service_image = (ImageView) itemView.findViewById(R.id.image_soft_serv_list);
        }
    }
}
