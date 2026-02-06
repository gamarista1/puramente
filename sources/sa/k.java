package Sa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.T;
import za.b;

public final class k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        T t10 = null;
        int i10 = 0;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                i10 = b.E(parcel, C10);
            } else if (v10 != 2) {
                b.K(parcel, C10);
            } else {
                t10 = (T) b.o(parcel, C10, T.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new j(i10, t10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
