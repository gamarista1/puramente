package I9;

import android.os.Parcel;
import android.os.Parcelable;
import ja.M;

public final class j extends i {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f31811b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31812c;

    /* renamed from: d  reason: collision with root package name */
    public final String f31813d;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        /* renamed from: b */
        public j[] newArray(int i10) {
            return new j[i10];
        }
    }

    public j(String str, String str2, String str3) {
        super("----");
        this.f31811b = str;
        this.f31812c = str2;
        this.f31813d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (!M.c(this.f31812c, jVar.f31812c) || !M.c(this.f31811b, jVar.f31811b) || !M.c(this.f31813d, jVar.f31813d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int i11;
        String str = this.f31811b;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f31812c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f31813d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    public String toString() {
        return this.f31810a + ": domain=" + this.f31811b + ", description=" + this.f31812c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f31810a);
        parcel.writeString(this.f31811b);
        parcel.writeString(this.f31813d);
    }

    j(Parcel parcel) {
        super("----");
        this.f31811b = (String) M.j(parcel.readString());
        this.f31812c = (String) M.j(parcel.readString());
        this.f31813d = (String) M.j(parcel.readString());
    }
}
