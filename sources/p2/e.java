package P2;

import android.os.Parcel;
import android.os.Parcelable;

public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new a();

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e();
        }

        /* renamed from: b */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
    }
}
