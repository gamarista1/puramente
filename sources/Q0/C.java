package Q0;

import V0.h;
import V0.o;
import V0.p;
import X0.e;
import b1.C1869a;
import b1.k;
import b1.n;
import c1.v;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2514n0;
import r0.C2544x0;
import r0.e2;
import t0.C2606g;

public final class C {

    /* renamed from: a  reason: collision with root package name */
    private final n f5230a;

    /* renamed from: b  reason: collision with root package name */
    private final long f5231b;

    /* renamed from: c  reason: collision with root package name */
    private final p f5232c;

    /* renamed from: d  reason: collision with root package name */
    private final V0.n f5233d;

    /* renamed from: e  reason: collision with root package name */
    private final o f5234e;

    /* renamed from: f  reason: collision with root package name */
    private final h f5235f;

    /* renamed from: g  reason: collision with root package name */
    private final String f5236g;

    /* renamed from: h  reason: collision with root package name */
    private final long f5237h;

    /* renamed from: i  reason: collision with root package name */
    private final C1869a f5238i;

    /* renamed from: j  reason: collision with root package name */
    private final b1.o f5239j;

    /* renamed from: k  reason: collision with root package name */
    private final e f5240k;

    /* renamed from: l  reason: collision with root package name */
    private final long f5241l;

    /* renamed from: m  reason: collision with root package name */
    private final k f5242m;

    /* renamed from: n  reason: collision with root package name */
    private final e2 f5243n;

    /* renamed from: o  reason: collision with root package name */
    private final z f5244o;

    /* renamed from: p  reason: collision with root package name */
    private final C2606g f5245p;

