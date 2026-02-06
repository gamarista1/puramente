package androidx.work.impl.background.systemalarm;

import Q3.p;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.P;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.s;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    static final String f18830a = s.i("ConstrntProxyUpdtRecvr");

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Intent f18831a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f18832b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f18833c;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f18831a = intent;
            this.f18832b = context;
            this.f18833c = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.f18831a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f18831a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f18831a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f18831a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                s.e().a(ConstraintProxyUpdateReceiver.f18830a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                p.c(this.f18832b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                p.c(this.f18832b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                p.c(this.f18832b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                p.c(this.f18832b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f18833c.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
        return intent;
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            s e10 = s.e();
            String str2 = f18830a;
            e10.a(str2, "Ignoring unknown action " + str);
            return;
        }
        P.i(context).o().d(new a(intent, context, goAsync()));
    }
}
