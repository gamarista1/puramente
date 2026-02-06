package La;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class Z implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 2) {
                str = b.p(parcel, C10);
            } else if (v10 == 3) {
                str2 = b.p(parcel, C10);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                str3 = b.p(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C4365y(str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4365y[i10];
    }
}