    public /* synthetic */ C(long j10, long j11, p pVar, V0.n nVar, o oVar, h hVar, String str, long j12, C1869a aVar, b1.o oVar2, e eVar, long j13, k kVar, e2 e2Var, z zVar, C2606g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, pVar, nVar, oVar, hVar, str, j12, aVar, oVar2, eVar, j13, kVar, e2Var, zVar, gVar);
    }

    public static /* synthetic */ C b(C c10, long j10, long j11, p pVar, V0.n nVar, o oVar, h hVar, String str, long j12, C1869a aVar, b1.o oVar2, e eVar, long j13, k kVar, e2 e2Var, z zVar, C2606g gVar, int i10, Object obj) {
        long j14;
        long j15;
        p pVar2;
        V0.n nVar2;
        o oVar3;
        h hVar2;
        String str2;
        long j16;
        C1869a aVar2;
        b1.o oVar4;
        e eVar2;
        long j17;
        k kVar2;
        e2 e2Var2;
        z zVar2;
        C2606g gVar2;
        C c11 = c10;
        int i11 = i10;
        if ((i11 & 1) != 0) {
            j14 = c10.g();
        } else {
            j14 = j10;
        }
        if ((i11 & 2) != 0) {
            j15 = c11.f5231b;
        } else {
            j15 = j11;
        }
        if ((i11 & 4) != 0) {
            pVar2 = c11.f5232c;
        } else {
            pVar2 = pVar;
        }
        if ((i11 & 8) != 0) {
            nVar2 = c11.f5233d;
        } else {
            nVar2 = nVar;
        }
        if ((i11 & 16) != 0) {
            oVar3 = c11.f5234e;
        } else {
            oVar3 = oVar;
        }
        if ((i11 & 32) != 0) {
            hVar2 = c11.f5235f;
        } else {
            hVar2 = hVar;
        }
        if ((i11 & 64) != 0) {
            str2 = c11.f5236g;
        } else {
            str2 = str;
        }
        if ((i11 & 128) != 0) {
            j16 = c11.f5237h;
        } else {
            j16 = j12;
        }
        if ((i11 & 256) != 0) {
            aVar2 = c11.f5238i;
        } else {
            aVar2 = aVar;
        }
        if ((i11 & 512) != 0) {
            oVar4 = c11.f5239j;
        } else {
            oVar4 = oVar2;
        }
        if ((i11 & 1024) != 0) {
            eVar2 = c11.f5240k;
        } else {
            eVar2 = eVar;
        }
        e eVar3 = eVar2;
        b1.o oVar5 = oVar4;
        if ((i11 & 2048) != 0) {
            j17 = c11.f5241l;
        } else {
            j17 = j13;
        }
        long j18 = j17;
        if ((i11 & 4096) != 0) {
            kVar2 = c11.f5242m;
        } else {
            kVar2 = kVar;
        }
        if ((i11 & 8192) != 0) {
            e2Var2 = c11.f5243n;
        } else {
            e2Var2 = e2Var;
        }
        e2 e2Var3 = e2Var2;
        if ((i11 & 16384) != 0) {
            zVar2 = c11.f5244o;
        } else {
            zVar2 = zVar;
        }
        if ((i11 & 32768) != 0) {
            gVar2 = c11.f5245p;
        } else {
            gVar2 = gVar;
        }
        return c10.a(j14, j15, pVar2, nVar2, oVar3, hVar2, str2, j16, aVar2, oVar5, eVar3, j18, kVar2, e2Var3, zVar2, gVar2);
    }

    public final C a(long j10, long j11, p pVar, V0.n nVar, o oVar, h hVar, String str, long j12, C1869a aVar, b1.o oVar2, e eVar, long j13, k kVar, e2 e2Var, z zVar, C2606g gVar) {
        n b10;
        long j14 = j10;
        if (C2544x0.q(j14, g())) {
            b10 = this.f5230a;
        } else {
            b10 = n.f19132a.b(j14);
        }
        return new C(b10, j11, pVar, nVar, oVar, hVar, str, j12, aVar, oVar2, eVar, j13, kVar, e2Var, zVar, gVar, (DefaultConstructorMarker) null);
    }

    public final float c() {
        return this.f5230a.a();
    }

    public final long d() {
        return this.f5241l;
    }

    public final C1869a e() {
        return this.f5238i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        if (!v(c10) || !w(c10)) {
            return false;
        }
        return true;
    }

    public final C2514n0 f() {
        return this.f5230a.f();
    }

    public final long g() {
        return this.f5230a.d();
    }

    public final C2606g h() {
        return this.f5245p;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int w10 = C2544x0.w(g()) * 31;
        C2514n0 f10 = f();
        int i22 = 0;
        if (f10 != null) {
            i10 = f10.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode = (((((w10 + i10) * 31) + Float.hashCode(c())) * 31) + v.i(this.f5231b)) * 31;
        p pVar = this.f5232c;
        if (pVar != null) {
            i11 = pVar.hashCode();
        } else {
            i11 = 0;
        }
        int i23 = (hashCode + i11) * 31;
        V0.n nVar = this.f5233d;
        if (nVar != null) {
            i12 = V0.n.g(nVar.i());
        } else {
            i12 = 0;
        }
        int i24 = (i23 + i12) * 31;
        o oVar = this.f5234e;
        if (oVar != null) {
            i13 = o.i(oVar.k());
        } else {
            i13 = 0;
        }
        int i25 = (i24 + i13) * 31;
        h hVar = this.f5235f;
        if (hVar != null) {
            i14 = hVar.hashCode();
        } else {
            i14 = 0;
        }
        int i26 = (i25 + i14) * 31;
        String str = this.f5236g;
        if (str != null) {
            i15 = str.hashCode();
        } else {
            i15 = 0;
        }
        int i27 = (((i26 + i15) * 31) + v.i(this.f5237h)) * 31;
        C1869a aVar = this.f5238i;
        if (aVar != null) {
            i16 = C1869a.f(aVar.h());
        } else {
            i16 = 0;
        }
        int i28 = (i27 + i16) * 31;
        b1.o oVar2 = this.f5239j;
        if (oVar2 != null) {
            i17 = oVar2.hashCode();
        } else {
            i17 = 0;
        }
        int i29 = (i28 + i17) * 31;
        e eVar = this.f5240k;
        if (eVar != null) {
            i18 = eVar.hashCode();
        } else {
            i18 = 0;
        }
        int w11 = (((i29 + i18) * 31) + C2544x0.w(this.f5241l)) * 31;
        k kVar = this.f5242m;
        if (kVar != null) {
            i19 = kVar.hashCode();
        } else {
            i19 = 0;
        }
        int i30 = (w11 + i19) * 31;
        e2 e2Var = this.f5243n;
        if (e2Var != null) {
            i20 = e2Var.hashCode();
        } else {
            i20 = 0;
        }
        int i31 = (i30 + i20) * 31;
        z zVar = this.f5244o;
        if (zVar != null) {
            i21 = zVar.hashCode();
        } else {
            i21 = 0;
        }
        int i32 = (i31 + i21) * 31;
        C2606g gVar = this.f5245p;
        if (gVar != null) {
            i22 = gVar.hashCode();
        }
        return i32 + i22;
    }

    public final h i() {
        return this.f5235f;
    }

    public final String j() {
        return this.f5236g;
    }

    public final long k() {
        return this.f5231b;
    }

    public final V0.n l() {
        return this.f5233d;
    }

    public final o m() {
        return this.f5234e;
    }

    public final p n() {
        return this.f5232c;
    }

    public final long o() {
        return this.f5237h;
    }

    public final e p() {
        return this.f5240k;
    }

    public final z q() {
        return this.f5244o;
    }

    public final e2 r() {
        return this.f5243n;
    }

    public final k s() {
        return this.f5242m;
    }

    public final n t() {
        return this.f5230a;
    }

    public String toString() {
        return "SpanStyle(color=" + C2544x0.x(g()) + ", brush=" + f() + ", alpha=" + c() + ", fontSize=" + v.j(this.f5231b) + ", fontWeight=" + this.f5232c + ", fontStyle=" + this.f5233d + ", fontSynthesis=" + this.f5234e + ", fontFamily=" + this.f5235f + ", fontFeatureSettings=" + this.f5236g + ", letterSpacing=" + v.j(this.f5237h) + ", baselineShift=" + this.f5238i + ", textGeometricTransform=" + this.f5239j + ", localeList=" + this.f5240k + ", background=" + C2544x0.x(this.f5241l) + ", textDecoration=" + this.f5242m + ", shadow=" + this.f5243n + ", platformStyle=" + this.f5244o + ", drawStyle=" + this.f5245p + ')';
    }

    public final b1.o u() {
        return this.f5239j;
    }

    public final boolean v(C c10) {
        if (this == c10) {
            return true;
        }
        if (v.e(this.f5231b, c10.f5231b) && C6496s.c(this.f5232c, c10.f5232c) && C6496s.c(this.f5233d, c10.f5233d) && C6496s.c(this.f5234e, c10.f5234e) && C6496s.c(this.f5235f, c10.f5235f) && C6496s.c(this.f5236g, c10.f5236g) && v.e(this.f5237h, c10.f5237h) && C6496s.c(this.f5238i, c10.f5238i) && C6496s.c(this.f5239j, c10.f5239j) && C6496s.c(this.f5240k, c10.f5240k) && C2544x0.q(this.f5241l, c10.f5241l) && C6496s.c(this.f5244o, c10.f5244o)) {
            return true;
        }
        return false;
    }

    public final boolean w(C c10) {
        if (C6496s.c(this.f5230a, c10.f5230a) && C6496s.c(this.f5242m, c10.f5242m) && C6496s.c(this.f5243n, c10.f5243n) && C6496s.c(this.f5245p, c10.f5245p)) {
            return true;
        }
        return false;
    }

    public final int x() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = v.i(this.f5231b) * 31;
        p pVar = this.f5232c;
        int i19 = 0;
        if (pVar != null) {
            i10 = pVar.hashCode();
        } else {
            i10 = 0;
        }
        int i20 = (i18 + i10) * 31;
        V0.n nVar = this.f5233d;
        if (nVar != null) {
            i11 = V0.n.g(nVar.i());
        } else {
            i11 = 0;
        }
        int i21 = (i20 + i11) * 31;
        o oVar = this.f5234e;
        if (oVar != null) {
            i12 = o.i(oVar.k());
        } else {
            i12 = 0;
        }
        int i22 = (i21 + i12) * 31;
        h hVar = this.f5235f;
        if (hVar != null) {
            i13 = hVar.hashCode();
        } else {
            i13 = 0;
        }
        int i23 = (i22 + i13) * 31;
        String str = this.f5236g;
        if (str != null) {
            i14 = str.hashCode();
        } else {
            i14 = 0;
        }
        int i24 = (((i23 + i14) * 31) + v.i(this.f5237h)) * 31;
        C1869a aVar = this.f5238i;
        if (aVar != null) {
            i15 = C1869a.f(aVar.h());
        } else {
            i15 = 0;
        }
        int i25 = (i24 + i15) * 31;
        b1.o oVar2 = this.f5239j;
        if (oVar2 != null) {
            i16 = oVar2.hashCode();
        } else {
            i16 = 0;
        }
        int i26 = (i25 + i16) * 31;
        e eVar = this.f5240k;
        if (eVar != null) {
            i17 = eVar.hashCode();
        } else {
            i17 = 0;
        }
        int w10 = (((i26 + i17) * 31) + C2544x0.w(this.f5241l)) * 31;
        z zVar = this.f5244o;
        if (zVar != null) {
            i19 = zVar.hashCode();
        }
        return w10 + i19;
    }

    public final C y(C c10) {
        C c11 = c10;
        if (c11 == null) {
            return this;
        }
        return D.b(this, c11.f5230a.d(), c11.f5230a.f(), c11.f5230a.a(), c11.f5231b, c11.f5232c, c11.f5233d, c11.f5234e, c11.f5235f, c11.f5236g, c11.f5237h, c11.f5238i, c11.f5239j, c11.f5240k, c11.f5241l, c11.f5242m, c11.f5243n, c11.f5244o, c11.f5245p);
    }

    public /* synthetic */ C(n nVar, long j10, p pVar, V0.n nVar2, o oVar, h hVar, String str, long j11, C1869a aVar, b1.o oVar2, e eVar, long j12, k kVar, e2 e2Var, z zVar, C2606g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, j10, pVar, nVar2, oVar, hVar, str, j11, aVar, oVar2, eVar, j12, kVar, e2Var, zVar, gVar);
    }

    private C(n nVar, long j10, p pVar, V0.n nVar2, o oVar, h hVar, String str, long j11, C1869a aVar, b1.o oVar2, e eVar, long j12, k kVar, e2 e2Var, z zVar, C2606g gVar) {
        this.f5230a = nVar;
        this.f5231b = j10;
        this.f5232c = pVar;
        this.f5233d = nVar2;
        this.f5234e = oVar;
        this.f5235f = hVar;
        this.f5236g = str;
        this.f5237h = j11;
        this.f5238i = aVar;
        this.f5239j = oVar2;
        this.f5240k = eVar;
        this.f5241l = j12;
        this.f5242m = kVar;
        this.f5243n = e2Var;
        this.f5244o = zVar;
        this.f5245p = gVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C(long r22, long r24, V0.p r26, V0.n r27, V0.o r28, V0.h r29, java.lang.String r30, long r31, b1.C1869a r33, b1.o r34, X0.e r35, long r36, b1.k r38, r0.e2 r39, Q0.z r40, t0.C2606g r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            r21 = this;
            r0 = r42
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            r0.x0$a r1 = r0.C2544x0.f25560b
            long r1 = r1.h()
            goto L_0x000f
        L_0x000d:
            r1 = r22
        L_0x000f:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x001a
            c1.v$a r3 = c1.v.f19242b
            long r3 = r3.a()
            goto L_0x001c
        L_0x001a:
            r3 = r24
        L_0x001c:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r26
        L_0x0024:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r27
        L_0x002c:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r28
        L_0x0034:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r29
        L_0x003c:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r30
        L_0x0044:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004f
            c1.v$a r11 = c1.v.f19242b
            long r11 = r11.a()
            goto L_0x0051
        L_0x004f:
            r11 = r31
        L_0x0051:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0057
            r13 = 0
            goto L_0x0059
        L_0x0057:
            r13 = r33
        L_0x0059:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x005f
            r14 = 0
            goto L_0x0061
        L_0x005f:
            r14 = r34
        L_0x0061:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0067
            r15 = 0
            goto L_0x0069
        L_0x0067:
            r15 = r35
        L_0x0069:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0074
            r0.x0$a r6 = r0.C2544x0.f25560b
            long r16 = r6.h()
            goto L_0x0076
        L_0x0074:
            r16 = r36
        L_0x0076:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r38
        L_0x007e:
            r18 = r6
            r6 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x0086
            r6 = 0
            goto L_0x0088
        L_0x0086:
            r6 = r39
        L_0x0088:
            r19 = r6
            r6 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x0090
            r6 = 0
            goto L_0x0092
        L_0x0090:
            r6 = r40
        L_0x0092:
            r20 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r20
            if (r0 == 0) goto L_0x009b
            r0 = 0
            goto L_0x009d
        L_0x009b:
            r0 = r41
        L_0x009d:
            r20 = 0
            r43 = r20
            r22 = r21
            r23 = r1
            r25 = r3
            r27 = r5
            r28 = r7
            r29 = r8
            r30 = r9
            r31 = r10
            r32 = r11
            r34 = r13
            r35 = r14
            r36 = r15
            r37 = r16
            r39 = r18
            r40 = r19
            r41 = r6
            r42 = r0
            r22.<init>((long) r23, (long) r25, (V0.p) r27, (V0.n) r28, (V0.o) r29, (V0.h) r30, (java.lang.String) r31, (long) r32, (b1.C1869a) r34, (b1.o) r35, (X0.e) r36, (long) r37, (b1.k) r39, (r0.e2) r40, (Q0.z) r41, (t0.C2606g) r42, (kotlin.jvm.internal.DefaultConstructorMarker) r43)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C.<init>(long, long, V0.p, V0.n, V0.o, V0.h, java.lang.String, long, b1.a, b1.o, X0.e, long, b1.k, r0.e2, Q0.z, t0.g, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private C(long j10, long j11, p pVar, V0.n nVar, o oVar, h hVar, String str, long j12, C1869a aVar, b1.o oVar2, e eVar, long j13, k kVar, e2 e2Var, z zVar, C2606g gVar) {
        this(n.f19132a.b(j10), j11, pVar, nVar, oVar, hVar, str, j12, aVar, oVar2, eVar, j13, kVar, e2Var, zVar, gVar, (DefaultConstructorMarker) null);
        long j14 = j11;
    }
}
