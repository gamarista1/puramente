package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class u0 implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            if (b.v(C10) != 1) {
                b.K(parcel, C10);
            } else {
                str = b.p(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new V(str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new V[i10];
    }
}
