package com.lsy.tally;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

public class RecordActivity extends AppCompatActivity implements View.OnClickListener {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
       ImageView imageView=findViewById(R.id.record_tab_back);
       tabLayout= findViewById(R.id.record_tab_tabLayout);
       viewPager=findViewById(R.id.record_ViewPager);
       
       imageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}