package La;

import La.C4323D;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: La.c0  reason: case insensitive filesystem */
final class C4338c0 implements Parcelable.Creator {
    C4338c0() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        try {
            return C4323D.a(readString);
        } catch (C4323D.a e10) {
            throw new RuntimeException(e10);
        }
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4323D[i10];
    }
}
