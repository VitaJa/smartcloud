package com.example.smartclouds;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;

public class Home extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tabLayout=(TabLayout)findViewById(R.id.tabLayout);
        viewPager=(ViewPager)findViewById(R.id.viewPager);

        tabLayout.addTab(tabLayout.newTab().setText("Design"));
        tabLayout.addTab(tabLayout.newTab().setText("Finish"));
        tabLayout.addTab(tabLayout.newTab().setText("Ornaments"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ContentAdapter contentAdapter = new ContentAdapter(this, getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(contentAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.about_us:
                Intent intent = new Intent(this, About.class);
                startActivity(intent);
            case R.id.contact_us:
                intent = new Intent(this, Contact.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}