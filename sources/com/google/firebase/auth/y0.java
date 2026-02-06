package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class y0 implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            switch (b.v(C10)) {
                case 1:
                    str = b.p(parcel, C10);
                    break;
                case 2:
                    str2 = b.p(parcel, C10);
                    break;
                case 3:
                    str3 = b.p(parcel, C10);
                    break;
                case 4:
                    str4 = b.p(parcel, C10);
                    break;
                case 5:
                    z10 = b.w(parcel, C10);
                    break;
                case 6:
                    str5 = b.p(parcel, C10);
                    break;
                case 7:
                    z11 = b.w(parcel, C10);
                    break;
                case 8:
                    str6 = b.p(parcel, C10);
                    break;
                case 9:
                    i10 = b.E(parcel, C10);
                    break;
                case 10:
                    str7 = b.p(parcel, C10);
                    break;
                default:
                    b.K(parcel, C10);
                    break;
            }
        }
        b.u(parcel, L10);
        return new C4783e(str, str2, str3, str4, z10, str5, z11, str6, i10, str7);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4783e[i10];
    }
}
