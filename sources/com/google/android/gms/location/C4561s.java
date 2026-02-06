package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzbe;
import java.util.ArrayList;
import za.b;

/* renamed from: com.google.android.gms.location.s  reason: case insensitive filesystem */
public final class C4561s implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = "";
        ArrayList arrayList = null;
        int i10 = 0;
        String str2 = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                arrayList = b.t(parcel, C10, zzbe.CREATOR);
            } else if (v10 == 2) {
                i10 = b.E(parcel, C10);
            } else if (v10 == 3) {
                str = b.p(parcel, C10);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                str2 = b.p(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C4551h(arrayList, i10, str, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new C4551h[i10];
    }
}
