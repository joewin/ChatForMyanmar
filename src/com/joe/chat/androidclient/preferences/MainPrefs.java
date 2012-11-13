package com.joe.chat.androidclient.preferences;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.joe.chat.R;
import com.joe.chat.androidclient.ChatForMyanmar;

public class MainPrefs extends PreferenceActivity{
	public void onCreate(Bundle savedInstanceState) {
		setTheme(ChatForMyanmar.getConfig(this).getTheme());
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.layout.mainprefs);
	}

}
