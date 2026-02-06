package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

/* renamed from: com.google.android.gms.measurement.internal.g5  reason: case insensitive filesystem */
public final class C4617g5 implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                str = b.p(parcel, C10);
            } else if (v10 == 2) {
                j10 = b.G(parcel, C10);
            } else if (v10 != 3) {
                b.K(parcel, C10);
            } else {
                i10 = b.E(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C4624h5(str, j10, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4624h5[i10];
    }
}
