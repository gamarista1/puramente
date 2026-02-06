package L2;

import android.os.Parcel;
import android.os.Parcelable;
import f2.C1960A;
import f2.y;
import f2.z;
import i2.C2073A;
import i2.L;
import java.util.Arrays;
import nb.C5110e;

public final class a implements z.b {
    public static final Parcelable.Creator<a> CREATOR = new C0096a();

    /* renamed from: a  reason: collision with root package name */
    public final int f4141a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4142b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4143c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4144d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4145e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4146f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4147g;

    /* renamed from: h  reason: collision with root package name */
    public final byte[] f4148h;

    /* renamed from: L2.a$a  reason: collision with other inner class name */
    class C0096a implements Parcelable.Creator {
        C0096a() {
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

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f4141a = i10;
        this.f4142b = str;
        this.f4143c = str2;
        this.f4144d = i11;
        this.f4145e = i12;
        this.f4146f = i13;
        this.f4147g = i14;
        this.f4148h = bArr;
    }

    public static a a(C2073A a10) {
        int q10 = a10.q();
        String p10 = C1960A.p(a10.F(a10.q(), C5110e.f61083a));
        String E10 = a10.E(a10.q());
        int q11 = a10.q();
        int q12 = a10.q();
        int q13 = a10.q();
        int q14 = a10.q();
        int q15 = a10.q();
        byte[] bArr = new byte[q15];
        a10.l(bArr, 0, q15);
        return new a(q10, p10, E10, q11, q12, q13, q14, bArr);
    }

    public void P(y.b bVar) {
        bVar.J(this.f4148h, this.f4141a);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f4141a == aVar.f4141a && this.f4142b.equals(aVar.f4142b) && this.f4143c.equals(aVar.f4143c) && this.f4144d == aVar.f4144d && this.f4145e == aVar.f4145e && this.f4146f == aVar.f4146f && this.f4147g == aVar.f4147g && Arrays.equals(this.f4148h, aVar.f4148h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f4141a) * 31) + this.f4142b.hashCode()) * 31) + this.f4143c.hashCode()) * 31) + this.f4144d) * 31) + this.f4145e) * 31) + this.f4146f) * 31) + this.f4147g) * 31) + Arrays.hashCode(this.f4148h);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f4142b + ", description=" + this.f4143c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4141a);
        parcel.writeString(this.f4142b);
        parcel.writeString(this.f4143c);
        parcel.writeInt(this.f4144d);
        parcel.writeInt(this.f4145e);
        parcel.writeInt(this.f4146f);
        parcel.writeInt(this.f4147g);
        parcel.writeByteArray(this.f4148h);
    }

    a(Parcel parcel) {
        this.f4141a = parcel.readInt();
        this.f4142b = (String) L.h(parcel.readString());
        this.f4143c = (String) L.h(parcel.readString());
        this.f4144d = parcel.readInt();
        this.f4145e = parcel.readInt();
        this.f4146f = parcel.readInt();
        this.f4147g = parcel.readInt();
        this.f4148h = (byte[]) L.h(parcel.createByteArray());
    }
}
