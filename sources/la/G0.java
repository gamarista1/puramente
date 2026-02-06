package La;

import La.C4358q;
import android.os.Parcel;
import android.os.Parcelable;

final class G0 implements Parcelable.Creator {
    G0() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C4358q.b(parcel.readInt());
        } catch (C4358q.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4358q[i10];
    }
}
