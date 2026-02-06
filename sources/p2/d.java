package P2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.C2073A;
import i2.G;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f5010a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5011b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5012c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5013d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5014e;

    /* renamed from: f  reason: collision with root package name */
    public final long f5015f;

    /* renamed from: g  reason: collision with root package name */
    public final long f5016g;

    /* renamed from: h  reason: collision with root package name */
    public final List f5017h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f5018i;

    /* renamed from: j  reason: collision with root package name */
    public final long f5019j;

    /* renamed from: k  reason: collision with root package name */
    public final int f5020k;

    /* renamed from: l  reason: collision with root package name */
    public final int f5021l;

    /* renamed from: m  reason: collision with root package name */
    public final int f5022m;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, (a) null);
        }

        /* renamed from: b */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f5023a;

        /* renamed from: b  reason: collision with root package name */
        public final long f5024b;

        /* renamed from: c  reason: collision with root package name */
        public final long f5025c;

        /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f5023a);
            parcel.writeLong(this.f5024b);
            parcel.writeLong(this.f5025c);
        }

        private b(int i10, long j10, long j11) {
            this.f5023a = i10;
            this.f5024b = j10;
            this.f5025c = j11;
        }
    }

    /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    static d a(C2073A a10, long j10, G g10) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        long j11;
        boolean z12;
        List list;
        long j12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        long j13;
        long j14;
        boolean z19;
        boolean z20;
        long j15;
        G g11 = g10;
        long J10 = a10.J();
        if ((a10.H() & 128) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        List emptyList = Collections.emptyList();
        if (!z10) {
            int H10 = a10.H();
            if ((H10 & 128) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((H10 & 64) != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            if ((H10 & 32) != 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            if ((H10 & 16) != 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (!z16 || z18) {
                j13 = -9223372036854775807L;
            } else {
                j13 = g.b(a10, j10);
            }
            if (!z16) {
                int H11 = a10.H();
                ArrayList arrayList = new ArrayList(H11);
                for (int i13 = 0; i13 < H11; i13++) {
                    int H12 = a10.H();
                    if (!z18) {
                        j15 = g.b(a10, j10);
                    } else {
                        j15 = -9223372036854775807L;
                    }
                    arrayList.add(new b(H12, j15, g11.b(j15), (a) null));
                }
                emptyList = arrayList;
            }
            if (z17) {
                long H13 = (long) a10.H();
                if ((128 & H13) != 0) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                j14 = ((((H13 & 1) << 32) | a10.J()) * 1000) / 90;
                z19 = z20;
            } else {
                z19 = false;
                j14 = -9223372036854775807L;
            }
            int N10 = a10.N();
            i12 = N10;
            z11 = z16;
            i11 = a10.H();
            i10 = a10.H();
            list = emptyList;
            long j16 = j13;
            z12 = z19;
            j11 = j14;
            z13 = z18;
            z14 = z15;
            j12 = j16;
        } else {
            list = emptyList;
            z14 = false;
            z13 = false;
            j12 = -9223372036854775807L;
            z12 = false;
            j11 = -9223372036854775807L;
            i12 = 0;
            i11 = 0;
            i10 = 0;
            z11 = false;
        }
        return new d(J10, z10, z14, z11, z13, j12, g11.b(j12), list, z12, j11, i12, i11, i10);
    }

    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f5015f + ", programSplicePlaybackPositionUs= " + this.f5016g + " }";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f5010a);
        parcel.writeByte(this.f5011b ? (byte) 1 : 0);
        parcel.writeByte(this.f5012c ? (byte) 1 : 0);
        parcel.writeByte(this.f5013d ? (byte) 1 : 0);
        parcel.writeByte(this.f5014e ? (byte) 1 : 0);
        parcel.writeLong(this.f5015f);
        parcel.writeLong(this.f5016g);
        int size = this.f5017h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            ((b) this.f5017h.get(i11)).b(parcel);
        }
        parcel.writeByte(this.f5018i ? (byte) 1 : 0);
        parcel.writeLong(this.f5019j);
        parcel.writeInt(this.f5020k);
        parcel.writeInt(this.f5021l);
        parcel.writeInt(this.f5022m);
    }

    private d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f5010a = j10;
        this.f5011b = z10;
        this.f5012c = z11;
        this.f5013d = z12;
        this.f5014e = z13;
        this.f5015f = j11;
        this.f5016g = j12;
        this.f5017h = Collections.unmodifiableList(list);
        this.f5018i = z14;
        this.f5019j = j13;
        this.f5020k = i10;
        this.f5021l = i11;
        this.f5022m = i12;
    }

    private d(Parcel parcel) {
        this.f5010a = parcel.readLong();
        boolean z10 = false;
        this.f5011b = parcel.readByte() == 1;
        this.f5012c = parcel.readByte() == 1;
        this.f5013d = parcel.readByte() == 1;
        this.f5014e = parcel.readByte() == 1;
        this.f5015f = parcel.readLong();
        this.f5016g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(b.a(parcel));
        }
        this.f5017h = Collections.unmodifiableList(arrayList);
        this.f5018i = parcel.readByte() == 1 ? true : z10;
        this.f5019j = parcel.readLong();
        this.f5020k = parcel.readInt();
        this.f5021l = parcel.readInt();
        this.f5022m = parcel.readInt();
    }
}
