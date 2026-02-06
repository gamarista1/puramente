package Ca;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        C4247a aVar = null;
        int i10 = 0;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                i10 = b.E(parcel, C10);
            } else if (v10 != 2) {
                b.K(parcel, C10);
            } else {
                aVar = (C4247a) b.o(parcel, C10, C4247a.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new C4248b(i10, aVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4248b[i10];
    }
}
