package V;

import D0.C1111b;
import D0.J;
import D0.T;
import H0.C1197s;
import H0.C1198t;
import H0.E;
import H0.G;
import H0.H;
import H0.U;
import O0.m;
import O0.t;
import O0.v;
import Y.C1500m;
import Y.C1505o0;
import Y.C1506p;
import Y.C1510r0;
import Y.L;
import Y.M;
import Y.M0;
import Y.P;
import Y.Y0;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.ui.focus.o;
import androidx.compose.ui.platform.C1651m1;
import c1.r;
import c1.s;
import java.util.Map;
import k0.i;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import q0.C2423i;
import q0.C2424j;
import qf.C6658d;
import r0.Z1;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

public abstract class I {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f6551a = c1.h.j((float) 16);

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f6552a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f6553b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1510r0 f6554c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1505o0 f6555d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C1505o0 f6556e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, int i10, C1510r0 r0Var, C1505o0 o0Var, C1505o0 o0Var2) {
            super(1);
            this.f6552a = view;
            this.f6553b = i10;
            this.f6554c = r0Var;
            this.f6555d = o0Var;
            this.f6556e = o0Var2;
        }

        public final void a(C1197s sVar) {
            I.c(this.f6554c, sVar);
            I.e(this.f6555d, r.g(sVar.b()));
            I.g(this.f6556e, I.u(I.x(this.f6552a.getRootView()), I.w(I.b(this.f6554c)), this.f6553b));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1197s) obj);
            return C6514M.f71813a;
        }
    }

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f6557a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f6558b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1510r0 f6559c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1505o0 f6560d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view, int i10, C1510r0 r0Var, C1505o0 o0Var) {
            super(0);
            this.f6557a = view;
            this.f6558b = i10;
            this.f6559c = r0Var;
            this.f6560d = o0Var;
        }

        public final void invoke() {
            I.g(this.f6560d, I.u(I.x(this.f6557a.getRootView()), I.w(I.b(this.f6559c)), this.f6558b));
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f6561a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o f6562b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z10, o oVar) {
            super(0);
            this.f6561a = z10;
            this.f6562b = oVar;
        }

        public final void invoke() {
            if (this.f6561a) {
                this.f6562b.f();
            }
        }
    }

    static final class d extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f6563a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C6798l lVar) {
            super(0);
            this.f6563a = lVar;
        }

        public final void invoke() {
            this.f6563a.invoke(Boolean.FALSE);
        }
    }

    static final class e extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f6564a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f6565b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k0.i f6566c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q f6567d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f6568e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f6569f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(boolean z10, C6798l lVar, k0.i iVar, q qVar, int i10, int i11) {
            super(2);
            this.f6564a = z10;
            this.f6565b = lVar;
            this.f6566c = iVar;
            this.f6567d = qVar;
            this.f6568e = i10;
            this.f6569f = i11;
        }

        public final void a(C1500m mVar, int i10) {
            I.a(this.f6564a, this.f6565b, this.f6566c, this.f6567d, mVar, M0.a(this.f6568e | 1), this.f6569f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public static final class f extends F {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o f6570b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f6571c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f6572d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f6573e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f6574f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C1651m1 f6575g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C1510r0 f6576h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C6798l f6577i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C1505o0 f6578j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C1505o0 f6579k;

        static final class a extends C6498u implements q {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f6580a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C1505o0 f6581b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C1505o0 f6582c;

            /* renamed from: V.I$f$a$a  reason: collision with other inner class name */
            static final class C0153a extends C6498u implements C6798l {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ U f6583a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0153a(U u10) {
                    super(1);
                    this.f6583a = u10;
                }

                public final void a(U.a aVar) {
                    U.a.h(aVar, this.f6583a, 0, 0, 0.0f, 4, (Object) null);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((U.a) obj);
                    return C6514M.f71813a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(boolean z10, C1505o0 o0Var, C1505o0 o0Var2) {
                super(3);
                this.f6580a = z10;
                this.f6581b = o0Var;
                this.f6582c = o0Var2;
            }

            public final G a(H h10, E e10, long j10) {
                int i10;
                int i11 = c1.c.i(j10, I.d(this.f6581b));
                int h11 = c1.c.h(j10, I.f(this.f6582c));
                if (this.f6580a) {
                    i10 = i11;
                } else {
                    i10 = c1.b.n(j10);
                }
                if (!this.f6580a) {
                    i11 = c1.b.l(j10);
                }
                U v02 = e10.v0(c1.b.d(j10, i10, i11, 0, h11, 4, (Object) null));
                return H.N(h10, v02.X0(), v02.R0(), (Map) null, new C0153a(v02), 4, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return a((H) obj, (E) obj2, ((c1.b) obj3).r());
            }
        }

        static final class b extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1510r0 f6584a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f6585b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C6798l f6586c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ boolean f6587d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C1510r0 r0Var, String str, C6798l lVar, boolean z10) {
                super(0);
                this.f6584a = r0Var;
                this.f6585b = str;
                this.f6586c = lVar;
                this.f6587d = z10;
            }

            public final void invoke() {
                this.f6584a.setValue(Z.d(this.f6585b));
                this.f6586c.invoke(Boolean.valueOf(!this.f6587d));
            }
        }

        f(o oVar, boolean z10, String str, String str2, String str3, C1651m1 m1Var, C1510r0 r0Var, C6798l lVar, C1505o0 o0Var, C1505o0 o0Var2) {
            this.f6570b = oVar;
            this.f6571c = z10;
            this.f6572d = str;
            this.f6573e = str2;
            this.f6574f = str3;
            this.f6575g = m1Var;
            this.f6576h = r0Var;
            this.f6577i = lVar;
            this.f6578j = o0Var;
            this.f6579k = o0Var2;
        }

        public k0.i b(k0.i iVar, boolean z10) {
            return androidx.compose.ui.layout.b.a(iVar, new a(z10, this.f6578j, this.f6579k));
        }

        public String c() {
            return ((Z) this.f6576h.getValue()).j();
        }

        public k0.i d(k0.i iVar, String str, boolean z10) {
            k0.i iVar2;
            k0.i a10 = androidx.compose.ui.focus.p.a(iVar, this.f6570b);
            if (!z10) {
                iVar2 = k0.i.f23074a;
            } else {
                i.a aVar = k0.i.f23074a;
                boolean z11 = this.f6571c;
                iVar2 = I.v(aVar, z11, new b(this.f6576h, str, this.f6577i, z11), str, this.f6572d, this.f6573e, this.f6574f, this.f6575g);
            }
            return a10.h(iVar2);
        }
    }

    static final class g extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f6588a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f6589b;

        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f6590a;

            public a(b bVar) {
                this.f6590a = bVar;
            }

            public void dispose() {
                this.f6590a.a();
            }
        }

        public static final class b implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

            /* renamed from: a  reason: collision with root package name */
            private boolean f6591a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f6592b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C6787a f6593c;

            b(View view, C6787a aVar) {
                this.f6592b = view;
                this.f6593c = aVar;
                view.addOnAttachStateChangeListener(this);
                b();
            }

            private final void b() {
                if (!this.f6591a && this.f6592b.isAttachedToWindow()) {
                    this.f6592b.getViewTreeObserver().addOnGlobalLayoutListener(this);
                    this.f6591a = true;
                }
            }

            private final void c() {
                if (this.f6591a) {
                    this.f6592b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    this.f6591a = false;
                }
            }

            public final void a() {
                c();
                this.f6592b.removeOnAttachStateChangeListener(this);
            }

            public void onGlobalLayout() {
                this.f6593c.invoke();
            }

            public void onViewAttachedToWindow(View view) {
                b();
            }

            public void onViewDetachedFromWindow(View view) {
                c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(View view, C6787a aVar) {
            super(1);
            this.f6588a = view;
            this.f6589b = aVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            return new a(new b(this.f6588a, this.f6589b));
        }
    }

    static final class h extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f6594a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c1.d f6595b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6787a f6596c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f6597d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(View view, c1.d dVar, C6787a aVar, int i10) {
            super(2);
            this.f6594a = view;
            this.f6595b = dVar;
            this.f6596c = aVar;
            this.f6597d = i10;
        }

        public final void a(C1500m mVar, int i10) {
            I.h(this.f6594a, this.f6595b, this.f6596c, mVar, M0.a(this.f6597d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class i extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f6598a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f6599b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f6600c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6787a f6601d;

        static final class a extends k implements p {

            /* renamed from: b  reason: collision with root package name */
            int f6602b;

            /* renamed from: c  reason: collision with root package name */
            private /* synthetic */ Object f6603c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f6604d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C6787a f6605e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(String str, C6787a aVar, C6658d dVar) {
                super(2, dVar);
                this.f6604d = str;
                this.f6605e = aVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                a aVar = new a(this.f6604d, this.f6605e, dVar);
                aVar.f6603c = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(C1111b bVar, C6658d dVar) {
                return ((a) create(bVar, dVar)).invokeSuspend(C6514M.f71813a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: D0.b} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = rf.C6680b.f()
                    int r1 = r10.f6602b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L_0x0022
                    if (r1 == r3) goto L_0x001a
                    if (r1 != r2) goto L_0x0012
                    lf.w.b(r11)
                    goto L_0x005d
                L_0x0012:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L_0x001a:
                    java.lang.Object r1 = r10.f6603c
                    D0.b r1 = (D0.C1111b) r1
                    lf.w.b(r11)
                    goto L_0x003c
                L_0x0022:
                    lf.w.b(r11)
                    java.lang.Object r11 = r10.f6603c
                    r1 = r11
                    D0.b r1 = (D0.C1111b) r1
                    D0.q r6 = D0.C1126q.Initial
                    r10.f6603c = r1
                    r10.f6602b = r3
                    r5 = 0
                    r8 = 1
                    r9 = 0
                    r4 = r1
                    r7 = r10
                    java.lang.Object r11 = z.C2938B.e(r4, r5, r6, r7, r8, r9)
                    if (r11 != r0) goto L_0x003c
                    return r0
                L_0x003c:
                    D0.A r11 = (D0.A) r11
                    java.lang.String r3 = r10.f6604d
                    V.Z$a r4 = V.Z.f7173b
                    java.lang.String r4 = r4.c()
                    boolean r3 = V.Z.g(r3, r4)
                    if (r3 == 0) goto L_0x004f
                    r11.a()
                L_0x004f:
                    D0.q r11 = D0.C1126q.Initial
                    r3 = 0
                    r10.f6603c = r3
                    r10.f6602b = r2
                    java.lang.Object r11 = z.C2938B.k(r1, r11, r10)
                    if (r11 != r0) goto L_0x005d
                    return r0
                L_0x005d:
                    D0.A r11 = (D0.A) r11
                    if (r11 == 0) goto L_0x0066
                    yf.a r11 = r10.f6605e
                    r11.invoke()
                L_0x0066:
                    lf.M r11 = lf.C6514M.f71813a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: V.I.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(String str, C6787a aVar, C6658d dVar) {
            super(2, dVar);
            this.f6600c = str;
            this.f6601d = aVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            i iVar = new i(this.f6600c, this.f6601d, dVar);
            iVar.f6599b = obj;
            return iVar;
        }

        public final Object invoke(J j10, C6658d dVar) {
            return ((i) create(j10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f6598a;
            if (i10 == 0) {
                w.b(obj);
                a aVar = new a(this.f6600c, this.f6601d, (C6658d) null);
                this.f6598a = 1;
                if (z.o.c((J) this.f6599b, aVar, this) == f10) {
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

    static final class j extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6606a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f6607b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f6608c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f6609d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f6610e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6787a f6611f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C1651m1 f6612g;

        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C6787a f6613a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f6614b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C1651m1 f6615c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C6787a aVar, String str, C1651m1 m1Var) {
                super(0);
                this.f6613a = aVar;
                this.f6614b = str;
                this.f6615c = m1Var;
            }

            /* renamed from: a */
            public final Boolean invoke() {
                C1651m1 m1Var;
                this.f6613a.invoke();
                if (Z.g(this.f6614b, Z.f7173b.a()) && (m1Var = this.f6615c) != null) {
                    m1Var.b();
                }
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(String str, boolean z10, String str2, String str3, String str4, C6787a aVar, C1651m1 m1Var) {
            super(1);
            this.f6606a = str;
            this.f6607b = z10;
            this.f6608c = str2;
            this.f6609d = str3;
            this.f6610e = str4;
            this.f6611f = aVar;
            this.f6612g = m1Var;
        }

        public final void a(v vVar) {
            String str;
            if (Z.g(this.f6606a, Z.f7173b.c())) {
                t.g0(vVar, O0.g.f4539b.a());
                if (this.f6607b) {
                    str = this.f6608c;
                } else {
                    str = this.f6609d;
                }
                t.k0(vVar, str);
                t.Y(vVar, this.f6610e);
            } else {
                t.g0(vVar, O0.g.f4539b.c());
            }
            t.y(vVar, (String) null, new a(this.f6611f, this.f6606a, this.f6612g), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v) obj);
            return C6514M.f71813a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: k0.i$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: V.I$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: V.I$a} */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01fd, code lost:
        if (r2 == r23.a()) goto L_0x01ff;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(boolean r30, yf.C6798l r31, k0.i r32, yf.q r33, Y.C1500m r34, int r35, int r36) {
        /*
            r11 = r30
            r12 = r31
            r13 = r33
            r14 = r35
            r0 = 2067579792(0x7b3cc390, float:9.801183E35)
            r1 = r34
            Y.m r15 = r1.h(r0)
            r16 = 1
            r1 = r36 & 1
            r2 = 2
            r10 = 4
            if (r1 == 0) goto L_0x001c
            r1 = r14 | 6
            goto L_0x002c
        L_0x001c:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x002b
            boolean r1 = r15.b(r11)
            if (r1 == 0) goto L_0x0028
            r1 = r10
            goto L_0x0029
        L_0x0028:
            r1 = r2
        L_0x0029:
            r1 = r1 | r14
            goto L_0x002c
        L_0x002b:
            r1 = r14
        L_0x002c:
            r3 = r36 & 2
            if (r3 == 0) goto L_0x0033
            r1 = r1 | 48
            goto L_0x0043
        L_0x0033:
            r3 = r14 & 48
            if (r3 != 0) goto L_0x0043
            boolean r3 = r15.C(r12)
            if (r3 == 0) goto L_0x0040
            r3 = 32
            goto L_0x0042
        L_0x0040:
            r3 = 16
        L_0x0042:
            r1 = r1 | r3
        L_0x0043:
            r3 = r36 & 4
            if (r3 == 0) goto L_0x004c
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r4 = r32
            goto L_0x005e
        L_0x004c:
            r4 = r14 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0049
            r4 = r32
            boolean r5 = r15.S(r4)
            if (r5 == 0) goto L_0x005b
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r5
        L_0x005e:
            r5 = r36 & 8
            if (r5 == 0) goto L_0x0066
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0064:
            r8 = r1
            goto L_0x0077
        L_0x0066:
            r5 = r14 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0064
            boolean r5 = r15.C(r13)
            if (r5 == 0) goto L_0x0073
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0073:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r1 = r1 | r5
            goto L_0x0064
        L_0x0077:
            r1 = r8 & 1171(0x493, float:1.641E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r1 != r5) goto L_0x008d
            boolean r1 = r15.i()
            if (r1 != 0) goto L_0x0084
            goto L_0x008d
        L_0x0084:
            r15.I()
            r3 = r4
            r1 = r11
            r5 = r12
            r4 = r13
            goto L_0x032e
        L_0x008d:
            if (r3 == 0) goto L_0x0093
            k0.i$a r1 = k0.i.f23074a
            r7 = r1
            goto L_0x0094
        L_0x0093:
            r7 = r4
        L_0x0094:
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x00a0
            r1 = -1
            java.lang.String r3 = "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.android.kt:139)"
            Y.C1506p.Q(r0, r8, r1, r3)
        L_0x00a0:
            Y.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f()
            java.lang.Object r0 = r15.m(r0)
            android.content.res.Configuration r0 = (android.content.res.Configuration) r0
            Y.I0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.k()
            java.lang.Object r1 = r15.m(r1)
            r6 = r1
            android.view.View r6 = (android.view.View) r6
            Y.I0 r1 = androidx.compose.ui.platform.C1644k0.e()
            java.lang.Object r1 = r15.m(r1)
            r5 = r1
            c1.d r5 = (c1.d) r5
            float r1 = V.C1374c0.j()
            int r4 = r5.E0(r1)
            java.lang.Object r1 = r15.A()
            Y.m$a r23 = Y.C1500m.f10026a
            java.lang.Object r3 = r23.a()
            r9 = 0
            if (r1 != r3) goto L_0x00dc
            Y.r0 r1 = Y.u1.d(r9, r9, r2, r9)
            r15.r(r1)
        L_0x00dc:
            r3 = r1
            Y.r0 r3 = (Y.C1510r0) r3
            java.lang.Object r1 = r15.A()
            java.lang.Object r10 = r23.a()
            r2 = 0
            if (r1 != r10) goto L_0x00f1
            Y.o0 r1 = Y.C1488g1.a(r2)
            r15.r(r1)
        L_0x00f1:
            r21 = r1
            Y.o0 r21 = (Y.C1505o0) r21
            java.lang.Object r1 = r15.A()
            java.lang.Object r10 = r23.a()
            if (r1 != r10) goto L_0x0106
            Y.o0 r1 = Y.C1488g1.a(r2)
            r15.r(r1)
        L_0x0106:
            r10 = r1
            Y.o0 r10 = (Y.C1505o0) r10
            java.lang.Object r1 = r15.A()
            java.lang.Object r9 = r23.a()
            if (r1 != r9) goto L_0x011b
            androidx.compose.ui.focus.o r1 = new androidx.compose.ui.focus.o
            r1.<init>()
            r15.r(r1)
        L_0x011b:
            r9 = r1
            androidx.compose.ui.focus.o r9 = (androidx.compose.ui.focus.o) r9
            Y.I0 r1 = androidx.compose.ui.platform.C1644k0.o()
            java.lang.Object r1 = r15.m(r1)
            r19 = r1
            androidx.compose.ui.platform.m1 r19 = (androidx.compose.ui.platform.C1651m1) r19
            W.v$a r1 = W.v.f8397a
            int r1 = V.C1402q0.f7959h
            int r1 = W.v.a(r1)
            java.lang.String r20 = W.w.a(r1, r15, r2)
            int r1 = V.C1402q0.f7958g
            int r1 = W.v.a(r1)
            java.lang.String r22 = W.w.a(r1, r15, r2)
            int r1 = V.C1402q0.f7960i
            int r1 = W.v.a(r1)
            java.lang.String r24 = W.w.a(r1, r15, r2)
            java.lang.Object r1 = r15.A()
            java.lang.Object r2 = r23.a()
            if (r1 != r2) goto L_0x016a
            V.Z$a r1 = V.Z.f7173b
            java.lang.String r1 = r1.b()
            V.Z r1 = V.Z.d(r1)
            r32 = r3
            r2 = 2
            r3 = 0
            Y.r0 r1 = Y.u1.d(r1, r3, r2, r3)
            r15.r(r1)
            goto L_0x016c
        L_0x016a:
            r32 = r3
        L_0x016c:
            r18 = r1
            Y.r0 r18 = (Y.C1510r0) r18
            r3 = r8 & 14
            r2 = 4
            if (r3 != r2) goto L_0x0178
            r1 = r16
            goto L_0x0179
        L_0x0178:
            r1 = 0
        L_0x0179:
            r14 = r8 & 112(0x70, float:1.57E-43)
            r17 = r10
            r10 = 32
            if (r14 != r10) goto L_0x0184
            r26 = r16
            goto L_0x0186
        L_0x0184:
            r26 = 0
        L_0x0186:
            r1 = r1 | r26
            boolean r0 = r15.S(r0)
            r0 = r0 | r1
            boolean r1 = r15.S(r6)
            r0 = r0 | r1
            boolean r1 = r15.S(r5)
            r0 = r0 | r1
            java.lang.Object r1 = r15.A()
            if (r0 != 0) goto L_0x01b6
            java.lang.Object r0 = r23.a()
            if (r1 != r0) goto L_0x01a4
            goto L_0x01b6
        L_0x01a4:
            r26 = r32
            r27 = r3
            r28 = r5
            r11 = r6
            r13 = r7
            r24 = r8
            r29 = r9
            r34 = r14
            r25 = r17
            r14 = r4
            goto L_0x01e8
        L_0x01b6:
            V.I$f r1 = new V.I$f
            r0 = r1
            r12 = r1
            r1 = r9
            r25 = r2
            r34 = r14
            r14 = 0
            r2 = r30
            r26 = r32
            r27 = r3
            r3 = r20
            r14 = r4
            r4 = r22
            r28 = r5
            r5 = r24
            r11 = r6
            r6 = r19
            r13 = r7
            r7 = r18
            r24 = r8
            r8 = r31
            r29 = r9
            r9 = r21
            r25 = r17
            r10 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r15.r(r12)
            r1 = r12
        L_0x01e8:
            V.I$f r1 = (V.I.f) r1
            boolean r0 = r15.C(r11)
            boolean r2 = r15.d(r14)
            r0 = r0 | r2
            java.lang.Object r2 = r15.A()
            if (r0 != 0) goto L_0x01ff
            java.lang.Object r0 = r23.a()
            if (r2 != r0) goto L_0x0211
        L_0x01ff:
            V.I$a r2 = new V.I$a
            r17 = r2
            r18 = r11
            r19 = r14
            r20 = r26
            r22 = r25
            r17.<init>(r18, r19, r20, r21, r22)
            r15.r(r2)
        L_0x0211:
            yf.l r2 = (yf.C6798l) r2
            k0.i r0 = androidx.compose.ui.layout.c.a(r13, r2)
            k0.c$a r2 = k0.c.f23044a
            k0.c r2 = r2.o()
            r3 = 0
            H0.F r2 = androidx.compose.foundation.layout.d.h(r2, r3)
            int r4 = Y.C1494j.a(r15, r3)
            Y.y r3 = r15.p()
            k0.i r0 = k0.h.e(r15, r0)
            J0.g$a r5 = J0.C1241g.f3853J
            yf.a r6 = r5.a()
            Y.f r7 = r15.j()
            if (r7 != 0) goto L_0x023d
            Y.C1494j.c()
        L_0x023d:
            r15.F()
            boolean r7 = r15.f()
            if (r7 == 0) goto L_0x024a
            r15.U(r6)
            goto L_0x024d
        L_0x024a:
            r15.q()
        L_0x024d:
            Y.m r6 = Y.F1.a(r15)
            yf.p r7 = r5.c()
            Y.F1.b(r6, r2, r7)
            yf.p r2 = r5.e()
            Y.F1.b(r6, r3, r2)
            yf.p r2 = r5.b()
            boolean r3 = r6.f()
            if (r3 != 0) goto L_0x0277
            java.lang.Object r3 = r6.A()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            boolean r3 = kotlin.jvm.internal.C6496s.c(r3, r7)
            if (r3 != 0) goto L_0x0285
        L_0x0277:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r6.r(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r6.V(r3, r2)
        L_0x0285:
            yf.p r2 = r5.d()
            Y.F1.b(r6, r0, r2)
            androidx.compose.foundation.layout.f r0 = androidx.compose.foundation.layout.f.f12848a
            int r0 = r24 >> 6
            r0 = r0 & 112(0x70, float:1.57E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = r33
            r2 = r13
            r4.invoke(r1, r15, r0)
            r15.u()
            r0 = 426363998(0x1969cc5e, float:1.2087089E-23)
            r15.T(r0)
            r1 = r30
            r0 = r11
            if (r1 == 0) goto L_0x02d3
            boolean r3 = r15.C(r0)
            boolean r5 = r15.d(r14)
            r3 = r3 | r5
            java.lang.Object r5 = r15.A()
            if (r3 != 0) goto L_0x02bf
            java.lang.Object r3 = r23.a()
            if (r5 != r3) goto L_0x02cb
        L_0x02bf:
            V.I$b r5 = new V.I$b
            r6 = r25
            r3 = r26
            r5.<init>(r0, r14, r3, r6)
            r15.r(r5)
        L_0x02cb:
            yf.a r5 = (yf.C6787a) r5
            r3 = r28
            r6 = 0
            h(r0, r3, r5, r15, r6)
        L_0x02d3:
            r15.M()
            r3 = r27
            r0 = 4
            if (r3 != r0) goto L_0x02de
            r0 = r16
            goto L_0x02df
        L_0x02de:
            r0 = 0
        L_0x02df:
            java.lang.Object r5 = r15.A()
            if (r0 != 0) goto L_0x02eb
            java.lang.Object r0 = r23.a()
            if (r5 != r0) goto L_0x02f5
        L_0x02eb:
            V.I$c r5 = new V.I$c
            r0 = r29
            r5.<init>(r1, r0)
            r15.r(r5)
        L_0x02f5:
            yf.a r5 = (yf.C6787a) r5
            r0 = 0
            Y.P.h(r5, r15, r0)
            r5 = r34
            r0 = 32
            if (r5 != r0) goto L_0x0302
            goto L_0x0304
        L_0x0302:
            r16 = 0
        L_0x0304:
            java.lang.Object r0 = r15.A()
            if (r16 != 0) goto L_0x0314
            java.lang.Object r5 = r23.a()
            if (r0 != r5) goto L_0x0311
            goto L_0x0314
        L_0x0311:
            r5 = r31
            goto L_0x031e
        L_0x0314:
            V.I$d r0 = new V.I$d
            r5 = r31
            r0.<init>(r5)
            r15.r(r0)
        L_0x031e:
            yf.a r0 = (yf.C6787a) r0
            r6 = 0
            e.C1931d.a(r1, r0, r15, r3, r6)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x032d
            Y.C1506p.P()
        L_0x032d:
            r3 = r2
        L_0x032e:
            Y.Y0 r7 = r15.k()
            if (r7 == 0) goto L_0x0347
            V.I$e r8 = new V.I$e
            r0 = r8
            r1 = r30
            r2 = r31
            r4 = r33
            r5 = r35
            r6 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0347:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.I.a(boolean, yf.l, k0.i, yf.q, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C1197s b(C1510r0 r0Var) {
        return (C1197s) r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void c(C1510r0 r0Var, C1197s sVar) {
        r0Var.setValue(sVar);
    }

    /* access modifiers changed from: private */
    public static final int d(C1505o0 o0Var) {
        return o0Var.b();
    }

    /* access modifiers changed from: private */
    public static final void e(C1505o0 o0Var, int i10) {
        o0Var.f(i10);
    }

    /* access modifiers changed from: private */
    public static final int f(C1505o0 o0Var) {
        return o0Var.b();
    }

    /* access modifiers changed from: private */
    public static final void g(C1505o0 o0Var, int i10) {
        o0Var.f(i10);
    }

    /* access modifiers changed from: private */
    public static final void h(View view, c1.d dVar, C6787a aVar, C1500m mVar, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        C1500m h10 = mVar.h(-1319522472);
        if ((i10 & 6) == 0) {
            if (h10.C(view)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (h10.S(dVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (h10.C(aVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(-1319522472, i11, -1, "androidx.compose.material3.SoftKeyboardListener (ExposedDropdownMenu.android.kt:237)");
            }
            boolean C10 = h10.C(view);
            if ((i11 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = C10 | z10;
            Object A10 = h10.A();
            if (z11 || A10 == C1500m.f10026a.a()) {
                A10 = new g(view, aVar);
                h10.r(A10);
            }
            P.b(view, dVar, (C6798l) A10, h10, i11 & 126);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new h(view, dVar, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final int u(C2423i iVar, C2423i iVar2, int i10) {
        int i11;
        if (iVar2 == null) {
            return 0;
        }
        float f10 = (float) i10;
        float l10 = iVar.l() + f10;
        float e10 = iVar.e() - f10;
        if (iVar2.l() > iVar.e() || iVar2.e() < iVar.l()) {
            i11 = Af.a.d(e10 - l10);
        } else {
            i11 = Af.a.d(Math.max(iVar2.l() - l10, e10 - iVar2.e()));
        }
        return Math.max(i11, 0);
    }

    /* access modifiers changed from: private */
    public static final k0.i v(k0.i iVar, boolean z10, C6787a aVar, String str, String str2, String str3, String str4, C1651m1 m1Var) {
        k0.i iVar2 = iVar;
        return m.d(T.d(iVar, aVar, new i(str, aVar, (C6658d) null)), false, new j(str, z10, str2, str3, str4, aVar, m1Var), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C2423i w(C1197s sVar) {
        if (sVar == null) {
            return C2423i.f25325e.a();
        }
        return C2424j.b(C1198t.f(sVar), s.d(sVar.b()));
    }

    /* access modifiers changed from: private */
    public static final C2423i x(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return Z1.e(rect);
    }
}
