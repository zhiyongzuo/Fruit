package com.example.testing.fruit;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.testing.fruit.adapter.ViewPagerAdapter;
import com.example.testing.fruit.fragment.CartFragment;
import com.example.testing.fruit.fragment.CategoryFragment;
import com.example.testing.fruit.fragment.HomeFragment;
import com.example.testing.fruit.fragment.HotFragment;
import com.example.testing.fruit.fragment.MeFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private ViewPagerAdapter mViewPagerAdapter;
    private TabLayout mTabLayout;
    private ArrayList<Fragment> mList;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager)findViewById(R.id.view_pager);
        mTabLayout = (TabLayout)findViewById(R.id.tab_layout);

        mList = new ArrayList<>();
        Fragment mHomeFragment = new HomeFragment();
        Fragment mCategoryFragment = new CategoryFragment();
        Fragment mHotFragment = new HotFragment();
        Fragment mCartFragment = new CartFragment();
        Fragment mMeFragment = new MeFragment();

        mViewPagerAdapter = new ViewPagerAdapter();
        mViewPager.setAdapter(mViewPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
