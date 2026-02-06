package J2;

import android.os.Parcel;
import android.os.Parcelable;
import f2.z;
import i2.C2076a;

public final class a implements z.b {
    public static final Parcelable.Creator<a> CREATOR = new C0088a();

    /* renamed from: a  reason: collision with root package name */
    public final int f3956a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3957b;

    /* renamed from: J2.a$a  reason: collision with other inner class name */
    class C0088a implements Parcelable.Creator {
        C0088a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt(), (String) C2076a.e(parcel.readString()));
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, String str) {
        this.f3956a = i10;
        this.f3957b = str;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Ait(controlCode=" + this.f3956a + ",url=" + this.f3957b + ")";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3957b);
        parcel.writeInt(this.f3956a);
    }
}
