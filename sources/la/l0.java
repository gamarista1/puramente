package La;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class l0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        int i10 = 0;
        short s10 = 0;
        short s11 = 0;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                i10 = b.E(parcel, C10);
            } else if (v10 == 2) {
                s10 = b.I(parcel, C10);
            } else if (v10 != 3) {
                b.K(parcel, C10);
            } else {
                s11 = b.I(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C4327H(i10, s10, s11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4327H[i10];
    }
}
