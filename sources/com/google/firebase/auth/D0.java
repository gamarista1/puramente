package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class D0 implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                str = b.p(parcel, C10);
            } else if (v10 == 2) {
                str2 = b.p(parcel, C10);
            } else if (v10 == 3) {
                str3 = b.p(parcel, C10);
            } else if (v10 == 4) {
                str4 = b.p(parcel, C10);
            } else if (v10 != 5) {
                b.K(parcel, C10);
            } else {
                z10 = b.w(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C4793j(str, str2, str3, str4, z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4793j[i10];
    }
}
