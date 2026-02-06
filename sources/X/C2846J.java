package x;

import H0.C1197s;
import H0.C1198t;
import J0.C1245k;
import J0.C1246l;
import J0.C1253t;
import J0.h0;
import J0.i0;
import J0.r;
import J0.w0;
import O0.v;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Wg.g;
import Y.A1;
import Y.C1510r0;
import Y.p1;
import android.view.View;
import c1.h;
import c1.k;
import c1.s;
import k0.i;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import q0.C2421g;
import qf.C6658d;
import t0.C2602c;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: x.J  reason: case insensitive filesystem */
public final class C2846J extends i.c implements C1253t, r, w0, h0 {

    /* renamed from: A  reason: collision with root package name */
    private final C1510r0 f27844A;

    /* renamed from: B  reason: collision with root package name */
    private A1 f27845B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public long f27846C;

    /* renamed from: D  reason: collision with root package name */
    private c1.r f27847D;
    /* access modifiers changed from: private */

    /* renamed from: E  reason: collision with root package name */
    public Wg.d f27848E;

    /* renamed from: n  reason: collision with root package name */
    private C6798l f27849n;

    /* renamed from: o  reason: collision with root package name */
    private C6798l f27850o;

    /* renamed from: p  reason: collision with root package name */
    private C6798l f27851p;

    /* renamed from: q  reason: collision with root package name */
    private float f27852q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f27853r;

    /* renamed from: s  reason: collision with root package name */
    private long f27854s;

    /* renamed from: t  reason: collision with root package name */
    private float f27855t;

    /* renamed from: u  reason: collision with root package name */
    private float f27856u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f27857v;

    /* renamed from: w  reason: collision with root package name */
    private C2858W f27858w;

    /* renamed from: x  reason: collision with root package name */
    private View f27859x;

    /* renamed from: y  reason: collision with root package name */
    private c1.d f27860y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public C2857V f27861z;

