package team.gangnamstyle.whenisbetter.model;

public class Timeslot {
	int hour;
	int preference;
	long memberId;

	public Timeslot() {
		this.hour = 0;
		this.preference = 0;
		this.memberId = -1;
	}

	public Timeslot(int hour) {
		this.hour = hour;
		this.preference = 0;
		this.memberId = -1;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getPreference() {
		return preference;
	}

	public void setPreference(int preference) {
		this.preference = preference;
	}

	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public String toString() {
		String output = "";
		output += hour + "(" + preference + ")" + "";
		return output;
	}
}
