package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import com.swmansion.reanimated.BuildConfig;
import java.util.ArrayList;

abstract class G {

    /* renamed from: a  reason: collision with root package name */
    static float f58734a;

    /* renamed from: b  reason: collision with root package name */
    private static int f58735b;

    /* renamed from: c  reason: collision with root package name */
    private static int f58736c;

    /* renamed from: d  reason: collision with root package name */
    private static String f58737d;

    /* renamed from: e  reason: collision with root package name */
    private static Path f58738e;

    /* renamed from: f  reason: collision with root package name */
    static ArrayList f58739f;

    /* renamed from: g  reason: collision with root package name */
    private static float f58740g;

    /* renamed from: h  reason: collision with root package name */
    private static float f58741h;

    /* renamed from: i  reason: collision with root package name */
    private static float f58742i;

    /* renamed from: j  reason: collision with root package name */
    private static float f58743j;

    /* renamed from: k  reason: collision with root package name */
    private static float f58744k;

    /* renamed from: l  reason: collision with root package name */
    private static float f58745l;

    /* renamed from: m  reason: collision with root package name */
    private static boolean f58746m;

    private static void A(float f10, float f11, float f12, float f13) {
        f58742i = f10;
        f58743j = f11;
        e((f58740g * 2.0f) - f58742i, (f58741h * 2.0f) - f58743j, f10, f11, f12, f13);
    }

    private static void B(float f10, float f11) {
        C(f10 + f58740g, f11 + f58741h);
    }

    private static void C(float f10, float f11) {
        u((f58740g * 2.0f) - f58742i, (f58741h * 2.0f) - f58743j, f10, f11);
    }

    private static void a(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        b(f10, f11, f12, z10, z11, f13 + f58740g, f14 + f58741h);
    }

