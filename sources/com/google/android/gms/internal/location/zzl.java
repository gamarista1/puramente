package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.C4563u;
import com.google.android.gms.location.C4564v;
import za.C5298a;
import za.c;

public final class zzl extends C5298a {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    final int zza;
    final zzj zzb;
    final C4564v zzc;
    final zzai zzd;

    zzl(int i10, zzj zzj, IBinder iBinder, IBinder iBinder2) {
        C4564v vVar;
        this.zza = i10;
        this.zzb = zzj;
        zzai zzai = null;
        if (iBinder == null) {
            vVar = null;
        } else {
            vVar = C4563u.zzb(iBinder);
        }
        this.zzc = vVar;
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof zzai) {
                zzai = (zzai) queryLocalInterface;
            } else {
                zzai = new zzag(iBinder2);
            }
        }
        this.zzd = zzai;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder iBinder;
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.zza);
        c.B(parcel, 2, this.zzb, i10, false);
        C4564v vVar = this.zzc;
        IBinder iBinder2 = null;
        if (vVar == null) {
            iBinder = null;
        } else {
            iBinder = vVar.asBinder();
        }
        c.s(parcel, 3, iBinder, false);
        zzai zzai = this.zzd;
        if (zzai != null) {
            iBinder2 = zzai.asBinder();
        }
        c.s(parcel, 4, iBinder2, false);
        c.b(parcel, a10);
    }
}
