package Db;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class z0 implements Parcelable.Creator {
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
                    str5 = b.p(parcel, C10);
                    break;
                case 4:
                    str4 = b.p(parcel, C10);
                    break;
                case 5:
                    str3 = b.p(parcel, C10);
                    break;
                case 6:
                    str6 = b.p(parcel, C10);
                    break;
                case 7:
                    z10 = b.w(parcel, C10);
                    break;
                case 8:
                    str7 = b.p(parcel, C10);
                    break;
                default:
                    b.K(parcel, C10);
                    break;
            }
        }
        b.u(parcel, L10);
        return new A0(str, str2, str3, str4, str5, str6, z10, str7);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new A0[i10];
    }
}
