package La;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import za.b;

public final class j0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            if (b.v(C10) != 1) {
                b.K(parcel, C10);
            } else {
                arrayList = b.t(parcel, C10, C4327H.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new C4326G(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4326G[i10];
    }
}
