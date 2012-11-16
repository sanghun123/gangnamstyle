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
}
