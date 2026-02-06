package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        Parcel parcel2 = null;
        int i10 = 0;
        h hVar = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                i10 = b.E(parcel, C10);
            } else if (v10 == 2) {
                parcel2 = b.m(parcel, C10);
            } else if (v10 != 3) {
                b.K(parcel, C10);
            } else {
                hVar = (h) b.o(parcel, C10, h.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new c(i10, parcel2, hVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
