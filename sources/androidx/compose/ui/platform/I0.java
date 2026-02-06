package androidx.compose.ui.platform;

import Q0.C;
import Q0.z;
import V0.h;
import V0.n;
import V0.o;
import V0.p;
import X0.e;
import b1.C1869a;
import b1.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.e2;
import t0.C2606g;

final class I0 {

    /* renamed from: a  reason: collision with root package name */
    private long f13536a;

    /* renamed from: b  reason: collision with root package name */
    private long f13537b;

    /* renamed from: c  reason: collision with root package name */
    private p f13538c;

    /* renamed from: d  reason: collision with root package name */
    private n f13539d;

    /* renamed from: e  reason: collision with root package name */
    private o f13540e;

    /* renamed from: f  reason: collision with root package name */
    private h f13541f;

    /* renamed from: g  reason: collision with root package name */
    private String f13542g;

    /* renamed from: h  reason: collision with root package name */
    private long f13543h;

    /* renamed from: i  reason: collision with root package name */
    private C1869a f13544i;

    /* renamed from: j  reason: collision with root package name */
    private b1.o f13545j;

    /* renamed from: k  reason: collision with root package name */
    private e f13546k;

    /* renamed from: l  reason: collision with root package name */
    private long f13547l;

    /* renamed from: m  reason: collision with root package name */
    private k f13548m;

    /* renamed from: n  reason: collision with root package name */
    private e2 f13549n;

    public /* synthetic */ I0(long j10, long j11, p pVar, n nVar, o oVar, h hVar, String str, long j12, C1869a aVar, b1.o oVar2, e eVar, long j13, k kVar, e2 e2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, pVar, nVar, oVar, hVar, str, j12, aVar, oVar2, eVar, j13, kVar, e2Var);
    }

    public final void a(long j10) {
        this.f13547l = j10;
    }

    public final void b(C1869a aVar) {
        this.f13544i = aVar;
    }

    public final void c(long j10) {
        this.f13536a = j10;
    }

    public final void d(String str) {
        this.f13542g = str;
    }

    public final void e(long j10) {
        this.f13537b = j10;
    }

    public final void f(n nVar) {
        this.f13539d = nVar;
    }

    public final void g(o oVar) {
        this.f13540e = oVar;
    }

    public final void h(p pVar) {
        this.f13538c = pVar;
    }

    public final void i(long j10) {
        this.f13543h = j10;
    }

    public final void j(e2 e2Var) {
        this.f13549n = e2Var;
    }

    public final void k(k kVar) {
        this.f13548m = kVar;
    }

    public final void l(b1.o oVar) {
        this.f13545j = oVar;
    }

    public final C m() {
        return new C(this.f13536a, this.f13537b, this.f13538c, this.f13539d, this.f13540e, this.f13541f, this.f13542g, this.f13543h, this.f13544i, this.f13545j, this.f13546k, this.f13547l, this.f13548m, this.f13549n, (z) null, (C2606g) null, 49152, (DefaultConstructorMarker) null);
    }

    private I0(long j10, long j11, p pVar, n nVar, o oVar, h hVar, String str, long j12, C1869a aVar, b1.o oVar2, e eVar, long j13, k kVar, e2 e2Var) {
        this.f13536a = j10;
        this.f13537b = j11;
        this.f13538c = pVar;
        this.f13539d = nVar;
        this.f13540e = oVar;
        this.f13541f = hVar;
        this.f13542g = str;
        this.f13543h = j12;
        this.f13544i = aVar;
        this.f13545j = oVar2;
        this.f13546k = eVar;
        this.f13547l = j13;
        this.f13548m = kVar;
        this.f13549n = e2Var;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ I0(long r20, long r22, V0.p r24, V0.n r25, V0.o r26, V0.h r27, java.lang.String r28, long r29, b1.C1869a r31, b1.o r32, X0.e r33, long r34, b1.k r36, r0.e2 r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
            r19 = this;
            r0 = r38
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            r0.x0$a r1 = r0.C2544x0.f25560b
            long r1 = r1.h()
            goto L_0x000f
        L_0x000d:
            r1 = r20
        L_0x000f:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x001a
            c1.v$a r3 = c1.v.f19242b
            long r3 = r3.a()
            goto L_0x001c
        L_0x001a:
            r3 = r22
        L_0x001c:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r24
        L_0x0024:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r25
        L_0x002c:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r26
        L_0x0034:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r27
        L_0x003c:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r28
        L_0x0044:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004f
            c1.v$a r11 = c1.v.f19242b
            long r11 = r11.a()
            goto L_0x0051
        L_0x004f:
            r11 = r29
        L_0x0051:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0057
            r13 = 0
            goto L_0x0059
        L_0x0057:
            r13 = r31
        L_0x0059:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x005f
            r14 = 0
            goto L_0x0061
        L_0x005f:
            r14 = r32
        L_0x0061:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0067
            r15 = 0
            goto L_0x0069
        L_0x0067:
            r15 = r33
        L_0x0069:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0074
            r0.x0$a r6 = r0.C2544x0.f25560b
            long r16 = r6.h()
            goto L_0x0076
        L_0x0074:
            r16 = r34
        L_0x0076:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r36
        L_0x007e:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0084
            r0 = 0
            goto L_0x0086
        L_0x0084:
            r0 = r37
        L_0x0086:
            r18 = 0
            r39 = r18
            r20 = r19
            r21 = r1
            r23 = r3
            r25 = r5
            r26 = r7
            r27 = r8
            r28 = r9
            r29 = r10
            r30 = r11
            r32 = r13
            r33 = r14
            r34 = r15
            r35 = r16
            r37 = r6
            r38 = r0
            r20.<init>(r21, r23, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r37, r38, r39)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.I0.<init>(long, long, V0.p, V0.n, V0.o, V0.h, java.lang.String, long, b1.a, b1.o, X0.e, long, b1.k, r0.e2, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
