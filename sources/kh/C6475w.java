package kh;

import ih.f;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import yf.p;

/* renamed from: kh.w  reason: case insensitive filesystem */
public final class C6475w {

    /* renamed from: e  reason: collision with root package name */
    private static final a f71713e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final long[] f71714f = new long[0];

    /* renamed from: a  reason: collision with root package name */
    private final f f71715a;

    /* renamed from: b  reason: collision with root package name */
    private final p f71716b;

    /* renamed from: c  reason: collision with root package name */
    private long f71717c;

    /* renamed from: d  reason: collision with root package name */
    private final long[] f71718d;

    /* renamed from: kh.w$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C6475w(f fVar, p pVar) {
        C6496s.h(fVar, "descriptor");
        C6496s.h(pVar, "readIfAbsent");
        this.f71715a = fVar;
        this.f71716b = pVar;
        int d10 = fVar.d();
        long j10 = 0;
        if (d10 <= 64) {
            this.f71717c = d10 != 64 ? -1 << d10 : j10;
            this.f71718d = f71714f;
            return;
        }
        this.f71717c = 0;
        this.f71718d = e(d10);
    }

    private final void b(int i10) {
        int i11 = (i10 >>> 6) - 1;
        long[] jArr = this.f71718d;
        jArr[i11] = jArr[i11] | (1 << (i10 & 63));
    }

    private final int c() {
        int length = this.f71718d.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = i11 * 64;
            long j10 = this.f71718d[i10];
            while (j10 != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                j10 |= 1 << numberOfTrailingZeros;
                int i13 = numberOfTrailingZeros + i12;
                if (((Boolean) this.f71716b.invoke(this.f71715a, Integer.valueOf(i13))).booleanValue()) {
                    this.f71718d[i10] = j10;
                    return i13;
                }
            }
            this.f71718d[i10] = j10;
            i10 = i11;
        }
        return -1;
    }

    private final long[] e(int i10) {
        long[] jArr = new long[((i10 - 1) >>> 6)];
        if ((i10 & 63) != 0) {
            jArr[C6559l.i0(jArr)] = -1 << i10;
        }
        return jArr;
    }

    public final void a(int i10) {
        if (i10 < 64) {
            this.f71717c |= 1 << i10;
        } else {
            b(i10);
        }
    }

    public final int d() {
        int numberOfTrailingZeros;
        int d10 = this.f71715a.d();
        do {
            long j10 = this.f71717c;
            if (j10 != -1) {
                numberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                this.f71717c |= 1 << numberOfTrailingZeros;
            } else if (d10 > 64) {
                return c();
            } else {
                return -1;
            }
        } while (!((Boolean) this.f71716b.invoke(this.f71715a, Integer.valueOf(numberOfTrailingZeros))).booleanValue());
        return numberOfTrailingZeros;
    }
}
