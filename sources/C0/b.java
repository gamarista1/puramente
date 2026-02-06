package C0;

import Ug.K;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C6498u;
import q0.C2421g;
import qf.C6658d;
import yf.C6787a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private c f1106a;

    /* renamed from: b  reason: collision with root package name */
    private C6787a f1107b = new a(this);

    /* renamed from: c  reason: collision with root package name */
    private K f1108c;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f1109a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.f1109a = bVar;
        }

        /* renamed from: a */
        public final K invoke() {
            return this.f1109a.h();
        }
    }

    /* renamed from: C0.b$b  reason: collision with other inner class name */
    static final class C0012b extends d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f1110a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f1111b;

        /* renamed from: c  reason: collision with root package name */
        int f1112c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0012b(b bVar, C6658d dVar) {
            super(dVar);
            this.f1111b = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f1110a = obj;
            this.f1112c |= Integer.MIN_VALUE;
            return this.f1111b.a(0, 0, this);
        }
    }

    static final class c extends d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f1113a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f1114b;

        /* renamed from: c  reason: collision with root package name */
        int f1115c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, C6658d dVar) {
            super(dVar);
            this.f1114b = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f1113a = obj;
            this.f1115c |= Integer.MIN_VALUE;
            return this.f1114b.c(0, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r8, long r10, qf.C6658d r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof C0.b.C0012b
            if (r0 == 0) goto L_0x0014
            r0 = r12
            C0.b$b r0 = (C0.b.C0012b) r0
            int r1 = r0.f1112c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f1112c = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            C0.b$b r0 = new C0.b$b
            r0.<init>(r7, r12)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r12 = r6.f1110a
            java.lang.Object r0 = rf.C6680b.f()
            int r1 = r6.f1112c
            r2 = 1
            if (r1 == 0) goto L_0x0033
            if (r1 != r2) goto L_0x002b
            lf.w.b(r12)
            goto L_0x0047
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            lf.w.b(r12)
            C0.a r1 = r7.g()
            if (r1 == 0) goto L_0x004e
            r6.f1112c = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.b0(r2, r4, r6)
            if (r12 != r0) goto L_0x0047
            return r0
        L_0x0047:
            c1.y r12 = (c1.y) r12
            long r8 = r12.o()
            goto L_0x0054
        L_0x004e:
            c1.y$a r8 = c1.y.f19251b
            long r8 = r8.a()
        L_0x0054:
            c1.y r8 = c1.y.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.b.a(long, long, qf.d):java.lang.Object");
    }

    public final long b(long j10, long j11, int i10) {
        a g10 = g();
        if (g10 != null) {
            return g10.M0(j10, j11, i10);
        }
        return C2421g.f25320b.c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(long r5, qf.C6658d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof C0.b.c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            C0.b$c r0 = (C0.b.c) r0
            int r1 = r0.f1115c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1115c = r1
            goto L_0x0018
        L_0x0013:
            C0.b$c r0 = new C0.b$c
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f1113a
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f1115c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            lf.w.b(r7)
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            lf.w.b(r7)
            C0.a r7 = r4.g()
            if (r7 == 0) goto L_0x004a
            r0.f1115c = r3
            java.lang.Object r7 = r7.D1(r5, r0)
            if (r7 != r1) goto L_0x0043
            return r1
        L_0x0043:
            c1.y r7 = (c1.y) r7
            long r5 = r7.o()
            goto L_0x0050
        L_0x004a:
            c1.y$a r5 = c1.y.f19251b
            long r5 = r5.a()
        L_0x0050:
            c1.y r5 = c1.y.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.b.c(long, qf.d):java.lang.Object");
    }

    public final long d(long j10, int i10) {
        a g10 = g();
        if (g10 != null) {
            return g10.q1(j10, i10);
        }
        return C2421g.f25320b.c();
    }

    public final K e() {
        K k10 = (K) this.f1107b.invoke();
        if (k10 != null) {
            return k10;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final c f() {
        return this.f1106a;
    }

    public final a g() {
        c cVar = this.f1106a;
        if (cVar != null) {
            return cVar.o2();
        }
        return null;
    }

    public final K h() {
        return this.f1108c;
    }

    public final void i(C6787a aVar) {
        this.f1107b = aVar;
    }

    public final void j(c cVar) {
        this.f1106a = cVar;
    }

    public final void k(K k10) {
        this.f1108c = k10;
    }
}
