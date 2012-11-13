package com.joe.chat.androidclient;

import com.joe.chat.androidclient.data.YaximConfiguration;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.preference.PreferenceManager;

import de.duenndns.ssl.MemorizingTrustManager;

public class ChatForMyanmar extends Application {
	// identity name and type, see:
	// http://xmpp.org/registrar/disco-categories.html
	public static final String XMPP_IDENTITY_NAME = "chat4mm";
	public static final String XMPP_IDENTITY_TYPE = "phone";

	// MTM is needed globally for both the backend (connect)
	// and the frontend (display dialog)
	public MemorizingTrustManager mMTM;
//change here
	private YaximConfiguration mConfig;

	public ChatForMyanmar() {
		super();
	}

	@Override
	public void onCreate() {
		mMTM = new MemorizingTrustManager(this);
		mConfig = new YaximConfiguration(PreferenceManager
				.getDefaultSharedPreferences(this));
	}
	public static ChatForMyanmar getApp(Context ctx) {
		return (ChatForMyanmar)ctx.getApplicationContext();
	}
	//change here for fonts
	public static Typeface getFont(Activity act)
	{
		AssetManager assets = act.getAssets();
		Typeface face = Typeface.createFromAsset(assets,"fonts/zawgyi1.ttf");
		return face;
	}
//change here
	public static YaximConfiguration getConfig(Context ctx) {
		return getApp(ctx).mConfig;
	}
}
