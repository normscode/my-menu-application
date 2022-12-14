package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;
import java.util.List;

import app.num.numandroidpagecurleffect.PageCurlView;


public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    //Carousel Variables
    private int[] mImages= new int[]{
            R.drawable.picturename1,R.drawable.picturename3,R.drawable.picturename2
    };
    private String[] Titles= new String[]{
            "Picture Title1","Picture Title2","Picture Title3"

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Carousel Main
        CarouselView carou_sample= (CarouselView) findViewById(R.id.carousel_sample);
        carou_sample.setPageCount(mImages.length);

        carou_sample.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages[position]);
            }
        });

        //Carousel Method
        carou_sample.setImageClickListener(new ImageClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(MainActivity.this, Titles[position], Toast.LENGTH_SHORT).show();
            }
        });

        //PageCurl Lunch
        // TIP: Just duplicate this code if you want to create another PageCurl and change the variables and pictures
        PageCurlView pageCurlView = (PageCurlView) findViewById(R.id.pagecurl_name);
        List<Integer> pages_id = new ArrayList<>();
        pages_id.add(R.drawable.pic_name1);
        pages_id.add(R.drawable.pic_name2);
        pages_id.add(R.drawable.pic_name3);

        pageCurlView.setCurlView(pages_id);
        pageCurlView.setCurlSpeed(100);
    }
}