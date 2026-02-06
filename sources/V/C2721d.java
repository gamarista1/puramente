package v;

import C.C1092j;
import H0.E;
import H0.G;
import H0.H;
import H0.U;
import Xg.C5694f;
import Xg.C5695g;
import Y.A1;
import Y.C1500m;
import Y.C1506p;
import Y.C1510r0;
import Y.G0;
import Y.M0;
import Y.Y0;
import Y.o1;
import Y.p1;
import c1.r;
import c1.s;
import java.util.Map;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import w.C2777V;
import w.n0;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

/* renamed from: v.d  reason: case insensitive filesystem */
public abstract class C2721d {

    /* renamed from: v.d$a */
    static final class a extends C6498u implements q {

        /* renamed from: v.d$a$a  reason: collision with other inner class name */
        static final class C0445a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ U f26795a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0445a(U u10) {
                super(1);
                this.f26795a = u10;
            }

            public final void a(U.a aVar) {
                U.a.h(aVar, this.f26795a, 0, 0, 0.0f, 4, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((U.a) obj);
                return C6514M.f71813a;
            }
        }

        a(C2735r rVar) {
            super(3);
        }

        public final G a(H h10, E e10, long j10) {
            U v02 = e10.v0(j10);
            if (!h10.r0()) {
                return H.N(h10, v02.X0(), v02.R0(), (Map) null, new C0445a(v02), 4, (Object) null);
            }
            s.a(v02.X0(), v02.R0());
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((H) obj, (E) obj2, ((c1.b) obj3).r());
        }
    }

    /* renamed from: v.d$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n0 f26796a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f26797b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k0.i f26798c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f26799d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f26800e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p f26801f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ q f26802g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f26803h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f26804i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(n0 n0Var, C6798l lVar, k0.i iVar, androidx.compose.animation.i iVar2, androidx.compose.animation.k kVar, p pVar, C2735r rVar, q qVar, int i10, int i11) {
            super(2);
            this.f26796a = n0Var;
            this.f26797b = lVar;
            this.f26798c = iVar;
            this.f26799d = iVar2;
            this.f26800e = kVar;
            this.f26801f = pVar;
            this.f26802g = qVar;
            this.f26803h = i10;
            this.f26804i = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C2721d.a(this.f26796a, this.f26797b, this.f26798c, this.f26799d, this.f26800e, this.f26801f, (C2735r) null, this.f26802g, mVar, M0.a(this.f26803h | 1), this.f26804i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: v.d$c */
    static final class c extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f26805a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f26806b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n0 f26807c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A1 f26808d;

        /* renamed from: v.d$c$a */
        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ n0 f26809a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(n0 n0Var) {
                super(0);
                this.f26809a = n0Var;
            }

