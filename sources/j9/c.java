package J9;

import D9.a;
import android.os.Parcel;
import android.os.Parcelable;
import ja.C3645a;
import ja.M;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import nb.k;

public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List f32221a;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new c(arrayList);
        }

        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public static final Comparator f32222d = new d();

        /* renamed from: a  reason: collision with root package name */
        public final long f32223a;

        /* renamed from: b  reason: collision with root package name */
        public final long f32224b;

        /* renamed from: c  reason: collision with root package name */
        public final int f32225c;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            /* renamed from: b */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(long j10, long j11, int i10) {
            boolean z10;
            if (j10 < j11) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3645a.a(z10);
            this.f32223a = j10;
            this.f32224b = j11;
            this.f32225c = i10;
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
            if (this.f32223a == bVar.f32223a && this.f32224b == bVar.f32224b && this.f32225c == bVar.f32225c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return k.b(Long.valueOf(this.f32223a), Long.valueOf(this.f32224b), Integer.valueOf(this.f32225c));
        }

        public String toString() {
            return M.C("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f32223a), Long.valueOf(this.f32224b), Integer.valueOf(this.f32225c));
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f32223a);
            parcel.writeLong(this.f32224b);
            parcel.writeInt(this.f32225c);
        }
    }

    public c(List list) {
        this.f32221a = list;
        C3645a.a(!a(list));
    }

    private static boolean a(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = ((b) list.get(0)).f32224b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (((b) list.get(i10)).f32223a < j10) {
                return true;
            }
            j10 = ((b) list.get(i10)).f32224b;
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f32221a.equals(((c) obj).f32221a);
    }

    public int hashCode() {
        return this.f32221a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f32221a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f32221a);
    }
}
