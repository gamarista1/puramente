package La;

import La.C4356o;
import android.os.Parcel;
import android.os.Parcelable;

final class z0 implements Parcelable.Creator {
    z0() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C4356o.a(parcel.readInt());
        } catch (C4356o.a e10) {
            throw new RuntimeException(e10);
        }
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4356o[i10];
    }
}
