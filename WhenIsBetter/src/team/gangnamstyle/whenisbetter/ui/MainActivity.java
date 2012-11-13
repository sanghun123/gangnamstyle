package team.gangnamstyle.whenisbetter.ui;

import team.gangnamstyle.whenisbetter.R;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// set up actionbar
		ActionBar actionbar = getActionBar();
		actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		ActionBar.Tab joinTab = actionbar.newTab().setText("Join");
		ActionBar.Tab viewTab = actionbar.newTab().setText("View");
		ActionBar.Tab createTab = actionbar.newTab().setText("Create");

		// create fragment
		Fragment joinFragment = new JoinFragment();
		Fragment viewFragment = new ViewFragment();
		Fragment createFragment = new CreateFragment();

		// set the tab listener
		joinTab.setTabListener(new MyTabListener(joinFragment));
		viewTab.setTabListener(new MyTabListener(viewFragment));
		createTab.setTabListener(new MyTabListener(createFragment));

		// add the two tabs to actionbar
		actionbar.addTab(joinTab);
		actionbar.addTab(viewTab);
		actionbar.addTab(createTab);
	}

}