package com.example.instauiarraylistactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    ArrayList<String> userId = new ArrayList<>();
    ArrayList<Integer> dpPic = new ArrayList<>();
    ArrayList<Integer> postPic = new ArrayList<>();
    ArrayList<String> likeByLines = new ArrayList<>();
    Context context;

    public ListViewAdapter(Context Context, ArrayList<String> userId, ArrayList<String> likeByLines, ArrayList<Integer> postPic, ArrayList<Integer> dpPic) {
        this.userId = userId;
        this.likeByLines = likeByLines;
        this.postPic = postPic;
        this.dpPic = dpPic;
        this.context = Context;
    }

    @Override
    public int getCount() {
        return userId.size();
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.list_ui_items, null);
        TextView userName = view.findViewById(R.id.userName);
        ImageView postDp1 = view.findViewById(R.id.postDp1);
        ImageView postImg1 = view.findViewById(R.id.postImg1);
        TextView likeLine1 = view.findViewById(R.id.likeLine1);


        postDp1.setImageResource(dpPic.get(i));
        userName.setText(userId.get(i));
        postImg1.setImageResource(postPic.get(i));
        likeLine1.setText(likeByLines.get(i));


        return view;
    }
}