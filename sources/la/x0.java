package La;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class x0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        C4361u uVar = null;
        Uri uri = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 2) {
                uVar = (C4361u) b.o(parcel, C10, C4361u.CREATOR);
            } else if (v10 == 3) {
                uri = (Uri) b.o(parcel, C10, Uri.CREATOR);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                bArr = b.g(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C4353l(uVar, uri, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4353l[i10];
    }
}
