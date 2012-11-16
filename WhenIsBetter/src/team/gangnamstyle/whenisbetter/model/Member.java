package team.gangnamstyle.whenisbetter.model;

public class Member {

	private long memberId;
	private String memberName;

	public Member() {

		this.memberId = -1;
		this.memberName = "";
	}

	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
}
