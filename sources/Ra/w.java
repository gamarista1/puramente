package ra;

import android.os.Parcel;
import android.os.Parcelable;
import ra.C5184b;
import za.b;

public final class w implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        byte[] bArr = null;
        boolean z10 = false;
        String str = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                z10 = b.w(parcel, C10);
            } else if (v10 == 2) {
                bArr = b.g(parcel, C10);
            } else if (v10 != 3) {
                b.K(parcel, C10);
            } else {
                str = b.p(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C5184b.d(z10, bArr, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5184b.d[i10];
    }
}
