package z;

import c1.d;
import dh.C5817a;
import dh.c;
import qf.C6658d;

public final class s implements r, d {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ d f29031a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f29032b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f29033c;

    /* renamed from: d  reason: collision with root package name */
    private final C5817a f29034d = c.a(false);

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f29035a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f29036b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s f29037c;

        /* renamed from: d  reason: collision with root package name */
        int f29038d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(s sVar, C6658d dVar) {
            super(dVar);
            this.f29037c = sVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f29036b = obj;
            this.f29038d |= Integer.MIN_VALUE;
            return this.f29037c.o(this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f29039a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f29040b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s f29041c;

        /* renamed from: d  reason: collision with root package name */
        int f29042d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(s sVar, C6658d dVar) {
            super(dVar);
            this.f29041c = sVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f29040b = obj;
            this.f29042d |= Integer.MIN_VALUE;
            return this.f29041c.j1(this);
        }
    }

    public s(d dVar) {
        this.f29031a = dVar;
    }

    public long B1(long j10) {
        return this.f29031a.B1(j10);
    }

    public float E(int i10) {
        return this.f29031a.E(i10);
    }

    public int E0(float f10) {
        return this.f29031a.E0(f10);
    }

    public float N0(long j10) {
        return this.f29031a.N0(j10);
    }

    public long P(float f10) {
        return this.f29031a.P(f10);
    }

    public long Q(long j10) {
        return this.f29031a.Q(j10);
    }

    public float V(long j10) {
        return this.f29031a.V(j10);
    }

    public final void a() {
        this.f29033c = true;
        C5817a.C0988a.c(this.f29034d, (Object) null, 1, (Object) null);
    }

    public final void e() {
        this.f29032b = true;
        C5817a.C0988a.c(this.f29034d, (Object) null, 1, (Object) null);
    }

    public long f0(int i10) {
        return this.f29031a.f0(i10);
    }

    public long g0(float f10) {
        return this.f29031a.g0(f10);
    }

    public float getDensity() {
        return this.f29031a.getDensity();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object j1(qf.C6658d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof z.s.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            z.s$b r0 = (z.s.b) r0
            int r1 = r0.f29042d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f29042d = r1
            goto L_0x0018
        L_0x0013:
            z.s$b r0 = new z.s$b
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f29040b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f29042d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            java.lang.Object r0 = r0.f29039a
            z.s r0 = (z.s) r0
            lf.w.b(r6)
            goto L_0x004f
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            lf.w.b(r6)
            boolean r6 = r5.f29032b
            if (r6 != 0) goto L_0x0055
            boolean r6 = r5.f29033c
            if (r6 != 0) goto L_0x0055
            dh.a r6 = r5.f29034d
            r0.f29039a = r5
            r0.f29042d = r4
            java.lang.Object r6 = dh.C5817a.C0988a.a(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r0 = r5
        L_0x004f:
            dh.a r6 = r0.f29034d
            dh.C5817a.C0988a.c(r6, r3, r4, r3)
            goto L_0x0056
        L_0x0055:
            r0 = r5
        L_0x0056:
            boolean r6 = r0.f29032b
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z.s.j1(qf.d):java.lang.Object");
    }

    public float m1(float f10) {
        return this.f29031a.m1(f10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(qf.C6658d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof z.s.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            z.s$a r0 = (z.s.a) r0
            int r1 = r0.f29038d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f29038d = r1
            goto L_0x0018
        L_0x0013:
            z.s$a r0 = new z.s$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f29036b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f29038d
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f29035a
            z.s r0 = (z.s) r0
            lf.w.b(r5)
            goto L_0x0047
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            lf.w.b(r5)
            dh.a r5 = r4.f29034d
            r0.f29035a = r4
            r0.f29038d = r3
            r2 = 0
            java.lang.Object r5 = dh.C5817a.C0988a.a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L_0x0046
            return r1
        L_0x0046:
            r0 = r4
        L_0x0047:
            r5 = 0
            r0.f29032b = r5
            r0.f29033c = r5
            lf.M r5 = lf.C6514M.f71813a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z.s.o(qf.d):java.lang.Object");
    }

    public float r1() {
        return this.f29031a.r1();
    }

    public float t1(float f10) {
        return this.f29031a.t1(f10);
    }
}
