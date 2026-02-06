package La;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

/* renamed from: La.e0  reason: case insensitive filesystem */
public final class C4342e0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 2) {
                str = b.p(parcel, C10);
            } else if (v10 != 3) {
                b.K(parcel, C10);
            } else {
                str2 = b.p(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C4324E(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4324E[i10];
    }
}
