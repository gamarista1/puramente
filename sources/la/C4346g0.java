package La;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: La.g0  reason: case insensitive filesystem */
final class C4346g0 implements Parcelable.Creator {
    C4346g0() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C4350i0.a(parcel.readString());
        } catch (C4348h0 e10) {
            throw new RuntimeException(e10);
        }
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4350i0[i10];
    }
}
