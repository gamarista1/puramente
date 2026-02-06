package k3;

import Ug.C5600w0;
import Ug.K;
import Xg.C5694f;
import Xg.C5695g;
import Y.A1;
import Y.C1500m;
import Y.C1503n0;
import Y.C1506p;
import Y.C1510r0;
import Y.L;
import Y.M;
import Y.M0;
import androidx.activity.C1546b;
import androidx.lifecycle.C1798v;
import com.revenuecat.purchases.common.UtilsKt;
import h0.C2020d;
import j3.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k3.C2152d;
import k3.C2153e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import v.C2719b;
import v.C2726i;
import v.C2738u;
import w.C2760D;
import w.C2763G;
import w.C2787c0;
import w.C2798j;
import w.l0;
import w.n0;
import w.q0;
import yf.C6787a;
import yf.C6798l;

/* renamed from: k3.m  reason: case insensitive filesystem */
public abstract class C2161m {

    /* renamed from: k3.m$a */
    static final class a extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f23365a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f23366b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k0.i f23367c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k0.c f23368d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f23369e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6798l f23370f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C6798l f23371g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C6798l f23372h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C6798l f23373i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C6798l f23374j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C6798l f23375k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f23376l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f23377m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f23378n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(x xVar, String str, k0.i iVar, k0.c cVar, String str2, C6798l lVar, C6798l lVar2, C6798l lVar3, C6798l lVar4, C6798l lVar5, C6798l lVar6, int i10, int i11, int i12) {
            super(2);
            this.f23365a = xVar;
            this.f23366b = str;
            this.f23367c = iVar;
            this.f23368d = cVar;
            this.f23369e = str2;
            this.f23370f = lVar;
            this.f23371g = lVar2;
            this.f23372h = lVar3;
            this.f23373i = lVar4;
            this.f23374j = lVar5;
            this.f23375k = lVar6;
            this.f23376l = i10;
            this.f23377m = i11;
            this.f23378n = i12;
        }

        public final void a(C1500m mVar, int i10) {
            C2161m.b(this.f23365a, this.f23366b, this.f23367c, this.f23368d, this.f23369e, this.f23370f, this.f23371g, this.f23372h, this.f23373i, this.f23374j, this.f23375k, mVar, M0.a(this.f23376l | 1), M0.a(this.f23377m), this.f23378n);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: k3.m$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f23379a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final androidx.compose.animation.i invoke(androidx.compose.animation.d dVar) {
            return androidx.compose.animation.g.o(C2798j.j(700, 0, (C2760D) null, 6, (Object) null), 0.0f, 2, (Object) null);
        }
    }

    /* renamed from: k3.m$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f23380a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final androidx.compose.animation.k invoke(androidx.compose.animation.d dVar) {
            return androidx.compose.animation.g.q(C2798j.j(700, 0, (C2760D) null, 6, (Object) null), 0.0f, 2, (Object) null);
        }
    }

    /* renamed from: k3.m$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        int f23381a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f23382b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2153e f23383c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A1 f23384d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C1503n0 f23385e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C1510r0 f23386f;

        /* renamed from: k3.m$d$a */
        static final class a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ A1 f23387a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C1510r0 f23388b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C1503n0 f23389c;

            a(A1 a12, C1510r0 r0Var, C1503n0 n0Var) {
                this.f23387a = a12;
                this.f23388b = r0Var;
                this.f23389c = n0Var;
            }

            /* renamed from: a */
            public final Object emit(C1546b bVar, C6658d dVar) {
                if (C2161m.g(this.f23387a).size() > 1) {
                    C2161m.d(this.f23388b, true);
                    C2161m.i(this.f23389c, bVar.a());
                }
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C2153e eVar, A1 a12, C1503n0 n0Var, C1510r0 r0Var, C6658d dVar) {
            super(2, dVar);
            this.f23383c = eVar;
            this.f23384d = a12;
            this.f23385e = n0Var;
            this.f23386f = r0Var;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            d dVar2 = new d(this.f23383c, this.f23384d, this.f23385e, this.f23386f, dVar);
            dVar2.f23382b = obj;
            return dVar2;
        }

