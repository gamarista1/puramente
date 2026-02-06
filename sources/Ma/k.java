package Ma;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        b bVar = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 2) {
                bVar = (b) b.o(parcel, C10, b.CREATOR);
            } else if (v10 == 3) {
                str = b.p(parcel, C10);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                str2 = b.p(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new e(bVar, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
