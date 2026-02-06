package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class J implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = "";
        String str2 = str;
        String str3 = str2;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                str2 = b.p(parcel, C10);
            } else if (v10 == 2) {
                str3 = b.p(parcel, C10);
            } else if (v10 != 5) {
                b.K(parcel, C10);
            } else {
                str = b.p(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new I(str, str2, str3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new I[i10];
    }
}
