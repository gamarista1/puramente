package com.google.android.gms.common.internal;

import Ha.C4294a;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import ya.B;
import ya.x;
import ya.z;

/* renamed from: com.google.android.gms.common.internal.e0  reason: case insensitive filesystem */
public final class C4523e0 extends zza implements g0 {
    C4523e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean K0(B b10, C4294a aVar) {
        Parcel zza = zza();
        zzc.zzc(zza, b10);
        zzc.zze(zza, aVar);
        Parcel zzB = zzB(5, zza);
        boolean zzf = zzc.zzf(zzB);
        zzB.recycle();
        return zzf;
    }

    public final z e0(x xVar) {
        Parcel zza = zza();
        zzc.zzc(zza, xVar);
        Parcel zzB = zzB(8, zza);
        z zVar = (z) zzc.zza(zzB, z.CREATOR);
        zzB.recycle();
        return zVar;
    }

    public final z m0(x xVar) {
        Parcel zza = zza();
        zzc.zzc(zza, xVar);
        Parcel zzB = zzB(6, zza);
        z zVar = (z) zzc.zza(zzB, z.CREATOR);
        zzB.recycle();
        return zVar;
    }

    public final boolean zzi() {
        Parcel zzB = zzB(7, zza());
        boolean zzf = zzc.zzf(zzB);
        zzB.recycle();
        return zzf;
    }
}
