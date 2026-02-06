package La;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class v0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        int i10 = 0;
        String str = null;
        int i11 = 0;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 2) {
                i10 = b.E(parcel, C10);
            } else if (v10 == 3) {
                str = b.p(parcel, C10);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                i11 = b.E(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C4349i(i10, str, i11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4349i[i10];
    }
}
