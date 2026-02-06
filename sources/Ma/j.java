package Ma;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        String str2 = null;
        int i10 = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                i10 = b.E(parcel, C10);
            } else if (v10 == 2) {
                str = b.p(parcel, C10);
            } else if (v10 == 3) {
                bArr = b.g(parcel, C10);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                str2 = b.p(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new d(i10, str, bArr, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
