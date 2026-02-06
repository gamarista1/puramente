package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.Q;
import za.b;

public final class A0 implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            b.v(C10);
            b.K(parcel, C10);
        }
        b.u(parcel, L10);
        return new Q.a();
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Q.a[i10];
    }
}
