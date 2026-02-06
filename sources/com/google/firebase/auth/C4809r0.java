package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

/* renamed from: com.google.firebase.auth.r0  reason: case insensitive filesystem */
public final class C4809r0 implements Parcelable.Creator {
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
            } else if (v10 == 4) {
                str3 = b.p(parcel, C10);
            } else if (v10 == 5) {
                z10 = b.w(parcel, C10);
            } else if (v10 != 6) {
                b.K(parcel, C10);
            } else {
                str4 = b.p(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new O(str, str2, str3, z10, str4);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new O[i10];
    }
}
