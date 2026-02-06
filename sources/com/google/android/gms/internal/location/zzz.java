package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.C4548e;
import com.google.android.gms.location.C4552i;
import com.google.android.gms.location.C4553j;
import com.google.android.gms.location.C4554k;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.lang.reflect.InvocationTargetException;

@VisibleForTesting
public final class zzz implements C4548e {
    public final h flushLocations(f fVar) {
        return fVar.b(new zzq(this, fVar));
    }

    public final Location getLastLocation(f fVar) {
        String str;
        zzaz a10 = C4554k.a(fVar);
        Context e10 = fVar.e();
        if (Build.VERSION.SDK_INT >= 30 && e10 != null) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", (Class[]) null).invoke(e10, (Object[]) null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            return a10.zzz(str);
        }
        str = null;
        try {
            return a10.zzz(str);
        } catch (Exception unused2) {
            return null;
        }
    }

    public final LocationAvailability getLocationAvailability(f fVar) {
        try {
            return C4554k.a(fVar).zzA();
        } catch (Exception unused) {
            return null;
        }
    }

    public final h removeLocationUpdates(f fVar, PendingIntent pendingIntent) {
        return fVar.b(new zzw(this, fVar, pendingIntent));
    }

    public final h requestLocationUpdates(f fVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return fVar.b(new zzu(this, fVar, locationRequest, pendingIntent));
    }

    public final h setMockLocation(f fVar, Location location) {
        return fVar.b(new zzp(this, fVar, location));
    }

    public final h setMockMode(f fVar, boolean z10) {
        return fVar.b(new zzo(this, fVar, z10));
    }

    public final h removeLocationUpdates(f fVar, C4552i iVar) {
        return fVar.b(new zzn(this, fVar, iVar));
    }

    public final h requestLocationUpdates(f fVar, LocationRequest locationRequest, C4552i iVar, Looper looper) {
        return fVar.b(new zzt(this, fVar, locationRequest, iVar, looper));
    }

    public final h removeLocationUpdates(f fVar, C4553j jVar) {
        return fVar.b(new zzv(this, fVar, jVar));
    }

    public final h requestLocationUpdates(f fVar, LocationRequest locationRequest, C4553j jVar) {
        C4536s.m(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return fVar.b(new zzr(this, fVar, locationRequest, jVar));
    }

    public final h requestLocationUpdates(f fVar, LocationRequest locationRequest, C4553j jVar, Looper looper) {
        return fVar.b(new zzs(this, fVar, locationRequest, jVar, looper));
    }
}
