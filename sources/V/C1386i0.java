package V;

import C.C1086d;
import C.f0;
import C.j0;
import D0.J;
import D0.T;
import H0.F;
import J0.C1241g;
import O0.t;
import O0.v;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import W.v;
import Y.A1;
import Y.C1494j;
import Y.C1500m;
import Y.C1506p;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import e1.C1943b;
import k0.i;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import lf.C6535s;
import lf.w;
import q0.C2421g;
import q0.C2427m;
import qf.C6658d;
import r0.C2547y0;
import r0.g2;
import r0.n2;
import rf.C6680b;
import t0.C2605f;
import t0.C2606g;
import w.C2760D;
import w.C2782a;
import w.C2786c;
import w.C2797i;
import w.q0;
import x.C2870i;
import yf.C6787a;
import yf.C6798l;
import z.C2938B;

/* renamed from: V.i0  reason: case insensitive filesystem */
public abstract class C1386i0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f7542a = c1.h.j((float) 48);

    /* renamed from: b  reason: collision with root package name */
    private static final float f7543b = c1.h.j((float) 24);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f7544c = n2.a(0.5f, 0.0f);

    /* renamed from: V.i0$a */
    static final class a extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f7545a = new a();

        a() {
            super(2);
        }

        public final f0 a(C1500m mVar, int i10) {
            mVar.T(58488196);
            if (C1506p.H()) {
                C1506p.Q(58488196, i10, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:129)");
            }
            f0 g10 = C1385i.f7527a.g(mVar, 6);
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.M();
            return g10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((C1500m) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: V.i0$b */
    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E0 f7546a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ K f7547b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2782a f7548c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6787a f7549d;

        /* renamed from: V.i0$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements yf.p {

            /* renamed from: a  reason: collision with root package name */
            int f7550a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C2782a f7551b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C2782a aVar, C6658d dVar) {
                super(2, dVar);
                this.f7551b = aVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new a(this.f7551b, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f7550a;
                if (i10 == 0) {
                    w.b(obj);
                    C2782a aVar = this.f7551b;
                    Float b10 = kotlin.coroutines.jvm.internal.b.b(0.0f);
                    this.f7550a = 1;
                    if (C2782a.f(aVar, b10, (C2797i) null, (Object) null, (C6798l) null, this, 14, (Object) null) == f10) {
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

        /* renamed from: V.i0$b$b  reason: collision with other inner class name */
        static final class C0168b extends kotlin.coroutines.jvm.internal.l implements yf.p {

            /* renamed from: a  reason: collision with root package name */
            int f7552a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ E0 f7553b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0168b(E0 e02, C6658d dVar) {
                super(2, dVar);
                this.f7553b = e02;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new C0168b(this.f7553b, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((C0168b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f7552a;
                if (i10 == 0) {
                    w.b(obj);
                    E0 e02 = this.f7553b;
                    this.f7552a = 1;
                    if (e02.l(this) == f10) {
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

        /* renamed from: V.i0$b$c */
        static final class c extends kotlin.coroutines.jvm.internal.l implements yf.p {

            /* renamed from: a  reason: collision with root package name */
            int f7554a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ E0 f7555b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(E0 e02, C6658d dVar) {
                super(2, dVar);
                this.f7555b = e02;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new c(this.f7555b, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f7554a;
                if (i10 == 0) {
                    w.b(obj);
                    E0 e02 = this.f7555b;
                    this.f7554a = 1;
                    if (e02.j(this) == f10) {
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

        /* renamed from: V.i0$b$d */
        static final class d extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C6787a f7556a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(C6787a aVar) {
                super(1);
                this.f7556a = aVar;
            }

            public final void a(Throwable th2) {
                this.f7556a.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(E0 e02, K k10, C2782a aVar, C6787a aVar2) {
            super(0);
            this.f7546a = e02;
            this.f7547b = k10;
            this.f7548c = aVar;
            this.f7549d = aVar2;
        }

        public final void invoke() {
            if (this.f7546a.e() != F0.Expanded || !this.f7546a.g()) {
                C5576k.d(this.f7547b, (qf.g) null, (M) null, new c(this.f7546a, (C6658d) null), 3, (Object) null).P0(new d(this.f7549d));
                return;
            }
            C5600w0 unused = C5576k.d(this.f7547b, (qf.g) null, (M) null, new a(this.f7548c, (C6658d) null), 3, (Object) null);
            C5600w0 unused2 = C5576k.d(this.f7547b, (qf.g) null, (M) null, new C0168b(this.f7546a, (C6658d) null), 3, (Object) null);
        }
    }

    /* renamed from: V.i0$c */
    static final class c extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f7557a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f7558b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ E0 f7559c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2782a f7560d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ K f7561e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6798l f7562f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ k0.i f7563g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f7564h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g2 f7565i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f7566j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ long f7567k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ float f7568l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ yf.p f7569m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ yf.p f7570n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ yf.q f7571o;

        /* renamed from: V.i0$c$a */
        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final a f7572a = new a();

            a() {
                super(1);
            }

            public final void a(v vVar) {
                t.t0(vVar, true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((v) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(long j10, C6787a aVar, E0 e02, C2782a aVar2, K k10, C6798l lVar, k0.i iVar, float f10, g2 g2Var, long j11, long j12, float f11, yf.p pVar, yf.p pVar2, yf.q qVar) {
            super(2);
            this.f7557a = j10;
            this.f7558b = aVar;
            this.f7559c = e02;
            this.f7560d = aVar2;
            this.f7561e = k10;
            this.f7562f = lVar;
            this.f7563g = iVar;
            this.f7564h = f10;
            this.f7565i = g2Var;
            this.f7566j = j11;
            this.f7567k = j12;
            this.f7568l = f11;
            this.f7569m = pVar;
            this.f7570n = pVar2;
            this.f7571o = qVar;
        }

        public final void a(C1500m mVar, int i10) {
            boolean z10;
            C1500m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-314673510, i11, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:168)");
                }
                k0.i d10 = O0.m.d(j0.b(androidx.compose.foundation.layout.q.f(k0.i.f23074a, 0.0f, 1, (Object) null)), false, a.f7572a, 1, (Object) null);
                long j10 = this.f7557a;
                C6787a aVar = this.f7558b;
                E0 e02 = this.f7559c;
                C2782a aVar2 = this.f7560d;
                K k10 = this.f7561e;
                C6798l lVar = this.f7562f;
                k0.i iVar = this.f7563g;
                float f10 = this.f7564h;
                g2 g2Var = this.f7565i;
                long j11 = j10;
                long j12 = this.f7566j;
                long j13 = this.f7567k;
                float f11 = this.f7568l;
                yf.p pVar = this.f7569m;
                long j14 = j13;
                yf.p pVar2 = this.f7570n;
                yf.q qVar = this.f7571o;
                F h10 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.o(), false);
                int a10 = C1494j.a(mVar2, 0);
                C1523y p10 = mVar.p();
                k0.i e10 = k0.h.e(mVar2, d10);
                C1241g.a aVar3 = C1241g.f3853J;
                yf.p pVar3 = pVar;
                C6787a a11 = aVar3.a();
                if (mVar.j() == null) {
                    C1494j.c();
                }
                mVar.F();
                if (mVar.f()) {
                    mVar2.U(a11);
                } else {
                    mVar.q();
                }
                C1500m a12 = F1.a(mVar);
                g2 g2Var2 = g2Var;
                F1.b(a12, h10, aVar3.c());
                F1.b(a12, p10, aVar3.e());
                yf.p b10 = aVar3.b();
                if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                    a12.r(Integer.valueOf(a10));
                    a12.V(Integer.valueOf(a10), b10);
                }
                F1.b(a12, e10, aVar3.d());
                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f12848a;
                if (e02.i() != F0.Hidden) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float f12 = f11;
                C1386i0.c(j11, aVar, z10, mVar, 0);
                yf.q qVar2 = qVar;
                C1386i0.b(fVar, aVar2, k10, aVar, lVar, iVar, e02, f10, g2Var2, j12, j14, f12, pVar3, pVar2, qVar2, mVar, 6 | (C2782a.f27266m << 3), 0, 0);
                mVar.u();
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.i0$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        int f7573a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ E0 f7574b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(E0 e02, C6658d dVar) {
            super(2, dVar);
            this.f7574b = e02;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new d(this.f7574b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((d) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f7573a;
            if (i10 == 0) {
                w.b(obj);
                E0 e02 = this.f7574b;
                this.f7573a = 1;
                if (e02.o(this) == f10) {
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

    /* renamed from: V.i0$e */
    static final class e extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6787a f7575a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0.i f7576b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ E0 f7577c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f7578d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g2 f7579e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f7580f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f7581g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f7582h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f7583i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ yf.p f7584j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ yf.p f7585k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C1388j0 f7586l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ yf.q f7587m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f7588n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f7589o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f7590p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C6787a aVar, k0.i iVar, E0 e02, float f10, g2 g2Var, long j10, long j11, float f11, long j12, yf.p pVar, yf.p pVar2, C1388j0 j0Var, yf.q qVar, int i10, int i11, int i12) {
            super(2);
            this.f7575a = aVar;
            this.f7576b = iVar;
            this.f7577c = e02;
            this.f7578d = f10;
            this.f7579e = g2Var;
            this.f7580f = j10;
            this.f7581g = j11;
            this.f7582h = f11;
            this.f7583i = j12;
            this.f7584j = pVar;
            this.f7585k = pVar2;
            this.f7586l = j0Var;
            this.f7587m = qVar;
            this.f7588n = i10;
            this.f7589o = i11;
            this.f7590p = i12;
        }

        public final void a(C1500m mVar, int i10) {
            C1500m mVar2 = mVar;
            C6787a aVar = this.f7575a;
            C6787a aVar2 = aVar;
            C1386i0.a(aVar2, this.f7576b, this.f7577c, this.f7578d, this.f7579e, this.f7580f, this.f7581g, this.f7582h, this.f7583i, this.f7584j, this.f7585k, this.f7586l, this.f7587m, mVar2, M0.a(this.f7588n | 1), M0.a(this.f7589o), this.f7590p);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.i0$f */
    static final class f extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E0 f7591a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ K f7592b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6787a f7593c;

        /* renamed from: V.i0$f$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements yf.p {

            /* renamed from: a  reason: collision with root package name */
            int f7594a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ E0 f7595b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(E0 e02, C6658d dVar) {
                super(2, dVar);
                this.f7595b = e02;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new a(this.f7595b, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f7594a;
                if (i10 == 0) {
                    w.b(obj);
                    E0 e02 = this.f7595b;
                    this.f7594a = 1;
                    if (e02.j(this) == f10) {
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

        /* renamed from: V.i0$f$b */
        static final class b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ E0 f7596a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C6787a f7597b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(E0 e02, C6787a aVar) {
                super(1);
                this.f7596a = e02;
                this.f7597b = aVar;
            }

            public final void a(Throwable th2) {
                if (!this.f7596a.k()) {
                    this.f7597b.invoke();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(E0 e02, K k10, C6787a aVar) {
            super(0);
            this.f7591a = e02;
            this.f7592b = k10;
            this.f7593c = aVar;
        }

        public final void invoke() {
            if (((Boolean) this.f7591a.d().r().invoke(F0.Hidden)).booleanValue()) {
                C5576k.d(this.f7592b, (qf.g) null, (M) null, new a(this.f7591a, (C6658d) null), 3, (Object) null).P0(new b(this.f7591a, this.f7593c));
            }
        }
    }

    /* renamed from: V.i0$g */
    static final class g extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ K f7598a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ E0 f7599b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6787a f7600c;

        /* renamed from: V.i0$g$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements yf.p {

            /* renamed from: a  reason: collision with root package name */
            int f7601a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ E0 f7602b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ float f7603c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(E0 e02, float f10, C6658d dVar) {
                super(2, dVar);
                this.f7602b = e02;
                this.f7603c = f10;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new a(this.f7602b, this.f7603c, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f7601a;
                if (i10 == 0) {
                    w.b(obj);
                    E0 e02 = this.f7602b;
                    float f11 = this.f7603c;
                    this.f7601a = 1;
                    if (e02.n(f11, this) == f10) {
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

        /* renamed from: V.i0$g$b */
        static final class b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ E0 f7604a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C6787a f7605b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(E0 e02, C6787a aVar) {
                super(1);
                this.f7604a = e02;
                this.f7605b = aVar;
            }

            public final void a(Throwable th2) {
                if (!this.f7604a.k()) {
                    this.f7605b.invoke();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(K k10, E0 e02, C6787a aVar) {
            super(1);
            this.f7598a = k10;
            this.f7599b = e02;
            this.f7600c = aVar;
        }

        public final void a(float f10) {
            C5576k.d(this.f7598a, (qf.g) null, (M) null, new a(this.f7599b, f10, (C6658d) null), 3, (Object) null).P0(new b(this.f7599b, this.f7600c));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.i0$h */
    static final class h extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        public static final h f7606a = new h();

        h() {
            super(2);
        }

        public final f0 a(C1500m mVar, int i10) {
            mVar.T(-11444670);
            if (C1506p.H()) {
                C1506p.Q(-11444670, i10, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:212)");
            }
            f0 g10 = C1385i.f7527a.g(mVar, 6);
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.M();
            return g10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((C1500m) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: V.i0$i */
    static final class i extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E0 f7607a;

        /* renamed from: V.i0$i$a */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f7608a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    V.F0[] r0 = V.F0.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    V.F0 r1 = V.F0.Hidden     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    V.F0 r1 = V.F0.PartiallyExpanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    V.F0 r1 = V.F0.Expanded     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f7608a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: V.C1386i0.i.a.<clinit>():void");
            }
        }

        /* renamed from: V.i0$i$b */
        static final class b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ float f7609a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f7610b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ E0 f7611c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(float f10, long j10, E0 e02) {
                super(1);
                this.f7609a = f10;
                this.f7610b = j10;
                this.f7611c = e02;
            }

            public final void a(W.i iVar) {
                iVar.a(F0.Hidden, this.f7609a);
                if (((float) c1.r.f(this.f7610b)) > this.f7609a / ((float) 2) && !this.f7611c.h()) {
                    iVar.a(F0.PartiallyExpanded, this.f7609a / 2.0f);
                }
                if (c1.r.f(this.f7610b) != 0) {
                    iVar.a(F0.Expanded, Math.max(0.0f, this.f7609a - ((float) c1.r.f(this.f7610b))));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((W.i) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(E0 e02) {
            super(2);
            this.f7607a = e02;
        }

        public final Pair a(long j10, long j11) {
            F0 f02;
            W.h a10 = androidx.compose.material3.internal.b.a(new b((float) c1.b.k(j11), j10, this.f7607a));
            int i10 = a.f7608a[((F0) this.f7607a.d().x()).ordinal()];
            if (i10 == 1) {
                f02 = F0.Hidden;
            } else if (i10 == 2 || i10 == 3) {
                f02 = F0.PartiallyExpanded;
                if (!a10.c(f02)) {
                    f02 = F0.Expanded;
                    if (!a10.c(f02)) {
                        f02 = F0.Hidden;
                    }
                }
            } else {
                throw new C6535s();
            }
            return C6502A.a(a10, f02);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((c1.r) obj).j(), ((c1.b) obj2).r());
        }
    }

    /* renamed from: V.i0$j */
    static final class j extends kotlin.coroutines.jvm.internal.l implements yf.q {

        /* renamed from: a  reason: collision with root package name */
        int f7612a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ float f7613b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6798l f7614c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C6798l lVar, C6658d dVar) {
            super(3, dVar);
            this.f7614c = lVar;
        }

        public final Object i(K k10, float f10, C6658d dVar) {
            j jVar = new j(this.f7614c, dVar);
            jVar.f7613b = f10;
            return jVar.invokeSuspend(C6514M.f71813a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((K) obj, ((Number) obj2).floatValue(), (C6658d) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f7612a == 0) {
                w.b(obj);
                this.f7614c.invoke(kotlin.coroutines.jvm.internal.b.b(this.f7613b));
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: V.i0$k */
    static final class k extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f7615a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(String str) {
            super(1);
            this.f7615a = str;
        }

        public final void a(v vVar) {
            t.e0(vVar, this.f7615a);
            t.u0(vVar, 0.0f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.i0$l */
    static final class l extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E0 f7616a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2782a f7617b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(E0 e02, C2782a aVar) {
            super(1);
            this.f7616a = e02;
            this.f7617b = aVar;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            float w10 = this.f7616a.d().w();
            float i10 = C2427m.i(cVar.d());
            if (!Float.isNaN(w10) && !Float.isNaN(i10) && i10 != 0.0f) {
                float floatValue = ((Number) this.f7617b.m()).floatValue();
                cVar.h(C1386i0.j(cVar, floatValue));
                cVar.m(C1386i0.k(cVar, floatValue));
                cVar.F0(n2.a(0.5f, (w10 + i10) / i10));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.i0$m */
    static final class m extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ yf.p f7618a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2782a f7619b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ yf.p f7620c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ E0 f7621d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6787a f7622e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ K f7623f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ yf.q f7624g;

        /* renamed from: V.i0$m$a */
        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2782a f7625a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C2782a aVar) {
                super(1);
                this.f7625a = aVar;
            }

            public final void a(androidx.compose.ui.graphics.c cVar) {
                float f10;
                float floatValue = ((Number) this.f7625a.m()).floatValue();
                float g10 = C1386i0.j(cVar, floatValue);
                float h10 = C1386i0.k(cVar, floatValue);
                if (h10 == 0.0f) {
                    f10 = 1.0f;
                } else {
                    f10 = g10 / h10;
                }
                cVar.m(f10);
                cVar.F0(C1386i0.f7544c);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((androidx.compose.ui.graphics.c) obj);
                return C6514M.f71813a;
            }
        }

        /* renamed from: V.i0$m$b */
        static final class b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ E0 f7626a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f7627b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f7628c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f7629d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C6787a f7630e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ K f7631f;

            /* renamed from: V.i0$m$b$a */
            static final class a extends C6498u implements C6787a {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C6787a f7632a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(C6787a aVar) {
                    super(0);
                    this.f7632a = aVar;
                }

                /* renamed from: a */
                public final Boolean invoke() {
                    this.f7632a.invoke();
                    return Boolean.TRUE;
                }
            }

            /* renamed from: V.i0$m$b$b  reason: collision with other inner class name */
            static final class C0169b extends C6498u implements C6787a {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ E0 f7633a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ K f7634b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ E0 f7635c;

                /* renamed from: V.i0$m$b$b$a */
                static final class a extends kotlin.coroutines.jvm.internal.l implements yf.p {

                    /* renamed from: a  reason: collision with root package name */
                    int f7636a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ E0 f7637b;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    a(E0 e02, C6658d dVar) {
                        super(2, dVar);
                        this.f7637b = e02;
                    }

                    public final C6658d create(Object obj, C6658d dVar) {
                        return new a(this.f7637b, dVar);
                    }

                    public final Object invoke(K k10, C6658d dVar) {
                        return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object f10 = C6680b.f();
                        int i10 = this.f7636a;
                        if (i10 == 0) {
                            w.b(obj);
                            E0 e02 = this.f7637b;
                            this.f7636a = 1;
                            if (e02.c(this) == f10) {
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

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0169b(E0 e02, K k10, E0 e03) {
                    super(0);
                    this.f7633a = e02;
                    this.f7634b = k10;
                    this.f7635c = e03;
                }

                /* renamed from: a */
                public final Boolean invoke() {
                    if (((Boolean) this.f7633a.d().r().invoke(F0.Expanded)).booleanValue()) {
                        C5600w0 unused = C5576k.d(this.f7634b, (qf.g) null, (M) null, new a(this.f7635c, (C6658d) null), 3, (Object) null);
                    }
                    return Boolean.TRUE;
                }
            }

            /* renamed from: V.i0$m$b$c */
            static final class c extends C6498u implements C6787a {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ E0 f7638a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ K f7639b;

                /* renamed from: V.i0$m$b$c$a */
                static final class a extends kotlin.coroutines.jvm.internal.l implements yf.p {

                    /* renamed from: a  reason: collision with root package name */
                    int f7640a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ E0 f7641b;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    a(E0 e02, C6658d dVar) {
                        super(2, dVar);
                        this.f7641b = e02;
                    }

                    public final C6658d create(Object obj, C6658d dVar) {
                        return new a(this.f7641b, dVar);
                    }

                    public final Object invoke(K k10, C6658d dVar) {
                        return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object f10 = C6680b.f();
                        int i10 = this.f7640a;
                        if (i10 == 0) {
                            w.b(obj);
                            E0 e02 = this.f7641b;
                            this.f7640a = 1;
                            if (e02.l(this) == f10) {
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

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(E0 e02, K k10) {
                    super(0);
                    this.f7638a = e02;
                    this.f7639b = k10;
                }

                /* renamed from: a */
                public final Boolean invoke() {
                    if (((Boolean) this.f7638a.d().r().invoke(F0.PartiallyExpanded)).booleanValue()) {
                        C5600w0 unused = C5576k.d(this.f7639b, (qf.g) null, (M) null, new a(this.f7638a, (C6658d) null), 3, (Object) null);
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(E0 e02, String str, String str2, String str3, C6787a aVar, K k10) {
                super(1);
                this.f7626a = e02;
                this.f7627b = str;
                this.f7628c = str2;
                this.f7629d = str3;
                this.f7630e = aVar;
                this.f7631f = k10;
            }

            public final void a(v vVar) {
                E0 e02 = this.f7626a;
                String str = this.f7627b;
                String str2 = this.f7628c;
                String str3 = this.f7629d;
                C6787a aVar = this.f7630e;
                K k10 = this.f7631f;
                t.l(vVar, str, new a(aVar));
                if (e02.e() == F0.PartiallyExpanded) {
                    t.o(vVar, str2, new C0169b(e02, k10, e02));
                } else if (e02.g()) {
                    t.e(vVar, str3, new c(e02, k10));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((v) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(yf.p pVar, C2782a aVar, yf.p pVar2, E0 e02, C6787a aVar2, K k10, yf.q qVar) {
            super(2);
            this.f7618a = pVar;
            this.f7619b = aVar;
            this.f7620c = pVar2;
            this.f7621d = e02;
            this.f7622e = aVar2;
            this.f7623f = k10;
            this.f7624g = qVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0143, code lost:
            if (r7 == Y.C1500m.f10026a.a()) goto L_0x0145;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(Y.C1500m r19, int r20) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                r2 = r20
                r3 = r2 & 3
                r4 = 2
                if (r3 != r4) goto L_0x0017
                boolean r3 = r19.i()
                if (r3 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r19.I()
                goto L_0x01e8
            L_0x0017:
                boolean r3 = Y.C1506p.H()
                if (r3 == 0) goto L_0x0026
                r3 = -1
                java.lang.String r4 = "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:289)"
                r5 = -692668920(0xffffffffd6b6b608, float:-1.00446467E14)
                Y.C1506p.Q(r5, r2, r3, r4)
            L_0x0026:
                k0.i$a r2 = k0.i.f23074a
                r3 = 0
                r4 = 0
                r5 = 1
                k0.i r3 = androidx.compose.foundation.layout.q.h(r2, r3, r5, r4)
                yf.p r4 = r0.f7618a
                r6 = 0
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                java.lang.Object r4 = r4.invoke(r1, r7)
                C.f0 r4 = (C.f0) r4
                k0.i r3 = C.i0.d(r3, r4)
                w.a r4 = r0.f7619b
                boolean r4 = r1.C(r4)
                w.a r7 = r0.f7619b
                java.lang.Object r8 = r19.A()
                if (r4 != 0) goto L_0x0056
                Y.m$a r4 = Y.C1500m.f10026a
                java.lang.Object r4 = r4.a()
                if (r8 != r4) goto L_0x005e
            L_0x0056:
                V.i0$m$a r8 = new V.i0$m$a
                r8.<init>(r7)
                r1.r(r8)
            L_0x005e:
                yf.l r8 = (yf.C6798l) r8
                k0.i r3 = androidx.compose.ui.graphics.b.a(r3, r8)
                yf.p r4 = r0.f7620c
                V.E0 r8 = r0.f7621d
                yf.a r12 = r0.f7622e
                Ug.K r13 = r0.f7623f
                yf.q r14 = r0.f7624g
                C.c r7 = C.C1085c.f882a
                C.c$m r7 = r7.g()
                k0.c$a r15 = k0.c.f23044a
                k0.c$b r9 = r15.k()
                H0.F r7 = C.C1090h.a(r7, r9, r1, r6)
                int r9 = Y.C1494j.a(r1, r6)
                Y.y r10 = r19.p()
                k0.i r3 = k0.h.e(r1, r3)
                J0.g$a r16 = J0.C1241g.f3853J
                yf.a r11 = r16.a()
                Y.f r17 = r19.j()
                if (r17 != 0) goto L_0x0099
                Y.C1494j.c()
            L_0x0099:
                r19.F()
                boolean r17 = r19.f()
                if (r17 == 0) goto L_0x00a6
                r1.U(r11)
                goto L_0x00a9
            L_0x00a6:
                r19.q()
            L_0x00a9:
                Y.m r11 = Y.F1.a(r19)
                yf.p r5 = r16.c()
                Y.F1.b(r11, r7, r5)
                yf.p r5 = r16.e()
                Y.F1.b(r11, r10, r5)
                yf.p r5 = r16.b()
                boolean r7 = r11.f()
                if (r7 != 0) goto L_0x00d3
                java.lang.Object r7 = r11.A()
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                boolean r7 = kotlin.jvm.internal.C6496s.c(r7, r10)
                if (r7 != 0) goto L_0x00e1
            L_0x00d3:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
                r11.r(r7)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
                r11.V(r7, r5)
            L_0x00e1:
                yf.p r5 = r16.d()
                Y.F1.b(r11, r3, r5)
                C.k r3 = C.C1093k.f978a
                r5 = -1636564008(0xffffffff9e7403d8, float:-1.2918047E-20)
                r1.T(r5)
                if (r4 == 0) goto L_0x01d1
                W.v$a r5 = W.v.f8397a
                int r5 = V.C1402q0.f7952a
                int r5 = W.v.a(r5)
                java.lang.String r11 = W.w.a(r5, r1, r6)
                int r5 = V.C1402q0.f7953b
                int r5 = W.v.a(r5)
                java.lang.String r9 = W.w.a(r5, r1, r6)
                int r5 = V.C1402q0.f7955d
                int r5 = W.v.a(r5)
                java.lang.String r10 = W.w.a(r5, r1, r6)
                k0.c$b r5 = r15.g()
                k0.i r2 = r3.b(r2, r5)
                boolean r5 = r1.S(r8)
                boolean r7 = r1.S(r9)
                r5 = r5 | r7
                boolean r7 = r1.S(r12)
                r5 = r5 | r7
                boolean r7 = r1.S(r10)
                r5 = r5 | r7
                boolean r7 = r1.C(r13)
                r5 = r5 | r7
                boolean r7 = r1.S(r11)
                r5 = r5 | r7
                java.lang.Object r7 = r19.A()
                if (r5 != 0) goto L_0x0145
                Y.m$a r5 = Y.C1500m.f10026a
                java.lang.Object r5 = r5.a()
                if (r7 != r5) goto L_0x014e
            L_0x0145:
                V.i0$m$b r5 = new V.i0$m$b
                r7 = r5
                r7.<init>(r8, r9, r10, r11, r12, r13)
                r1.r(r5)
            L_0x014e:
                yf.l r7 = (yf.C6798l) r7
                r5 = 1
                k0.i r2 = O0.m.c(r2, r5, r7)
                k0.c r5 = r15.o()
                H0.F r5 = androidx.compose.foundation.layout.d.h(r5, r6)
                int r7 = Y.C1494j.a(r1, r6)
                Y.y r8 = r19.p()
                k0.i r2 = k0.h.e(r1, r2)
                yf.a r9 = r16.a()
                Y.f r10 = r19.j()
                if (r10 != 0) goto L_0x0176
                Y.C1494j.c()
            L_0x0176:
                r19.F()
                boolean r10 = r19.f()
                if (r10 == 0) goto L_0x0183
                r1.U(r9)
                goto L_0x0186
            L_0x0183:
                r19.q()
            L_0x0186:
                Y.m r9 = Y.F1.a(r19)
                yf.p r10 = r16.c()
                Y.F1.b(r9, r5, r10)
                yf.p r5 = r16.e()
                Y.F1.b(r9, r8, r5)
                yf.p r5 = r16.b()
                boolean r8 = r9.f()
                if (r8 != 0) goto L_0x01b0
                java.lang.Object r8 = r9.A()
                java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
                boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r10)
                if (r8 != 0) goto L_0x01be
            L_0x01b0:
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r9.r(r8)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r9.V(r7, r5)
            L_0x01be:
                yf.p r5 = r16.d()
                Y.F1.b(r9, r2, r5)
                androidx.compose.foundation.layout.f r2 = androidx.compose.foundation.layout.f.f12848a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
                r4.invoke(r1, r2)
                r19.u()
            L_0x01d1:
                r19.M()
                r2 = 6
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r14.invoke(r3, r1, r2)
                r19.u()
                boolean r1 = Y.C1506p.H()
                if (r1 == 0) goto L_0x01e8
                Y.C1506p.P()
            L_0x01e8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: V.C1386i0.m.a(Y.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.i0$n */
    static final class n extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1086d f7642a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2782a f7643b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ K f7644c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6787a f7645d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6798l f7646e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k0.i f7647f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ E0 f7648g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f7649h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g2 f7650i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f7651j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ long f7652k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ float f7653l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ yf.p f7654m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ yf.p f7655n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ yf.q f7656o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f7657p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f7658q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f7659r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(C1086d dVar, C2782a aVar, K k10, C6787a aVar2, C6798l lVar, k0.i iVar, E0 e02, float f10, g2 g2Var, long j10, long j11, float f11, yf.p pVar, yf.p pVar2, yf.q qVar, int i10, int i11, int i12) {
            super(2);
            this.f7642a = dVar;
            this.f7643b = aVar;
            this.f7644c = k10;
            this.f7645d = aVar2;
            this.f7646e = lVar;
            this.f7647f = iVar;
            this.f7648g = e02;
            this.f7649h = f10;
            this.f7650i = g2Var;
            this.f7651j = j10;
            this.f7652k = j11;
            this.f7653l = f11;
            this.f7654m = pVar;
            this.f7655n = pVar2;
            this.f7656o = qVar;
            this.f7657p = i10;
            this.f7658q = i11;
            this.f7659r = i12;
        }

        public final void a(C1500m mVar, int i10) {
            C1500m mVar2 = mVar;
            C1086d dVar = this.f7642a;
            C1086d dVar2 = dVar;
            C1386i0.b(dVar2, this.f7643b, this.f7644c, this.f7645d, this.f7646e, this.f7647f, this.f7648g, this.f7649h, this.f7650i, this.f7651j, this.f7652k, this.f7653l, this.f7654m, this.f7655n, this.f7656o, mVar2, M0.a(this.f7657p | 1), M0.a(this.f7658q), this.f7659r);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.i0$o */
    static final class o extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f7660a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A1 f7661b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(long j10, A1 a12) {
            super(1);
            this.f7660a = j10;
            this.f7661b = a12;
        }

        public final void a(C2605f fVar) {
            C2605f.c0(fVar, this.f7660a, 0, 0, Ef.m.k(C1386i0.d(this.f7661b), 0.0f, 1.0f), (C2606g) null, (C2547y0) null, 0, 118, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2605f) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.i0$p */
    static final class p extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f7662a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f7663b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f7664c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f7665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(long j10, C6787a aVar, boolean z10, int i10) {
            super(2);
            this.f7662a = j10;
            this.f7663b = aVar;
            this.f7664c = z10;
            this.f7665d = i10;
        }

        public final void a(C1500m mVar, int i10) {
            C1386i0.c(this.f7662a, this.f7663b, this.f7664c, mVar, M0.a(this.f7665d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.i0$q */
    static final class q extends kotlin.coroutines.jvm.internal.l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        int f7666a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f7667b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6787a f7668c;

        /* renamed from: V.i0$q$a */
        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C6787a f7669a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C6787a aVar) {
                super(1);
                this.f7669a = aVar;
            }

            public final void a(long j10) {
                this.f7669a.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((C2421g) obj).v());
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(C6787a aVar, C6658d dVar) {
            super(2, dVar);
            this.f7668c = aVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            q qVar = new q(this.f7668c, dVar);
            qVar.f7667b = obj;
            return qVar;
        }

        public final Object invoke(J j10, C6658d dVar) {
            return ((q) create(j10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f7666a;
            if (i10 == 0) {
                w.b(obj);
                a aVar = new a(this.f7668c);
                this.f7666a = 1;
                if (C2938B.j((J) this.f7667b, (C6798l) null, (C6798l) null, (yf.q) null, aVar, this, 7, (Object) null) == f10) {
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

    /* renamed from: V.i0$r */
    static final class r extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f7670a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f7671b;

        /* renamed from: V.i0$r$a */
        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C6787a f7672a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C6787a aVar) {
                super(0);
                this.f7672a = aVar;
            }

            /* renamed from: a */
            public final Boolean invoke() {
                this.f7672a.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(String str, C6787a aVar) {
            super(1);
            this.f7670a = str;
            this.f7671b = aVar;
        }

        public final void a(v vVar) {
            t.u0(vVar, 1.0f);
            t.Y(vVar, this.f7670a);
            t.y(vVar, (String) null, new a(this.f7671b), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.i0$s */
    static final class s extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final s f7673a = new s();

        s() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(F0 f02) {
            return Boolean.TRUE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: yf.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(yf.C6787a r46, k0.i r47, V.E0 r48, float r49, r0.g2 r50, long r51, long r53, float r55, long r56, yf.p r58, yf.p r59, V.C1388j0 r60, yf.q r61, Y.C1500m r62, int r63, int r64, int r65) {
        /*
            r1 = r46
            r15 = r63
            r14 = r64
            r13 = r65
            r0 = 2132719801(0x7f1eb8b9, float:2.1097716E38)
            r2 = r62
            Y.m r2 = r2.h(r0)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x0018
            r3 = r15 | 6
            goto L_0x0028
        L_0x0018:
            r3 = r15 & 6
            if (r3 != 0) goto L_0x0027
            boolean r3 = r2.C(r1)
            if (r3 == 0) goto L_0x0024
            r3 = 4
            goto L_0x0025
        L_0x0024:
            r3 = 2
        L_0x0025:
            r3 = r3 | r15
            goto L_0x0028
        L_0x0027:
            r3 = r15
        L_0x0028:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x0031
            r3 = r3 | 48
        L_0x002e:
            r9 = r47
            goto L_0x0043
        L_0x0031:
            r9 = r15 & 48
            if (r9 != 0) goto L_0x002e
            r9 = r47
            boolean r10 = r2.S(r9)
            if (r10 == 0) goto L_0x0040
            r10 = 32
            goto L_0x0042
        L_0x0040:
            r10 = 16
        L_0x0042:
            r3 = r3 | r10
        L_0x0043:
            r10 = r15 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x005d
            r10 = r13 & 4
            if (r10 != 0) goto L_0x0056
            r10 = r48
            boolean r16 = r2.S(r10)
            if (r16 == 0) goto L_0x0058
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0056:
            r10 = r48
        L_0x0058:
            r16 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r3 = r3 | r16
            goto L_0x005f
        L_0x005d:
            r10 = r48
        L_0x005f:
            r16 = r13 & 8
            if (r16 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r7 = r49
            goto L_0x007b
        L_0x0068:
            r7 = r15 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0065
            r7 = r49
            boolean r17 = r2.c(r7)
            if (r17 == 0) goto L_0x0077
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r17
        L_0x007b:
            r8 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0095
            r8 = r13 & 16
            if (r8 != 0) goto L_0x008e
            r8 = r50
            boolean r18 = r2.S(r8)
            if (r18 == 0) goto L_0x0090
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x008e:
            r8 = r50
        L_0x0090:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r3 = r3 | r18
            goto L_0x0097
        L_0x0095:
            r8 = r50
        L_0x0097:
            r18 = 196608(0x30000, float:2.75506E-40)
            r18 = r15 & r18
            if (r18 != 0) goto L_0x00b1
            r18 = r13 & 32
            r4 = r51
            if (r18 != 0) goto L_0x00ac
            boolean r20 = r2.e(r4)
            if (r20 == 0) goto L_0x00ac
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r3 = r3 | r20
            goto L_0x00b3
        L_0x00b1:
            r4 = r51
        L_0x00b3:
            r20 = 1572864(0x180000, float:2.204052E-39)
            r20 = r15 & r20
            if (r20 != 0) goto L_0x00cd
            r20 = r13 & 64
            r11 = r53
            if (r20 != 0) goto L_0x00c8
            boolean r22 = r2.e(r11)
            if (r22 == 0) goto L_0x00c8
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c8:
            r22 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r3 = r3 | r22
            goto L_0x00cf
        L_0x00cd:
            r11 = r53
        L_0x00cf:
            r0 = r13 & 128(0x80, float:1.794E-43)
            r23 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00da
            r3 = r3 | r23
            r4 = r55
            goto L_0x00ec
        L_0x00da:
            r23 = r15 & r23
            r4 = r55
            if (r23 != 0) goto L_0x00ec
            boolean r5 = r2.c(r4)
            if (r5 == 0) goto L_0x00e9
            r5 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00eb
        L_0x00e9:
            r5 = 4194304(0x400000, float:5.877472E-39)
        L_0x00eb:
            r3 = r3 | r5
        L_0x00ec:
            r5 = 100663296(0x6000000, float:2.4074124E-35)
            r5 = r5 & r15
            if (r5 != 0) goto L_0x0107
            r5 = r13 & 256(0x100, float:3.59E-43)
            if (r5 != 0) goto L_0x0100
            r4 = r56
            boolean r23 = r2.e(r4)
            if (r23 == 0) goto L_0x0102
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0104
        L_0x0100:
            r4 = r56
        L_0x0102:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0104:
            r3 = r3 | r23
            goto L_0x0109
        L_0x0107:
            r4 = r56
        L_0x0109:
            r4 = r13 & 512(0x200, float:7.175E-43)
            r5 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 == 0) goto L_0x0113
            r3 = r3 | r5
        L_0x0110:
            r5 = r58
            goto L_0x0125
        L_0x0113:
            r5 = r5 & r15
            if (r5 != 0) goto L_0x0110
            r5 = r58
            boolean r23 = r2.C(r5)
            if (r23 == 0) goto L_0x0121
            r23 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0123
        L_0x0121:
            r23 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0123:
            r3 = r3 | r23
        L_0x0125:
            r23 = r14 & 6
            if (r23 != 0) goto L_0x013f
            r5 = r13 & 1024(0x400, float:1.435E-42)
            if (r5 != 0) goto L_0x0138
            r5 = r59
            boolean r23 = r2.C(r5)
            if (r23 == 0) goto L_0x013a
            r23 = 4
            goto L_0x013c
        L_0x0138:
            r5 = r59
        L_0x013a:
            r23 = 2
        L_0x013c:
            r23 = r14 | r23
            goto L_0x0143
        L_0x013f:
            r5 = r59
            r23 = r14
        L_0x0143:
            r5 = r13 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x014c
            r23 = r23 | 48
        L_0x0149:
            r7 = r23
            goto L_0x0160
        L_0x014c:
            r24 = r14 & 48
            r7 = r60
            if (r24 != 0) goto L_0x0149
            boolean r24 = r2.S(r7)
            if (r24 == 0) goto L_0x015b
            r17 = 32
            goto L_0x015d
        L_0x015b:
            r17 = 16
        L_0x015d:
            r23 = r23 | r17
            goto L_0x0149
        L_0x0160:
            r8 = r13 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x0169
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0166:
            r8 = r61
            goto L_0x017c
        L_0x0169:
            r8 = r14 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0166
            r8 = r61
            boolean r17 = r2.C(r8)
            if (r17 == 0) goto L_0x0178
            r20 = 256(0x100, float:3.59E-43)
            goto L_0x017a
        L_0x0178:
            r20 = 128(0x80, float:1.794E-43)
        L_0x017a:
            r7 = r7 | r20
        L_0x017c:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r8 = r3 & r17
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            if (r8 != r9) goto L_0x01ab
            r8 = r7 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x01ab
            boolean r8 = r2.i()
            if (r8 != 0) goto L_0x0193
            goto L_0x01ab
        L_0x0193:
            r2.I()
            r3 = r47
            r4 = r49
            r5 = r50
            r6 = r51
            r42 = r58
            r14 = r59
            r15 = r60
            r8 = r11
            r11 = r55
            r12 = r56
            goto L_0x045e
        L_0x01ab:
            r2.D()
            r8 = r15 & 1
            r9 = 0
            if (r8 == 0) goto L_0x01ff
            boolean r8 = r2.L()
            if (r8 == 0) goto L_0x01ba
            goto L_0x01ff
        L_0x01ba:
            r2.I()
            r0 = r13 & 4
            if (r0 == 0) goto L_0x01c3
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x01c3:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x01cb
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = r3 & r0
        L_0x01cb:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x01d3
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r0
        L_0x01d3:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x01db
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r0
        L_0x01db:
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01e3
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r3 = r3 & r0
        L_0x01e3:
            r0 = r13 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x01e9
            r7 = r7 & -15
        L_0x01e9:
            r0 = r47
            r4 = r50
            r8 = r51
            r5 = r55
            r42 = r58
            r43 = r59
            r44 = r60
            r13 = r3
            r14 = r7
            r3 = r49
            r6 = r56
            goto L_0x02c8
        L_0x01ff:
            if (r6 == 0) goto L_0x0204
            k0.i$a r6 = k0.i.f23074a
            goto L_0x0206
        L_0x0204:
            r6 = r47
        L_0x0206:
            r8 = r13 & 4
            if (r8 == 0) goto L_0x0213
            r8 = 3
            r10 = 0
            V.E0 r8 = l(r9, r10, r2, r9, r8)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0214
        L_0x0213:
            r8 = r10
        L_0x0214:
            if (r16 == 0) goto L_0x021d
            V.i r10 = V.C1385i.f7527a
            float r10 = r10.f()
            goto L_0x021f
        L_0x021d:
            r10 = r49
        L_0x021f:
            r16 = r13 & 16
            if (r16 == 0) goto L_0x0232
            V.i r9 = V.C1385i.f7527a
            r47 = r6
            r6 = 6
            r0.g2 r9 = r9.d(r2, r6)
            r20 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = r3 & r20
            goto L_0x0237
        L_0x0232:
            r47 = r6
            r6 = 6
            r9 = r50
        L_0x0237:
            r20 = r13 & 32
            r48 = r8
            if (r20 == 0) goto L_0x024c
            V.i r8 = V.C1385i.f7527a
            long r23 = r8.b(r2, r6)
            r6 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r6
            r49 = r9
            r8 = r23
            goto L_0x0250
        L_0x024c:
            r49 = r9
            r8 = r51
        L_0x0250:
            r6 = r13 & 64
            if (r6 == 0) goto L_0x0260
            int r6 = r3 >> 15
            r6 = r6 & 14
            long r11 = V.C1404s.c(r8, r2, r6)
            r6 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r6
        L_0x0260:
            if (r0 == 0) goto L_0x0269
            r0 = 0
            float r6 = (float) r0
            float r6 = c1.h.j(r6)
            goto L_0x026c
        L_0x0269:
            r0 = 0
            r6 = r55
        L_0x026c:
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x027f
            V.i r0 = V.C1385i.f7527a
            r50 = r6
            r6 = 6
            long r23 = r0.e(r2, r6)
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r0 = r0 & r3
            r3 = r0
            goto L_0x0283
        L_0x027f:
            r50 = r6
            r23 = r56
        L_0x0283:
            if (r4 == 0) goto L_0x028c
            V.v r0 = V.C1410v.f8062a
            yf.p r0 = r0.a()
            goto L_0x028e
        L_0x028c:
            r0 = r58
        L_0x028e:
            r4 = r13 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0297
            V.i0$a r4 = V.C1386i0.a.f7545a
            r7 = r7 & -15
            goto L_0x0299
        L_0x0297:
            r4 = r59
        L_0x0299:
            if (r5 == 0) goto L_0x02b5
            V.e0 r5 = V.C1378e0.f7461a
            V.j0 r5 = r5.a()
            r42 = r0
            r13 = r3
            r43 = r4
            r44 = r5
            r14 = r7
            r3 = r10
            r6 = r23
            r0 = r47
            r10 = r48
            r4 = r49
            r5 = r50
            goto L_0x02c8
        L_0x02b5:
            r5 = r50
            r44 = r60
            r42 = r0
            r13 = r3
            r43 = r4
            r14 = r7
            r3 = r10
            r6 = r23
            r0 = r47
            r10 = r48
            r4 = r49
        L_0x02c8:
            r2.v()
            boolean r23 = Y.C1506p.H()
            if (r23 == 0) goto L_0x02dc
            java.lang.String r15 = "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:132)"
            r53 = r5
            r5 = 2132719801(0x7f1eb8b9, float:2.1097716E38)
            Y.C1506p.Q(r5, r13, r14, r15)
            goto L_0x02de
        L_0x02dc:
            r53 = r5
        L_0x02de:
            java.lang.Object r5 = r2.A()
            Y.m$a r15 = Y.C1500m.f10026a
            r22 = r14
            java.lang.Object r14 = r15.a()
            if (r5 != r14) goto L_0x02fb
            qf.h r5 = qf.h.f72645a
            Ug.K r5 = Y.P.j(r5, r2)
            Y.B r14 = new Y.B
            r14.<init>(r5)
            r2.r(r14)
            r5 = r14
        L_0x02fb:
            Y.B r5 = (Y.B) r5
            Ug.K r5 = r5.a()
            r14 = r13 & 896(0x380, float:1.256E-42)
            r14 = r14 ^ 384(0x180, float:5.38E-43)
            r54 = r11
            r12 = 256(0x100, float:3.59E-43)
            if (r14 <= r12) goto L_0x0311
            boolean r21 = r2.S(r10)
            if (r21 != 0) goto L_0x0315
        L_0x0311:
            r11 = r13 & 384(0x180, float:5.38E-43)
            if (r11 != r12) goto L_0x0317
        L_0x0315:
            r11 = 1
            goto L_0x0318
        L_0x0317:
            r11 = 0
        L_0x0318:
            boolean r12 = r2.C(r5)
            r11 = r11 | r12
            r12 = r13 & 14
            r57 = r8
            r8 = 4
            if (r12 != r8) goto L_0x0326
            r8 = 1
            goto L_0x0327
        L_0x0326:
            r8 = 0
        L_0x0327:
            r8 = r8 | r11
            java.lang.Object r9 = r2.A()
            if (r8 != 0) goto L_0x0334
            java.lang.Object r8 = r15.a()
            if (r9 != r8) goto L_0x033c
        L_0x0334:
            V.i0$f r9 = new V.i0$f
            r9.<init>(r10, r5, r1)
            r2.r(r9)
        L_0x033c:
            r26 = r9
            yf.a r26 = (yf.C6787a) r26
            boolean r8 = r2.C(r5)
            r9 = 256(0x100, float:3.59E-43)
            if (r14 <= r9) goto L_0x034e
            boolean r11 = r2.S(r10)
            if (r11 != 0) goto L_0x0352
        L_0x034e:
            r11 = r13 & 384(0x180, float:5.38E-43)
            if (r11 != r9) goto L_0x0354
        L_0x0352:
            r9 = 1
            goto L_0x0355
        L_0x0354:
            r9 = 0
        L_0x0355:
            r8 = r8 | r9
            r9 = 4
            if (r12 != r9) goto L_0x035b
            r9 = 1
            goto L_0x035c
        L_0x035b:
            r9 = 0
        L_0x035c:
            r8 = r8 | r9
            java.lang.Object r9 = r2.A()
            if (r8 != 0) goto L_0x0369
            java.lang.Object r8 = r15.a()
            if (r9 != r8) goto L_0x0371
        L_0x0369:
            V.i0$g r9 = new V.i0$g
            r9.<init>(r5, r10, r1)
            r2.r(r9)
        L_0x0371:
            r30 = r9
            yf.l r30 = (yf.C6798l) r30
            java.lang.Object r8 = r2.A()
            java.lang.Object r9 = r15.a()
            if (r8 != r9) goto L_0x038d
            r8 = 0
            r9 = 0
            r59 = r4
            r4 = 0
            r11 = 2
            w.a r8 = w.C2784b.b(r8, r9, r11, r4)
            r2.r(r8)
            goto L_0x038f
        L_0x038d:
            r59 = r4
        L_0x038f:
            r4 = r8
            w.a r4 = (w.C2782a) r4
            r8 = 256(0x100, float:3.59E-43)
            if (r14 <= r8) goto L_0x039c
            boolean r9 = r2.S(r10)
            if (r9 != 0) goto L_0x03a0
        L_0x039c:
            r9 = r13 & 384(0x180, float:5.38E-43)
            if (r9 != r8) goto L_0x03a2
        L_0x03a0:
            r8 = 1
            goto L_0x03a3
        L_0x03a2:
            r8 = 0
        L_0x03a3:
            boolean r9 = r2.C(r5)
            r8 = r8 | r9
            boolean r9 = r2.C(r4)
            r8 = r8 | r9
            r9 = 4
            if (r12 != r9) goto L_0x03b2
            r9 = 1
            goto L_0x03b3
        L_0x03b2:
            r9 = 0
        L_0x03b3:
            r8 = r8 | r9
            java.lang.Object r9 = r2.A()
            if (r8 != 0) goto L_0x03c0
            java.lang.Object r8 = r15.a()
            if (r9 != r8) goto L_0x03c8
        L_0x03c0:
            V.i0$b r9 = new V.i0$b
            r9.<init>(r10, r5, r4, r1)
            r2.r(r9)
        L_0x03c8:
            r8 = r9
            yf.a r8 = (yf.C6787a) r8
            V.i0$c r9 = new V.i0$c
            r23 = r9
            r24 = r6
            r27 = r10
            r28 = r4
            r29 = r5
            r31 = r0
            r32 = r3
            r33 = r59
            r34 = r57
            r36 = r54
            r38 = r53
            r39 = r42
            r40 = r43
            r41 = r61
            r23.<init>(r24, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38, r39, r40, r41)
            r5 = 54
            r11 = -314673510(0xffffffffed3e769a, float:-3.6840958E27)
            r12 = 1
            g0.a r5 = g0.c.e(r11, r12, r9, r2, r5)
            r9 = r22 & 112(0x70, float:1.57E-43)
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            int r11 = w.C2782a.f27266m
            r18 = 6
            int r11 = r11 << 6
            r9 = r9 | r11
            r47 = r8
            r48 = r44
            r49 = r4
            r50 = r5
            r51 = r2
            r52 = r9
            V.C1390k0.a(r47, r48, r49, r50, r51, r52)
            boolean r4 = r10.f()
            if (r4 == 0) goto L_0x0446
            r4 = 256(0x100, float:3.59E-43)
            if (r14 <= r4) goto L_0x0420
            boolean r5 = r2.S(r10)
            if (r5 != 0) goto L_0x0424
        L_0x0420:
            r5 = r13 & 384(0x180, float:5.38E-43)
            if (r5 != r4) goto L_0x0426
        L_0x0424:
            r9 = r12
            goto L_0x0427
        L_0x0426:
            r9 = 0
        L_0x0427:
            java.lang.Object r4 = r2.A()
            if (r9 != 0) goto L_0x0433
            java.lang.Object r5 = r15.a()
            if (r4 != r5) goto L_0x043c
        L_0x0433:
            V.i0$d r4 = new V.i0$d
            r5 = 0
            r4.<init>(r10, r5)
            r2.r(r4)
        L_0x043c:
            yf.p r4 = (yf.p) r4
            r5 = 6
            int r5 = r13 >> 6
            r5 = r5 & 14
            Y.P.g(r10, r4, r2, r5)
        L_0x0446:
            boolean r4 = Y.C1506p.H()
            if (r4 == 0) goto L_0x044f
            Y.C1506p.P()
        L_0x044f:
            r11 = r53
            r8 = r54
            r5 = r59
            r4 = r3
            r12 = r6
            r14 = r43
            r15 = r44
            r6 = r57
            r3 = r0
        L_0x045e:
            Y.Y0 r2 = r2.k()
            if (r2 == 0) goto L_0x0484
            V.i0$e r0 = new V.i0$e
            r47 = r0
            r1 = r46
            r45 = r2
            r2 = r3
            r3 = r10
            r10 = r11
            r11 = r12
            r13 = r42
            r16 = r61
            r17 = r63
            r18 = r64
            r19 = r65
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19)
            r1 = r47
            r0 = r45
            r0.a(r1)
        L_0x0484:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.C1386i0.a(yf.a, k0.i, V.E0, float, r0.g2, long, long, float, long, yf.p, yf.p, V.j0, yf.q, Y.m, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v0, resolved type: yf.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: V.i0$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v18, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x048d  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x04a3  */
    /* JADX WARNING: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(C.C1086d r48, w.C2782a r49, Ug.K r50, yf.C6787a r51, yf.C6798l r52, k0.i r53, V.E0 r54, float r55, r0.g2 r56, long r57, long r59, float r61, yf.p r62, yf.p r63, yf.q r64, Y.C1500m r65, int r66, int r67, int r68) {
        /*
            r1 = r48
            r2 = r49
            r5 = r52
            r15 = r66
            r14 = r67
            r12 = r68
            r4 = 196608(0x30000, float:2.75506E-40)
            r9 = 16
            r10 = 1
            r13 = 128(0x80, float:1.794E-43)
            r0 = 32
            r3 = 6
            r6 = -1676960531(0xffffffff9c0b9ced, float:-4.6194064E-22)
            r7 = r65
            Y.m r7 = r7.h(r6)
            r20 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = r12 & r20
            r21 = 4
            r6 = 2
            if (r20 == 0) goto L_0x002b
            r20 = r15 | 6
            goto L_0x003f
        L_0x002b:
            r20 = r15 & 6
            if (r20 != 0) goto L_0x003d
            boolean r20 = r7.S(r1)
            if (r20 == 0) goto L_0x0038
            r20 = r21
            goto L_0x003a
        L_0x0038:
            r20 = r6
        L_0x003a:
            r20 = r15 | r20
            goto L_0x003f
        L_0x003d:
            r20 = r15
        L_0x003f:
            r23 = r12 & 1
            if (r23 == 0) goto L_0x0048
            r20 = r20 | 48
        L_0x0045:
            r10 = r20
            goto L_0x0063
        L_0x0048:
            r23 = r15 & 48
            if (r23 != 0) goto L_0x0045
            r23 = r15 & 64
            if (r23 != 0) goto L_0x0055
            boolean r23 = r7.S(r2)
            goto L_0x0059
        L_0x0055:
            boolean r23 = r7.C(r2)
        L_0x0059:
            if (r23 == 0) goto L_0x005e
            r23 = r0
            goto L_0x0060
        L_0x005e:
            r23 = r9
        L_0x0060:
            r20 = r20 | r23
            goto L_0x0045
        L_0x0063:
            r20 = r12 & 2
            if (r20 == 0) goto L_0x006c
            r10 = r10 | 384(0x180, float:5.38E-43)
        L_0x0069:
            r6 = r50
            goto L_0x007f
        L_0x006c:
            r6 = r15 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0069
            r6 = r50
            boolean r20 = r7.C(r6)
            if (r20 == 0) goto L_0x007b
            r20 = 256(0x100, float:3.59E-43)
            goto L_0x007d
        L_0x007b:
            r20 = r13
        L_0x007d:
            r10 = r10 | r20
        L_0x007f:
            r20 = r12 & 4
            if (r20 == 0) goto L_0x0088
            r10 = r10 | 3072(0xc00, float:4.305E-42)
        L_0x0085:
            r8 = r51
            goto L_0x009b
        L_0x0088:
            r8 = r15 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0085
            r8 = r51
            boolean r24 = r7.C(r8)
            if (r24 == 0) goto L_0x0097
            r24 = 2048(0x800, float:2.87E-42)
            goto L_0x0099
        L_0x0097:
            r24 = 1024(0x400, float:1.435E-42)
        L_0x0099:
            r10 = r10 | r24
        L_0x009b:
            r24 = r12 & 8
            if (r24 == 0) goto L_0x00a2
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b2
        L_0x00a2:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x00b2
            boolean r3 = r7.C(r5)
            if (r3 == 0) goto L_0x00af
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b1
        L_0x00af:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x00b1:
            r10 = r10 | r3
        L_0x00b2:
            r3 = r12 & 16
            if (r3 == 0) goto L_0x00ba
            r10 = r10 | r4
        L_0x00b7:
            r4 = r53
            goto L_0x00cc
        L_0x00ba:
            r4 = r4 & r15
            if (r4 != 0) goto L_0x00b7
            r4 = r53
            boolean r26 = r7.S(r4)
            if (r26 == 0) goto L_0x00c8
            r26 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ca
        L_0x00c8:
            r26 = 65536(0x10000, float:9.18355E-41)
        L_0x00ca:
            r10 = r10 | r26
        L_0x00cc:
            r26 = 1572864(0x180000, float:2.204052E-39)
            r27 = r15 & r26
            if (r27 != 0) goto L_0x00e6
            r27 = r12 & 32
            r9 = r54
            if (r27 != 0) goto L_0x00e1
            boolean r29 = r7.S(r9)
            if (r29 == 0) goto L_0x00e1
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e3
        L_0x00e1:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00e3:
            r10 = r10 | r29
            goto L_0x00e8
        L_0x00e6:
            r9 = r54
        L_0x00e8:
            r29 = r12 & 64
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            if (r29 == 0) goto L_0x00f3
            r10 = r10 | r30
            r0 = r55
            goto L_0x0106
        L_0x00f3:
            r31 = r15 & r30
            r0 = r55
            if (r31 != 0) goto L_0x0106
            boolean r32 = r7.c(r0)
            if (r32 == 0) goto L_0x0102
            r32 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0104
        L_0x0102:
            r32 = 4194304(0x400000, float:5.877472E-39)
        L_0x0104:
            r10 = r10 | r32
        L_0x0106:
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            r32 = r15 & r32
            if (r32 != 0) goto L_0x0122
            r11 = r12 & 128(0x80, float:1.794E-43)
            if (r11 != 0) goto L_0x011b
            r11 = r56
            boolean r33 = r7.S(r11)
            if (r33 == 0) goto L_0x011d
            r33 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011f
        L_0x011b:
            r11 = r56
        L_0x011d:
            r33 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011f:
            r10 = r10 | r33
            goto L_0x0124
        L_0x0122:
            r11 = r56
        L_0x0124:
            r33 = 805306368(0x30000000, float:4.656613E-10)
            r33 = r15 & r33
            if (r33 != 0) goto L_0x0140
            r13 = 256(0x100, float:3.59E-43)
            r0 = r12 & 256(0x100, float:3.59E-43)
            r8 = r57
            if (r0 != 0) goto L_0x013b
            boolean r0 = r7.e(r8)
            if (r0 == 0) goto L_0x013b
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013d
        L_0x013b:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013d:
            r10 = r10 | r0
        L_0x013e:
            r0 = 6
            goto L_0x0143
        L_0x0140:
            r8 = r57
            goto L_0x013e
        L_0x0143:
            r13 = r14 & 6
            if (r13 != 0) goto L_0x015b
            r0 = r12 & 512(0x200, float:7.175E-43)
            r8 = r59
            if (r0 != 0) goto L_0x0154
            boolean r0 = r7.e(r8)
            if (r0 == 0) goto L_0x0154
            goto L_0x0156
        L_0x0154:
            r21 = 2
        L_0x0156:
            r0 = r14 | r21
        L_0x0158:
            r13 = 1024(0x400, float:1.435E-42)
            goto L_0x015f
        L_0x015b:
            r8 = r59
            r0 = r14
            goto L_0x0158
        L_0x015f:
            r4 = r12 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x016a
            r0 = r0 | 48
            r13 = r61
        L_0x0167:
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x017e
        L_0x016a:
            r20 = r14 & 48
            r13 = r61
            if (r20 != 0) goto L_0x0167
            boolean r21 = r7.c(r13)
            if (r21 == 0) goto L_0x0179
            r28 = 32
            goto L_0x017b
        L_0x0179:
            r28 = 16
        L_0x017b:
            r0 = r0 | r28
            goto L_0x0167
        L_0x017e:
            r8 = r12 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0187
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0184:
            r9 = r62
            goto L_0x019a
        L_0x0187:
            r9 = r14 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0184
            r9 = r62
            boolean r19 = r7.C(r9)
            if (r19 == 0) goto L_0x0196
            r19 = 256(0x100, float:3.59E-43)
            goto L_0x0198
        L_0x0196:
            r19 = 128(0x80, float:1.794E-43)
        L_0x0198:
            r0 = r0 | r19
        L_0x019a:
            r6 = r14 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x01b6
            r6 = r12 & 4096(0x1000, float:5.74E-42)
            if (r6 != 0) goto L_0x01ad
            r6 = r63
            boolean r21 = r7.C(r6)
            if (r21 == 0) goto L_0x01af
            r19 = 2048(0x800, float:2.87E-42)
            goto L_0x01b1
        L_0x01ad:
            r6 = r63
        L_0x01af:
            r19 = 1024(0x400, float:1.435E-42)
        L_0x01b1:
            r0 = r0 | r19
        L_0x01b3:
            r6 = 8192(0x2000, float:1.14794E-41)
            goto L_0x01b9
        L_0x01b6:
            r6 = r63
            goto L_0x01b3
        L_0x01b9:
            r9 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r9 == 0) goto L_0x01c2
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x01bf:
            r9 = r64
            goto L_0x01d1
        L_0x01c2:
            r9 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x01bf
            r9 = r64
            boolean r18 = r7.C(r9)
            if (r18 == 0) goto L_0x01d0
            r6 = 16384(0x4000, float:2.2959E-41)
        L_0x01d0:
            r0 = r0 | r6
        L_0x01d1:
            r6 = 306783379(0x12492493, float:6.34695E-28)
            r6 = r6 & r10
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r9) goto L_0x01fc
            r6 = r0 & 9363(0x2493, float:1.312E-41)
            r9 = 9362(0x2492, float:1.3119E-41)
            if (r6 != r9) goto L_0x01fc
            boolean r6 = r7.i()
            if (r6 != 0) goto L_0x01e7
            goto L_0x01fc
        L_0x01e7:
            r7.I()
            r6 = r53
            r8 = r54
            r19 = r55
            r15 = r62
            r16 = r63
            r9 = r11
            r14 = r13
            r10 = r57
            r12 = r59
            goto L_0x049d
        L_0x01fc:
            r7.D()
            r6 = 1
            r9 = r15 & 1
            r6 = 0
            if (r9 == 0) goto L_0x0249
            boolean r9 = r7.L()
            if (r9 == 0) goto L_0x020c
            goto L_0x0249
        L_0x020c:
            r7.I()
            r3 = 32
            r4 = r12 & 32
            if (r4 == 0) goto L_0x0219
            r3 = -3670017(0xffffffffffc7ffff, float:NaN)
            r10 = r10 & r3
        L_0x0219:
            r3 = 128(0x80, float:1.794E-43)
            r3 = r3 & r12
            if (r3 == 0) goto L_0x0222
            r3 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r10 = r10 & r3
        L_0x0222:
            r3 = 256(0x100, float:3.59E-43)
            r3 = r3 & r12
            if (r3 == 0) goto L_0x022b
            r3 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r10 = r10 & r3
        L_0x022b:
            r3 = r12 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0231
            r0 = r0 & -15
        L_0x0231:
            r3 = r12 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L_0x0237
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0237:
            r3 = r54
            r4 = r55
            r33 = r59
            r6 = r62
            r8 = r63
            r12 = r0
            r14 = r10
            r0 = r53
            r9 = r57
            goto L_0x02ea
        L_0x0249:
            if (r3 == 0) goto L_0x0250
            k0.i$a r3 = k0.i.f23074a
        L_0x024d:
            r9 = 32
            goto L_0x0253
        L_0x0250:
            r3 = r53
            goto L_0x024d
        L_0x0253:
            r19 = r12 & 32
            if (r19 == 0) goto L_0x0264
            r9 = 3
            r53 = r3
            r3 = 0
            V.E0 r9 = l(r6, r3, r7, r6, r9)
            r3 = -3670017(0xffffffffffc7ffff, float:NaN)
            r10 = r10 & r3
            goto L_0x0268
        L_0x0264:
            r53 = r3
            r9 = r54
        L_0x0268:
            if (r29 == 0) goto L_0x0273
            V.i r3 = V.C1385i.f7527a
            float r3 = r3.f()
        L_0x0270:
            r6 = 128(0x80, float:1.794E-43)
            goto L_0x0276
        L_0x0273:
            r3 = r55
            goto L_0x0270
        L_0x0276:
            r6 = r6 & r12
            if (r6 == 0) goto L_0x0286
            V.i r6 = V.C1385i.f7527a
            r11 = 6
            r0.g2 r6 = r6.d(r7, r11)
            r16 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r10 = r10 & r16
            r11 = r6
        L_0x0286:
            r6 = 256(0x100, float:3.59E-43)
            r6 = r6 & r12
            if (r6 == 0) goto L_0x029e
            V.i r6 = V.C1385i.f7527a
            r54 = r3
            r3 = 6
            long r19 = r6.b(r7, r3)
            r3 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r3 = r3 & r10
            r6 = r3
            r55 = r9
            r9 = r19
            goto L_0x02a5
        L_0x029e:
            r54 = r3
            r55 = r9
            r6 = r10
            r9 = r57
        L_0x02a5:
            r3 = r12 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x02b4
            int r3 = r6 >> 27
            r3 = r3 & 14
            long r19 = V.C1404s.c(r9, r7, r3)
            r0 = r0 & -15
            goto L_0x02b6
        L_0x02b4:
            r19 = r59
        L_0x02b6:
            if (r4 == 0) goto L_0x02bf
            V.i r3 = V.C1385i.f7527a
            float r3 = r3.c()
            r13 = r3
        L_0x02bf:
            if (r8 == 0) goto L_0x02c8
            V.v r3 = V.C1410v.f8062a
            yf.p r3 = r3.b()
            goto L_0x02ca
        L_0x02c8:
            r3 = r62
        L_0x02ca:
            r4 = r12 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x02df
            V.i0$h r4 = V.C1386i0.h.f7606a
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
            r12 = r0
            r8 = r4
            r14 = r6
            r33 = r19
            r0 = r53
            r4 = r54
        L_0x02db:
            r6 = r3
            r3 = r55
            goto L_0x02ea
        L_0x02df:
            r4 = r54
            r8 = r63
            r12 = r0
            r14 = r6
            r33 = r19
            r0 = r53
            goto L_0x02db
        L_0x02ea:
            r7.v()
            boolean r16 = Y.C1506p.H()
            if (r16 == 0) goto L_0x02fe
            java.lang.String r15 = "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:214)"
            r61 = r13
            r13 = -1676960531(0xffffffff9c0b9ced, float:-4.6194064E-22)
            Y.C1506p.Q(r13, r14, r12, r15)
            goto L_0x0300
        L_0x02fe:
            r61 = r13
        L_0x0300:
            W.v$a r13 = W.v.f8397a
            int r13 = V.C1402q0.f7956e
            int r13 = W.v.a(r13)
            r15 = 0
            java.lang.String r13 = W.w.a(r13, r7, r15)
            k0.c$a r15 = k0.c.f23044a
            k0.c r15 = r15.m()
            k0.i r15 = r1.e(r0, r15)
            r16 = r0
            r0 = 0
            r62 = r9
            r1 = 0
            r9 = 1
            k0.i r0 = androidx.compose.foundation.layout.q.t(r15, r0, r4, r9, r1)
            r10 = 0
            k0.i r0 = androidx.compose.foundation.layout.q.h(r0, r10, r9, r1)
            r1 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r14
            r1 = r1 ^ r26
            r9 = 1048576(0x100000, float:1.469368E-39)
            if (r1 <= r9) goto L_0x0336
            boolean r10 = r7.S(r3)
            if (r10 != 0) goto L_0x033a
        L_0x0336:
            r10 = r14 & r26
            if (r10 != r9) goto L_0x033c
        L_0x033a:
            r9 = 1
            goto L_0x033d
        L_0x033c:
            r9 = 0
        L_0x033d:
            java.lang.Object r10 = r7.A()
            if (r9 != 0) goto L_0x034b
            Y.m$a r9 = Y.C1500m.f10026a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x0354
        L_0x034b:
            z.q r9 = z.q.Vertical
            C0.a r10 = V.D0.a(r3, r9, r5)
            r7.r(r10)
        L_0x0354:
            C0.a r10 = (C0.a) r10
            r9 = 2
            r15 = 0
            k0.i r0 = androidx.compose.ui.input.nestedscroll.a.b(r0, r10, r15, r9, r15)
            W.f r9 = r3.d()
            z.q r10 = z.q.Vertical
            r15 = 1048576(0x100000, float:1.469368E-39)
            if (r1 <= r15) goto L_0x036c
            boolean r19 = r7.S(r3)
            if (r19 != 0) goto L_0x036f
        L_0x036c:
            r19 = r4
            goto L_0x0372
        L_0x036f:
            r19 = r4
            goto L_0x0376
        L_0x0372:
            r4 = r14 & r26
            if (r4 != r15) goto L_0x0378
        L_0x0376:
            r4 = 1
            goto L_0x0379
        L_0x0378:
            r4 = 0
        L_0x0379:
            java.lang.Object r15 = r7.A()
            if (r4 != 0) goto L_0x0387
            Y.m$a r4 = Y.C1500m.f10026a
            java.lang.Object r4 = r4.a()
            if (r15 != r4) goto L_0x038f
        L_0x0387:
            V.i0$i r15 = new V.i0$i
            r15.<init>(r3)
            r7.r(r15)
        L_0x038f:
            yf.p r15 = (yf.p) r15
            k0.i r35 = androidx.compose.material3.internal.b.f(r0, r9, r10, r15)
            W.f r0 = r3.d()
            z.m r36 = r0.u()
            boolean r38 = r3.k()
            W.f r0 = r3.d()
            boolean r40 = r0.y()
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r14
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r0 != r4) goto L_0x03b3
            r0 = 1
            goto L_0x03b4
        L_0x03b3:
            r0 = 0
        L_0x03b4:
            java.lang.Object r4 = r7.A()
            if (r0 != 0) goto L_0x03c2
            Y.m$a r0 = Y.C1500m.f10026a
            java.lang.Object r0 = r0.a()
            if (r4 != r0) goto L_0x03cb
        L_0x03c2:
            V.i0$j r4 = new V.i0$j
            r0 = 0
            r4.<init>(r5, r0)
            r7.r(r4)
        L_0x03cb:
            r42 = r4
            yf.q r42 = (yf.q) r42
            r44 = 168(0xa8, float:2.35E-43)
            r45 = 0
            r39 = 0
            r41 = 0
            r43 = 0
            r37 = r10
            k0.i r0 = z.l.h(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            boolean r4 = r7.S(r13)
            java.lang.Object r9 = r7.A()
            if (r4 != 0) goto L_0x03f1
            Y.m$a r4 = Y.C1500m.f10026a
            java.lang.Object r4 = r4.a()
            if (r9 != r4) goto L_0x03f9
        L_0x03f1:
            V.i0$k r9 = new V.i0$k
            r9.<init>(r13)
            r7.r(r9)
        L_0x03f9:
            yf.l r9 = (yf.C6798l) r9
            r4 = 0
            r10 = 0
            r13 = 1
            k0.i r0 = O0.m.d(r0, r10, r9, r13, r4)
            r4 = 1048576(0x100000, float:1.469368E-39)
            if (r1 <= r4) goto L_0x040c
            boolean r1 = r7.S(r3)
            if (r1 != 0) goto L_0x0410
        L_0x040c:
            r1 = r14 & r26
            if (r1 != r4) goto L_0x0412
        L_0x0410:
            r1 = 1
            goto L_0x0413
        L_0x0412:
            r1 = r10
        L_0x0413:
            r4 = r14 & 112(0x70, float:1.57E-43)
            r9 = 32
            if (r4 == r9) goto L_0x0423
            r4 = r14 & 64
            if (r4 == 0) goto L_0x0424
            boolean r4 = r7.C(r2)
            if (r4 == 0) goto L_0x0424
        L_0x0423:
            r10 = 1
        L_0x0424:
            r1 = r1 | r10
            java.lang.Object r4 = r7.A()
            if (r1 != 0) goto L_0x0433
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r4 != r1) goto L_0x043b
        L_0x0433:
            V.i0$l r4 = new V.i0$l
            r4.<init>(r3, r2)
            r7.r(r4)
        L_0x043b:
            yf.l r4 = (yf.C6798l) r4
            k0.i r20 = androidx.compose.ui.graphics.b.a(r0, r4)
            V.i0$m r0 = new V.i0$m
            r53 = r0
            r54 = r8
            r55 = r49
            r56 = r6
            r57 = r3
            r58 = r51
            r59 = r50
            r60 = r64
            r53.<init>(r54, r55, r56, r57, r58, r59, r60)
            r1 = 54
            r4 = -692668920(0xffffffffd6b6b608, float:-1.00446467E14)
            r9 = 1
            g0.a r29 = g0.c.e(r4, r9, r0, r7, r1)
            int r0 = r14 >> 21
            r1 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r30
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            int r1 = r12 << 9
            r4 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r4
            r31 = r0 | r1
            r32 = 96
            r27 = 0
            r28 = 0
            r21 = r11
            r22 = r62
            r24 = r33
            r26 = r61
            r30 = r7
            V.O0.a(r20, r21, r22, r24, r26, r27, r28, r29, r30, r31, r32)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x0490
            Y.C1506p.P()
        L_0x0490:
            r14 = r61
            r15 = r6
            r9 = r11
            r6 = r16
            r12 = r33
            r10 = r62
            r16 = r8
            r8 = r3
        L_0x049d:
            Y.Y0 r7 = r7.k()
            if (r7 == 0) goto L_0x04c9
            V.i0$n r4 = new V.i0$n
            r0 = r4
            r1 = r48
            r2 = r49
            r3 = r50
            r46 = r4
            r4 = r51
            r5 = r52
            r47 = r7
            r7 = r8
            r8 = r19
            r17 = r64
            r18 = r66
            r19 = r67
            r20 = r68
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r14, r15, r16, r17, r18, r19, r20)
            r1 = r46
            r0 = r47
            r0.a(r1)
        L_0x04c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.C1386i0.b(C.d, w.a, Ug.K, yf.a, yf.l, k0.i, V.E0, float, r0.g2, long, long, float, yf.p, yf.p, yf.q, Y.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void c(long j10, C6787a aVar, boolean z10, C1500m mVar, int i10) {
        int i11;
        float f10;
        k0.i iVar;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        long j11 = j10;
        C6787a aVar2 = aVar;
        boolean z13 = z10;
        int i15 = i10;
        C1500m h10 = mVar.h(951870469);
        if ((i15 & 6) == 0) {
            if (h10.e(j11)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i15;
        } else {
            i11 = i15;
        }
        if ((i15 & 48) == 0) {
            if (h10.C(aVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i15 & 384) == 0) {
            if (h10.b(z13)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        int i16 = i11;
        if ((i16 & 147) != 146 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(951870469, i16, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.kt:407)");
            }
            if (j11 != 16) {
                if (z13) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                int i17 = i16;
                A1 d10 = C2786c.d(f10, new q0(0, 0, (C2760D) null, 7, (DefaultConstructorMarker) null), 0.0f, (String) null, (C6798l) null, h10, 48, 28);
                v.a aVar3 = W.v.f8397a;
                String a10 = W.w.a(W.v.a(k0.n.f23130a), h10, 0);
                h10.T(-1785653838);
                boolean z14 = true;
                if (z13) {
                    i.a aVar4 = k0.i.f23074a;
                    int i18 = i17 & 112;
                    if (i18 == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Object A10 = h10.A();
                    if (z11 || A10 == C1500m.f10026a.a()) {
                        A10 = new q(aVar2, (C6658d) null);
                        h10.r(A10);
                    }
                    k0.i d11 = T.d(aVar4, aVar2, (yf.p) A10);
                    boolean S10 = h10.S(a10);
                    if (i18 == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z15 = S10 | z12;
                    Object A11 = h10.A();
                    if (z15 || A11 == C1500m.f10026a.a()) {
                        A11 = new r(a10, aVar2);
                        h10.r(A11);
                    }
                    iVar = O0.m.c(d11, true, (C6798l) A11);
                } else {
                    iVar = k0.i.f23074a;
                }
                h10.M();
                k0.i h11 = androidx.compose.foundation.layout.q.f(k0.i.f23074a, 0.0f, 1, (Object) null).h(iVar);
                if ((i17 & 14) != 4) {
                    z14 = false;
                }
                boolean S11 = h10.S(d10) | z14;
                Object A12 = h10.A();
                if (S11 || A12 == C1500m.f10026a.a()) {
                    A12 = new o(j11, d10);
                    h10.r(A12);
                }
                C2870i.a(h11, (C6798l) A12, h10, 0);
            }
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new p(j10, aVar, z10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final float d(A1 a12) {
        return ((Number) a12.getValue()).floatValue();
    }

    /* access modifiers changed from: private */
    public static final float j(androidx.compose.ui.graphics.c cVar, float f10) {
        float k10 = C2427m.k(cVar.d());
        if (Float.isNaN(k10) || k10 == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (C1943b.b(0.0f, Math.min(cVar.t1(f7542a), k10), f10) / k10);
    }

    /* access modifiers changed from: private */
    public static final float k(androidx.compose.ui.graphics.c cVar, float f10) {
        float i10 = C2427m.i(cVar.d());
        if (Float.isNaN(i10) || i10 == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (C1943b.b(0.0f, Math.min(cVar.t1(f7543b), i10), f10) / i10);
    }

    public static final E0 l(boolean z10, C6798l lVar, C1500m mVar, int i10, int i11) {
        if ((i11 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i11 & 2) != 0) {
            lVar = s.f7673a;
        }
        C6798l lVar2 = lVar;
        if (C1506p.H()) {
            C1506p.Q(-778250030, i10, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.kt:400)");
        }
        E0 d10 = D0.d(z11, lVar2, F0.Hidden, false, mVar, (i10 & 14) | 384 | (i10 & 112), 8);
        if (C1506p.H()) {
            C1506p.P();
        }
        return d10;
    }
}
