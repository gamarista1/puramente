package K9;

import android.os.Parcel;
import android.os.Parcelable;
import ja.B;
import ja.M;

public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0531a();

    /* renamed from: a  reason: collision with root package name */
    public final long f32467a;

    /* renamed from: b  reason: collision with root package name */
    public final long f32468b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f32469c;

    /* renamed from: K9.a$a  reason: collision with other inner class name */
    class C0531a implements Parcelable.Creator {
        C0531a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0531a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C0531a aVar) {
        this(parcel);
    }

    static a a(B b10, int i10, long j10) {
        long F10 = b10.F();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        b10.j(bArr, 0, i11);
        return new a(F10, bArr, j10);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f32467a);
        parcel.writeLong(this.f32468b);
        parcel.writeByteArray(this.f32469c);
    }

    private a(long j10, byte[] bArr, long j11) {
        this.f32467a = j11;
        this.f32468b = j10;
        this.f32469c = bArr;
    }

    private a(Parcel parcel) {
        this.f32467a = parcel.readLong();
        this.f32468b = parcel.readLong();
        this.f32469c = (byte[]) M.j(parcel.createByteArray());
    }
}
