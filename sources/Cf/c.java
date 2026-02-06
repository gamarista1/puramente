package Cf;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tf.C6728b;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62630a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final c f62631b = C6728b.f73552a.b();

    public static final class a extends c implements Serializable {

        /* renamed from: Cf.c$a$a  reason: collision with other inner class name */
        private static final class C0926a implements Serializable {

            /* renamed from: a  reason: collision with root package name */
            public static final C0926a f62632a = new C0926a();
            private static final long serialVersionUID = 0;

            private C0926a() {
            }

            private final Object readResolve() {
                return c.f62630a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object writeReplace() {
            return C0926a.f62632a;
        }

        public int b(int i10) {
            return c.f62631b.b(i10);
        }

        public double c() {
            return c.f62631b.c();
        }

        public int d() {
            return c.f62631b.d();
        }

        public int e(int i10) {
            return c.f62631b.e(i10);
        }

        public int f(int i10, int i11) {
            return c.f62631b.f(i10, i11);
        }

        public long g() {
            return c.f62631b.g();
        }

        public long h(long j10, long j11) {
            return c.f62631b.h(j10, j11);
        }

        private a() {
        }
    }

    public abstract int b(int i10);

    public abstract double c();

    public abstract int d();

    public abstract int e(int i10);

    public int f(int i10, int i11) {
        int i12;
        int d10;
        int i13;
        d.b(i10, i11);
        int i14 = i11 - i10;
        if (i14 > 0 || i14 == Integer.MIN_VALUE) {
            if (((-i14) & i14) == i14) {
                i12 = b(d.d(i14));
            } else {
                do {
                    d10 = d() >>> 1;
                    i13 = d10 % i14;
                } while ((d10 - i13) + (i14 - 1) < 0);
                i12 = i13;
            }
            return i10 + i12;
        }
        while (true) {
            int d11 = d();
            if (i10 <= d11 && d11 < i11) {
                return d11;
            }
        }
    }

    public abstract long g();

    public long h(long j10, long j11) {
        long j12;
        long g10;
        long j13;
        int d10;
        d.c(j10, j11);
        long j14 = j11 - j10;
        if (j14 > 0) {
            if (((-j14) & j14) == j14) {
                int i10 = (int) j14;
                int i11 = (int) (j14 >>> 32);
                if (i10 != 0) {
                    d10 = b(d.d(i10));
                } else if (i11 == 1) {
                    d10 = d();
                } else {
                    j12 = (((long) b(d.d(i11))) << 32) + (((long) d()) & 4294967295L);
                }
                j12 = ((long) d10) & 4294967295L;
            } else {
                do {
                    g10 = g() >>> 1;
                    j13 = g10 % j14;
                } while ((g10 - j13) + (j14 - 1) < 0);
                j12 = j13;
            }
            return j10 + j12;
        }
        while (true) {
            long g11 = g();
            if (j10 <= g11 && g11 < j11) {
                return g11;
            }
        }
    }
}
