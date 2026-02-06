package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import za.b;

public final class i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        ArrayList arrayList = null;
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                i10 = b.E(parcel, C10);
            } else if (v10 == 2) {
                arrayList = b.t(parcel, C10, f.CREATOR);
            } else if (v10 != 3) {
                b.K(parcel, C10);
            } else {
                str = b.p(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new h(i10, arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
