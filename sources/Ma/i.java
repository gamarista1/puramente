package Ma;

import Ma.c;
import android.os.Parcel;
import android.os.Parcelable;

final class i implements Parcelable.Creator {
    i() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return c.a(parcel.readString());
        } catch (c.a e10) {
            throw new RuntimeException(e10);
        }
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
