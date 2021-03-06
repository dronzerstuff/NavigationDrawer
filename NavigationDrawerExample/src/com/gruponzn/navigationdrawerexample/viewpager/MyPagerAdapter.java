package com.gruponzn.navigationdrawerexample.viewpager;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

import com.gruponzn.navigationdrawerexample.fragments.PagerFragment;

public class MyPagerAdapter extends FragmentStatePagerAdapter {

	public MyPagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int position) {
		switch (position) {
		case 0: // Fragment # 0 - This will show FirstFragment
			return PagerFragment.newInstance(0, "Page # 1");
		case 1: // Fragment # 0 - This will show FirstFragment different title
			return PagerFragment.newInstance(1, "Page # 2");
		case 2: // Fragment # 1 - This will show SecondFragment
			return PagerFragment.newInstance(2, "Page # 3");
		default:
			return null;
		}
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public CharSequence getPageTitle(int position) {

		switch (position) {
		case 0:
			return "Pagina 1";

		case 1:
			return "Pagina 2";

		case 2:
			return "Pagina 3";

		default:
			return null;
		}
	}
}
