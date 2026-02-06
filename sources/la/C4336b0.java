package La;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

/* renamed from: La.b0  reason: case insensitive filesystem */
public final class C4336b0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        byte[] bArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 2) {
                bArr = b.g(parcel, C10);
            } else if (v10 == 3) {
                str = b.p(parcel, C10);
            } else if (v10 == 4) {
                str2 = b.p(parcel, C10);
            } else if (v10 != 5) {
                b.K(parcel, C10);
            } else {
                str3 = b.p(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C4320A(bArr, str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4320A[i10];
    }
}
