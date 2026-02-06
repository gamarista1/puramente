package La;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class q0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                bArr = b.g(parcel, C10);
            } else if (v10 != 2) {
                b.K(parcel, C10);
            } else {
                bArr2 = b.g(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new p0(bArr, bArr2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new p0[i10];
    }
}
