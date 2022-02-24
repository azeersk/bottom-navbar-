package com.example.bottomapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.ClipData;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Switch;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView BottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.My_frames,new firstFragment()).commit();

        BottomNav = (BottomNavigationView) findViewById(R.id.bottom_nav);
        BottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment tem =null;
                switch(item.getItemId()){
                    case R.id.home_item:
                        tem = new firstFragment();
                        break;
                    case R.id.search_item:
                        tem = new secondFragment();
                        break;
                    case R.id.video_item:
                        tem = new therdFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.My_frames,tem).commit();
                return true;
            }
        });
    }
}