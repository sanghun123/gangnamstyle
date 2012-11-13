package team.gangnamstyle.whenisbetter;

import android.app.Application;
import android.content.Context;

/* starting point of the app
 * checks phone number for authentication and launch the main activity
 */
public class Login extends Application {

	public static Context baseContext;

	@Override
	public void onCreate() {
		super.onCreate();

		baseContext = getBaseContext();
	}
}
