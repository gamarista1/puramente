package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.B;
import com.google.android.gms.location.C;
import com.google.android.gms.location.C4566x;
import com.google.android.gms.location.C4568z;
import za.C5298a;
import za.c;

public final class zzbc extends C5298a {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbd();
    final int zza;
    final zzba zzb;
    final C zzc;
    final PendingIntent zzd;
    final C4568z zze;
    final zzai zzf;

    zzbc(int i10, zzba zzba, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        C c10;
        C4568z zVar;
        this.zza = i10;
        this.zzb = zzba;
        zzai zzai = null;
        if (iBinder == null) {
            c10 = null;
        } else {
            c10 = B.zzb(iBinder);
        }
        this.zzc = c10;
        this.zzd = pendingIntent;
        if (iBinder2 == null) {
            zVar = null;
        } else {
            zVar = C4566x.zzb(iBinder2);
        }
        this.zze = zVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof zzai) {
                zzai = (zzai) queryLocalInterface;
            } else {
                zzai = new zzag(iBinder3);
            }
        }
        this.zzf = zzai;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r3v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.location.zzbc zza(com.google.android.gms.location.C r8, com.google.android.gms.internal.location.zzai r9) {
        /*
            com.google.android.gms.internal.location.zzbc r7 = new com.google.android.gms.internal.location.zzbc
            if (r9 != 0) goto L_0x0005
            r9 = 0
        L_0x0005:
            r6 = r9
            r4 = 0
            r5 = 0
            r1 = 2
            r2 = 0
            r0 = r7
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbc.zza(com.google.android.gms.location.C, com.google.android.gms.internal.location.zzai):com.google.android.gms.internal.location.zzbc");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.location.zzbc zzb(com.google.android.gms.internal.location.zzba r8, android.app.PendingIntent r9, com.google.android.gms.internal.location.zzai r10) {
        /*
            com.google.android.gms.internal.location.zzbc r7 = new com.google.android.gms.internal.location.zzbc
            r3 = 0
            r5 = 0
            r1 = 1
            r0 = r7
            r2 = r8
            r4 = r9
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbc.zzb(com.google.android.gms.internal.location.zzba, android.app.PendingIntent, com.google.android.gms.internal.location.zzai):com.google.android.gms.internal.location.zzbc");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r5v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.location.zzbc zzc(com.google.android.gms.location.C4568z r8, com.google.android.gms.internal.location.zzai r9) {
        /*
            com.google.android.gms.internal.location.zzbc r7 = new com.google.android.gms.internal.location.zzbc
            if (r9 != 0) goto L_0x0005
            r9 = 0
        L_0x0005:
            r6 = r9
            r3 = 0
            r4 = 0
            r1 = 2
            r2 = 0
            r0 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbc.zzc(com.google.android.gms.location.z, com.google.android.gms.internal.location.zzai):com.google.android.gms.internal.location.zzbc");
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder iBinder;
        IBinder iBinder2;
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.zza);
        c.B(parcel, 2, this.zzb, i10, false);
        C c10 = this.zzc;
        IBinder iBinder3 = null;
        if (c10 == null) {
            iBinder = null;
        } else {
            iBinder = c10.asBinder();
        }
        c.s(parcel, 3, iBinder, false);
        c.B(parcel, 4, this.zzd, i10, false);
        C4568z zVar = this.zze;
        if (zVar == null) {
            iBinder2 = null;
        } else {
            iBinder2 = zVar.asBinder();
        }
        c.s(parcel, 5, iBinder2, false);
        zzai zzai = this.zzf;
        if (zzai != null) {
            iBinder3 = zzai.asBinder();
        }
        c.s(parcel, 6, iBinder3, false);
        c.b(parcel, a10);
    }
}
