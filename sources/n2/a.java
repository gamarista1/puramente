package N2;

import android.os.Parcel;
import android.os.Parcelable;
import f2.y;
import i2.L;
import java.util.Arrays;

public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new C0110a();

    /* renamed from: b  reason: collision with root package name */
    public final String f4390b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4391c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4392d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f4393e;

    /* renamed from: N2.a$a  reason: collision with other inner class name */
    class C0110a implements Parcelable.Creator {
        C0110a() {
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

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f4390b = str;
        this.f4391c = str2;
        this.f4392d = i10;
        this.f4393e = bArr;
    }

    public void P(y.b bVar) {
        bVar.J(this.f4393e, this.f4392d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f4392d != aVar.f4392d || !L.c(this.f4390b, aVar.f4390b) || !L.c(this.f4391c, aVar.f4391c) || !Arrays.equals(this.f4393e, aVar.f4393e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int i11 = (527 + this.f4392d) * 31;
        String str = this.f4390b;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.f4391c;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return ((i13 + i12) * 31) + Arrays.hashCode(this.f4393e);
    }

    public String toString() {
        return this.f4418a + ": mimeType=" + this.f4390b + ", description=" + this.f4391c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4390b);
        parcel.writeString(this.f4391c);
        parcel.writeInt(this.f4392d);
        parcel.writeByteArray(this.f4393e);
    }

    a(Parcel parcel) {
        super("APIC");
        this.f4390b = (String) L.h(parcel.readString());
        this.f4391c = parcel.readString();
        this.f4392d = parcel.readInt();
        this.f4393e = (byte[]) L.h(parcel.createByteArray());
    }
}