    private static void b(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        boolean z12 = z10;
        boolean z13 = z11;
        float f20 = f58740g;
        float f21 = f58741h;
        if (f11 != 0.0f) {
            f15 = f11;
        } else if (f10 == 0.0f) {
            f15 = f14 - f21;
        } else {
            f15 = f10;
        }
        float abs = Math.abs(f15);
        if (f10 == 0.0f) {
            f16 = f13 - f20;
        } else {
            f16 = f10;
        }
        float abs2 = Math.abs(f16);
        if (abs2 == 0.0f || abs == 0.0f || (f13 == f20 && f14 == f21)) {
            l(f13, f14);
            return;
        }
        float radians = (float) Math.toRadians((double) f12);
        double d10 = (double) radians;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        float f22 = f13 - f20;
        float f23 = f14 - f21;
        float f24 = ((cos * f22) / 2.0f) + ((sin * f23) / 2.0f);
        float f25 = -sin;
        float f26 = ((f25 * f22) / 2.0f) + ((cos * f23) / 2.0f);
        float f27 = abs2 * abs2;
        float f28 = f27 * abs * abs;
        float f29 = abs * abs * f24 * f24;
        float f30 = f27 * f26 * f26;
        float f31 = (f28 - f30) - f29;
        if (f31 < 0.0f) {
            f17 = f25;
            float sqrt = (float) Math.sqrt((double) (1.0f - (f31 / f28)));
            abs2 *= sqrt;
            abs *= sqrt;
            f18 = f22 / 2.0f;
            f19 = f23 / 2.0f;
        } else {
            f17 = f25;
            float sqrt2 = (float) Math.sqrt((double) (f31 / (f30 + f29)));
            if (z12 == z13) {
                sqrt2 = -sqrt2;
            }
            float f32 = (((-sqrt2) * f26) * abs2) / abs;
            float f33 = ((sqrt2 * f24) * abs) / abs2;
            f18 = ((cos * f32) - (sin * f33)) + (f22 / 2.0f);
            f19 = (f23 / 2.0f) + (f32 * sin) + (f33 * cos);
        }
        float f34 = cos / abs2;
        float f35 = sin / abs2;
        float f36 = f17 / abs;
        float f37 = cos / abs;
        float f38 = -f18;
        float f39 = -f19;
        float f40 = abs;
        float f41 = abs2;
        float f42 = radians;
        float atan2 = (float) Math.atan2((double) ((f36 * f38) + (f37 * f39)), (double) ((f38 * f34) + (f39 * f35)));
        float f43 = f22 - f18;
        float f44 = f23 - f19;
        float atan22 = (float) Math.atan2((double) ((f36 * f43) + (f37 * f44)), (double) ((f34 * f43) + (f35 * f44)));
        float f45 = f18 + f20;
        float f46 = f19 + f21;
        float f47 = f22 + f20;
        float f48 = f23 + f21;
        w();
        f58742i = f47;
        f58740g = f47;
        f58743j = f48;
        f58741h = f48;
        if (f41 == f40 && f42 == 0.0f) {
            float degrees = (float) Math.toDegrees((double) atan2);
            float abs3 = Math.abs((degrees - ((float) Math.toDegrees((double) atan22))) % 360.0f);
            if (!z10 ? abs3 > 180.0f : abs3 < 180.0f) {
                abs3 = 360.0f - abs3;
            }
            if (!z11) {
                abs3 = -abs3;
            }
            float f49 = f58734a;
            f58738e.arcTo(new RectF((f45 - f41) * f49, (f46 - f41) * f49, (f45 + f41) * f49, (f46 + f41) * f49), degrees, abs3);
            f58739f.add(new F(C4897g.kCGPathElementAddCurveToPoint, new J[]{new J((double) f47, (double) f48)}));
            return;
        }
        c(f45, f46, f41, f40, atan2, atan22, z11, f42);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0067 A[LOOP:0: B:10:0x0065->B:11:0x0067, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void c(float r24, float r25, float r26, float r27, float r28, float r29, boolean r30, float r31) {
        /*
            r0 = r28
            r1 = r31
            double r1 = (double) r1
            double r3 = java.lang.Math.cos(r1)
            float r3 = (float) r3
            double r1 = java.lang.Math.sin(r1)
            float r1 = (float) r1
            float r2 = r3 * r26
            float r4 = -r1
            float r4 = r4 * r27
            float r1 = r1 * r26
            float r3 = r3 * r27
            float r5 = r29 - r0
            r6 = 0
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            r8 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            if (r7 >= 0) goto L_0x002a
            if (r30 == 0) goto L_0x002a
            double r5 = (double) r5
            double r5 = r5 + r8
        L_0x0028:
            float r5 = (float) r5
            goto L_0x0033
        L_0x002a:
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0033
            if (r30 != 0) goto L_0x0033
            double r5 = (double) r5
            double r5 = r5 - r8
            goto L_0x0028
        L_0x0033:
            double r6 = (double) r5
            r8 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r6 = r6 / r8
            double r6 = v(r6)
            double r6 = java.lang.Math.abs(r6)
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            float r7 = (float) r6
            float r5 = r5 / r7
            r7 = 1082130432(0x40800000, float:4.0)
            float r7 = r5 / r7
            double r7 = (double) r7
            double r7 = java.lang.Math.tan(r7)
            r9 = 4608683618675807573(0x3ff5555555555555, double:1.3333333333333333)
            double r7 = r7 * r9
            float r7 = (float) r7
            double r8 = (double) r0
            double r10 = java.lang.Math.cos(r8)
            float r10 = (float) r10
            double r8 = java.lang.Math.sin(r8)
            float r8 = (float) r8
            r9 = 0
        L_0x0065:
            if (r9 >= r6) goto L_0x0113
            float r11 = r7 * r8
            float r11 = r10 - r11
            float r10 = r10 * r7
            float r8 = r8 + r10
            float r0 = r0 + r5
            double r12 = (double) r0
            double r14 = java.lang.Math.cos(r12)
            float r10 = (float) r14
            double r12 = java.lang.Math.sin(r12)
            float r12 = (float) r12
            float r13 = r7 * r12
            float r13 = r13 + r10
            float r14 = r7 * r10
            float r14 = r12 - r14
            float r15 = r2 * r11
            float r15 = r24 + r15
            float r16 = r4 * r8
            float r15 = r15 + r16
            float r11 = r11 * r1
            float r11 = r25 + r11
            float r8 = r8 * r3
            float r11 = r11 + r8
            float r8 = r2 * r13
            float r8 = r24 + r8
            float r16 = r4 * r14
            float r8 = r8 + r16
            float r13 = r13 * r1
            float r13 = r25 + r13
            float r14 = r14 * r3
            float r13 = r13 + r14
            float r14 = r2 * r10
            float r14 = r24 + r14
            float r16 = r4 * r12
            float r14 = r14 + r16
            float r16 = r1 * r10
            float r16 = r25 + r16
            float r17 = r3 * r12
            r26 = r0
            float r0 = r16 + r17
            android.graphics.Path r16 = f58738e
            float r17 = f58734a
            float r18 = r15 * r17
            float r19 = r11 * r17
            float r20 = r8 * r17
            float r21 = r13 * r17
            float r22 = r14 * r17
            float r23 = r0 * r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r23
            r16.cubicTo(r17, r18, r19, r20, r21, r22)
            r31 = r1
            java.util.ArrayList r1 = f58739f
            r16 = r2
            com.horcrux.svg.F r2 = new com.horcrux.svg.F
            r27 = r3
            com.horcrux.svg.g r3 = com.horcrux.svg.C4897g.kCGPathElementAddCurveToPoint
            r17 = r4
            com.horcrux.svg.J r4 = new com.horcrux.svg.J
            r29 = r5
            r18 = r6
            double r5 = (double) r15
            r15 = r10
            double r10 = (double) r11
            r4.<init>(r5, r10)
            com.horcrux.svg.J r5 = new com.horcrux.svg.J
            double r10 = (double) r8
            r8 = r7
            double r6 = (double) r13
            r5.<init>(r10, r6)
            com.horcrux.svg.J r6 = new com.horcrux.svg.J
            double r10 = (double) r14
            double r13 = (double) r0
            r6.<init>(r10, r13)
            com.horcrux.svg.J[] r0 = new com.horcrux.svg.J[]{r4, r5, r6}
            r2.<init>(r3, r0)
            r1.add(r2)
            int r9 = r9 + 1
            r0 = r26
            r3 = r27
            r5 = r29
            r1 = r31
            r7 = r8
            r8 = r12
            r10 = r15
            r2 = r16
            r4 = r17
            r6 = r18
            goto L_0x0065
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.G.c(float, float, float, float, float, float, boolean, float):void");
    }

    private static void d() {
        if (f58746m) {
            f58740g = f58744k;
            f58741h = f58745l;
            f58746m = false;
            f58738e.close();
            f58739f.add(new F(C4897g.kCGPathElementCloseSubpath, new J[]{new J((double) f58740g, (double) f58741h)}));
        }
    }

    private static void e(float f10, float f11, float f12, float f13, float f14, float f15) {
        w();
        f58740g = f14;
        f58741h = f15;
        Path path = f58738e;
        float f16 = f58734a;
        path.cubicTo(f10 * f16, f11 * f16, f12 * f16, f13 * f16, f14 * f16, f15 * f16);
        f58739f.add(new F(C4897g.kCGPathElementAddCurveToPoint, new J[]{new J((double) f10, (double) f11), new J((double) f12, (double) f13), new J((double) f14, (double) f15)}));
    }

    private static void f(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f58740g;
        float f17 = f58741h;
        g(f10 + f16, f11 + f17, f12 + f16, f13 + f17, f14 + f16, f15 + f17);
    }

    private static void g(float f10, float f11, float f12, float f13, float f14, float f15) {
        f58742i = f12;
        f58743j = f13;
        e(f10, f11, f12, f13, f14, f15);
    }

    private static boolean h(char c10) {
        return Character.isUpperCase(c10);
    }

    private static boolean i(char c10) {
        switch (c10) {
            case 'A':
            case 'C':
            case 'H':
            case 'L':
            case BuildConfig.REACT_NATIVE_MINOR_VERSION /*77*/:
            case 'Q':
            case 'S':
            case 'T':
            case 'V':
            case 'Z':
            case 'a':
            case 'c':
            case 'h':
            case 'l':
            case 'm':
            case 'q':
            case 's':
            case 't':
            case 'v':
            case 'z':
                return true;
            default:
                return false;
        }
    }

    private static boolean j(char c10) {
        return (c10 >= '0' && c10 <= '9') || c10 == '.' || c10 == '-' || c10 == '+';
    }

    private static void k(float f10, float f11) {
        l(f10 + f58740g, f11 + f58741h);
    }

    private static void l(float f10, float f11) {
        w();
        f58740g = f10;
        f58742i = f10;
        f58741h = f11;
        f58743j = f11;
        Path path = f58738e;
        float f12 = f58734a;
        path.lineTo(f10 * f12, f12 * f11);
        f58739f.add(new F(C4897g.kCGPathElementAddLineToPoint, new J[]{new J((double) f10, (double) f11)}));
    }

    private static void m(float f10, float f11) {
        n(f10 + f58740g, f11 + f58741h);
    }

    private static void n(float f10, float f11) {
        f58740g = f10;
        f58742i = f10;
        f58744k = f10;
        f58741h = f11;
        f58743j = f11;
        f58745l = f11;
        Path path = f58738e;
        float f12 = f58734a;
        path.moveTo(f10 * f12, f12 * f11);
        f58739f.add(new F(C4897g.kCGPathElementMoveToPoint, new J[]{new J((double) f10, (double) f11)}));
    }

    static Path o(String str) {
        boolean z10;
        f58739f = new ArrayList();
        Path path = new Path();
        f58738e = path;
        if (str == null) {
            return path;
        }
        f58736c = str.length();
        f58737d = str;
        f58735b = 0;
        f58740g = 0.0f;
        f58741h = 0.0f;
        f58742i = 0.0f;
        f58743j = 0.0f;
        f58744k = 0.0f;
        f58745l = 0.0f;
        f58746m = false;
        char c10 = ' ';
        while (f58735b < f58736c) {
            y();
            int i10 = f58735b;
            if (i10 >= f58736c) {
                return f58738e;
            }
            boolean z11 = true;
            if (c10 != ' ') {
                z10 = true;
            } else {
                z10 = false;
            }
            char charAt = f58737d.charAt(i10);
            if (z10 || charAt == 'M' || charAt == 'm') {
                if (i(charAt)) {
                    f58735b++;
                    z11 = false;
                    c10 = charAt;
                } else if (!j(charAt) || !z10) {
                    throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", new Object[]{Character.valueOf(charAt), Integer.valueOf(f58735b), f58737d}));
                } else if (c10 == 'Z' || c10 == 'z') {
                    throw new IllegalArgumentException(String.format("Unexpected number after 'z' (s=%s)", new Object[]{f58737d}));
                } else if (c10 != 'M' && c10 != 'm') {
                    z11 = false;
                } else if (h(c10)) {
                    c10 = 'L';
                } else {
                    c10 = 'l';
                }
                boolean h10 = h(c10);
                switch (c10) {
                    case 'A':
                        b(q(), q(), q(), p(), p(), q(), q());
                        break;
                    case 'C':
                        g(q(), q(), q(), q(), q(), q());
                        break;
                    case 'H':
                        l(q(), f58741h);
                        break;
                    case 'L':
                        l(q(), q());
                        break;
                    case BuildConfig.REACT_NATIVE_MINOR_VERSION /*77*/:
                        n(q(), q());
                        break;
                    case 'Q':
                        u(q(), q(), q(), q());
                        break;
                    case 'S':
                        A(q(), q(), q(), q());
                        break;
                    case 'T':
                        C(q(), q());
                        break;
                    case 'V':
                        l(f58740g, q());
                        break;
                    case 'Z':
                    case 'z':
                        d();
                        break;
                    case 'a':
                        a(q(), q(), q(), p(), p(), q(), q());
                        break;
                    case 'c':
                        f(q(), q(), q(), q(), q(), q());
                        break;
                    case 'h':
                        k(q(), 0.0f);
                        break;
                    case 'l':
                        k(q(), q());
                        break;
                    case 'm':
                        m(q(), q());
                        break;
                    case 'q':
                        t(q(), q(), q(), q());
                        break;
                    case 's':
                        z(q(), q(), q(), q());
                        break;
                    case 't':
                        B(q(), q());
                        break;
                    case 'v':
                        k(0.0f, q());
                        break;
                    default:
                        throw new IllegalArgumentException(String.format("Unexpected comand '%c' (s=%s)", new Object[]{Character.valueOf(c10), f58737d}));
                }
                if (z11) {
                    if (h10) {
                        c10 = 'M';
                    } else {
                        c10 = 'm';
                    }
                }
            } else {
                throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", new Object[]{Character.valueOf(charAt), Integer.valueOf(f58735b), f58737d}));
            }
        }
        return f58738e;
    }

    private static boolean p() {
        y();
        char charAt = f58737d.charAt(f58735b);
        if (charAt == '0' || charAt == '1') {
            int i10 = f58735b + 1;
            f58735b = i10;
            if (i10 < f58736c && f58737d.charAt(i10) == ',') {
                f58735b++;
            }
            y();
            if (charAt == '1') {
                return true;
            }
            return false;
        }
        throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", new Object[]{Character.valueOf(charAt), Integer.valueOf(f58735b), f58737d}));
    }

    private static float q() {
        if (f58735b != f58736c) {
            float s10 = s();
            y();
            r();
            return s10;
        }
        throw new Error(String.format("Unexpected end (s=%s)", new Object[]{f58737d}));
    }

    private static void r() {
        int i10 = f58735b;
        if (i10 < f58736c && f58737d.charAt(i10) == ',') {
            f58735b++;
        }
    }

    private static float s() {
        char charAt;
        y();
        int i10 = f58735b;
        if (i10 != f58736c) {
            char charAt2 = f58737d.charAt(i10);
            if (charAt2 == '-' || charAt2 == '+') {
                int i11 = f58735b + 1;
                f58735b = i11;
                charAt2 = f58737d.charAt(i11);
            }
            if (charAt2 >= '0' && charAt2 <= '9') {
                x();
                int i12 = f58735b;
                if (i12 < f58736c) {
                    charAt2 = f58737d.charAt(i12);
                }
            } else if (charAt2 != '.') {
                throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", new Object[]{Character.valueOf(charAt2), Integer.valueOf(f58735b), f58737d}));
            }
            if (charAt2 == '.') {
                f58735b++;
                x();
                int i13 = f58735b;
                if (i13 < f58736c) {
                    charAt2 = f58737d.charAt(i13);
                }
            }
            if (charAt2 == 'e' || charAt2 == 'E') {
                int i14 = f58735b;
                if (!(i14 + 1 >= f58736c || (charAt = f58737d.charAt(i14 + 1)) == 'm' || charAt == 'x')) {
                    int i15 = f58735b + 1;
                    f58735b = i15;
                    char charAt3 = f58737d.charAt(i15);
                    if (charAt3 == '+' || charAt3 == '-') {
                        f58735b++;
                        x();
                    } else if (charAt3 < '0' || charAt3 > '9') {
                        throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", new Object[]{Character.valueOf(charAt3), Integer.valueOf(f58735b), f58737d}));
                    } else {
                        x();
                    }
                }
            }
            String substring = f58737d.substring(i10, f58735b);
            float parseFloat = Float.parseFloat(substring);
            if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                return parseFloat;
            }
            throw new IllegalArgumentException(String.format("Invalid number '%s' (start=%d, i=%d, s=%s)", new Object[]{substring, Integer.valueOf(i10), Integer.valueOf(f58735b), f58737d}));
        }
        throw new Error(String.format("Unexpected end (s=%s)", new Object[]{f58737d}));
    }

