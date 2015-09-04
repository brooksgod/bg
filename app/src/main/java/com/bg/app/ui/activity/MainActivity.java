package com.bg.app.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bg.app.R;
import com.bg.app.adapter.ZygoteFragmentAdapter;
import com.bg.app.ui.view.MainBottomTabLayout;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        private ZygoteFragmentAdapter mAdapter;
        private ViewPager mPager;
        private MainBottomTabLayout mTabLayout;

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            setupViews(rootView);
            return rootView;
        }

        private void setupViews(View view) {
            mAdapter = new ZygoteFragmentAdapter(getFragmentManager(), getActivity());
            mPager = (ViewPager) view.findViewById(R.id.tab_pager);
            mPager.setAdapter(mAdapter);
            mTabLayout = (MainBottomTabLayout) view.findViewById(R.id.main_bottom_tablayout);
            mTabLayout.setViewPager(mPager);
        }
    }
}
