package O2;

import android.os.Parcel;
import android.os.Parcelable;
import f2.z;
import i2.C2076a;
import i2.L;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import nb.k;

public final class b implements z.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List f4726a;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, C0117b.class.getClassLoader());
            return new b(arrayList);
        }

        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* renamed from: O2.b$b  reason: collision with other inner class name */
    public static final class C0117b implements Parcelable {
        public static final Parcelable.Creator<C0117b> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public static final Comparator f4727d = new c();

        /* renamed from: a  reason: collision with root package name */
        public final long f4728a;

        /* renamed from: b  reason: collision with root package name */
        public final long f4729b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4730c;

        /* renamed from: O2.b$b$a */
        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public C0117b createFromParcel(Parcel parcel) {
                return new C0117b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            /* renamed from: b */
            public C0117b[] newArray(int i10) {
                return new C0117b[i10];
            }
        }

        public C0117b(long j10, long j11, int i10) {
            boolean z10;
            if (j10 < j11) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2076a.a(z10);
            this.f4728a = j10;
            this.f4729b = j11;
            this.f4730c = i10;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0117b.class != obj.getClass()) {
                return false;
            }
            C0117b bVar = (C0117b) obj;
            if (this.f4728a == bVar.f4728a && this.f4729b == bVar.f4729b && this.f4730c == bVar.f4730c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return k.b(Long.valueOf(this.f4728a), Long.valueOf(this.f4729b), Integer.valueOf(this.f4730c));
        }

        public String toString() {
            return L.F("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f4728a), Long.valueOf(this.f4729b), Integer.valueOf(this.f4730c));
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f4728a);
            parcel.writeLong(this.f4729b);
            parcel.writeInt(this.f4730c);
        }
    }

    public b(List list) {
        this.f4726a = list;
        C2076a.a(!a(list));
    }

    private static boolean a(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = ((C0117b) list.get(0)).f4729b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (((C0117b) list.get(i10)).f4728a < j10) {
                return true;
            }
            j10 = ((C0117b) list.get(i10)).f4729b;
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
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f4726a.equals(((b) obj).f4726a);
    }

    public int hashCode() {
        return this.f4726a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f4726a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f4726a);
    }
}
