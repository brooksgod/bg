package com.bg.app.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.bg.app.ui.fragment.TestFragment;
import com.bg.app.utils.LogUtil;

/**
 * Created by brooks on 4/25/15.
 */
public class ZygoteFragmentAdapter extends FragmentPagerAdapter {
    private Fragment mConversationFragment = null;
    private FragmentManager mFragmentManager = null;
    private Context mContext;

    protected static final String[] CONTENT = new String[]{"A", "B", "C", "D"};
    private int mCount = CONTENT.length;

    private final static int SLIDE_STIRP_TO_OFFICE = 0;
    private final static int SLIDE_STIRP_TO_HOME = 2;
    private final static int SLIDE_STIRP_TO_PROJECT = 1;
    private final static int SLIDE_STIRP_TO_MESSAGE = 3;

    public ZygoteFragmentAdapter(FragmentManager fm, Context ctx) {
        super(fm);
        mContext = ctx;
    }

    @Override
    public Fragment getItem(int position) {
        return checkoutFragment(position);
    }

    @Override
    public int getCount() {
        return mCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return ZygoteFragmentAdapter.CONTENT[position % CONTENT.length];
    }

    public Fragment checkoutFragment(int position) {
        LogUtil.debug("position is " + position);

        if (SLIDE_STIRP_TO_HOME == position) {
            return TestFragment.newInstance("", "");
        }

        if (SLIDE_STIRP_TO_OFFICE == position) {
            return TestFragment.newInstance("", "");
        }

        if (SLIDE_STIRP_TO_PROJECT == position) {
            return TestFragment.newInstance("", "");
        }

        if (SLIDE_STIRP_TO_MESSAGE == position) {
            return TestFragment.newInstance("", "");
        }

        return TestFragment.newInstance("", "");
    };
}
