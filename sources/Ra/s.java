package ra;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class s implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        int i10 = 0;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            if (b.v(C10) != 1) {
                b.K(parcel, C10);
            } else {
                i10 = b.E(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C5187e(i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5187e[i10];
    }
}
