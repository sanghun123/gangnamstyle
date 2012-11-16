package team.gangnamstyle.whenisbetter.ui;

import team.gangnamstyle.whenisbetter.R;
import team.gangnamstyle.whenisbetter.WhenIsBetter;
import team.gangnamstyle.whenisbetter.model.Member;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

	Activity activity;

	protected WhenIsBetter login;
	Member user;
	long phoneId;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		activity = this;
		login = (WhenIsBetter) activity.getApplication();
		user = login.getUser();

		// set up action bar
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

		// add the two tabs to action bar
		actionbar.addTab(joinTab);
		actionbar.addTab(viewTab);
		actionbar.addTab(createTab);

		/* end of tab set up */

		phoneId = user.getMemberId();

		Toast.makeText(this, "Logged in as phone # " + phoneId,
				Toast.LENGTH_LONG).show();

	}
}
