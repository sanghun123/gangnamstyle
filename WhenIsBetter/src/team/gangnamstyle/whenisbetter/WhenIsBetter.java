package team.gangnamstyle.whenisbetter;

import team.gangnamstyle.whenisbetter.model.Member;
import android.app.Application;
import android.content.Context;
import android.telephony.TelephonyManager;

/* starting point of the app
 * checks phone number for authentication and launch the main activity
 */
public class WhenIsBetter extends Application {

	public static Context baseContext;

	private Member user;
	private String phoneId;

	@Override
	public void onCreate() {
		super.onCreate();
		baseContext = getBaseContext();

		user = new Member();
		phoneId = retrievePhoneNumber();
		System.out.println("phone # : " + phoneId);
	}

	public String retrievePhoneNumber() {
		TelephonyManager teleMgr = (TelephonyManager) baseContext
				.getSystemService(Context.TELEPHONY_SERVICE);
		try {
			phoneId = teleMgr.getLine1Number();
		} catch (Exception e) {
			phoneId = "0";
		}
		if (phoneId == null || phoneId.equals(""))
			phoneId = "0";

		return phoneId;
	}

	public Member getUser() {
		return user;
	}

	public void setUser(Member user) {
		this.user = user;
	}

	public String getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(String phoneId) {
		this.phoneId = phoneId;
	}

}
