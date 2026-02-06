package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.location.C4549f;
import com.google.android.gms.location.C4550g;
import com.google.android.gms.location.C4551h;
import com.google.android.gms.location.P;
import java.util.List;

public final class zzaf implements C4550g {
    public final h addGeofences(f fVar, C4551h hVar, PendingIntent pendingIntent) {
        return fVar.b(new zzac(this, fVar, hVar, pendingIntent));
    }

    public final h removeGeofences(f fVar, PendingIntent pendingIntent) {
        return zza(fVar, P.p0(pendingIntent));
    }

    public final h zza(f fVar, P p10) {
        return fVar.b(new zzad(this, fVar, p10));
    }

    @Deprecated
    public final h addGeofences(f fVar, List<C4549f> list, PendingIntent pendingIntent) {
        C4551h.a aVar = new C4551h.a();
        aVar.b(list);
        aVar.d(5);
        return fVar.b(new zzac(this, fVar, aVar.c(), pendingIntent));
    }

    public final h removeGeofences(f fVar, List<String> list) {
        return zza(fVar, P.o0(list));
    }
}
