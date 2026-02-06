package La;

import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class X implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        Integer num = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 2) {
                str = b.p(parcel, C10);
            } else if (v10 != 3) {
                b.K(parcel, C10);
            } else {
                num = b.F(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C4363w(str, num.intValue());
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4363w[i10];
    }
}
