package ya;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class C implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        boolean z10 = false;
        String str = null;
        IBinder iBinder = null;
        boolean z11 = false;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                str = b.p(parcel, C10);
            } else if (v10 == 2) {
                iBinder = b.D(parcel, C10);
            } else if (v10 == 3) {
                z10 = b.w(parcel, C10);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                z11 = b.w(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new B(str, iBinder, z10, z11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new B[i10];
    }
}
