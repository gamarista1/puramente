package M2;

import android.os.Parcel;
import android.os.Parcelable;
import f2.y;
import f2.z;
import i2.C2076a;
import java.util.Arrays;

public final class c implements z.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f4310a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4311b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4312c;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(byte[] bArr, String str, String str2) {
        this.f4310a = bArr;
        this.f4311b = str;
        this.f4312c = str2;
    }

    public void P(y.b bVar) {
        String str = this.f4311b;
        if (str != null) {
            bVar.n0(str);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f4310a, ((c) obj).f4310a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f4310a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", new Object[]{this.f4311b, this.f4312c, Integer.valueOf(this.f4310a.length)});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f4310a);
        parcel.writeString(this.f4311b);
        parcel.writeString(this.f4312c);
    }

    c(Parcel parcel) {
        this.f4310a = (byte[]) C2076a.e(parcel.createByteArray());
        this.f4311b = parcel.readString();
        this.f4312c = parcel.readString();
    }
}
