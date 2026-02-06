package xa;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import za.b;

/* renamed from: xa.d  reason: case insensitive filesystem */
public final class C5271d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            if (b.v(C10) != 1) {
                b.K(parcel, C10);
            } else {
                intent = (Intent) b.o(parcel, C10, Intent.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new C5268a(intent);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5268a[i10];
    }
}
