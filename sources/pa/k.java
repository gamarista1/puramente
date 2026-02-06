package Pa;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdo;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.V1;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final a f52133a;

    public interface a {
        void a(Context context, Intent intent);
    }

    public k(a aVar) {
        C4536s.l(aVar);
        this.f52133a = aVar;
    }

    public final void a(Context context, Intent intent) {
        V1 zzj = E2.a(context, (zzdo) null, (Long) null).zzj();
        if (intent == null) {
            zzj.G().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        zzj.F().b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            zzj.F().a("Starting wakeful intent.");
            this.f52133a.a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            zzj.G().a("Install Referrer Broadcasts are deprecated");
        }
    }
}