    private static void t(float f10, float f11, float f12, float f13) {
        float f14 = f58740g;
        float f15 = f58741h;
        u(f10 + f14, f11 + f15, f12 + f14, f13 + f15);
    }

    private static void u(float f10, float f11, float f12, float f13) {
        f58742i = f10;
        f58743j = f11;
        float f14 = f10 * 2.0f;
        float f15 = f11 * 2.0f;
        float f16 = (f58740g + f14) / 3.0f;
        float f17 = (f58741h + f15) / 3.0f;
        e(f16, f17, (f12 + f14) / 3.0f, (f13 + f15) / 3.0f, f12, f13);
    }

    private static double v(double d10) {
        double pow = Math.pow(10.0d, 4.0d);
        return ((double) Math.round(d10 * pow)) / pow;
    }

    private static void w() {
        if (!f58746m) {
            f58744k = f58740g;
            f58745l = f58741h;
            f58746m = true;
        }
    }

    private static void x() {
        while (true) {
            int i10 = f58735b;
            if (i10 < f58736c && Character.isDigit(f58737d.charAt(i10))) {
                f58735b++;
            } else {
                return;
            }
        }
    }

    private static void y() {
        while (true) {
            int i10 = f58735b;
            if (i10 < f58736c && Character.isWhitespace(f58737d.charAt(i10))) {
                f58735b++;
            } else {
                return;
            }
        }
    }

    private static void z(float f10, float f11, float f12, float f13) {
        float f14 = f58740g;
        float f15 = f58741h;
        A(f10 + f14, f11 + f15, f12 + f14, f13 + f15);
    }
}
