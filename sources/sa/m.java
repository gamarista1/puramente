package Sa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.V;
import za.b;

public final class m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        ConnectionResult connectionResult = null;
        int i10 = 0;
        V v10 = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v11 = b.v(C10);
            if (v11 == 1) {
                i10 = b.E(parcel, C10);
            } else if (v11 == 2) {
                connectionResult = (ConnectionResult) b.o(parcel, C10, ConnectionResult.CREATOR);
            } else if (v11 != 3) {
                b.K(parcel, C10);
            } else {
                v10 = (V) b.o(parcel, C10, V.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new l(i10, connectionResult, v10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
