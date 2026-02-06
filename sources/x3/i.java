package X3;

import Ug.C5572i;
import Ug.C5600w0;
import Ug.H;
import Ug.K;
import Ug.L;
import Ug.M;
import Ug.S;
import Ug.U0;
import Ug.Z;
import X3.b;
import a4.C3112e;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import d4.C3464a;
import d4.C3465b;
import d4.C3466c;
import d4.C3468e;
import d4.C3469f;
import d4.j;
import d4.k;
import d4.l;
import e4.C3487a;
import e4.C3489c;
import f4.C3504a;
import f4.C3506c;
import g4.C3523a;
import g4.C3524b;
import g4.C3525c;
import g4.C3527e;
import h4.C3568c;
import j4.C3616c;
import j4.C3618e;
import j4.C3619f;
import j4.C3622i;
import j4.C3623j;
import j4.C3626m;
import j4.C3630q;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import k4.C3667i;
import kotlin.Lazy;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l4.C3738d;
import lf.C6514M;
import mf.C6565s;
import o4.C3876B;
import o4.w;
import o4.z;
import qf.C6655a;
import qf.C6658d;
import rf.C6680b;
import rh.v;
import yf.p;

public final class i implements g {

    /* renamed from: o  reason: collision with root package name */
    public static final a f9702o = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Context f9703a;

    /* renamed from: b  reason: collision with root package name */
    private final C3616c f9704b;

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f9705c;

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f9706d;

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f9707e;

    /* renamed from: f  reason: collision with root package name */
    private final b.c f9708f;

    /* renamed from: g  reason: collision with root package name */
    private final a f9709g;

    /* renamed from: h  reason: collision with root package name */
    private final w f9710h;

    /* renamed from: i  reason: collision with root package name */
    private final K f9711i = L.a(U0.b((C5600w0) null, 1, (Object) null).n1(Z.c().D1()).n1(new g(H.f65314N, this)));

    /* renamed from: j  reason: collision with root package name */
    private final C3876B f9712j;

    /* renamed from: k  reason: collision with root package name */
    private final C3630q f9713k;

    /* renamed from: l  reason: collision with root package name */
    private final a f9714l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final List f9715m;

