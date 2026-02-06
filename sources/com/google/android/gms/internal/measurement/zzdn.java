package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class zzdn implements Parcelable.Creator<zzdo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L10 = b.L(parcel);
        long j10 = 0;
        long j11 = 0;
        boolean z10 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            switch (b.v(C10)) {
                case 1:
                    j10 = b.G(parcel2, C10);
                    break;
                case 2:
                    j11 = b.G(parcel2, C10);
                    break;
                case 3:
                    z10 = b.w(parcel2, C10);
                    break;
                case 4:
                    str = b.p(parcel2, C10);
                    break;
                case 5:
                    str2 = b.p(parcel2, C10);
                    break;
                case 6:
                    str3 = b.p(parcel2, C10);
                    break;
                case 7:
                    bundle = b.f(parcel2, C10);
                    break;
                case 8:
                    str4 = b.p(parcel2, C10);
                    break;
                default:
                    b.K(parcel2, C10);
                    break;
            }
        }
        b.u(parcel2, L10);
        return new zzdo(j10, j11, z10, str, str2, str3, bundle, str4);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdo[i10];
    }
}
