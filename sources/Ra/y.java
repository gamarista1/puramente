package ra;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import za.b;

public final class y implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L10 = b.L(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < L10) {
            int C10 = b.C(parcel);
            if (b.v(C10) != 1) {
                b.K(parcel, C10);
            } else {
                pendingIntent = (PendingIntent) b.o(parcel, C10, PendingIntent.CREATOR);
            }
        }
        b.u(parcel, L10);
        return new h(pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
