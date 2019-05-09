package org.softcatala.corrector;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.widget.Toast;
import android.content.Context;
import android.widget.*;
public class bCastReqLangChange extends BroadcastReceiver 
{
	@Override
	public void onReceive(Context appContext, Intent swapLangIntent) 
	
	{
		Toast.makeText(appContext, "Intent Detected.", Toast.LENGTH_LONG).show();
	}
};
	

