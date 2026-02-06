package N2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.L;
import java.util.Arrays;

public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f4409b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4410c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4411d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f4412e;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        /* renamed from: b */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f4409b = str;
        this.f4410c = str2;
        this.f4411d = str3;
        this.f4412e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (!L.c(this.f4409b, fVar.f4409b) || !L.c(this.f4410c, fVar.f4410c) || !L.c(this.f4411d, fVar.f4411d) || !Arrays.equals(this.f4412e, fVar.f4412e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int i11;
        String str = this.f4409b;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f4410c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f4411d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return ((i14 + i12) * 31) + Arrays.hashCode(this.f4412e);
    }

    public String toString() {
        return this.f4418a + ": mimeType=" + this.f4409b + ", filename=" + this.f4410c + ", description=" + this.f4411d;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4409b);
        parcel.writeString(this.f4410c);
        parcel.writeString(this.f4411d);
        parcel.writeByteArray(this.f4412e);
    }

    f(Parcel parcel) {
        super("GEOB");
        this.f4409b = (String) L.h(parcel.readString());
        this.f4410c = (String) L.h(parcel.readString());
        this.f4411d = (String) L.h(parcel.readString());
        this.f4412e = (byte[]) L.h(parcel.createByteArray());
    }
}
