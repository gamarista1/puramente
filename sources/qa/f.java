package qa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import za.b;

public final class f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        int i10 = 0;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            switch (b.v(C10)) {
                case 1:
                    i10 = b.E(parcel, C10);
                    break;
                case 2:
                    arrayList = b.r(parcel, C10);
                    break;
                case 3:
                    arrayList2 = b.r(parcel, C10);
                    break;
                case 4:
                    arrayList3 = b.r(parcel, C10);
                    break;
                case 5:
                    arrayList4 = b.r(parcel, C10);
                    break;
                case 6:
                    arrayList5 = b.r(parcel, C10);
                    break;
                default:
                    b.K(parcel, C10);
                    break;
            }
        }
        b.u(parcel, L10);
        return new e(i10, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
