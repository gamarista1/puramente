package com.google.protobuf;

import com.amazon.c.a.a.c;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.google.protobuf.m0;
import com.google.protobuf.n0;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

final class N implements Z {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f58389r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    private static final Unsafe f58390s = k0.D();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f58391a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f58392b;

    /* renamed from: c  reason: collision with root package name */
    private final int f58393c;

    /* renamed from: d  reason: collision with root package name */
    private final int f58394d;

    /* renamed from: e  reason: collision with root package name */
    private final K f58395e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f58396f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f58397g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f58398h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f58399i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f58400j;

    /* renamed from: k  reason: collision with root package name */
    private final int f58401k;

    /* renamed from: l  reason: collision with root package name */
    private final int f58402l;

    /* renamed from: m  reason: collision with root package name */
    private final P f58403m;

    /* renamed from: n  reason: collision with root package name */
    private final A f58404n;

    /* renamed from: o  reason: collision with root package name */
    private final g0 f58405o;

    /* renamed from: p  reason: collision with root package name */
    private final C4874l f58406p;

    /* renamed from: q  reason: collision with root package name */
    private final F f58407q;

    private N(int[] iArr, Object[] objArr, int i10, int i11, K k10, boolean z10, boolean z11, int[] iArr2, int i12, int i13, P p10, A a10, g0 g0Var, C4874l lVar, F f10) {
        boolean z12;
        this.f58391a = iArr;
        this.f58392b = objArr;
        this.f58393c = i10;
        this.f58394d = i11;
        this.f58397g = k10 instanceof r;
        this.f58398h = z10;
        if (lVar == null || !lVar.d(k10)) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f58396f = z12;
        this.f58399i = z11;
        this.f58400j = iArr2;
        this.f58401k = i12;
        this.f58402l = i13;
        this.f58403m = p10;
        this.f58404n = a10;
        this.f58405o = g0Var;
        this.f58406p = lVar;
        this.f58395e = k10;
        this.f58407q = f10;
    }

    private boolean A(Object obj, Object obj2, int i10) {
        long S10 = (long) (S(i10) & 1048575);
        if (k0.z(obj, S10) == k0.z(obj2, S10)) {
            return true;
        }
        return false;
    }

    private boolean B(Object obj, int i10, int i11) {
        if (k0.z(obj, (long) (S(i11) & 1048575)) == i10) {
            return true;
        }
        return false;
    }

