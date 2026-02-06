package G9;

import D9.a;
import android.os.Parcel;
import android.os.Parcelable;
import ja.B;
import ja.M;
import java.util.Arrays;
import k9.D0;
import nb.C5110e;

public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0517a();

    /* renamed from: a  reason: collision with root package name */
    public final int f31628a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31629b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31630c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31631d;

    /* renamed from: e  reason: collision with root package name */
    public final int f31632e;

    /* renamed from: f  reason: collision with root package name */
    public final int f31633f;

    /* renamed from: g  reason: collision with root package name */
    public final int f31634g;

    /* renamed from: h  reason: collision with root package name */
    public final byte[] f31635h;

    /* renamed from: G9.a$a  reason: collision with other inner class name */
    class C0517a implements Parcelable.Creator {
        C0517a() {
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
        this.f31628a = i10;
        this.f31629b = str;
        this.f31630c = str2;
        this.f31631d = i11;
        this.f31632e = i12;
        this.f31633f = i13;
        this.f31634g = i14;
        this.f31635h = bArr;
    }

    public static a a(B b10) {
        int n10 = b10.n();
        String B10 = b10.B(b10.n(), C5110e.f61083a);
        String A10 = b10.A(b10.n());
        int n11 = b10.n();
        int n12 = b10.n();
        int n13 = b10.n();
        int n14 = b10.n();
        int n15 = b10.n();
        byte[] bArr = new byte[n15];
        b10.j(bArr, 0, n15);
        return new a(n10, B10, A10, n11, n12, n13, n14, bArr);
    }

    public void E(D0.b bVar) {
        bVar.G(this.f31635h, this.f31628a);
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
        if (this.f31628a == aVar.f31628a && this.f31629b.equals(aVar.f31629b) && this.f31630c.equals(aVar.f31630c) && this.f31631d == aVar.f31631d && this.f31632e == aVar.f31632e && this.f31633f == aVar.f31633f && this.f31634g == aVar.f31634g && Arrays.equals(this.f31635h, aVar.f31635h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f31628a) * 31) + this.f31629b.hashCode()) * 31) + this.f31630c.hashCode()) * 31) + this.f31631d) * 31) + this.f31632e) * 31) + this.f31633f) * 31) + this.f31634g) * 31) + Arrays.hashCode(this.f31635h);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f31629b + ", description=" + this.f31630c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f31628a);
        parcel.writeString(this.f31629b);
        parcel.writeString(this.f31630c);
        parcel.writeInt(this.f31631d);
        parcel.writeInt(this.f31632e);
        parcel.writeInt(this.f31633f);
        parcel.writeInt(this.f31634g);
        parcel.writeByteArray(this.f31635h);
    }

    a(Parcel parcel) {
        this.f31628a = parcel.readInt();
        this.f31629b = (String) M.j(parcel.readString());
        this.f31630c = (String) M.j(parcel.readString());
        this.f31631d = parcel.readInt();
        this.f31632e = parcel.readInt();
        this.f31633f = parcel.readInt();
        this.f31634g = parcel.readInt();
        this.f31635h = (byte[]) M.j(parcel.createByteArray());
    }
}
