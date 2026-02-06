package ra;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class t implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        boolean z10 = false;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
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
                    i10 = b.E(parcel, C10);
                    break;
                default:
                    b.K(parcel, C10);
                    break;
            }
        }
        b.u(parcel, L10);
        return new C5188f(str, str2, str3, str4, z10, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5188f[i10];
    }
}
