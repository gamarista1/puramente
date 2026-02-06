package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class O implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        int i10 = 1;
        int i11 = 1;
        long j10 = -1;
        long j11 = -1;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                i10 = b.E(parcel, C10);
            } else if (v10 == 2) {
                i11 = b.E(parcel, C10);
            } else if (v10 == 3) {
                j10 = b.G(parcel, C10);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                j11 = b.G(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new N(i10, i11, j10, j11);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new N[i10];
    }
}
