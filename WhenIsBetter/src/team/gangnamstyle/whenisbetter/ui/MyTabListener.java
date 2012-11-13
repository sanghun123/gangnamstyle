package team.gangnamstyle.whenisbetter.ui;

import team.gangnamstyle.whenisbetter.R;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Fragment;
import android.app.FragmentTransaction;

public class MyTabListener implements ActionBar.TabListener {
	public Fragment fragment;

	public MyTabListener(Fragment fragment) {
		this.fragment = fragment;
	}

	public void onTabReselected(Tab tab, FragmentTransaction ft) {
	}

	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		ft.replace(R.id.fragment_container, fragment);
	}

	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		ft.remove(fragment);
	}

}
