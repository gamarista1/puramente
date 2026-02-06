package ra;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

/* renamed from: ra.D  reason: case insensitive filesystem */
public final class C5182D implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                str = b.p(parcel, C10);
            } else if (v10 != 2) {
                b.K(parcel, C10);
            } else {
                str2 = b.p(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new m(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new m[i10];
    }
}
