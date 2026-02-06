package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import za.b;

public final class S implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        ArrayList arrayList = null;
        int i10 = 0;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                arrayList = b.t(parcel, C10, T.CREATOR);
            } else if (v10 != 2) {
                b.K(parcel, C10);
            } else {
                i10 = b.E(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C4560q(arrayList, i10);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new C4560q[i10];
    }
}
