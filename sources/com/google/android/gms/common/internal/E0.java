package com.google.android.gms.common.internal;

import Ha.C4294a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public abstract class E0 extends zzb implements C4517b0 {
    public E0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static C4517b0 a(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof C4517b0) {
            return (C4517b0) queryLocalInterface;
        }
        return new D0(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            C4294a zzd = zzd();
            parcel2.writeNoException();
            zzc.zze(parcel2, zzd);
        } else if (i10 != 2) {
            return false;
        } else {
            int zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(zzc);
        }
        return true;
    }
}
