package L9;

import G9.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0533a();

    /* renamed from: L9.a$a  reason: collision with other inner class name */
    class C0533a implements Parcelable.Creator {
        C0533a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, String str2) {
        super(str, str2);
    }

    a(Parcel parcel) {
        super(parcel);
    }
}
