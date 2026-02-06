package x;

import J0.C1247m;
import c1.h;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import lf.C6514M;
import lf.C6535s;
import o0.C2340c;
import o0.C2341d;
import o0.C2345h;
import q0.C2415a;
import q0.C2422h;
import q0.C2423i;
import q0.C2426l;
import q0.C2427m;
import q0.C2428n;
import r0.C2514n0;
import r0.C2520p0;
import r0.C2541w0;
import r0.C2547y0;
import r0.H1;
import r0.O1;
import r0.S1;
import r0.T1;
import r0.g2;
import t0.C2600a;
import t0.C2602c;
import t0.C2603d;
import t0.C2605f;
import t0.C2606g;
import t0.C2610k;
import yf.C6798l;

/* renamed from: x.f  reason: case insensitive filesystem */
public final class C2867f extends C1247m {

    /* renamed from: p  reason: collision with root package name */
    private C2865d f27941p;

    /* renamed from: q  reason: collision with root package name */
    private float f27942q;

    /* renamed from: r  reason: collision with root package name */
    private C2514n0 f27943r;

    /* renamed from: s  reason: collision with root package name */
    private g2 f27944s;

    /* renamed from: t  reason: collision with root package name */
    private final C2340c f27945t;

    /* renamed from: x.f$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ O1.a f27946a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2514n0 f27947b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(O1.a aVar, C2514n0 n0Var) {
            super(1);
            this.f27946a = aVar;
            this.f27947b = n0Var;
        }

        public final void a(C2602c cVar) {
            cVar.H1();
            C2605f.Z(cVar, this.f27946a.b(), this.f27947b, 0.0f, (C2606g) null, (C2547y0) null, 0, 60, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2602c) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: x.f$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2423i f27948a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ N f27949b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f27950c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2547y0 f27951d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2423i iVar, N n10, long j10, C2547y0 y0Var) {
            super(1);
            this.f27948a = iVar;
            this.f27949b = n10;
            this.f27950c = j10;
            this.f27951d = y0Var;
        }

        public final void a(C2602c cVar) {
            cVar.H1();
            float i10 = this.f27948a.i();
            float l10 = this.f27948a.l();
            N n10 = this.f27949b;
            long j10 = this.f27950c;
            C2547y0 y0Var = this.f27951d;
            cVar.w1().e().d(i10, l10);
            try {
                C2605f.S(cVar, (H1) n10.f71759a, 0, j10, 0, 0, 0.0f, (C2606g) null, y0Var, 0, 0, 890, (Object) null);
            } finally {
                cVar.w1().e().d(-i10, -l10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2602c) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: x.f$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f27952a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2514n0 f27953b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f27954c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f27955d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f27956e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f27957f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f27958g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C2610k f27959h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z10, C2514n0 n0Var, long j10, float f10, float f11, long j11, long j12, C2610k kVar) {
            super(1);
            this.f27952a = z10;
            this.f27953b = n0Var;
            this.f27954c = j10;
            this.f27955d = f10;
            this.f27956e = f11;
            this.f27957f = j11;
            this.f27958g = j12;
            this.f27959h = kVar;
        }

        public final void a(C2602c cVar) {
            long j10;
            cVar.H1();
            if (this.f27952a) {
                C2605f.G0(cVar, this.f27953b, 0, 0, this.f27954c, 0.0f, (C2606g) null, (C2547y0) null, 0, 246, (Object) null);
                return;
            }
            float d10 = C2415a.d(this.f27954c);
            float f10 = this.f27955d;
            if (d10 < f10) {
                float f11 = this.f27956e;
                float k10 = C2427m.k(cVar.d()) - this.f27956e;
                float i10 = C2427m.i(cVar.d()) - this.f27956e;
                int a10 = C2541w0.f25557a.a();
                C2514n0 n0Var = this.f27953b;
                long j11 = this.f27954c;
                C2603d w12 = cVar.w1();
                long d11 = w12.d();
                w12.f().q();
                try {
                    w12.e().c(f11, f11, k10, i10, a10);
                    j10 = d11;
                    try {
                        C2605f.G0(cVar, n0Var, 0, 0, j11, 0.0f, (C2606g) null, (C2547y0) null, 0, 246, (Object) null);
                        w12.f().h();
                        w12.h(j10);
                    } catch (Throwable th2) {
                        th = th2;
                        w12.f().h();
                        w12.h(j10);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    j10 = d11;
                    w12.f().h();
                    w12.h(j10);
                    throw th;
                }
            } else {
                C2605f.G0(cVar, this.f27953b, this.f27957f, this.f27958g, C2866e.l(this.f27954c, f10), 0.0f, this.f27959h, (C2547y0) null, 0, 208, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2602c) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: x.f$d */
    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ S1 f27960a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2514n0 f27961b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(S1 s12, C2514n0 n0Var) {
            super(1);
            this.f27960a = s12;
            this.f27961b = n0Var;
        }