    /* renamed from: n  reason: collision with root package name */
    private final AtomicBoolean f9716n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f9717a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f9718b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C3622i f9719c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, C3622i iVar2, C6658d dVar) {
            super(2, dVar);
            this.f9718b = iVar;
            this.f9719c = iVar2;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new b(this.f9718b, this.f9719c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f9717a;
            if (i10 == 0) {
                lf.w.b(obj);
                i iVar = this.f9718b;
                C3622i iVar2 = this.f9719c;
                this.f9717a = 1;
                obj = iVar.g(iVar2, 0, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                lf.w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i iVar3 = this.f9718b;
            if (((C3623j) obj) instanceof C3619f) {
                iVar3.i();
            }
            return obj;
        }
    }

    static final class c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f9720a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f9721b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C3622i f9722c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f9723d;

        static final class a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f9724a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ i f9725b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C3622i f9726c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(i iVar, C3622i iVar2, C6658d dVar) {
                super(2, dVar);
                this.f9725b = iVar;
                this.f9726c = iVar2;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new a(this.f9725b, this.f9726c, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f9724a;
                if (i10 == 0) {
                    lf.w.b(obj);
                    i iVar = this.f9725b;
                    C3622i iVar2 = this.f9726c;
                    this.f9724a = 1;
                    obj = iVar.g(iVar2, 1, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    lf.w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C3622i iVar, i iVar2, C6658d dVar) {
            super(2, dVar);
            this.f9722c = iVar;
            this.f9723d = iVar2;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            c cVar = new c(this.f9722c, this.f9723d, dVar);
            cVar.f9721b = obj;
            return cVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f9720a;
            if (i10 == 0) {
                lf.w.b(obj);
                S b10 = C5576k.b((K) this.f9721b, Z.c().D1(), (M) null, new a(this.f9723d, this.f9722c, (C6658d) null), 2, (Object) null);
                o4.l.l(((C3738d) this.f9722c.M()).a()).b(b10);
                this.f9720a = 1;
                obj = b10.y(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                lf.w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    static final class d extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f9727a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f9728b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C3622i f9729c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar, C3622i iVar2, C6658d dVar) {
            super(2, dVar);
            this.f9728b = iVar;
            this.f9729c = iVar2;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new d(this.f9728b, this.f9729c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((d) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f9727a;
            if (i10 == 0) {
                lf.w.b(obj);
                i iVar = this.f9728b;
                C3622i iVar2 = this.f9729c;
                this.f9727a = 1;
                obj = iVar.g(iVar2, 1, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                lf.w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f9730a;

        /* renamed from: b  reason: collision with root package name */
        Object f9731b;

        /* renamed from: c  reason: collision with root package name */
        Object f9732c;

        /* renamed from: d  reason: collision with root package name */
        Object f9733d;

        /* renamed from: e  reason: collision with root package name */
        Object f9734e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f9735f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i f9736g;

        /* renamed from: h  reason: collision with root package name */
        int f9737h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(i iVar, C6658d dVar) {
            super(dVar);
            this.f9736g = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f9735f = obj;
            this.f9737h |= Integer.MIN_VALUE;
            return this.f9736g.g((C3622i) null, 0, this);
        }
    }

    static final class f extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f9738a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C3622i f9739b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f9740c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C3667i f9741d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f9742e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Bitmap f9743f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C3622i iVar, i iVar2, C3667i iVar3, b bVar, Bitmap bitmap, C6658d dVar) {
            super(2, dVar);
            this.f9739b = iVar;
            this.f9740c = iVar2;
            this.f9741d = iVar3;
            this.f9742e = bVar;
            this.f9743f = bitmap;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new f(this.f9739b, this.f9740c, this.f9741d, this.f9742e, this.f9743f, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((f) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object f10 = C6680b.f();
            int i10 = this.f9738a;
            if (i10 == 0) {
                lf.w.b(obj);
                C3622i iVar = this.f9739b;
                List f11 = this.f9740c.f9715m;
                C3622i iVar2 = this.f9739b;
                C3667i iVar3 = this.f9741d;
                b bVar = this.f9742e;
                if (this.f9743f != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C3489c cVar = new C3489c(iVar, f11, 0, iVar2, iVar3, bVar, z10);
                C3622i iVar4 = this.f9739b;
                this.f9738a = 1;
                obj = cVar.g(iVar4, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                lf.w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    public static final class g extends C6655a implements H {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f9744b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(H.a aVar, i iVar) {
            super(aVar);
            this.f9744b = iVar;
        }

        public void I(qf.g gVar, Throwable th2) {
            this.f9744b.i();
        }
    }

    public i(Context context, C3616c cVar, Lazy lazy, Lazy lazy2, Lazy lazy3, b.c cVar2, a aVar, w wVar, z zVar) {
        this.f9703a = context;
        this.f9704b = cVar;
        this.f9705c = lazy;
        this.f9706d = lazy2;
        this.f9707e = lazy3;
        this.f9708f = cVar2;
        this.f9709g = aVar;
        this.f9710h = wVar;
        C3876B b10 = new C3876B(this);
        this.f9712j = b10;
        C3630q qVar = new C3630q(this, b10, (z) null);
        this.f9713k = qVar;
        Class<Uri> cls = Uri.class;
        Class<File> cls2 = File.class;
        this.f9714l = aVar.h().d(new C3525c(), v.class).d(new g4.g(), String.class).d(new C3524b(), cls).d(new g4.f(), cls).d(new C3527e(), Integer.class).d(new C3523a(), byte[].class).c(new C3506c(), cls).c(new C3504a(wVar.a()), cls2).b(new k.b(lazy3, lazy2, wVar.e()), cls).b(new j.a(), cls2).b(new C3464a.C0663a(), cls).b(new C3468e.a(), cls).b(new l.b(), cls).b(new C3469f.a(), Drawable.class).b(new C3465b.a(), Bitmap.class).b(new C3466c.a(), ByteBuffer.class).a(new C3112e.c(wVar.c(), wVar.b())).e();
        this.f9715m = C6565s.L0(getComponents().c(), new C3487a(this, b10, qVar, (z) null));
        this.f9716n = new AtomicBoolean(false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: X3.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: j4.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: j4.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: X3.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: X3.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: j4.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: j4.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: X3.i} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f8 A[Catch:{ all -> 0x0103 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0113 A[Catch:{ all -> 0x0103 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0121 A[Catch:{ all -> 0x0103 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012b A[Catch:{ all -> 0x0103 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0137 A[Catch:{ all -> 0x0103 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0153 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0185 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0190 A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019b A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01bd A[Catch:{ all -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01d0 A[SYNTHETIC, Splitter:B:96:0x01d0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(j4.C3622i r21, int r22, qf.C6658d r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r23
            boolean r3 = r2 instanceof X3.i.e
            if (r3 == 0) goto L_0x0019
            r3 = r2
            X3.i$e r3 = (X3.i.e) r3
            int r4 = r3.f9737h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f9737h = r4
            goto L_0x001e
        L_0x0019:
            X3.i$e r3 = new X3.i$e
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f9735f
            java.lang.Object r4 = rf.C6680b.f()
            int r5 = r3.f9737h
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0097
            if (r5 == r8) goto L_0x0078
            if (r5 == r7) goto L_0x0056
            if (r5 != r6) goto L_0x004e
            java.lang.Object r0 = r3.f9733d
            r4 = r0
            X3.b r4 = (X3.b) r4
            java.lang.Object r0 = r3.f9732c
            r5 = r0
            j4.i r5 = (j4.C3622i) r5
            java.lang.Object r0 = r3.f9731b
            r6 = r0
            j4.p r6 = (j4.C3629p) r6
            java.lang.Object r0 = r3.f9730a
            r3 = r0
            X3.i r3 = (X3.i) r3
            lf.w.b(r2)     // Catch:{ all -> 0x004b }
            goto L_0x018a
        L_0x004b:
            r0 = move-exception
            goto L_0x01b9
        L_0x004e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0056:
            java.lang.Object r0 = r3.f9734e
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            java.lang.Object r5 = r3.f9733d
            X3.b r5 = (X3.b) r5
            java.lang.Object r7 = r3.f9732c
            j4.i r7 = (j4.C3622i) r7
            java.lang.Object r8 = r3.f9731b
            j4.p r8 = (j4.C3629p) r8
            java.lang.Object r10 = r3.f9730a
            X3.i r10 = (X3.i) r10
            lf.w.b(r2)     // Catch:{ all -> 0x0071 }
            r17 = r0
            goto L_0x015d
        L_0x0071:
            r0 = move-exception
            r4 = r5
            r5 = r7
            r6 = r8
            r3 = r10
            goto L_0x01b9
        L_0x0078:
            java.lang.Object r0 = r3.f9733d
            r5 = r0
            X3.b r5 = (X3.b) r5
            java.lang.Object r0 = r3.f9732c
            r8 = r0
            j4.i r8 = (j4.C3622i) r8
            java.lang.Object r0 = r3.f9731b
            r10 = r0
            j4.p r10 = (j4.C3629p) r10
            java.lang.Object r0 = r3.f9730a
            r11 = r0
            X3.i r11 = (X3.i) r11
            lf.w.b(r2)     // Catch:{ all -> 0x0090 }
            goto L_0x00e7
        L_0x0090:
            r0 = move-exception
            r4 = r5
            r5 = r8
            r6 = r10
        L_0x0094:
            r3 = r11
            goto L_0x01b9
        L_0x0097:
            lf.w.b(r2)
            j4.q r2 = r1.f9713k
            qf.g r5 = r3.getContext()
            Ug.w0 r5 = Ug.A0.n(r5)
            j4.p r2 = r2.g(r0, r5)
            r2.n()
            j4.i$a r0 = j4.C3622i.R(r0, r9, r8, r9)
            j4.c r5 = r20.b()
            j4.i$a r0 = r0.e(r5)
            j4.i r5 = r0.a()
            X3.b$c r0 = r1.f9708f
            X3.b r10 = r0.a(r5)
            java.lang.Object r0 = r5.m()     // Catch:{ all -> 0x00e9 }
            j4.k r11 = j4.C3624k.f44749a     // Catch:{ all -> 0x00e9 }
            if (r0 == r11) goto L_0x01b3
            r2.start()     // Catch:{ all -> 0x00e9 }
            if (r22 != 0) goto L_0x00ef
            androidx.lifecycle.m r0 = r5.z()     // Catch:{ all -> 0x00e9 }
            r3.f9730a = r1     // Catch:{ all -> 0x00e9 }
            r3.f9731b = r2     // Catch:{ all -> 0x00e9 }
            r3.f9732c = r5     // Catch:{ all -> 0x00e9 }
            r3.f9733d = r10     // Catch:{ all -> 0x00e9 }
            r3.f9737h = r8     // Catch:{ all -> 0x00e9 }
            java.lang.Object r0 = o4.i.a(r0, r3)     // Catch:{ all -> 0x00e9 }
            if (r0 != r4) goto L_0x00e3
            return r4
        L_0x00e3:
            r11 = r1
            r8 = r5
            r5 = r10
            r10 = r2
        L_0x00e7:
            r2 = r10
            goto L_0x00f2
        L_0x00e9:
            r0 = move-exception
            r3 = r1
            r6 = r2
            r4 = r10
            goto L_0x01b9
        L_0x00ef:
            r11 = r1
            r8 = r5
            r5 = r10
        L_0x00f2:
            h4.c r0 = r11.d()     // Catch:{ all -> 0x0103 }
            if (r0 == 0) goto L_0x0110
            h4.c$b r10 = r8.G()     // Catch:{ all -> 0x0103 }
            if (r10 == 0) goto L_0x0108
            h4.c$c r0 = r0.b(r10)     // Catch:{ all -> 0x0103 }
            goto L_0x0109
        L_0x0103:
            r0 = move-exception
            r6 = r2
            r4 = r5
            r5 = r8
            goto L_0x0094
        L_0x0108:
            r0 = r9
        L_0x0109:
            if (r0 == 0) goto L_0x0110
            android.graphics.Bitmap r0 = r0.a()     // Catch:{ all -> 0x0103 }
            goto L_0x0111
        L_0x0110:
            r0 = r9
        L_0x0111:
            if (r0 == 0) goto L_0x0121
            android.content.Context r10 = r8.l()     // Catch:{ all -> 0x0103 }
            android.content.res.Resources r10 = r10.getResources()     // Catch:{ all -> 0x0103 }
            android.graphics.drawable.BitmapDrawable r12 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x0103 }
            r12.<init>(r10, r0)     // Catch:{ all -> 0x0103 }
            goto L_0x0125
        L_0x0121:
            android.graphics.drawable.Drawable r12 = r8.F()     // Catch:{ all -> 0x0103 }
        L_0x0125:
            l4.c r10 = r8.M()     // Catch:{ all -> 0x0103 }
            if (r10 == 0) goto L_0x012e
            r10.onStart(r12)     // Catch:{ all -> 0x0103 }
        L_0x012e:
            r5.onStart(r8)     // Catch:{ all -> 0x0103 }
            j4.i$b r10 = r8.A()     // Catch:{ all -> 0x0103 }
            if (r10 == 0) goto L_0x013a
            r10.onStart(r8)     // Catch:{ all -> 0x0103 }
        L_0x013a:
            r5.a(r8)     // Catch:{ all -> 0x0103 }
            k4.j r10 = r8.K()     // Catch:{ all -> 0x0103 }
            r3.f9730a = r11     // Catch:{ all -> 0x0103 }
            r3.f9731b = r2     // Catch:{ all -> 0x0103 }
            r3.f9732c = r8     // Catch:{ all -> 0x0103 }
            r3.f9733d = r5     // Catch:{ all -> 0x0103 }
            r3.f9734e = r0     // Catch:{ all -> 0x0103 }
            r3.f9737h = r7     // Catch:{ all -> 0x0103 }
            java.lang.Object r7 = r10.b(r3)     // Catch:{ all -> 0x0103 }
            if (r7 != r4) goto L_0x0154
            return r4
        L_0x0154:
            r17 = r0
            r10 = r11
            r19 = r8
            r8 = r2
            r2 = r7
            r7 = r19
        L_0x015d:
            r15 = r2
            k4.i r15 = (k4.C3667i) r15     // Catch:{ all -> 0x0071 }
            r5.e(r7, r15)     // Catch:{ all -> 0x0071 }
            Ug.G r0 = r7.y()     // Catch:{ all -> 0x0071 }
            X3.i$f r2 = new X3.i$f     // Catch:{ all -> 0x0071 }
            r18 = 0
            r12 = r2
            r13 = r7
            r14 = r10
            r16 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0071 }
            r3.f9730a = r10     // Catch:{ all -> 0x0071 }
            r3.f9731b = r8     // Catch:{ all -> 0x0071 }
            r3.f9732c = r7     // Catch:{ all -> 0x0071 }
            r3.f9733d = r5     // Catch:{ all -> 0x0071 }
            r3.f9734e = r9     // Catch:{ all -> 0x0071 }
            r3.f9737h = r6     // Catch:{ all -> 0x0071 }
            java.lang.Object r2 = Ug.C5572i.g(r0, r2, r3)     // Catch:{ all -> 0x0071 }
            if (r2 != r4) goto L_0x0186
            return r4
        L_0x0186:
            r4 = r5
            r5 = r7
            r6 = r8
            r3 = r10
        L_0x018a:
            j4.j r2 = (j4.C3623j) r2     // Catch:{ all -> 0x004b }
            boolean r0 = r2 instanceof j4.C3631r     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x019b
            r0 = r2
            j4.r r0 = (j4.C3631r) r0     // Catch:{ all -> 0x004b }
            l4.c r7 = r5.M()     // Catch:{ all -> 0x004b }
            r3.m(r0, r7, r4)     // Catch:{ all -> 0x004b }
            goto L_0x01a9
        L_0x019b:
            boolean r0 = r2 instanceof j4.C3619f     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x01ad
            r0 = r2
            j4.f r0 = (j4.C3619f) r0     // Catch:{ all -> 0x004b }
            l4.c r7 = r5.M()     // Catch:{ all -> 0x004b }
            r3.l(r0, r7, r4)     // Catch:{ all -> 0x004b }
        L_0x01a9:
            r6.y()
            return r2
        L_0x01ad:
            lf.s r0 = new lf.s     // Catch:{ all -> 0x004b }
            r0.<init>()     // Catch:{ all -> 0x004b }
            throw r0     // Catch:{ all -> 0x004b }
        L_0x01b3:
            j4.l r0 = new j4.l     // Catch:{ all -> 0x00e9 }
            r0.<init>()     // Catch:{ all -> 0x00e9 }
            throw r0     // Catch:{ all -> 0x00e9 }
        L_0x01b9:
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x01ce }
            if (r2 != 0) goto L_0x01d0
            j4.q r2 = r3.f9713k     // Catch:{ all -> 0x01ce }
            j4.f r0 = r2.a(r5, r0)     // Catch:{ all -> 0x01ce }
            l4.c r2 = r5.M()     // Catch:{ all -> 0x01ce }
            r3.l(r0, r2, r4)     // Catch:{ all -> 0x01ce }
            r6.y()
            return r0
        L_0x01ce:
            r0 = move-exception
            goto L_0x01d4
        L_0x01d0:
            r3.k(r5, r4)     // Catch:{ all -> 0x01ce }
            throw r0     // Catch:{ all -> 0x01ce }
        L_0x01d4:
            r6.y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.i.g(j4.i, int, qf.d):java.lang.Object");
    }

    private final void k(C3622i iVar, b bVar) {
        bVar.onCancel(iVar);
        C3622i.b A10 = iVar.A();
        if (A10 != null) {
            A10.onCancel(iVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        if (r5 != null) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void l(j4.C3619f r4, l4.C3737c r5, X3.b r6) {
        /*
            r3 = this;
            j4.i r0 = r4.b()
            boolean r1 = r5 instanceof n4.C3857d
            if (r1 != 0) goto L_0x000b
            if (r5 == 0) goto L_0x0037
            goto L_0x001e
        L_0x000b:
            j4.i r1 = r4.b()
            n4.c$a r1 = r1.P()
            r2 = r5
            n4.d r2 = (n4.C3857d) r2
            n4.c r1 = r1.a(r2, r4)
            boolean r2 = r1 instanceof n4.C3855b
            if (r2 == 0) goto L_0x0026
        L_0x001e:
            android.graphics.drawable.Drawable r1 = r4.a()
            r5.onError(r1)
            goto L_0x0037
        L_0x0026:
            j4.i r5 = r4.b()
            r6.g(r5, r1)
            r1.a()
            j4.i r5 = r4.b()
            r6.j(r5, r1)
        L_0x0037:
            r6.onError(r0, r4)
            j4.i$b r5 = r0.A()
            if (r5 == 0) goto L_0x0043
            r5.onError(r0, r4)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.i.l(j4.f, l4.c, X3.b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r5 != null) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m(j4.C3631r r4, l4.C3737c r5, X3.b r6) {
        /*
            r3 = this;
            j4.i r0 = r4.b()
            r4.c()
            boolean r1 = r5 instanceof n4.C3857d
            if (r1 != 0) goto L_0x000e
            if (r5 == 0) goto L_0x003a
            goto L_0x0021
        L_0x000e:
            j4.i r1 = r4.b()
            n4.c$a r1 = r1.P()
            r2 = r5
            n4.d r2 = (n4.C3857d) r2
            n4.c r1 = r1.a(r2, r4)
            boolean r2 = r1 instanceof n4.C3855b
            if (r2 == 0) goto L_0x0029
        L_0x0021:
            android.graphics.drawable.Drawable r1 = r4.a()
            r5.onSuccess(r1)
            goto L_0x003a
        L_0x0029:
            j4.i r5 = r4.b()
            r6.g(r5, r1)
            r1.a()
            j4.i r5 = r4.b()
            r6.j(r5, r1)
        L_0x003a:
            r6.onSuccess(r0, r4)
            j4.i$b r5 = r0.A()
            if (r5 == 0) goto L_0x0046
            r5.onSuccess(r0, r4)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.i.m(j4.r, l4.c, X3.b):void");
    }

    public Object a(C3622i iVar, C6658d dVar) {
        if (iVar.M() instanceof C3738d) {
            return L.e(new c(iVar, this, (C6658d) null), dVar);
        }
        return C5572i.g(Z.c().D1(), new d(this, iVar, (C6658d) null), dVar);
    }

    public C3616c b() {
        return this.f9704b;
    }

    public C3618e c(C3622i iVar) {
        S b10 = C5576k.b(this.f9711i, (qf.g) null, (M) null, new b(this, iVar, (C6658d) null), 3, (Object) null);
        if (iVar.M() instanceof C3738d) {
            return o4.l.l(((C3738d) iVar.M()).a()).b(b10);
        }
        return new C3626m(b10);
    }

    public C3568c d() {
        return (C3568c) this.f9705c.getValue();
    }

    public a getComponents() {
        return this.f9714l;
    }

    public final Context h() {
        return this.f9703a;
    }

    public final z i() {
        return null;
    }

    public final w j() {
        return this.f9710h;
    }

    public final void n(int i10) {
        C3568c cVar;
        Lazy lazy = this.f9705c;
        if (lazy != null && (cVar = (C3568c) lazy.getValue()) != null) {
            cVar.a(i10);
        }
    }
}
