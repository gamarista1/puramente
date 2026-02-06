package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.location.C4545b;

public final class zzg implements C4545b {
    public final h removeActivityUpdates(f fVar, PendingIntent pendingIntent) {
        return fVar.b(new zze(this, fVar, pendingIntent));
    }

    public final h requestActivityUpdates(f fVar, long j10, PendingIntent pendingIntent) {
        return fVar.b(new zzd(this, fVar, j10, pendingIntent));
    }
}
