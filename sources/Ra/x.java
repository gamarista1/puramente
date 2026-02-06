package ra;

import android.os.Parcel;
import android.os.Parcelable;
import ra.C5184b;
import za.b;

public final class x implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        boolean z10 = false;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            if (b.v(C10) != 1) {
                b.K(parcel, C10);
            } else {
                z10 = b.w(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C5184b.e(z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5184b.e[i10];
    }
}
