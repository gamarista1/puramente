package io.invertase.firebase.messaging;

import Ue.g;
import Ue.m;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.facebook.react.C3361g;
import com.google.firebase.messaging.W;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.invertase.firebase.app.a;
import java.util.HashMap;

public class ReactNativeFirebaseMessagingReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    static HashMap f71422a = new HashMap();

    public void onReceive(Context context, Intent intent) {
        Log.d("RNFirebaseMsgReceiver", "broadcast received for message");
        if (a.a() == null) {
            a.b(context.getApplicationContext());
        }
        if (intent.getExtras() == null) {
            Log.e("RNFirebaseMsgReceiver", "broadcast intent received with no extras");
            return;
        }
        W w10 = new W(intent.getExtras());
        g i10 = g.i();
        if (w10.t0() != null) {
            f71422a.put(w10.r0(), w10);
            s.a().b().c(w10);
        }
        if (m.d(context)) {
            i10.o(q.h(w10, Boolean.FALSE));
            return;
        }
        try {
            Intent intent2 = new Intent(context, ReactNativeFirebaseMessagingHeadlessService.class);
            intent2.putExtra(MetricTracker.Object.MESSAGE, w10);
            if (context.startService(intent2) != null) {
                C3361g.e(context);
            }
        } catch (IllegalStateException e10) {
            Log.e("RNFirebaseMsgReceiver", "Background messages only work if the message priority is set to 'high'", e10);
        }
    }
}
