package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class M implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            switch (b.v(C10)) {
                case 1:
                    z10 = b.w(parcel, C10);
                    break;
                case 2:
                    z11 = b.w(parcel, C10);
                    break;
                case 3:
                    z12 = b.w(parcel, C10);
                    break;
                case 4:
                    z13 = b.w(parcel, C10);
                    break;
                case 5:
                    z14 = b.w(parcel, C10);
                    break;
                case 6:
                    z15 = b.w(parcel, C10);
                    break;
                default:
                    b.K(parcel, C10);
                    break;
            }
        }
        b.u(parcel, L10);
        return new C4557n(z10, z11, z12, z13, z14, z15);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new C4557n[i10];
    }
}
