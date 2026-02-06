package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.P;
import androidx.work.s;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f18835a = s.i("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        s e10 = s.e();
        String str = f18835a;
        e10.a(str, "Received intent " + intent);
        try {
            P.i(context).r(goAsync());
        } catch (IllegalStateException e11) {
            s.e().d(f18835a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e11);
        }
    }
}
