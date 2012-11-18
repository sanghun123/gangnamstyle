package team.gangnamstyle.whenisbetter.ui;

import team.gangnamstyle.whenisbetter.R;
import team.gangnamstyle.whenisbetter.model.Schedule;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SubmitScheduleActivity extends Activity {

	TextView tvProjectName, tvProjectManager;
	Button btnSubmit;
	Button btnUpdate;
	Button[] buttons;
	int numberOfButtons = 15;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.submit_schedule);
		tvProjectName = (TextView) findViewById(R.id.project_name);
		tvProjectManager = (TextView) findViewById(R.id.project_manager);
		btnSubmit = (Button) findViewById(R.id.submit);
		btnUpdate = (Button) findViewById(R.id.submit);
		LinearLayout layout = (LinearLayout) findViewById(R.id.linear_layout);
		buttons = new Button[numberOfButtons];

		for (int i = 0; i < numberOfButtons; i++) {
			buttons[i] = new Button(this);
			LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(
					LinearLayout.LayoutParams.FILL_PARENT,
					LinearLayout.LayoutParams.WRAP_CONTENT);

			layout.addView(buttons[i], p);
		}
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
		btnUpdate.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

			}

		});

		/* test schedule and timeslot data structure */

		Schedule s = new Schedule(8, 20);
		String test = s.toString();
		System.out.println(test);

	}
}
