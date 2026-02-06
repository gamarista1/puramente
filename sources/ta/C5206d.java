package ta;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import za.b;

/* renamed from: ta.d  reason: case insensitive filesystem */
public final class C5206d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            int v10 = b.v(C10);
            if (v10 == 1) {
                str = b.p(parcel, C10);
            } else if (v10 == 2) {
                i11 = b.E(parcel, C10);
            } else if (v10 == 3) {
                j10 = b.G(parcel, C10);
            } else if (v10 == 4) {
                bArr = b.g(parcel, C10);
            } else if (v10 == 5) {
                bundle = b.f(parcel, C10);
            } else if (v10 != 1000) {
                b.K(parcel, C10);
            } else {
                i10 = b.E(parcel, C10);
            }
        }
        b.u(parcel, L10);
        return new C5204b(i10, str, i11, j10, bArr, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5204b[i10];
    }
}
