package com.example.myapplication.Adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapplication.AddCloest;
import com.example.myapplication.R;
import com.example.myapplication.data.Clothing;

import java.util.List;

public class CloAdapter extends BaseAdapter {
    private List<Clothing> mList;
    private LayoutInflater layoutInflater;
    private Context context;

    public CloAdapter(Context context1, List<Clothing> list) {
        mList = list;
        this.context = context1;
        layoutInflater = LayoutInflater.from(context1);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return mList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        CloAdapter.ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();


            view = layoutInflater.inflate(R.layout.grid_list_element, null);

            viewHolder.imageView = (ImageView) view.findViewById(R.id.clothing_image);
            viewHolder.textView = (TextView) view.findViewById(R.id.clothing_name);
            view.setTag(viewHolder);
        } else {
            viewHolder = (CloAdapter.ViewHolder) view.getTag();
        }
       // Bitmap bitmap = null;
      //  bitmap = BitmapFactory.decodeFile(mList.get(i).getImageUri());
        Glide.with(context).load(mList.get(i).getImageUri()).into(viewHolder.imageView);
       // viewHolder.imageView.setImageBitmap(bitmap);
        viewHolder.textView.setText(mList.get(i).getName());

        return view;
    }
    public final class ViewHolder {
        public TextView textView, textView1, textView2, textView3, textView4, textView5;
        public ImageView imageView;
    }
}
