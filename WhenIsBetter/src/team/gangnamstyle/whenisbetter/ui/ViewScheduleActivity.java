package team.gangnamstyle.whenisbetter.ui;

import team.gangnamstyle.whenisbetter.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewScheduleActivity extends Activity {

	TextView tvProjectName, tvProjectManager;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_schedule);

		tvProjectName = (TextView) findViewById(R.id.project_name);
		tvProjectManager = (TextView) findViewById(R.id.project_manager);

		Bundle extras = getIntent().getExtras();

		tvProjectName.setText(extras.getString("projectName"));
		tvProjectManager.setText("Invited by " + extras.getLong("managerId"));

	}
}
