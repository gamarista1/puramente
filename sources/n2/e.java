package N2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.L;

public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f4406b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4407c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4408d;

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
        this.f4406b = str;
        this.f4407c = str2;
        this.f4408d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!L.c(this.f4407c, eVar.f4407c) || !L.c(this.f4406b, eVar.f4406b) || !L.c(this.f4408d, eVar.f4408d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int i11;
        String str = this.f4406b;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f4407c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f4408d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    public String toString() {
        return this.f4418a + ": language=" + this.f4406b + ", description=" + this.f4407c + ", text=" + this.f4408d;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4418a);
        parcel.writeString(this.f4406b);
        parcel.writeString(this.f4408d);
    }

    e(Parcel parcel) {
        super("COMM");
        this.f4406b = (String) L.h(parcel.readString());
        this.f4407c = (String) L.h(parcel.readString());
        this.f4408d = (String) L.h(parcel.readString());
    }
}
