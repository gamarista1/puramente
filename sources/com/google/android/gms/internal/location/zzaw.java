package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.internal.C4493e;
import com.google.android.gms.location.C4558o;

final class zzaw extends zzaj {
    private C4493e zza;

    public zzaw(C4493e eVar) {
        this.zza = eVar;
    }

    public final void zzb(int i10, String[] strArr) {
        if (this.zza == null) {
            Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times", new Exception());
            return;
        }
        this.zza.setResult(C4558o.b(C4558o.a(i10)));
        this.zza = null;
    }

    public final void zzc(int i10, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult", new Exception());
    }

    public final void zzd(int i10, PendingIntent pendingIntent) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult", new Exception());
    }
}
