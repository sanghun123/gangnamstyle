package team.gangnamstyle.whenisbetter.ui;

import java.util.LinkedList;
import java.util.List;

import team.gangnamstyle.whenisbetter.R;
import team.gangnamstyle.whenisbetter.model.Project;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ProjectAdapter extends BaseAdapter {

	private List<Project> projects;
	private int indexOfLastAssignedProject;
	private LayoutInflater inflater;
	private TextView tvQuestion;
	private TextView tvDetail;

	public ProjectAdapter(Context c) {
		inflater = (LayoutInflater) c
				.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
		projects = new LinkedList<Project>();
	}

	public void clear() {
		indexOfLastAssignedProject = 0;
		projects.clear();
		this.notifyDataSetChanged();
	}

	public void setProjects(List<Project> list) {
		indexOfLastAssignedProject = 0;
		projects.clear();
		addProjects(list);
	}

	public void addProjects(List<Project> list) {
		for (Project p : list) {
			projects.add(p);
		}
		this.notifyDataSetChanged();
	}

	public int getCount() {
		// TODO Auto-generated method stub
		if (projects == null)
			return 0;

		return projects.size();
	}

	public Project getItem(int position) {
		// TODO Auto-generated method stub
		return projects.get(position);
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.project_item, null);
		}
		tvQuestion = (TextView) convertView.findViewById(R.id.list_project);
		tvDetail = (TextView) convertView
				.findViewById(R.id.list_project_detail);

		if (projects != null) {
			Project p = getItem(position);

			tvQuestion.setText(p.getProjectName());
			tvDetail.setText("Project detail");
			tvQuestion.setTextColor(Color.BLACK);

			convertView.setBackgroundColor(Color.WHITE);
			tvDetail.setTextColor(Color.GRAY);
		}

		return convertView;
	}

}
