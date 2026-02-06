package K9;

import android.os.Parcel;
import android.os.Parcelable;
import ja.B;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class f extends b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List f32489a;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, (a) null);
        }

        /* renamed from: b */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f32490a;

        /* renamed from: b  reason: collision with root package name */
        public final long f32491b;

        /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        /* access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* access modifiers changed from: private */
        public void d(Parcel parcel) {
            parcel.writeInt(this.f32490a);
            parcel.writeLong(this.f32491b);
        }

        private b(int i10, long j10) {
            this.f32490a = i10;
            this.f32491b = j10;
        }
    }

    /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    static f a(B b10) {
        int D10 = b10.D();
        ArrayList arrayList = new ArrayList(D10);
        for (int i10 = 0; i10 < D10; i10++) {
            arrayList.add(c.e(b10));
        }
        return new f((List) arrayList);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f32489a.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            ((c) this.f32489a.get(i11)).f(parcel);
        }
    }

    private f(List list) {
        this.f32489a = Collections.unmodifiableList(list);
    }

    private f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(c.d(parcel));
        }
        this.f32489a = Collections.unmodifiableList(arrayList);
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f32492a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f32493b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f32494c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f32495d;

        /* renamed from: e  reason: collision with root package name */
        public final long f32496e;

        /* renamed from: f  reason: collision with root package name */
        public final List f32497f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f32498g;

        /* renamed from: h  reason: collision with root package name */
        public final long f32499h;

        /* renamed from: i  reason: collision with root package name */
        public final int f32500i;

        /* renamed from: j  reason: collision with root package name */
        public final int f32501j;

        /* renamed from: k  reason: collision with root package name */
        public final int f32502k;

        private c(long j10, boolean z10, boolean z11, boolean z12, List list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f32492a = j10;
            this.f32493b = z10;
            this.f32494c = z11;
            this.f32495d = z12;
            this.f32497f = Collections.unmodifiableList(list);
            this.f32496e = j11;
            this.f32498g = z13;
            this.f32499h = j12;
            this.f32500i = i10;
            this.f32501j = i11;
            this.f32502k = i12;
        }

        /* access modifiers changed from: private */
        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        /* access modifiers changed from: private */
        public static c e(B b10) {
            boolean z10;
            boolean z11;
            int i10;
            int i11;
            int i12;
            long j10;
            boolean z12;
            long j11;
            ArrayList arrayList;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            long j12;
            long j13;
            boolean z17;
            boolean z18;
            long F10 = b10.F();
            if ((b10.D() & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (!z10) {
                int D10 = b10.D();
                if ((D10 & 128) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((D10 & 64) != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((D10 & 32) != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z15) {
                    j12 = b10.F();
                } else {
                    j12 = -9223372036854775807L;
                }
                if (!z15) {
                    int D11 = b10.D();
                    ArrayList arrayList3 = new ArrayList(D11);
                    for (int i13 = 0; i13 < D11; i13++) {
                        arrayList3.add(new b(b10.D(), b10.F(), (a) null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z16) {
                    long D12 = (long) b10.D();
                    if ((128 & D12) != 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    j13 = ((((D12 & 1) << 32) | b10.F()) * 1000) / 90;
                    z17 = z18;
                } else {
                    z17 = false;
                    j13 = -9223372036854775807L;
                }
                int J10 = b10.J();
                int D13 = b10.D();
                z11 = z15;
                i10 = b10.D();
                j10 = j13;
                arrayList = arrayList2;
                long j14 = j12;
                i12 = J10;
                i11 = D13;
                j11 = j14;
                boolean z19 = z14;
                z12 = z17;
                z13 = z19;
            } else {
                arrayList = arrayList2;
                z13 = false;
                j11 = -9223372036854775807L;
                z12 = false;
                j10 = -9223372036854775807L;
                i12 = 0;
                i11 = 0;
                i10 = 0;
                z11 = false;
            }
            return new c(F10, z10, z13, z11, arrayList, j11, z12, j10, i12, i11, i10);
        }

        /* access modifiers changed from: private */
        public void f(Parcel parcel) {
            parcel.writeLong(this.f32492a);
            parcel.writeByte(this.f32493b ? (byte) 1 : 0);
            parcel.writeByte(this.f32494c ? (byte) 1 : 0);
            parcel.writeByte(this.f32495d ? (byte) 1 : 0);
            int size = this.f32497f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                ((b) this.f32497f.get(i10)).d(parcel);
            }
            parcel.writeLong(this.f32496e);
            parcel.writeByte(this.f32498g ? (byte) 1 : 0);
            parcel.writeLong(this.f32499h);
            parcel.writeInt(this.f32500i);
            parcel.writeInt(this.f32501j);
            parcel.writeInt(this.f32502k);
        }

        private c(Parcel parcel) {
            this.f32492a = parcel.readLong();
            boolean z10 = false;
            this.f32493b = parcel.readByte() == 1;
            this.f32494c = parcel.readByte() == 1;
            this.f32495d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(b.c(parcel));
            }
            this.f32497f = Collections.unmodifiableList(arrayList);
            this.f32496e = parcel.readLong();
            this.f32498g = parcel.readByte() == 1 ? true : z10;
            this.f32499h = parcel.readLong();
            this.f32500i = parcel.readInt();
            this.f32501j = parcel.readInt();
            this.f32502k = parcel.readInt();
        }
    }
}
