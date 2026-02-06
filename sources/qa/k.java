package qa;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        long j10 = 0;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                i10 = b.E(parcel, C10);
            } else if (v10 == 2) {
                z10 = b.w(parcel, C10);
            } else if (v10 == 3) {
                j10 = b.G(parcel, C10);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                z11 = b.w(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C5146a(i10, z10, j10, z11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5146a[i10];
    }
}
