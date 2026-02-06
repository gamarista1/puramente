package La;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class t0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 2) {
                bArr = b.g(parcel, C10);
            } else if (v10 == 3) {
                bArr2 = b.g(parcel, C10);
            } else if (v10 == 4) {
                bArr3 = b.g(parcel, C10);
            } else if (v10 == 5) {
                bArr4 = b.g(parcel, C10);
            } else if (v10 != 6) {
                b.K(parcel, C10);
            } else {
                bArr5 = b.g(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C4345g(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4345g[i10];
    }
}
