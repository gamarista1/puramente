package androidx.compose.foundation;

import B.g;
import B.h;
import B.l;
import D0.C1124o;
import D0.C1126q;
import D0.C1127s;
import J0.s0;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import k0.i;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

final class i extends i.c implements s0 {

    /* renamed from: n  reason: collision with root package name */
    private l f12737n;

    /* renamed from: o  reason: collision with root package name */
    private g f12738o;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f12739a;

        /* renamed from: b  reason: collision with root package name */
        Object f12740b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f12741c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f12742d;

        /* renamed from: e  reason: collision with root package name */
        int f12743e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, C6658d dVar) {
            super(dVar);
            this.f12742d = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12741c = obj;
            this.f12743e |= Integer.MIN_VALUE;
            return this.f12742d.n2(this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f12744a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f12745b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f12746c;

        /* renamed from: d  reason: collision with root package name */
        int f12747d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, C6658d dVar) {
            super(dVar);
            this.f12746c = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12745b = obj;
            this.f12747d |= Integer.MIN_VALUE;
            return this.f12746c.o2(this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f12748a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f12749b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(i iVar, C6658d dVar) {
            super(2, dVar);
            this.f12749b = iVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new c(this.f12749b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f12748a;
            if (i10 == 0) {
                w.b(obj);
                i iVar = this.f12749b;
                this.f12748a = 1;
                if (iVar.n2(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f12750a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f12751b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar, C6658d dVar) {
            super(2, dVar);
            this.f12751b = iVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new d(this.f12751b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((d) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f12750a;
            if (i10 == 0) {
                w.b(obj);
                i iVar = this.f12751b;
                this.f12750a = 1;
                if (iVar.o2(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    public i(l lVar) {
        this.f12737n = lVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n2(qf.C6658d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.i.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.compose.foundation.i$a r0 = (androidx.compose.foundation.i.a) r0
            int r1 = r0.f12743e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12743e = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.i$a r0 = new androidx.compose.foundation.i$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f12741c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f12743e
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f12740b
            B.g r1 = (B.g) r1
            java.lang.Object r0 = r0.f12739a
            androidx.compose.foundation.i r0 = (androidx.compose.foundation.i) r0
            lf.w.b(r5)
            goto L_0x0056
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0039:
            lf.w.b(r5)
            B.g r5 = r4.f12738o
            if (r5 != 0) goto L_0x0058
            B.g r5 = new B.g
            r5.<init>()
            B.l r2 = r4.f12737n
            r0.f12739a = r4
            r0.f12740b = r5
            r0.f12743e = r3
            java.lang.Object r0 = r2.b(r5, r0)
            if (r0 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r0 = r4
            r1 = r5
        L_0x0056:
            r0.f12738o = r1
        L_0x0058:
            lf.M r5 = lf.C6514M.f71813a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.i.n2(qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o2(qf.C6658d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.i.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.compose.foundation.i$b r0 = (androidx.compose.foundation.i.b) r0
            int r1 = r0.f12747d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12747d = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.i$b r0 = new androidx.compose.foundation.i$b
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f12745b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f12747d
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f12744a
            androidx.compose.foundation.i r0 = (androidx.compose.foundation.i) r0
            lf.w.b(r5)
            goto L_0x004f
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            lf.w.b(r5)
            B.g r5 = r4.f12738o
            if (r5 == 0) goto L_0x0052
            B.h r2 = new B.h
            r2.<init>(r5)
            B.l r5 = r4.f12737n
            r0.f12744a = r4
            r0.f12747d = r3
            java.lang.Object r5 = r5.b(r2, r0)
            if (r5 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r0 = r4
        L_0x004f:
            r5 = 0
            r0.f12738o = r5
        L_0x0052:
            lf.M r5 = lf.C6514M.f71813a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.i.o2(qf.d):java.lang.Object");
    }

    private final void p2() {
        g gVar = this.f12738o;
        if (gVar != null) {
            this.f12737n.a(new h(gVar));
            this.f12738o = null;
        }
    }

    public void C0(C1124o oVar, C1126q qVar, long j10) {
        if (qVar == C1126q.Main) {
            int f10 = oVar.f();
            C1127s.a aVar = C1127s.f1491a;
            if (C1127s.i(f10, aVar.a())) {
                C5600w0 unused = C5576k.d(L1(), (qf.g) null, (M) null, new c(this, (C6658d) null), 3, (Object) null);
            } else if (C1127s.i(f10, aVar.b())) {
                C5600w0 unused2 = C5576k.d(L1(), (qf.g) null, (M) null, new d(this, (C6658d) null), 3, (Object) null);
            }
        }
    }

    public void W1() {
        p2();
    }

    public void i1() {
        p2();
    }

    public final void q2(l lVar) {
        if (!C6496s.c(this.f12737n, lVar)) {
            p2();
            this.f12737n = lVar;
        }
    }
}
