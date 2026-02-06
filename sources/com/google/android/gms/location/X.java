package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4520d;
import java.util.ArrayList;
import za.b;

public final class X implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        ArrayList arrayList = null;
        String str = null;
        ArrayList arrayList2 = null;
        String str2 = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                arrayList = b.t(parcel, C10, C4546c.CREATOR);
            } else if (v10 == 2) {
                str = b.p(parcel, C10);
            } else if (v10 == 3) {
                arrayList2 = b.t(parcel, C10, C4520d.CREATOR);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                str2 = b.p(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C4547d(arrayList, str, arrayList2, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new C4547d[i10];
    }
}
