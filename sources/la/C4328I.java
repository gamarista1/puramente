package La;

import La.C4335b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: La.I  reason: case insensitive filesystem */
final class C4328I implements Parcelable.Creator {
    C4328I() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C4335b.a(parcel.readString());
        } catch (C4335b.a e10) {
            throw new RuntimeException(e10);
        }
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4335b[i10];
    }
}
