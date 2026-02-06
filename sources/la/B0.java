package La;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class B0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        long j10 = 0;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                j10 = b.G(parcel, C10);
            } else if (v10 == 2) {
                bArr = b.g(parcel, C10);
            } else if (v10 == 3) {
                bArr2 = b.g(parcel, C10);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                bArr3 = b.g(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new A0(j10, bArr, bArr2, bArr3);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new A0[i10];
    }
}
