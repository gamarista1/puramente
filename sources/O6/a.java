package O6;

import O6.c;
import c6.C3180c;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;

public final class a implements c.b {

    /* renamed from: b  reason: collision with root package name */
    public static final C0545a f33355b = new C0545a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f33356c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f33357d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f33358e;

    /* renamed from: f  reason: collision with root package name */
    private static final int f33359f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f33360g = f.a("GIF87a");
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f33361h = f.a("GIF89a");
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f33362i;

    /* renamed from: j  reason: collision with root package name */
    private static final int f33363j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final byte[] f33364k;

    /* renamed from: l  reason: collision with root package name */
    private static final int f33365l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final byte[] f33366m = f.a("ftyp");
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final byte[][] f33367n = {f.a("heic"), f.a("heix"), f.a("hevc"), f.a("hevx"), f.a("mif1"), f.a("msf1")};
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final byte[] f33368o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final byte[] f33369p = {77, 77, 0, 42};
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static final int f33370q;

    /* renamed from: a  reason: collision with root package name */
    private final int f33371a;

    /* renamed from: O6.a$a  reason: collision with other inner class name */
    public static final class C0545a {
        public /* synthetic */ C0545a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final c i(byte[] bArr, int i10) {
            if (!C3180c.h(bArr, 0, i10)) {
                throw new IllegalStateException("Check failed.");
            } else if (C3180c.g(bArr, 0)) {
                return b.f33378g;
            } else {
                if (C3180c.f(bArr, 0)) {
                    return b.f33379h;
                }
                if (!C3180c.c(bArr, 0, i10)) {
                    return c.f33387d;
                }
                if (C3180c.b(bArr, 0)) {
                    return b.f33382k;
                }
                if (C3180c.d(bArr, 0)) {
                    return b.f33381j;
                }
                return b.f33380i;
            }
        }

        /* access modifiers changed from: private */
        public final boolean j(byte[] bArr, int i10) {
            if (i10 < a.f33362i.length) {
                return false;
            }
            return f.c(bArr, a.f33362i);
        }

        /* access modifiers changed from: private */
        public final boolean k(byte[] bArr, int i10) {
            if (i10 < a.f33370q || (!f.c(bArr, a.f33368o) && !f.c(bArr, a.f33369p))) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: private */
        public final boolean l(byte[] bArr, int i10) {
            if (i10 < 6) {
                return false;
            }
            if (f.c(bArr, a.f33360g) || f.c(bArr, a.f33361h)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        public final boolean m(byte[] bArr, int i10) {
            if (i10 < 12 || bArr[3] < 8 || !f.b(bArr, a.f33366m, 4)) {
                return false;
            }
            for (byte[] b10 : a.f33367n) {
                if (f.b(bArr, b10, 8)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        public final boolean n(byte[] bArr, int i10) {
            if (i10 < a.f33364k.length) {
                return false;
            }
            return f.c(bArr, a.f33364k);
        }

        /* access modifiers changed from: private */
        public final boolean o(byte[] bArr, int i10) {
            if (i10 < a.f33356c.length || !f.c(bArr, a.f33356c)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: private */
        public final boolean p(byte[] bArr, int i10) {
            if (i10 < a.f33358e.length || !f.c(bArr, a.f33358e)) {
                return false;
            }
            return true;
        }

        private C0545a() {
        }
    }

    static {
        byte[] bArr = {-1, -40, -1};
        f33356c = bArr;
        f33357d = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f33358e = bArr2;
        f33359f = bArr2.length;
        byte[] a10 = f.a("BM");
        f33362i = a10;
        f33363j = a10.length;
        byte[] bArr3 = {0, 0, 1, 0};
        f33364k = bArr3;
        f33365l = bArr3.length;
        byte[] bArr4 = {73, 73, 42, 0};
        f33368o = bArr4;
        f33370q = bArr4.length;
    }

    public a() {
        Comparable S02 = C6559l.S0((Comparable[]) new Integer[]{21, 20, Integer.valueOf(f33357d), Integer.valueOf(f33359f), 6, Integer.valueOf(f33363j), Integer.valueOf(f33365l), 12});
        if (S02 != null) {
            this.f33371a = ((Number) S02).intValue();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public c a(byte[] bArr, int i10) {
        C6496s.h(bArr, "headerBytes");
        if (C3180c.h(bArr, 0, i10)) {
            return f33355b.i(bArr, i10);
        }
        C0545a aVar = f33355b;
        if (aVar.o(bArr, i10)) {
            return b.f33373b;
        }
        if (aVar.p(bArr, i10)) {
            return b.f33374c;
        }
        if (aVar.l(bArr, i10)) {
            return b.f33375d;
        }
        if (aVar.j(bArr, i10)) {
            return b.f33376e;
        }
        if (aVar.n(bArr, i10)) {
            return b.f33377f;
        }
        if (aVar.m(bArr, i10)) {
            return b.f33383l;
        }
        if (aVar.k(bArr, i10)) {
            return b.f33384m;
        }
        return c.f33387d;
    }

    public int b() {
        return this.f33371a;
    }
}
