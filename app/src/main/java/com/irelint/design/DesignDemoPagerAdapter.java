package com.irelint.design;

/**
 * 作者：当我遇上你 on 2016-9-18 14:00
 * 邮箱：cuishiying163@163.com
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class DesignDemoPagerAdapter extends FragmentStatePagerAdapter {

    public DesignDemoPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return DesignDemoFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Tab " + position;
    }
}
