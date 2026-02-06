package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class Z implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L10 = b.L(parcel);
        boolean z10 = true;
        long j10 = 50;
        float f10 = 0.0f;
        long j11 = Long.MAX_VALUE;
        int i10 = Integer.MAX_VALUE;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                z10 = b.w(parcel2, C10);
            } else if (v10 == 2) {
                j10 = b.G(parcel2, C10);
            } else if (v10 == 3) {
                f10 = b.A(parcel2, C10);
            } else if (v10 == 4) {
                j11 = b.G(parcel2, C10);
            } else if (v10 != 5) {
                b.K(parcel2, C10);
            } else {
                i10 = b.E(parcel2, C10);
            }
        }
        b.u(parcel2, L10);
        return new Y(z10, j10, f10, j11, i10);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new Y[i10];
    }
}
