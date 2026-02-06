package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class N implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L10 = b.L(parcel);
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        String str = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            switch (b.v(C10)) {
                case 1:
                    i11 = b.E(parcel2, C10);
                    break;
                case 2:
                    i12 = b.E(parcel2, C10);
                    break;
                case 3:
                    i13 = b.E(parcel2, C10);
                    break;
                case 4:
                    j10 = b.G(parcel2, C10);
                    break;
                case 5:
                    j11 = b.G(parcel2, C10);
                    break;
                case 6:
                    str = b.p(parcel2, C10);
                    break;
                case 7:
                    str2 = b.p(parcel2, C10);
                    break;
                case 8:
                    i14 = b.E(parcel2, C10);
                    break;
                case 9:
                    i10 = b.E(parcel2, C10);
                    break;
                default:
                    b.K(parcel2, C10);
                    break;
            }
        }
        b.u(parcel2, L10);
        return new C4534p(i11, i12, i13, j10, j11, str, str2, i14, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4534p[i10];
    }
}
