package team.gangnamstyle.whenisbetter.util;

import team.gangnamstyle.whenisbetter.WhenIsBetter;
import android.content.Context;
import android.telephony.TelephonyManager;

public class PhoneIdRetriever {

	private PhoneIdRetriever() {
	}

	public static long getPhoneId() {
		String phoneNum;
		TelephonyManager teleMgr = (TelephonyManager) WhenIsBetter.baseContext
				.getSystemService(Context.TELEPHONY_SERVICE);
		try {
			phoneNum = teleMgr.getLine1Number();
		} catch (Exception e) {
			phoneNum = "-1";
		}
		if (phoneNum == null || phoneNum.equals(""))
			phoneNum = "-1";

		return Long.parseLong(phoneNum);
	}

}
