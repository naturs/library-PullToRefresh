package com.handmark.pulltorefresh.library.internal;

import android.util.Log;

public class Utils {

	public static final boolean ENABLE_LOG = true;
	
	static final String LOG_TAG = "PullToRefresh";

	public static void warnDeprecation(String depreacted, String replacement) {
		Log.w(LOG_TAG, "You're using the deprecated " + depreacted + " attr, please switch over to " + replacement);
	}

	public static void logd(String tag, String msg) {
		if (ENABLE_LOG) {
			Log.d(tag, msg);
		}
	}
}
