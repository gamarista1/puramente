package K9;

import android.os.Parcel;
import android.os.Parcelable;
import ja.B;
import ja.I;

public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f32503a;

    /* renamed from: b  reason: collision with root package name */
    public final long f32504b;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), (a) null);
        }

        /* renamed from: b */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    /* synthetic */ g(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    static g a(B b10, long j10, I i10) {
        long b11 = b(b10, j10);
        return new g(b11, i10.b(b11));
    }

    static long b(B b10, long j10) {
        long D10 = (long) b10.D();
        if ((128 & D10) != 0) {
            return 8589934591L & ((((D10 & 1) << 32) | b10.F()) + j10);
        }
        return -9223372036854775807L;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f32503a);
        parcel.writeLong(this.f32504b);
    }

    private g(long j10, long j11) {
        this.f32503a = j10;
        this.f32504b = j11;
    }
}