    private static boolean C(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static List D(Object obj, long j10) {
        return (List) k0.C(obj, j10);
    }

    private static long E(Object obj, long j10) {
        return k0.A(obj, j10);
    }

    private void F(Object obj, Object obj2, int i10) {
        if (u(obj2, i10)) {
            long M10 = M(X(i10));
            Unsafe unsafe = f58390s;
            Object object = unsafe.getObject(obj2, M10);
            if (object != null) {
                Z p10 = p(i10);
                if (!u(obj, i10)) {
                    if (!z(object)) {
                        unsafe.putObject(obj, M10, object);
                    } else {
                        Object b10 = p10.b();
                        p10.a(b10, object);
                        unsafe.putObject(obj, M10, b10);
                    }
                    U(obj, i10);
                    return;
                }
                Object object2 = unsafe.getObject(obj, M10);
                if (!z(object2)) {
                    Object b11 = p10.b();
                    p10.a(b11, object2);
                    unsafe.putObject(obj, M10, b11);
                    object2 = b11;
                }
                p10.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + L(i10) + " is present but null: " + obj2);
        }
    }

    private void G(Object obj, Object obj2, int i10) {
        int L10 = L(i10);
        if (B(obj2, L10, i10)) {
            long M10 = M(X(i10));
            Unsafe unsafe = f58390s;
            Object object = unsafe.getObject(obj2, M10);
            if (object != null) {
                Z p10 = p(i10);
                if (!B(obj, L10, i10)) {
                    if (!z(object)) {
                        unsafe.putObject(obj, M10, object);
                    } else {
                        Object b10 = p10.b();
                        p10.a(b10, object);
                        unsafe.putObject(obj, M10, b10);
                    }
                    V(obj, L10, i10);
                    return;
                }
                Object object2 = unsafe.getObject(obj, M10);
                if (!z(object2)) {
                    Object b11 = p10.b();
                    p10.a(b11, object2);
                    unsafe.putObject(obj, M10, b11);
                    object2 = b11;
                }
                p10.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + L(i10) + " is present but null: " + obj2);
        }
    }

    private void H(Object obj, Object obj2, int i10) {
        int X10 = X(i10);
        long M10 = M(X10);
        int L10 = L(i10);
        switch (W(X10)) {
            case 0:
                if (u(obj2, i10)) {
                    k0.N(obj, M10, k0.x(obj2, M10));
                    U(obj, i10);
                    return;
                }
                return;
            case 1:
                if (u(obj2, i10)) {
                    k0.O(obj, M10, k0.y(obj2, M10));
                    U(obj, i10);
                    return;
                }
                return;
            case 2:
                if (u(obj2, i10)) {
                    k0.Q(obj, M10, k0.A(obj2, M10));
                    U(obj, i10);
                    return;
                }
                return;
            case 3:
                if (u(obj2, i10)) {
                    k0.Q(obj, M10, k0.A(obj2, M10));
                    U(obj, i10);
                    return;
                }
                return;
            case 4:
                if (u(obj2, i10)) {
                    k0.P(obj, M10, k0.z(obj2, M10));
                    U(obj, i10);
                    return;
                }
                return;
            case 5:
                if (u(obj2, i10)) {
                    k0.Q(obj, M10, k0.A(obj2, M10));
                    U(obj, i10);
                    return;
                }
                return;
            case 6:
                if (u(obj2, i10)) {
                    k0.P(obj, M10, k0.z(obj2, M10));
                    U(obj, i10);
                    return;
                }
                return;
            case 7:
                if (u(obj2, i10)) {
                    k0.H(obj, M10, k0.r(obj2, M10));
                    U(obj, i10);
                    return;
                }
                return;
            case 8:
                if (u(obj2, i10)) {
                    k0.R(obj, M10, k0.C(obj2, M10));
                    U(obj, i10);
                    return;
                }
                return;
            case 9:
                F(obj, obj2, i10);
                return;
            case 10:
                if (u(obj2, i10)) {
                    k0.R(obj, M10, k0.C(obj2, M10));
                    U(obj, i10);
                    return;
                }
                return;
            case 11:
                if (u(obj2, i10)) {
                    k0.P(obj, M10, k0.z(obj2, M10));
                    U(obj, i10);
                    return;
                }
                return;
            case 12:
                if (u(obj2, i10)) {
                    k0.P(obj, M10, k0.z(obj2, M10));
                    U(obj, i10);
                    return;
                }
                return;
            case 13:
                if (u(obj2, i10)) {
                    k0.P(obj, M10, k0.z(obj2, M10));
                    U(obj, i10);
                    return;
                }
                return;
            case StdKeyDeserializer.TYPE_URL:
                if (u(obj2, i10)) {
                    k0.Q(obj, M10, k0.A(obj2, M10));
                    U(obj, i10);
                    return;
                }
                return;
            case StdKeyDeserializer.TYPE_CLASS:
                if (u(obj2, i10)) {
                    k0.P(obj, M10, k0.z(obj2, M10));
                    U(obj, i10);
                    return;
                }
                return;
            case 16:
                if (u(obj2, i10)) {
                    k0.Q(obj, M10, k0.A(obj2, M10));
                    U(obj, i10);
                    return;
                }
                return;
            case 17:
                F(obj, obj2, i10);
                return;
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case c.f37660h:
            case CharsToNameCanonicalizer.HASH_MULT:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case Carousel.ENTITY_TYPE /*44*/:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f58404n.d(obj, obj2, M10);
                return;
            case 50:
                b0.D(this.f58407q, obj, obj2, M10);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (B(obj2, L10, i10)) {
                    k0.R(obj, M10, k0.C(obj2, M10));
                    V(obj, L10, i10);
                    return;
                }
                return;
            case 60:
                G(obj, obj2, i10);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (B(obj2, L10, i10)) {
                    k0.R(obj, M10, k0.C(obj2, M10));
                    V(obj, L10, i10);
                    return;
                }
                return;
            case 68:
                G(obj, obj2, i10);
                return;
            default:
                return;
        }
    }

    static N I(Class cls, I i10, P p10, A a10, g0 g0Var, C4874l lVar, F f10) {
        if (i10 instanceof Y) {
            return K((Y) i10, p10, a10, g0Var, lVar, f10);
        }
        android.support.v4.media.session.c.a(i10);
        return J((d0) null, p10, a10, g0Var, lVar, f10);
    }

    static N J(d0 d0Var, P p10, A a10, g0 g0Var, C4874l lVar, F f10) {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x036d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.protobuf.N K(com.google.protobuf.Y r33, com.google.protobuf.P r34, com.google.protobuf.A r35, com.google.protobuf.g0 r36, com.google.protobuf.C4874l r37, com.google.protobuf.F r38) {
        /*
            com.google.protobuf.V r0 = r33.c()
            com.google.protobuf.V r1 = com.google.protobuf.V.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = r2
        L_0x000c:
            java.lang.String r0 = r33.e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0028
            r4 = 1
        L_0x001e:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0029
            r4 = r6
            goto L_0x001e
        L_0x0028:
            r6 = 1
        L_0x0029:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0048
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0035:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0045
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0035
        L_0x0045:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0048:
            if (r6 != 0) goto L_0x0058
            int[] r6 = f58389r
            r8 = r2
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r16 = r14
            r13 = r6
            r6 = r16
            goto L_0x0162
        L_0x0058:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0077
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0064:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0074
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0064
        L_0x0074:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0077:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0096
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0083:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0093
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0083
        L_0x0093:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0096:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b5
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a2:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a2
        L_0x00b2:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b5:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d4
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c1:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c1
        L_0x00d1:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d4:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f3
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00e0:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00f0
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00e0
        L_0x00f0:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f3:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0112
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00ff:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010f
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00ff
        L_0x010f:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0112:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0133
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011e:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012f
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011e
        L_0x012f:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0133:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0156
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013f:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0151
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013f
        L_0x0151:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0156:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 * 2
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
        L_0x0162:
            sun.misc.Unsafe r15 = f58390s
            java.lang.Object[] r17 = r33.d()
            com.google.protobuf.K r18 = r33.b()
            java.lang.Class r2 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 * 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r20 = r14 + r12
            r22 = r14
            r23 = r20
            r12 = 0
            r21 = 0
        L_0x0181:
            if (r4 >= r1) goto L_0x03bb
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01a9
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x0191:
            int r26 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01a3
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r26
            goto L_0x0191
        L_0x01a3:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r26
            goto L_0x01ab
        L_0x01a9:
            r3 = r24
        L_0x01ab:
            int r24 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01d8
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01b9:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L_0x01d2
            r1 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r3 = r3 | r1
            int r24 = r24 + 13
            r5 = r27
            r1 = r28
            goto L_0x01b9
        L_0x01d2:
            int r1 = r5 << r24
            r3 = r3 | r1
            r1 = r27
            goto L_0x01dc
        L_0x01d8:
            r28 = r1
            r1 = r24
        L_0x01dc:
            r5 = r3 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r3 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01e9
            int r14 = r12 + 1
            r13[r12] = r21
            r12 = r14
        L_0x01e9:
            r14 = 51
            r30 = r12
            if (r5 < r14) goto L_0x0289
            int r14 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0218
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r31 = 13
        L_0x01fe:
            int r32 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r12) goto L_0x0213
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r31
            r1 = r1 | r12
            int r31 = r31 + 13
            r14 = r32
            r12 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01fe
        L_0x0213:
            int r12 = r14 << r31
            r1 = r1 | r12
            r14 = r32
        L_0x0218:
            int r12 = r5 + -51
            r31 = r14
            r14 = 9
            if (r12 == r14) goto L_0x023a
            r14 = 17
            if (r12 != r14) goto L_0x0225
            goto L_0x023a
        L_0x0225:
            r14 = 12
            if (r12 != r14) goto L_0x0247
            if (r10 != 0) goto L_0x0247
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0237:
            r16 = r14
            goto L_0x0247
        L_0x023a:
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0237
        L_0x0247:
            int r1 = r1 * 2
            r12 = r17[r1]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0255
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
        L_0x0251:
            r14 = r8
            r32 = r9
            goto L_0x025e
        L_0x0255:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = T(r2, r12)
            r17[r1] = r12
            goto L_0x0251
        L_0x025e:
            long r8 = r15.objectFieldOffset(r12)
            int r8 = (int) r8
            int r1 = r1 + 1
            r9 = r17[r1]
            boolean r12 = r9 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x026f
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
        L_0x026d:
            r1 = r8
            goto L_0x0278
        L_0x026f:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = T(r2, r9)
            r17[r1] = r9
            goto L_0x026d
        L_0x0278:
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r29 = r0
            r9 = r8
            r0 = r10
            r27 = r31
            r25 = 1
            r8 = r1
            r1 = 0
            goto L_0x0384
        L_0x0289:
            r14 = r8
            r32 = r9
            int r8 = r16 + 1
            r9 = r17[r16]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = T(r2, r9)
            r12 = 9
            if (r5 == r12) goto L_0x029e
            r12 = 17
            if (r5 != r12) goto L_0x02a2
        L_0x029e:
            r25 = 1
            goto L_0x0305
        L_0x02a2:
            r12 = 27
            if (r5 == r12) goto L_0x02aa
            r12 = 49
            if (r5 != r12) goto L_0x02ad
        L_0x02aa:
            r25 = 1
            goto L_0x02f8
        L_0x02ad:
            r12 = 12
            if (r5 == r12) goto L_0x02e5
            r12 = 30
            if (r5 == r12) goto L_0x02e5
            r12 = 44
            if (r5 != r12) goto L_0x02ba
            goto L_0x02e5
        L_0x02ba:
            r12 = 50
            if (r5 != r12) goto L_0x02da
            int r12 = r22 + 1
            r13[r22] = r21
            int r22 = r21 / 3
            int r22 = r22 * 2
            int r27 = r16 + 2
            r8 = r17[r8]
            r11[r22] = r8
            r8 = r3 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02de
            int r22 = r22 + 1
            int r8 = r16 + 3
            r16 = r17[r27]
            r11[r22] = r16
            r22 = r12
        L_0x02da:
            r25 = 1
        L_0x02dc:
            r12 = r8
            goto L_0x0312
        L_0x02de:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x0312
        L_0x02e5:
            if (r10 != 0) goto L_0x02da
            int r12 = r21 / 3
            int r12 = r12 * 2
            r25 = 1
            int r12 = r12 + 1
            int r16 = r16 + 2
            r8 = r17[r8]
            r11[r12] = r8
        L_0x02f5:
            r12 = r16
            goto L_0x0312
        L_0x02f8:
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            int r16 = r16 + 2
            r8 = r17[r8]
            r11[r12] = r8
            goto L_0x02f5
        L_0x0305:
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            java.lang.Class r16 = r9.getType()
            r11[r12] = r16
            goto L_0x02dc
        L_0x0312:
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r9 = r3 & 4096(0x1000, float:5.74E-42)
            r16 = r12
            r12 = 4096(0x1000, float:5.74E-42)
            if (r9 != r12) goto L_0x036d
            r9 = 17
            if (r5 > r9) goto L_0x036d
            int r9 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0348
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x0332:
            int r27 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r12) goto L_0x0344
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r26
            r1 = r1 | r9
            int r26 = r26 + 13
            r9 = r27
            goto L_0x0332
        L_0x0344:
            int r9 = r9 << r26
            r1 = r1 | r9
            goto L_0x034a
        L_0x0348:
            r27 = r9
        L_0x034a:
            int r9 = r6 * 2
            int r26 = r1 / 32
            int r9 = r9 + r26
            r12 = r17[r9]
            r29 = r0
            boolean r0 = r12 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x035c
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
        L_0x035a:
            r0 = r10
            goto L_0x0365
        L_0x035c:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = T(r2, r12)
            r17[r9] = r12
            goto L_0x035a
        L_0x0365:
            long r9 = r15.objectFieldOffset(r12)
            int r9 = (int) r9
            int r1 = r1 % 32
            goto L_0x0376
        L_0x036d:
            r29 = r0
            r0 = r10
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r27 = r1
            r1 = 0
        L_0x0376:
            r10 = 18
            if (r5 < r10) goto L_0x0384
            r10 = 49
            if (r5 > r10) goto L_0x0384
            int r10 = r23 + 1
            r13[r23] = r8
            r23 = r10
        L_0x0384:
            int r10 = r21 + 1
            r7[r21] = r4
            int r4 = r21 + 2
            r12 = r3 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0391
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0392
        L_0x0391:
            r12 = 0
        L_0x0392:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0399
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x039a
        L_0x0399:
            r3 = 0
        L_0x039a:
            r3 = r3 | r12
            int r5 = r5 << 20
            r3 = r3 | r5
            r3 = r3 | r8
            r7[r10] = r3
            int r21 = r21 + 3
            int r1 = r1 << 20
            r1 = r1 | r9
            r7[r4] = r1
            r10 = r0
            r8 = r14
            r14 = r24
            r4 = r27
            r1 = r28
            r0 = r29
            r12 = r30
            r9 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0181
        L_0x03bb:
            r32 = r9
            r0 = r10
            r24 = r14
            r14 = r8
            com.google.protobuf.N r1 = new com.google.protobuf.N
            com.google.protobuf.K r9 = r33.b()
            r2 = 0
            r4 = r1
            r5 = r7
            r6 = r11
            r7 = r14
            r8 = r32
            r11 = r2
            r12 = r13
            r13 = r24
            r14 = r20
            r15 = r34
            r16 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.N.K(com.google.protobuf.Y, com.google.protobuf.P, com.google.protobuf.A, com.google.protobuf.g0, com.google.protobuf.l, com.google.protobuf.F):com.google.protobuf.N");
    }

    private int L(int i10) {
        return this.f58391a[i10];
    }

    private static long M(int i10) {
        return (long) (i10 & 1048575);
    }

    private static boolean N(Object obj, long j10) {
        return ((Boolean) k0.C(obj, j10)).booleanValue();
    }

    private static double O(Object obj, long j10) {
        return ((Double) k0.C(obj, j10)).doubleValue();
    }

    private static float P(Object obj, long j10) {
        return ((Float) k0.C(obj, j10)).floatValue();
    }

    private static int Q(Object obj, long j10) {
        return ((Integer) k0.C(obj, j10)).intValue();
    }

    private static long R(Object obj, long j10) {
        return ((Long) k0.C(obj, j10)).longValue();
    }

    private int S(int i10) {
        return this.f58391a[i10 + 2];
    }

    private static Field T(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void U(Object obj, int i10) {
        int S10 = S(i10);
        long j10 = (long) (1048575 & S10);
        if (j10 != 1048575) {
            k0.P(obj, j10, (1 << (S10 >>> 20)) | k0.z(obj, j10));
        }
    }

    private void V(Object obj, int i10, int i11) {
        k0.P(obj, (long) (S(i11) & 1048575), i10);
    }

    private static int W(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private int X(int i10) {
        return this.f58391a[i10 + 1];
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Y(java.lang.Object r18, com.google.protobuf.n0 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f58396f
            if (r3 == 0) goto L_0x0021
            com.google.protobuf.l r3 = r0.f58406p
            com.google.protobuf.o r3 = r3.b(r1)
            boolean r5 = r3.j()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.n()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            int[] r6 = r0.f58391a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f58390s
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r8
            r10 = 0
            r12 = 0
        L_0x002e:
            if (r10 >= r6) goto L_0x048d
            int r13 = r0.X(r10)
            int r14 = r0.L(r10)
            int r15 = W(r13)
            r4 = 17
            if (r15 > r4) goto L_0x0056
            int[] r4 = r0.f58391a
            int r16 = r10 + 2
            r4 = r4[r16]
            r9 = r4 & r8
            if (r9 == r11) goto L_0x0050
            long r11 = (long) r9
            int r12 = r7.getInt(r1, r11)
            r11 = r9
        L_0x0050:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x0057
        L_0x0056:
            r4 = 0
        L_0x0057:
            if (r5 == 0) goto L_0x0075
            com.google.protobuf.l r9 = r0.f58406p
            int r9 = r9.a(r5)
            if (r9 > r14) goto L_0x0075
            com.google.protobuf.l r9 = r0.f58406p
            r9.f(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0073
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0057
        L_0x0073:
            r5 = 0
            goto L_0x0057
        L_0x0075:
            long r8 = M(r13)
            switch(r15) {
                case 0: goto L_0x047b;
                case 1: goto L_0x046f;
                case 2: goto L_0x0463;
                case 3: goto L_0x0457;
                case 4: goto L_0x044b;
                case 5: goto L_0x043f;
                case 6: goto L_0x0433;
                case 7: goto L_0x0427;
                case 8: goto L_0x041b;
                case 9: goto L_0x040a;
                case 10: goto L_0x03fb;
                case 11: goto L_0x03ee;
                case 12: goto L_0x03e1;
                case 13: goto L_0x03d4;
                case 14: goto L_0x03c7;
                case 15: goto L_0x03ba;
                case 16: goto L_0x03ad;
                case 17: goto L_0x039c;
                case 18: goto L_0x038c;
                case 19: goto L_0x037c;
                case 20: goto L_0x036c;
                case 21: goto L_0x035c;
                case 22: goto L_0x034c;
                case 23: goto L_0x033c;
                case 24: goto L_0x032c;
                case 25: goto L_0x031c;
                case 26: goto L_0x030d;
                case 27: goto L_0x02fa;
                case 28: goto L_0x02eb;
                case 29: goto L_0x02db;
                case 30: goto L_0x02cb;
                case 31: goto L_0x02bb;
                case 32: goto L_0x02ab;
                case 33: goto L_0x029b;
                case 34: goto L_0x028b;
                case 35: goto L_0x027b;
                case 36: goto L_0x026b;
                case 37: goto L_0x025b;
                case 38: goto L_0x024b;
                case 39: goto L_0x023b;
                case 40: goto L_0x022b;
                case 41: goto L_0x021b;
                case 42: goto L_0x020b;
                case 43: goto L_0x01fb;
                case 44: goto L_0x01eb;
                case 45: goto L_0x01db;
                case 46: goto L_0x01cb;
                case 47: goto L_0x01bb;
                case 48: goto L_0x01ab;
                case 49: goto L_0x0198;
                case 50: goto L_0x018f;
                case 51: goto L_0x0180;
                case 52: goto L_0x0171;
                case 53: goto L_0x0162;
                case 54: goto L_0x0153;
                case 55: goto L_0x0144;
                case 56: goto L_0x0135;
                case 57: goto L_0x0126;
                case 58: goto L_0x0117;
                case 59: goto L_0x0108;
                case 60: goto L_0x00f5;
                case 61: goto L_0x00e5;
                case 62: goto L_0x00d7;
                case 63: goto L_0x00c9;
                case 64: goto L_0x00bb;
                case 65: goto L_0x00ad;
                case 66: goto L_0x009f;
                case 67: goto L_0x0091;
                case 68: goto L_0x007f;
                default: goto L_0x007c;
            }
        L_0x007c:
            r13 = 0
            goto L_0x0486
        L_0x007f:
            boolean r4 = r0.B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.Z r8 = r0.p(r10)
            r2.K(r14, r4, r8)
            goto L_0x007c
        L_0x0091:
            boolean r4 = r0.B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = R(r1, r8)
            r2.m(r14, r8)
            goto L_0x007c
        L_0x009f:
            boolean r4 = r0.B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = Q(r1, r8)
            r2.H(r14, r4)
            goto L_0x007c
        L_0x00ad:
            boolean r4 = r0.B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = R(r1, r8)
            r2.i(r14, r8)
            goto L_0x007c
        L_0x00bb:
            boolean r4 = r0.B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = Q(r1, r8)
            r2.w(r14, r4)
            goto L_0x007c
        L_0x00c9:
            boolean r4 = r0.B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = Q(r1, r8)
            r2.E(r14, r4)
            goto L_0x007c
        L_0x00d7:
            boolean r4 = r0.B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = Q(r1, r8)
            r2.o(r14, r4)
            goto L_0x007c
        L_0x00e5:
            boolean r4 = r0.B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.f r4 = (com.google.protobuf.C4868f) r4
            r2.L(r14, r4)
            goto L_0x007c
        L_0x00f5:
            boolean r4 = r0.B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.Z r8 = r0.p(r10)
            r2.N(r14, r4, r8)
            goto L_0x007c
        L_0x0108:
            boolean r4 = r0.B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.c0(r14, r4, r2)
            goto L_0x007c
        L_0x0117:
            boolean r4 = r0.B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            boolean r4 = N(r1, r8)
            r2.v(r14, r4)
            goto L_0x007c
        L_0x0126:
            boolean r4 = r0.B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = Q(r1, r8)
            r2.c(r14, r4)
            goto L_0x007c
        L_0x0135:
            boolean r4 = r0.B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = R(r1, r8)
            r2.s(r14, r8)
            goto L_0x007c
        L_0x0144:
            boolean r4 = r0.B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = Q(r1, r8)
            r2.h(r14, r4)
            goto L_0x007c
        L_0x0153:
            boolean r4 = r0.B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = R(r1, r8)
            r2.f(r14, r8)
            goto L_0x007c
        L_0x0162:
            boolean r4 = r0.B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = R(r1, r8)
            r2.u(r14, r8)
            goto L_0x007c
        L_0x0171:
            boolean r4 = r0.B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            float r4 = P(r1, r8)
            r2.B(r14, r4)
            goto L_0x007c
        L_0x0180:
            boolean r4 = r0.B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            double r8 = O(r1, r8)
            r2.p(r14, r8)
            goto L_0x007c
        L_0x018f:
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.b0(r2, r14, r4, r10)
            goto L_0x007c
        L_0x0198:
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.Z r9 = r0.p(r10)
            com.google.protobuf.b0.R(r4, r8, r2, r9)
            goto L_0x007c
        L_0x01ab:
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.protobuf.b0.Y(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01bb:
            r13 = 1
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.X(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01cb:
            r13 = 1
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.W(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01db:
            r13 = 1
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.V(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01eb:
            r13 = 1
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.N(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01fb:
            r13 = 1
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.a0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x020b:
            r13 = 1
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.K(r4, r8, r2, r13)
            goto L_0x007c
        L_0x021b:
            r13 = 1
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.O(r4, r8, r2, r13)
            goto L_0x007c
        L_0x022b:
            r13 = 1
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.P(r4, r8, r2, r13)
            goto L_0x007c
        L_0x023b:
            r13 = 1
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.S(r4, r8, r2, r13)
            goto L_0x007c
        L_0x024b:
            r13 = 1
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.b0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x025b:
            r13 = 1
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.T(r4, r8, r2, r13)
            goto L_0x007c
        L_0x026b:
            r13 = 1
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.Q(r4, r8, r2, r13)
            goto L_0x007c
        L_0x027b:
            r13 = 1
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.M(r4, r8, r2, r13)
            goto L_0x007c
        L_0x028b:
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.protobuf.b0.Y(r4, r8, r2, r13)
            goto L_0x0486
        L_0x029b:
            r13 = 0
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.X(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02ab:
            r13 = 0
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.W(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02bb:
            r13 = 0
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.V(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02cb:
            r13 = 0
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.N(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02db:
            r13 = 0
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.a0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02eb:
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.L(r4, r8, r2)
            goto L_0x007c
        L_0x02fa:
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.Z r9 = r0.p(r10)
            com.google.protobuf.b0.U(r4, r8, r2, r9)
            goto L_0x007c
        L_0x030d:
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.Z(r4, r8, r2)
            goto L_0x007c
        L_0x031c:
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.protobuf.b0.K(r4, r8, r2, r13)
            goto L_0x0486
        L_0x032c:
            r13 = 0
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.O(r4, r8, r2, r13)
            goto L_0x0486
        L_0x033c:
            r13 = 0
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.P(r4, r8, r2, r13)
            goto L_0x0486
        L_0x034c:
            r13 = 0
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.S(r4, r8, r2, r13)
            goto L_0x0486
        L_0x035c:
            r13 = 0
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.b0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x036c:
            r13 = 0
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.T(r4, r8, r2, r13)
            goto L_0x0486
        L_0x037c:
            r13 = 0
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.Q(r4, r8, r2, r13)
            goto L_0x0486
        L_0x038c:
            r13 = 0
            int r4 = r0.L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.b0.M(r4, r8, r2, r13)
            goto L_0x0486
        L_0x039c:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.Z r8 = r0.p(r10)
            r2.K(r14, r4, r8)
            goto L_0x0486
        L_0x03ad:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.m(r14, r8)
            goto L_0x0486
        L_0x03ba:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.H(r14, r4)
            goto L_0x0486
        L_0x03c7:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.i(r14, r8)
            goto L_0x0486
        L_0x03d4:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.w(r14, r4)
            goto L_0x0486
        L_0x03e1:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.E(r14, r4)
            goto L_0x0486
        L_0x03ee:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.o(r14, r4)
            goto L_0x0486
        L_0x03fb:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.f r4 = (com.google.protobuf.C4868f) r4
            r2.L(r14, r4)
            goto L_0x0486
        L_0x040a:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.Z r8 = r0.p(r10)
            r2.N(r14, r4, r8)
            goto L_0x0486
        L_0x041b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.c0(r14, r4, r2)
            goto L_0x0486
        L_0x0427:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            boolean r4 = j(r1, r8)
            r2.v(r14, r4)
            goto L_0x0486
        L_0x0433:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.c(r14, r4)
            goto L_0x0486
        L_0x043f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.s(r14, r8)
            goto L_0x0486
        L_0x044b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.h(r14, r4)
            goto L_0x0486
        L_0x0457:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.f(r14, r8)
            goto L_0x0486
        L_0x0463:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.u(r14, r8)
            goto L_0x0486
        L_0x046f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            float r4 = n(r1, r8)
            r2.B(r14, r4)
            goto L_0x0486
        L_0x047b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            double r8 = l(r1, r8)
            r2.p(r14, r8)
        L_0x0486:
            int r10 = r10 + 3
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x002e
        L_0x048d:
            if (r5 == 0) goto L_0x04a4
            com.google.protobuf.l r4 = r0.f58406p
            r4.f(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a2
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x048d
        L_0x04a2:
            r5 = 0
            goto L_0x048d
        L_0x04a4:
            com.google.protobuf.g0 r3 = r0.f58405o
            r0.d0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.N.Y(java.lang.Object, com.google.protobuf.n0):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Z(java.lang.Object r13, com.google.protobuf.n0 r14) {
        /*
            r12 = this;
            boolean r0 = r12.f58396f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            com.google.protobuf.l r0 = r12.f58406p
            com.google.protobuf.o r0 = r0.b(r13)
            boolean r2 = r0.j()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.n()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.f58391a
            int r3 = r3.length
            r4 = 0
            r5 = r4
        L_0x0023:
            if (r5 >= r3) goto L_0x0586
            int r6 = r12.X(r5)
            int r7 = r12.L(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            com.google.protobuf.l r8 = r12.f58406p
            int r8 = r8.a(r2)
            if (r8 > r7) goto L_0x004b
            com.google.protobuf.l r8 = r12.f58406p
            r8.f(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = W(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0571;
                case 1: goto L_0x055f;
                case 2: goto L_0x054d;
                case 3: goto L_0x053b;
                case 4: goto L_0x0529;
                case 5: goto L_0x0517;
                case 6: goto L_0x0505;
                case 7: goto L_0x04f2;
                case 8: goto L_0x04df;
                case 9: goto L_0x04c8;
                case 10: goto L_0x04b3;
                case 11: goto L_0x04a0;
                case 12: goto L_0x048d;
                case 13: goto L_0x047a;
                case 14: goto L_0x0467;
                case 15: goto L_0x0454;
                case 16: goto L_0x0441;
                case 17: goto L_0x042a;
                case 18: goto L_0x0417;
                case 19: goto L_0x0404;
                case 20: goto L_0x03f1;
                case 21: goto L_0x03de;
                case 22: goto L_0x03cb;
                case 23: goto L_0x03b8;
                case 24: goto L_0x03a5;
                case 25: goto L_0x0392;
                case 26: goto L_0x037f;
                case 27: goto L_0x0368;
                case 28: goto L_0x0355;
                case 29: goto L_0x0342;
                case 30: goto L_0x032f;
                case 31: goto L_0x031c;
                case 32: goto L_0x0309;
                case 33: goto L_0x02f6;
                case 34: goto L_0x02e3;
                case 35: goto L_0x02d0;
                case 36: goto L_0x02bd;
                case 37: goto L_0x02aa;
                case 38: goto L_0x0297;
                case 39: goto L_0x0284;
                case 40: goto L_0x0271;
                case 41: goto L_0x025e;
                case 42: goto L_0x024b;
                case 43: goto L_0x0238;
                case 44: goto L_0x0225;
                case 45: goto L_0x0212;
                case 46: goto L_0x01ff;
                case 47: goto L_0x01ec;
                case 48: goto L_0x01d9;
                case 49: goto L_0x01c2;
                case 50: goto L_0x01b5;
                case 51: goto L_0x01a2;
                case 52: goto L_0x018f;
                case 53: goto L_0x017c;
                case 54: goto L_0x0169;
                case 55: goto L_0x0156;
                case 56: goto L_0x0143;
                case 57: goto L_0x0130;
                case 58: goto L_0x011d;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f3;
                case 61: goto L_0x00de;
                case 62: goto L_0x00cb;
                case 63: goto L_0x00b8;
                case 64: goto L_0x00a5;
                case 65: goto L_0x0092;
                case 66: goto L_0x007f;
                case 67: goto L_0x006c;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0582
        L_0x0055:
            boolean r8 = r12.B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            com.google.protobuf.Z r8 = r12.p(r5)
            r14.K(r7, r6, r8)
            goto L_0x0582
        L_0x006c:
            boolean r8 = r12.B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            long r8 = R(r13, r8)
            r14.m(r7, r8)
            goto L_0x0582
        L_0x007f:
            boolean r8 = r12.B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            int r6 = Q(r13, r8)
            r14.H(r7, r6)
            goto L_0x0582
        L_0x0092:
            boolean r8 = r12.B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            long r8 = R(r13, r8)
            r14.i(r7, r8)
            goto L_0x0582
        L_0x00a5:
            boolean r8 = r12.B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            int r6 = Q(r13, r8)
            r14.w(r7, r6)
            goto L_0x0582
        L_0x00b8:
            boolean r8 = r12.B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            int r6 = Q(r13, r8)
            r14.E(r7, r6)
            goto L_0x0582
        L_0x00cb:
            boolean r8 = r12.B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            int r6 = Q(r13, r8)
            r14.o(r7, r6)
            goto L_0x0582
        L_0x00de:
            boolean r8 = r12.B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            com.google.protobuf.f r6 = (com.google.protobuf.C4868f) r6
            r14.L(r7, r6)
            goto L_0x0582
        L_0x00f3:
            boolean r8 = r12.B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            com.google.protobuf.Z r8 = r12.p(r5)
            r14.N(r7, r6, r8)
            goto L_0x0582
        L_0x010a:
            boolean r8 = r12.B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            r12.c0(r7, r6, r14)
            goto L_0x0582
        L_0x011d:
            boolean r8 = r12.B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            boolean r6 = N(r13, r8)
            r14.v(r7, r6)
            goto L_0x0582
        L_0x0130:
            boolean r8 = r12.B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            int r6 = Q(r13, r8)
            r14.c(r7, r6)
            goto L_0x0582
        L_0x0143:
            boolean r8 = r12.B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            long r8 = R(r13, r8)
            r14.s(r7, r8)
            goto L_0x0582
        L_0x0156:
            boolean r8 = r12.B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            int r6 = Q(r13, r8)
            r14.h(r7, r6)
            goto L_0x0582
        L_0x0169:
            boolean r8 = r12.B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            long r8 = R(r13, r8)
            r14.f(r7, r8)
            goto L_0x0582
        L_0x017c:
            boolean r8 = r12.B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            long r8 = R(r13, r8)
            r14.u(r7, r8)
            goto L_0x0582
        L_0x018f:
            boolean r8 = r12.B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            float r6 = P(r13, r8)
            r14.B(r7, r6)
            goto L_0x0582
        L_0x01a2:
            boolean r8 = r12.B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            double r8 = O(r13, r8)
            r14.p(r7, r8)
            goto L_0x0582
        L_0x01b5:
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            r12.b0(r14, r7, r6, r5)
            goto L_0x0582
        L_0x01c2:
            int r7 = r12.L(r5)
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.Z r8 = r12.p(r5)
            com.google.protobuf.b0.R(r7, r6, r14, r8)
            goto L_0x0582
        L_0x01d9:
            int r7 = r12.L(r5)
            long r10 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.Y(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ec:
            int r7 = r12.L(r5)
            long r10 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.X(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ff:
            int r7 = r12.L(r5)
            long r10 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.W(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0212:
            int r7 = r12.L(r5)
            long r10 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.V(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0225:
            int r7 = r12.L(r5)
            long r10 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.N(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0238:
            int r7 = r12.L(r5)
            long r10 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.a0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x024b:
            int r7 = r12.L(r5)
            long r10 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.K(r7, r6, r14, r9)
            goto L_0x0582
        L_0x025e:
            int r7 = r12.L(r5)
            long r10 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.O(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0271:
            int r7 = r12.L(r5)
            long r10 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.P(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0284:
            int r7 = r12.L(r5)
            long r10 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.S(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0297:
            int r7 = r12.L(r5)
            long r10 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.b0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02aa:
            int r7 = r12.L(r5)
            long r10 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.T(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02bd:
            int r7 = r12.L(r5)
            long r10 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.Q(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02d0:
            int r7 = r12.L(r5)
            long r10 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.M(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02e3:
            int r7 = r12.L(r5)
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.Y(r7, r6, r14, r4)
            goto L_0x0582
        L_0x02f6:
            int r7 = r12.L(r5)
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.X(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0309:
            int r7 = r12.L(r5)
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.W(r7, r6, r14, r4)
            goto L_0x0582
        L_0x031c:
            int r7 = r12.L(r5)
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.V(r7, r6, r14, r4)
            goto L_0x0582
        L_0x032f:
            int r7 = r12.L(r5)
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.N(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0342:
            int r7 = r12.L(r5)
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.a0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0355:
            int r7 = r12.L(r5)
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.L(r7, r6, r14)
            goto L_0x0582
        L_0x0368:
            int r7 = r12.L(r5)
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.Z r8 = r12.p(r5)
            com.google.protobuf.b0.U(r7, r6, r14, r8)
            goto L_0x0582
        L_0x037f:
            int r7 = r12.L(r5)
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.Z(r7, r6, r14)
            goto L_0x0582
        L_0x0392:
            int r7 = r12.L(r5)
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.K(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03a5:
            int r7 = r12.L(r5)
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.O(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03b8:
            int r7 = r12.L(r5)
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.P(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03cb:
            int r7 = r12.L(r5)
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.S(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03de:
            int r7 = r12.L(r5)
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.b0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03f1:
            int r7 = r12.L(r5)
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.T(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0404:
            int r7 = r12.L(r5)
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.Q(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0417:
            int r7 = r12.L(r5)
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.b0.M(r7, r6, r14, r4)
            goto L_0x0582
        L_0x042a:
            boolean r8 = r12.u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            com.google.protobuf.Z r8 = r12.p(r5)
            r14.K(r7, r6, r8)
            goto L_0x0582
        L_0x0441:
            boolean r8 = r12.u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            long r8 = E(r13, r8)
            r14.m(r7, r8)
            goto L_0x0582
        L_0x0454:
            boolean r8 = r12.u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            int r6 = t(r13, r8)
            r14.H(r7, r6)
            goto L_0x0582
        L_0x0467:
            boolean r8 = r12.u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            long r8 = E(r13, r8)
            r14.i(r7, r8)
            goto L_0x0582
        L_0x047a:
            boolean r8 = r12.u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            int r6 = t(r13, r8)
            r14.w(r7, r6)
            goto L_0x0582
        L_0x048d:
            boolean r8 = r12.u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            int r6 = t(r13, r8)
            r14.E(r7, r6)
            goto L_0x0582
        L_0x04a0:
            boolean r8 = r12.u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            int r6 = t(r13, r8)
            r14.o(r7, r6)
            goto L_0x0582
        L_0x04b3:
            boolean r8 = r12.u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            com.google.protobuf.f r6 = (com.google.protobuf.C4868f) r6
            r14.L(r7, r6)
            goto L_0x0582
        L_0x04c8:
            boolean r8 = r12.u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            com.google.protobuf.Z r8 = r12.p(r5)
            r14.N(r7, r6, r8)
            goto L_0x0582
        L_0x04df:
            boolean r8 = r12.u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            java.lang.Object r6 = com.google.protobuf.k0.C(r13, r8)
            r12.c0(r7, r6, r14)
            goto L_0x0582
        L_0x04f2:
            boolean r8 = r12.u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            boolean r6 = j(r13, r8)
            r14.v(r7, r6)
            goto L_0x0582
        L_0x0505:
            boolean r8 = r12.u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            int r6 = t(r13, r8)
            r14.c(r7, r6)
            goto L_0x0582
        L_0x0517:
            boolean r8 = r12.u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            long r8 = E(r13, r8)
            r14.s(r7, r8)
            goto L_0x0582
        L_0x0529:
            boolean r8 = r12.u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            int r6 = t(r13, r8)
            r14.h(r7, r6)
            goto L_0x0582
        L_0x053b:
            boolean r8 = r12.u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            long r8 = E(r13, r8)
            r14.f(r7, r8)
            goto L_0x0582
        L_0x054d:
            boolean r8 = r12.u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            long r8 = E(r13, r8)
            r14.u(r7, r8)
            goto L_0x0582
        L_0x055f:
            boolean r8 = r12.u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            float r6 = n(r13, r8)
            r14.B(r7, r6)
            goto L_0x0582
        L_0x0571:
            boolean r8 = r12.u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = M(r6)
            double r8 = l(r13, r8)
            r14.p(r7, r8)
        L_0x0582:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x0586:
            if (r2 == 0) goto L_0x059c
            com.google.protobuf.l r3 = r12.f58406p
            r3.f(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x059a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0586
        L_0x059a:
            r2 = r1
            goto L_0x0586
        L_0x059c:
            com.google.protobuf.g0 r0 = r12.f58405o
            r12.d0(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.N.Z(java.lang.Object, com.google.protobuf.n0):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a0(java.lang.Object r11, com.google.protobuf.n0 r12) {
        /*
            r10 = this;
            com.google.protobuf.g0 r0 = r10.f58405o
            r10.d0(r0, r11, r12)
            boolean r0 = r10.f58396f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            com.google.protobuf.l r0 = r10.f58406p
            com.google.protobuf.o r0 = r0.b(r11)
            boolean r2 = r0.j()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.e()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f58391a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x058c
            int r4 = r10.X(r3)
            int r5 = r10.L(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            com.google.protobuf.l r6 = r10.f58406p
            int r6 = r6.a(r2)
            if (r6 <= r5) goto L_0x0050
            com.google.protobuf.l r6 = r10.f58406p
            r6.f(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = W(r4)
            r7 = 0
            r8 = 1
            switch(r6) {
                case 0: goto L_0x0577;
                case 1: goto L_0x0565;
                case 2: goto L_0x0553;
                case 3: goto L_0x0541;
                case 4: goto L_0x052f;
                case 5: goto L_0x051d;
                case 6: goto L_0x050b;
                case 7: goto L_0x04f8;
                case 8: goto L_0x04e5;
                case 9: goto L_0x04ce;
                case 10: goto L_0x04b9;
                case 11: goto L_0x04a6;
                case 12: goto L_0x0493;
                case 13: goto L_0x0480;
                case 14: goto L_0x046d;
                case 15: goto L_0x045a;
                case 16: goto L_0x0447;
                case 17: goto L_0x0430;
                case 18: goto L_0x041d;
                case 19: goto L_0x040a;
                case 20: goto L_0x03f7;
                case 21: goto L_0x03e4;
                case 22: goto L_0x03d1;
                case 23: goto L_0x03be;
                case 24: goto L_0x03ab;
                case 25: goto L_0x0398;
                case 26: goto L_0x0385;
                case 27: goto L_0x036e;
                case 28: goto L_0x035b;
                case 29: goto L_0x0348;
                case 30: goto L_0x0335;
                case 31: goto L_0x0322;
                case 32: goto L_0x030f;
                case 33: goto L_0x02fc;
                case 34: goto L_0x02e9;
                case 35: goto L_0x02d6;
                case 36: goto L_0x02c3;
                case 37: goto L_0x02b0;
                case 38: goto L_0x029d;
                case 39: goto L_0x028a;
                case 40: goto L_0x0277;
                case 41: goto L_0x0264;
                case 42: goto L_0x0251;
                case 43: goto L_0x023e;
                case 44: goto L_0x022b;
                case 45: goto L_0x0218;
                case 46: goto L_0x0205;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01df;
                case 49: goto L_0x01c8;
                case 50: goto L_0x01bb;
                case 51: goto L_0x01a8;
                case 52: goto L_0x0195;
                case 53: goto L_0x0182;
                case 54: goto L_0x016f;
                case 55: goto L_0x015c;
                case 56: goto L_0x0149;
                case 57: goto L_0x0136;
                case 58: goto L_0x0123;
                case 59: goto L_0x0110;
                case 60: goto L_0x00f9;
                case 61: goto L_0x00e4;
                case 62: goto L_0x00d1;
                case 63: goto L_0x00be;
                case 64: goto L_0x00ab;
                case 65: goto L_0x0098;
                case 66: goto L_0x0085;
                case 67: goto L_0x0072;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0588
        L_0x005b:
            boolean r6 = r10.B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            com.google.protobuf.Z r6 = r10.p(r3)
            r12.K(r5, r4, r6)
            goto L_0x0588
        L_0x0072:
            boolean r6 = r10.B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            long r6 = R(r11, r6)
            r12.m(r5, r6)
            goto L_0x0588
        L_0x0085:
            boolean r6 = r10.B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            int r4 = Q(r11, r6)
            r12.H(r5, r4)
            goto L_0x0588
        L_0x0098:
            boolean r6 = r10.B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            long r6 = R(r11, r6)
            r12.i(r5, r6)
            goto L_0x0588
        L_0x00ab:
            boolean r6 = r10.B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            int r4 = Q(r11, r6)
            r12.w(r5, r4)
            goto L_0x0588
        L_0x00be:
            boolean r6 = r10.B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            int r4 = Q(r11, r6)
            r12.E(r5, r4)
            goto L_0x0588
        L_0x00d1:
            boolean r6 = r10.B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            int r4 = Q(r11, r6)
            r12.o(r5, r4)
            goto L_0x0588
        L_0x00e4:
            boolean r6 = r10.B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            com.google.protobuf.f r4 = (com.google.protobuf.C4868f) r4
            r12.L(r5, r4)
            goto L_0x0588
        L_0x00f9:
            boolean r6 = r10.B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            com.google.protobuf.Z r6 = r10.p(r3)
            r12.N(r5, r4, r6)
            goto L_0x0588
        L_0x0110:
            boolean r6 = r10.B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            r10.c0(r5, r4, r12)
            goto L_0x0588
        L_0x0123:
            boolean r6 = r10.B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            boolean r4 = N(r11, r6)
            r12.v(r5, r4)
            goto L_0x0588
        L_0x0136:
            boolean r6 = r10.B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            int r4 = Q(r11, r6)
            r12.c(r5, r4)
            goto L_0x0588
        L_0x0149:
            boolean r6 = r10.B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            long r6 = R(r11, r6)
            r12.s(r5, r6)
            goto L_0x0588
        L_0x015c:
            boolean r6 = r10.B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            int r4 = Q(r11, r6)
            r12.h(r5, r4)
            goto L_0x0588
        L_0x016f:
            boolean r6 = r10.B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            long r6 = R(r11, r6)
            r12.f(r5, r6)
            goto L_0x0588
        L_0x0182:
            boolean r6 = r10.B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            long r6 = R(r11, r6)
            r12.u(r5, r6)
            goto L_0x0588
        L_0x0195:
            boolean r6 = r10.B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            float r4 = P(r11, r6)
            r12.B(r5, r4)
            goto L_0x0588
        L_0x01a8:
            boolean r6 = r10.B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            double r6 = O(r11, r6)
            r12.p(r5, r6)
            goto L_0x0588
        L_0x01bb:
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            r10.b0(r12, r5, r4, r3)
            goto L_0x0588
        L_0x01c8:
            int r5 = r10.L(r3)
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.Z r6 = r10.p(r3)
            com.google.protobuf.b0.R(r5, r4, r12, r6)
            goto L_0x0588
        L_0x01df:
            int r5 = r10.L(r3)
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.Y(r5, r4, r12, r8)
            goto L_0x0588
        L_0x01f2:
            int r5 = r10.L(r3)
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.X(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0205:
            int r5 = r10.L(r3)
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.W(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0218:
            int r5 = r10.L(r3)
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.V(r5, r4, r12, r8)
            goto L_0x0588
        L_0x022b:
            int r5 = r10.L(r3)
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.N(r5, r4, r12, r8)
            goto L_0x0588
        L_0x023e:
            int r5 = r10.L(r3)
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.a0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0251:
            int r5 = r10.L(r3)
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.K(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0264:
            int r5 = r10.L(r3)
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.O(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0277:
            int r5 = r10.L(r3)
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.P(r5, r4, r12, r8)
            goto L_0x0588
        L_0x028a:
            int r5 = r10.L(r3)
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.S(r5, r4, r12, r8)
            goto L_0x0588
        L_0x029d:
            int r5 = r10.L(r3)
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.b0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02b0:
            int r5 = r10.L(r3)
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.T(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02c3:
            int r5 = r10.L(r3)
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.Q(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02d6:
            int r5 = r10.L(r3)
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.M(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02e9:
            int r5 = r10.L(r3)
            long r8 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.Y(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02fc:
            int r5 = r10.L(r3)
            long r8 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.X(r5, r4, r12, r7)
            goto L_0x0588
        L_0x030f:
            int r5 = r10.L(r3)
            long r8 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.W(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0322:
            int r5 = r10.L(r3)
            long r8 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.V(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0335:
            int r5 = r10.L(r3)
            long r8 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.N(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0348:
            int r5 = r10.L(r3)
            long r8 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.a0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x035b:
            int r5 = r10.L(r3)
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.L(r5, r4, r12)
            goto L_0x0588
        L_0x036e:
            int r5 = r10.L(r3)
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.Z r6 = r10.p(r3)
            com.google.protobuf.b0.U(r5, r4, r12, r6)
            goto L_0x0588
        L_0x0385:
            int r5 = r10.L(r3)
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.Z(r5, r4, r12)
            goto L_0x0588
        L_0x0398:
            int r5 = r10.L(r3)
            long r8 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.K(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03ab:
            int r5 = r10.L(r3)
            long r8 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.O(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03be:
            int r5 = r10.L(r3)
            long r8 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.P(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03d1:
            int r5 = r10.L(r3)
            long r8 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.S(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03e4:
            int r5 = r10.L(r3)
            long r8 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.b0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03f7:
            int r5 = r10.L(r3)
            long r8 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.T(r5, r4, r12, r7)
            goto L_0x0588
        L_0x040a:
            int r5 = r10.L(r3)
            long r8 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.Q(r5, r4, r12, r7)
            goto L_0x0588
        L_0x041d:
            int r5 = r10.L(r3)
            long r8 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.b0.M(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0430:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            com.google.protobuf.Z r6 = r10.p(r3)
            r12.K(r5, r4, r6)
            goto L_0x0588
        L_0x0447:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            long r6 = E(r11, r6)
            r12.m(r5, r6)
            goto L_0x0588
        L_0x045a:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            int r4 = t(r11, r6)
            r12.H(r5, r4)
            goto L_0x0588
        L_0x046d:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            long r6 = E(r11, r6)
            r12.i(r5, r6)
            goto L_0x0588
        L_0x0480:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            int r4 = t(r11, r6)
            r12.w(r5, r4)
            goto L_0x0588
        L_0x0493:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            int r4 = t(r11, r6)
            r12.E(r5, r4)
            goto L_0x0588
        L_0x04a6:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            int r4 = t(r11, r6)
            r12.o(r5, r4)
            goto L_0x0588
        L_0x04b9:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            com.google.protobuf.f r4 = (com.google.protobuf.C4868f) r4
            r12.L(r5, r4)
            goto L_0x0588
        L_0x04ce:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            com.google.protobuf.Z r6 = r10.p(r3)
            r12.N(r5, r4, r6)
            goto L_0x0588
        L_0x04e5:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            java.lang.Object r4 = com.google.protobuf.k0.C(r11, r6)
            r10.c0(r5, r4, r12)
            goto L_0x0588
        L_0x04f8:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            boolean r4 = j(r11, r6)
            r12.v(r5, r4)
            goto L_0x0588
        L_0x050b:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            int r4 = t(r11, r6)
            r12.c(r5, r4)
            goto L_0x0588
        L_0x051d:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            long r6 = E(r11, r6)
            r12.s(r5, r6)
            goto L_0x0588
        L_0x052f:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            int r4 = t(r11, r6)
            r12.h(r5, r4)
            goto L_0x0588
        L_0x0541:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            long r6 = E(r11, r6)
            r12.f(r5, r6)
            goto L_0x0588
        L_0x0553:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            long r6 = E(r11, r6)
            r12.u(r5, r6)
            goto L_0x0588
        L_0x0565:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            float r4 = n(r11, r6)
            r12.B(r5, r4)
            goto L_0x0588
        L_0x0577:
            boolean r6 = r10.u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = M(r4)
            double r6 = l(r11, r6)
            r12.p(r5, r6)
        L_0x0588:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x058c:
            if (r2 == 0) goto L_0x05a3
            com.google.protobuf.l r11 = r10.f58406p
            r11.f(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x05a1
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L_0x058c
        L_0x05a1:
            r2 = r1
            goto L_0x058c
        L_0x05a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.N.a0(java.lang.Object, com.google.protobuf.n0):void");
    }

    private void b0(n0 n0Var, int i10, Object obj, int i11) {
        if (obj != null) {
            n0Var.O(i10, this.f58407q.b(o(i11)), this.f58407q.c(obj));
        }
    }

    private void c0(int i10, Object obj, n0 n0Var) {
        if (obj instanceof String) {
            n0Var.e(i10, (String) obj);
        } else {
            n0Var.L(i10, (C4868f) obj);
        }
    }

    private void d0(g0 g0Var, Object obj, n0 n0Var) {
        g0Var.h(g0Var.a(obj), n0Var);
    }

    private boolean i(Object obj, Object obj2, int i10) {
        if (u(obj, i10) == u(obj2, i10)) {
            return true;
        }
        return false;
    }

    private static boolean j(Object obj, long j10) {
        return k0.r(obj, j10);
    }

    private static void k(Object obj) {
        if (!z(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    private static double l(Object obj, long j10) {
        return k0.x(obj, j10);
    }

    private boolean m(Object obj, Object obj2, int i10) {
        int X10 = X(i10);
        long M10 = M(X10);
        switch (W(X10)) {
            case 0:
                if (!i(obj, obj2, i10) || Double.doubleToLongBits(k0.x(obj, M10)) != Double.doubleToLongBits(k0.x(obj2, M10))) {
                    return false;
                }
                return true;
            case 1:
                if (!i(obj, obj2, i10) || Float.floatToIntBits(k0.y(obj, M10)) != Float.floatToIntBits(k0.y(obj2, M10))) {
                    return false;
                }
                return true;
            case 2:
                if (!i(obj, obj2, i10) || k0.A(obj, M10) != k0.A(obj2, M10)) {
                    return false;
                }
                return true;
            case 3:
                if (!i(obj, obj2, i10) || k0.A(obj, M10) != k0.A(obj2, M10)) {
                    return false;
                }
                return true;
            case 4:
                if (!i(obj, obj2, i10) || k0.z(obj, M10) != k0.z(obj2, M10)) {
                    return false;
                }
                return true;
            case 5:
                if (!i(obj, obj2, i10) || k0.A(obj, M10) != k0.A(obj2, M10)) {
                    return false;
                }
                return true;
            case 6:
                if (!i(obj, obj2, i10) || k0.z(obj, M10) != k0.z(obj2, M10)) {
                    return false;
                }
                return true;
            case 7:
                if (!i(obj, obj2, i10) || k0.r(obj, M10) != k0.r(obj2, M10)) {
                    return false;
                }
                return true;
            case 8:
                if (!i(obj, obj2, i10) || !b0.I(k0.C(obj, M10), k0.C(obj2, M10))) {
                    return false;
                }
                return true;
            case 9:
                if (!i(obj, obj2, i10) || !b0.I(k0.C(obj, M10), k0.C(obj2, M10))) {
                    return false;
                }
                return true;
            case 10:
                if (!i(obj, obj2, i10) || !b0.I(k0.C(obj, M10), k0.C(obj2, M10))) {
                    return false;
                }
                return true;
            case 11:
                if (!i(obj, obj2, i10) || k0.z(obj, M10) != k0.z(obj2, M10)) {
                    return false;
                }
                return true;
            case 12:
                if (!i(obj, obj2, i10) || k0.z(obj, M10) != k0.z(obj2, M10)) {
                    return false;
                }
                return true;
            case 13:
                if (!i(obj, obj2, i10) || k0.z(obj, M10) != k0.z(obj2, M10)) {
                    return false;
                }
                return true;
            case StdKeyDeserializer.TYPE_URL:
                if (!i(obj, obj2, i10) || k0.A(obj, M10) != k0.A(obj2, M10)) {
                    return false;
                }
                return true;
            case StdKeyDeserializer.TYPE_CLASS:
                if (!i(obj, obj2, i10) || k0.z(obj, M10) != k0.z(obj2, M10)) {
                    return false;
                }
                return true;
            case 16:
                if (!i(obj, obj2, i10) || k0.A(obj, M10) != k0.A(obj2, M10)) {
                    return false;
                }
                return true;
            case 17:
                if (!i(obj, obj2, i10) || !b0.I(k0.C(obj, M10), k0.C(obj2, M10))) {
                    return false;
                }
                return true;
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case c.f37660h:
            case CharsToNameCanonicalizer.HASH_MULT:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case Carousel.ENTITY_TYPE /*44*/:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return b0.I(k0.C(obj, M10), k0.C(obj2, M10));
            case 50:
                return b0.I(k0.C(obj, M10), k0.C(obj2, M10));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!A(obj, obj2, i10) || !b0.I(k0.C(obj, M10), k0.C(obj2, M10))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    private static float n(Object obj, long j10) {
        return k0.y(obj, j10);
    }

    private Object o(int i10) {
        return this.f58392b[(i10 / 3) * 2];
    }

    private Z p(int i10) {
        int i11 = (i10 / 3) * 2;
        Z z10 = (Z) this.f58392b[i11];
        if (z10 != null) {
            return z10;
        }
        Z c10 = W.a().c((Class) this.f58392b[i11 + 1]);
        this.f58392b[i11] = c10;
        return c10;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x034c, code lost:
        r6 = r6 + r3;
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x051b, code lost:
        r5 = r5 + 3;
        r4 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ae, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01bb, code lost:
        r4 = (r4 + r9) + r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int q(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f58390s
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r4
            r5 = 0
            r6 = 0
            r8 = 0
        L_0x000d:
            int[] r9 = r0.f58391a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x0522
            int r9 = r0.X(r5)
            int r10 = r0.L(r5)
            int r11 = W(r9)
            r12 = 17
            r13 = 1
            if (r11 > r12) goto L_0x0038
            int[] r12 = r0.f58391a
            int r14 = r5 + 2
            r12 = r12[r14]
            r14 = r12 & r4
            int r15 = r12 >>> 20
            int r15 = r13 << r15
            if (r14 == r7) goto L_0x0057
            long r7 = (long) r14
            int r8 = r2.getInt(r1, r7)
            r7 = r14
            goto L_0x0057
        L_0x0038:
            boolean r12 = r0.f58399i
            if (r12 == 0) goto L_0x0055
            com.google.protobuf.p r12 = com.google.protobuf.C4878p.DOUBLE_LIST_PACKED
            int r12 = r12.b()
            if (r11 < r12) goto L_0x0055
            com.google.protobuf.p r12 = com.google.protobuf.C4878p.SINT64_LIST_PACKED
            int r12 = r12.b()
            if (r11 > r12) goto L_0x0055
            int[] r12 = r0.f58391a
            int r14 = r5 + 2
            r12 = r12[r14]
            r12 = r12 & r4
        L_0x0053:
            r15 = 0
            goto L_0x0057
        L_0x0055:
            r12 = 0
            goto L_0x0053
        L_0x0057:
            long r13 = M(r9)
            r9 = 0
            r3 = 0
            switch(r11) {
                case 0: goto L_0x050f;
                case 1: goto L_0x0505;
                case 2: goto L_0x04f7;
                case 3: goto L_0x04e9;
                case 4: goto L_0x04db;
                case 5: goto L_0x04d1;
                case 6: goto L_0x04c6;
                case 7: goto L_0x04bb;
                case 8: goto L_0x049f;
                case 9: goto L_0x048d;
                case 10: goto L_0x047d;
                case 11: goto L_0x046f;
                case 12: goto L_0x0461;
                case 13: goto L_0x0456;
                case 14: goto L_0x044c;
                case 15: goto L_0x043e;
                case 16: goto L_0x0430;
                case 17: goto L_0x041c;
                case 18: goto L_0x040f;
                case 19: goto L_0x0402;
                case 20: goto L_0x03f5;
                case 21: goto L_0x03e8;
                case 22: goto L_0x03db;
                case 23: goto L_0x03ce;
                case 24: goto L_0x03c1;
                case 25: goto L_0x03b5;
                case 26: goto L_0x03a9;
                case 27: goto L_0x0399;
                case 28: goto L_0x038d;
                case 29: goto L_0x0380;
                case 30: goto L_0x0374;
                case 31: goto L_0x0368;
                case 32: goto L_0x035c;
                case 33: goto L_0x0350;
                case 34: goto L_0x0341;
                case 35: goto L_0x0323;
                case 36: goto L_0x0305;
                case 37: goto L_0x02e7;
                case 38: goto L_0x02c9;
                case 39: goto L_0x02ab;
                case 40: goto L_0x028d;
                case 41: goto L_0x026f;
                case 42: goto L_0x0251;
                case 43: goto L_0x0233;
                case 44: goto L_0x0216;
                case 45: goto L_0x01f9;
                case 46: goto L_0x01dc;
                case 47: goto L_0x01bf;
                case 48: goto L_0x019f;
                case 49: goto L_0x018f;
                case 50: goto L_0x017f;
                case 51: goto L_0x0171;
                case 52: goto L_0x0165;
                case 53: goto L_0x0155;
                case 54: goto L_0x0145;
                case 55: goto L_0x0135;
                case 56: goto L_0x0129;
                case 57: goto L_0x011d;
                case 58: goto L_0x0110;
                case 59: goto L_0x00f2;
                case 60: goto L_0x00df;
                case 61: goto L_0x00ce;
                case 62: goto L_0x00bf;
                case 63: goto L_0x00b0;
                case 64: goto L_0x00a3;
                case 65: goto L_0x0098;
                case 66: goto L_0x0089;
                case 67: goto L_0x007a;
                case 68: goto L_0x0062;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x0077
        L_0x0062:
            boolean r3 = r0.B(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.K r3 = (com.google.protobuf.K) r3
            com.google.protobuf.Z r4 = r0.p(r5)
            int r3 = com.google.protobuf.C4870h.s(r10, r3, r4)
        L_0x0076:
            int r6 = r6 + r3
        L_0x0077:
            r11 = 0
            goto L_0x051b
        L_0x007a:
            boolean r3 = r0.B(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            long r3 = R(r1, r13)
            int r3 = com.google.protobuf.C4870h.K(r10, r3)
            goto L_0x0076
        L_0x0089:
            boolean r3 = r0.B(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            int r3 = Q(r1, r13)
            int r3 = com.google.protobuf.C4870h.I(r10, r3)
            goto L_0x0076
        L_0x0098:
            boolean r9 = r0.B(r1, r10, r5)
            if (r9 == 0) goto L_0x0077
            int r3 = com.google.protobuf.C4870h.G(r10, r3)
            goto L_0x0076
        L_0x00a3:
            boolean r3 = r0.B(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            r3 = 0
            int r4 = com.google.protobuf.C4870h.E(r10, r3)
        L_0x00ae:
            int r6 = r6 + r4
            goto L_0x0077
        L_0x00b0:
            boolean r3 = r0.B(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            int r3 = Q(r1, r13)
            int r3 = com.google.protobuf.C4870h.k(r10, r3)
            goto L_0x0076
        L_0x00bf:
            boolean r3 = r0.B(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            int r3 = Q(r1, r13)
            int r3 = com.google.protobuf.C4870h.P(r10, r3)
            goto L_0x0076
        L_0x00ce:
            boolean r3 = r0.B(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.f r3 = (com.google.protobuf.C4868f) r3
            int r3 = com.google.protobuf.C4870h.g(r10, r3)
            goto L_0x0076
        L_0x00df:
            boolean r3 = r0.B(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.Z r4 = r0.p(r5)
            int r3 = com.google.protobuf.b0.o(r10, r3, r4)
            goto L_0x0076
        L_0x00f2:
            boolean r3 = r0.B(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.protobuf.C4868f
            if (r4 == 0) goto L_0x0108
            com.google.protobuf.f r3 = (com.google.protobuf.C4868f) r3
            int r3 = com.google.protobuf.C4870h.g(r10, r3)
            goto L_0x0076
        L_0x0108:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.C4870h.M(r10, r3)
            goto L_0x0076
        L_0x0110:
            boolean r3 = r0.B(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            r3 = 1
            int r3 = com.google.protobuf.C4870h.d(r10, r3)
            goto L_0x0076
        L_0x011d:
            boolean r3 = r0.B(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            r3 = 0
            int r4 = com.google.protobuf.C4870h.m(r10, r3)
            goto L_0x00ae
        L_0x0129:
            boolean r9 = r0.B(r1, r10, r5)
            if (r9 == 0) goto L_0x0077
            int r3 = com.google.protobuf.C4870h.o(r10, r3)
            goto L_0x0076
        L_0x0135:
            boolean r3 = r0.B(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            int r3 = Q(r1, r13)
            int r3 = com.google.protobuf.C4870h.v(r10, r3)
            goto L_0x0076
        L_0x0145:
            boolean r3 = r0.B(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            long r3 = R(r1, r13)
            int r3 = com.google.protobuf.C4870h.R(r10, r3)
            goto L_0x0076
        L_0x0155:
            boolean r3 = r0.B(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            long r3 = R(r1, r13)
            int r3 = com.google.protobuf.C4870h.x(r10, r3)
            goto L_0x0076
        L_0x0165:
            boolean r3 = r0.B(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            int r3 = com.google.protobuf.C4870h.q(r10, r9)
            goto L_0x0076
        L_0x0171:
            boolean r3 = r0.B(r1, r10, r5)
            if (r3 == 0) goto L_0x0077
            r3 = 0
            int r3 = com.google.protobuf.C4870h.i(r10, r3)
            goto L_0x0076
        L_0x017f:
            com.google.protobuf.F r3 = r0.f58407q
            java.lang.Object r4 = r2.getObject(r1, r13)
            java.lang.Object r9 = r0.o(r5)
            int r3 = r3.e(r10, r4, r9)
            goto L_0x0076
        L_0x018f:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.Z r4 = r0.p(r5)
            int r3 = com.google.protobuf.b0.j(r10, r3, r4)
            goto L_0x0076
        L_0x019f:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.t(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f58399i
            if (r4 == 0) goto L_0x01b3
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x01b3:
            int r4 = com.google.protobuf.C4870h.O(r10)
            int r9 = com.google.protobuf.C4870h.Q(r3)
        L_0x01bb:
            int r4 = r4 + r9
            int r4 = r4 + r3
            goto L_0x00ae
        L_0x01bf:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.r(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f58399i
            if (r4 == 0) goto L_0x01d3
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x01d3:
            int r4 = com.google.protobuf.C4870h.O(r10)
            int r9 = com.google.protobuf.C4870h.Q(r3)
            goto L_0x01bb
        L_0x01dc:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.i(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f58399i
            if (r4 == 0) goto L_0x01f0
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x01f0:
            int r4 = com.google.protobuf.C4870h.O(r10)
            int r9 = com.google.protobuf.C4870h.Q(r3)
            goto L_0x01bb
        L_0x01f9:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.g(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f58399i
            if (r4 == 0) goto L_0x020d
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x020d:
            int r4 = com.google.protobuf.C4870h.O(r10)
            int r9 = com.google.protobuf.C4870h.Q(r3)
            goto L_0x01bb
        L_0x0216:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.e(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f58399i
            if (r4 == 0) goto L_0x022a
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x022a:
            int r4 = com.google.protobuf.C4870h.O(r10)
            int r9 = com.google.protobuf.C4870h.Q(r3)
            goto L_0x01bb
        L_0x0233:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.w(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f58399i
            if (r4 == 0) goto L_0x0247
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x0247:
            int r4 = com.google.protobuf.C4870h.O(r10)
            int r9 = com.google.protobuf.C4870h.Q(r3)
            goto L_0x01bb
        L_0x0251:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.b(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f58399i
            if (r4 == 0) goto L_0x0265
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x0265:
            int r4 = com.google.protobuf.C4870h.O(r10)
            int r9 = com.google.protobuf.C4870h.Q(r3)
            goto L_0x01bb
        L_0x026f:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.g(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f58399i
            if (r4 == 0) goto L_0x0283
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x0283:
            int r4 = com.google.protobuf.C4870h.O(r10)
            int r9 = com.google.protobuf.C4870h.Q(r3)
            goto L_0x01bb
        L_0x028d:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.i(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f58399i
            if (r4 == 0) goto L_0x02a1
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x02a1:
            int r4 = com.google.protobuf.C4870h.O(r10)
            int r9 = com.google.protobuf.C4870h.Q(r3)
            goto L_0x01bb
        L_0x02ab:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.l(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f58399i
            if (r4 == 0) goto L_0x02bf
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x02bf:
            int r4 = com.google.protobuf.C4870h.O(r10)
            int r9 = com.google.protobuf.C4870h.Q(r3)
            goto L_0x01bb
        L_0x02c9:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.y(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f58399i
            if (r4 == 0) goto L_0x02dd
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x02dd:
            int r4 = com.google.protobuf.C4870h.O(r10)
            int r9 = com.google.protobuf.C4870h.Q(r3)
            goto L_0x01bb
        L_0x02e7:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.n(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f58399i
            if (r4 == 0) goto L_0x02fb
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x02fb:
            int r4 = com.google.protobuf.C4870h.O(r10)
            int r9 = com.google.protobuf.C4870h.Q(r3)
            goto L_0x01bb
        L_0x0305:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.g(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f58399i
            if (r4 == 0) goto L_0x0319
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x0319:
            int r4 = com.google.protobuf.C4870h.O(r10)
            int r9 = com.google.protobuf.C4870h.Q(r3)
            goto L_0x01bb
        L_0x0323:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.i(r3)
            if (r3 <= 0) goto L_0x0077
            boolean r4 = r0.f58399i
            if (r4 == 0) goto L_0x0337
            long r12 = (long) r12
            r2.putInt(r1, r12, r3)
        L_0x0337:
            int r4 = com.google.protobuf.C4870h.O(r10)
            int r9 = com.google.protobuf.C4870h.Q(r3)
            goto L_0x01bb
        L_0x0341:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.protobuf.b0.s(r10, r3, r4)
        L_0x034c:
            int r6 = r6 + r3
            r11 = r4
            goto L_0x051b
        L_0x0350:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.q(r10, r3, r4)
            goto L_0x034c
        L_0x035c:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.h(r10, r3, r4)
            goto L_0x034c
        L_0x0368:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.f(r10, r3, r4)
            goto L_0x034c
        L_0x0374:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.d(r10, r3, r4)
            goto L_0x034c
        L_0x0380:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.v(r10, r3, r4)
            goto L_0x0076
        L_0x038d:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.c(r10, r3)
            goto L_0x0076
        L_0x0399:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.Z r4 = r0.p(r5)
            int r3 = com.google.protobuf.b0.p(r10, r3, r4)
            goto L_0x0076
        L_0x03a9:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.u(r10, r3)
            goto L_0x0076
        L_0x03b5:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.protobuf.b0.a(r10, r3, r4)
            goto L_0x034c
        L_0x03c1:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.f(r10, r3, r4)
            goto L_0x034c
        L_0x03ce:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.h(r10, r3, r4)
            goto L_0x034c
        L_0x03db:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.k(r10, r3, r4)
            goto L_0x034c
        L_0x03e8:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.x(r10, r3, r4)
            goto L_0x034c
        L_0x03f5:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.m(r10, r3, r4)
            goto L_0x034c
        L_0x0402:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.f(r10, r3, r4)
            goto L_0x034c
        L_0x040f:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.b0.h(r10, r3, r4)
            goto L_0x0076
        L_0x041c:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.K r3 = (com.google.protobuf.K) r3
            com.google.protobuf.Z r4 = r0.p(r5)
            int r3 = com.google.protobuf.C4870h.s(r10, r3, r4)
            goto L_0x0076
        L_0x0430:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.C4870h.K(r10, r3)
            goto L_0x0076
        L_0x043e:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.C4870h.I(r10, r3)
            goto L_0x0076
        L_0x044c:
            r11 = r8 & r15
            if (r11 == 0) goto L_0x0077
            int r3 = com.google.protobuf.C4870h.G(r10, r3)
            goto L_0x0076
        L_0x0456:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            r3 = 0
            int r4 = com.google.protobuf.C4870h.E(r10, r3)
            goto L_0x00ae
        L_0x0461:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.C4870h.k(r10, r3)
            goto L_0x0076
        L_0x046f:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.C4870h.P(r10, r3)
            goto L_0x0076
        L_0x047d:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.f r3 = (com.google.protobuf.C4868f) r3
            int r3 = com.google.protobuf.C4870h.g(r10, r3)
            goto L_0x0076
        L_0x048d:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.Z r4 = r0.p(r5)
            int r3 = com.google.protobuf.b0.o(r10, r3, r4)
            goto L_0x0076
        L_0x049f:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.protobuf.C4868f
            if (r4 == 0) goto L_0x04b3
            com.google.protobuf.f r3 = (com.google.protobuf.C4868f) r3
            int r3 = com.google.protobuf.C4870h.g(r10, r3)
            goto L_0x0076
        L_0x04b3:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.C4870h.M(r10, r3)
            goto L_0x0076
        L_0x04bb:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            r3 = 1
            int r3 = com.google.protobuf.C4870h.d(r10, r3)
            goto L_0x0076
        L_0x04c6:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0077
            r11 = 0
            int r3 = com.google.protobuf.C4870h.m(r10, r11)
        L_0x04cf:
            int r6 = r6 + r3
            goto L_0x051b
        L_0x04d1:
            r11 = 0
            r9 = r8 & r15
            if (r9 == 0) goto L_0x051b
            int r3 = com.google.protobuf.C4870h.o(r10, r3)
            goto L_0x04cf
        L_0x04db:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x051b
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.C4870h.v(r10, r3)
            goto L_0x04cf
        L_0x04e9:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x051b
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.C4870h.R(r10, r3)
            goto L_0x04cf
        L_0x04f7:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x051b
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.C4870h.x(r10, r3)
            goto L_0x04cf
        L_0x0505:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x051b
            int r3 = com.google.protobuf.C4870h.q(r10, r9)
            goto L_0x04cf
        L_0x050f:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x051b
            r3 = 0
            int r3 = com.google.protobuf.C4870h.i(r10, r3)
            goto L_0x04cf
        L_0x051b:
            int r5 = r5 + 3
            r4 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000d
        L_0x0522:
            com.google.protobuf.g0 r2 = r0.f58405o
            int r2 = r0.s(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f58396f
            if (r2 == 0) goto L_0x0538
            com.google.protobuf.l r2 = r0.f58406p
            com.google.protobuf.o r1 = r2.b(r1)
            int r1 = r1.h()
            int r6 = r6 + r1
        L_0x0538:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.N.q(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int r(java.lang.Object r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f58390s
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x0008:
            int[] r6 = r0.f58391a
            int r6 = r6.length
            if (r4 >= r6) goto L_0x04ed
            int r6 = r15.X(r4)
            int r7 = W(r6)
            int r8 = r15.L(r4)
            long r9 = M(r6)
            com.google.protobuf.p r6 = com.google.protobuf.C4878p.DOUBLE_LIST_PACKED
            int r6 = r6.b()
            if (r7 < r6) goto L_0x0038
            com.google.protobuf.p r6 = com.google.protobuf.C4878p.SINT64_LIST_PACKED
            int r6 = r6.b()
            if (r7 > r6) goto L_0x0038
            int[] r6 = r0.f58391a
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L_0x0039
        L_0x0038:
            r6 = r3
        L_0x0039:
            r13 = 0
            r14 = 1
            r11 = 0
            switch(r7) {
                case 0: goto L_0x04db;
                case 1: goto L_0x04cf;
                case 2: goto L_0x04bf;
                case 3: goto L_0x04af;
                case 4: goto L_0x049f;
                case 5: goto L_0x0493;
                case 6: goto L_0x0487;
                case 7: goto L_0x047b;
                case 8: goto L_0x045d;
                case 9: goto L_0x0449;
                case 10: goto L_0x0437;
                case 11: goto L_0x0427;
                case 12: goto L_0x0417;
                case 13: goto L_0x040b;
                case 14: goto L_0x03ff;
                case 15: goto L_0x03ef;
                case 16: goto L_0x03df;
                case 17: goto L_0x03c9;
                case 18: goto L_0x03bf;
                case 19: goto L_0x03b5;
                case 20: goto L_0x03ab;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0397;
                case 23: goto L_0x038d;
                case 24: goto L_0x0383;
                case 25: goto L_0x0379;
                case 26: goto L_0x036f;
                case 27: goto L_0x0361;
                case 28: goto L_0x0357;
                case 29: goto L_0x034d;
                case 30: goto L_0x0343;
                case 31: goto L_0x0339;
                case 32: goto L_0x032f;
                case 33: goto L_0x0325;
                case 34: goto L_0x031b;
                case 35: goto L_0x02fd;
                case 36: goto L_0x02df;
                case 37: goto L_0x02c1;
                case 38: goto L_0x02a3;
                case 39: goto L_0x0285;
                case 40: goto L_0x0267;
                case 41: goto L_0x0249;
                case 42: goto L_0x022b;
                case 43: goto L_0x020d;
                case 44: goto L_0x01f0;
                case 45: goto L_0x01d3;
                case 46: goto L_0x01b6;
                case 47: goto L_0x0199;
                case 48: goto L_0x0179;
                case 49: goto L_0x016b;
                case 50: goto L_0x015b;
                case 51: goto L_0x014d;
                case 52: goto L_0x0141;
                case 53: goto L_0x0131;
                case 54: goto L_0x0121;
                case 55: goto L_0x0111;
                case 56: goto L_0x0105;
                case 57: goto L_0x00f9;
                case 58: goto L_0x00ed;
                case 59: goto L_0x00cf;
                case 60: goto L_0x00bc;
                case 61: goto L_0x00ab;
                case 62: goto L_0x009c;
                case 63: goto L_0x008d;
                case 64: goto L_0x0082;
                case 65: goto L_0x0077;
                case 66: goto L_0x0068;
                case 67: goto L_0x0059;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x04e9
        L_0x0042:
            boolean r6 = r15.B(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.protobuf.k0.C(r1, r9)
            com.google.protobuf.K r6 = (com.google.protobuf.K) r6
            com.google.protobuf.Z r7 = r15.p(r4)
            int r6 = com.google.protobuf.C4870h.s(r8, r6, r7)
        L_0x0056:
            int r5 = r5 + r6
            goto L_0x04e9
        L_0x0059:
            boolean r6 = r15.B(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = R(r1, r9)
            int r6 = com.google.protobuf.C4870h.K(r8, r6)
            goto L_0x0056
        L_0x0068:
            boolean r6 = r15.B(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = Q(r1, r9)
            int r6 = com.google.protobuf.C4870h.I(r8, r6)
            goto L_0x0056
        L_0x0077:
            boolean r6 = r15.B(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.C4870h.G(r8, r11)
            goto L_0x0056
        L_0x0082:
            boolean r6 = r15.B(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.C4870h.E(r8, r3)
            goto L_0x0056
        L_0x008d:
            boolean r6 = r15.B(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = Q(r1, r9)
            int r6 = com.google.protobuf.C4870h.k(r8, r6)
            goto L_0x0056
        L_0x009c:
            boolean r6 = r15.B(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = Q(r1, r9)
            int r6 = com.google.protobuf.C4870h.P(r8, r6)
            goto L_0x0056
        L_0x00ab:
            boolean r6 = r15.B(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.protobuf.k0.C(r1, r9)
            com.google.protobuf.f r6 = (com.google.protobuf.C4868f) r6
            int r6 = com.google.protobuf.C4870h.g(r8, r6)
            goto L_0x0056
        L_0x00bc:
            boolean r6 = r15.B(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.protobuf.k0.C(r1, r9)
            com.google.protobuf.Z r7 = r15.p(r4)
            int r6 = com.google.protobuf.b0.o(r8, r6, r7)
            goto L_0x0056
        L_0x00cf:
            boolean r6 = r15.B(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.protobuf.k0.C(r1, r9)
            boolean r7 = r6 instanceof com.google.protobuf.C4868f
            if (r7 == 0) goto L_0x00e5
            com.google.protobuf.f r6 = (com.google.protobuf.C4868f) r6
            int r6 = com.google.protobuf.C4870h.g(r8, r6)
            goto L_0x0056
        L_0x00e5:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.protobuf.C4870h.M(r8, r6)
            goto L_0x0056
        L_0x00ed:
            boolean r6 = r15.B(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.C4870h.d(r8, r14)
            goto L_0x0056
        L_0x00f9:
            boolean r6 = r15.B(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.C4870h.m(r8, r3)
            goto L_0x0056
        L_0x0105:
            boolean r6 = r15.B(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.C4870h.o(r8, r11)
            goto L_0x0056
        L_0x0111:
            boolean r6 = r15.B(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = Q(r1, r9)
            int r6 = com.google.protobuf.C4870h.v(r8, r6)
            goto L_0x0056
        L_0x0121:
            boolean r6 = r15.B(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = R(r1, r9)
            int r6 = com.google.protobuf.C4870h.R(r8, r6)
            goto L_0x0056
        L_0x0131:
            boolean r6 = r15.B(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = R(r1, r9)
            int r6 = com.google.protobuf.C4870h.x(r8, r6)
            goto L_0x0056
        L_0x0141:
            boolean r6 = r15.B(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.C4870h.q(r8, r13)
            goto L_0x0056
        L_0x014d:
            boolean r6 = r15.B(r1, r8, r4)
            if (r6 == 0) goto L_0x04e9
            r6 = 0
            int r6 = com.google.protobuf.C4870h.i(r8, r6)
            goto L_0x0056
        L_0x015b:
            com.google.protobuf.F r6 = r0.f58407q
            java.lang.Object r7 = com.google.protobuf.k0.C(r1, r9)
            java.lang.Object r9 = r15.o(r4)
            int r6 = r6.e(r8, r7, r9)
            goto L_0x0056
        L_0x016b:
            java.util.List r6 = D(r1, r9)
            com.google.protobuf.Z r7 = r15.p(r4)
            int r6 = com.google.protobuf.b0.j(r8, r6, r7)
            goto L_0x0056
        L_0x0179:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.b0.t(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f58399i
            if (r9 == 0) goto L_0x018d
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x018d:
            int r6 = com.google.protobuf.C4870h.O(r8)
            int r8 = com.google.protobuf.C4870h.Q(r7)
        L_0x0195:
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x0056
        L_0x0199:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.b0.r(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f58399i
            if (r9 == 0) goto L_0x01ad
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01ad:
            int r6 = com.google.protobuf.C4870h.O(r8)
            int r8 = com.google.protobuf.C4870h.Q(r7)
            goto L_0x0195
        L_0x01b6:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.b0.i(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f58399i
            if (r9 == 0) goto L_0x01ca
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01ca:
            int r6 = com.google.protobuf.C4870h.O(r8)
            int r8 = com.google.protobuf.C4870h.Q(r7)
            goto L_0x0195
        L_0x01d3:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.b0.g(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f58399i
            if (r9 == 0) goto L_0x01e7
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01e7:
            int r6 = com.google.protobuf.C4870h.O(r8)
            int r8 = com.google.protobuf.C4870h.Q(r7)
            goto L_0x0195
        L_0x01f0:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.b0.e(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f58399i
            if (r9 == 0) goto L_0x0204
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0204:
            int r6 = com.google.protobuf.C4870h.O(r8)
            int r8 = com.google.protobuf.C4870h.Q(r7)
            goto L_0x0195
        L_0x020d:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.b0.w(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f58399i
            if (r9 == 0) goto L_0x0221
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0221:
            int r6 = com.google.protobuf.C4870h.O(r8)
            int r8 = com.google.protobuf.C4870h.Q(r7)
            goto L_0x0195
        L_0x022b:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.b0.b(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f58399i
            if (r9 == 0) goto L_0x023f
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x023f:
            int r6 = com.google.protobuf.C4870h.O(r8)
            int r8 = com.google.protobuf.C4870h.Q(r7)
            goto L_0x0195
        L_0x0249:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.b0.g(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f58399i
            if (r9 == 0) goto L_0x025d
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x025d:
            int r6 = com.google.protobuf.C4870h.O(r8)
            int r8 = com.google.protobuf.C4870h.Q(r7)
            goto L_0x0195
        L_0x0267:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.b0.i(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f58399i
            if (r9 == 0) goto L_0x027b
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x027b:
            int r6 = com.google.protobuf.C4870h.O(r8)
            int r8 = com.google.protobuf.C4870h.Q(r7)
            goto L_0x0195
        L_0x0285:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.b0.l(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f58399i
            if (r9 == 0) goto L_0x0299
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0299:
            int r6 = com.google.protobuf.C4870h.O(r8)
            int r8 = com.google.protobuf.C4870h.Q(r7)
            goto L_0x0195
        L_0x02a3:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.b0.y(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f58399i
            if (r9 == 0) goto L_0x02b7
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02b7:
            int r6 = com.google.protobuf.C4870h.O(r8)
            int r8 = com.google.protobuf.C4870h.Q(r7)
            goto L_0x0195
        L_0x02c1:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.b0.n(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f58399i
            if (r9 == 0) goto L_0x02d5
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02d5:
            int r6 = com.google.protobuf.C4870h.O(r8)
            int r8 = com.google.protobuf.C4870h.Q(r7)
            goto L_0x0195
        L_0x02df:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.b0.g(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f58399i
            if (r9 == 0) goto L_0x02f3
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02f3:
            int r6 = com.google.protobuf.C4870h.O(r8)
            int r8 = com.google.protobuf.C4870h.Q(r7)
            goto L_0x0195
        L_0x02fd:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.b0.i(r7)
            if (r7 <= 0) goto L_0x04e9
            boolean r9 = r0.f58399i
            if (r9 == 0) goto L_0x0311
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0311:
            int r6 = com.google.protobuf.C4870h.O(r8)
            int r8 = com.google.protobuf.C4870h.Q(r7)
            goto L_0x0195
        L_0x031b:
            java.util.List r6 = D(r1, r9)
            int r6 = com.google.protobuf.b0.s(r8, r6, r3)
            goto L_0x0056
        L_0x0325:
            java.util.List r6 = D(r1, r9)
            int r6 = com.google.protobuf.b0.q(r8, r6, r3)
            goto L_0x0056
        L_0x032f:
            java.util.List r6 = D(r1, r9)
            int r6 = com.google.protobuf.b0.h(r8, r6, r3)
            goto L_0x0056
        L_0x0339:
            java.util.List r6 = D(r1, r9)
            int r6 = com.google.protobuf.b0.f(r8, r6, r3)
            goto L_0x0056
        L_0x0343:
            java.util.List r6 = D(r1, r9)
            int r6 = com.google.protobuf.b0.d(r8, r6, r3)
            goto L_0x0056
        L_0x034d:
            java.util.List r6 = D(r1, r9)
            int r6 = com.google.protobuf.b0.v(r8, r6, r3)
            goto L_0x0056
        L_0x0357:
            java.util.List r6 = D(r1, r9)
            int r6 = com.google.protobuf.b0.c(r8, r6)
            goto L_0x0056
        L_0x0361:
            java.util.List r6 = D(r1, r9)
            com.google.protobuf.Z r7 = r15.p(r4)
            int r6 = com.google.protobuf.b0.p(r8, r6, r7)
            goto L_0x0056
        L_0x036f:
            java.util.List r6 = D(r1, r9)
            int r6 = com.google.protobuf.b0.u(r8, r6)
            goto L_0x0056
        L_0x0379:
            java.util.List r6 = D(r1, r9)
            int r6 = com.google.protobuf.b0.a(r8, r6, r3)
            goto L_0x0056
        L_0x0383:
            java.util.List r6 = D(r1, r9)
            int r6 = com.google.protobuf.b0.f(r8, r6, r3)
            goto L_0x0056
        L_0x038d:
            java.util.List r6 = D(r1, r9)
            int r6 = com.google.protobuf.b0.h(r8, r6, r3)
            goto L_0x0056
        L_0x0397:
            java.util.List r6 = D(r1, r9)
            int r6 = com.google.protobuf.b0.k(r8, r6, r3)
            goto L_0x0056
        L_0x03a1:
            java.util.List r6 = D(r1, r9)
            int r6 = com.google.protobuf.b0.x(r8, r6, r3)
            goto L_0x0056
        L_0x03ab:
            java.util.List r6 = D(r1, r9)
            int r6 = com.google.protobuf.b0.m(r8, r6, r3)
            goto L_0x0056
        L_0x03b5:
            java.util.List r6 = D(r1, r9)
            int r6 = com.google.protobuf.b0.f(r8, r6, r3)
            goto L_0x0056
        L_0x03bf:
            java.util.List r6 = D(r1, r9)
            int r6 = com.google.protobuf.b0.h(r8, r6, r3)
            goto L_0x0056
        L_0x03c9:
            boolean r6 = r15.u(r1, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.protobuf.k0.C(r1, r9)
            com.google.protobuf.K r6 = (com.google.protobuf.K) r6
            com.google.protobuf.Z r7 = r15.p(r4)
            int r6 = com.google.protobuf.C4870h.s(r8, r6, r7)
            goto L_0x0056
        L_0x03df:
            boolean r6 = r15.u(r1, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = com.google.protobuf.k0.A(r1, r9)
            int r6 = com.google.protobuf.C4870h.K(r8, r6)
            goto L_0x0056
        L_0x03ef:
            boolean r6 = r15.u(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.k0.z(r1, r9)
            int r6 = com.google.protobuf.C4870h.I(r8, r6)
            goto L_0x0056
        L_0x03ff:
            boolean r6 = r15.u(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.C4870h.G(r8, r11)
            goto L_0x0056
        L_0x040b:
            boolean r6 = r15.u(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.C4870h.E(r8, r3)
            goto L_0x0056
        L_0x0417:
            boolean r6 = r15.u(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.k0.z(r1, r9)
            int r6 = com.google.protobuf.C4870h.k(r8, r6)
            goto L_0x0056
        L_0x0427:
            boolean r6 = r15.u(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.k0.z(r1, r9)
            int r6 = com.google.protobuf.C4870h.P(r8, r6)
            goto L_0x0056
        L_0x0437:
            boolean r6 = r15.u(r1, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.protobuf.k0.C(r1, r9)
            com.google.protobuf.f r6 = (com.google.protobuf.C4868f) r6
            int r6 = com.google.protobuf.C4870h.g(r8, r6)
            goto L_0x0056
        L_0x0449:
            boolean r6 = r15.u(r1, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.protobuf.k0.C(r1, r9)
            com.google.protobuf.Z r7 = r15.p(r4)
            int r6 = com.google.protobuf.b0.o(r8, r6, r7)
            goto L_0x0056
        L_0x045d:
            boolean r6 = r15.u(r1, r4)
            if (r6 == 0) goto L_0x04e9
            java.lang.Object r6 = com.google.protobuf.k0.C(r1, r9)
            boolean r7 = r6 instanceof com.google.protobuf.C4868f
            if (r7 == 0) goto L_0x0473
            com.google.protobuf.f r6 = (com.google.protobuf.C4868f) r6
            int r6 = com.google.protobuf.C4870h.g(r8, r6)
            goto L_0x0056
        L_0x0473:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.protobuf.C4870h.M(r8, r6)
            goto L_0x0056
        L_0x047b:
            boolean r6 = r15.u(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.C4870h.d(r8, r14)
            goto L_0x0056
        L_0x0487:
            boolean r6 = r15.u(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.C4870h.m(r8, r3)
            goto L_0x0056
        L_0x0493:
            boolean r6 = r15.u(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.C4870h.o(r8, r11)
            goto L_0x0056
        L_0x049f:
            boolean r6 = r15.u(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.k0.z(r1, r9)
            int r6 = com.google.protobuf.C4870h.v(r8, r6)
            goto L_0x0056
        L_0x04af:
            boolean r6 = r15.u(r1, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = com.google.protobuf.k0.A(r1, r9)
            int r6 = com.google.protobuf.C4870h.R(r8, r6)
            goto L_0x0056
        L_0x04bf:
            boolean r6 = r15.u(r1, r4)
            if (r6 == 0) goto L_0x04e9
            long r6 = com.google.protobuf.k0.A(r1, r9)
            int r6 = com.google.protobuf.C4870h.x(r8, r6)
            goto L_0x0056
        L_0x04cf:
            boolean r6 = r15.u(r1, r4)
            if (r6 == 0) goto L_0x04e9
            int r6 = com.google.protobuf.C4870h.q(r8, r13)
            goto L_0x0056
        L_0x04db:
            boolean r6 = r15.u(r1, r4)
            if (r6 == 0) goto L_0x04e9
            r6 = 0
            int r6 = com.google.protobuf.C4870h.i(r8, r6)
            goto L_0x0056
        L_0x04e9:
            int r4 = r4 + 3
            goto L_0x0008
        L_0x04ed:
            com.google.protobuf.g0 r2 = r0.f58405o
            int r1 = r15.s(r2, r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.N.r(java.lang.Object):int");
    }

    private int s(g0 g0Var, Object obj) {
        return g0Var.b(g0Var.a(obj));
    }

    private static int t(Object obj, long j10) {
        return k0.z(obj, j10);
    }

    private boolean u(Object obj, int i10) {
        int S10 = S(i10);
        long j10 = (long) (1048575 & S10);
        if (j10 == 1048575) {
            int X10 = X(i10);
            long M10 = M(X10);
            switch (W(X10)) {
                case 0:
                    if (Double.doubleToRawLongBits(k0.x(obj, M10)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(k0.y(obj, M10)) != 0) {
                        return true;
                    }
                    return false;
                case 2:
                    if (k0.A(obj, M10) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (k0.A(obj, M10) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (k0.z(obj, M10) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (k0.A(obj, M10) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (k0.z(obj, M10) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return k0.r(obj, M10);
                case 8:
                    Object C10 = k0.C(obj, M10);
                    if (C10 instanceof String) {
                        return !((String) C10).isEmpty();
                    }
                    if (C10 instanceof C4868f) {
                        return !C4868f.f58458b.equals(C10);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (k0.C(obj, M10) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    return !C4868f.f58458b.equals(k0.C(obj, M10));
                case 11:
                    if (k0.z(obj, M10) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (k0.z(obj, M10) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (k0.z(obj, M10) != 0) {
                        return true;
                    }
                    return false;
                case StdKeyDeserializer.TYPE_URL:
                    if (k0.A(obj, M10) != 0) {
                        return true;
                    }
                    return false;
                case StdKeyDeserializer.TYPE_CLASS:
                    if (k0.z(obj, M10) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (k0.A(obj, M10) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (k0.C(obj, M10) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((k0.z(obj, j10) & (1 << (S10 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    private boolean v(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return u(obj, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    private static boolean w(Object obj, int i10, Z z10) {
        return z10.f(k0.C(obj, M(i10)));
    }

    private boolean x(Object obj, int i10, int i11) {
        List list = (List) k0.C(obj, M(i10));
        if (list.isEmpty()) {
            return true;
        }
        Z p10 = p(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!p10.f(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean y(Object obj, int i10, int i11) {
        Map c10 = this.f58407q.c(k0.C(obj, M(i10)));
        if (c10.isEmpty()) {
            return true;
        }
        if (this.f58407q.b(o(i11)).f58382c.b() != m0.c.MESSAGE) {
            return true;
        }
        Z z10 = null;
        for (Object next : c10.values()) {
            if (z10 == null) {
                z10 = W.a().c(next.getClass());
            }
            if (!z10.f(next)) {
                return false;
            }
        }
        return true;
    }

    private static boolean z(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof r) {
            return ((r) obj).I();
        }
        return true;
    }

    public void a(Object obj, Object obj2) {
        k(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.f58391a.length; i10 += 3) {
            H(obj, obj2, i10);
        }
        b0.E(this.f58405o, obj, obj2);
        if (this.f58396f) {
            b0.C(this.f58406p, obj, obj2);
        }
    }

    public Object b() {
        return this.f58403m.a(this.f58395e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016b, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0229, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.f58391a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022d
            int r3 = r8.X(r1)
            int r4 = r8.L(r1)
            long r5 = M(r3)
            int r3 = W(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020d;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f5;
                case 4: goto L_0x01ed;
                case 5: goto L_0x01e1;
                case 6: goto L_0x01d9;
                case 7: goto L_0x01cd;
                case 8: goto L_0x01bf;
                case 9: goto L_0x01b4;
                case 10: goto L_0x01a8;
                case 11: goto L_0x01a0;
                case 12: goto L_0x0198;
                case 13: goto L_0x0190;
                case 14: goto L_0x0184;
                case 15: goto L_0x017c;
                case 16: goto L_0x0170;
                case 17: goto L_0x0161;
                case 18: goto L_0x0155;
                case 19: goto L_0x0155;
                case 20: goto L_0x0155;
                case 21: goto L_0x0155;
                case 22: goto L_0x0155;
                case 23: goto L_0x0155;
                case 24: goto L_0x0155;
                case 25: goto L_0x0155;
                case 26: goto L_0x0155;
                case 27: goto L_0x0155;
                case 28: goto L_0x0155;
                case 29: goto L_0x0155;
                case 30: goto L_0x0155;
                case 31: goto L_0x0155;
                case 32: goto L_0x0155;
                case 33: goto L_0x0155;
                case 34: goto L_0x0155;
                case 35: goto L_0x0155;
                case 36: goto L_0x0155;
                case 37: goto L_0x0155;
                case 38: goto L_0x0155;
                case 39: goto L_0x0155;
                case 40: goto L_0x0155;
                case 41: goto L_0x0155;
                case 42: goto L_0x0155;
                case 43: goto L_0x0155;
                case 44: goto L_0x0155;
                case 45: goto L_0x0155;
                case 46: goto L_0x0155;
                case 47: goto L_0x0155;
                case 48: goto L_0x0155;
                case 49: goto L_0x0155;
                case 50: goto L_0x0149;
                case 51: goto L_0x0133;
                case 52: goto L_0x0121;
                case 53: goto L_0x010f;
                case 54: goto L_0x00fd;
                case 55: goto L_0x00ef;
                case 56: goto L_0x00dd;
                case 57: goto L_0x00cf;
                case 58: goto L_0x00bd;
                case 59: goto L_0x00a9;
                case 60: goto L_0x0098;
                case 61: goto L_0x0087;
                case 62: goto L_0x007a;
                case 63: goto L_0x006d;
                case 64: goto L_0x0060;
                case 65: goto L_0x004f;
                case 66: goto L_0x0042;
                case 67: goto L_0x0031;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0229
        L_0x001e:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = com.google.protobuf.k0.C(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
        L_0x002e:
            int r2 = r2 + r3
            goto L_0x0229
        L_0x0031:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = R(r9, r5)
            int r3 = com.google.protobuf.C4881t.f(r3)
            goto L_0x002e
        L_0x0042:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = Q(r9, r5)
            goto L_0x002e
        L_0x004f:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = R(r9, r5)
            int r3 = com.google.protobuf.C4881t.f(r3)
            goto L_0x002e
        L_0x0060:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = Q(r9, r5)
            goto L_0x002e
        L_0x006d:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = Q(r9, r5)
            goto L_0x002e
        L_0x007a:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = Q(r9, r5)
            goto L_0x002e
        L_0x0087:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.k0.C(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0098:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = com.google.protobuf.k0.C(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x00a9:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.k0.C(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x00bd:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            boolean r3 = N(r9, r5)
            int r3 = com.google.protobuf.C4881t.c(r3)
            goto L_0x002e
        L_0x00cf:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = Q(r9, r5)
            goto L_0x002e
        L_0x00dd:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = R(r9, r5)
            int r3 = com.google.protobuf.C4881t.f(r3)
            goto L_0x002e
        L_0x00ef:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = Q(r9, r5)
            goto L_0x002e
        L_0x00fd:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = R(r9, r5)
            int r3 = com.google.protobuf.C4881t.f(r3)
            goto L_0x002e
        L_0x010f:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = R(r9, r5)
            int r3 = com.google.protobuf.C4881t.f(r3)
            goto L_0x002e
        L_0x0121:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            float r3 = P(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x002e
        L_0x0133:
            boolean r3 = r8.B(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            double r3 = O(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.C4881t.f(r3)
            goto L_0x002e
        L_0x0149:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.k0.C(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0155:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.k0.C(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0161:
            java.lang.Object r3 = com.google.protobuf.k0.C(r9, r5)
            if (r3 == 0) goto L_0x016b
            int r7 = r3.hashCode()
        L_0x016b:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0229
        L_0x0170:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.k0.A(r9, r5)
            int r3 = com.google.protobuf.C4881t.f(r3)
            goto L_0x002e
        L_0x017c:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.k0.z(r9, r5)
            goto L_0x002e
        L_0x0184:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.k0.A(r9, r5)
            int r3 = com.google.protobuf.C4881t.f(r3)
            goto L_0x002e
        L_0x0190:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.k0.z(r9, r5)
            goto L_0x002e
        L_0x0198:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.k0.z(r9, r5)
            goto L_0x002e
        L_0x01a0:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.k0.z(r9, r5)
            goto L_0x002e
        L_0x01a8:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.k0.C(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x01b4:
            java.lang.Object r3 = com.google.protobuf.k0.C(r9, r5)
            if (r3 == 0) goto L_0x016b
            int r7 = r3.hashCode()
            goto L_0x016b
        L_0x01bf:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.k0.C(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x01cd:
            int r2 = r2 * 53
            boolean r3 = com.google.protobuf.k0.r(r9, r5)
            int r3 = com.google.protobuf.C4881t.c(r3)
            goto L_0x002e
        L_0x01d9:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.k0.z(r9, r5)
            goto L_0x002e
        L_0x01e1:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.k0.A(r9, r5)
            int r3 = com.google.protobuf.C4881t.f(r3)
            goto L_0x002e
        L_0x01ed:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.k0.z(r9, r5)
            goto L_0x002e
        L_0x01f5:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.k0.A(r9, r5)
            int r3 = com.google.protobuf.C4881t.f(r3)
            goto L_0x002e
        L_0x0201:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.k0.A(r9, r5)
            int r3 = com.google.protobuf.C4881t.f(r3)
            goto L_0x002e
        L_0x020d:
            int r2 = r2 * 53
            float r3 = com.google.protobuf.k0.y(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x002e
        L_0x0219:
            int r2 = r2 * 53
            double r3 = com.google.protobuf.k0.x(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.C4881t.f(r3)
            goto L_0x002e
        L_0x0229:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022d:
            int r2 = r2 * 53
            com.google.protobuf.g0 r0 = r8.f58405o
            java.lang.Object r0 = r0.a(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f58396f
            if (r0 == 0) goto L_0x024b
            int r2 = r2 * 53
            com.google.protobuf.l r0 = r8.f58406p
            com.google.protobuf.o r9 = r0.b(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.N.c(java.lang.Object):int");
    }

    public boolean d(Object obj, Object obj2) {
        int length = this.f58391a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!m(obj, obj2, i10)) {
                return false;
            }
        }
        if (!this.f58405o.a(obj).equals(this.f58405o.a(obj2))) {
            return false;
        }
        if (this.f58396f) {
            return this.f58406p.b(obj).equals(this.f58406p.b(obj2));
        }
        return true;
    }

    public void e(Object obj) {
        if (z(obj)) {
            if (obj instanceof r) {
                r rVar = (r) obj;
                rVar.r();
                rVar.q();
                rVar.K();
            }
            int length = this.f58391a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int X10 = X(i10);
                long M10 = M(X10);
                int W10 = W(X10);
                if (W10 != 9) {
                    switch (W10) {
                        case 17:
                            break;
                        case 18:
                        case 19:
                        case InboxPagingSource.PAGE_SIZE /*20*/:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case c.f37660h:
                        case CharsToNameCanonicalizer.HASH_MULT:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case Carousel.ENTITY_TYPE /*44*/:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f58404n.c(obj, M10);
                            continue;
                        case 50:
                            Unsafe unsafe = f58390s;
                            Object object = unsafe.getObject(obj, M10);
                            if (object != null) {
                                unsafe.putObject(obj, M10, this.f58407q.d(object));
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                if (u(obj, i10)) {
                    p(i10).e(f58390s.getObject(obj, M10));
                }
            }
            this.f58405o.d(obj);
            if (this.f58396f) {
                this.f58406p.e(obj);
            }
        }
    }

    public final boolean f(Object obj) {
        int i10;
        int i11;
        Object obj2 = obj;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f58401k) {
            int i15 = this.f58400j[i14];
            int L10 = L(i15);
            int X10 = X(i15);
            int i16 = this.f58391a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = f58390s.getInt(obj2, (long) i17);
                }
                i10 = i13;
                i11 = i17;
            } else {
                i11 = i12;
                i10 = i13;
            }
            if (C(X10) && !v(obj, i15, i11, i10, i18)) {
                return false;
            }
            int W10 = W(X10);
            if (W10 != 9 && W10 != 17) {
                if (W10 != 27) {
                    if (W10 == 60 || W10 == 68) {
                        if (B(obj2, L10, i15) && !w(obj2, X10, p(i15))) {
                            return false;
                        }
                    } else if (W10 != 49) {
                        if (W10 == 50 && !y(obj2, X10, i15)) {
                            return false;
                        }
                    }
                }
                if (!x(obj2, X10, i15)) {
                    return false;
                }
            } else if (v(obj, i15, i11, i10, i18) && !w(obj2, X10, p(i15))) {
                return false;
            }
            i14++;
            i12 = i11;
            i13 = i10;
        }
        if (!this.f58396f || this.f58406p.b(obj2).k()) {
            return true;
        }
        return false;
    }

    public int g(Object obj) {
        if (this.f58398h) {
            return r(obj);
        }
        return q(obj);
    }

    public void h(Object obj, n0 n0Var) {
        if (n0Var.t() == n0.a.DESCENDING) {
            a0(obj, n0Var);
        } else if (this.f58398h) {
            Z(obj, n0Var);
        } else {
            Y(obj, n0Var);
        }
    }
}
