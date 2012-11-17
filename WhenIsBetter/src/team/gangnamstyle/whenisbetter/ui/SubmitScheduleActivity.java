package team.gangnamstyle.whenisbetter.ui;

import team.gangnamstyle.whenisbetter.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SubmitScheduleActivity extends Activity {

	TextView tvProjectName, tvProjectManager;
	Button btnSubmit;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.submit_schedule);
		tvProjectName = (TextView) findViewById(R.id.project_name);
		tvProjectManager = (TextView) findViewById(R.id.project_manager);
		btnSubmit = (Button) findViewById(R.id.submit);

		Bundle extras = getIntent().getExtras();

		tvProjectName.setText(extras.getString("projectName"));
		tvProjectManager.setText("Invited by " + extras.getLong("managerId"));
		btnSubmit.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(SubmitScheduleActivity.this, "Submitting...",
						Toast.LENGTH_SHORT).show();
			}
		});
	}
}
