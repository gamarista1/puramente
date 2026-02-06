package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

/* renamed from: com.google.firebase.auth.t0  reason: case insensitive filesystem */
public final class C4813t0 implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j10 = 0;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                str = b.p(parcel, C10);
            } else if (v10 == 2) {
                str2 = b.p(parcel, C10);
            } else if (v10 == 3) {
                j10 = b.G(parcel, C10);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                str3 = b.p(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new U(str, str2, j10, str3);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new U[i10];
    }
}
