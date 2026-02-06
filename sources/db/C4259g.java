package Db;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

/* renamed from: Db.g  reason: case insensitive filesystem */
public final class C4259g implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                j10 = b.G(parcel, C10);
            } else if (v10 != 2) {
                b.K(parcel, C10);
            } else {
                j11 = b.G(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C4260h(j10, j11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4260h[i10];
    }
}
