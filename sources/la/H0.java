package La;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class H0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            if (b.v(C10) != 2) {
                b.K(parcel, C10);
            } else {
                str = b.p(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new r(str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new r[i10];
    }
}
