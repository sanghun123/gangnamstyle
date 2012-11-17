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

public class JoinFragment extends Fragment {

	private Activity activity;
	private ListView lvProject;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		activity = this.getActivity();

		View mainView = inflater.inflate(R.layout.join_fragment, container,
				false);

		lvProject = (ListView) mainView.findViewById(R.id.project_list);

		/* start add projeProjecthe list */
		List<Project> projectList = new ArrayList<Project>();

		Project p1 = new Project();
		p1.setProjectName("MAS Project 2");
		p1.setManagerId(13180000000L);
		projectList.add(p1);

		Project p2 = new Project();
		p2.setProjectName("Senior Design - Team");
		p2.setManagerId(13181112222L);

		projectList.add(p2);

		ProjectAdapter adapter = new ProjectAdapter(
				activity.getApplicationContext());
		adapter.addProjects(projectList);

		lvProject.setOnItemClickListener(new OnItemClickListener() {
			// @Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				Project clickedProject = (Project) (lvProject
						.getItemAtPosition(position));
				Bundle bundle = new Bundle();
				bundle.putInt("projectId", clickedProject.getProjectId());
				bundle.putString("projectName", clickedProject.getProjectName());
				bundle.putLong("managerId", clickedProject.getManagerId());
				bundle.putString("startDate", clickedProject.getStartDate()
						.toString());
				bundle.putString("timeRange", clickedProject.getTimeRange());
				bundle.putBoolean("confirmed", clickedProject.isConfirmed());
				Intent in = new Intent(activity, SubmitScheduleActivity.class);
				in.putExtras(bundle);
				startActivity(in);

			}
		});

		lvProject.setAdapter(adapter);

		return mainView;
	}

}
