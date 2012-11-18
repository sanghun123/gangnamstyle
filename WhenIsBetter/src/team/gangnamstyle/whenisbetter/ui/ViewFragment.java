package team.gangnamstyle.whenisbetter.ui;

import java.util.ArrayList;
import java.util.List;

import team.gangnamstyle.whenisbetter.R;
import team.gangnamstyle.whenisbetter.model.Project;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class ViewFragment extends Fragment {

	Activity activity;
	ListView lvProject;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		activity = this.getActivity();

		View mainView = inflater.inflate(R.layout.view_fragment, container,
				false);

		lvProject = (ListView) mainView.findViewById(R.id.project_list);

		/* start add projeProjecthe list */
		List<Project> projectList = new ArrayList<Project>();

		Project p1 = new Project();
		p1.setProjectName("MAS Project 2");
		p1.setManagerId(13180000000L);
		projectList.add(p1);

		Project p2 = new Project();
		p2.setProjectName("CS Senior Design");
		p2.setManagerId(13181112222L);

		projectList.add(p2);

		ProjectAdapter adapter = new ProjectAdapter(
				activity.getApplicationContext());
		adapter.addProjects(projectList);

		lvProject.setOnItemClickListener(new OnItemClickListener() {
			// @Override
			public void onItemClick(AdapterView<?> parent, View view,
					final int position, long id) {

				Project clickedProject = (Project) (lvProject
						.getItemAtPosition(position));
				Bundle bundle = new Bundle();
				bundle.putInt("projectId", clickedProject.getProjectId());
				bundle.putString("projectName", clickedProject.getProjectName());
				bundle.putLong("managerId", clickedProject.getManagerId());
				bundle.putString("startDate", clickedProject.getStartDate()
						.toString());
				bundle.putInt("startTime", clickedProject.getStartTime());
				bundle.putInt("endTime", clickedProject.getEndTime());
				bundle.putBoolean("confirmed", clickedProject.isConfirmed());
				Intent in = new Intent(activity, SubmitScheduleActivity.class);

				Toast.makeText(ViewFragment.this.getActivity(),
						"Selected " + clickedProject.getProjectName(),
						Toast.LENGTH_SHORT).show();
				in.putExtras(bundle);
				startActivity(in);

			}
		}); // end of onItemClick

		lvProject.setAdapter(adapter);

		return mainView;
	}
}