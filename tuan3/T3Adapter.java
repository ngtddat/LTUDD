package com.example.myapplication.tuan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.Base64;

public class T3Adapter extends BaseAdapter {
    private ArrayList<T3Contract> ls;
    private Context context;

    public T3Adapter(ArrayList<T3Contract> ls, Context context) {
        this.ls = ls;
        this.context = context;
    }

    public int getCount() {
        return ls.size();
    }

    @Override
    public Object getItem(int position) {
        return ls.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewA va;
        if(convertView==null){
            va = new ViewA();
            convertView = LayoutInflater.from(context).inflate(R.layout.tuan3_listview_item, null);
            va.img_hinh=convertView.findViewById(R.id.t3ItemHinh);
            va.tv_ten=convertView.findViewById(R.id.t3ItemTen);
            va.tv_tuoi=convertView.findViewById(R.id.t3ItemTuoi);
            convertView.setTag(va);
        }
        else {
            va=(ViewA) convertView.getTag();
        }
        va.img_hinh.setImageResource(ls.get(position).getHinh());
        va.tv_ten.setText(ls.get(position).getTen());
        va.tv_tuoi.setText(ls.get(position).getTuoi());
        return convertView;
    }
    class ViewA{
        ImageView img_hinh;
        TextView tv_ten, tv_tuoi;

    }
}
