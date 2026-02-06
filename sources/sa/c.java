package Sa;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        Intent intent = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                i10 = b.E(parcel, C10);
            } else if (v10 == 2) {
                i11 = b.E(parcel, C10);
            } else if (v10 != 3) {
                b.K(parcel, C10);
            } else {
                intent = (Intent) b.o(parcel, C10, Intent.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new b(i10, i11, intent);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
