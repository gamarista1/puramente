package La;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

/* renamed from: La.L  reason: case insensitive filesystem */
public final class C4331L implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        long j10 = 0;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            if (b.v(C10) != 1) {
                b.K(parcel, C10);
            } else {
                j10 = b.G(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C4330K(j10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4330K[i10];
    }
}
