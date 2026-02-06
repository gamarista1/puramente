package N2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.L;

public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f4420b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4421c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4422d;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        /* renamed from: b */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(String str, String str2, String str3) {
        super("----");
        this.f4420b = str;
        this.f4421c = str2;
        this.f4422d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (!L.c(this.f4421c, kVar.f4421c) || !L.c(this.f4420b, kVar.f4420b) || !L.c(this.f4422d, kVar.f4422d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int i11;
        String str = this.f4420b;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f4421c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f4422d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    public String toString() {
        return this.f4418a + ": domain=" + this.f4420b + ", description=" + this.f4421c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4418a);
        parcel.writeString(this.f4420b);
        parcel.writeString(this.f4422d);
    }

    k(Parcel parcel) {
        super("----");
        this.f4420b = (String) L.h(parcel.readString());
        this.f4421c = (String) L.h(parcel.readString());
        this.f4422d = (String) L.h(parcel.readString());
    }
}
