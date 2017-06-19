package com.example.testing.fruit.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by tomsdeath on 2017/6/15.
 */

public class ViewPagerAdapter extends PagerAdapter {

    public ViewPagerAdapter() {
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
