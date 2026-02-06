package Db;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C0;
import za.b;

public final class x0 implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        C4258f fVar = null;
        w0 w0Var = null;
        C0 c02 = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                fVar = (C4258f) b.o(parcel, C10, C4258f.CREATOR);
            } else if (v10 == 2) {
                w0Var = (w0) b.o(parcel, C10, w0.CREATOR);
            } else if (v10 != 3) {
                b.K(parcel, C10);
            } else {
                c02 = (C0) b.o(parcel, C10, C0.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new y0(fVar, w0Var, c02);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new y0[i10];
    }
}
