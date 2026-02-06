package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* renamed from: com.google.android.gms.common.internal.c0  reason: case insensitive filesystem */
public abstract class C4519c0 extends zzb implements C4531m {
    public C4519c0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzc.zzb(parcel);
            B(parcel.readInt(), parcel.readStrongBinder(), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
        } else if (i10 == 2) {
            zzc.zzb(parcel);
            G0(parcel.readInt(), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
        } else if (i10 != 3) {
            return false;
        } else {
            zzc.zzb(parcel);
            k1(parcel.readInt(), parcel.readStrongBinder(), (q0) zzc.zza(parcel, q0.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
