package com.dieam.reactnativepushnotification.modules;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.security.SecureRandom;
import s5.s;

public class RNPushNotificationPublisher extends BroadcastReceiver {
    private void a(Context context, Bundle bundle) {
        if (bundle.getString("id") == null) {
            bundle.putString("id", String.valueOf(new SecureRandom().nextInt()));
        }
        s sVar = new s((Application) context.getApplicationContext());
        Log.v(RNPushNotification.LOG_TAG, "sendNotification: " + bundle);
        sVar.x(bundle);
    }

    public void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("notificationId", 0);
        long currentTimeMillis = System.currentTimeMillis();
        Log.i(RNPushNotification.LOG_TAG, "NotificationPublisher: Prepare To Publish: " + intExtra + ", Now Time: " + currentTimeMillis);
        Bundle extras = intent.getExtras();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onMessageReceived: ");
        sb2.append(extras);
        Log.v(RNPushNotification.LOG_TAG, sb2.toString());
        a(context, extras);
    }
}
