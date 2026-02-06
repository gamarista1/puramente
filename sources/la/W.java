package La;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import za.b;

public final class W implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 2) {
                str = b.p(parcel, C10);
            } else if (v10 == 3) {
                bArr = b.g(parcel, C10);
            } else if (v10 != 4) {
                b.K(parcel, C10);
            } else {
                arrayList = b.t(parcel, C10, Transport.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new C4362v(str, bArr, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4362v[i10];
    }
}
