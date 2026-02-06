package Ac;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private long f50257a;

    /* renamed from: b  reason: collision with root package name */
    private long f50258b;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel, (a) null);
        }

        /* renamed from: b */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    /* synthetic */ l(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static long a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public static l f(long j10) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j10);
        return new l(h() + (micros - a()), micros);
    }

    private static long h() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public long b() {
        return this.f50257a + c();
    }

    public long c() {
        return d(new l());
    }

    public long d(l lVar) {
        return lVar.f50258b - this.f50258b;
    }

    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.f50257a;
    }

    public void g() {
        this.f50257a = h();
        this.f50258b = a();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f50257a);
        parcel.writeLong(this.f50258b);
    }

    public l() {
        this(h(), a());
    }

    l(long j10, long j11) {
        this.f50257a = j10;
        this.f50258b = j11;
    }

    private l(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }
}
