package e4;

import X3.b;
import e4.C3488b;
import j4.C3622i;
import j4.C3624k;
import java.util.List;
import k4.C3667i;
import kotlin.coroutines.jvm.internal.d;
import qf.C6658d;

/* renamed from: e4.c  reason: case insensitive filesystem */
public final class C3489c implements C3488b.a {

    /* renamed from: a  reason: collision with root package name */
    private final C3622i f43325a;

    /* renamed from: b  reason: collision with root package name */
    private final List f43326b;

    /* renamed from: c  reason: collision with root package name */
    private final int f43327c;

    /* renamed from: d  reason: collision with root package name */
    private final C3622i f43328d;

    /* renamed from: e  reason: collision with root package name */
    private final C3667i f43329e;

    /* renamed from: f  reason: collision with root package name */
    private final b f43330f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f43331g;

    /* renamed from: e4.c$a */
    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f43332a;

        /* renamed from: b  reason: collision with root package name */
        Object f43333b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f43334c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C3489c f43335d;

        /* renamed from: e  reason: collision with root package name */
        int f43336e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C3489c cVar, C6658d dVar) {
            super(dVar);
            this.f43335d = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f43334c = obj;
            this.f43336e |= Integer.MIN_VALUE;
            return this.f43335d.g((C3622i) null, this);
        }
    }

    public C3489c(C3622i iVar, List list, int i10, C3622i iVar2, C3667i iVar3, b bVar, boolean z10) {
        this.f43325a = iVar;
        this.f43326b = list;
        this.f43327c = i10;
        this.f43328d = iVar2;
        this.f43329e = iVar3;
        this.f43330f = bVar;
        this.f43331g = z10;
    }

    private final void b(C3622i iVar, C3488b bVar) {
        if (iVar.l() != this.f43325a.l()) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's context.").toString());
        } else if (iVar.m() == C3624k.f44749a) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot set the request's data to null.").toString());
        } else if (iVar.M() != this.f43325a.M()) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's target.").toString());
        } else if (iVar.z() != this.f43325a.z()) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's lifecycle.").toString());
        } else if (iVar.K() != this.f43325a.K()) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
        }
    }

    private final C3489c c(int i10, C3622i iVar, C3667i iVar2) {
        return new C3489c(this.f43325a, this.f43326b, i10, iVar, iVar2, this.f43330f, this.f43331g);
    }

    static /* synthetic */ C3489c d(C3489c cVar, int i10, C3622i iVar, C3667i iVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = cVar.f43327c;
        }
        if ((i11 & 2) != 0) {
            iVar = cVar.a();
        }
        if ((i11 & 4) != 0) {
            iVar2 = cVar.getSize();
        }
        return cVar.c(i10, iVar, iVar2);
    }

    public C3622i a() {
        return this.f43328d;
    }

    public final b e() {
        return this.f43330f;
    }

    public final boolean f() {
        return this.f43331g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(j4.C3622i r12, qf.C6658d r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof e4.C3489c.a
            if (r0 == 0) goto L_0x0013
            r0 = r13
            e4.c$a r0 = (e4.C3489c.a) r0
            int r1 = r0.f43336e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f43336e = r1
            goto L_0x0018
        L_0x0013:
            e4.c$a r0 = new e4.c$a
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f43334c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f43336e
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r12 = r0.f43333b
            e4.b r12 = (e4.C3488b) r12
            java.lang.Object r0 = r0.f43332a
            e4.c r0 = (e4.C3489c) r0
            lf.w.b(r13)
            goto L_0x0074
        L_0x0031:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0039:
            lf.w.b(r13)
            int r13 = r11.f43327c
            if (r13 <= 0) goto L_0x004c
            java.util.List r2 = r11.f43326b
            int r13 = r13 - r3
            java.lang.Object r13 = r2.get(r13)
            e4.b r13 = (e4.C3488b) r13
            r11.b(r12, r13)
        L_0x004c:
            java.util.List r13 = r11.f43326b
            int r2 = r11.f43327c
            java.lang.Object r13 = r13.get(r2)
            e4.b r13 = (e4.C3488b) r13
            int r2 = r11.f43327c
            int r5 = r2 + 1
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r11
            r6 = r12
            e4.c r12 = d(r4, r5, r6, r7, r8, r9)
            r0.f43332a = r11
            r0.f43333b = r13
            r0.f43336e = r3
            java.lang.Object r12 = r13.a(r12, r0)
            if (r12 != r1) goto L_0x0070
            return r1
        L_0x0070:
            r0 = r11
            r10 = r13
            r13 = r12
            r12 = r10
        L_0x0074:
            j4.j r13 = (j4.C3623j) r13
            j4.i r1 = r13.b()
            r0.b(r1, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C3489c.g(j4.i, qf.d):java.lang.Object");
    }

    public C3667i getSize() {
        return this.f43329e;
    }
}
