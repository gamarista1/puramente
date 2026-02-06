package I9;

import android.os.Parcel;
import android.os.Parcelable;
import ja.M;
import java.util.Arrays;
import k9.D0;

public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new C0523a();

    /* renamed from: b  reason: collision with root package name */
    public final String f31782b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31783c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31784d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f31785e;

    /* renamed from: I9.a$a  reason: collision with other inner class name */
    class C0523a implements Parcelable.Creator {
        C0523a() {
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
        this.f31782b = str;
        this.f31783c = str2;
        this.f31784d = i10;
        this.f31785e = bArr;
    }

    public void E(D0.b bVar) {
        bVar.G(this.f31785e, this.f31784d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f31784d != aVar.f31784d || !M.c(this.f31782b, aVar.f31782b) || !M.c(this.f31783c, aVar.f31783c) || !Arrays.equals(this.f31785e, aVar.f31785e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int i11 = (527 + this.f31784d) * 31;
        String str = this.f31782b;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.f31783c;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return ((i13 + i12) * 31) + Arrays.hashCode(this.f31785e);
    }

    public String toString() {
        return this.f31810a + ": mimeType=" + this.f31782b + ", description=" + this.f31783c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f31782b);
        parcel.writeString(this.f31783c);
        parcel.writeInt(this.f31784d);
        parcel.writeByteArray(this.f31785e);
    }

    a(Parcel parcel) {
        super("APIC");
        this.f31782b = (String) M.j(parcel.readString());
        this.f31783c = parcel.readString();
        this.f31784d = parcel.readInt();
        this.f31785e = (byte[]) M.j(parcel.createByteArray());
    }
}
