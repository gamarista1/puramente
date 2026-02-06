package O2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.primitives.h;
import f2.z;

public final class a implements z.b {
    public static final Parcelable.Creator<a> CREATOR = new C0116a();

    /* renamed from: a  reason: collision with root package name */
    public final long f4721a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4722b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4723c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4724d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4725e;

    /* renamed from: O2.a$a  reason: collision with other inner class name */
    class C0116a implements Parcelable.Creator {
        C0116a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0116a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C0116a aVar) {
        this(parcel);
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
        if (this.f4721a == aVar.f4721a && this.f4722b == aVar.f4722b && this.f4723c == aVar.f4723c && this.f4724d == aVar.f4724d && this.f4725e == aVar.f4725e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + h.b(this.f4721a)) * 31) + h.b(this.f4722b)) * 31) + h.b(this.f4723c)) * 31) + h.b(this.f4724d)) * 31) + h.b(this.f4725e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f4721a + ", photoSize=" + this.f4722b + ", photoPresentationTimestampUs=" + this.f4723c + ", videoStartPosition=" + this.f4724d + ", videoSize=" + this.f4725e;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f4721a);
        parcel.writeLong(this.f4722b);
        parcel.writeLong(this.f4723c);
        parcel.writeLong(this.f4724d);
        parcel.writeLong(this.f4725e);
    }

    public a(long j10, long j11, long j12, long j13, long j14) {
        this.f4721a = j10;
        this.f4722b = j11;
        this.f4723c = j12;
        this.f4724d = j13;
        this.f4725e = j14;
    }

    private a(Parcel parcel) {
        this.f4721a = parcel.readLong();
        this.f4722b = parcel.readLong();
        this.f4723c = parcel.readLong();
        this.f4724d = parcel.readLong();
        this.f4725e = parcel.readLong();
    }
}
