package com.example.pc.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyArrayAdapter extends BaseAdapter {
    Context myConText;
    int myLayout;
    List<CauThu> mylstCT;
    public MyArrayAdapter(Context contex, int layout, List<CauThu> lstCT)
    {
        myConText=contex;
        myLayout= layout;
        mylstCT= lstCT;
    }

    @Override
    public int getCount() {
        return mylstCT.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        ViewHolder holder;
        if(view==null)
        {
            LayoutInflater inflater = (LayoutInflater) myConText.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(myLayout, null);
            holder= new ViewHolder();
            //Ánh xạ
            holder.name = (TextView) view.findViewById(R.id.tvName);
            holder.year = (TextView) view.findViewById(R.id.tvYear);
            holder.hinh = (ImageView) view.findViewById(R.id.img_Hinh);
            holder.hinhmot = (ImageView) view.findViewById(R.id.img_Hinh1);
            view.setTag(holder);
        } else
            holder= (ViewHolder) view.getTag();
        //Gán giá trị từ List SV
        holder.name.setText(mylstCT.get(i).getName());
        holder.year.setText(mylstCT.get(i).getYear());
        holder.hinh.setImageResource(mylstCT.get(i).getHinh());
        holder.hinhmot.setImageResource(mylstCT.get(i).getHinhmot());


        return view;
    }
    private  class  ViewHolder
    {
        private  TextView name, year;
        private ImageView hinh,hinhmot;


    }
}
