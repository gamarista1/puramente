package Ma;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import za.b;

public final class h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        byte[] bArr = null;
        ArrayList arrayList = null;
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                i10 = b.E(parcel, C10);
            } else if (v10 == 2) {
                bArr = b.g(parcel, C10);
            } else if (v10 == 3) {
                str = b.p(parcel, C10);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                arrayList = b.t(parcel, C10, Transport.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new b(i10, bArr, str, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
