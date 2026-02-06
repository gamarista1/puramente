package com.google.android.gms.internal.location;

import Ea.C4279b;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C4493e;
import com.google.android.gms.common.api.internal.C4499k;
import com.google.android.gms.common.api.internal.C4507t;
import com.google.android.gms.common.internal.C4522e;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.location.C4547d;
import com.google.android.gms.location.C4551h;
import com.google.android.gms.location.C4555l;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.P;
import com.google.android.gms.location.a0;
import java.util.List;

public final class zzaz extends zzi {
    private final zzav zzf;

    public zzaz(Context context, Looper looper, f.b bVar, f.c cVar, String str, C4522e eVar) {
        super(context, looper, bVar, cVar, str, eVar);
        this.zzf = new zzav(context, this.zze);
    }

    public final void disconnect() {
        synchronized (this.zzf) {
            if (isConnected()) {
                try {
                    this.zzf.zzn();
                    this.zzf.zzo();
                } catch (Exception e10) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e10);
                }
            }
            super.disconnect();
        }
    }

    public final boolean usesClientTelemetry() {
        return true;
    }

    public final LocationAvailability zzA() {
        return this.zzf.zzc();
    }

    public final void zzB(zzba zzba, C4499k kVar, zzai zzai) {
        synchronized (this.zzf) {
            this.zzf.zze(zzba, kVar, zzai);
        }
    }

    public final void zzC(LocationRequest locationRequest, C4499k kVar, zzai zzai) {
        synchronized (this.zzf) {
            this.zzf.zzd(locationRequest, kVar, zzai);
        }
    }

    public final void zzD(zzba zzba, PendingIntent pendingIntent, zzai zzai) {
        this.zzf.zzf(zzba, pendingIntent, zzai);
    }

    public final void zzE(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzai) {
        this.zzf.zzg(locationRequest, pendingIntent, zzai);
    }

    public final void zzF(C4499k.a aVar, zzai zzai) {
        this.zzf.zzh(aVar, zzai);
    }

    public final void zzG(PendingIntent pendingIntent, zzai zzai) {
        this.zzf.zzj(pendingIntent, zzai);
    }

    public final void zzH(C4499k.a aVar, zzai zzai) {
        this.zzf.zzi(aVar, zzai);
    }

    public final void zzI(boolean z10) {
        this.zzf.zzk(z10);
    }

    public final void zzJ(Location location) {
        this.zzf.zzl(location);
    }

    public final void zzK(zzai zzai) {
        this.zzf.zzm(zzai);
    }

    public final void zzL(C4555l lVar, C4493e eVar, String str) {
        boolean z10;
        checkConnected();
        boolean z11 = false;
        if (lVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.b(z10, "locationSettingsRequest can't be null nor empty.");
        if (eVar != null) {
            z11 = true;
        }
        C4536s.b(z11, "listener can't be null.");
        ((zzam) getService()).zzt(lVar, new zzay(eVar), (String) null);
    }

    public final void zzq(long j10, PendingIntent pendingIntent) {
        boolean z10;
        checkConnected();
        C4536s.l(pendingIntent);
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.b(z10, "detectionIntervalMillis must be >= 0");
        ((zzam) getService()).zzh(j10, true, pendingIntent);
    }

    public final void zzr(C4547d dVar, PendingIntent pendingIntent, C4493e eVar) {
        checkConnected();
        C4536s.m(dVar, "activityTransitionRequest must be specified.");
        C4536s.m(pendingIntent, "PendingIntent must be specified.");
        C4536s.m(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzi(dVar, pendingIntent, new C4507t(eVar));
    }

    public final void zzs(PendingIntent pendingIntent, C4493e eVar) {
        checkConnected();
        C4536s.m(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzj(pendingIntent, new C4507t(eVar));
    }

    public final void zzt(PendingIntent pendingIntent) {
        checkConnected();
        C4536s.l(pendingIntent);
        ((zzam) getService()).zzk(pendingIntent);
    }

    public final void zzu(PendingIntent pendingIntent, C4493e eVar) {
        checkConnected();
        C4536s.m(pendingIntent, "PendingIntent must be specified.");
        C4536s.m(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzl(pendingIntent, new C4507t(eVar));
    }

    public final void zzv(C4551h hVar, PendingIntent pendingIntent, C4493e eVar) {
        checkConnected();
        C4536s.m(hVar, "geofencingRequest can't be null.");
        C4536s.m(pendingIntent, "PendingIntent must be specified.");
        C4536s.m(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzd(hVar, pendingIntent, new zzaw(eVar));
    }

    public final void zzw(P p10, C4493e eVar) {
        checkConnected();
        C4536s.m(p10, "removeGeofencingRequest can't be null.");
        C4536s.m(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzg(p10, new zzax(eVar));
    }

    public final void zzx(PendingIntent pendingIntent, C4493e eVar) {
        checkConnected();
        C4536s.m(pendingIntent, "PendingIntent must be specified.");
        C4536s.m(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zze(pendingIntent, new zzax(eVar), getContext().getPackageName());
    }

    public final void zzy(List<String> list, C4493e eVar) {
        boolean z10;
        checkConnected();
        if (list == null || list.size() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        C4536s.b(z10, "geofenceRequestIds can't be null nor empty.");
        C4536s.m(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzf((String[]) list.toArray(new String[0]), new zzax(eVar), getContext().getPackageName());
    }

    public final Location zzz(String str) {
        if (C4279b.b(getAvailableFeatures(), a0.f54379c)) {
            return this.zzf.zza(str);
        }
        return this.zzf.zzb();
    }
}
