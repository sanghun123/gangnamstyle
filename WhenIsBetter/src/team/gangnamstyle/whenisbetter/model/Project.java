package team.gangnamstyle.whenisbetter.model;

import java.util.Date;
import java.util.List;

public class Project {

	private int projectId;
	private long managerId;
	private List<Member> members;
	private String projectName;
	private Date startDate;
	private String timeRange;
	private boolean confirmed;

	public Project() {

		this.projectId = -1;
		this.managerId = -1;
		this.members = null;
		this.projectName = "";
		this.startDate = null;
		this.timeRange = "";
		this.confirmed = false;

	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public long getManagerId() {
		return managerId;
	}

	public void setManagerId(long managerId) {
		this.managerId = managerId;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getTimeRange() {
		return timeRange;
	}

	public void setTimeRange(String timeRange) {
		this.timeRange = timeRange;
	}

	public boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

}
