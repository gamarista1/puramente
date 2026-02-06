package O3;

import R3.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.s;
import kotlin.jvm.internal.C6496s;

public final class a extends e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, b bVar) {
        super(context, bVar);
        C6496s.h(context, "context");
        C6496s.h(bVar, "taskExecutor");
    }

    private final boolean l(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }

    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    public void k(Intent intent) {
        C6496s.h(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            s e10 = s.e();
            String a10 = b.f4733a;
            e10.a(a10, "Received " + action);
            switch (action.hashCode()) {
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        g(Boolean.FALSE);
                        return;
                    }
                    return;
                case -54942926:
                    if (action.equals("android.os.action.DISCHARGING")) {
                        g(Boolean.FALSE);
                        return;
                    }
                    return;
                case 948344062:
                    if (action.equals("android.os.action.CHARGING")) {
                        g(Boolean.TRUE);
                        return;
                    }
                    return;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        g(Boolean.TRUE);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: m */
    public Boolean e() {
        Intent registerReceiver = d().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(l(registerReceiver));
        }
        s.e().c(b.f4733a, "getInitialState - null intent received");
        return Boolean.FALSE;
    }
}
