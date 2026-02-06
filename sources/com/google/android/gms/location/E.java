package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class E implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L10 = b.L(parcel);
        int i10 = 102;
        long j10 = 3600000;
        long j11 = 600000;
        boolean z10 = false;
        boolean z11 = false;
        long j12 = Long.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        float f10 = 0.0f;
        long j13 = 0;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            switch (b.v(C10)) {
                case 1:
                    i10 = b.E(parcel2, C10);
                    break;
                case 2:
                    j10 = b.G(parcel2, C10);
                    break;
                case 3:
                    j11 = b.G(parcel2, C10);
                    break;
                case 4:
                    z10 = b.w(parcel2, C10);
                    break;
                case 5:
                    j12 = b.G(parcel2, C10);
                    break;
                case 6:
                    i11 = b.E(parcel2, C10);
                    break;
                case 7:
                    f10 = b.A(parcel2, C10);
                    break;
                case 8:
                    j13 = b.G(parcel2, C10);
                    break;
                case 9:
                    z11 = b.w(parcel2, C10);
                    break;
                default:
                    b.K(parcel2, C10);
                    break;
            }
        }
        b.u(parcel2, L10);
        return new LocationRequest(i10, j10, j11, z10, j12, i11, f10, j13, z11);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