            /* renamed from: a */
            public final Boolean invoke() {
                return Boolean.valueOf(C2721d.k(this.f26809a));
            }
        }

        /* renamed from: v.d$c$b */
        static final class b implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ G0 f26810a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ n0 f26811b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ A1 f26812c;

            b(G0 g02, n0 n0Var, A1 a12) {
                this.f26810a = g02;
                this.f26811b = n0Var;
                this.f26812c = a12;
            }

            public final Object a(boolean z10, C6658d dVar) {
                boolean z11;
                G0 g02 = this.f26810a;
                if (z10) {
                    z11 = ((Boolean) C2721d.b(this.f26812c).invoke(this.f26811b.i(), this.f26811b.p())).booleanValue();
                } else {
                    z11 = false;
                }
                g02.setValue(kotlin.coroutines.jvm.internal.b.a(z11));
                return C6514M.f71813a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C6658d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(n0 n0Var, A1 a12, C6658d dVar) {
            super(2, dVar);
            this.f26807c = n0Var;
            this.f26808d = a12;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            c cVar = new c(this.f26807c, this.f26808d, dVar);
            cVar.f26806b = obj;
            return cVar;
        }

        public final Object invoke(G0 g02, C6658d dVar) {
            return ((c) create(g02, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f26805a;
            if (i10 == 0) {
                w.b(obj);
                C5694f p10 = p1.p(new a(this.f26807c));
                b bVar = new b((G0) this.f26806b, this.f26807c, this.f26808d);
                this.f26805a = 1;
                if (p10.collect(bVar, this) == f10) {
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

    /* renamed from: v.d$d  reason: collision with other inner class name */
    static final class C0446d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final C0446d f26813a = new C0446d();

        C0446d() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: v.d$e */
    static final class e extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1092j f26814a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2777V f26815b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k0.i f26816c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f26817d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f26818e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f26819f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ q f26820g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f26821h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f26822i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C1092j jVar, C2777V v10, k0.i iVar, androidx.compose.animation.i iVar2, androidx.compose.animation.k kVar, String str, q qVar, int i10, int i11) {
            super(2);
            this.f26814a = jVar;
            this.f26815b = v10;
            this.f26816c = iVar;
            this.f26817d = iVar2;
            this.f26818e = kVar;
            this.f26819f = str;
            this.f26820g = qVar;
            this.f26821h = i10;
            this.f26822i = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C2721d.d(this.f26814a, this.f26815b, this.f26816c, this.f26817d, this.f26818e, this.f26819f, this.f26820g, mVar, M0.a(this.f26821h | 1), this.f26822i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: v.d$f */
    static final class f extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final f f26823a = new f();

        f() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: v.d$g */
    static final class g extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f26824a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0.i f26825b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f26826c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f26827d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f26828e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ q f26829f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f26830g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f26831h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(boolean z10, k0.i iVar, androidx.compose.animation.i iVar2, androidx.compose.animation.k kVar, String str, q qVar, int i10, int i11) {
            super(2);
            this.f26824a = z10;
            this.f26825b = iVar;
            this.f26826c = iVar2;
            this.f26827d = kVar;
            this.f26828e = str;
            this.f26829f = qVar;
            this.f26830g = i10;
            this.f26831h = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C2721d.g(this.f26824a, this.f26825b, this.f26826c, this.f26827d, this.f26828e, this.f26829f, mVar, M0.a(this.f26830g | 1), this.f26831h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: v.d$h */
    static final class h extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final h f26832a = new h();

        h() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: v.d$i */
    static final class i extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1092j f26833a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f26834b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k0.i f26835c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f26836d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f26837e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f26838f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ q f26839g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f26840h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f26841i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C1092j jVar, boolean z10, k0.i iVar, androidx.compose.animation.i iVar2, androidx.compose.animation.k kVar, String str, q qVar, int i10, int i11) {
            super(2);
            this.f26833a = jVar;
            this.f26834b = z10;
            this.f26835c = iVar;
            this.f26836d = iVar2;
            this.f26837e = kVar;
            this.f26838f = str;
            this.f26839g = qVar;
            this.f26840h = i10;
            this.f26841i = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C2721d.e(this.f26833a, this.f26834b, this.f26835c, this.f26836d, this.f26837e, this.f26838f, this.f26839g, mVar, M0.a(this.f26840h | 1), this.f26841i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: v.d$j */
    static final class j extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final j f26842a = new j();

        j() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: v.d$k */
    static final class k extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2777V f26843a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0.i f26844b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f26845c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f26846d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f26847e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ q f26848f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f26849g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f26850h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C2777V v10, k0.i iVar, androidx.compose.animation.i iVar2, androidx.compose.animation.k kVar, String str, q qVar, int i10, int i11) {
            super(2);
            this.f26843a = v10;
            this.f26844b = iVar;
            this.f26845c = iVar2;
            this.f26846d = kVar;
            this.f26847e = str;
            this.f26848f = qVar;
            this.f26849g = i10;
            this.f26850h = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C2721d.f(this.f26843a, this.f26844b, this.f26845c, this.f26846d, this.f26847e, this.f26848f, mVar, M0.a(this.f26849g | 1), this.f26850h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: v.d$l */
    static final class l extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f26851a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f26852b;

        /* renamed from: v.d$l$a */
        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ U f26853a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(U u10) {
                super(1);
                this.f26853a = u10;
            }

            public final void a(U.a aVar) {
                U.a.h(aVar, this.f26853a, 0, 0, 0.0f, 4, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((U.a) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(C6798l lVar, n0 n0Var) {
            super(3);
            this.f26851a = lVar;
            this.f26852b = n0Var;
        }

        public final G a(H h10, E e10, long j10) {
            long j11;
            U v02 = e10.v0(j10);
            if (!h10.r0() || ((Boolean) this.f26851a.invoke(this.f26852b.p())).booleanValue()) {
                j11 = s.a(v02.X0(), v02.R0());
            } else {
                j11 = r.f19235b.a();
            }
            return H.N(h10, r.g(j11), r.f(j11), (Map) null, new a(v02), 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((H) obj, (E) obj2, ((c1.b) obj3).r());
        }
    }

    /* renamed from: v.d$m */
    static final class m extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final m f26854a = new m();

        m() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(C2727j jVar, C2727j jVar2) {
            boolean z10;
            if (jVar == jVar2 && jVar2 == C2727j.PostExit) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* renamed from: v.d$n */
    static final class n extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n0 f26855a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f26856b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k0.i f26857c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f26858d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f26859e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ q f26860f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f26861g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(n0 n0Var, C6798l lVar, k0.i iVar, androidx.compose.animation.i iVar2, androidx.compose.animation.k kVar, q qVar, int i10) {
            super(2);
            this.f26855a = n0Var;
            this.f26856b = lVar;
            this.f26857c = iVar;
            this.f26858d = iVar2;
            this.f26859e = kVar;
            this.f26860f = qVar;
            this.f26861g = i10;
        }

        public final void a(C1500m mVar, int i10) {
            C2721d.h(this.f26855a, this.f26856b, this.f26857c, this.f26858d, this.f26859e, this.f26860f, mVar, M0.a(this.f26861g | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:192:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(w.n0 r24, yf.C6798l r25, k0.i r26, androidx.compose.animation.i r27, androidx.compose.animation.k r28, yf.p r29, v.C2735r r30, yf.q r31, Y.C1500m r32, int r33, int r34) {
        /*
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r29
            r0 = r30
            r10 = r31
            r11 = r33
            r12 = r34
            r1 = -891967166(0xffffffffcad5a942, float:-7001249.0)
            r2 = r32
            Y.m r15 = r2.h(r1)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0020
            r2 = r11 | 6
            goto L_0x0030
        L_0x0020:
            r2 = r11 & 6
            if (r2 != 0) goto L_0x002f
            boolean r2 = r15.S(r6)
            if (r2 == 0) goto L_0x002c
            r2 = 4
            goto L_0x002d
        L_0x002c:
            r2 = 2
        L_0x002d:
            r2 = r2 | r11
            goto L_0x0030
        L_0x002f:
            r2 = r11
        L_0x0030:
            r3 = r12 & 2
            if (r3 == 0) goto L_0x0037
            r2 = r2 | 48
            goto L_0x0047
        L_0x0037:
            r3 = r11 & 48
            if (r3 != 0) goto L_0x0047
            boolean r3 = r15.C(r7)
            if (r3 == 0) goto L_0x0044
            r3 = 32
            goto L_0x0046
        L_0x0044:
            r3 = 16
        L_0x0046:
            r2 = r2 | r3
        L_0x0047:
            r3 = r12 & 4
            if (r3 == 0) goto L_0x004e
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x005e
        L_0x004e:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x005e
            boolean r3 = r15.S(r8)
            if (r3 == 0) goto L_0x005b
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r3 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r2 = r2 | r3
        L_0x005e:
            r3 = r12 & 8
            if (r3 == 0) goto L_0x0067
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r14 = r27
            goto L_0x0079
        L_0x0067:
            r3 = r11 & 3072(0xc00, float:4.305E-42)
            r14 = r27
            if (r3 != 0) goto L_0x0079
            boolean r3 = r15.S(r14)
            if (r3 == 0) goto L_0x0076
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r2 = r2 | r3
        L_0x0079:
            r3 = r12 & 16
            if (r3 == 0) goto L_0x0082
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            r5 = r28
            goto L_0x0094
        L_0x0082:
            r3 = r11 & 24576(0x6000, float:3.4438E-41)
            r5 = r28
            if (r3 != 0) goto L_0x0094
            boolean r3 = r15.S(r5)
            if (r3 == 0) goto L_0x0091
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r2 = r2 | r3
        L_0x0094:
            r3 = r12 & 32
            r4 = 196608(0x30000, float:2.75506E-40)
            if (r3 == 0) goto L_0x009c
            r2 = r2 | r4
            goto L_0x00ac
        L_0x009c:
            r3 = r11 & r4
            if (r3 != 0) goto L_0x00ac
            boolean r3 = r15.C(r9)
            if (r3 == 0) goto L_0x00a9
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ab
        L_0x00a9:
            r3 = 65536(0x10000, float:9.18355E-41)
        L_0x00ab:
            r2 = r2 | r3
        L_0x00ac:
            r3 = r12 & 64
            r21 = 2097152(0x200000, float:2.938736E-39)
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r3 == 0) goto L_0x00b7
        L_0x00b4:
            r2 = r2 | r16
            goto L_0x00d0
        L_0x00b7:
            r16 = r11 & r16
            if (r16 != 0) goto L_0x00d0
            r16 = r11 & r21
            if (r16 != 0) goto L_0x00c4
            boolean r16 = r15.S(r0)
            goto L_0x00c8
        L_0x00c4:
            boolean r16 = r15.C(r0)
        L_0x00c8:
            if (r16 == 0) goto L_0x00cd
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b4
        L_0x00cd:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00b4
        L_0x00d0:
            r4 = r12 & 128(0x80, float:1.794E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r4 == 0) goto L_0x00da
            r2 = r2 | r16
        L_0x00d8:
            r4 = r2
            goto L_0x00eb
        L_0x00da:
            r4 = r11 & r16
            if (r4 != 0) goto L_0x00d8
            boolean r4 = r15.C(r10)
            if (r4 == 0) goto L_0x00e7
            r4 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e9
        L_0x00e7:
            r4 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e9:
            r2 = r2 | r4
            goto L_0x00d8
        L_0x00eb:
            r2 = 4793491(0x492493, float:6.717112E-39)
            r2 = r2 & r4
            r13 = 4793490(0x492492, float:6.71711E-39)
            if (r2 != r13) goto L_0x0102
            boolean r2 = r15.i()
            if (r2 != 0) goto L_0x00fb
            goto L_0x0102
        L_0x00fb:
            r15.I()
            r11 = r0
            r0 = r15
            goto L_0x0380
        L_0x0102:
            if (r3 == 0) goto L_0x0106
            r3 = 0
            goto L_0x0107
        L_0x0106:
            r3 = r0
        L_0x0107:
            boolean r0 = Y.C1506p.H()
            r2 = -1
            if (r0 == 0) goto L_0x0113
            java.lang.String r0 = "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:737)"
            Y.C1506p.Q(r1, r4, r2, r0)
        L_0x0113:
            java.lang.Object r0 = r24.p()
            java.lang.Object r0 = r7.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x014d
            java.lang.Object r0 = r24.i()
            java.lang.Object r0 = r7.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x014d
            boolean r0 = r24.u()
            if (r0 != 0) goto L_0x014d
            boolean r0 = r24.j()
            if (r0 == 0) goto L_0x0140
            goto L_0x014d
        L_0x0140:
            r0 = 1790262234(0x6ab53bda, float:1.0954911E26)
            r15.T(r0)
            r15.M()
            r2 = r3
            r0 = r15
            goto L_0x0376
        L_0x014d:
            r0 = 1787977937(0x6a9260d1, float:8.848019E25)
            r15.T(r0)
            r1 = r4 & 14
            r0 = r1 | 48
            r13 = r0 & 14
            r2 = r13 ^ 6
            r22 = 1
            r11 = 4
            if (r2 <= r11) goto L_0x0166
            boolean r2 = r15.S(r6)
            if (r2 != 0) goto L_0x016a
        L_0x0166:
            r0 = r0 & 6
            if (r0 != r11) goto L_0x016d
        L_0x016a:
            r0 = r22
            goto L_0x016e
        L_0x016d:
            r0 = 0
        L_0x016e:
            java.lang.Object r2 = r15.A()
            if (r0 != 0) goto L_0x017c
            Y.m$a r0 = Y.C1500m.f10026a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x0183
        L_0x017c:
            java.lang.Object r2 = r24.i()
            r15.r(r2)
        L_0x0183:
            boolean r0 = r24.u()
            if (r0 == 0) goto L_0x018d
            java.lang.Object r2 = r24.i()
        L_0x018d:
            r0 = -466616829(0xffffffffe42ffe03, float:-1.2985935E22)
            r15.T(r0)
            boolean r11 = Y.C1506p.H()
            if (r11 == 0) goto L_0x01a5
            java.lang.String r11 = "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)"
            r18 = r1
            r19 = r3
            r1 = -1
            r3 = 0
            Y.C1506p.Q(r0, r3, r1, r11)
            goto L_0x01a9
        L_0x01a5:
            r18 = r1
            r19 = r3
        L_0x01a9:
            r1 = r4 & 126(0x7e, float:1.77E-43)
            v.j r2 = l(r6, r7, r2, r15, r1)
            boolean r3 = Y.C1506p.H()
            if (r3 == 0) goto L_0x01b8
            Y.C1506p.P()
        L_0x01b8:
            r15.M()
            java.lang.Object r3 = r24.p()
            r15.T(r0)
            boolean r11 = Y.C1506p.H()
            if (r11 == 0) goto L_0x01d2
            java.lang.String r11 = "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)"
            r20 = r4
            r4 = -1
            r5 = 0
            Y.C1506p.Q(r0, r5, r4, r11)
            goto L_0x01d4
        L_0x01d2:
            r20 = r4
        L_0x01d4:
            v.j r3 = l(r6, r7, r3, r15, r1)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x01e1
            Y.C1506p.P()
        L_0x01e1:
            r15.M()
            r5 = r13 | 3072(0xc00, float:4.305E-42)
            java.lang.String r4 = "EnterExitTransition"
            r0 = r24
            r11 = r18
            r1 = r2
            r2 = r3
            r13 = r19
            r3 = r4
            r23 = r20
            r6 = 1048576(0x100000, float:1.469368E-39)
            r4 = r15
            w.n0 r0 = w.o0.b(r0, r1, r2, r3, r4, r5)
            int r1 = r23 >> 15
            r1 = r1 & 14
            Y.A1 r1 = Y.p1.o(r9, r15, r1)
            java.lang.Object r2 = r0.i()
            java.lang.Object r3 = r0.p()
            java.lang.Object r2 = r9.invoke(r2, r3)
            boolean r3 = r15.S(r0)
            boolean r4 = r15.S(r1)
            r3 = r3 | r4
            java.lang.Object r4 = r15.A()
            if (r3 != 0) goto L_0x0225
            Y.m$a r3 = Y.C1500m.f10026a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x022e
        L_0x0225:
            v.d$c r4 = new v.d$c
            r3 = 0
            r4.<init>(r0, r1, r3)
            r15.r(r4)
        L_0x022e:
            yf.p r4 = (yf.p) r4
            r1 = 0
            Y.A1 r2 = Y.p1.m(r2, r4, r15, r1)
            boolean r1 = k(r0)
            if (r1 == 0) goto L_0x024f
            boolean r1 = c(r2)
            if (r1 != 0) goto L_0x0242
            goto L_0x024f
        L_0x0242:
            r0 = 1790256282(0x6ab5249a, float:1.0949421E26)
            r15.T(r0)
            r15.M()
            r2 = r13
            r0 = r15
            goto L_0x0373
        L_0x024f:
            r1 = 1788869559(0x6a9ffbb7, float:9.670395E25)
            r15.T(r1)
            r1 = 4
            if (r11 != r1) goto L_0x025b
            r3 = r22
            goto L_0x025c
        L_0x025b:
            r3 = 0
        L_0x025c:
            java.lang.Object r1 = r15.A()
            if (r3 != 0) goto L_0x026a
            Y.m$a r2 = Y.C1500m.f10026a
            java.lang.Object r2 = r2.a()
            if (r1 != r2) goto L_0x0272
        L_0x026a:
            v.f r1 = new v.f
            r1.<init>(r0)
            r15.r(r1)
        L_0x0272:
            v.f r1 = (v.C2723f) r1
            int r2 = r23 >> 6
            r3 = r2 & 112(0x70, float:1.57E-43)
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r2 = r2 & 896(0x380, float:1.256E-42)
            r19 = r3 | r2
            r20 = 4
            r16 = 0
            java.lang.String r17 = "Built-in"
            r2 = r13
            r13 = r0
            r14 = r27
            r0 = r15
            r15 = r28
            r18 = r0
            k0.i r3 = androidx.compose.animation.g.g(r13, r14, r15, r16, r17, r18, r19, r20)
            if (r2 == 0) goto L_0x02ce
            r4 = 1789227361(0x6aa57161, float:1.0000409E26)
            r0.T(r4)
            k0.i$a r4 = k0.i.f23074a
            r5 = 3670016(0x380000, float:5.142788E-39)
            r5 = r23 & r5
            if (r5 == r6) goto L_0x02ae
            r5 = r23 & r21
            if (r5 == 0) goto L_0x02ac
            boolean r5 = r0.C(r2)
            if (r5 == 0) goto L_0x02ac
            goto L_0x02ae
        L_0x02ac:
            r22 = 0
        L_0x02ae:
            java.lang.Object r5 = r0.A()
            if (r22 != 0) goto L_0x02bc
            Y.m$a r6 = Y.C1500m.f10026a
            java.lang.Object r6 = r6.a()
            if (r5 != r6) goto L_0x02c4
        L_0x02bc:
            v.d$a r5 = new v.d$a
            r5.<init>(r2)
            r0.r(r5)
        L_0x02c4:
            yf.q r5 = (yf.q) r5
            k0.i r4 = androidx.compose.ui.layout.b.a(r4, r5)
            r0.M()
            goto L_0x02d9
        L_0x02ce:
            r4 = 1581766416(0x5e47d710, float:3.59999898E18)
            r0.T(r4)
            r0.M()
            k0.i$a r4 = k0.i.f23074a
        L_0x02d9:
            k0.i r3 = r3.h(r4)
            k0.i r3 = r8.h(r3)
            java.lang.Object r4 = r0.A()
            Y.m$a r5 = Y.C1500m.f10026a
            java.lang.Object r5 = r5.a()
            if (r4 != r5) goto L_0x02f5
            v.c r4 = new v.c
            r4.<init>(r1)
            r0.r(r4)
        L_0x02f5:
            v.c r4 = (v.C2720c) r4
            r5 = 0
            int r5 = Y.C1494j.a(r0, r5)
            Y.y r6 = r0.p()
            k0.i r3 = k0.h.e(r0, r3)
            J0.g$a r11 = J0.C1241g.f3853J
            yf.a r13 = r11.a()
            Y.f r14 = r0.j()
            if (r14 != 0) goto L_0x0313
            Y.C1494j.c()
        L_0x0313:
            r0.F()
            boolean r14 = r0.f()
            if (r14 == 0) goto L_0x0320
            r0.U(r13)
            goto L_0x0323
        L_0x0320:
            r0.q()
        L_0x0323:
            Y.m r13 = Y.F1.a(r0)
            yf.p r14 = r11.c()
            Y.F1.b(r13, r4, r14)
            yf.p r4 = r11.e()
            Y.F1.b(r13, r6, r4)
            yf.p r4 = r11.b()
            boolean r6 = r13.f()
            if (r6 != 0) goto L_0x034d
            java.lang.Object r6 = r13.A()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C6496s.c(r6, r14)
            if (r6 != 0) goto L_0x035b
        L_0x034d:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r13.r(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r13.V(r5, r4)
        L_0x035b:
            yf.p r4 = r11.d()
            Y.F1.b(r13, r3, r4)
            int r3 = r23 >> 18
            r3 = r3 & 112(0x70, float:1.57E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10.invoke(r1, r0, r3)
            r0.u()
            r0.M()
        L_0x0373:
            r0.M()
        L_0x0376:
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x037f
            Y.C1506p.P()
        L_0x037f:
            r11 = r2
        L_0x0380:
            Y.Y0 r13 = r0.k()
            if (r13 == 0) goto L_0x03a2
            v.d$b r14 = new v.d$b
            r0 = r14
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r11
            r8 = r31
            r9 = r33
            r10 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r13.a(r14)
        L_0x03a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C2721d.a(w.n0, yf.l, k0.i, androidx.compose.animation.i, androidx.compose.animation.k, yf.p, v.r, yf.q, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final p b(A1 a12) {
        return (p) a12.getValue();
    }

    private static final boolean c(A1 a12) {
        return ((Boolean) a12.getValue()).booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(C.C1092j r22, w.C2777V r23, k0.i r24, androidx.compose.animation.i r25, androidx.compose.animation.k r26, java.lang.String r27, yf.q r28, Y.C1500m r29, int r30, int r31) {
        /*
            r2 = r23
            r8 = r30
            r0 = -850656618(0xffffffffcd4c0296, float:-2.13920096E8)
            r1 = r29
            Y.m r1 = r1.h(r0)
            r3 = r31 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r8 | 48
            goto L_0x002f
        L_0x0014:
            r3 = r8 & 48
            if (r3 != 0) goto L_0x002e
            r3 = r8 & 64
            if (r3 != 0) goto L_0x0021
            boolean r3 = r1.S(r2)
            goto L_0x0025
        L_0x0021:
            boolean r3 = r1.C(r2)
        L_0x0025:
            if (r3 == 0) goto L_0x002a
            r3 = 32
            goto L_0x002c
        L_0x002a:
            r3 = 16
        L_0x002c:
            r3 = r3 | r8
            goto L_0x002f
        L_0x002e:
            r3 = r8
        L_0x002f:
            r4 = r31 & 2
            if (r4 == 0) goto L_0x0038
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0035:
            r5 = r24
            goto L_0x004a
        L_0x0038:
            r5 = r8 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0035
            r5 = r24
            boolean r6 = r1.S(r5)
            if (r6 == 0) goto L_0x0047
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0049
        L_0x0047:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0049:
            r3 = r3 | r6
        L_0x004a:
            r6 = r31 & 4
            if (r6 == 0) goto L_0x0053
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0050:
            r7 = r25
            goto L_0x0065
        L_0x0053:
            r7 = r8 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0050
            r7 = r25
            boolean r9 = r1.S(r7)
            if (r9 == 0) goto L_0x0062
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0064
        L_0x0062:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0064:
            r3 = r3 | r9
        L_0x0065:
            r9 = r31 & 8
            if (r9 == 0) goto L_0x006e
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x006b:
            r10 = r26
            goto L_0x0080
        L_0x006e:
            r10 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x006b
            r10 = r26
            boolean r11 = r1.S(r10)
            if (r11 == 0) goto L_0x007d
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x007f
        L_0x007d:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x007f:
            r3 = r3 | r11
        L_0x0080:
            r11 = r31 & 16
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x008a
            r3 = r3 | r12
        L_0x0087:
            r12 = r27
            goto L_0x009b
        L_0x008a:
            r12 = r12 & r8
            if (r12 != 0) goto L_0x0087
            r12 = r27
            boolean r13 = r1.S(r12)
            if (r13 == 0) goto L_0x0098
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x009a
        L_0x0098:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x009a:
            r3 = r3 | r13
        L_0x009b:
            r13 = r31 & 32
            r14 = 1572864(0x180000, float:2.204052E-39)
            if (r13 == 0) goto L_0x00a5
            r3 = r3 | r14
            r15 = r28
            goto L_0x00b7
        L_0x00a5:
            r13 = r8 & r14
            r15 = r28
            if (r13 != 0) goto L_0x00b7
            boolean r13 = r1.C(r15)
            if (r13 == 0) goto L_0x00b4
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b6
        L_0x00b4:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x00b6:
            r3 = r3 | r13
        L_0x00b7:
            r13 = 599185(0x92491, float:8.39637E-40)
            r13 = r13 & r3
            r14 = 599184(0x92490, float:8.39636E-40)
            if (r13 != r14) goto L_0x00d0
            boolean r13 = r1.i()
            if (r13 != 0) goto L_0x00c7
            goto L_0x00d0
        L_0x00c7:
            r1.I()
            r3 = r5
            r4 = r7
            r5 = r10
            r6 = r12
            goto L_0x015d
        L_0x00d0:
            if (r4 == 0) goto L_0x00d5
            k0.i$a r4 = k0.i.f23074a
            goto L_0x00d6
        L_0x00d5:
            r4 = r5
        L_0x00d6:
            r5 = 0
            r13 = 3
            r14 = 0
            if (r6 == 0) goto L_0x00f4
            r20 = 15
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.animation.i r6 = androidx.compose.animation.g.m(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.i r7 = androidx.compose.animation.g.o(r14, r5, r13, r14)
            androidx.compose.animation.i r6 = r6.c(r7)
            goto L_0x00f5
        L_0x00f4:
            r6 = r7
        L_0x00f5:
            if (r9 == 0) goto L_0x0110
            r20 = 15
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.animation.k r7 = androidx.compose.animation.g.y(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.k r5 = androidx.compose.animation.g.q(r14, r5, r13, r14)
            androidx.compose.animation.k r5 = r7.c(r5)
            goto L_0x0111
        L_0x0110:
            r5 = r10
        L_0x0111:
            if (r11 == 0) goto L_0x0116
            java.lang.String r7 = "AnimatedVisibility"
            goto L_0x0117
        L_0x0116:
            r7 = r12
        L_0x0117:
            boolean r9 = Y.C1506p.H()
            if (r9 == 0) goto L_0x0123
            r9 = -1
            java.lang.String r10 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:535)"
            Y.C1506p.Q(r0, r3, r9, r10)
        L_0x0123:
            int r0 = w.C2777V.f27247d
            int r9 = r3 >> 3
            r10 = r9 & 14
            r0 = r0 | r10
            int r10 = r3 >> 12
            r10 = r10 & 112(0x70, float:1.57E-43)
            r0 = r0 | r10
            r10 = 0
            w.n0 r0 = w.o0.f(r2, r7, r1, r0, r10)
            v.d$d r10 = v.C2721d.C0446d.f26813a
            r11 = r3 & 896(0x380, float:1.256E-42)
            r11 = r11 | 48
            r12 = r3 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r12
            r3 = r3 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r11
            r16 = r3 | r9
            r9 = r0
            r11 = r4
            r12 = r6
            r13 = r5
            r14 = r28
            r15 = r1
            h(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x015a
            Y.C1506p.P()
        L_0x015a:
            r3 = r4
            r4 = r6
            r6 = r7
        L_0x015d:
            Y.Y0 r10 = r1.k()
            if (r10 == 0) goto L_0x0176
            v.d$e r11 = new v.d$e
            r0 = r11
            r1 = r22
            r2 = r23
            r7 = r28
            r8 = r30
            r9 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0176:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C2721d.d(C.j, w.V, k0.i, androidx.compose.animation.i, androidx.compose.animation.k, java.lang.String, yf.q, Y.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(C.C1092j r22, boolean r23, k0.i r24, androidx.compose.animation.i r25, androidx.compose.animation.k r26, java.lang.String r27, yf.q r28, Y.C1500m r29, int r30, int r31) {
        /*
            r8 = r30
            r0 = 1766503102(0x694ab2be, float:1.5315444E25)
            r1 = r29
            Y.m r1 = r1.h(r0)
            r2 = r31 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r8 | 48
            r3 = r2
            r2 = r23
            goto L_0x002b
        L_0x0015:
            r2 = r8 & 48
            if (r2 != 0) goto L_0x0028
            r2 = r23
            boolean r3 = r1.b(r2)
            if (r3 == 0) goto L_0x0024
            r3 = 32
            goto L_0x0026
        L_0x0024:
            r3 = 16
        L_0x0026:
            r3 = r3 | r8
            goto L_0x002b
        L_0x0028:
            r2 = r23
            r3 = r8
        L_0x002b:
            r4 = r31 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0031:
            r5 = r24
            goto L_0x0046
        L_0x0034:
            r5 = r8 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0031
            r5 = r24
            boolean r6 = r1.S(r5)
            if (r6 == 0) goto L_0x0043
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0045
        L_0x0043:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r3 = r3 | r6
        L_0x0046:
            r6 = r31 & 4
            if (r6 == 0) goto L_0x004f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x004c:
            r7 = r25
            goto L_0x0061
        L_0x004f:
            r7 = r8 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x004c
            r7 = r25
            boolean r9 = r1.S(r7)
            if (r9 == 0) goto L_0x005e
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0060
        L_0x005e:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0060:
            r3 = r3 | r9
        L_0x0061:
            r9 = r31 & 8
            if (r9 == 0) goto L_0x006a
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0067:
            r10 = r26
            goto L_0x007c
        L_0x006a:
            r10 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0067
            r10 = r26
            boolean r11 = r1.S(r10)
            if (r11 == 0) goto L_0x0079
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x007b
        L_0x0079:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x007b:
            r3 = r3 | r11
        L_0x007c:
            r11 = r31 & 16
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x0086
            r3 = r3 | r12
        L_0x0083:
            r12 = r27
            goto L_0x0097
        L_0x0086:
            r12 = r12 & r8
            if (r12 != 0) goto L_0x0083
            r12 = r27
            boolean r13 = r1.S(r12)
            if (r13 == 0) goto L_0x0094
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0096
        L_0x0094:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x0096:
            r3 = r3 | r13
        L_0x0097:
            r13 = r31 & 32
            r14 = 1572864(0x180000, float:2.204052E-39)
            if (r13 == 0) goto L_0x00a1
            r3 = r3 | r14
            r15 = r28
            goto L_0x00b3
        L_0x00a1:
            r13 = r8 & r14
            r15 = r28
            if (r13 != 0) goto L_0x00b3
            boolean r13 = r1.C(r15)
            if (r13 == 0) goto L_0x00b0
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b2
        L_0x00b0:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x00b2:
            r3 = r3 | r13
        L_0x00b3:
            r13 = 599185(0x92491, float:8.39637E-40)
            r13 = r13 & r3
            r14 = 599184(0x92490, float:8.39636E-40)
            if (r13 != r14) goto L_0x00cc
            boolean r13 = r1.i()
            if (r13 != 0) goto L_0x00c3
            goto L_0x00cc
        L_0x00c3:
            r1.I()
            r3 = r5
            r4 = r7
            r5 = r10
            r6 = r12
            goto L_0x015a
        L_0x00cc:
            if (r4 == 0) goto L_0x00d1
            k0.i$a r4 = k0.i.f23074a
            goto L_0x00d2
        L_0x00d1:
            r4 = r5
        L_0x00d2:
            r5 = 0
            r13 = 3
            r14 = 0
            if (r6 == 0) goto L_0x00f0
            androidx.compose.animation.i r6 = androidx.compose.animation.g.o(r14, r5, r13, r14)
            r20 = 15
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.animation.i r7 = androidx.compose.animation.g.m(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.i r6 = r6.c(r7)
            goto L_0x00f1
        L_0x00f0:
            r6 = r7
        L_0x00f1:
            if (r9 == 0) goto L_0x010c
            androidx.compose.animation.k r5 = androidx.compose.animation.g.q(r14, r5, r13, r14)
            r20 = 15
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.animation.k r7 = androidx.compose.animation.g.y(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.k r5 = r5.c(r7)
            goto L_0x010d
        L_0x010c:
            r5 = r10
        L_0x010d:
            if (r11 == 0) goto L_0x0112
            java.lang.String r7 = "AnimatedVisibility"
            goto L_0x0113
        L_0x0112:
            r7 = r12
        L_0x0113:
            boolean r9 = Y.C1506p.H()
            if (r9 == 0) goto L_0x011f
            r9 = -1
            java.lang.String r10 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)"
            Y.C1506p.Q(r0, r3, r9, r10)
        L_0x011f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r23)
            int r9 = r3 >> 3
            r10 = r9 & 14
            int r11 = r3 >> 12
            r11 = r11 & 112(0x70, float:1.57E-43)
            r10 = r10 | r11
            r11 = 0
            w.n0 r0 = w.o0.g(r0, r7, r1, r10, r11)
            v.d$h r10 = v.C2721d.h.f26832a
            r11 = r3 & 896(0x380, float:1.256E-42)
            r11 = r11 | 48
            r12 = r3 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r12
            r3 = r3 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r11
            r16 = r3 | r9
            r9 = r0
            r11 = r4
            r12 = r6
            r13 = r5
            r14 = r28
            r15 = r1
            h(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x0157
            Y.C1506p.P()
        L_0x0157:
            r3 = r4
            r4 = r6
            r6 = r7
        L_0x015a:
            Y.Y0 r10 = r1.k()
            if (r10 == 0) goto L_0x0173
            v.d$i r11 = new v.d$i
            r0 = r11
            r1 = r22
            r2 = r23
            r7 = r28
            r8 = r30
            r9 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0173:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C2721d.e(C.j, boolean, k0.i, androidx.compose.animation.i, androidx.compose.animation.k, java.lang.String, yf.q, Y.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(w.C2777V r22, k0.i r23, androidx.compose.animation.i r24, androidx.compose.animation.k r25, java.lang.String r26, yf.q r27, Y.C1500m r28, int r29, int r30) {
        /*
            r1 = r22
            r7 = r29
            r0 = -222898426(0xfffffffff2b6d706, float:-7.243036E30)
            r2 = r28
            Y.m r2 = r2.h(r0)
            r3 = r30 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r7 | 6
            goto L_0x002d
        L_0x0014:
            r3 = r7 & 6
            if (r3 != 0) goto L_0x002c
            r3 = r7 & 8
            if (r3 != 0) goto L_0x0021
            boolean r3 = r2.S(r1)
            goto L_0x0025
        L_0x0021:
            boolean r3 = r2.C(r1)
        L_0x0025:
            if (r3 == 0) goto L_0x0029
            r3 = 4
            goto L_0x002a
        L_0x0029:
            r3 = 2
        L_0x002a:
            r3 = r3 | r7
            goto L_0x002d
        L_0x002c:
            r3 = r7
        L_0x002d:
            r4 = r30 & 2
            if (r4 == 0) goto L_0x0036
            r3 = r3 | 48
        L_0x0033:
            r5 = r23
            goto L_0x0048
        L_0x0036:
            r5 = r7 & 48
            if (r5 != 0) goto L_0x0033
            r5 = r23
            boolean r6 = r2.S(r5)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0047
        L_0x0045:
            r6 = 16
        L_0x0047:
            r3 = r3 | r6
        L_0x0048:
            r6 = r30 & 4
            if (r6 == 0) goto L_0x0051
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r8 = r24
            goto L_0x0063
        L_0x0051:
            r8 = r7 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004e
            r8 = r24
            boolean r9 = r2.S(r8)
            if (r9 == 0) goto L_0x0060
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r9
        L_0x0063:
            r9 = r30 & 8
            if (r9 == 0) goto L_0x006c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r10 = r25
            goto L_0x007e
        L_0x006c:
            r10 = r7 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0069
            r10 = r25
            boolean r11 = r2.S(r10)
            if (r11 == 0) goto L_0x007b
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r11
        L_0x007e:
            r11 = r30 & 16
            if (r11 == 0) goto L_0x0087
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0084:
            r12 = r26
            goto L_0x0099
        L_0x0087:
            r12 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0084
            r12 = r26
            boolean r13 = r2.S(r12)
            if (r13 == 0) goto L_0x0096
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r3 = r3 | r13
        L_0x0099:
            r13 = r30 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x00a3
            r3 = r3 | r14
            r15 = r27
            goto L_0x00b5
        L_0x00a3:
            r13 = r7 & r14
            r15 = r27
            if (r13 != 0) goto L_0x00b5
            boolean r13 = r2.C(r15)
            if (r13 == 0) goto L_0x00b2
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b2:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r3 = r3 | r13
        L_0x00b5:
            r13 = 74899(0x12493, float:1.04956E-40)
            r13 = r13 & r3
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r13 != r14) goto L_0x00cd
            boolean r13 = r2.i()
            if (r13 != 0) goto L_0x00c5
            goto L_0x00cd
        L_0x00c5:
            r2.I()
            r4 = r5
            r3 = r8
            r5 = r12
            goto L_0x015b
        L_0x00cd:
            if (r4 == 0) goto L_0x00d2
            k0.i$a r4 = k0.i.f23074a
            goto L_0x00d3
        L_0x00d2:
            r4 = r5
        L_0x00d3:
            r5 = 0
            r13 = 3
            r14 = 0
            if (r6 == 0) goto L_0x00f1
            androidx.compose.animation.i r6 = androidx.compose.animation.g.o(r14, r5, r13, r14)
            r20 = 15
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.animation.i r8 = androidx.compose.animation.g.k(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.i r6 = r6.c(r8)
            goto L_0x00f2
        L_0x00f1:
            r6 = r8
        L_0x00f2:
            if (r9 == 0) goto L_0x010d
            androidx.compose.animation.k r5 = androidx.compose.animation.g.q(r14, r5, r13, r14)
            r20 = 15
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.animation.k r8 = androidx.compose.animation.g.w(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.k r5 = r5.c(r8)
            goto L_0x010e
        L_0x010d:
            r5 = r10
        L_0x010e:
            if (r11 == 0) goto L_0x0114
            java.lang.String r8 = "AnimatedVisibility"
            r14 = r8
            goto L_0x0115
        L_0x0114:
            r14 = r12
        L_0x0115:
            boolean r8 = Y.C1506p.H()
            if (r8 == 0) goto L_0x0121
            r8 = -1
            java.lang.String r9 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)"
            Y.C1506p.Q(r0, r3, r8, r9)
        L_0x0121:
            int r0 = w.C2777V.f27247d
            r8 = r3 & 14
            r0 = r0 | r8
            int r8 = r3 >> 9
            r8 = r8 & 112(0x70, float:1.57E-43)
            r0 = r0 | r8
            r8 = 0
            w.n0 r8 = w.o0.f(r1, r14, r2, r0, r8)
            v.d$j r9 = v.C2721d.j.f26842a
            int r0 = r3 << 3
            r10 = r0 & 896(0x380, float:1.256E-42)
            r10 = r10 | 48
            r11 = r0 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r11
            r0 = r0 | r10
            r10 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r10
            r0 = r0 | r3
            r10 = r4
            r11 = r6
            r12 = r5
            r13 = r27
            r3 = r14
            r14 = r2
            r15 = r0
            h(r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x0158
            Y.C1506p.P()
        L_0x0158:
            r10 = r5
            r5 = r3
            r3 = r6
        L_0x015b:
            Y.Y0 r9 = r2.k()
            if (r9 == 0) goto L_0x0174
            v.d$k r11 = new v.d$k
            r0 = r11
            r1 = r22
            r2 = r4
            r4 = r10
            r6 = r27
            r7 = r29
            r8 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r11)
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C2721d.f(w.V, k0.i, androidx.compose.animation.i, androidx.compose.animation.k, java.lang.String, yf.q, Y.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(boolean r22, k0.i r23, androidx.compose.animation.i r24, androidx.compose.animation.k r25, java.lang.String r26, yf.q r27, Y.C1500m r28, int r29, int r30) {
        /*
            r7 = r29
            r0 = 2088733774(0x7c7f8c4e, float:5.3075257E36)
            r1 = r28
            Y.m r1 = r1.h(r0)
            r2 = r30 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r7 | 6
            r3 = r2
            r2 = r22
            goto L_0x0029
        L_0x0015:
            r2 = r7 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r22
            boolean r3 = r1.b(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r7
            goto L_0x0029
        L_0x0026:
            r2 = r22
            r3 = r7
        L_0x0029:
            r4 = r30 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r5 = r23
            goto L_0x0044
        L_0x0032:
            r5 = r7 & 48
            if (r5 != 0) goto L_0x002f
            r5 = r23
            boolean r6 = r1.S(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
        L_0x0044:
            r6 = r30 & 4
            if (r6 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r8 = r24
            goto L_0x005f
        L_0x004d:
            r8 = r7 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r24
            boolean r9 = r1.S(r8)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r9
        L_0x005f:
            r9 = r30 & 8
            if (r9 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r10 = r25
            goto L_0x007a
        L_0x0068:
            r10 = r7 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0065
            r10 = r25
            boolean r11 = r1.S(r10)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r11
        L_0x007a:
            r11 = r30 & 16
            if (r11 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r12 = r26
            goto L_0x0095
        L_0x0083:
            r12 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0080
            r12 = r26
            boolean r13 = r1.S(r12)
            if (r13 == 0) goto L_0x0092
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r13
        L_0x0095:
            r13 = r30 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x009f
            r3 = r3 | r14
            r15 = r27
            goto L_0x00b1
        L_0x009f:
            r13 = r7 & r14
            r15 = r27
            if (r13 != 0) goto L_0x00b1
            boolean r13 = r1.C(r15)
            if (r13 == 0) goto L_0x00ae
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r3 = r3 | r13
        L_0x00b1:
            r13 = 74899(0x12493, float:1.04956E-40)
            r13 = r13 & r3
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r13 != r14) goto L_0x00c9
            boolean r13 = r1.i()
            if (r13 != 0) goto L_0x00c1
            goto L_0x00c9
        L_0x00c1:
            r1.I()
            r4 = r5
            r3 = r8
            r5 = r12
            goto L_0x0158
        L_0x00c9:
            if (r4 == 0) goto L_0x00ce
            k0.i$a r4 = k0.i.f23074a
            goto L_0x00cf
        L_0x00ce:
            r4 = r5
        L_0x00cf:
            r5 = 0
            r13 = 3
            r14 = 0
            if (r6 == 0) goto L_0x00ed
            androidx.compose.animation.i r6 = androidx.compose.animation.g.o(r14, r5, r13, r14)
            r20 = 15
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.animation.i r8 = androidx.compose.animation.g.k(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.i r6 = r6.c(r8)
            goto L_0x00ee
        L_0x00ed:
            r6 = r8
        L_0x00ee:
            if (r9 == 0) goto L_0x0109
            r20 = 15
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.animation.k r8 = androidx.compose.animation.g.w(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.k r5 = androidx.compose.animation.g.q(r14, r5, r13, r14)
            androidx.compose.animation.k r5 = r8.c(r5)
            goto L_0x010a
        L_0x0109:
            r5 = r10
        L_0x010a:
            if (r11 == 0) goto L_0x0110
            java.lang.String r8 = "AnimatedVisibility"
            r14 = r8
            goto L_0x0111
        L_0x0110:
            r14 = r12
        L_0x0111:
            boolean r8 = Y.C1506p.H()
            if (r8 == 0) goto L_0x011d
            r8 = -1
            java.lang.String r9 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)"
            Y.C1506p.Q(r0, r3, r8, r9)
        L_0x011d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r22)
            r8 = r3 & 14
            int r9 = r3 >> 9
            r9 = r9 & 112(0x70, float:1.57E-43)
            r8 = r8 | r9
            r9 = 0
            w.n0 r8 = w.o0.g(r0, r14, r1, r8, r9)
            v.d$f r9 = v.C2721d.f.f26823a
            int r0 = r3 << 3
            r10 = r0 & 896(0x380, float:1.256E-42)
            r10 = r10 | 48
            r11 = r0 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r11
            r0 = r0 | r10
            r10 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r10
            r0 = r0 | r3
            r10 = r4
            r11 = r6
            r12 = r5
            r13 = r27
            r3 = r14
            r14 = r1
            r15 = r0
            h(r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x0155
            Y.C1506p.P()
        L_0x0155:
            r10 = r5
            r5 = r3
            r3 = r6
        L_0x0158:
            Y.Y0 r9 = r1.k()
            if (r9 == 0) goto L_0x0171
            v.d$g r11 = new v.d$g
            r0 = r11
            r1 = r22
            r2 = r4
            r4 = r10
            r6 = r27
            r7 = r29
            r8 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r11)
        L_0x0171:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C2721d.g(boolean, k0.i, androidx.compose.animation.i, androidx.compose.animation.k, java.lang.String, yf.q, Y.m, int, int):void");
    }

    public static final void h(n0 n0Var, C6798l lVar, k0.i iVar, androidx.compose.animation.i iVar2, androidx.compose.animation.k kVar, q qVar, C1500m mVar, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        n0 n0Var2 = n0Var;
        C6798l lVar2 = lVar;
        k0.i iVar3 = iVar;
        int i18 = i10;
        C1500m h10 = mVar.h(429978603);
        if ((i18 & 6) == 0) {
            if (h10.S(n0Var2)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i18;
        } else {
            i11 = i18;
        }
        if ((i18 & 48) == 0) {
            if (h10.C(lVar2)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i18 & 384) == 0) {
            if (h10.S(iVar3)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        androidx.compose.animation.i iVar4 = iVar2;
        if ((i18 & 3072) == 0) {
            if (h10.S(iVar4)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i11 |= i14;
        }
        androidx.compose.animation.k kVar2 = kVar;
        if ((i18 & 24576) == 0) {
            if (h10.S(kVar2)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i11 |= i13;
        }
        q qVar2 = qVar;
        if ((i18 & 196608) == 0) {
            if (h10.C(qVar2)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i11 |= i12;
        }
        if ((74899 & i11) != 74898 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(429978603, i11, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:693)");
            }
            int i19 = i11 & 112;
            boolean z11 = false;
            if (i19 == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i20 = i11 & 14;
            if (i20 == 4) {
                z11 = true;
            }
            boolean z12 = z10 | z11;
            Object A10 = h10.A();
            if (z12 || A10 == C1500m.f10026a.a()) {
                A10 = new l(lVar2, n0Var2);
                h10.r(A10);
            }
            a(n0Var, lVar, androidx.compose.ui.layout.b.a(iVar3, (q) A10), iVar2, kVar, m.f26854a, (C2735r) null, qVar, h10, i19 | 196608 | i20 | (i11 & 7168) | (57344 & i11) | ((i11 << 6) & 29360128), 64);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new n(n0Var, lVar, iVar, iVar2, kVar, qVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final boolean k(n0 n0Var) {
        Object i10 = n0Var.i();
        C2727j jVar = C2727j.PostExit;
        if (i10 == jVar && n0Var.p() == jVar) {
            return true;
        }
        return false;
    }

    private static final C2727j l(n0 n0Var, C6798l lVar, Object obj, C1500m mVar, int i10) {
        C2727j jVar;
        if (C1506p.H()) {
            C1506p.Q(361571134, i10, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:855)");
        }
        mVar.E(-902048200, n0Var);
        if (n0Var.u()) {
            mVar.T(2101296683);
            mVar.M();
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                jVar = C2727j.Visible;
            } else if (((Boolean) lVar.invoke(n0Var.i())).booleanValue()) {
                jVar = C2727j.PostExit;
            } else {
                jVar = C2727j.PreEnter;
            }
        } else {
            mVar.T(2101530516);
            Object A10 = mVar.A();
            if (A10 == C1500m.f10026a.a()) {
                A10 = u1.d(Boolean.FALSE, (o1) null, 2, (Object) null);
                mVar.r(A10);
            }
            C1510r0 r0Var = (C1510r0) A10;
            if (((Boolean) lVar.invoke(n0Var.i())).booleanValue()) {
                r0Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                jVar = C2727j.Visible;
            } else if (((Boolean) r0Var.getValue()).booleanValue()) {
                jVar = C2727j.PostExit;
            } else {
                jVar = C2727j.PreEnter;
            }
            mVar.M();
        }
        mVar.Q();
        if (C1506p.H()) {
            C1506p.P();
        }
        return jVar;
    }
}
