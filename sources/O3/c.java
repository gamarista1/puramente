package O3;

import R3.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.s;
import kotlin.jvm.internal.C6496s;

public final class c extends e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, b bVar) {
        super(context, bVar);
        C6496s.h(context, "context");
        C6496s.h(bVar, "taskExecutor");
    }

    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    public void k(Intent intent) {
        C6496s.h(intent, "intent");
        if (intent.getAction() != null) {
            s e10 = s.e();
            String a10 = d.f4734a;
            e10.a(a10, "Received " + intent.getAction());
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1980154005) {
                    if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                        g(Boolean.FALSE);
                    }
                } else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    g(Boolean.TRUE);
                }
            }
        }
    }

    /* renamed from: l */
    public Boolean e() {
        Intent registerReceiver = d().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            s.e().c(d.f4734a, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        boolean z10 = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
