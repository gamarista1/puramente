package La;

import La.C4366z;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: La.a0  reason: case insensitive filesystem */
final class C4334a0 implements Parcelable.Creator {
    C4334a0() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C4366z.a(parcel.readString());
        } catch (C4366z.a e10) {
            throw new RuntimeException(e10);
        }
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4366z[i10];
    }
}
