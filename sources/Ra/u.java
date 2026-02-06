package ra;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import ra.C5184b;
import za.b;

public final class u implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            switch (b.v(C10)) {
                case 1:
                    z10 = b.w(parcel, C10);
                    break;
                case 2:
                    str = b.p(parcel, C10);
                    break;
                case 3:
                    str2 = b.p(parcel, C10);
                    break;
                case 4:
                    z11 = b.w(parcel, C10);
                    break;
                case 5:
                    str3 = b.p(parcel, C10);
                    break;
                case 6:
                    arrayList = b.r(parcel, C10);
                    break;
                case 7:
                    z12 = b.w(parcel, C10);
                    break;
                default:
                    b.K(parcel, C10);
                    break;
            }
        }
        b.u(parcel, L10);
        return new C5184b.C0905b(z10, str, str2, z11, str3, arrayList, z12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5184b.C0905b[i10];
    }
}