        public final void a(C2602c cVar) {
            cVar.H1();
            C2605f.Z(cVar, this.f27960a, this.f27961b, 0.0f, (C2606g) null, (C2547y0) null, 0, 60, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2602c) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: x.f$e */
    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2867f f27962a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C2867f fVar) {
            super(1);
            this.f27962a = fVar;
        }

        /* renamed from: a */
        public final C2345h invoke(C2341d dVar) {
            float f10;
            boolean z10;
            if (dVar.t1(this.f27962a.x2()) < 0.0f || C2427m.j(dVar.d()) <= 0.0f) {
                return C2866e.j(dVar);
            }
            if (h.m(this.f27962a.x2(), h.f19213b.a())) {
                f10 = 1.0f;
            } else {
                f10 = (float) Math.ceil((double) dVar.t1(this.f27962a.x2()));
            }
            float f11 = (float) 2;
            float min = Math.min(f10, (float) Math.ceil((double) (C2427m.j(dVar.d()) / f11)));
            float f12 = min / f11;
            long a10 = C2422h.a(f12, f12);
            long a11 = C2428n.a(C2427m.k(dVar.d()) - min, C2427m.i(dVar.d()) - min);
            if (f11 * min > C2427m.j(dVar.d())) {
                z10 = true;
            } else {
                z10 = false;
            }
            O1 r22 = this.f27962a.w2().m12createOutlinePq9zytI(dVar.d(), dVar.getLayoutDirection(), dVar);
            if (r22 instanceof O1.a) {
                C2867f fVar = this.f27962a;
                return fVar.t2(dVar, fVar.v2(), (O1.a) r22, z10, min);
            } else if (r22 instanceof O1.c) {
                C2867f fVar2 = this.f27962a;
                return fVar2.u2(dVar, fVar2.v2(), (O1.c) r22, a10, a11, z10, min);
            } else if (r22 instanceof O1.b) {
                return C2866e.k(dVar, this.f27962a.v2(), a10, a11, z10, min);
            } else {
                throw new C6535s();
            }
        }
    }

    public /* synthetic */ C2867f(float f10, C2514n0 n0Var, g2 g2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, n0Var, g2Var);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d9, code lost:
        if (r0.I1.h(r14, r4) != false) goto L_0x00db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o0.C2345h t2(o0.C2341d r48, r0.C2514n0 r49, r0.O1.a r50, boolean r51, float r52) {
        /*
            r47 = this;
            r1 = r47
            r0 = r48
            r11 = r49
            if (r51 == 0) goto L_0x0015
            x.f$a r2 = new x.f$a
            r3 = r50
            r2.<init>(r3, r11)
            o0.h r0 = r0.o(r2)
            goto L_0x029e
        L_0x0015:
            r3 = r50
            boolean r2 = r11 instanceof r0.h2
            r4 = 0
            if (r2 == 0) goto L_0x0036
            r0.I1$a r2 = r0.I1.f25425b
            int r2 = r2.a()
            r0.y0$a r5 = r0.C2547y0.f25576b
            r6 = r11
            r0.h2 r6 = (r0.h2) r6
            long r6 = r6.b()
            r9 = 2
            r10 = 0
            r8 = 0
            r0.y0 r5 = r0.C2547y0.a.c(r5, r6, r8, r9, r10)
            r14 = r2
            r19 = r5
            goto L_0x003f
        L_0x0036:
            r0.I1$a r2 = r0.I1.f25425b
            int r2 = r2.b()
            r14 = r2
            r19 = r4
        L_0x003f:
            r0.S1 r2 = r50.b()
            q0.i r10 = r2.getBounds()
            x.d r2 = r1.f27941p
            if (r2 != 0) goto L_0x0060
            x.d r2 = new x.d
            r25 = 15
            r26 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r20 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r1.f27941p = r2
        L_0x0060:
            x.d r2 = r1.f27941p
            kotlin.jvm.internal.C6496s.e(r2)
            r0.S1 r9 = r2.g()
            r9.reset()
            r2 = 2
            r0.S1.h(r9, r10, r4, r2, r4)
            r0.S1 r5 = r50.b()
            r0.W1$a r6 = r0.W1.f25474a
            int r6 = r6.a()
            r9.l(r9, r5, r6)
            kotlin.jvm.internal.N r8 = new kotlin.jvm.internal.N
            r8.<init>()
            float r5 = r10.n()
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            float r5 = (float) r5
            int r5 = (int) r5
            float r6 = r10.h()
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            float r6 = (float) r6
            int r6 = (int) r6
            long r20 = c1.s.a(r5, r6)
            x.d r5 = r1.f27941p
            kotlin.jvm.internal.C6496s.e(r5)
            r0.H1 r6 = r5.f27932a
            r0.p0 r7 = r5.f27933b
            if (r6 == 0) goto L_0x00b4
            int r12 = r6.b()
            r0.I1 r12 = r0.I1.f(r12)
            goto L_0x00b5
        L_0x00b4:
            r12 = r4
        L_0x00b5:
            r0.I1$a r13 = r0.I1.f25425b
            int r13 = r13.b()
            r15 = 0
            if (r12 != 0) goto L_0x00c0
            r12 = r15
            goto L_0x00c8
        L_0x00c0:
            int r12 = r12.l()
            boolean r12 = r0.I1.i(r12, r13)
        L_0x00c8:
            r13 = 1
            if (r12 != 0) goto L_0x00db
            if (r6 == 0) goto L_0x00d5
            int r4 = r6.b()
            r0.I1 r4 = r0.I1.f(r4)
        L_0x00d5:
            boolean r4 = r0.I1.h(r14, r4)
            if (r4 == 0) goto L_0x00dc
        L_0x00db:
            r15 = r13
        L_0x00dc:
            if (r6 == 0) goto L_0x010c
            if (r7 == 0) goto L_0x010c
            long r16 = r48.d()
            float r4 = q0.C2427m.k(r16)
            int r12 = r6.e()
            float r12 = (float) r12
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 > 0) goto L_0x010c
            long r16 = r48.d()
            float r4 = q0.C2427m.i(r16)
            int r12 = r6.d()
            float r12 = (float) r12
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 > 0) goto L_0x010c
            if (r15 != 0) goto L_0x0105
            goto L_0x010c
        L_0x0105:
            r12 = r6
            r46 = r13
            r13 = r7
            r7 = r46
            goto L_0x012d
        L_0x010c:
            int r12 = c1.r.g(r20)
            int r4 = c1.r.f(r20)
            r17 = 24
            r18 = 0
            r15 = 0
            r16 = 0
            r7 = r13
            r13 = r4
            r0.H1 r6 = r0.J1.b(r12, r13, r14, r15, r16, r17, r18)
            r5.f27932a = r6
            r0.p0 r4 = r0.C2526r0.a(r6)
            r5.f27933b = r4
            r13 = r4
            r12 = r6
        L_0x012d:
            t0.a r4 = r5.f27934c
            if (r4 != 0) goto L_0x013b
            t0.a r4 = new t0.a
            r4.<init>()
            r5.f27934c = r4
        L_0x013b:
            r14 = r4
            long r4 = c1.s.d(r20)
            c1.t r6 = r48.getLayoutDirection()
            t0.a$a r15 = r14.D()
            r51 = r9
            c1.d r9 = r15.a()
            r16 = r9
            c1.t r9 = r15.b()
            r17 = r9
            r0.p0 r9 = r15.c()
            r18 = r8
            r35 = r9
            long r8 = r15.d()
            t0.a$a r15 = r14.D()
            r15.j(r0)
            r15.k(r6)
            r15.i(r13)
            r15.l(r4)
            r13.q()
            r0.x0$a r6 = r0.C2544x0.f25560b
            long r23 = r6.a()
            r0.f0$a r15 = r0.C2490f0.f25500a
            int r32 = r15.a()
            r33 = 58
            r34 = 0
            r25 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r22 = r14
            r27 = r4
            t0.C2605f.c0(r22, r23, r25, r27, r29, r30, r31, r32, r33, r34)
            float r4 = r10.i()
            float r6 = -r4
            float r4 = r10.l()
            float r5 = -r4
            t0.d r4 = r14.w1()
            t0.h r4 = r4.e()
            r4.d(r6, r5)
            r0.S1 r3 = r50.b()     // Catch:{ all -> 0x02c1 }
            t0.k r30 = new t0.k     // Catch:{ all -> 0x02c1 }
            float r2 = (float) r2     // Catch:{ all -> 0x02c1 }
            float r23 = r52 * r2
            r28 = 30
            r29 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r22 = r30
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x02c1 }
            r22 = 52
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r2 = r14
            r4 = r49
            r36 = r5
            r5 = r24
            r37 = r6
            r6 = r30
            r7 = r25
            r38 = r8
            r9 = r18
            r8 = r26
            r40 = r9
            r41 = r16
            r42 = r17
            r43 = r35
            r16 = r51
            r9 = r22
            r17 = r10
            r10 = r23
            t0.C2605f.Z(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x029f }
            long r2 = r14.d()     // Catch:{ all -> 0x029f }
            float r2 = q0.C2427m.k(r2)     // Catch:{ all -> 0x029f }
            r3 = 1
            float r3 = (float) r3     // Catch:{ all -> 0x029f }
            float r2 = r2 + r3
            long r4 = r14.d()     // Catch:{ all -> 0x029f }
            float r4 = q0.C2427m.k(r4)     // Catch:{ all -> 0x029f }
            float r2 = r2 / r4
            long r4 = r14.d()     // Catch:{ all -> 0x029f }
            float r4 = q0.C2427m.i(r4)     // Catch:{ all -> 0x029f }
            float r4 = r4 + r3
            long r5 = r14.d()     // Catch:{ all -> 0x029f }
            float r3 = q0.C2427m.i(r5)     // Catch:{ all -> 0x029f }
            float r4 = r4 / r3
            long r5 = r14.y1()     // Catch:{ all -> 0x029f }
            t0.d r10 = r14.w1()     // Catch:{ all -> 0x029f }
            long r8 = r10.d()     // Catch:{ all -> 0x029f }
            r0.p0 r3 = r10.f()     // Catch:{ all -> 0x029f }
            r3.q()     // Catch:{ all -> 0x029f }
            t0.h r3 = r10.e()     // Catch:{ all -> 0x02ad }
            r3.e(r2, r4, r5)     // Catch:{ all -> 0x02ad }
            int r15 = r15.a()     // Catch:{ all -> 0x02ad }
            r18 = 28
            r22 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r14
            r3 = r16
            r4 = r49
            r44 = r8
            r8 = r15
            r9 = r18
            r11 = r10
            r10 = r22
            t0.C2605f.Z(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x02a5 }
            r0.p0 r2 = r11.f()     // Catch:{ all -> 0x029f }
            r2.h()     // Catch:{ all -> 0x029f }
            r2 = r44
            r11.h(r2)     // Catch:{ all -> 0x029f }
            t0.d r2 = r14.w1()
            t0.h r2 = r2.e()
            r4 = r37
            float r3 = -r4
            r5 = r36
            float r4 = -r5
            r2.d(r3, r4)
            r13.h()
            t0.a$a r2 = r14.D()
            r3 = r41
            r2.j(r3)
            r3 = r42
            r2.k(r3)
            r3 = r43
            r2.i(r3)
            r3 = r38
            r2.l(r3)
            r12.a()
            r2 = r40
            r2.f71759a = r12
            x.f$b r3 = new x.f$b
            r5 = r3
            r6 = r17
            r7 = r2
            r8 = r20
            r10 = r19
            r5.<init>(r6, r7, r8, r10)
            o0.h r0 = r0.o(r3)
        L_0x029e:
            return r0
        L_0x029f:
            r0 = move-exception
            r5 = r36
            r4 = r37
            goto L_0x02c3
        L_0x02a5:
            r0 = move-exception
            r5 = r36
            r4 = r37
            r2 = r44
            goto L_0x02b4
        L_0x02ad:
            r0 = move-exception
            r2 = r8
            r11 = r10
            r5 = r36
            r4 = r37
        L_0x02b4:
            r0.p0 r6 = r11.f()     // Catch:{ all -> 0x02bf }
            r6.h()     // Catch:{ all -> 0x02bf }
            r11.h(r2)     // Catch:{ all -> 0x02bf }
            throw r0     // Catch:{ all -> 0x02bf }
        L_0x02bf:
            r0 = move-exception
            goto L_0x02c3
        L_0x02c1:
            r0 = move-exception
            r4 = r6
        L_0x02c3:
            t0.d r2 = r14.w1()
            t0.h r2 = r2.e()
            float r3 = -r4
            float r4 = -r5
            r2.d(r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C2867f.t2(o0.d, r0.n0, r0.O1$a, boolean, float):o0.h");
    }

    /* access modifiers changed from: private */
    public final C2345h u2(C2341d dVar, C2514n0 n0Var, O1.c cVar, long j10, long j11, boolean z10, float f10) {
        C2341d dVar2 = dVar;
        float f11 = f10;
        if (C2426l.e(cVar.b())) {
            return dVar2.o(new c(z10, n0Var, cVar.b().h(), f11 / ((float) 2), f10, j10, j11, new C2610k(f10, 0.0f, 0, 0, (T1) null, 30, (DefaultConstructorMarker) null)));
        }
        if (this.f27941p == null) {
            this.f27941p = new C2865d((H1) null, (C2520p0) null, (C2600a) null, (S1) null, 15, (DefaultConstructorMarker) null);
        }
        C2865d dVar3 = this.f27941p;
        C6496s.e(dVar3);
        return dVar2.o(new d(C2866e.i(dVar3.g(), cVar.b(), f11, z10), n0Var));
    }

    public final void O0(g2 g2Var) {
        if (!C6496s.c(this.f27944s, g2Var)) {
            this.f27944s = g2Var;
            this.f27945t.W0();
        }
    }

    public final C2514n0 v2() {
        return this.f27943r;
    }

    public final g2 w2() {
        return this.f27944s;
    }

    public final float x2() {
        return this.f27942q;
    }

    public final void y2(C2514n0 n0Var) {
        if (!C6496s.c(this.f27943r, n0Var)) {
            this.f27943r = n0Var;
            this.f27945t.W0();
        }
    }

    public final void z2(float f10) {
        if (!h.m(this.f27942q, f10)) {
            this.f27942q = f10;
            this.f27945t.W0();
        }
    }

    private C2867f(float f10, C2514n0 n0Var, g2 g2Var) {
        this.f27942q = f10;
        this.f27943r = n0Var;
        this.f27944s = g2Var;
        this.f27945t = (C2340c) l2(androidx.compose.ui.draw.b.a(new e(this)));
    }
}
