package r0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6508G;
import lf.C6516O;
import s0.C2581c;
import s0.C2582d;
import s0.C2585g;

/* renamed from: r0.x0  reason: case insensitive filesystem */
public final class C2544x0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f25560b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f25561c = C2550z0.d(4278190080L);

    /* renamed from: d  reason: collision with root package name */
    private static final long f25562d = C2550z0.d(4282664004L);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final long f25563e = C2550z0.d(4287137928L);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final long f25564f = C2550z0.d(4291611852L);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final long f25565g = C2550z0.d(4294967295L);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final long f25566h = C2550z0.d(4294901760L);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final long f25567i = C2550z0.d(4278255360L);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final long f25568j = C2550z0.d(4278190335L);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final long f25569k = C2550z0.d(4294967040L);

    /* renamed from: l  reason: collision with root package name */
    private static final long f25570l = C2550z0.d(4278255615L);

    /* renamed from: m  reason: collision with root package name */
    private static final long f25571m = C2550z0.d(4294902015L);
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final long f25572n = C2550z0.b(0);
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final long f25573o = C2550z0.a(0.0f, 0.0f, 0.0f, 0.0f, C2585g.f25794a.y());

    /* renamed from: a  reason: collision with root package name */
    private final long f25574a;

    /* renamed from: r0.x0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return C2544x0.f25561c;
        }

        public final long b() {
            return C2544x0.f25568j;
        }

        public final long c() {
            return C2544x0.f25563e;
        }

        public final long d() {
            return C2544x0.f25567i;
        }

        public final long e() {
            return C2544x0.f25564f;
        }

        public final long f() {
            return C2544x0.f25566h;
        }

        public final long g() {
            return C2544x0.f25572n;
        }

        public final long h() {
            return C2544x0.f25573o;
        }

        public final long i() {
            return C2544x0.f25565g;
        }

        public final long j() {
            return C2544x0.f25569k;
        }

        private a() {
        }
    }

    private /* synthetic */ C2544x0(long j10) {
        this.f25574a = j10;
    }

    public static final /* synthetic */ C2544x0 k(long j10) {
        return new C2544x0(j10);
    }

    public static final long m(long j10, C2581c cVar) {
        return C2582d.i(t(j10), cVar, 0, 2, (Object) null).a(j10);
    }

    public static final long n(long j10, float f10, float f11, float f12, float f13) {
        return C2550z0.a(f11, f12, f13, f10, t(j10));
    }

    public static /* synthetic */ long o(long j10, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = r(j10);
        }
        float f14 = f10;
        if ((i10 & 2) != 0) {
            f11 = v(j10);
        }
        float f15 = f11;
        if ((i10 & 4) != 0) {
            f12 = u(j10);
        }
        float f16 = f12;
        if ((i10 & 8) != 0) {
            f13 = s(j10);
        }
        return n(j10, f14, f15, f16, f13);
    }

    public static boolean p(long j10, Object obj) {
        if ((obj instanceof C2544x0) && j10 == ((C2544x0) obj).y()) {
            return true;
        }
        return false;
    }

    public static final boolean q(long j10, long j11) {
        return C6508G.e(j10, j11);
    }

    public static final float r(long j10) {
        float c10;
        float f10;
        if (C6508G.b(63 & j10) == 0) {
            c10 = (float) C6516O.c(C6508G.b(C6508G.b(j10 >>> 56) & 255));
            f10 = 255.0f;
        } else {
            c10 = (float) C6516O.c(C6508G.b(C6508G.b(j10 >>> 6) & 1023));
            f10 = 1023.0f;
        }
        return c10 / f10;
    }

    public static final float s(long j10) {
        int i10;
        int i11;
        int i12;
        if (C6508G.b(63 & j10) == 0) {
            return ((float) C6516O.c(C6508G.b(C6508G.b(j10 >>> 32) & 255))) / 255.0f;
        }
        short b10 = (short) ((int) C6508G.b(C6508G.b(j10 >>> 16) & 65535));
        short s10 = 32768 & b10;
        int i13 = ((65535 & b10) >>> 10) & 31;
        short s11 = b10 & 1023;
        if (i13 != 0) {
            int i14 = s11 << 13;
            if (i13 == 31) {
                i12 = 255;
                if (i14 != 0) {
                    i14 |= 4194304;
                }
            } else {
                i12 = i13 + 112;
            }
            int i15 = i12;
            i10 = i14;
            i11 = i15;
        } else if (s11 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(s11 + 1056964608) - E1.f25416c;
            if (s10 == 0) {
                return intBitsToFloat;
            }
            return -intBitsToFloat;
        } else {
            i11 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i11 << 23) | (s10 << 16) | i10);
    }

    public static final C2581c t(long j10) {
        return C2585g.f25794a.l()[(int) C6508G.b(j10 & 63)];
    }

    public static final float u(long j10) {
        int i10;
        int i11;
        int i12;
        if (C6508G.b(63 & j10) == 0) {
            return ((float) C6516O.c(C6508G.b(C6508G.b(j10 >>> 40) & 255))) / 255.0f;
        }
        short b10 = (short) ((int) C6508G.b(C6508G.b(j10 >>> 32) & 65535));
        short s10 = 32768 & b10;
        int i13 = ((65535 & b10) >>> 10) & 31;
        short s11 = b10 & 1023;
        if (i13 != 0) {
            int i14 = s11 << 13;
            if (i13 == 31) {
                i12 = 255;
                if (i14 != 0) {
                    i14 |= 4194304;
                }
            } else {
                i12 = i13 + 112;
            }
            int i15 = i12;
            i10 = i14;
            i11 = i15;
        } else if (s11 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(s11 + 1056964608) - E1.f25416c;
            if (s10 == 0) {
                return intBitsToFloat;
            }
            return -intBitsToFloat;
        } else {
            i11 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i11 << 23) | (s10 << 16) | i10);
    }

    public static final float v(long j10) {
        int i10;
        int i11;
        int i12;
        if (C6508G.b(63 & j10) == 0) {
            return ((float) C6516O.c(C6508G.b(C6508G.b(j10 >>> 48) & 255))) / 255.0f;
        }
        short b10 = (short) ((int) C6508G.b(C6508G.b(j10 >>> 48) & 65535));
        short s10 = 32768 & b10;
        int i13 = ((65535 & b10) >>> 10) & 31;
        short s11 = b10 & 1023;
        if (i13 != 0) {
            int i14 = s11 << 13;
            if (i13 == 31) {
                i12 = 255;
                if (i14 != 0) {
                    i14 |= 4194304;
                }
            } else {
                i12 = i13 + 112;
            }
            int i15 = i12;
            i10 = i14;
            i11 = i15;
        } else if (s11 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(s11 + 1056964608) - E1.f25416c;
            if (s10 == 0) {
                return intBitsToFloat;
            }
            return -intBitsToFloat;
        } else {
            i11 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i11 << 23) | (s10 << 16) | i10);
    }

    public static int w(long j10) {
        return C6508G.f(j10);
    }

    public static String x(long j10) {
        return "Color(" + v(j10) + ", " + u(j10) + ", " + s(j10) + ", " + r(j10) + ", " + t(j10).f() + ')';
    }

    public boolean equals(Object obj) {
        return p(this.f25574a, obj);
    }

    public int hashCode() {
        return w(this.f25574a);
    }

    public String toString() {
        return x(this.f25574a);
    }

    public final /* synthetic */ long y() {
        return this.f25574a;
    }

    public static long l(long j10) {
        return j10;
    }
}
