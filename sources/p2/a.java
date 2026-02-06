package P2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.C2073A;
import i2.L;

public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0129a();

    /* renamed from: a  reason: collision with root package name */
    public final long f5004a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5005b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f5006c;

    /* renamed from: P2.a$a  reason: collision with other inner class name */
    class C0129a implements Parcelable.Creator {
        C0129a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0129a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C0129a aVar) {
        this(parcel);
    }

    static a a(C2073A a10, int i10, long j10) {
        long J10 = a10.J();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        a10.l(bArr, 0, i11);
        return new a(J10, bArr, j10);
    }

    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f5004a + ", identifier= " + this.f5005b + " }";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f5004a);
        parcel.writeLong(this.f5005b);
        parcel.writeByteArray(this.f5006c);
    }

    private a(long j10, byte[] bArr, long j11) {
        this.f5004a = j11;
        this.f5005b = j10;
        this.f5006c = bArr;
    }

    private a(Parcel parcel) {
        this.f5004a = parcel.readLong();
        this.f5005b = parcel.readLong();
        this.f5006c = (byte[]) L.h(parcel.createByteArray());
    }
}
