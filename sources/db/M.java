package Db;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.U;
import com.google.firebase.auth.Y;
import java.util.ArrayList;
import za.b;

public final class M implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                arrayList = b.t(parcel, C10, U.CREATOR);
            } else if (v10 != 2) {
                b.K(parcel, C10);
            } else {
                arrayList2 = b.t(parcel, C10, Y.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new J(arrayList, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new J[i10];
    }
}
