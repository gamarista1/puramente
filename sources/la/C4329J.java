package La;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

/* renamed from: La.J  reason: case insensitive filesystem */
public final class C4329J implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        boolean z10 = false;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            if (b.v(C10) != 1) {
                b.K(parcel, C10);
            } else {
                z10 = b.w(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new I0(z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new I0[i10];
    }
}
