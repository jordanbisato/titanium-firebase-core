/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package firebase.core;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;
import org.appcelerator.kroll.KrollDict;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Kroll.module(name="TitaniumFirebaseCore", id="firebase.core")
public class TitaniumFirebaseCoreModule extends KrollModule
{
	private static final String LCAT = "TitaniumFirebaseCoreModule";
	private static final boolean DBG = TiConfig.LOGD;

	public TitaniumFirebaseCoreModule()
	{
		super();
	}

  // Public APIs

  @Kroll.method
	public void configure(@Kroll.argument(optional=true)KrollDict param)
	{
		if (param != null) {
			FirebaseOptions.Builder options = new FirebaseOptions.Builder();
			if (param.containsKey("APIKey")) {
				options.setApiKey(param.getString("APIKey"));
			}
			if (param.containsKey("databaseURL")) {
				options.setDatabaseUrl(param.getString("databaseURL"));
			}
			if (param.containsKey("projectID")) {
				options.setProjectId(param.getString("projectID"));
			}
			if (param.containsKey("storageBucket")) {
				options.setStorageBucket(param.getString("storageBucket"));
			}
			if (param.containsKey("applicationID")) {
				options.setApplicationId(param.getString("applicationID"));
			}
			if (param.containsKey("GCMSenderID")) {
				options.setGcmSenderId(param.getString("GCMSenderID"));
			}
			try {
				FirebaseApp.initializeApp(getActivity().getApplicationContext(), options.build());
			} catch (IllegalStateException e) {
				// error or already initialized
			}
		} else {
			try {
				FirebaseApp.initializeApp(getActivity().getApplicationContext());
			} catch (IllegalStateException e) {
				// error or already initialized
			}
		}
	}
}
