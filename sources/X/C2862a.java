package x;

import Af.a;
import D0.C1111b;
import D0.J;
import D0.T;
import D0.z;
import Y.C1510r0;
import Y.p1;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.B0;
import androidx.compose.ui.platform.C1676z0;
import c1.s;
import k0.i;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import q0.C2421g;
import q0.C2422h;
import q0.C2427m;
import q0.C2428n;
import qf.C6658d;
import r0.C2550z0;
import rf.C6680b;
import yf.C6798l;
import yf.p;
import z.o;

/* renamed from: x.a  reason: case insensitive filesystem */
public final class C2862a implements C2855T {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public C2421g f27901a;

    /* renamed from: b  reason: collision with root package name */
    private final C2884w f27902b;

    /* renamed from: c  reason: collision with root package name */
    private final C1510r0 f27903c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f27904d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f27905e;

    /* renamed from: f  reason: collision with root package name */
    private long f27906f = C2427m.f25341b.b();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public z f27907g;

    /* renamed from: h  reason: collision with root package name */
    private final i f27908h;

    /* renamed from: x.a$a  reason: collision with other inner class name */
    static final class C0466a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f27909a;

        /* renamed from: b  reason: collision with root package name */
        long f27910b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f27911c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2862a f27912d;

        /* renamed from: e  reason: collision with root package name */
        int f27913e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0466a(C2862a aVar, C6658d dVar) {
            super(dVar);
            this.f27912d = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f27911c = obj;
            this.f27913e |= Integer.MIN_VALUE;
            return this.f27912d.c(0, (p) null, this);
        }
    }

    /* renamed from: x.a$b */
    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f27914a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f27915b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2862a f27916c;

        /* renamed from: x.a$b$a  reason: collision with other inner class name */
        static final class C0467a extends k implements p {

            /* renamed from: b  reason: collision with root package name */
            int f27917b;

            /* renamed from: c  reason: collision with root package name */
            private /* synthetic */ Object f27918c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C2862a f27919d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0467a(C2862a aVar, C6658d dVar) {
                super(2, dVar);
                this.f27919d = aVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                C0467a aVar = new C0467a(this.f27919d, dVar);
                aVar.f27918c = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(C1111b bVar, C6658d dVar) {
                return ((C0467a) create(bVar, dVar)).invokeSuspend(C6514M.f71813a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: D0.A} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: D0.b} */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x0066 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x007e  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x00b7  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0  */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x00e0  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x00b2 A[SYNTHETIC] */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = rf.C6680b.f()
                    int r1 = r12.f27917b
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L_0x0027
                    if (r1 == r4) goto L_0x001f
                    if (r1 != r2) goto L_0x0017
                    java.lang.Object r1 = r12.f27918c
                    D0.b r1 = (D0.C1111b) r1
                    lf.w.b(r13)
                    goto L_0x0067
                L_0x0017:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L_0x001f:
                    java.lang.Object r1 = r12.f27918c
                    D0.b r1 = (D0.C1111b) r1
                    lf.w.b(r13)
                    goto L_0x0040
                L_0x0027:
                    lf.w.b(r13)
                    java.lang.Object r13 = r12.f27918c
                    r1 = r13
                    D0.b r1 = (D0.C1111b) r1
                    r12.f27918c = r1
                    r12.f27917b = r4
                    r6 = 0
                    r7 = 0
                    r9 = 2
                    r10 = 0
                    r5 = r1
                    r8 = r12
                    java.lang.Object r13 = z.C2938B.e(r5, r6, r7, r8, r9, r10)
                    if (r13 != r0) goto L_0x0040
                    return r0
                L_0x0040:
                    D0.A r13 = (D0.A) r13
                    x.a r5 = r12.f27919d
                    long r6 = r13.f()
                    D0.z r6 = D0.z.a(r6)
                    r5.f27907g = r6
                    x.a r5 = r12.f27919d
                    long r6 = r13.h()
                    q0.g r13 = q0.C2421g.d(r6)
                    r5.f27901a = r13
                L_0x005c:
                    r12.f27918c = r1
                    r12.f27917b = r2
                    java.lang.Object r13 = D0.C1111b.u0(r1, r3, r12, r4, r3)
                    if (r13 != r0) goto L_0x0067
                    return r0
                L_0x0067:
                    D0.o r13 = (D0.C1124o) r13
                    java.util.List r13 = r13.c()
                    java.util.ArrayList r5 = new java.util.ArrayList
                    int r6 = r13.size()
                    r5.<init>(r6)
                    int r6 = r13.size()
                    r7 = 0
                    r8 = r7
                L_0x007c:
                    if (r8 >= r6) goto L_0x0091
                    java.lang.Object r9 = r13.get(r8)
                    r10 = r9
                    D0.A r10 = (D0.A) r10
                    boolean r10 = r10.i()
                    if (r10 == 0) goto L_0x008e
                    r5.add(r9)
                L_0x008e:
                    int r8 = r8 + 1
                    goto L_0x007c
                L_0x0091:
                    x.a r13 = r12.f27919d
                    int r6 = r5.size()
                L_0x0097:
                    if (r7 >= r6) goto L_0x00b2
                    java.lang.Object r8 = r5.get(r7)
                    r9 = r8
                    D0.A r9 = (D0.A) r9
                    long r9 = r9.f()
                    D0.z r11 = r13.f27907g
                    boolean r9 = D0.z.c(r9, r11)
                    if (r9 == 0) goto L_0x00af
                    goto L_0x00b3
                L_0x00af:
                    int r7 = r7 + 1
                    goto L_0x0097
                L_0x00b2:
                    r8 = r3
                L_0x00b3:
                    D0.A r8 = (D0.A) r8
                    if (r8 != 0) goto L_0x00be
                    java.lang.Object r13 = mf.C6565s.q0(r5)
                    r8 = r13
                    D0.A r8 = (D0.A) r8
                L_0x00be:
                    if (r8 == 0) goto L_0x00da
                    x.a r13 = r12.f27919d
                    long r6 = r8.f()
                    D0.z r6 = D0.z.a(r6)
                    r13.f27907g = r6
                    x.a r13 = r12.f27919d
                    long r6 = r8.h()
                    q0.g r6 = q0.C2421g.d(r6)
                    r13.f27901a = r6
                L_0x00da:
                    boolean r13 = r5.isEmpty()
                    if (r13 == 0) goto L_0x005c
                    x.a r13 = r12.f27919d
                    r13.f27907g = r3
                    lf.M r13 = lf.C6514M.f71813a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: x.C2862a.b.C0467a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2862a aVar, C6658d dVar) {
            super(2, dVar);
            this.f27916c = aVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f27916c, dVar);
            bVar.f27915b = obj;
            return bVar;
        }

        public final Object invoke(J j10, C6658d dVar) {
            return ((b) create(j10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f27914a;
            if (i10 == 0) {
                w.b(obj);
                C0467a aVar = new C0467a(this.f27916c, (C6658d) null);
                this.f27914a = 1;
                if (o.c((J) this.f27915b, aVar, this) == f10) {
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

    /* renamed from: x.a$c */
    public static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2862a f27920a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C2862a aVar) {
            super(1);
            this.f27920a = aVar;
        }

        public final void a(B0 b02) {
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.c.a(obj);
            a((B0) null);
            return C6514M.f71813a;
        }
    }

    /* renamed from: x.a$d */
    public static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2862a f27921a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C2862a aVar) {
            super(1);
            this.f27921a = aVar;
        }

        public final void a(B0 b02) {
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.c.a(obj);
            a((B0) null);
            return C6514M.f71813a;
        }
    }

    public C2862a(Context context, C2853Q q10) {
        i iVar;
        C6798l lVar;
        C6798l lVar2;
        C2884w wVar = new C2884w(context, C2550z0.k(q10.b()));
        this.f27902b = wVar;
        C6514M m10 = C6514M.f71813a;
        this.f27903c = p1.h(m10, p1.j());
        i d10 = T.d(i.f23074a, m10, new b(this, (C6658d) null));
        if (Build.VERSION.SDK_INT >= 31) {
            if (C1676z0.b()) {
                lVar2 = new c(this);
            } else {
                lVar2 = C1676z0.a();
            }
            iVar = new C2882u(this, wVar, lVar2);
        } else {
            if (C1676z0.b()) {
                lVar = new d(this);
            } else {
                lVar = C1676z0.a();
            }
            iVar = new C2876o(this, wVar, q10, lVar);
        }
        this.f27908h = d10.h(iVar);
    }

    private final void h() {
        boolean z10;
        C2884w wVar = this.f27902b;
        EdgeEffect d10 = wVar.f27982d;
        boolean z11 = false;
        if (d10 != null) {
            d10.onRelease();
            z10 = d10.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect a10 = wVar.f27983e;
        if (a10 != null) {
            a10.onRelease();
            if (a10.isFinished() || z10) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        EdgeEffect b10 = wVar.f27984f;
        if (b10 != null) {
            b10.onRelease();
            if (b10.isFinished() || z10) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        EdgeEffect c10 = wVar.f27985g;
        if (c10 != null) {
            c10.onRelease();
            if (c10.isFinished() || z10) {
                z11 = true;
            }
            z10 = z11;
        }
        if (z10) {
            k();
        }
    }

    private final float l(long j10) {
        float m10 = C2421g.m(i());
        float n10 = C2421g.n(j10) / C2427m.i(this.f27906f);
        EdgeEffect f10 = this.f27902b.f();
        C2883v vVar = C2883v.f27978a;
        float i10 = (-vVar.d(f10, -n10, ((float) 1) - m10)) * C2427m.i(this.f27906f);
        if (vVar.b(f10) == 0.0f) {
            return i10;
        }
        return C2421g.n(j10);
    }

    private final float m(long j10) {
        float n10 = C2421g.n(i());
        float m10 = C2421g.m(j10) / C2427m.k(this.f27906f);
        EdgeEffect h10 = this.f27902b.h();
        C2883v vVar = C2883v.f27978a;
        float d10 = vVar.d(h10, m10, ((float) 1) - n10) * C2427m.k(this.f27906f);
        if (vVar.b(h10) == 0.0f) {
            return d10;
        }
        return C2421g.m(j10);
    }

    private final float n(long j10) {
        float n10 = C2421g.n(i());
        float m10 = C2421g.m(j10) / C2427m.k(this.f27906f);
        EdgeEffect j11 = this.f27902b.j();
        C2883v vVar = C2883v.f27978a;
        float k10 = (-vVar.d(j11, -m10, n10)) * C2427m.k(this.f27906f);
        if (vVar.b(j11) == 0.0f) {
            return k10;
        }
        return C2421g.m(j10);
    }

    private final float o(long j10) {
        float m10 = C2421g.m(i());
        float n10 = C2421g.n(j10) / C2427m.i(this.f27906f);
        EdgeEffect l10 = this.f27902b.l();
        C2883v vVar = C2883v.f27978a;
        float d10 = vVar.d(l10, n10, m10) * C2427m.i(this.f27906f);
        if (vVar.b(l10) == 0.0f) {
            return d10;
        }
        return C2421g.n(j10);
    }

    private final boolean p(long j10) {
        boolean z10;
        boolean z11 = true;
        if (!this.f27902b.r() || C2421g.m(j10) >= 0.0f) {
            z10 = false;
        } else {
            C2883v.f27978a.e(this.f27902b.h(), C2421g.m(j10));
            z10 = !this.f27902b.r();
        }
        if (this.f27902b.u() && C2421g.m(j10) > 0.0f) {
            C2883v.f27978a.e(this.f27902b.j(), C2421g.m(j10));
            if (z10 || !this.f27902b.u()) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (this.f27902b.y() && C2421g.n(j10) < 0.0f) {
            C2883v.f27978a.e(this.f27902b.l(), C2421g.n(j10));
            if (z10 || !this.f27902b.y()) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (!this.f27902b.o() || C2421g.n(j10) <= 0.0f) {
            return z10;
        }
        C2883v.f27978a.e(this.f27902b.f(), C2421g.n(j10));
        if (!z10 && this.f27902b.o()) {
            z11 = false;
        }
        return z11;
    }

    private final boolean q() {
        boolean z10;
        if (this.f27902b.t()) {
            m(C2421g.f25320b.c());
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f27902b.w()) {
            n(C2421g.f25320b.c());
            z10 = true;
        }
        if (this.f27902b.A()) {
            o(C2421g.f25320b.c());
            z10 = true;
        }
        if (!this.f27902b.q()) {
            return z10;
        }
        l(C2421g.f25320b.c());
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long a(long r11, int r13, yf.C6798l r14) {
        /*
            r10 = this;
            long r0 = r10.f27906f
            boolean r0 = q0.C2427m.m(r0)
            if (r0 == 0) goto L_0x0017
            q0.g r11 = q0.C2421g.d(r11)
            java.lang.Object r11 = r14.invoke(r11)
            q0.g r11 = (q0.C2421g) r11
            long r11 = r11.v()
            return r11
        L_0x0017:
            boolean r0 = r10.f27905e
            r1 = 1
            if (r0 != 0) goto L_0x0021
            r10.q()
            r10.f27905e = r1
        L_0x0021:
            float r0 = q0.C2421g.n(r11)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
        L_0x002a:
            r0 = r2
            goto L_0x0067
        L_0x002c:
            x.w r0 = r10.f27902b
            boolean r0 = r0.A()
            if (r0 == 0) goto L_0x004a
            float r0 = r10.o(r11)
            x.w r3 = r10.f27902b
            boolean r3 = r3.A()
            if (r3 != 0) goto L_0x0067
            x.w r3 = r10.f27902b
            android.widget.EdgeEffect r3 = r3.l()
            r3.onRelease()
            goto L_0x0067
        L_0x004a:
            x.w r0 = r10.f27902b
            boolean r0 = r0.q()
            if (r0 == 0) goto L_0x002a
            float r0 = r10.l(r11)
            x.w r3 = r10.f27902b
            boolean r3 = r3.q()
            if (r3 != 0) goto L_0x0067
            x.w r3 = r10.f27902b
            android.widget.EdgeEffect r3 = r3.f()
            r3.onRelease()
        L_0x0067:
            float r3 = q0.C2421g.m(r11)
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0070
            goto L_0x00ab
        L_0x0070:
            x.w r3 = r10.f27902b
            boolean r3 = r3.t()
            if (r3 == 0) goto L_0x008e
            float r2 = r10.m(r11)
            x.w r3 = r10.f27902b
            boolean r3 = r3.t()
            if (r3 != 0) goto L_0x00ab
            x.w r3 = r10.f27902b
            android.widget.EdgeEffect r3 = r3.h()
            r3.onRelease()
            goto L_0x00ab
        L_0x008e:
            x.w r3 = r10.f27902b
            boolean r3 = r3.w()
            if (r3 == 0) goto L_0x00ab
            float r2 = r10.n(r11)
            x.w r3 = r10.f27902b
            boolean r3 = r3.w()
            if (r3 != 0) goto L_0x00ab
            x.w r3 = r10.f27902b
            android.widget.EdgeEffect r3 = r3.j()
            r3.onRelease()
        L_0x00ab:
            long r2 = q0.C2422h.a(r2, r0)
            q0.g$a r0 = q0.C2421g.f25320b
            long r4 = r0.c()
            boolean r0 = q0.C2421g.j(r2, r4)
            if (r0 != 0) goto L_0x00be
            r10.k()
        L_0x00be:
            long r4 = q0.C2421g.q(r11, r2)
            q0.g r0 = q0.C2421g.d(r4)
            java.lang.Object r14 = r14.invoke(r0)
            q0.g r14 = (q0.C2421g) r14
            long r6 = r14.v()
            long r4 = q0.C2421g.q(r4, r6)
            C0.e$a r14 = C0.e.f1131a
            int r14 = r14.b()
            boolean r13 = C0.e.d(r13, r14)
            r14 = 0
            if (r13 == 0) goto L_0x0120
            float r13 = q0.C2421g.m(r4)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            r8 = -1090519040(0xffffffffbf000000, float:-0.5)
            if (r13 <= 0) goto L_0x00f2
            r10.m(r4)
        L_0x00f0:
            r13 = r1
            goto L_0x00ff
        L_0x00f2:
            float r13 = q0.C2421g.m(r4)
            int r13 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r13 >= 0) goto L_0x00fe
            r10.n(r4)
            goto L_0x00f0
        L_0x00fe:
            r13 = r14
        L_0x00ff:
            float r9 = q0.C2421g.n(r4)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x010c
            r10.o(r4)
        L_0x010a:
            r0 = r1
            goto L_0x0119
        L_0x010c:
            float r0 = q0.C2421g.n(r4)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0118
            r10.l(r4)
            goto L_0x010a
        L_0x0118:
            r0 = r14
        L_0x0119:
            if (r13 != 0) goto L_0x011f
            if (r0 == 0) goto L_0x011e
            goto L_0x011f
        L_0x011e:
            r1 = r14
        L_0x011f:
            r14 = r1
        L_0x0120:
            boolean r11 = r10.p(r11)
            if (r11 != 0) goto L_0x0128
            if (r14 == 0) goto L_0x012b
        L_0x0128:
            r10.k()
        L_0x012b:
            long r11 = q0.C2421g.r(r2, r6)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C2862a.a(long, int, yf.l):long");
    }

    public boolean b() {
        C2884w wVar = this.f27902b;
        EdgeEffect d10 = wVar.f27982d;
        if (d10 != null && C2883v.f27978a.b(d10) != 0.0f) {
            return true;
        }
        EdgeEffect a10 = wVar.f27983e;
        if (a10 != null && C2883v.f27978a.b(a10) != 0.0f) {
            return true;
        }
        EdgeEffect b10 = wVar.f27984f;
        if (b10 != null && C2883v.f27978a.b(b10) != 0.0f) {
            return true;
        }
        EdgeEffect c10 = wVar.f27985g;
        if (c10 == null || C2883v.f27978a.b(c10) == 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(long r11, yf.p r13, qf.C6658d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof x.C2862a.C0466a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            x.a$a r0 = (x.C2862a.C0466a) r0
            int r1 = r0.f27913e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f27913e = r1
            goto L_0x0018
        L_0x0013:
            x.a$a r0 = new x.a$a
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f27911c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f27913e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            long r11 = r0.f27910b
            java.lang.Object r13 = r0.f27909a
            x.a r13 = (x.C2862a) r13
            lf.w.b(r14)
            goto L_0x0128
        L_0x0034:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003c:
            lf.w.b(r14)
            goto L_0x0058
        L_0x0040:
            lf.w.b(r14)
            long r6 = r10.f27906f
            boolean r14 = q0.C2427m.m(r6)
            if (r14 == 0) goto L_0x005b
            c1.y r11 = c1.y.b(r11)
            r0.f27913e = r4
            java.lang.Object r11 = r13.invoke(r11, r0)
            if (r11 != r1) goto L_0x0058
            return r1
        L_0x0058:
            lf.M r11 = lf.C6514M.f71813a
            return r11
        L_0x005b:
            float r14 = c1.y.h(r11)
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x0083
            x.w r14 = r10.f27902b
            boolean r14 = r14.t()
            if (r14 == 0) goto L_0x0083
            x.v r14 = x.C2883v.f27978a
            x.w r2 = r10.f27902b
            android.widget.EdgeEffect r2 = r2.h()
            float r4 = c1.y.h(r11)
            int r4 = Af.a.d(r4)
            r14.c(r2, r4)
            float r14 = c1.y.h(r11)
            goto L_0x00ad
        L_0x0083:
            float r14 = c1.y.h(r11)
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 >= 0) goto L_0x00ac
            x.w r14 = r10.f27902b
            boolean r14 = r14.w()
            if (r14 == 0) goto L_0x00ac
            x.v r14 = x.C2883v.f27978a
            x.w r2 = r10.f27902b
            android.widget.EdgeEffect r2 = r2.j()
            float r4 = c1.y.h(r11)
            int r4 = Af.a.d(r4)
            int r4 = -r4
            r14.c(r2, r4)
            float r14 = c1.y.h(r11)
            goto L_0x00ad
        L_0x00ac:
            r14 = r5
        L_0x00ad:
            float r2 = c1.y.i(r11)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x00d5
            x.w r2 = r10.f27902b
            boolean r2 = r2.A()
            if (r2 == 0) goto L_0x00d5
            x.v r2 = x.C2883v.f27978a
            x.w r4 = r10.f27902b
            android.widget.EdgeEffect r4 = r4.l()
            float r6 = c1.y.i(r11)
            int r6 = Af.a.d(r6)
            r2.c(r4, r6)
            float r2 = c1.y.i(r11)
            goto L_0x00ff
        L_0x00d5:
            float r2 = c1.y.i(r11)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x00fe
            x.w r2 = r10.f27902b
            boolean r2 = r2.q()
            if (r2 == 0) goto L_0x00fe
            x.v r2 = x.C2883v.f27978a
            x.w r4 = r10.f27902b
            android.widget.EdgeEffect r4 = r4.f()
            float r6 = c1.y.i(r11)
            int r6 = Af.a.d(r6)
            int r6 = -r6
            r2.c(r4, r6)
            float r2 = c1.y.i(r11)
            goto L_0x00ff
        L_0x00fe:
            r2 = r5
        L_0x00ff:
            long r6 = c1.z.a(r14, r2)
            c1.y$a r14 = c1.y.f19251b
            long r8 = r14.a()
            boolean r14 = c1.y.g(r6, r8)
            if (r14 != 0) goto L_0x0112
            r10.k()
        L_0x0112:
            long r11 = c1.y.k(r11, r6)
            c1.y r14 = c1.y.b(r11)
            r0.f27909a = r10
            r0.f27910b = r11
            r0.f27913e = r3
            java.lang.Object r14 = r13.invoke(r14, r0)
            if (r14 != r1) goto L_0x0127
            return r1
        L_0x0127:
            r13 = r10
        L_0x0128:
            c1.y r14 = (c1.y) r14
            long r0 = r14.o()
            long r11 = c1.y.k(r11, r0)
            r14 = 0
            r13.f27905e = r14
            float r14 = c1.y.h(r11)
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x0151
            x.v r14 = x.C2883v.f27978a
            x.w r0 = r13.f27902b
            android.widget.EdgeEffect r0 = r0.h()
            float r1 = c1.y.h(r11)
            int r1 = Af.a.d(r1)
            r14.c(r0, r1)
            goto L_0x016d
        L_0x0151:
            float r14 = c1.y.h(r11)
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 >= 0) goto L_0x016d
            x.v r14 = x.C2883v.f27978a
            x.w r0 = r13.f27902b
            android.widget.EdgeEffect r0 = r0.j()
            float r1 = c1.y.h(r11)
            int r1 = Af.a.d(r1)
            int r1 = -r1
            r14.c(r0, r1)
        L_0x016d:
            float r14 = c1.y.i(r11)
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x0189
            x.v r14 = x.C2883v.f27978a
            x.w r0 = r13.f27902b
            android.widget.EdgeEffect r0 = r0.l()
            float r1 = c1.y.i(r11)
            int r1 = Af.a.d(r1)
            r14.c(r0, r1)
            goto L_0x01a5
        L_0x0189:
            float r14 = c1.y.i(r11)
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 >= 0) goto L_0x01a5
            x.v r14 = x.C2883v.f27978a
            x.w r0 = r13.f27902b
            android.widget.EdgeEffect r0 = r0.f()
            float r1 = c1.y.i(r11)
            int r1 = Af.a.d(r1)
            int r1 = -r1
            r14.c(r0, r1)
        L_0x01a5:
            c1.y$a r14 = c1.y.f19251b
            long r0 = r14.a()
            boolean r11 = c1.y.g(r11, r0)
            if (r11 != 0) goto L_0x01b4
            r13.k()
        L_0x01b4:
            r13.h()
            lf.M r11 = lf.C6514M.f71813a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C2862a.c(long, yf.p, qf.d):java.lang.Object");
    }

    public i d() {
        return this.f27908h;
    }

    public final long i() {
        long j10;
        C2421g gVar = this.f27901a;
        if (gVar != null) {
            j10 = gVar.v();
        } else {
            j10 = C2428n.b(this.f27906f);
        }
        return C2422h.a(C2421g.m(j10) / C2427m.k(this.f27906f), C2421g.n(j10) / C2427m.i(this.f27906f));
    }

    public final C1510r0 j() {
        return this.f27903c;
    }

    public final void k() {
        if (this.f27904d) {
            this.f27903c.setValue(C6514M.f71813a);
        }
    }

    public final void r(long j10) {
        boolean h10 = C2427m.h(this.f27906f, C2427m.f25341b.b());
        boolean h11 = C2427m.h(j10, this.f27906f);
        this.f27906f = j10;
        if (!h11) {
            this.f27902b.B(s.a(a.d(C2427m.k(j10)), a.d(C2427m.i(j10))));
        }
        if (!h10 && !h11) {
            k();
            h();
        }
    }
}
