package La;

import La.C4324E;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: La.d0  reason: case insensitive filesystem */
final class C4340d0 implements Parcelable.Creator {
    C4340d0() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C4324E.a.a(parcel.readString());
        } catch (C4324E.b e10) {
            throw new RuntimeException(e10);
        }
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4324E.a[i10];
    }
}
