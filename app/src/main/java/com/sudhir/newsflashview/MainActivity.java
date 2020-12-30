package com.sudhir.newsflashview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.sudhir.newsflashview.lab.NewsflashView;
import com.sudhir.newsflashview.lab.model.NewsflashModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> mDatas;
    ArrayList<NewsflashModel> mNewsflashModels;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        NewsflashView newsflashView = findViewById(R.id.newsflash);
        newsflashView.setNewsflash(mDatas);
        newsflashView.setOnNewsflashClickListener(new NewsflashView.OnNewsflashClickListener() {
            @Override
            public void onNewsflashClick(int position) {
                Toast.makeText(MainActivity.this, mDatas.get(position), Toast.LENGTH_SHORT).show();
            }
        });
        newsflashView.startFlipping();

        NewsflashView newsflashView2 = (NewsflashView) findViewById(R.id.newsflash2);
        newsflashView2.setLabeledNewsflash(mNewsflashModels);
        newsflashView2.setOnNewsflashClickListener(new NewsflashView.OnNewsflashClickListener() {
            @Override
            public void onNewsflashClick(int position) {
                Toast.makeText(MainActivity.this, mNewsflashModels.get(position).getContent(), Toast.LENGTH_SHORT).show();
            }
        });
        newsflashView2.startFlipping();
    }

    private void initData() {
        mDatas = new ArrayList<>();
        mNewsflashModels = new ArrayList<>();
        mDatas.add("Explosive Jingdong Health is 50% off!");
        mDatas.add("Recommend good goods for 9 yuan 9, millions of red envelopes are available immediately!");
        mDatas.add("Big promotion Place an order to open the lucky bag, and billions of New Year red envelopes are waiting for you!");

        mNewsflashModels.add(new NewsflashModel("Hot comments", "Surprise in advance: the largest factory finally ushered in Android 7.0", "Hot comments", "How difficult is the most difficult puzzle in the world? Don't accept it!"));
        mNewsflashModels.add(new NewsflashModel("Hot comments", "Surprise in advance: the largest factory finally ushered in Android 7.0", "Hot comments", "How difficult is the most difficult puzzle in the world? Don't accept it!"));
        mNewsflashModels.add(new NewsflashModel("Hot comments", "Surprise in advance: the largest factory finally ushered in Android 7.0", "Hot comments", "How difficult is the most difficult puzzle in the world? Don't accept it!"));

    }
}