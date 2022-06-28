package com.example.instauiarraylistactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.instauiarraylistactivity.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> userId=new ArrayList<>();
    ArrayList<Integer> dpPic=new ArrayList<>();
    ArrayList<Integer> postPic=new ArrayList<>();
    ArrayList<String> likeByLines=new ArrayList<>();
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        intiView();
    }

    private void intiView() {

        userId.add("drashanraval");
        userId.add("drashanraval");
        userId.add("drashanraval");
        userId.add("drashanraval");
        userId.add("drashanraval");

        dpPic.add(R.drawable.img);
        dpPic.add(R.drawable.img);
        dpPic.add(R.drawable.img);
        dpPic.add(R.drawable.img);
        dpPic.add(R.drawable.img);

        postPic.add(R.drawable.img_1);
        postPic.add(R.drawable.img_1);
        postPic.add(R.drawable.img_1);
        postPic.add(R.drawable.img_1);
        postPic.add(R.drawable.img_1);

        likeByLines.add("Liked by dhuli_130 and 4,500 others");
        likeByLines.add("Liked by dhuli_130 and 4,500 others");
        likeByLines.add("Liked by dhuli_130 and 4,500 others");
        likeByLines.add("Liked by dhuli_130 and 4,500 others");
        likeByLines.add("Liked by dhuli_130 and 4,500 others");

        ListViewAdapter ad = new ListViewAdapter(MainActivity.this,userId,likeByLines,postPic,dpPic);
        binding.listView.setAdapter(ad);
    }
}