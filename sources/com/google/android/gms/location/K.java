package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import za.b;

public final class K implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        ArrayList arrayList = null;
        boolean z10 = false;
        boolean z11 = false;
        I i10 = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                arrayList = b.t(parcel, C10, LocationRequest.CREATOR);
            } else if (v10 == 2) {
                z10 = b.w(parcel, C10);
            } else if (v10 == 3) {
                z11 = b.w(parcel, C10);
            } else if (v10 != 5) {
                b.K(parcel, C10);
            } else {
                i10 = (I) b.o(parcel, C10, I.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new C4555l(arrayList, z10, z11, i10);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new C4555l[i10];
    }
}
