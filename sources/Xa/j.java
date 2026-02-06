package xa;

import android.os.Parcel;
import android.os.Parcelable;

final class j implements Parcelable.Creator {
    j() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new l(parcel.readStrongBinder());
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
