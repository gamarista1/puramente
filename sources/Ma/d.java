package Ma;

import Ma.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import za.C5298a;

public class d extends C5298a {
    public static final Parcelable.Creator<d> CREATOR = new j();

    /* renamed from: a  reason: collision with root package name */
    private final int f52025a;

    /* renamed from: b  reason: collision with root package name */
    private final c f52026b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f52027c;

    /* renamed from: d  reason: collision with root package name */
    private final String f52028d;

    d(int i10, String str, byte[] bArr, String str2) {
        this.f52025a = i10;
        try {
            this.f52026b = c.a(str);
            this.f52027c = bArr;
            this.f52028d = str2;
        } catch (c.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!Arrays.equals(this.f52027c, dVar.f52027c) || this.f52026b != dVar.f52026b) {
            return false;
        }
        String str = this.f52028d;
        if (str == null) {
            if (dVar.f52028d != null) {
                return false;
            }
        } else if (!str.equals(dVar.f52028d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((Arrays.hashCode(this.f52027c) + 31) * 31) + this.f52026b.hashCode();
        String str = this.f52028d;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return (hashCode * 31) + i10;
    }

    public String o0() {
        return this.f52028d;
    }

    public byte[] p0() {
        return this.f52027c;
    }

    public int q0() {
        return this.f52025a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = za.c.a(parcel);
        za.c.t(parcel, 1, q0());
        za.c.D(parcel, 2, this.f52026b.toString(), false);
        za.c.k(parcel, 3, p0(), false);
        za.c.D(parcel, 4, o0(), false);
        za.c.b(parcel, a10);
    }
}