    /* renamed from: x.J$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2846J f27862a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2846J j10) {
            super(0);
            this.f27862a = j10;
        }

        public final long a() {
            C1197s m22 = this.f27862a.x0();
            if (m22 != null) {
                return C1198t.e(m22);
            }
            return C2421g.f25320b.b();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C2421g.d(a());
        }
    }

    /* renamed from: x.J$b */
    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2846J f27863a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2846J j10) {
            super(0);
            this.f27863a = j10;
        }

        public final long a() {
            return this.f27863a.f27846C;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C2421g.d(a());
        }
    }

    /* renamed from: x.J$d */
    static final class d extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2846J f27867a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C2846J j10) {
            super(0);
            this.f27867a = j10;
        }

        public final void invoke() {
            this.f27867a.u2();
        }
    }

    public /* synthetic */ C2846J(C6798l lVar, C6798l lVar2, C6798l lVar3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, C2858W w10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, lVar2, lVar3, f10, z10, j10, f11, f12, z11, w10);
    }

    private final long q2() {
        if (this.f27845B == null) {
            this.f27845B = p1.e(new a(this));
        }
        A1 a12 = this.f27845B;
        if (a12 != null) {
            return ((C2421g) a12.getValue()).v();
        }
        return C2421g.f25320b.b();
    }

    private final void r2() {
        C2857V v10 = this.f27861z;
        if (v10 != null) {
            v10.dismiss();
        }
        View view = this.f27859x;
        if (view == null) {
            view = C1246l.a(this);
        }
        View view2 = view;
        this.f27859x = view2;
        c1.d dVar = this.f27860y;
        if (dVar == null) {
            dVar = C1245k.i(this);
        }
        c1.d dVar2 = dVar;
        this.f27860y = dVar2;
        this.f27861z = this.f27858w.a(view2, this.f27853r, this.f27854s, this.f27855t, this.f27856u, this.f27857v, dVar2, this.f27852q);
        v2();
    }

    private final void s2(C1197s sVar) {
        this.f27844A.setValue(sVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u2() {
        /*
            r8 = this;
            c1.d r0 = r8.f27860y
            if (r0 != 0) goto L_0x000a
            c1.d r0 = J0.C1245k.i(r8)
            r8.f27860y = r0
        L_0x000a:
            yf.l r1 = r8.f27849n
            java.lang.Object r1 = r1.invoke(r0)
            q0.g r1 = (q0.C2421g) r1
            long r1 = r1.v()
            boolean r3 = q0.C2422h.c(r1)
            if (r3 == 0) goto L_0x007b
            long r3 = r8.q2()
            boolean r3 = q0.C2422h.c(r3)
            if (r3 == 0) goto L_0x007b
            long r3 = r8.q2()
            long r1 = q0.C2421g.r(r3, r1)
            r8.f27846C = r1
            yf.l r1 = r8.f27850o
            if (r1 == 0) goto L_0x005e
            java.lang.Object r0 = r1.invoke(r0)
            q0.g r0 = (q0.C2421g) r0
            long r0 = r0.v()
            q0.g r0 = q0.C2421g.d(r0)
            long r1 = r0.v()
            boolean r1 = q0.C2422h.c(r1)
            if (r1 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            if (r0 == 0) goto L_0x005e
            long r0 = r0.v()
            long r2 = r8.q2()
            long r0 = q0.C2421g.r(r2, r0)
        L_0x005c:
            r5 = r0
            goto L_0x0065
        L_0x005e:
            q0.g$a r0 = q0.C2421g.f25320b
            long r0 = r0.b()
            goto L_0x005c
        L_0x0065:
            x.V r0 = r8.f27861z
            if (r0 != 0) goto L_0x006c
            r8.r2()
        L_0x006c:
            x.V r2 = r8.f27861z
            if (r2 == 0) goto L_0x0077
            long r3 = r8.f27846C
            float r7 = r8.f27852q
            r2.a(r3, r5, r7)
        L_0x0077:
            r8.v2()
            return
        L_0x007b:
            q0.g$a r0 = q0.C2421g.f25320b
            long r0 = r0.b()
            r8.f27846C = r0
            x.V r0 = r8.f27861z
            if (r0 == 0) goto L_0x008a
            r0.dismiss()
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C2846J.u2():void");
    }

    private final void v2() {
        c1.d dVar;
        C2857V v10 = this.f27861z;
        if (v10 != null && (dVar = this.f27860y) != null && !c1.r.d(v10.b(), this.f27847D)) {
            C6798l lVar = this.f27851p;
            if (lVar != null) {
                lVar.invoke(k.c(dVar.Q(s.d(v10.b()))));
            }
            this.f27847D = c1.r.b(v10.b());
        }
    }

    /* access modifiers changed from: private */
    public final C1197s x0() {
        return (C1197s) this.f27844A.getValue();
    }

    public void A0() {
        i0.a(this, new d(this));
    }

    public void V1() {
        A0();
        this.f27848E = g.b(0, (Wg.a) null, (C6798l) null, 7, (Object) null);
        C5600w0 unused = C5576k.d(L1(), (qf.g) null, (M) null, new c(this, (C6658d) null), 3, (Object) null);
    }

    public void W(v vVar) {
        vVar.a(C2847K.b(), new b(this));
    }

    public void W1() {
        C2857V v10 = this.f27861z;
        if (v10 != null) {
            v10.dismiss();
        }
        this.f27861z = null;
    }

    public void p(C1197s sVar) {
        s2(sVar);
    }

    public final void t2(C6798l lVar, C6798l lVar2, float f10, boolean z10, long j10, float f11, float f12, boolean z11, C6798l lVar3, C2858W w10) {
        float f13 = f10;
        boolean z12 = z10;
        long j11 = j10;
        float f14 = f11;
        float f15 = f12;
        boolean z13 = z11;
        C2858W w11 = w10;
        float f16 = this.f27852q;
        long j12 = this.f27854s;
        float f17 = this.f27855t;
        boolean z14 = this.f27853r;
        float f18 = this.f27856u;
        boolean z15 = this.f27857v;
        C2858W w12 = this.f27858w;
        View view = this.f27859x;
        c1.d dVar = this.f27860y;
        this.f27849n = lVar;
        this.f27850o = lVar2;
        this.f27852q = f13;
        this.f27853r = z12;
        this.f27854s = j11;
        this.f27855t = f14;
        this.f27856u = f15;
        this.f27857v = z13;
        this.f27851p = lVar3;
        this.f27858w = w11;
        View a10 = C1246l.a(this);
        c1.d i10 = C1245k.i(this);
        if (this.f27861z != null && ((!C2847K.a(f13, f16) && !w10.b()) || !k.f(j11, j12) || !h.m(f14, f17) || !h.m(f15, f18) || z12 != z14 || z13 != z15 || !C6496s.c(w11, w12) || !C6496s.c(a10, view) || !C6496s.c(i10, dVar))) {
            r2();
        }
        u2();
    }

    public void u(C2602c cVar) {
        cVar.H1();
        Wg.d dVar = this.f27848E;
        if (dVar != null) {
            Wg.h.b(dVar.c(C6514M.f71813a));
        }
    }

    private C2846J(C6798l lVar, C6798l lVar2, C6798l lVar3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, C2858W w10) {
        this.f27849n = lVar;
        this.f27850o = lVar2;
        this.f27851p = lVar3;
        this.f27852q = f10;
        this.f27853r = z10;
        this.f27854s = j10;
        this.f27855t = f11;
        this.f27856u = f12;
        this.f27857v = z11;
        this.f27858w = w10;
        this.f27844A = p1.h((Object) null, p1.j());
        this.f27846C = C2421g.f25320b.b();
    }

    /* renamed from: x.J$c */
    static final class c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f27864a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2846J f27865b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C2846J j10, C6658d dVar) {
            super(2, dVar);
            this.f27865b = j10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new c(this.f27865b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r4.f27864a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x001e
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                lf.w.b(r5)
                goto L_0x0045
            L_0x0012:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x001a:
                lf.w.b(r5)
                goto L_0x0032
            L_0x001e:
                lf.w.b(r5)
            L_0x0021:
                x.J r5 = r4.f27865b
                Wg.d r5 = r5.f27848E
                if (r5 == 0) goto L_0x0032
                r4.f27864a = r3
                java.lang.Object r5 = r5.l(r4)
                if (r5 != r0) goto L_0x0032
                return r0
            L_0x0032:
                x.J r5 = r4.f27865b
                x.V r5 = r5.f27861z
                if (r5 == 0) goto L_0x0021
                x.J$c$a r5 = x.C2846J.c.a.f27866a
                r4.f27864a = r2
                java.lang.Object r5 = Y.C1495j0.b(r5, r4)
                if (r5 != r0) goto L_0x0045
                return r0
            L_0x0045:
                x.J r5 = r4.f27865b
                x.V r5 = r5.f27861z
                if (r5 == 0) goto L_0x0021
                r5.c()
                goto L_0x0021
            */
            throw new UnsupportedOperationException("Method not decompiled: x.C2846J.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* renamed from: x.J$c$a */
        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final a f27866a = new a();

            a() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).longValue());
                return C6514M.f71813a;
            }

            public final void a(long j10) {
            }
        }
    }
}
