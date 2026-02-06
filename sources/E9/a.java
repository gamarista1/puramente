package E9;

import D9.a;
import android.os.Parcel;
import android.os.Parcelable;
import ja.C3645a;

public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0509a();

    /* renamed from: a  reason: collision with root package name */
    public final int f30673a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30674b;

    /* renamed from: E9.a$a  reason: collision with other inner class name */
    class C0509a implements Parcelable.Creator {
        C0509a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt(), (String) C3645a.e(parcel.readString()));
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, String str) {
        this.f30673a = i10;
        this.f30674b = str;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Ait(controlCode=" + this.f30673a + ",url=" + this.f30674b + ")";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f30674b);
        parcel.writeInt(this.f30673a);
    }
}