        /* renamed from: i */
        public final Object invoke(C5694f fVar, C6658d dVar) {
            return ((d) create(fVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            j3.k kVar;
            j3.k kVar2;
            Object f10 = C6680b.f();
            int i10 = this.f23381a;
            if (i10 == 0) {
                w.b(obj);
                C5694f fVar = (C5694f) this.f23382b;
                if (C2161m.g(this.f23384d).size() > 1) {
                    C2161m.i(this.f23385e, 0.0f);
                    kVar2 = (j3.k) C6565s.B0(C2161m.g(this.f23384d));
                    C2153e eVar = this.f23383c;
                    C6496s.e(kVar2);
                    eVar.p(kVar2);
                    this.f23383c.p((j3.k) C2161m.g(this.f23384d).get(C2161m.g(this.f23384d).size() - 2));
                } else {
                    kVar2 = null;
                }
                a aVar = new a(this.f23384d, this.f23386f, this.f23385e);
                this.f23382b = kVar2;
                this.f23381a = 1;
                if (fVar.collect(aVar, this) == f10) {
                    return f10;
                }
                kVar = kVar2;
            } else if (i10 == 1) {
                kVar = (j3.k) this.f23382b;
                try {
                    w.b(obj);
                } catch (CancellationException unused) {
                    if (C2161m.g(this.f23384d).size() > 1) {
                        C2161m.d(this.f23386f, false);
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (C2161m.g(this.f23384d).size() > 1) {
                C2161m.d(this.f23386f, false);
                C2153e eVar2 = this.f23383c;
                C6496s.e(kVar);
                eVar2.j(kVar, false);
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: k3.m$f */
    static final class f extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1 f23392a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2153e f23393b;

        /* renamed from: k3.m$f$a */
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ A1 f23394a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C2153e f23395b;

            public a(A1 a12, C2153e eVar) {
                this.f23394a = a12;
                this.f23395b = eVar;
            }

            public void dispose() {
                for (j3.k o10 : C2161m.f(this.f23394a)) {
                    this.f23395b.o(o10);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(A1 a12, C2153e eVar) {
            super(1);
            this.f23392a = a12;
            this.f23393b = eVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            return new a(this.f23392a, this.f23393b);
        }
    }

    /* renamed from: k3.m$g */
    static final class g extends kotlin.coroutines.jvm.internal.l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        int f23396a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2787c0 f23397b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1 f23398c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1503n0 f23399d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C2787c0 c0Var, A1 a12, C1503n0 n0Var, C6658d dVar) {
            super(2, dVar);
            this.f23397b = c0Var;
            this.f23398c = a12;
            this.f23399d = n0Var;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new g(this.f23397b, this.f23398c, this.f23399d, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((g) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f23396a;
            if (i10 == 0) {
                w.b(obj);
                C2787c0 c0Var = this.f23397b;
                float o10 = C2161m.h(this.f23399d);
                this.f23396a = 1;
                if (c0Var.P(o10, (j3.k) C2161m.g(this.f23398c).get(C2161m.g(this.f23398c).size() - 2), this) == f10) {
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

    /* renamed from: k3.m$h */
    static final class h extends kotlin.coroutines.jvm.internal.l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        int f23400a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f23401b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2787c0 f23402c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j3.k f23403d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ n0 f23404e;

        /* renamed from: k3.m$h$a */
        static final class a extends C6498u implements yf.p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ K f23405a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C2787c0 f23406b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ j3.k f23407c;

            /* renamed from: k3.m$h$a$a  reason: collision with other inner class name */
            static final class C0376a extends kotlin.coroutines.jvm.internal.l implements yf.p {

                /* renamed from: a  reason: collision with root package name */
                int f23408a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ float f23409b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C2787c0 f23410c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ j3.k f23411d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0376a(float f10, C2787c0 c0Var, j3.k kVar, C6658d dVar) {
                    super(2, dVar);
                    this.f23409b = f10;
                    this.f23410c = c0Var;
                    this.f23411d = kVar;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new C0376a(this.f23409b, this.f23410c, this.f23411d, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((C0376a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f23408a;
                    if (i10 == 0) {
                        w.b(obj);
                        float f11 = this.f23409b;
                        if (f11 > 0.0f) {
                            C2787c0 c0Var = this.f23410c;
                            this.f23408a = 1;
                            if (C2787c0.Q(c0Var, f11, (Object) null, this, 2, (Object) null) == f10) {
                                return f10;
                            }
                        }
                    } else if (i10 == 1) {
                        w.b(obj);
                    } else if (i10 == 2) {
                        w.b(obj);
                        return C6514M.f71813a;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    if (this.f23409b == 0.0f) {
                        C2787c0 c0Var2 = this.f23410c;
                        j3.k kVar = this.f23411d;
                        this.f23408a = 2;
                        if (c0Var2.X(kVar, this) == f10) {
                            return f10;
                        }
                    }
                    return C6514M.f71813a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(K k10, C2787c0 c0Var, j3.k kVar) {
                super(2);
                this.f23405a = k10;
                this.f23406b = c0Var;
                this.f23407c = kVar;
            }

            public final void a(float f10, float f11) {
                C5600w0 unused = C5576k.d(this.f23405a, (qf.g) null, (Ug.M) null, new C0376a(f10, this.f23406b, this.f23407c, (C6658d) null), 3, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C2787c0 c0Var, j3.k kVar, n0 n0Var, C6658d dVar) {
            super(2, dVar);
            this.f23402c = c0Var;
            this.f23403d = kVar;
            this.f23404e = n0Var;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            h hVar = new h(this.f23402c, this.f23403d, this.f23404e, dVar);
            hVar.f23401b = obj;
            return hVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((h) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f23400a;
            if (i10 == 0) {
                w.b(obj);
                K k10 = (K) this.f23401b;
                if (!C6496s.c(this.f23402c.a(), this.f23403d)) {
                    C2787c0 c0Var = this.f23402c;
                    j3.k kVar = this.f23403d;
                    this.f23400a = 1;
                    if (C2787c0.C(c0Var, kVar, (C2763G) null, this, 2, (Object) null) == f10) {
                        return f10;
                    }
                } else {
                    long q10 = this.f23404e.q() / ((long) UtilsKt.MICROS_MULTIPLIER);
                    float I10 = this.f23402c.I();
                    q0 j10 = C2798j.j((int) (this.f23402c.I() * ((float) q10)), 0, (C2760D) null, 6, (Object) null);
                    a aVar = new a(k10, this.f23402c, this.f23403d);
                    this.f23400a = 2;
                    if (l0.e(I10, 0.0f, 0.0f, j10, aVar, this, 4, (Object) null) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: k3.m$i */
    static final class i extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f23412a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2153e f23413b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6798l f23414c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6798l f23415d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6798l f23416e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ A1 f23417f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C1510r0 f23418g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(Map map, C2153e eVar, C6798l lVar, C6798l lVar2, C6798l lVar3, A1 a12, C1510r0 r0Var) {
            super(1);
            this.f23412a = map;
            this.f23413b = eVar;
            this.f23414c = lVar;
            this.f23415d = lVar2;
            this.f23416e = lVar3;
            this.f23417f = a12;
            this.f23418g = r0Var;
        }

        /* renamed from: a */
        public final C2726i invoke(androidx.compose.animation.d dVar) {
            float f10;
            if (!C2161m.f(this.f23417f).contains(dVar.e())) {
                return androidx.compose.animation.a.d(androidx.compose.animation.i.f12381a.a(), androidx.compose.animation.k.f12384a.a());
            }
            Float f11 = (Float) this.f23412a.get(((j3.k) dVar.e()).f());
            if (f11 != null) {
                f10 = f11.floatValue();
            } else {
                this.f23412a.put(((j3.k) dVar.e()).f(), Float.valueOf(0.0f));
                f10 = 0.0f;
            }
            if (!C6496s.c(((j3.k) dVar.d()).f(), ((j3.k) dVar.e()).f())) {
                if (((Boolean) this.f23413b.n().getValue()).booleanValue() || C2161m.c(this.f23418g)) {
                    f10 -= 1.0f;
                } else {
                    f10 += 1.0f;
                }
            }
            this.f23412a.put(((j3.k) dVar.d()).f(), Float.valueOf(f10));
            return new C2726i((androidx.compose.animation.i) this.f23414c.invoke(dVar), (androidx.compose.animation.k) this.f23415d.invoke(dVar), f10, (C2738u) this.f23416e.invoke(dVar));
        }
    }

    /* renamed from: k3.m$j */
    static final class j extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final j f23419a = new j();

        j() {
            super(1);
        }

        /* renamed from: a */
        public final Object invoke(j3.k kVar) {
            return kVar.f();
        }
    }

    /* renamed from: k3.m$k */
    static final class k extends C6498u implements yf.r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2787c0 f23420a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j3.k f23421b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2020d f23422c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1510r0 f23423d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1 f23424e;

        /* renamed from: k3.m$k$a */
        static final class a extends C6498u implements yf.p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j3.k f23425a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C2719b f23426b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(j3.k kVar, C2719b bVar) {
                super(2);
                this.f23425a = kVar;
                this.f23426b = bVar;
            }

            public final void a(C1500m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.i()) {
                    if (C1506p.H()) {
                        C1506p.Q(-1263531443, i10, -1, "androidx.navigation.compose.NavHost.<anonymous>.<anonymous> (NavHost.kt:703)");
                    }
                    j3.s e10 = this.f23425a.e();
                    C6496s.f(e10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                    ((C2153e.b) e10).Z().invoke(this.f23426b, this.f23425a, mVar, 0);
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C2787c0 c0Var, j3.k kVar, C2020d dVar, C1510r0 r0Var, A1 a12) {
            super(4);
            this.f23420a = c0Var;
            this.f23421b = kVar;
            this.f23422c = dVar;
            this.f23423d = r0Var;
            this.f23424e = a12;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: j3.k} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: j3.k} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: j3.k} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: j3.k} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(v.C2719b r4, j3.k r5, Y.C1500m r6, int r7) {
            /*
                r3 = this;
                boolean r0 = Y.C1506p.H()
                if (r0 == 0) goto L_0x000f
                r0 = -1
                java.lang.String r1 = "androidx.navigation.compose.NavHost.<anonymous> (NavHost.kt:689)"
                r2 = 820763100(0x30ebd9dc, float:1.716042E-9)
                Y.C1506p.Q(r2, r7, r0, r1)
            L_0x000f:
                w.c0 r7 = r3.f23420a
                java.lang.Object r7 = r7.a()
                j3.k r0 = r3.f23421b
                boolean r7 = kotlin.jvm.internal.C6496s.c(r7, r0)
                Y.r0 r0 = r3.f23423d
                boolean r0 = k3.C2161m.c(r0)
                if (r0 != 0) goto L_0x004c
                if (r7 == 0) goto L_0x0026
                goto L_0x004c
            L_0x0026:
                Y.A1 r7 = r3.f23424e
                java.util.List r7 = k3.C2161m.f(r7)
                int r0 = r7.size()
                java.util.ListIterator r7 = r7.listIterator(r0)
            L_0x0034:
                boolean r0 = r7.hasPrevious()
                if (r0 == 0) goto L_0x0048
                java.lang.Object r0 = r7.previous()
                r1 = r0
                j3.k r1 = (j3.k) r1
                boolean r1 = kotlin.jvm.internal.C6496s.c(r5, r1)
                if (r1 == 0) goto L_0x0034
                goto L_0x0049
            L_0x0048:
                r0 = 0
            L_0x0049:
                r5 = r0
                j3.k r5 = (j3.k) r5
            L_0x004c:
                if (r5 != 0) goto L_0x004f
                goto L_0x0065
            L_0x004f:
                h0.d r7 = r3.f23422c
                k3.m$k$a r0 = new k3.m$k$a
                r0.<init>(r5, r4)
                r4 = 54
                r1 = -1263531443(0xffffffffb4b00a4d, float:-3.279005E-7)
                r2 = 1
                g0.a r4 = g0.c.e(r1, r2, r0, r6, r4)
                r0 = 384(0x180, float:5.38E-43)
                k3.C2158j.a(r5, r7, r4, r6, r0)
            L_0x0065:
                boolean r4 = Y.C1506p.H()
                if (r4 == 0) goto L_0x006e
                Y.C1506p.P()
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k3.C2161m.k.a(v.b, j3.k, Y.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C2719b) obj, (j3.k) obj2, (C1500m) obj3, ((Number) obj4).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: k3.m$l */
    static final class l extends kotlin.coroutines.jvm.internal.l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        int f23427a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f23428b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x f23429c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Map f23430d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1 f23431e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C2153e f23432f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(n0 n0Var, x xVar, Map map, A1 a12, C2153e eVar, C6658d dVar) {
            super(2, dVar);
            this.f23428b = n0Var;
            this.f23429c = xVar;
            this.f23430d = map;
            this.f23431e = a12;
            this.f23432f = eVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new l(this.f23428b, this.f23429c, this.f23430d, this.f23431e, this.f23432f, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((l) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f23427a == 0) {
                w.b(obj);
                if (C6496s.c(this.f23428b.i(), this.f23428b.p()) && (this.f23429c.E() == null || C6496s.c(this.f23428b.p(), this.f23429c.E()))) {
                    C2153e eVar = this.f23432f;
                    for (j3.k o10 : C2161m.f(this.f23431e)) {
                        eVar.o(o10);
                    }
                    Map map = this.f23430d;
                    n0 n0Var = this.f23428b;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (!C6496s.c(entry.getKey(), ((j3.k) n0Var.p()).f())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Map map2 = this.f23430d;
                    for (Map.Entry key : linkedHashMap.entrySet()) {
                        map2.remove(key.getKey());
                    }
                }
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: k3.m$m  reason: collision with other inner class name */
    static final class C0377m extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f23433a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j3.u f23434b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k0.i f23435c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k0.c f23436d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6798l f23437e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6798l f23438f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C6798l f23439g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C6798l f23440h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C6798l f23441i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f23442j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f23443k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0377m(x xVar, j3.u uVar, k0.i iVar, k0.c cVar, C6798l lVar, C6798l lVar2, C6798l lVar3, C6798l lVar4, C6798l lVar5, int i10, int i11) {
            super(2);
            this.f23433a = xVar;
            this.f23434b = uVar;
            this.f23435c = iVar;
            this.f23436d = cVar;
            this.f23437e = lVar;
            this.f23438f = lVar2;
            this.f23439g = lVar3;
            this.f23440h = lVar4;
            this.f23441i = lVar5;
            this.f23442j = i10;
            this.f23443k = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C2161m.a(this.f23433a, this.f23434b, this.f23435c, this.f23436d, this.f23437e, this.f23438f, this.f23439g, this.f23440h, this.f23441i, mVar, M0.a(this.f23442j | 1), this.f23443k);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: k3.m$n */
    static final class n extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final n f23444a = new n();

        n() {
            super(1);
        }

        /* renamed from: a */
        public final androidx.compose.animation.i invoke(androidx.compose.animation.d dVar) {
            return androidx.compose.animation.g.o(C2798j.j(700, 0, (C2760D) null, 6, (Object) null), 0.0f, 2, (Object) null);
        }
    }

    /* renamed from: k3.m$o */
    static final class o extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final o f23445a = new o();

        o() {
            super(1);
        }

        /* renamed from: a */
        public final androidx.compose.animation.k invoke(androidx.compose.animation.d dVar) {
            return androidx.compose.animation.g.q(C2798j.j(700, 0, (C2760D) null, 6, (Object) null), 0.0f, 2, (Object) null);
        }
    }

    /* renamed from: k3.m$p */
    static final class p extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f23446a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j3.u f23447b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k0.i f23448c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k0.c f23449d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6798l f23450e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6798l f23451f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C6798l f23452g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C6798l f23453h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C6798l f23454i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f23455j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f23456k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(x xVar, j3.u uVar, k0.i iVar, k0.c cVar, C6798l lVar, C6798l lVar2, C6798l lVar3, C6798l lVar4, C6798l lVar5, int i10, int i11) {
            super(2);
            this.f23446a = xVar;
            this.f23447b = uVar;
            this.f23448c = iVar;
            this.f23449d = cVar;
            this.f23450e = lVar;
            this.f23451f = lVar2;
            this.f23452g = lVar3;
            this.f23453h = lVar4;
            this.f23454i = lVar5;
            this.f23455j = i10;
            this.f23456k = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C2161m.a(this.f23446a, this.f23447b, this.f23448c, this.f23449d, this.f23450e, this.f23451f, this.f23452g, this.f23453h, this.f23454i, mVar, M0.a(this.f23455j | 1), this.f23456k);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: k3.m$q */
    static final class q extends C6498u implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f23457a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j3.u f23458b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k0.i f23459c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k0.c f23460d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6798l f23461e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6798l f23462f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C6798l f23463g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C6798l f23464h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C6798l f23465i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f23466j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f23467k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(x xVar, j3.u uVar, k0.i iVar, k0.c cVar, C6798l lVar, C6798l lVar2, C6798l lVar3, C6798l lVar4, C6798l lVar5, int i10, int i11) {
            super(2);
            this.f23457a = xVar;
            this.f23458b = uVar;
            this.f23459c = iVar;
            this.f23460d = cVar;
            this.f23461e = lVar;
            this.f23462f = lVar2;
            this.f23463g = lVar3;
            this.f23464h = lVar4;
            this.f23465i = lVar5;
            this.f23466j = i10;
            this.f23467k = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C2161m.a(this.f23457a, this.f23458b, this.f23459c, this.f23460d, this.f23461e, this.f23462f, this.f23463g, this.f23464h, this.f23465i, mVar, M0.a(this.f23466j | 1), this.f23467k);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: k3.m$r */
    static final class r extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2153e f23468a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f23469b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6798l f23470c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1510r0 f23471d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(C2153e eVar, C6798l lVar, C6798l lVar2, C1510r0 r0Var) {
            super(1);
            this.f23468a = eVar;
            this.f23469b = lVar;
            this.f23470c = lVar2;
            this.f23471d = r0Var;
        }

        /* renamed from: a */
        public final androidx.compose.animation.i invoke(androidx.compose.animation.d dVar) {
            j3.s e10 = ((j3.k) dVar.d()).e();
            C6496s.f(e10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
            C2153e.b bVar = (C2153e.b) e10;
            androidx.compose.animation.i iVar = null;
            if (((Boolean) this.f23468a.n().getValue()).booleanValue() || C2161m.c(this.f23471d)) {
                Iterator it = j3.s.f22957k.c(bVar).iterator();
                while (true) {
                    if (it.hasNext()) {
                        androidx.compose.animation.i s10 = C2161m.x((j3.s) it.next(), dVar);
                        if (s10 != null) {
                            iVar = s10;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (iVar == null) {
                    return (androidx.compose.animation.i) this.f23469b.invoke(dVar);
                }
                return iVar;
            }
            Iterator it2 = j3.s.f22957k.c(bVar).iterator();
            while (true) {
                if (it2.hasNext()) {
                    androidx.compose.animation.i q10 = C2161m.v((j3.s) it2.next(), dVar);
                    if (q10 != null) {
                        iVar = q10;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (iVar == null) {
                return (androidx.compose.animation.i) this.f23470c.invoke(dVar);
            }
            return iVar;
        }
    }

    /* renamed from: k3.m$s */
    static final class s extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2153e f23472a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f23473b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6798l f23474c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1510r0 f23475d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(C2153e eVar, C6798l lVar, C6798l lVar2, C1510r0 r0Var) {
            super(1);
            this.f23472a = eVar;
            this.f23473b = lVar;
            this.f23474c = lVar2;
            this.f23475d = r0Var;
        }

        /* renamed from: a */
        public final androidx.compose.animation.k invoke(androidx.compose.animation.d dVar) {
            j3.s e10 = ((j3.k) dVar.e()).e();
            C6496s.f(e10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
            C2153e.b bVar = (C2153e.b) e10;
            androidx.compose.animation.k kVar = null;
            if (((Boolean) this.f23472a.n().getValue()).booleanValue() || C2161m.c(this.f23475d)) {
                Iterator it = j3.s.f22957k.c(bVar).iterator();
                while (true) {
                    if (it.hasNext()) {
                        androidx.compose.animation.k t10 = C2161m.y((j3.s) it.next(), dVar);
                        if (t10 != null) {
                            kVar = t10;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (kVar == null) {
                    return (androidx.compose.animation.k) this.f23473b.invoke(dVar);
                }
                return kVar;
            }
            Iterator it2 = j3.s.f22957k.c(bVar).iterator();
            while (true) {
                if (it2.hasNext()) {
                    androidx.compose.animation.k r10 = C2161m.w((j3.s) it2.next(), dVar);
                    if (r10 != null) {
                        kVar = r10;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (kVar == null) {
                return (androidx.compose.animation.k) this.f23474c.invoke(dVar);
            }
            return kVar;
        }
    }

    /* renamed from: k3.m$t */
    static final class t extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f23476a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(C6798l lVar) {
            super(1);
            this.f23476a = lVar;
        }

        /* renamed from: a */
        public final C2738u invoke(androidx.compose.animation.d dVar) {
            C2738u uVar;
            j3.s e10 = ((j3.k) dVar.d()).e();
            C6496s.f(e10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
            Iterator it = j3.s.f22957k.c((C2153e.b) e10).iterator();
            while (true) {
                if (!it.hasNext()) {
                    uVar = null;
                    break;
                }
                uVar = C2161m.z((j3.s) it.next(), dVar);
                if (uVar != null) {
                    break;
                }
            }
            if (uVar != null) {
                return uVar;
            }
            C6798l lVar = this.f23476a;
            if (lVar != null) {
                return (C2738u) lVar.invoke(dVar);
            }
            return null;
        }
    }

    /* renamed from: k3.m$u */
    static final class u extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1 f23477a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(A1 a12) {
            super(0);
            this.f23477a = a12;
        }

        public final List invoke() {
            ArrayList arrayList = new ArrayList();
            for (Object next : C2161m.e(this.f23477a)) {
                if (C6496s.c(((j3.k) next).e().z(), "composable")) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: yf.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: yf.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: yf.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: k3.m$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v37, resolved type: k3.m$i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v38, resolved type: k3.m$l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v4, resolved type: k3.m$l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: k3.m$i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v5, resolved type: k3.m$d} */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r12v21 */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0266, code lost:
        if (r4 == r29.a()) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x03a9, code lost:
        if (r14 == r29.a()) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x047a, code lost:
        if (r12 == r29.a()) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04fb, code lost:
        if (r12 == r29.a()) goto L_0x04fd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(j3.x r35, j3.u r36, k0.i r37, k0.c r38, yf.C6798l r39, yf.C6798l r40, yf.C6798l r41, yf.C6798l r42, yf.C6798l r43, Y.C1500m r44, int r45, int r46) {
        /*
            r1 = r35
            r10 = r45
            r11 = r46
            r0 = -1964664536(0xffffffff8ae59928, float:-2.2109509E-32)
            r2 = r44
            Y.m r2 = r2.h(r0)
            r3 = r11 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r10 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r10 & 6
            if (r3 != 0) goto L_0x0025
            boolean r3 = r2.C(r1)
            if (r3 == 0) goto L_0x0022
            r3 = 4
            goto L_0x0023
        L_0x0022:
            r3 = 2
        L_0x0023:
            r3 = r3 | r10
            goto L_0x0026
        L_0x0025:
            r3 = r10
        L_0x0026:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x002f
            r3 = r3 | 48
        L_0x002c:
            r5 = r36
            goto L_0x0041
        L_0x002f:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x002c
            r5 = r36
            boolean r6 = r2.C(r5)
            if (r6 == 0) goto L_0x003e
            r6 = 32
            goto L_0x0040
        L_0x003e:
            r6 = 16
        L_0x0040:
            r3 = r3 | r6
        L_0x0041:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x004a
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r7 = r37
            goto L_0x005c
        L_0x004a:
            r7 = r10 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0047
            r7 = r37
            boolean r8 = r2.S(r7)
            if (r8 == 0) goto L_0x0059
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r3 = r3 | r8
        L_0x005c:
            r8 = r11 & 8
            if (r8 == 0) goto L_0x0065
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0062:
            r9 = r38
            goto L_0x0077
        L_0x0065:
            r9 = r10 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0062
            r9 = r38
            boolean r12 = r2.S(r9)
            if (r12 == 0) goto L_0x0074
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r3 = r3 | r12
        L_0x0077:
            r12 = r11 & 16
            if (r12 == 0) goto L_0x0080
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r14 = r39
            goto L_0x0092
        L_0x0080:
            r14 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x007d
            r14 = r39
            boolean r15 = r2.C(r14)
            if (r15 == 0) goto L_0x008f
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r3 = r3 | r15
        L_0x0092:
            r15 = r11 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r15 == 0) goto L_0x009d
            r3 = r3 | r16
            r13 = r40
            goto L_0x00b0
        L_0x009d:
            r16 = r10 & r16
            r13 = r40
            if (r16 != 0) goto L_0x00b0
            boolean r16 = r2.C(r13)
            if (r16 == 0) goto L_0x00ac
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r3 = r3 | r16
        L_0x00b0:
            r16 = 1572864(0x180000, float:2.204052E-39)
            r17 = r10 & r16
            if (r17 != 0) goto L_0x00ca
            r17 = r11 & 64
            r4 = r41
            if (r17 != 0) goto L_0x00c5
            boolean r19 = r2.C(r4)
            if (r19 == 0) goto L_0x00c5
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c7
        L_0x00c5:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00c7:
            r3 = r3 | r19
            goto L_0x00cc
        L_0x00ca:
            r4 = r41
        L_0x00cc:
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            r20 = r10 & r19
            if (r20 != 0) goto L_0x00e8
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00e1
            r0 = r42
            boolean r22 = r2.C(r0)
            if (r22 == 0) goto L_0x00e3
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e5
        L_0x00e1:
            r0 = r42
        L_0x00e3:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e5:
            r3 = r3 | r22
            goto L_0x00ea
        L_0x00e8:
            r0 = r42
        L_0x00ea:
            r0 = r11 & 256(0x100, float:3.59E-43)
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00f5
            r3 = r3 | r22
            r4 = r43
            goto L_0x0108
        L_0x00f5:
            r22 = r10 & r22
            r4 = r43
            if (r22 != 0) goto L_0x0108
            boolean r22 = r2.C(r4)
            if (r22 == 0) goto L_0x0104
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0106
        L_0x0104:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0106:
            r3 = r3 | r22
        L_0x0108:
            r22 = 38347923(0x2492493, float:1.4777644E-37)
            r4 = r3 & r22
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r4 != r5) goto L_0x0129
            boolean r4 = r2.i()
            if (r4 != 0) goto L_0x0119
            goto L_0x0129
        L_0x0119:
            r2.I()
            r8 = r42
            r11 = r1
            r3 = r7
            r4 = r9
            r6 = r13
            r5 = r14
            r7 = r41
            r9 = r43
            goto L_0x0582
        L_0x0129:
            r2.D()
            r4 = r10 & 1
            r5 = 0
            if (r4 == 0) goto L_0x0156
            boolean r4 = r2.L()
            if (r4 == 0) goto L_0x0138
            goto L_0x0156
        L_0x0138:
            r2.I()
            r0 = r11 & 64
            if (r0 == 0) goto L_0x0143
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r0
        L_0x0143:
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x014b
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r0
        L_0x014b:
            r15 = r42
            r4 = r7
            r6 = r9
            r8 = r13
            r7 = r14
            r9 = r41
            r14 = r43
            goto L_0x0198
        L_0x0156:
            if (r6 == 0) goto L_0x015b
            k0.i$a r4 = k0.i.f23074a
            goto L_0x015c
        L_0x015b:
            r4 = r7
        L_0x015c:
            if (r8 == 0) goto L_0x0165
            k0.c$a r6 = k0.c.f23044a
            k0.c r6 = r6.o()
            goto L_0x0166
        L_0x0165:
            r6 = r9
        L_0x0166:
            if (r12 == 0) goto L_0x016b
            k3.m$b r7 = k3.C2161m.b.f23379a
            goto L_0x016c
        L_0x016b:
            r7 = r14
        L_0x016c:
            if (r15 == 0) goto L_0x0171
            k3.m$c r8 = k3.C2161m.c.f23380a
            goto L_0x0172
        L_0x0171:
            r8 = r13
        L_0x0172:
            r9 = r11 & 64
            if (r9 == 0) goto L_0x017d
            r9 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r9
            r9 = r3
            r3 = r7
            goto L_0x0180
        L_0x017d:
            r9 = r3
            r3 = r41
        L_0x0180:
            r12 = r11 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x018b
            r12 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r9 = r9 & r12
            r12 = r9
            r9 = r8
            goto L_0x018e
        L_0x018b:
            r12 = r9
            r9 = r42
        L_0x018e:
            if (r0 == 0) goto L_0x0195
            r14 = r5
        L_0x0191:
            r15 = r9
            r9 = r3
            r3 = r12
            goto L_0x0198
        L_0x0195:
            r14 = r43
            goto L_0x0191
        L_0x0198:
            r2.v()
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x01aa
            r0 = -1
            java.lang.String r12 = "androidx.navigation.compose.NavHost (NavHost.kt:490)"
            r13 = -1964664536(0xffffffff8ae59928, float:-2.2109509E-32)
            Y.C1506p.Q(r13, r3, r0, r12)
        L_0x01aa:
            Y.I0 r0 = X1.a.a()
            java.lang.Object r0 = r2.m(r0)
            androidx.lifecycle.v r0 = (androidx.lifecycle.C1798v) r0
            a2.a r12 = a2.C1542a.f10582a
            int r13 = a2.C1542a.f10584c
            androidx.lifecycle.e0 r12 = r12.a(r2, r13)
            if (r12 == 0) goto L_0x059a
            androidx.lifecycle.d0 r12 = r12.getViewModelStore()
            r1.r0(r12)
            r35.o0(r36)
            j3.F r12 = r35.J()
            java.lang.String r13 = "composable"
            j3.E r12 = r12.e(r13)
            boolean r13 = r12 instanceof k3.C2153e
            if (r13 == 0) goto L_0x01da
            k3.e r12 = (k3.C2153e) r12
            r13 = r12
            goto L_0x01db
        L_0x01da:
            r13 = r5
        L_0x01db:
            if (r13 != 0) goto L_0x0205
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x01e6
            Y.C1506p.P()
        L_0x01e6:
            Y.Y0 r12 = r2.k()
            if (r12 == 0) goto L_0x0204
            k3.m$p r13 = new k3.m$p
            r0 = r13
            r1 = r35
            r2 = r36
            r3 = r4
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r15
            r9 = r14
            r10 = r45
            r11 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0204:
            return
        L_0x0205:
            Xg.L r12 = r13.m()
            r10 = 0
            r11 = 1
            Y.A1 r12 = Y.p1.b(r12, r5, r2, r10, r11)
            java.lang.Object r10 = r2.A()
            Y.m$a r29 = Y.C1500m.f10026a
            java.lang.Object r11 = r29.a()
            if (r10 != r11) goto L_0x0223
            r10 = 0
            Y.n0 r10 = Y.D0.a(r10)
            r2.r(r10)
        L_0x0223:
            Y.n0 r10 = (Y.C1503n0) r10
            java.lang.Object r11 = r2.A()
            java.lang.Object r5 = r29.a()
            if (r11 != r5) goto L_0x023d
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r30 = r6
            r6 = 0
            r11 = 2
            Y.r0 r11 = Y.u1.d(r5, r6, r11, r6)
            r2.r(r11)
            goto L_0x023f
        L_0x023d:
            r30 = r6
        L_0x023f:
            r5 = r11
            Y.r0 r5 = (Y.C1510r0) r5
            java.util.List r6 = g(r12)
            int r6 = r6.size()
            r11 = 1
            if (r6 <= r11) goto L_0x024f
            r6 = 1
            goto L_0x0250
        L_0x024f:
            r6 = 0
        L_0x0250:
            boolean r11 = r2.S(r12)
            boolean r18 = r2.S(r13)
            r11 = r11 | r18
            r31 = r4
            java.lang.Object r4 = r2.A()
            if (r11 != 0) goto L_0x0268
            java.lang.Object r11 = r29.a()
            if (r4 != r11) goto L_0x027d
        L_0x0268:
            k3.m$d r4 = new k3.m$d
            r11 = 0
            r37 = r4
            r38 = r13
            r39 = r12
            r40 = r10
            r41 = r5
            r42 = r11
            r37.<init>(r38, r39, r40, r41, r42)
            r2.r(r4)
        L_0x027d:
            yf.p r4 = (yf.p) r4
            r11 = 0
            e.C1938k.a(r6, r4, r2, r11, r11)
            boolean r4 = r2.C(r1)
            boolean r6 = r2.C(r0)
            r4 = r4 | r6
            java.lang.Object r6 = r2.A()
            if (r4 != 0) goto L_0x0298
            java.lang.Object r4 = r29.a()
            if (r6 != r4) goto L_0x02a0
        L_0x0298:
            k3.m$e r6 = new k3.m$e
            r6.<init>(r1, r0)
            r2.r(r6)
        L_0x02a0:
            yf.l r6 = (yf.C6798l) r6
            r4 = 0
            Y.P.c(r0, r6, r2, r4)
            h0.d r0 = h0.C2022f.a(r2, r4)
            Xg.L r6 = r35.M()
            r1 = 1
            r11 = 0
            Y.A1 r6 = Y.p1.b(r6, r11, r2, r4, r1)
            java.lang.Object r1 = r2.A()
            java.lang.Object r4 = r29.a()
            if (r1 != r4) goto L_0x02ca
            k3.m$u r1 = new k3.m$u
            r1.<init>(r6)
            Y.A1 r1 = Y.p1.e(r1)
            r2.r(r1)
        L_0x02ca:
            Y.A1 r1 = (Y.A1) r1
            java.util.List r4 = f(r1)
            java.lang.Object r4 = mf.C6565s.B0(r4)
            j3.k r4 = (j3.k) r4
            java.lang.Object r6 = r2.A()
            java.lang.Object r11 = r29.a()
            if (r6 != r11) goto L_0x02e8
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            r2.r(r6)
        L_0x02e8:
            java.util.Map r6 = (java.util.Map) r6
            r11 = 653365120(0x26f18f80, float:1.676163E-15)
            r2.T(r11)
            if (r4 == 0) goto L_0x051b
            boolean r11 = r2.S(r13)
            r18 = 3670016(0x380000, float:5.142788E-39)
            r18 = r3 & r18
            r40 = r0
            r0 = r18 ^ r16
            r32 = r6
            r6 = 1048576(0x100000, float:1.469368E-39)
            if (r0 <= r6) goto L_0x030a
            boolean r0 = r2.S(r9)
            if (r0 != 0) goto L_0x030e
        L_0x030a:
            r0 = r3 & r16
            if (r0 != r6) goto L_0x0310
        L_0x030e:
            r0 = 1
            goto L_0x0311
        L_0x0310:
            r0 = 0
        L_0x0311:
            r0 = r0 | r11
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r3
            r11 = 16384(0x4000, float:2.2959E-41)
            if (r6 != r11) goto L_0x031c
            r6 = 1
            goto L_0x031d
        L_0x031c:
            r6 = 0
        L_0x031d:
            r0 = r0 | r6
            java.lang.Object r6 = r2.A()
            if (r0 != 0) goto L_0x032a
            java.lang.Object r0 = r29.a()
            if (r6 != r0) goto L_0x0332
        L_0x032a:
            k3.m$r r6 = new k3.m$r
            r6.<init>(r13, r9, r7, r5)
            r2.r(r6)
        L_0x0332:
            r0 = r6
            yf.l r0 = (yf.C6798l) r0
            boolean r6 = r2.S(r13)
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            r11 = r11 & r3
            r11 = r11 ^ r19
            r44 = r9
            r9 = 8388608(0x800000, float:1.17549435E-38)
            if (r11 <= r9) goto L_0x034a
            boolean r11 = r2.S(r15)
            if (r11 != 0) goto L_0x034e
        L_0x034a:
            r11 = r3 & r19
            if (r11 != r9) goto L_0x0350
        L_0x034e:
            r9 = 1
            goto L_0x0351
        L_0x0350:
            r9 = 0
        L_0x0351:
            r6 = r6 | r9
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r3
            r11 = 131072(0x20000, float:1.83671E-40)
            if (r9 != r11) goto L_0x035b
            r9 = 1
            goto L_0x035c
        L_0x035b:
            r9 = 0
        L_0x035c:
            r6 = r6 | r9
            java.lang.Object r9 = r2.A()
            if (r6 != 0) goto L_0x0369
            java.lang.Object r6 = r29.a()
            if (r9 != r6) goto L_0x0371
        L_0x0369:
            k3.m$s r9 = new k3.m$s
            r9.<init>(r13, r15, r8, r5)
            r2.r(r9)
        L_0x0371:
            r6 = r9
            yf.l r6 = (yf.C6798l) r6
            r9 = 234881024(0xe000000, float:1.5777218E-30)
            r9 = r9 & r3
            r11 = 67108864(0x4000000, float:1.5046328E-36)
            if (r9 != r11) goto L_0x037d
            r9 = 1
            goto L_0x037e
        L_0x037d:
            r9 = 0
        L_0x037e:
            java.lang.Object r11 = r2.A()
            if (r9 != 0) goto L_0x038a
            java.lang.Object r9 = r29.a()
            if (r11 != r9) goto L_0x0392
        L_0x038a:
            k3.m$t r11 = new k3.m$t
            r11.<init>(r14)
            r2.r(r11)
        L_0x0392:
            r9 = r11
            yf.l r9 = (yf.C6798l) r9
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            boolean r16 = r2.S(r13)
            r17 = r14
            java.lang.Object r14 = r2.A()
            if (r16 != 0) goto L_0x03ac
            r16 = r15
            java.lang.Object r15 = r29.a()
            if (r14 != r15) goto L_0x03b6
            goto L_0x03ae
        L_0x03ac:
            r16 = r15
        L_0x03ae:
            k3.m$f r14 = new k3.m$f
            r14.<init>(r1, r13)
            r2.r(r14)
        L_0x03b6:
            yf.l r14 = (yf.C6798l) r14
            r15 = 6
            Y.P.c(r11, r14, r2, r15)
            java.lang.Object r11 = r2.A()
            java.lang.Object r14 = r29.a()
            if (r11 != r14) goto L_0x03ce
            w.c0 r11 = new w.c0
            r11.<init>(r4)
            r2.r(r11)
        L_0x03ce:
            w.c0 r11 = (w.C2787c0) r11
            int r14 = w.C2787c0.f27330s
            r14 = r14 | 48
            java.lang.String r15 = "entry"
            r33 = r8
            r8 = 0
            w.n0 r15 = w.o0.f(r11, r15, r2, r14, r8)
            boolean r8 = c(r5)
            if (r8 == 0) goto L_0x041f
            r8 = -1218260648(0xffffffffb762d158, float:-1.3519391E-5)
            r2.T(r8)
            float r8 = h(r10)
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            boolean r14 = r2.S(r12)
            boolean r18 = r2.C(r11)
            r14 = r14 | r18
            r34 = r7
            java.lang.Object r7 = r2.A()
            if (r14 != 0) goto L_0x0409
            java.lang.Object r14 = r29.a()
            if (r7 != r14) goto L_0x0412
        L_0x0409:
            k3.m$g r7 = new k3.m$g
            r14 = 0
            r7.<init>(r11, r12, r10, r14)
            r2.r(r7)
        L_0x0412:
            yf.p r7 = (yf.p) r7
            r10 = 0
            Y.P.g(r8, r7, r2, r10)
            r2.M()
            r8 = r32
            r7 = 0
            goto L_0x0458
        L_0x041f:
            r34 = r7
            r7 = -1218005611(0xffffffffb766b595, float:-1.3751346E-5)
            r2.T(r7)
            boolean r7 = r2.C(r11)
            boolean r8 = r2.C(r4)
            r7 = r7 | r8
            boolean r8 = r2.S(r15)
            r7 = r7 | r8
            java.lang.Object r8 = r2.A()
            if (r7 != 0) goto L_0x0444
            java.lang.Object r7 = r29.a()
            if (r8 != r7) goto L_0x0442
            goto L_0x0444
        L_0x0442:
            r7 = 0
            goto L_0x044d
        L_0x0444:
            k3.m$h r8 = new k3.m$h
            r7 = 0
            r8.<init>(r11, r4, r15, r7)
            r2.r(r8)
        L_0x044d:
            yf.p r8 = (yf.p) r8
            r10 = 0
            Y.P.g(r4, r8, r2, r10)
            r2.M()
            r8 = r32
        L_0x0458:
            boolean r10 = r2.C(r8)
            boolean r12 = r2.S(r13)
            r10 = r10 | r12
            boolean r12 = r2.S(r0)
            r10 = r10 | r12
            boolean r12 = r2.S(r6)
            r10 = r10 | r12
            boolean r12 = r2.S(r9)
            r10 = r10 | r12
            java.lang.Object r12 = r2.A()
            if (r10 != 0) goto L_0x047c
            java.lang.Object r10 = r29.a()
            if (r12 != r10) goto L_0x0494
        L_0x047c:
            k3.m$i r12 = new k3.m$i
            r21 = r12
            r22 = r8
            r23 = r13
            r24 = r0
            r25 = r6
            r26 = r9
            r27 = r1
            r28 = r5
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r2.r(r12)
        L_0x0494:
            r14 = r12
            yf.l r14 = (yf.C6798l) r14
            k3.m$j r0 = k3.C2161m.j.f23419a
            k3.m$k r6 = new k3.m$k
            r37 = r6
            r38 = r11
            r39 = r4
            r41 = r5
            r42 = r1
            r37.<init>(r38, r39, r40, r41, r42)
            r4 = 54
            r5 = 820763100(0x30ebd9dc, float:1.716042E-9)
            r9 = 1
            g0.a r4 = g0.c.e(r5, r9, r6, r2, r4)
            int r5 = r3 >> 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            r6 = 221184(0x36000, float:3.09945E-40)
            r5 = r5 | r6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r19 = r5 | r3
            r20 = 0
            r12 = r15
            r5 = r13
            r13 = r31
            r9 = r17
            r3 = r15
            r10 = r16
            r15 = r30
            r16 = r0
            r17 = r4
            r18 = r2
            androidx.compose.animation.a.a(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r0 = r3.i()
            java.lang.Object r4 = r3.p()
            boolean r6 = r2.S(r3)
            r11 = r35
            boolean r12 = r2.C(r11)
            r6 = r6 | r12
            boolean r12 = r2.S(r5)
            r6 = r6 | r12
            boolean r12 = r2.C(r8)
            r6 = r6 | r12
            java.lang.Object r12 = r2.A()
            if (r6 != 0) goto L_0x04fd
            java.lang.Object r6 = r29.a()
            if (r12 != r6) goto L_0x0514
        L_0x04fd:
            k3.m$l r12 = new k3.m$l
            r6 = 0
            r37 = r12
            r38 = r3
            r39 = r35
            r40 = r8
            r41 = r1
            r42 = r5
            r43 = r6
            r37.<init>(r38, r39, r40, r41, r42, r43)
            r2.r(r12)
        L_0x0514:
            yf.p r12 = (yf.p) r12
            r1 = 0
            Y.P.f(r0, r4, r12, r2, r1)
            goto L_0x0526
        L_0x051b:
            r11 = r35
            r34 = r7
            r33 = r8
            r44 = r9
            r9 = r14
            r10 = r15
            r7 = 0
        L_0x0526:
            r2.M()
            j3.F r0 = r35.J()
            java.lang.String r1 = "dialog"
            j3.E r0 = r0.e(r1)
            boolean r1 = r0 instanceof k3.C2157i
            if (r1 == 0) goto L_0x053b
            r5 = r0
            k3.i r5 = (k3.C2157i) r5
            goto L_0x053c
        L_0x053b:
            r5 = r7
        L_0x053c:
            if (r5 != 0) goto L_0x056a
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x0547
            Y.C1506p.P()
        L_0x0547:
            Y.Y0 r12 = r2.k()
            if (r12 == 0) goto L_0x0569
            k3.m$q r13 = new k3.m$q
            r0 = r13
            r1 = r35
            r2 = r36
            r3 = r31
            r4 = r30
            r5 = r34
            r6 = r33
            r7 = r44
            r8 = r10
            r10 = r45
            r11 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0569:
            return
        L_0x056a:
            r0 = 0
            k3.C2155g.a(r5, r2, r0)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x0577
            Y.C1506p.P()
        L_0x0577:
            r7 = r44
            r8 = r10
            r4 = r30
            r3 = r31
            r6 = r33
            r5 = r34
        L_0x0582:
            Y.Y0 r12 = r2.k()
            if (r12 == 0) goto L_0x0599
            k3.m$m r13 = new k3.m$m
            r0 = r13
            r1 = r35
            r2 = r36
            r10 = r45
            r11 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0599:
            return
        L_0x059a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.C2161m.a(j3.x, j3.u, k0.i, k0.c, yf.l, yf.l, yf.l, yf.l, yf.l, Y.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: j3.u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(j3.x r29, java.lang.String r30, k0.i r31, k0.c r32, java.lang.String r33, yf.C6798l r34, yf.C6798l r35, yf.C6798l r36, yf.C6798l r37, yf.C6798l r38, yf.C6798l r39, Y.C1500m r40, int r41, int r42, int r43) {
        /*
            r2 = r30
            r11 = r39
            r12 = r41
            r14 = r43
            r0 = 1840250294(0x6daffdb6, float:6.8083243E27)
            r1 = r40
            Y.m r1 = r1.h(r0)
            r3 = r14 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r12 | 6
            r6 = r3
            r3 = r29
            goto L_0x002f
        L_0x001b:
            r3 = r12 & 6
            if (r3 != 0) goto L_0x002c
            r3 = r29
            boolean r6 = r1.C(r3)
            if (r6 == 0) goto L_0x0029
            r6 = 4
            goto L_0x002a
        L_0x0029:
            r6 = 2
        L_0x002a:
            r6 = r6 | r12
            goto L_0x002f
        L_0x002c:
            r3 = r29
            r6 = r12
        L_0x002f:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x0036
            r6 = r6 | 48
            goto L_0x0046
        L_0x0036:
            r7 = r12 & 48
            if (r7 != 0) goto L_0x0046
            boolean r7 = r1.S(r2)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r6 = r6 | r7
        L_0x0046:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x004f
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r9 = r31
            goto L_0x0061
        L_0x004f:
            r9 = r12 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004c
            r9 = r31
            boolean r10 = r1.S(r9)
            if (r10 == 0) goto L_0x005e
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r6 = r6 | r10
        L_0x0061:
            r10 = r14 & 8
            if (r10 == 0) goto L_0x006a
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r13 = r32
            goto L_0x007c
        L_0x006a:
            r13 = r12 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x0067
            r13 = r32
            boolean r15 = r1.S(r13)
            if (r15 == 0) goto L_0x0079
            r15 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r15 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r6 = r6 | r15
        L_0x007c:
            r15 = r14 & 16
            if (r15 == 0) goto L_0x0085
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r8 = r33
            goto L_0x0098
        L_0x0085:
            r8 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0082
            r8 = r33
            boolean r17 = r1.S(r8)
            if (r17 == 0) goto L_0x0094
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r6 = r6 | r17
        L_0x0098:
            r17 = r14 & 32
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r17 == 0) goto L_0x00a3
            r6 = r6 | r18
            r5 = r34
            goto L_0x00b6
        L_0x00a3:
            r18 = r12 & r18
            r5 = r34
            if (r18 != 0) goto L_0x00b6
            boolean r19 = r1.C(r5)
            if (r19 == 0) goto L_0x00b2
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b2:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r6 = r6 | r19
        L_0x00b6:
            r19 = r14 & 64
            r20 = 1572864(0x180000, float:2.204052E-39)
            if (r19 == 0) goto L_0x00c1
            r6 = r6 | r20
            r0 = r35
            goto L_0x00d4
        L_0x00c1:
            r20 = r12 & r20
            r0 = r35
            if (r20 != 0) goto L_0x00d4
            boolean r21 = r1.C(r0)
            if (r21 == 0) goto L_0x00d0
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d2
        L_0x00d0:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00d2:
            r6 = r6 | r21
        L_0x00d4:
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            r21 = r12 & r21
            if (r21 != 0) goto L_0x00f0
            r4 = r14 & 128(0x80, float:1.794E-43)
            if (r4 != 0) goto L_0x00e9
            r4 = r36
            boolean r22 = r1.C(r4)
            if (r22 == 0) goto L_0x00eb
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00e9:
            r4 = r36
        L_0x00eb:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r6 = r6 | r22
            goto L_0x00f2
        L_0x00f0:
            r4 = r36
        L_0x00f2:
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            r22 = r12 & r22
            if (r22 != 0) goto L_0x010e
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0107
            r0 = r37
            boolean r22 = r1.C(r0)
            if (r22 == 0) goto L_0x0109
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0107:
            r0 = r37
        L_0x0109:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r6 = r6 | r22
            goto L_0x0110
        L_0x010e:
            r0 = r37
        L_0x0110:
            r0 = r14 & 512(0x200, float:7.175E-43)
            r22 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x011b
            r6 = r6 | r22
            r3 = r38
            goto L_0x012e
        L_0x011b:
            r22 = r12 & r22
            r3 = r38
            if (r22 != 0) goto L_0x012e
            boolean r22 = r1.C(r3)
            if (r22 == 0) goto L_0x012a
            r22 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012c
        L_0x012a:
            r22 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012c:
            r6 = r6 | r22
        L_0x012e:
            r3 = r14 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0135
            r3 = r42 | 6
            goto L_0x0147
        L_0x0135:
            r3 = r42 & 6
            if (r3 != 0) goto L_0x0145
            boolean r3 = r1.C(r11)
            if (r3 == 0) goto L_0x0141
            r3 = 4
            goto L_0x0142
        L_0x0141:
            r3 = 2
        L_0x0142:
            r3 = r42 | r3
            goto L_0x0147
        L_0x0145:
            r3 = r42
        L_0x0147:
            r22 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r6 & r22
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r5) goto L_0x016f
            r4 = r3 & 3
            r5 = 2
            if (r4 != r5) goto L_0x016f
            boolean r4 = r1.i()
            if (r4 != 0) goto L_0x015d
            goto L_0x016f
        L_0x015d:
            r1.I()
            r6 = r34
            r7 = r35
            r10 = r38
            r5 = r8
            r3 = r9
            r4 = r13
            r8 = r36
            r9 = r37
            goto L_0x027b
        L_0x016f:
            r1.D()
            r4 = r12 & 1
            r5 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r21 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r4 == 0) goto L_0x019f
            boolean r4 = r1.L()
            if (r4 == 0) goto L_0x0183
            goto L_0x019f
        L_0x0183:
            r1.I()
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x018c
            r6 = r6 & r21
        L_0x018c:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0191
            r6 = r6 & r5
        L_0x0191:
            r10 = r35
            r5 = r37
            r0 = r38
            r4 = r9
            r7 = r13
            r9 = r34
            r13 = r6
            r6 = r36
            goto L_0x01dc
        L_0x019f:
            if (r7 == 0) goto L_0x01a4
            k0.i$a r4 = k0.i.f23074a
            goto L_0x01a5
        L_0x01a4:
            r4 = r9
        L_0x01a5:
            if (r10 == 0) goto L_0x01ae
            k0.c$a r7 = k0.c.f23044a
            k0.c r7 = r7.o()
            goto L_0x01af
        L_0x01ae:
            r7 = r13
        L_0x01af:
            if (r15 == 0) goto L_0x01b2
            r8 = 0
        L_0x01b2:
            if (r17 == 0) goto L_0x01b7
            k3.m$n r9 = k3.C2161m.n.f23444a
            goto L_0x01b9
        L_0x01b7:
            r9 = r34
        L_0x01b9:
            if (r19 == 0) goto L_0x01be
            k3.m$o r10 = k3.C2161m.o.f23445a
            goto L_0x01c0
        L_0x01be:
            r10 = r35
        L_0x01c0:
            r13 = r14 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x01c9
            r6 = r6 & r21
            r13 = r6
            r6 = r9
            goto L_0x01cc
        L_0x01c9:
            r13 = r6
            r6 = r36
        L_0x01cc:
            r15 = r14 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L_0x01d4
            r5 = r5 & r13
            r13 = r5
            r5 = r10
            goto L_0x01d6
        L_0x01d4:
            r5 = r37
        L_0x01d6:
            if (r0 == 0) goto L_0x01da
            r0 = 0
            goto L_0x01dc
        L_0x01da:
            r0 = r38
        L_0x01dc:
            r1.v()
            boolean r15 = Y.C1506p.H()
            if (r15 == 0) goto L_0x01ed
            java.lang.String r15 = "androidx.navigation.compose.NavHost (NavHost.kt:210)"
            r12 = 1840250294(0x6daffdb6, float:6.8083243E27)
            Y.C1506p.Q(r12, r13, r3, r15)
        L_0x01ed:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r13
            r17 = 1
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r12 != r15) goto L_0x01fa
            r12 = r17
            goto L_0x01fb
        L_0x01fa:
            r12 = 0
        L_0x01fb:
            r15 = r13 & 112(0x70, float:1.57E-43)
            r14 = 32
            if (r15 != r14) goto L_0x0204
            r14 = r17
            goto L_0x0205
        L_0x0204:
            r14 = 0
        L_0x0205:
            r12 = r12 | r14
            r3 = r3 & 14
            r14 = 4
            if (r3 != r14) goto L_0x020e
            r15 = r17
            goto L_0x020f
        L_0x020e:
            r15 = 0
        L_0x020f:
            r3 = r12 | r15
            java.lang.Object r12 = r1.A()
            if (r3 != 0) goto L_0x021f
            Y.m$a r3 = Y.C1500m.f10026a
            java.lang.Object r3 = r3.a()
            if (r12 != r3) goto L_0x0232
        L_0x021f:
            j3.F r3 = r29.J()
            j3.v r12 = new j3.v
            r12.<init>(r3, r2, r8)
            r11.invoke(r12)
            j3.u r12 = r12.b()
            r1.r(r12)
        L_0x0232:
            r16 = r12
            j3.u r16 = (j3.u) r16
            r3 = r13 & 8078(0x1f8e, float:1.132E-41)
            int r12 = r13 >> 3
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r12
            r3 = r3 | r13
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r12
            r3 = r3 | r13
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r12
            r3 = r3 | r13
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r13 = r13 & r12
            r3 = r3 | r13
            r13 = 234881024(0xe000000, float:1.5777218E-30)
            r12 = r12 & r13
            r25 = r3 | r12
            r26 = 0
            r15 = r29
            r17 = r4
            r18 = r7
            r19 = r9
            r20 = r10
            r21 = r6
            r22 = r5
            r23 = r0
            r24 = r1
            a(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r3 = Y.C1506p.H()
            if (r3 == 0) goto L_0x0270
            Y.C1506p.P()
        L_0x0270:
            r3 = r4
            r4 = r7
            r7 = r10
            r10 = r0
            r28 = r9
            r9 = r5
            r5 = r8
            r8 = r6
            r6 = r28
        L_0x027b:
            Y.Y0 r15 = r1.k()
            if (r15 == 0) goto L_0x029a
            k3.m$a r14 = new k3.m$a
            r0 = r14
            r1 = r29
            r2 = r30
            r11 = r39
            r12 = r41
            r13 = r42
            r27 = r14
            r14 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r27
            r15.a(r0)
        L_0x029a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.C2161m.b(j3.x, java.lang.String, k0.i, k0.c, java.lang.String, yf.l, yf.l, yf.l, yf.l, yf.l, yf.l, Y.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final boolean c(C1510r0 r0Var) {
        return ((Boolean) r0Var.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void d(C1510r0 r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final List e(A1 a12) {
        return (List) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final List f(A1 a12) {
        return (List) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final List g(A1 a12) {
        return (List) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final float h(C1503n0 n0Var) {
        return n0Var.c();
    }

    /* access modifiers changed from: private */
    public static final void i(C1503n0 n0Var, float f10) {
        n0Var.l(f10);
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.i v(j3.s sVar, androidx.compose.animation.d dVar) {
        C6798l y02;
        if (sVar instanceof C2153e.b) {
            C6798l a02 = ((C2153e.b) sVar).a0();
            if (a02 != null) {
                return (androidx.compose.animation.i) a02.invoke(dVar);
            }
            return null;
        } else if (!(sVar instanceof C2152d.a) || (y02 = ((C2152d.a) sVar).y0()) == null) {
            return null;
        } else {
            return (androidx.compose.animation.i) y02.invoke(dVar);
        }
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.k w(j3.s sVar, androidx.compose.animation.d dVar) {
        C6798l z02;
        if (sVar instanceof C2153e.b) {
            C6798l c02 = ((C2153e.b) sVar).c0();
            if (c02 != null) {
                return (androidx.compose.animation.k) c02.invoke(dVar);
            }
            return null;
        } else if (!(sVar instanceof C2152d.a) || (z02 = ((C2152d.a) sVar).z0()) == null) {
            return null;
        } else {
            return (androidx.compose.animation.k) z02.invoke(dVar);
        }
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.i x(j3.s sVar, androidx.compose.animation.d dVar) {
        C6798l A02;
        if (sVar instanceof C2153e.b) {
            C6798l f02 = ((C2153e.b) sVar).f0();
            if (f02 != null) {
                return (androidx.compose.animation.i) f02.invoke(dVar);
            }
            return null;
        } else if (!(sVar instanceof C2152d.a) || (A02 = ((C2152d.a) sVar).A0()) == null) {
            return null;
        } else {
            return (androidx.compose.animation.i) A02.invoke(dVar);
        }
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.k y(j3.s sVar, androidx.compose.animation.d dVar) {
        C6798l B02;
        if (sVar instanceof C2153e.b) {
            C6798l g02 = ((C2153e.b) sVar).g0();
            if (g02 != null) {
                return (androidx.compose.animation.k) g02.invoke(dVar);
            }
            return null;
        } else if (!(sVar instanceof C2152d.a) || (B02 = ((C2152d.a) sVar).B0()) == null) {
            return null;
        } else {
            return (androidx.compose.animation.k) B02.invoke(dVar);
        }
    }

    /* access modifiers changed from: private */
    public static final C2738u z(j3.s sVar, androidx.compose.animation.d dVar) {
        C6798l C02;
        if (sVar instanceof C2153e.b) {
            C6798l h02 = ((C2153e.b) sVar).h0();
            if (h02 != null) {
                return (C2738u) h02.invoke(dVar);
            }
            return null;
        } else if (!(sVar instanceof C2152d.a) || (C02 = ((C2152d.a) sVar).C0()) == null) {
            return null;
        } else {
            return (C2738u) C02.invoke(dVar);
        }
    }

    /* renamed from: k3.m$e */
    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f23390a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1798v f23391b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(x xVar, C1798v vVar) {
            super(1);
            this.f23390a = xVar;
            this.f23391b = vVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f23390a.q0(this.f23391b);
            return new a();
        }

        /* renamed from: k3.m$e$a */
        public static final class a implements L {
            public void dispose() {
            }
        }
    }
}
