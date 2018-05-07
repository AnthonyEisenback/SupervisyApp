package com.example.anthonyeisenback.supervisy;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.anthonyeisenback.supervisy.Tabs.LotList;
import com.example.anthonyeisenback.supervisy.Tabs.Registers;
import com.example.anthonyeisenback.supervisy.Tabs.Schedules;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());


        mViewPager =  findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fragment_tabs, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    }

class SectionsPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                LotList tab1 = new LotList();
                return tab1;
            case 1:
                Schedules tab2 = new Schedules();
                return tab2;
            case 2:
                Registers tab3 = new Registers();
                return tab3;
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }
}