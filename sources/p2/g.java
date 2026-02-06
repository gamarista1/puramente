package P2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.C2073A;
import i2.G;

public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f5040a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5041b;

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

    static g a(C2073A a10, long j10, G g10) {
        long b10 = b(a10, j10);
        return new g(b10, g10.b(b10));
    }

    static long b(C2073A a10, long j10) {
        long H10 = (long) a10.H();
        if ((128 & H10) != 0) {
            return 8589934591L & ((((H10 & 1) << 32) | a10.J()) + j10);
        }
        return -9223372036854775807L;
    }

    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f5040a + ", playbackPositionUs= " + this.f5041b + " }";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f5040a);
        parcel.writeLong(this.f5041b);
    }

    private g(long j10, long j11) {
        this.f5040a = j10;
        this.f5041b = j11;
    }
}
