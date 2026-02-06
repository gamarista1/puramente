package C0;

import J0.B0;
import J0.C0;
import Ug.K;
import k0.i;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import q0.C2421g;
import qf.C6658d;
import yf.C6787a;

public final class c extends i.c implements B0, a {

    /* renamed from: n  reason: collision with root package name */
    private a f1116n;

    /* renamed from: o  reason: collision with root package name */
    private b f1117o;

    /* renamed from: p  reason: collision with root package name */
    private final Object f1118p;

    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f1119a;

        /* renamed from: b  reason: collision with root package name */
        long f1120b;

        /* renamed from: c  reason: collision with root package name */
        long f1121c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f1122d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f1123e;

        /* renamed from: f  reason: collision with root package name */
        int f1124f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, C6658d dVar) {
            super(dVar);
            this.f1123e = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f1122d = obj;
            this.f1124f |= Integer.MIN_VALUE;
            return this.f1123e.b0(0, 0, this);
        }
    }

    static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f1125a;

        /* renamed from: b  reason: collision with root package name */
        long f1126b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f1127c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f1128d;

        /* renamed from: e  reason: collision with root package name */
        int f1129e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, C6658d dVar) {
            super(dVar);
            this.f1128d = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f1127c = obj;
            this.f1129e |= Integer.MIN_VALUE;
            return this.f1128d.D1(0, this);
        }
    }

    /* renamed from: C0.c$c  reason: collision with other inner class name */
    static final class C0013c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f1130a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0013c(c cVar) {
            super(0);
            this.f1130a = cVar;
        }

        /* renamed from: a */
        public final K invoke() {
            return this.f1130a.m2();
        }
    }

    public c(a aVar, b bVar) {
        this.f1116n = aVar;
        this.f1117o = bVar == null ? new b() : bVar;
        this.f1118p = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* access modifiers changed from: private */
    public final K m2() {
        K k10;
        c o22 = o2();
        if ((o22 != null && (k10 = o22.m2()) != null) || (k10 = this.f1117o.h()) != null) {
            return k10;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    private final a n2() {
        if (S1()) {
            return o2();
        }
        return null;
    }

    private final void p2() {
        if (this.f1117o.f() == this) {
            this.f1117o.j((c) null);
        }
    }

    private final void q2(b bVar) {
        p2();
        if (bVar == null) {
            this.f1117o = new b();
        } else if (!C6496s.c(bVar, this.f1117o)) {
            this.f1117o = bVar;
        }
        if (S1()) {
            r2();
        }
    }

    private final void r2() {
        this.f1117o.j(this);
        this.f1117o.i(new C0013c(this));
        this.f1117o.k(L1());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object D1(long r9, qf.C6658d r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof C0.c.b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            C0.c$b r0 = (C0.c.b) r0
            int r1 = r0.f1129e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1129e = r1
            goto L_0x0018
        L_0x0013:
            C0.c$b r0 = new C0.c$b
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f1127c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f1129e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            long r9 = r0.f1126b
            lf.w.b(r11)
            goto L_0x007d
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            long r9 = r0.f1126b
            java.lang.Object r2 = r0.f1125a
            C0.c r2 = (C0.c) r2
            lf.w.b(r11)
            goto L_0x0057
        L_0x0040:
            lf.w.b(r11)
            C0.a r11 = r8.n2()
            if (r11 == 0) goto L_0x0061
            r0.f1125a = r8
            r0.f1126b = r9
            r0.f1129e = r4
            java.lang.Object r11 = r11.D1(r9, r0)
            if (r11 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r2 = r8
        L_0x0057:
            c1.y r11 = (c1.y) r11
            long r4 = r11.o()
        L_0x005d:
            r6 = r9
            r9 = r4
            r4 = r6
            goto L_0x0069
        L_0x0061:
            c1.y$a r11 = c1.y.f19251b
            long r4 = r11.a()
            r2 = r8
            goto L_0x005d
        L_0x0069:
            C0.a r11 = r2.f1116n
            long r4 = c1.y.k(r4, r9)
            r2 = 0
            r0.f1125a = r2
            r0.f1126b = r9
            r0.f1129e = r3
            java.lang.Object r11 = r11.D1(r4, r0)
            if (r11 != r1) goto L_0x007d
            return r1
        L_0x007d:
            c1.y r11 = (c1.y) r11
            long r0 = r11.o()
            long r9 = c1.y.l(r9, r0)
            c1.y r9 = c1.y.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.c.D1(long, qf.d):java.lang.Object");
    }

    public Object L() {
        return this.f1118p;
    }

    public long M0(long j10, long j11, int i10) {
        long j12;
        long M02 = this.f1116n.M0(j10, j11, i10);
        a n22 = n2();
        if (n22 != null) {
            j12 = n22.M0(C2421g.r(j10, M02), C2421g.q(j11, M02), i10);
        } else {
            j12 = C2421g.f25320b.c();
        }
        return C2421g.r(M02, j12);
    }

    public void V1() {
        r2();
    }

    public void W1() {
        p2();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b0(long r16, long r18, qf.C6658d r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof C0.c.a
            if (r2 == 0) goto L_0x0016
            r2 = r1
            C0.c$a r2 = (C0.c.a) r2
            int r3 = r2.f1124f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.f1124f = r3
            goto L_0x001b
        L_0x0016:
            C0.c$a r2 = new C0.c$a
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r1 = r2.f1122d
            java.lang.Object r9 = rf.C6680b.f()
            int r3 = r2.f1124f
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L_0x0047
            if (r3 == r4) goto L_0x0039
            if (r3 != r10) goto L_0x0031
            long r2 = r2.f1120b
            lf.w.b(r1)
            goto L_0x008c
        L_0x0031:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0039:
            long r3 = r2.f1121c
            long r5 = r2.f1120b
            java.lang.Object r7 = r2.f1119a
            C0.c r7 = (C0.c) r7
            lf.w.b(r1)
            r13 = r3
            r11 = r5
            goto L_0x0065
        L_0x0047:
            lf.w.b(r1)
            C0.a r3 = r0.f1116n
            r2.f1119a = r0
            r11 = r16
            r2.f1120b = r11
            r13 = r18
            r2.f1121c = r13
            r2.f1124f = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.b0(r4, r6, r8)
            if (r1 != r9) goto L_0x0064
            return r9
        L_0x0064:
            r7 = r0
        L_0x0065:
            c1.y r1 = (c1.y) r1
            long r4 = r1.o()
            C0.a r3 = r7.n2()
            if (r3 == 0) goto L_0x0094
            long r6 = c1.y.l(r11, r4)
            long r11 = c1.y.k(r13, r4)
            r1 = 0
            r2.f1119a = r1
            r2.f1120b = r4
            r2.f1124f = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.b0(r4, r6, r8)
            if (r1 != r9) goto L_0x008b
            return r9
        L_0x008b:
            r2 = r13
        L_0x008c:
            c1.y r1 = (c1.y) r1
            long r4 = r1.o()
            r13 = r2
            goto L_0x009b
        L_0x0094:
            r13 = r4
            c1.y$a r1 = c1.y.f19251b
            long r4 = r1.a()
        L_0x009b:
            long r1 = c1.y.l(r13, r4)
            c1.y r1 = c1.y.b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.c.b0(long, long, qf.d):java.lang.Object");
    }

    public final c o2() {
        if (S1()) {
            return (c) C0.b(this);
        }
        return null;
    }

    public long q1(long j10, int i10) {
        long j11;
        a n22 = n2();
        if (n22 != null) {
            j11 = n22.q1(j10, i10);
        } else {
            j11 = C2421g.f25320b.c();
        }
        return C2421g.r(j11, this.f1116n.q1(C2421g.q(j10, j11), i10));
    }

    public final void s2(a aVar, b bVar) {
        this.f1116n = aVar;
        q2(bVar);
    }
}
