package team.gangnamstyle.whenisbetter.model;

public class Member {

	private String memberId;
	private String memberName;

	public Member() {

		this.memberId = "";
		this.memberName = "";
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
}
