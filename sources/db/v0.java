package Db;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class v0 implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        boolean z10 = false;
        String str2 = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                str = b.p(parcel, C10);
            } else if (v10 == 2) {
                str2 = b.p(parcel, C10);
            } else if (v10 != 3) {
                b.K(parcel, C10);
            } else {
                z10 = b.w(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new w0(str, str2, z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new w0[i10];
    }
}
