package La;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class s0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        byte[] bArr = null;
        boolean z10 = false;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                z10 = b.w(parcel, C10);
            } else if (v10 != 2) {
                b.K(parcel, C10);
            } else {
                bArr = b.g(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new r0(z10, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new r0[i10];
    }
}
