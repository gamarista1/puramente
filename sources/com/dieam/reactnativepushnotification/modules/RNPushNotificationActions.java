package com.dieam.reactnativepushnotification.modules;

import android.app.Application;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.core.app.w;
import com.facebook.react.B;
import com.facebook.react.C3446x;
import com.facebook.react.J;
import com.facebook.react.bridge.ReactContext;
import s5.s;

public class RNPushNotificationActions extends BroadcastReceiver {

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f39225a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bundle f39226b;

        /* renamed from: com.dieam.reactnativepushnotification.modules.RNPushNotificationActions$a$a  reason: collision with other inner class name */
        class C0621a implements B {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ J f39228a;

            C0621a(J j10) {
                this.f39228a = j10;
            }

            public void a(ReactContext reactContext) {
                new a(reactContext).d(a.this.f39226b);
                this.f39228a.s0(this);
            }
        }

        a(Context context, Bundle bundle) {
            this.f39225a = context;
            this.f39226b = bundle;
        }

        public void run() {
            J c10 = ((C3446x) this.f39225a.getApplicationContext()).a().c();
            ReactContext D10 = c10.D();
            if (D10 != null) {
                new a(D10).d(this.f39226b);
                return;
            }
            c10.s(new C0621a(c10));
            if (!c10.K()) {
                c10.z();
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        String str = context.getPackageName() + ".ACTION_";
        Log.i(RNPushNotification.LOG_TAG, "RNPushNotificationBootEventReceiver loading scheduled notifications");
        if (intent.getAction() != null && intent.getAction().startsWith(str)) {
            Bundle bundleExtra = intent.getBundleExtra("notification");
            Bundle j10 = w.j(intent);
            if (j10 != null) {
                bundleExtra.putCharSequence("reply_text", j10.getCharSequence(RNPushNotification.KEY_TEXT_REPLY));
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            int parseInt = Integer.parseInt(bundleExtra.getString("id"));
            if (bundleExtra.getBoolean("autoCancel", true)) {
                if (bundleExtra.containsKey("tag")) {
                    notificationManager.cancel(bundleExtra.getString("tag"), parseInt);
                } else {
                    notificationManager.cancel(parseInt);
                }
            }
            if (bundleExtra.getBoolean("invokeApp", true)) {
                new s((Application) context.getApplicationContext()).q(bundleExtra);
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                return;
            }
            new Handler(Looper.getMainLooper()).post(new a(context, bundleExtra));
        }
    }
}
