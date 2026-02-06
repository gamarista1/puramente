package oa;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            switch (b.v(C10)) {
                case 1:
                    i10 = b.E(parcel, C10);
                    break;
                case 2:
                    j10 = b.G(parcel, C10);
                    break;
                case 3:
                    str = b.p(parcel, C10);
                    break;
                case 4:
                    i11 = b.E(parcel, C10);
                    break;
                case 5:
                    i12 = b.E(parcel, C10);
                    break;
                case 6:
                    str2 = b.p(parcel, C10);
                    break;
                default:
                    b.K(parcel, C10);
                    break;
            }
        }
        b.u(parcel, L10);
        return new C5119a(i10, j10, str, i11, i12, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5119a[i10];
    }
}
