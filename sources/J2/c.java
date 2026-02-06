package j2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.primitives.h;
import f2.z;

public final class c implements z.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f22702a;

    /* renamed from: b  reason: collision with root package name */
    public final long f22703b;

    /* renamed from: c  reason: collision with root package name */
    public final long f22704c;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel, (a) null);
        }

        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* synthetic */ c(Parcel parcel, a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f22702a == cVar.f22702a && this.f22703b == cVar.f22703b && this.f22704c == cVar.f22704c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + h.b(this.f22702a)) * 31) + h.b(this.f22703b)) * 31) + h.b(this.f22704c);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f22702a + ", modification time=" + this.f22703b + ", timescale=" + this.f22704c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f22702a);
        parcel.writeLong(this.f22703b);
        parcel.writeLong(this.f22704c);
    }

    public c(long j10, long j11, long j12) {
        this.f22702a = j10;
        this.f22703b = j11;
        this.f22704c = j12;
    }

    private c(Parcel parcel) {
        this.f22702a = parcel.readLong();
        this.f22703b = parcel.readLong();
        this.f22704c = parcel.readLong();
    }
}
