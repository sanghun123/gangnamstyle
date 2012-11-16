package team.gangnamstyle.whenisbetter;

import team.gangnamstyle.whenisbetter.model.Member;
import team.gangnamstyle.whenisbetter.util.PhoneIdRetriever;
import android.app.Application;
import android.content.Context;

/* starting point of the app
 * checks phone number for authentication and launch the main activity
 */
public class WhenIsBetter extends Application {

	public static Context baseContext;

	private Member user;
	private long phoneId;

	@Override
	public void onCreate() {
		super.onCreate();
		baseContext = getBaseContext();

		user = new Member();
		phoneId = PhoneIdRetriever.getPhoneId();

		user.setMemberId(phoneId);
	}

	public Member getUser() {
		return user;
	}

	public void setUser(Member user) {
		this.user = user;
	}

}
