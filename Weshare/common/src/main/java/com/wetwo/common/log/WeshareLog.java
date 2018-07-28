//create by daishulun
//use to log information about runtime
//

package com.wetwo.common.log;

import android.util.Log;

final public class WeshareLog {

	public static final int VERBOSE = 4;
	public static final int INFO = 3;
	public static final int DEBUG = 2;
	public static final int WARN = 1;
	public static final int ERROR = 0;

	private static final String LOG_TAG = WeshareLog.class.getSimpleName();
	public static final int DEBUG_LOG = VERBOSE;

	// private static final boolean FILE_LOG = false;

	/**
	 * @description: public static final int VERBOSE = 4;<br/>
	 *               public static final int INFO = 3;<br/>
	 *               public static final int DEBUG = 2;<br/>
	 *               public static final int WARN = 1;<br/>
	 */

	public static void v(String tag, Object... args) {
		if (DEBUG_LOG > 3) {
			Log.v(LOG_TAG, genMsgs(tag, args));
		}
	}

	public static void i(String tag, Object... args) {
		if (DEBUG_LOG > 2) {
			Log.i(LOG_TAG, genMsgs(tag, args));
		}
	}

	public static void d(String tag, Object... args) {
		if (DEBUG_LOG > 1) {
			Log.d(LOG_TAG, genMsgs(tag, args));
		}
	}

	public static void w(String tag, Object... args) {
		if (DEBUG_LOG > 0) {
			Log.w(LOG_TAG, genMsgs(tag, args));
		}
	}

	public static void e(String tag, Object... args) {
		Log.e(LOG_TAG, genMsgs(tag, args));
	}

	private static String genMsgs(String tag, Object... args) {
		String msgs = tag + "=>";
		int argc = args.length;

		for (int i = 0; i < argc; ++i) {
			msgs += args[i] + " | ";

		}

		return msgs;
	}
}
