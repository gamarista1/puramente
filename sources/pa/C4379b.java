package Pa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import za.b;

/* renamed from: Pa.b  reason: case insensitive filesystem */
public final class C4379b implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            if (b.v(C10) != 1) {
                b.K(parcel, C10);
            } else {
                bundle = b.f(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C4378a(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4378a[i10];
    }
}
