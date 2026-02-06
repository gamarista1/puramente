package La;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class u0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        String[] strArr = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 2) {
                bArr = b.g(parcel, C10);
            } else if (v10 == 3) {
                bArr2 = b.g(parcel, C10);
            } else if (v10 == 4) {
                bArr3 = b.g(parcel, C10);
            } else if (v10 != 5) {
                b.K(parcel, C10);
            } else {
                strArr = b.q(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C4347h(bArr, bArr2, bArr3, strArr);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4347h[i10];
    }
}
