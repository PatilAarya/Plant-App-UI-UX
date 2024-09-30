package com.example.plantappui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import com.example.plantappui.adapter.ItemDetailAdapter;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ItemDetailActivity extends AppCompatActivity {

    ImageButton backBtn;
    List<Integer> imgList = new ArrayList<>();
    ViewPager viewPager;
    WormDotsIndicator dotsIndicator;
    ItemDetailAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        hideStatusbar();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        backBtn = findViewById(R.id.back_button);
        viewPager = findViewById(R.id.view_pager);
        dotsIndicator = findViewById(R.id.dots_layout);
        Button buyNowButton = findViewById(R.id.buy_now_button);
        Button descriptionButton = findViewById(R.id.description_button);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }

        });

        buyNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemDetailActivity.this, BuyNowActivity.class);
                intent.putExtra("plant_name", "Algora Plant");
                intent.putExtra("plant_cost", "$300");
                intent.putExtra("plant_image_res_id", R.drawable.img_main);
                startActivity(intent);
            }
        });


        descriptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemDetailActivity.this, DescriptionActivity.class);
                intent.putExtra("plant_name", "Algora Plant");
                intent.putExtra("plant_cost", "$300");
                // Add any other data you want to pass to the DescriptionActivity here
                startActivity(intent);
            }
        });

        imgList.add(R.drawable.detail_home_picture);
        imgList.add(R.drawable.detail_home_picture);
        imgList.add(R.drawable.detail_home_picture);
        imgList.add(R.drawable.detail_home_picture);

        adapter = new ItemDetailAdapter(getApplicationContext(),imgList,getLayoutInflater());
        viewPager.setAdapter(adapter);
        dotsIndicator.setViewPager(viewPager);
        adapter.notifyDataSetChanged();
    }

    private void hideStatusbar() {
        if (Build.VERSION.SDK_INT>=19){
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
            getWindow().getDecorView().setSystemUiVisibility(3328);
        }
        else {
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
    }
}