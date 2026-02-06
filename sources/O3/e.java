package O3;

import R3.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.s;
import kotlin.jvm.internal.C6496s;

public abstract class e extends h {

    /* renamed from: f  reason: collision with root package name */
    private final BroadcastReceiver f4735f = new a(this);

    public static final class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f4736a;

        a(e eVar) {
            this.f4736a = eVar;
        }

        public void onReceive(Context context, Intent intent) {
            C6496s.h(context, "context");
            C6496s.h(intent, "intent");
            this.f4736a.k(intent);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Context context, b bVar) {
        super(context, bVar);
        C6496s.h(context, "context");
        C6496s.h(bVar, "taskExecutor");
    }

    public void h() {
        s e10 = s.e();
        String a10 = f.f4737a;
        e10.a(a10, getClass().getSimpleName() + ": registering receiver");
        d().registerReceiver(this.f4735f, j());
    }

    public void i() {
        s e10 = s.e();
        String a10 = f.f4737a;
        e10.a(a10, getClass().getSimpleName() + ": unregistering receiver");
        d().unregisterReceiver(this.f4735f);
    }

    public abstract IntentFilter j();

    public abstract void k(Intent intent);
}
