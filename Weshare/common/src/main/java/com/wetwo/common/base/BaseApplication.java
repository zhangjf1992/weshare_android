/**
 * Copyright (C) 2013 AVIT, All rights reserved
 *
 * @fileName: com.avit.ott.common.base.BaseApplication.java
 *
 * @author: daishulun@avit.com.cn
 *
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2013-8-22     daishulun      v1.0.0        create
 *
 */
package com.wetwo.common.base;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

import com.wetwo.common.log.WeshareLog;

public class BaseApplication extends Application {

	protected String TAG = BaseApplication.class.getSimpleName();
	private static Context APPLICATION;
	@Override
	public void onCreate() {
		TAG = this.getClass().getSimpleName();
		APPLICATION=getApplicationContext();
		WeshareLog.d(TAG, "onCreate()");
		super.onCreate();
	}

	@Override
	public void onTerminate() {
		WeshareLog.d(TAG, "onTerminate()");
		android.os.Process.killProcess(android.os.Process.myPid());
		System.exit(0);
		super.onTerminate();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		WeshareLog.d(TAG, "onConfigurationChanged(Configuration<" + newConfig + ">)");
		super.onConfigurationChanged(newConfig);
	}

	@Override
	public void onLowMemory() {
		WeshareLog.d(TAG, "onLowMemory()");
		super.onLowMemory();
	}

	public static Context getAppInstance() {
		return APPLICATION;
	}
}
