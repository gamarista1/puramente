package Ma;

import Ma.C4377a;
import android.os.Parcel;
import android.os.Parcelable;

final class f implements Parcelable.Creator {
    f() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C4377a.r0(parcel.readInt());
        } catch (C4377a.b e10) {
            throw new RuntimeException(e10);
        }
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4377a.C0797a[i10];
    }
}
