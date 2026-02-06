package La;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class T implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        byte[][] bArr = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            if (b.v(C10) != 1) {
                b.K(parcel, C10);
            } else {
                bArr = b.h(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new S(bArr);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new S[i10];
    }
}
