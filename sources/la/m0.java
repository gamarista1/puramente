package La;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class m0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        C4326G g10 = null;
        p0 p0Var = null;
        C4343f fVar = null;
        r0 r0Var = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                g10 = (C4326G) b.o(parcel, C10, C4326G.CREATOR);
            } else if (v10 == 2) {
                p0Var = (p0) b.o(parcel, C10, p0.CREATOR);
            } else if (v10 == 3) {
                fVar = (C4343f) b.o(parcel, C10, C4343f.CREATOR);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                r0Var = (r0) b.o(parcel, C10, r0.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new C4341e(g10, p0Var, fVar, r0Var);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4341e[i10];
    }
}
