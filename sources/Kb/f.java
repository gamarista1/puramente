package kb;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

final class f implements Parcelable.Creator {
    f() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z10;
        PendingIntent pendingIntent = (PendingIntent) parcel.readParcelable(C5062b.class.getClassLoader());
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new e(pendingIntent, z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5062b[i10];
    }
}
