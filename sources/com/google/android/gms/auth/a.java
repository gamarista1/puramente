package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import za.b;

public final class a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        Long l10 = null;
        ArrayList arrayList = null;
        String str2 = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            switch (b.v(C10)) {
                case 1:
                    i10 = b.E(parcel, C10);
                    break;
                case 2:
                    str = b.p(parcel, C10);
                    break;
                case 3:
                    l10 = b.H(parcel, C10);
                    break;
                case 4:
                    z10 = b.w(parcel, C10);
                    break;
                case 5:
                    z11 = b.w(parcel, C10);
                    break;
                case 6:
                    arrayList = b.r(parcel, C10);
                    break;
                case 7:
                    str2 = b.p(parcel, C10);
                    break;
                default:
                    b.K(parcel, C10);
                    break;
            }
        }
        b.u(parcel, L10);
        return new TokenData(i10, str, l10, z10, z11, arrayList, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new TokenData[i10];
    }
}
