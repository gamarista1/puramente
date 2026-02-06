package com.horcrux.svg;

import java.util.ArrayList;
import java.util.Iterator;

class L {

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList f58765d;

    /* renamed from: e  reason: collision with root package name */
    private static int f58766e;

    /* renamed from: f  reason: collision with root package name */
    private static J f58767f;

    /* renamed from: g  reason: collision with root package name */
    private static J f58768g;

    /* renamed from: h  reason: collision with root package name */
    private static J f58769h;

    /* renamed from: i  reason: collision with root package name */
    private static J f58770i;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f58771j;

    /* renamed from: a  reason: collision with root package name */
    M f58772a;

    /* renamed from: b  reason: collision with root package name */
    J f58773b;

    /* renamed from: c  reason: collision with root package name */
    double f58774c;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f58775a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f58776b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0059 */
        static {
            /*
                com.horcrux.svg.g[] r0 = com.horcrux.svg.C4897g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f58776b = r0
                r1 = 1
                com.horcrux.svg.g r2 = com.horcrux.svg.C4897g.kCGPathElementAddCurveToPoint     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f58776b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.horcrux.svg.g r3 = com.horcrux.svg.C4897g.kCGPathElementAddQuadCurveToPoint     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f58776b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.horcrux.svg.g r4 = com.horcrux.svg.C4897g.kCGPathElementMoveToPoint     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f58776b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.horcrux.svg.g r4 = com.horcrux.svg.C4897g.kCGPathElementAddLineToPoint     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f58776b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.horcrux.svg.g r4 = com.horcrux.svg.C4897g.kCGPathElementCloseSubpath     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                com.horcrux.svg.M[] r3 = com.horcrux.svg.M.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f58775a = r3
                com.horcrux.svg.M r4 = com.horcrux.svg.M.kStartMarker     // Catch:{ NoSuchFieldError -> 0x004f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f58775a     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.horcrux.svg.M r3 = com.horcrux.svg.M.kMidMarker     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f58775a     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.horcrux.svg.M r1 = com.horcrux.svg.M.kEndMarker     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.L.a.<clinit>():void");
        }
    }

    private L(M m10, J j10, double d10) {
        this.f58772a = m10;
        this.f58773b = j10;
        this.f58774c = d10;
    }

    private static double a(double d10, double d11) {
        if (Math.abs(d10 - d11) > 180.0d) {
            d10 += 360.0d;
        }
        return (d10 + d11) / 2.0d;
    }

    private static void b(P p10, J j10, J j11, J j12) {
        p10.f58797a = k(j11, j10);
        p10.f58798b = k(j12, j11);
        if (i(p10.f58797a)) {
            p10.f58797a = p10.f58798b;
        } else if (i(p10.f58798b)) {
            p10.f58798b = p10.f58797a;
        }
    }

    private static double c(M m10) {
        double j10 = j(f(f58769h));
        double j11 = j(f(f58770i));
        int i10 = a.f58775a[m10.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return a(j10, j11);
            }
            if (i10 != 3) {
                return 0.0d;
            }
            return j10;
        } else if (f58771j) {
            return j11 + 180.0d;
        } else {
            return j11;
        }
    }

    private static P d(F f10) {
        P p10 = new P();
        J[] jArr = f10.f58733b;
        int i10 = a.f58776b[f10.f58732a.ordinal()];
        if (i10 == 1) {
            p10.f58799c = jArr[2];
            p10.f58797a = k(jArr[0], f58767f);
            p10.f58798b = k(jArr[2], jArr[1]);
            if (i(p10.f58797a)) {
                b(p10, jArr[0], jArr[1], jArr[2]);
            } else if (i(p10.f58798b)) {
                b(p10, f58767f, jArr[0], jArr[1]);
            }
        } else if (i10 == 2) {
            J j10 = jArr[1];
            p10.f58799c = j10;
            b(p10, f58767f, jArr[0], j10);
        } else if (i10 == 3 || i10 == 4) {
            J j11 = jArr[0];
            p10.f58799c = j11;
            p10.f58797a = k(j11, f58767f);
            p10.f58798b = k(p10.f58799c, f58767f);
        } else if (i10 == 5) {
            J j12 = f58768g;
            p10.f58799c = j12;
            p10.f58797a = k(j12, f58767f);
            p10.f58798b = k(p10.f58799c, f58767f);
        }
        return p10;
    }

    private static void e() {
        M m10 = M.kEndMarker;
        f58765d.add(new L(m10, f58767f, c(m10)));
    }

    private static double f(J j10) {
        return Math.atan2(j10.f58763b, j10.f58762a);
    }

    private static void g(F f10) {
        M m10;
        P d10 = d(f10);
        f58770i = d10.f58797a;
        int i10 = f58766e;
        if (i10 > 0) {
            if (i10 == 1) {
                m10 = M.kStartMarker;
            } else {
                m10 = M.kMidMarker;
            }
            f58765d.add(new L(m10, f58767f, c(m10)));
        }
        f58769h = d10.f58798b;
        f58767f = d10.f58799c;
        C4897g gVar = f10.f58732a;
        if (gVar == C4897g.kCGPathElementMoveToPoint) {
            f58768g = f10.f58733b[0];
        } else if (gVar == C4897g.kCGPathElementCloseSubpath) {
            f58768g = new J(0.0d, 0.0d);
        }
        f58766e++;
    }

    static ArrayList h(ArrayList arrayList) {
        f58765d = new ArrayList();
        f58766e = 0;
        f58767f = new J(0.0d, 0.0d);
        f58768g = new J(0.0d, 0.0d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g((F) it.next());
        }
        e();
        return f58765d;
    }

    private static boolean i(J j10) {
        if (j10.f58762a == 0.0d && j10.f58763b == 0.0d) {
            return true;
        }
        return false;
    }

    private static double j(double d10) {
        return d10 * 57.29577951308232d;
    }

    private static J k(J j10, J j11) {
        return new J(j11.f58762a - j10.f58762a, j11.f58763b - j10.f58763b);
    }
}
