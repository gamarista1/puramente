package com.dieam.reactnativepushnotification.modules;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Set;
import s5.C3987a;
import s5.s;

public class RNPushNotificationBootEventReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Log.i(RNPushNotification.LOG_TAG, "RNPushNotificationBootEventReceiver loading scheduled notifications");
        SharedPreferences sharedPreferences = context.getSharedPreferences("rn_push_notification", 0);
        Set<String> keySet = sharedPreferences.getAll().keySet();
        s sVar = new s((Application) context.getApplicationContext());
        for (String next : keySet) {
            try {
                String string = sharedPreferences.getString(next, (String) null);
                if (string != null) {
                    C3987a a10 = C3987a.a(string);
                    if (a10.b() < ((double) System.currentTimeMillis())) {
                        Log.i(RNPushNotification.LOG_TAG, "RNPushNotificationBootEventReceiver: Showing notification for " + a10.c());
                        sVar.x(a10.j());
                    } else {
                        Log.i(RNPushNotification.LOG_TAG, "RNPushNotificationBootEventReceiver: Scheduling notification for " + a10.c());
                        sVar.w(a10.j());
                    }
                }
            } catch (Exception e10) {
                Log.e(RNPushNotification.LOG_TAG, "Problem with boot receiver loading notification " + next, e10);
            }
        }
    }
}
