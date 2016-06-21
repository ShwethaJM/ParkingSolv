package com.android.parkingsolv;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.app.ActionBar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OffersActivity extends FragmentActivity implements ActionBar.TabListener{

    ActionBar actionBar;
    ViewPager viewPager;
    FragmentPagAdaptor fragmentPagAdaptor;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offers);
        viewPager =(ViewPager)findViewById(R.id.offerPager);
        fragmentPagAdaptor = new FragmentPagAdaptor(getSupportFragmentManager());
        viewPager.setAdapter(fragmentPagAdaptor);
        actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.addTab(actionBar.newTab().setText("Today Offers").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("My Cash").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("Check Offers").setTabListener(this));
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                    actionBar.setNavigationMode(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        button = (Button)findViewById(R.id.todayOfferHomeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OffersActivity.this, HomeActivity.class);
                startActivity(intent);
                // close this activity
                finish();
            }
        });

    }

       @Override
    public void onTabSelected(ActionBar.Tab tab, android.app.FragmentTransaction fragmentTransaction) {
           viewPager.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, android.app.FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, android.app.FragmentTransaction fragmentTransaction) {

    }

}
