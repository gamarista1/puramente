package K9;

import android.os.Parcel;
import android.os.Parcelable;
import ja.B;
import ja.I;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f32473a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f32474b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f32475c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f32476d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f32477e;

    /* renamed from: f  reason: collision with root package name */
    public final long f32478f;

    /* renamed from: g  reason: collision with root package name */
    public final long f32479g;

    /* renamed from: h  reason: collision with root package name */
    public final List f32480h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f32481i;

    /* renamed from: j  reason: collision with root package name */
    public final long f32482j;

    /* renamed from: k  reason: collision with root package name */
    public final int f32483k;

    /* renamed from: l  reason: collision with root package name */
    public final int f32484l;

    /* renamed from: m  reason: collision with root package name */
    public final int f32485m;

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
        public final int f32486a;

        /* renamed from: b  reason: collision with root package name */
        public final long f32487b;

        /* renamed from: c  reason: collision with root package name */
        public final long f32488c;

        /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f32486a);
            parcel.writeLong(this.f32487b);
            parcel.writeLong(this.f32488c);
        }

        private b(int i10, long j10, long j11) {
            this.f32486a = i10;
            this.f32487b = j10;
            this.f32488c = j11;
        }
    }

    /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    static d a(B b10, long j10, I i10) {
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13;
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
        I i14 = i10;
        long F10 = b10.F();
        if ((b10.D() & 128) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        List emptyList = Collections.emptyList();
        if (!z10) {
            int D10 = b10.D();
            if ((D10 & 128) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((D10 & 64) != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            if ((D10 & 32) != 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            if ((D10 & 16) != 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (!z16 || z18) {
                j13 = -9223372036854775807L;
            } else {
                j13 = g.b(b10, j10);
            }
            if (!z16) {
                int D11 = b10.D();
                ArrayList arrayList = new ArrayList(D11);
                for (int i15 = 0; i15 < D11; i15++) {
                    int D12 = b10.D();
                    if (!z18) {
                        j15 = g.b(b10, j10);
                    } else {
                        j15 = -9223372036854775807L;
                    }
                    arrayList.add(new b(D12, j15, i14.b(j15), (a) null));
                }
                emptyList = arrayList;
            }
            if (z17) {
                long D13 = (long) b10.D();
                if ((128 & D13) != 0) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                j14 = ((((D13 & 1) << 32) | b10.F()) * 1000) / 90;
                z19 = z20;
            } else {
                z19 = false;
                j14 = -9223372036854775807L;
            }
            int J10 = b10.J();
            i13 = J10;
            z11 = z16;
            i12 = b10.D();
            i11 = b10.D();
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
            i13 = 0;
            i12 = 0;
            i11 = 0;
            z11 = false;
        }
        return new d(F10, z10, z14, z11, z13, j12, i14.b(j12), list, z12, j11, i13, i12, i11);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f32473a);
        parcel.writeByte(this.f32474b ? (byte) 1 : 0);
        parcel.writeByte(this.f32475c ? (byte) 1 : 0);
        parcel.writeByte(this.f32476d ? (byte) 1 : 0);
        parcel.writeByte(this.f32477e ? (byte) 1 : 0);
        parcel.writeLong(this.f32478f);
        parcel.writeLong(this.f32479g);
        int size = this.f32480h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            ((b) this.f32480h.get(i11)).b(parcel);
        }
        parcel.writeByte(this.f32481i ? (byte) 1 : 0);
        parcel.writeLong(this.f32482j);
        parcel.writeInt(this.f32483k);
        parcel.writeInt(this.f32484l);
        parcel.writeInt(this.f32485m);
    }

    private d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f32473a = j10;
        this.f32474b = z10;
        this.f32475c = z11;
        this.f32476d = z12;
        this.f32477e = z13;
        this.f32478f = j11;
        this.f32479g = j12;
        this.f32480h = Collections.unmodifiableList(list);
        this.f32481i = z14;
        this.f32482j = j13;
        this.f32483k = i10;
        this.f32484l = i11;
        this.f32485m = i12;
    }

    private d(Parcel parcel) {
        this.f32473a = parcel.readLong();
        boolean z10 = false;
        this.f32474b = parcel.readByte() == 1;
        this.f32475c = parcel.readByte() == 1;
        this.f32476d = parcel.readByte() == 1;
        this.f32477e = parcel.readByte() == 1;
        this.f32478f = parcel.readLong();
        this.f32479g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(b.a(parcel));
        }
        this.f32480h = Collections.unmodifiableList(arrayList);
        this.f32481i = parcel.readByte() == 1 ? true : z10;
        this.f32482j = parcel.readLong();
        this.f32483k = parcel.readInt();
        this.f32484l = parcel.readInt();
        this.f32485m = parcel.readInt();
    }
}
