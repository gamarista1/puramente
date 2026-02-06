package ra;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class z implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        int i10 = 0;
        m mVar = null;
        String str = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                mVar = (m) b.o(parcel, C10, m.CREATOR);
            } else if (v10 == 2) {
                str = b.p(parcel, C10);
            } else if (v10 != 3) {
                b.K(parcel, C10);
            } else {
                i10 = b.E(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new i(mVar, str, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
