package La;

import La.C4337c;
import android.os.Parcel;
import android.os.Parcelable;

final class k0 implements Parcelable.Creator {
    k0() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C4337c.a(parcel.readString());
        } catch (C4337c.a e10) {
            throw new RuntimeException(e10);
        }
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4337c[i10];
    }
}
