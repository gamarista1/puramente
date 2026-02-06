package I9;

import android.os.Parcel;
import android.os.Parcelable;
import ja.M;
import java.util.Arrays;

public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f31801b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31802c;

    /* renamed from: d  reason: collision with root package name */
    public final String f31803d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f31804e;

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
        this.f31801b = str;
        this.f31802c = str2;
        this.f31803d = str3;
        this.f31804e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (!M.c(this.f31801b, fVar.f31801b) || !M.c(this.f31802c, fVar.f31802c) || !M.c(this.f31803d, fVar.f31803d) || !Arrays.equals(this.f31804e, fVar.f31804e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int i11;
        String str = this.f31801b;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f31802c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f31803d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return ((i14 + i12) * 31) + Arrays.hashCode(this.f31804e);
    }

    public String toString() {
        return this.f31810a + ": mimeType=" + this.f31801b + ", filename=" + this.f31802c + ", description=" + this.f31803d;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f31801b);
        parcel.writeString(this.f31802c);
        parcel.writeString(this.f31803d);
        parcel.writeByteArray(this.f31804e);
    }

    f(Parcel parcel) {
        super("GEOB");
        this.f31801b = (String) M.j(parcel.readString());
        this.f31802c = (String) M.j(parcel.readString());
        this.f31803d = (String) M.j(parcel.readString());
        this.f31804e = (byte[]) M.j(parcel.createByteArray());
    }
}
