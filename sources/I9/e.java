package I9;

import android.os.Parcel;
import android.os.Parcelable;
import ja.M;

public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f31798b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31799c;

    /* renamed from: d  reason: collision with root package name */
    public final String f31800d;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        /* renamed from: b */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f31798b = str;
        this.f31799c = str2;
        this.f31800d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!M.c(this.f31799c, eVar.f31799c) || !M.c(this.f31798b, eVar.f31798b) || !M.c(this.f31800d, eVar.f31800d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int i11;
        String str = this.f31798b;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f31799c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f31800d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    public String toString() {
        return this.f31810a + ": language=" + this.f31798b + ", description=" + this.f31799c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f31810a);
        parcel.writeString(this.f31798b);
        parcel.writeString(this.f31800d);
    }

    e(Parcel parcel) {
        super("COMM");
        this.f31798b = (String) M.j(parcel.readString());
        this.f31799c = (String) M.j(parcel.readString());
        this.f31800d = (String) M.j(parcel.readString());
    }
}
