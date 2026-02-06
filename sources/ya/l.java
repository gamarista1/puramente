package ya;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        long j10 = -1;
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                str = b.p(parcel, C10);
            } else if (v10 == 2) {
                i10 = b.E(parcel, C10);
            } else if (v10 != 3) {
                b.K(parcel, C10);
            } else {
                j10 = b.G(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C5286c(str, i10, j10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5286c[i10];
    }
}
