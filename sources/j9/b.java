package J9;

import D9.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.primitives.h;

public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f32216a;

    /* renamed from: b  reason: collision with root package name */
    public final long f32217b;

    /* renamed from: c  reason: collision with root package name */
    public final long f32218c;

    /* renamed from: d  reason: collision with root package name */
    public final long f32219d;

    /* renamed from: e  reason: collision with root package name */
    public final long f32220e;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, (a) null);
        }

        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* synthetic */ b(Parcel parcel, a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f32216a == bVar.f32216a && this.f32217b == bVar.f32217b && this.f32218c == bVar.f32218c && this.f32219d == bVar.f32219d && this.f32220e == bVar.f32220e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + h.b(this.f32216a)) * 31) + h.b(this.f32217b)) * 31) + h.b(this.f32218c)) * 31) + h.b(this.f32219d)) * 31) + h.b(this.f32220e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f32216a + ", photoSize=" + this.f32217b + ", photoPresentationTimestampUs=" + this.f32218c + ", videoStartPosition=" + this.f32219d + ", videoSize=" + this.f32220e;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f32216a);
        parcel.writeLong(this.f32217b);
        parcel.writeLong(this.f32218c);
        parcel.writeLong(this.f32219d);
        parcel.writeLong(this.f32220e);
    }

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f32216a = j10;
        this.f32217b = j11;
        this.f32218c = j12;
        this.f32219d = j13;
        this.f32220e = j14;
    }

    private b(Parcel parcel) {
        this.f32216a = parcel.readLong();
        this.f32217b = parcel.readLong();
        this.f32218c = parcel.readLong();
        this.f32219d = parcel.readLong();
        this.f32220e = parcel.readLong();
    }
}
