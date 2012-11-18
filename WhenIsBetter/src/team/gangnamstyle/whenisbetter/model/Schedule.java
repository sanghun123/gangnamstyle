package team.gangnamstyle.whenisbetter.model;

import java.util.ArrayList;

public class Schedule {

	private ArrayList<Timeslot> sun, mon, tue, wed, thu, fri, sat;
	private long memberId;
	private int projectId;
	private int startTime;
	private int endTime;

	public Schedule(int startTime, int endTime) {
		this.sun = new ArrayList<Timeslot>();
		this.mon = new ArrayList<Timeslot>();
		this.tue = new ArrayList<Timeslot>();
		this.wed = new ArrayList<Timeslot>();
		this.thu = new ArrayList<Timeslot>();
		this.fri = new ArrayList<Timeslot>();
		this.sat = new ArrayList<Timeslot>();
		this.memberId = -1;
		this.projectId = 0;
		this.startTime = startTime;
		this.endTime = endTime;

		setTimeslots(startTime, endTime);

	}

	public void setTimeslots(int startTime, int endTime) {

		for (int i = startTime; i < endTime + 1; i++) {
			Timeslot t = new Timeslot(i);
			sun.add(t);
			mon.add(t);
			tue.add(t);
			wed.add(t);
			thu.add(t);
			fri.add(t);
			sat.add(t);
		}

	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public ArrayList<Timeslot> getSun() {
		return sun;
	}

	public void setSun(ArrayList<Timeslot> sun) {
		this.sun = sun;
	}

	public ArrayList<Timeslot> getMon() {
		return mon;
	}

	public void setMon(ArrayList<Timeslot> mon) {
		this.mon = mon;
	}

	public ArrayList<Timeslot> getTue() {
		return tue;
	}

	public void setTue(ArrayList<Timeslot> tue) {
		this.tue = tue;
	}

	public ArrayList<Timeslot> getWed() {
		return wed;
	}

	public void setWed(ArrayList<Timeslot> wed) {
		this.wed = wed;
	}

	public ArrayList<Timeslot> getThu() {
		return thu;
	}

	public void setThu(ArrayList<Timeslot> thu) {
		this.thu = thu;
	}

	public ArrayList<Timeslot> getFri() {
		return fri;
	}

	public void setFri(ArrayList<Timeslot> fri) {
		this.fri = fri;
	}

	public ArrayList<Timeslot> getSat() {
		return sat;
	}

	public void setSat(ArrayList<Timeslot> sat) {
		this.sat = sat;
	}

	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String toString() {
		String output = "";
		output += "- Sun: " + sun.toString() + "\n";
		output += "- Mon: " + mon.toString() + "\n";
		output += "- Tue: " + tue.toString() + "\n";
		output += "- Wed: " + wed.toString() + "\n";
		output += "- Thu: " + thu.toString() + "\n";
		output += "- Fri: " + fri.toString() + "\n";
		output += "- Sat: " + sat.toString() + "\n";

		return output;
	}
}
