package Pa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.H5;

public final class B extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final E2 f52131a;

    public B(E2 e22) {
        this.f52131a = e22;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f52131a.zzj().G().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f52131a.zzj().G().a("App receiver called with null action");
        } else if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.f52131a.zzj().G().a("App receiver called with unknown action");
        } else {
            E2 e22 = this.f52131a;
            if (zzpg.zza() && e22.u().B((String) null, F.f54586B0)) {
                e22.zzj().F().a("App receiver notified triggers are available");
                e22.zzl().y(new H5(e22));
            }
        }
    }
}
