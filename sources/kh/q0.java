package kh;

import Ff.d;
import Sg.C5538a;
import Tg.a;
import gh.C5978b;
import hh.C5998a;
import ih.e;
import ih.f;
import java.util.Map;
import kotlin.jvm.internal.C6482d;
import kotlin.jvm.internal.C6483e;
import kotlin.jvm.internal.C6485g;
import kotlin.jvm.internal.C6489k;
import kotlin.jvm.internal.C6490l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6499v;
import kotlin.jvm.internal.S;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.r;
import lf.C6502A;
import lf.C6504C;
import lf.C6505D;
import lf.C6506E;
import lf.C6507F;
import lf.C6508G;
import lf.C6509H;
import lf.C6511J;
import lf.C6512K;
import lf.C6514M;
import mf.O;

public abstract class q0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map f71697a = O.l(C6502A.a(kotlin.jvm.internal.O.b(String.class), C5998a.E(U.f71764a)), C6502A.a(kotlin.jvm.internal.O.b(Character.TYPE), C5998a.y(C6485g.f71779a)), C6502A.a(kotlin.jvm.internal.O.b(char[].class), C5998a.d()), C6502A.a(kotlin.jvm.internal.O.b(Double.TYPE), C5998a.z(C6489k.f71788a)), C6502A.a(kotlin.jvm.internal.O.b(double[].class), C5998a.e()), C6502A.a(kotlin.jvm.internal.O.b(Float.TYPE), C5998a.A(C6490l.f71789a)), C6502A.a(kotlin.jvm.internal.O.b(float[].class), C5998a.f()), C6502A.a(kotlin.jvm.internal.O.b(Long.TYPE), C5998a.C(C6499v.f71791a)), C6502A.a(kotlin.jvm.internal.O.b(long[].class), C5998a.i()), C6502A.a(kotlin.jvm.internal.O.b(C6508G.class), C5998a.H(C6508G.f71802b)), C6502A.a(kotlin.jvm.internal.O.b(C6509H.class), C5998a.s()), C6502A.a(kotlin.jvm.internal.O.b(Integer.TYPE), C5998a.B(r.f71790a)), C6502A.a(kotlin.jvm.internal.O.b(int[].class), C5998a.g()), C6502A.a(kotlin.jvm.internal.O.b(C6506E.class), C5998a.G(C6506E.f71797b)), C6502A.a(kotlin.jvm.internal.O.b(C6507F.class), C5998a.r()), C6502A.a(kotlin.jvm.internal.O.b(Short.TYPE), C5998a.D(S.f71762a)), C6502A.a(kotlin.jvm.internal.O.b(short[].class), C5998a.o()), C6502A.a(kotlin.jvm.internal.O.b(C6511J.class), C5998a.I(C6511J.f71808b)), C6502A.a(kotlin.jvm.internal.O.b(C6512K.class), C5998a.t()), C6502A.a(kotlin.jvm.internal.O.b(Byte.TYPE), C5998a.x(C6483e.f71777a)), C6502A.a(kotlin.jvm.internal.O.b(byte[].class), C5998a.c()), C6502A.a(kotlin.jvm.internal.O.b(C6504C.class), C5998a.F(C6504C.f71792b)), C6502A.a(kotlin.jvm.internal.O.b(C6505D.class), C5998a.q()), C6502A.a(kotlin.jvm.internal.O.b(Boolean.TYPE), C5998a.w(C6482d.f71776a)), C6502A.a(kotlin.jvm.internal.O.b(boolean[].class), C5998a.b()), C6502A.a(kotlin.jvm.internal.O.b(C6514M.class), C5998a.J(C6514M.f71813a)), C6502A.a(kotlin.jvm.internal.O.b(Void.class), C5998a.l()), C6502A.a(kotlin.jvm.internal.O.b(a.class), C5998a.v(a.f65168b)));

    public static final f a(String str, e eVar) {
        C6496s.h(str, "serialName");
        C6496s.h(eVar, "kind");
        d(str);
        return new p0(str, eVar);
    }

    public static final C5978b b(d dVar) {
        C6496s.h(dVar, "<this>");
        return (C5978b) f71697a.get(dVar);
    }

    private static final String c(String str) {
        String str2;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char charAt = str.charAt(0);
        if (Character.isLowerCase(charAt)) {
            str2 = C5538a.f(charAt);
        } else {
            str2 = String.valueOf(charAt);
        }
        sb2.append(str2);
        String substring = str.substring(1);
        C6496s.g(substring, "substring(...)");
        sb2.append(substring);
        return sb2.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void d(java.lang.String r4) {
        /*
            java.util.Map r0 = f71697a
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x006c
            java.lang.Object r1 = r0.next()
            Ff.d r1 = (Ff.d) r1
            java.lang.String r1 = r1.w()
            kotlin.jvm.internal.C6496s.e(r1)
            java.lang.String r1 = c(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "kotlin."
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            r3 = 1
            boolean r2 = Sg.p.v(r4, r2, r3)
            if (r2 != 0) goto L_0x0040
            boolean r2 = Sg.p.v(r4, r1, r3)
            if (r2 != 0) goto L_0x0040
            goto L_0x000a
        L_0x0040:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = " there already exist "
            r2.append(r4)
            java.lang.String r4 = c(r1)
            r2.append(r4)
            java.lang.String r4 = "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            java.lang.String r4 = Sg.p.f(r4)
            r0.<init>(r4)
            throw r0
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.q0.d(java.lang.String):void");
    }
}
