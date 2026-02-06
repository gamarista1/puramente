package ya;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class y implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            switch (b.v(C10)) {
                case 1:
                    str = b.p(parcel, C10);
                    break;
                case 2:
                    z10 = b.w(parcel, C10);
                    break;
                case 3:
                    z11 = b.w(parcel, C10);
                    break;
                case 4:
                    iBinder = b.D(parcel, C10);
                    break;
                case 5:
                    z12 = b.w(parcel, C10);
                    break;
                case 6:
                    z13 = b.w(parcel, C10);
                    break;
                default:
                    b.K(parcel, C10);
                    break;
            }
        }
        b.u(parcel, L10);
        return new x(str, z10, z11, iBinder, z12, z13);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new x[i10];
    }
}
