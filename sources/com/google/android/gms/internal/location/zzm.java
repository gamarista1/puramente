package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class zzm implements Parcelable.Creator<zzl> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        zzj zzj = null;
        int i10 = 1;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                i10 = b.E(parcel, C10);
            } else if (v10 == 2) {
                zzj = (zzj) b.o(parcel, C10, zzj.CREATOR);
            } else if (v10 == 3) {
                iBinder = b.D(parcel, C10);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                iBinder2 = b.D(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new zzl(i10, zzj, iBinder, iBinder2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzl[i10];
    }
}
