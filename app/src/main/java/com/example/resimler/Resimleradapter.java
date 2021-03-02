package com.example.resimler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import Model.Resimler;

public class Resimleradapter  extends BaseAdapter {
    List<Resimler> list;
    Context context;

    public Resimleradapter(List<Resimler> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.layout,parent,false);
        ImageView imageView=convertView.findViewById(R.id.imagevieww);
        TextView id=convertView.findViewById(R.id.id);
        TextView marka=convertView.findViewById(R.id.marka);
        TextView fiyat=convertView.findViewById(R.id.fiyat);

        id.setText(""+list.get(position).getId());
        marka.setText(list.get(position).getMarka());
        fiyat.setText(list.get(position).getFiyat());
        Picasso.get().load("https://alexkanada.000webhostapp.com/resimler/"+list.get(position).getResim()).into(imageView);
        return  convertView;

    }
}
