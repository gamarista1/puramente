package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import za.b;

public final class e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        int i10 = 0;
        a.C0822a aVar = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                i10 = b.E(parcel, C10);
            } else if (v10 == 2) {
                str = b.p(parcel, C10);
            } else if (v10 != 3) {
                b.K(parcel, C10);
            } else {
                aVar = (a.C0822a) b.o(parcel, C10, a.C0822a.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new g(i10, str, aVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
