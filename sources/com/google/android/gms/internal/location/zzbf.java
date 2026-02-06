package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class zzbf implements Parcelable.Creator<zzbe> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L10 = b.L(parcel);
        String str = null;
        int i10 = 0;
        short s10 = 0;
        int i11 = 0;
        double d10 = 0.0d;
        double d11 = 0.0d;
        float f10 = 0.0f;
        long j10 = 0;
        int i12 = -1;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            switch (b.v(C10)) {
                case 1:
                    str = b.p(parcel2, C10);
                    break;
                case 2:
                    j10 = b.G(parcel2, C10);
                    break;
                case 3:
                    s10 = b.I(parcel2, C10);
                    break;
                case 4:
                    d10 = b.y(parcel2, C10);
                    break;
                case 5:
                    d11 = b.y(parcel2, C10);
                    break;
                case 6:
                    f10 = b.A(parcel2, C10);
                    break;
                case 7:
                    i10 = b.E(parcel2, C10);
                    break;
                case 8:
                    i11 = b.E(parcel2, C10);
                    break;
                case 9:
                    i12 = b.E(parcel2, C10);
                    break;
                default:
                    b.K(parcel2, C10);
                    break;
            }
        }
        b.u(parcel2, L10);
        return new zzbe(str, i10, s10, d10, d11, f10, j10, i11, i12);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzbe[i10];
    }
}
