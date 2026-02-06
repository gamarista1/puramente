package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class U implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                i10 = b.E(parcel, C10);
            } else if (v10 == 2) {
                i11 = b.E(parcel, C10);
            } else if (v10 == 3) {
                i12 = b.E(parcel, C10);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                i13 = b.E(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new T(i10, i11, i12, i13);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new T[i10];
    }
}
