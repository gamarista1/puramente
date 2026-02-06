package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class z5 implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L10 = b.L(parcel);
        int i10 = 0;
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        long j10 = 0;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            switch (b.v(C10)) {
                case 1:
                    i10 = b.E(parcel2, C10);
                    break;
                case 2:
                    str = b.p(parcel2, C10);
                    break;
                case 3:
                    j10 = b.G(parcel2, C10);
                    break;
                case 4:
                    l10 = b.H(parcel2, C10);
                    break;
                case 5:
                    f10 = b.B(parcel2, C10);
                    break;
                case 6:
                    str2 = b.p(parcel2, C10);
                    break;
                case 7:
                    str3 = b.p(parcel2, C10);
                    break;
                case 8:
                    d10 = b.z(parcel2, C10);
                    break;
                default:
                    b.K(parcel2, C10);
                    break;
            }
        }
        b.u(parcel2, L10);
        return new A5(i10, str, j10, l10, f10, str2, str3, d10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new A5[i10];
    }
}
