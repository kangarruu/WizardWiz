package com.example.android.wizardwiz;

import android.graphics.Typeface;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Open source font from: http://www.fontspace.com/carpe-saponem/lumos*/
        TextView main_heading_textView = (TextView) findViewById(R.id.main_heading_textView);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/lumos.ttf");
        main_heading_textView.setTypeface(myCustomFont);

        //Find the viewPager that will allow user to scroll through the fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.main_viewpager);

        //Create an adapter to display the fragments
        WizardFragmentPageAdapter adapter = new WizardFragmentPageAdapter(getSupportFragmentManager(),
                MainActivity.this);
        //Set the adapter on the viewPager
        viewPager.setAdapter(adapter);

        //Locate a TabLayout and set the viewPager on it
        TabLayout tabLayout = (TabLayout) findViewById(R.id.main_sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}
