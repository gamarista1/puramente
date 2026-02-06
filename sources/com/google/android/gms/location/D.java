package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class D implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        int i10 = 1000;
        int i11 = 1;
        int i12 = 1;
        long j10 = 0;
        N[] nArr = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                i11 = b.E(parcel, C10);
            } else if (v10 == 2) {
                i12 = b.E(parcel, C10);
            } else if (v10 == 3) {
                j10 = b.G(parcel, C10);
            } else if (v10 == 4) {
                i10 = b.E(parcel, C10);
            } else if (v10 != 5) {
                b.K(parcel, C10);
            } else {
                nArr = (N[]) b.s(parcel, C10, N.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new LocationAvailability(i10, i11, i12, j10, nArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
