package androidx.work.impl.background.systemalarm;

import P3.u;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C1838e;
import androidx.work.s;
import androidx.work.t;
import java.util.Iterator;
import java.util.List;

abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f18829a = s.i("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    ConstraintProxy() {
    }

    static void a(Context context, List list) {
        boolean z10;
        Iterator it = list.iterator();
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (it.hasNext()) {
            C1838e eVar = ((u) it.next()).f5100j;
            z11 |= eVar.f();
            z12 |= eVar.g();
            z13 |= eVar.i();
            if (eVar.d() != t.NOT_REQUIRED) {
                z10 = true;
            } else {
                z10 = false;
            }
            z14 |= z10;
            if (z11 && z12 && z13 && z14) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, z11, z12, z13, z14));
    }

    public void onReceive(Context context, Intent intent) {
        s e10 = s.e();
        String str = f18829a;
        e10.a(str, "onReceive : " + intent);
        context.startService(b.a(context));
    }
}
