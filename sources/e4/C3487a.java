package e4;

import Ug.C5572i;
import Ug.K;
import X3.a;
import a4.C3114g;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import d4.m;
import e4.C3488b;
import h4.C3568c;
import h4.C3569d;
import j4.C3622i;
import j4.C3627n;
import j4.C3630q;
import j4.C3631r;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import lf.C6514M;
import lf.w;
import mf.C6559l;
import o4.C3876B;
import o4.C3878a;
import o4.t;
import o4.z;
import qf.C6658d;
import rf.C6680b;
import yf.p;

/* renamed from: e4.a  reason: case insensitive filesystem */
public final class C3487a implements C3488b {

    /* renamed from: e  reason: collision with root package name */
    public static final C0670a f43249e = new C0670a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final X3.g f43250a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C3876B f43251b;

    /* renamed from: c  reason: collision with root package name */
    private final C3630q f43252c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C3569d f43253d;

    /* renamed from: e4.a$a  reason: collision with other inner class name */
    public static final class C0670a {
        public /* synthetic */ C0670a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0670a() {
        }
    }

    /* renamed from: e4.a$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable f43254a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f43255b;

        /* renamed from: c  reason: collision with root package name */
        private final C3114g f43256c;

        /* renamed from: d  reason: collision with root package name */
        private final String f43257d;

        public b(Drawable drawable, boolean z10, C3114g gVar, String str) {
            this.f43254a = drawable;
            this.f43255b = z10;
            this.f43256c = gVar;
            this.f43257d = str;
        }

        public static /* synthetic */ b b(b bVar, Drawable drawable, boolean z10, C3114g gVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                drawable = bVar.f43254a;
            }
            if ((i10 & 2) != 0) {
                z10 = bVar.f43255b;
            }
            if ((i10 & 4) != 0) {
                gVar = bVar.f43256c;
            }
            if ((i10 & 8) != 0) {
                str = bVar.f43257d;
            }
            return bVar.a(drawable, z10, gVar, str);
        }

        public final b a(Drawable drawable, boolean z10, C3114g gVar, String str) {
            return new b(drawable, z10, gVar, str);
        }

        public final C3114g c() {
            return this.f43256c;
        }

        public final String d() {
            return this.f43257d;
        }

        public final Drawable e() {
            return this.f43254a;
        }

        public final boolean f() {
            return this.f43255b;
        }
    }

    /* renamed from: e4.a$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f43258a;

        /* renamed from: b  reason: collision with root package name */
        Object f43259b;

        /* renamed from: c  reason: collision with root package name */
        Object f43260c;

        /* renamed from: d  reason: collision with root package name */
        Object f43261d;

        /* renamed from: e  reason: collision with root package name */
        Object f43262e;

        /* renamed from: f  reason: collision with root package name */
        Object f43263f;

        /* renamed from: g  reason: collision with root package name */
        Object f43264g;

        /* renamed from: h  reason: collision with root package name */
        Object f43265h;

        /* renamed from: i  reason: collision with root package name */
        int f43266i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f43267j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C3487a f43268k;

        /* renamed from: l  reason: collision with root package name */
        int f43269l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C3487a aVar, C6658d dVar) {
            super(dVar);
            this.f43268k = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f43267j = obj;
            this.f43269l |= Integer.MIN_VALUE;
            return this.f43268k.i((m) null, (a) null, (C3622i) null, (Object) null, (C3627n) null, (X3.b) null, this);
        }
    }

    /* renamed from: e4.a$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f43270a;

        /* renamed from: b  reason: collision with root package name */
        Object f43271b;

        /* renamed from: c  reason: collision with root package name */
        Object f43272c;

        /* renamed from: d  reason: collision with root package name */
        Object f43273d;

        /* renamed from: e  reason: collision with root package name */
        Object f43274e;

        /* renamed from: f  reason: collision with root package name */
        Object f43275f;

        /* renamed from: g  reason: collision with root package name */
        Object f43276g;

        /* renamed from: h  reason: collision with root package name */
        Object f43277h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f43278i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C3487a f43279j;

        /* renamed from: k  reason: collision with root package name */
        int f43280k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C3487a aVar, C6658d dVar) {
            super(dVar);
            this.f43279j = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f43278i = obj;
            this.f43280k |= Integer.MIN_VALUE;
            return this.f43279j.j((C3622i) null, (Object) null, (C3627n) null, (X3.b) null, this);
        }
    }

    /* renamed from: e4.a$e */
    static final class e extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f43281a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C3487a f43282b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ N f43283c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ N f43284d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C3622i f43285e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f43286f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ N f43287g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ X3.b f43288h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C3487a aVar, N n10, N n11, C3622i iVar, Object obj, N n12, X3.b bVar, C6658d dVar) {
            super(2, dVar);
            this.f43282b = aVar;
            this.f43283c = n10;
            this.f43284d = n11;
            this.f43285e = iVar;
            this.f43286f = obj;
            this.f43287g = n12;
            this.f43288h = bVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new e(this.f43282b, this.f43283c, this.f43284d, this.f43285e, this.f43286f, this.f43287g, this.f43288h, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((e) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f43281a;
            if (i10 == 0) {
                w.b(obj);
                C3487a aVar = this.f43282b;
                X3.b bVar = this.f43288h;
                this.f43281a = 1;
                obj = aVar.i((m) this.f43283c.f71759a, (a) this.f43284d.f71759a, this.f43285e, this.f43286f, (C3627n) this.f43287g.f71759a, bVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* renamed from: e4.a$f */
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f43289a;

        /* renamed from: b  reason: collision with root package name */
        Object f43290b;

        /* renamed from: c  reason: collision with root package name */
        Object f43291c;

        /* renamed from: d  reason: collision with root package name */
        Object f43292d;

        /* renamed from: e  reason: collision with root package name */
        Object f43293e;

        /* renamed from: f  reason: collision with root package name */
        Object f43294f;

        /* renamed from: g  reason: collision with root package name */
        Object f43295g;

        /* renamed from: h  reason: collision with root package name */
        int f43296h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f43297i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C3487a f43298j;

        /* renamed from: k  reason: collision with root package name */
        int f43299k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C3487a aVar, C6658d dVar) {
            super(dVar);
            this.f43298j = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f43297i = obj;
            this.f43299k |= Integer.MIN_VALUE;
            return this.f43298j.k((a) null, (C3622i) null, (Object) null, (C3627n) null, (X3.b) null, this);
        }
    }

    /* renamed from: e4.a$g */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f43300a;

        /* renamed from: b  reason: collision with root package name */
        Object f43301b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f43302c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C3487a f43303d;

        /* renamed from: e  reason: collision with root package name */
        int f43304e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C3487a aVar, C6658d dVar) {
            super(dVar);
            this.f43303d = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f43302c = obj;
            this.f43304e |= Integer.MIN_VALUE;
            return this.f43303d.a((C3488b.a) null, this);
        }
    }

    /* renamed from: e4.a$h */
    static final class h extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f43305a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C3487a f43306b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C3622i f43307c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f43308d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C3627n f43309e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ X3.b f43310f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C3568c.b f43311g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C3488b.a f43312h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C3487a aVar, C3622i iVar, Object obj, C3627n nVar, X3.b bVar, C3568c.b bVar2, C3488b.a aVar2, C6658d dVar) {
            super(2, dVar);
            this.f43306b = aVar;
            this.f43307c = iVar;
            this.f43308d = obj;
            this.f43309e = nVar;
            this.f43310f = bVar;
            this.f43311g = bVar2;
            this.f43312h = aVar2;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new h(this.f43306b, this.f43307c, this.f43308d, this.f43309e, this.f43310f, this.f43311g, this.f43312h, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((h) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C3568c.b bVar;
            Object f10 = C6680b.f();
            int i10 = this.f43305a;
            if (i10 == 0) {
                w.b(obj);
                C3487a aVar = this.f43306b;
                C3622i iVar = this.f43307c;
                Object obj2 = this.f43308d;
                C3627n nVar = this.f43309e;
                X3.b bVar2 = this.f43310f;
                this.f43305a = 1;
                obj = aVar.j(iVar, obj2, nVar, bVar2, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar3 = (b) obj;
            this.f43306b.f43251b.c();
            boolean h10 = this.f43306b.f43253d.h(this.f43311g, this.f43307c, bVar3);
            Drawable e10 = bVar3.e();
            C3622i iVar2 = this.f43307c;
            C3114g c10 = bVar3.c();
            C3568c.b bVar4 = this.f43311g;
            if (h10) {
                bVar = bVar4;
            } else {
                bVar = null;
            }
            return new C3631r(e10, iVar2, c10, bVar, bVar3.d(), bVar3.f(), o4.l.t(this.f43312h));
        }
    }

    /* renamed from: e4.a$i */
    static final class i extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f43313a;

        /* renamed from: b  reason: collision with root package name */
        Object f43314b;

        /* renamed from: c  reason: collision with root package name */
        int f43315c;

        /* renamed from: d  reason: collision with root package name */
        int f43316d;

        /* renamed from: e  reason: collision with root package name */
        int f43317e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f43318f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C3487a f43319g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f43320h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C3627n f43321i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ List f43322j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ X3.b f43323k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C3622i f43324l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C3487a aVar, b bVar, C3627n nVar, List list, X3.b bVar2, C3622i iVar, C6658d dVar) {
            super(2, dVar);
            this.f43319g = aVar;
            this.f43320h = bVar;
            this.f43321i = nVar;
            this.f43322j = list;
            this.f43323k = bVar2;
            this.f43324l = iVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            i iVar = new i(this.f43319g, this.f43320h, this.f43321i, this.f43322j, this.f43323k, this.f43324l, dVar);
            iVar.f43318f = obj;
            return iVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((i) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0059  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r10.f43317e
                r2 = 1
                if (r1 == 0) goto L_0x0027
                if (r1 != r2) goto L_0x001f
                int r1 = r10.f43316d
                int r3 = r10.f43315c
                java.lang.Object r4 = r10.f43314b
                j4.n r4 = (j4.C3627n) r4
                java.lang.Object r5 = r10.f43313a
                java.util.List r5 = (java.util.List) r5
                java.lang.Object r6 = r10.f43318f
                Ug.K r6 = (Ug.K) r6
                lf.w.b(r11)
                goto L_0x0076
            L_0x001f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0027:
                lf.w.b(r11)
                java.lang.Object r11 = r10.f43318f
                Ug.K r11 = (Ug.K) r11
                e4.a r1 = r10.f43319g
                e4.a$b r3 = r10.f43320h
                android.graphics.drawable.Drawable r3 = r3.e()
                j4.n r4 = r10.f43321i
                java.util.List r5 = r10.f43322j
                android.graphics.Bitmap r1 = r1.h(r3, r4, r5)
                X3.b r3 = r10.f43323k
                j4.i r4 = r10.f43324l
                r3.d(r4, r1)
                java.util.List r3 = r10.f43322j
                j4.n r4 = r10.f43321i
                r5 = r3
                java.util.Collection r5 = (java.util.Collection) r5
                int r5 = r5.size()
                r6 = 0
                r9 = r6
                r6 = r11
                r11 = r1
                r1 = r5
                r5 = r3
                r3 = r9
            L_0x0057:
                if (r3 >= r1) goto L_0x007d
                java.lang.Object r7 = r5.get(r3)
                m4.e r7 = (m4.e) r7
                k4.i r8 = r4.o()
                r10.f43318f = r6
                r10.f43313a = r5
                r10.f43314b = r4
                r10.f43315c = r3
                r10.f43316d = r1
                r10.f43317e = r2
                java.lang.Object r11 = r7.transform(r11, r8, r10)
                if (r11 != r0) goto L_0x0076
                return r0
            L_0x0076:
                android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
                Ug.L.f(r6)
                int r3 = r3 + r2
                goto L_0x0057
            L_0x007d:
                X3.b r0 = r10.f43323k
                j4.i r1 = r10.f43324l
                r0.f(r1, r11)
                e4.a$b r2 = r10.f43320h
                j4.i r0 = r10.f43324l
                android.content.Context r0 = r0.l()
                android.content.res.Resources r0 = r0.getResources()
                android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable
                r3.<init>(r0, r11)
                r7 = 14
                r8 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                e4.a$b r11 = e4.C3487a.b.b(r2, r3, r4, r5, r6, r7, r8)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: e4.C3487a.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C3487a(X3.g gVar, C3876B b10, C3630q qVar, z zVar) {
        this.f43250a = gVar;
        this.f43251b = b10;
        this.f43252c = qVar;
        this.f43253d = new C3569d(gVar, qVar, (z) null);
    }

    /* access modifiers changed from: private */
    public final Bitmap h(Drawable drawable, C3627n nVar, List list) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (C6559l.W(o4.l.o(), C3878a.c(bitmap))) {
                return bitmap;
            }
        }
        return t.f47014a.a(drawable, nVar.f(), nVar.o(), nVar.n(), nVar.c());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(d4.m r18, X3.a r19, j4.C3622i r20, java.lang.Object r21, j4.C3627n r22, X3.b r23, qf.C6658d r24) {
        /*
            r17 = this;
            r0 = r24
            boolean r1 = r0 instanceof e4.C3487a.c
            if (r1 == 0) goto L_0x0017
            r1 = r0
            e4.a$c r1 = (e4.C3487a.c) r1
            int r2 = r1.f43269l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f43269l = r2
            r2 = r17
            goto L_0x001e
        L_0x0017:
            e4.a$c r1 = new e4.a$c
            r2 = r17
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.f43267j
            java.lang.Object r3 = rf.C6680b.f()
            int r4 = r1.f43269l
            r5 = 1
            if (r4 == 0) goto L_0x0062
            if (r4 != r5) goto L_0x005a
            int r4 = r1.f43266i
            java.lang.Object r6 = r1.f43265h
            a4.j r6 = (a4.C3117j) r6
            java.lang.Object r7 = r1.f43264g
            X3.b r7 = (X3.b) r7
            java.lang.Object r8 = r1.f43263f
            j4.n r8 = (j4.C3627n) r8
            java.lang.Object r9 = r1.f43262e
            java.lang.Object r10 = r1.f43261d
            j4.i r10 = (j4.C3622i) r10
            java.lang.Object r11 = r1.f43260c
            X3.a r11 = (X3.a) r11
            java.lang.Object r12 = r1.f43259b
            d4.m r12 = (d4.m) r12
            java.lang.Object r13 = r1.f43258a
            e4.a r13 = (e4.C3487a) r13
            lf.w.b(r0)
            r14 = r11
            r11 = r1
            r1 = r14
            r15 = r10
            r10 = r4
            r4 = r15
            r16 = r8
            r8 = r7
            r7 = r16
            goto L_0x00b4
        L_0x005a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0062:
            lf.w.b(r0)
            r0 = 0
            r4 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r0
            r10 = r1
            r13 = r2
            r0 = r18
            r1 = r19
        L_0x0075:
            X3.g r11 = r13.f43250a
            kotlin.Pair r9 = r1.i(r0, r7, r11, r9)
            if (r9 == 0) goto L_0x00e5
            java.lang.Object r11 = r9.c()
            a4.j r11 = (a4.C3117j) r11
            java.lang.Object r9 = r9.d()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r9 = r9 + r5
            r8.k(r4, r11, r7)
            r10.f43258a = r13
            r10.f43259b = r0
            r10.f43260c = r1
            r10.f43261d = r4
            r10.f43262e = r6
            r10.f43263f = r7
            r10.f43264g = r8
            r10.f43265h = r11
            r10.f43266i = r9
            r10.f43269l = r5
            java.lang.Object r12 = r11.decode(r10)
            if (r12 != r3) goto L_0x00ac
            return r3
        L_0x00ac:
            r14 = r12
            r12 = r0
            r0 = r14
            r15 = r9
            r9 = r6
            r6 = r11
            r11 = r10
            r10 = r15
        L_0x00b4:
            a4.h r0 = (a4.C3115h) r0
            r8.h(r4, r6, r7, r0)
            if (r0 == 0) goto L_0x00e0
            e4.a$b r1 = new e4.a$b
            android.graphics.drawable.Drawable r3 = r0.a()
            boolean r0 = r0.b()
            a4.g r4 = r12.a()
            a4.S r5 = r12.c()
            boolean r6 = r5 instanceof a4.C3123p
            r7 = 0
            if (r6 == 0) goto L_0x00d5
            a4.p r5 = (a4.C3123p) r5
            goto L_0x00d6
        L_0x00d5:
            r5 = r7
        L_0x00d6:
            if (r5 == 0) goto L_0x00dc
            java.lang.String r7 = r5.q()
        L_0x00dc:
            r1.<init>(r3, r0, r4, r7)
            return r1
        L_0x00e0:
            r6 = r9
            r9 = r10
            r10 = r11
            r0 = r12
            goto L_0x0075
        L_0x00e5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to create a decoder that supports: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C3487a.i(d4.m, X3.a, j4.i, java.lang.Object, j4.n, X3.b, qf.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: d4.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: android.graphics.drawable.BitmapDrawable} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011d A[Catch:{ all -> 0x00bf }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011e A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0134 A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0174 A[SYNTHETIC, Splitter:B:54:0x0174] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(j4.C3622i r27, java.lang.Object r28, j4.C3627n r29, X3.b r30, qf.C6658d r31) {
        /*
            r26 = this;
            r8 = r26
            r0 = r31
            boolean r1 = r0 instanceof e4.C3487a.d
            if (r1 == 0) goto L_0x0018
            r1 = r0
            e4.a$d r1 = (e4.C3487a.d) r1
            int r2 = r1.f43280k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.f43280k = r2
        L_0x0016:
            r0 = r1
            goto L_0x001e
        L_0x0018:
            e4.a$d r1 = new e4.a$d
            r1.<init>(r8, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r1 = r0.f43278i
            java.lang.Object r9 = rf.C6680b.f()
            int r2 = r0.f43280k
            r10 = 3
            r11 = 2
            r3 = 1
            r12 = 0
            if (r2 == 0) goto L_0x0088
            if (r2 == r3) goto L_0x005b
            if (r2 == r11) goto L_0x003f
            if (r2 != r10) goto L_0x0037
            lf.w.b(r1)
            goto L_0x01cb
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003f:
            java.lang.Object r2 = r0.f43274e
            kotlin.jvm.internal.N r2 = (kotlin.jvm.internal.N) r2
            java.lang.Object r3 = r0.f43273d
            kotlin.jvm.internal.N r3 = (kotlin.jvm.internal.N) r3
            java.lang.Object r4 = r0.f43272c
            X3.b r4 = (X3.b) r4
            java.lang.Object r5 = r0.f43271b
            j4.i r5 = (j4.C3622i) r5
            java.lang.Object r6 = r0.f43270a
            e4.a r6 = (e4.C3487a) r6
            lf.w.b(r1)     // Catch:{ all -> 0x0058 }
            goto L_0x0168
        L_0x0058:
            r0 = move-exception
            goto L_0x01ea
        L_0x005b:
            java.lang.Object r2 = r0.f43277h
            kotlin.jvm.internal.N r2 = (kotlin.jvm.internal.N) r2
            java.lang.Object r3 = r0.f43276g
            kotlin.jvm.internal.N r3 = (kotlin.jvm.internal.N) r3
            java.lang.Object r4 = r0.f43275f
            kotlin.jvm.internal.N r4 = (kotlin.jvm.internal.N) r4
            java.lang.Object r5 = r0.f43274e
            kotlin.jvm.internal.N r5 = (kotlin.jvm.internal.N) r5
            java.lang.Object r6 = r0.f43273d
            X3.b r6 = (X3.b) r6
            java.lang.Object r7 = r0.f43272c
            java.lang.Object r13 = r0.f43271b
            j4.i r13 = (j4.C3622i) r13
            java.lang.Object r14 = r0.f43270a
            e4.a r14 = (e4.C3487a) r14
            lf.w.b(r1)     // Catch:{ all -> 0x0084 }
            r15 = r3
            r19 = r4
            r3 = r5
            r21 = r7
            goto L_0x0129
        L_0x0084:
            r0 = move-exception
            r2 = r3
            goto L_0x01ea
        L_0x0088:
            lf.w.b(r1)
            kotlin.jvm.internal.N r13 = new kotlin.jvm.internal.N
            r13.<init>()
            r1 = r29
            r13.f71759a = r1
            kotlin.jvm.internal.N r14 = new kotlin.jvm.internal.N
            r14.<init>()
            X3.g r1 = r8.f43250a
            X3.a r1 = r1.getComponents()
            r14.f71759a = r1
            kotlin.jvm.internal.N r15 = new kotlin.jvm.internal.N
            r15.<init>()
            j4.q r1 = r8.f43252c     // Catch:{ all -> 0x00bf }
            java.lang.Object r2 = r13.f71759a     // Catch:{ all -> 0x00bf }
            j4.n r2 = (j4.C3627n) r2     // Catch:{ all -> 0x00bf }
            j4.n r1 = r1.h(r2)     // Catch:{ all -> 0x00bf }
            r13.f71759a = r1     // Catch:{ all -> 0x00bf }
            kotlin.Pair r1 = r27.w()     // Catch:{ all -> 0x00bf }
            if (r1 != 0) goto L_0x00c3
            a4.j$a r1 = r27.o()     // Catch:{ all -> 0x00bf }
            if (r1 == 0) goto L_0x00ec
            goto L_0x00c3
        L_0x00bf:
            r0 = move-exception
            r2 = r15
            goto L_0x01ea
        L_0x00c3:
            java.lang.Object r1 = r14.f71759a     // Catch:{ all -> 0x00bf }
            X3.a r1 = (X3.a) r1     // Catch:{ all -> 0x00bf }
            X3.a$a r1 = r1.h()     // Catch:{ all -> 0x00bf }
            kotlin.Pair r2 = r27.w()     // Catch:{ all -> 0x00bf }
            r4 = 0
            if (r2 == 0) goto L_0x00d9
            java.util.List r5 = r1.g()     // Catch:{ all -> 0x00bf }
            r5.add(r4, r2)     // Catch:{ all -> 0x00bf }
        L_0x00d9:
            a4.j$a r2 = r27.o()     // Catch:{ all -> 0x00bf }
            if (r2 == 0) goto L_0x00e6
            java.util.List r5 = r1.f()     // Catch:{ all -> 0x00bf }
            r5.add(r4, r2)     // Catch:{ all -> 0x00bf }
        L_0x00e6:
            X3.a r1 = r1.e()     // Catch:{ all -> 0x00bf }
            r14.f71759a = r1     // Catch:{ all -> 0x00bf }
        L_0x00ec:
            java.lang.Object r1 = r14.f71759a     // Catch:{ all -> 0x00bf }
            r2 = r1
            X3.a r2 = (X3.a) r2     // Catch:{ all -> 0x00bf }
            java.lang.Object r1 = r13.f71759a     // Catch:{ all -> 0x00bf }
            r5 = r1
            j4.n r5 = (j4.C3627n) r5     // Catch:{ all -> 0x00bf }
            r0.f43270a = r8     // Catch:{ all -> 0x00bf }
            r7 = r27
            r0.f43271b = r7     // Catch:{ all -> 0x00bf }
            r6 = r28
            r0.f43272c = r6     // Catch:{ all -> 0x00bf }
            r4 = r30
            r0.f43273d = r4     // Catch:{ all -> 0x00bf }
            r0.f43274e = r13     // Catch:{ all -> 0x00bf }
            r0.f43275f = r14     // Catch:{ all -> 0x00bf }
            r0.f43276g = r15     // Catch:{ all -> 0x00bf }
            r0.f43277h = r15     // Catch:{ all -> 0x00bf }
            r0.f43280k = r3     // Catch:{ all -> 0x00bf }
            r1 = r26
            r3 = r27
            r4 = r28
            r6 = r30
            r7 = r0
            java.lang.Object r1 = r1.k(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00bf }
            if (r1 != r9) goto L_0x011e
            return r9
        L_0x011e:
            r21 = r28
            r6 = r30
            r3 = r13
            r19 = r14
            r2 = r15
            r13 = r27
            r14 = r8
        L_0x0129:
            r2.f71759a = r1     // Catch:{ all -> 0x00bf }
            java.lang.Object r1 = r15.f71759a     // Catch:{ all -> 0x00bf }
            r2 = r1
            d4.h r2 = (d4.C3471h) r2     // Catch:{ all -> 0x00bf }
            boolean r4 = r2 instanceof d4.m     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0174
            Ug.G r1 = r13.n()     // Catch:{ all -> 0x00bf }
            e4.a$e r2 = new e4.a$e     // Catch:{ all -> 0x00bf }
            r24 = 0
            r16 = r2
            r17 = r14
            r18 = r15
            r20 = r13
            r22 = r3
            r23 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x00bf }
            r0.f43270a = r14     // Catch:{ all -> 0x00bf }
            r0.f43271b = r13     // Catch:{ all -> 0x00bf }
            r0.f43272c = r6     // Catch:{ all -> 0x00bf }
            r0.f43273d = r3     // Catch:{ all -> 0x00bf }
            r0.f43274e = r15     // Catch:{ all -> 0x00bf }
            r0.f43275f = r12     // Catch:{ all -> 0x00bf }
            r0.f43276g = r12     // Catch:{ all -> 0x00bf }
            r0.f43277h = r12     // Catch:{ all -> 0x00bf }
            r0.f43280k = r11     // Catch:{ all -> 0x00bf }
            java.lang.Object r1 = Ug.C5572i.g(r1, r2, r0)     // Catch:{ all -> 0x00bf }
            if (r1 != r9) goto L_0x0164
            return r9
        L_0x0164:
            r4 = r6
            r5 = r13
            r6 = r14
            r2 = r15
        L_0x0168:
            e4.a$b r1 = (e4.C3487a.b) r1     // Catch:{ all -> 0x0058 }
            r15 = r2
            r2 = r6
            r6 = r4
            r4 = r5
            r25 = r3
            r3 = r1
            r1 = r25
            goto L_0x0197
        L_0x0174:
            boolean r2 = r2 instanceof d4.C3470g     // Catch:{ all -> 0x00bf }
            if (r2 == 0) goto L_0x01e4
            e4.a$b r2 = new e4.a$b     // Catch:{ all -> 0x00bf }
            d4.g r1 = (d4.C3470g) r1     // Catch:{ all -> 0x00bf }
            android.graphics.drawable.Drawable r1 = r1.b()     // Catch:{ all -> 0x00bf }
            java.lang.Object r4 = r15.f71759a     // Catch:{ all -> 0x00bf }
            d4.g r4 = (d4.C3470g) r4     // Catch:{ all -> 0x00bf }
            boolean r4 = r4.c()     // Catch:{ all -> 0x00bf }
            java.lang.Object r5 = r15.f71759a     // Catch:{ all -> 0x00bf }
            d4.g r5 = (d4.C3470g) r5     // Catch:{ all -> 0x00bf }
            a4.g r5 = r5.a()     // Catch:{ all -> 0x00bf }
            r2.<init>(r1, r4, r5, r12)     // Catch:{ all -> 0x00bf }
            r1 = r3
            r4 = r13
            r3 = r2
            r2 = r14
        L_0x0197:
            java.lang.Object r5 = r15.f71759a
            boolean r7 = r5 instanceof d4.m
            if (r7 == 0) goto L_0x01a0
            d4.m r5 = (d4.m) r5
            goto L_0x01a1
        L_0x01a0:
            r5 = r12
        L_0x01a1:
            if (r5 == 0) goto L_0x01ac
            a4.S r5 = r5.c()
            if (r5 == 0) goto L_0x01ac
            o4.l.d(r5)
        L_0x01ac:
            java.lang.Object r1 = r1.f71759a
            r5 = r1
            j4.n r5 = (j4.C3627n) r5
            r0.f43270a = r12
            r0.f43271b = r12
            r0.f43272c = r12
            r0.f43273d = r12
            r0.f43274e = r12
            r0.f43275f = r12
            r0.f43276g = r12
            r0.f43277h = r12
            r0.f43280k = r10
            r7 = r0
            java.lang.Object r1 = r2.l(r3, r4, r5, r6, r7)
            if (r1 != r9) goto L_0x01cb
            return r9
        L_0x01cb:
            e4.a$b r1 = (e4.C3487a.b) r1
            android.graphics.drawable.Drawable r0 = r1.e()
            boolean r2 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r2 == 0) goto L_0x01d8
            r12 = r0
            android.graphics.drawable.BitmapDrawable r12 = (android.graphics.drawable.BitmapDrawable) r12
        L_0x01d8:
            if (r12 == 0) goto L_0x01e3
            android.graphics.Bitmap r0 = r12.getBitmap()
            if (r0 == 0) goto L_0x01e3
            r0.prepareToDraw()
        L_0x01e3:
            return r1
        L_0x01e4:
            lf.s r0 = new lf.s     // Catch:{ all -> 0x00bf }
            r0.<init>()     // Catch:{ all -> 0x00bf }
            throw r0     // Catch:{ all -> 0x00bf }
        L_0x01ea:
            java.lang.Object r1 = r2.f71759a
            boolean r2 = r1 instanceof d4.m
            if (r2 == 0) goto L_0x01f3
            r12 = r1
            d4.m r12 = (d4.m) r12
        L_0x01f3:
            if (r12 == 0) goto L_0x01fe
            a4.S r1 = r12.c()
            if (r1 == 0) goto L_0x01fe
            o4.l.d(r1)
        L_0x01fe:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C3487a.j(j4.i, java.lang.Object, j4.n, X3.b, qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(X3.a r10, j4.C3622i r11, java.lang.Object r12, j4.C3627n r13, X3.b r14, qf.C6658d r15) {
        /*
            r9 = this;
            boolean r0 = r15 instanceof e4.C3487a.f
            if (r0 == 0) goto L_0x0013
            r0 = r15
            e4.a$f r0 = (e4.C3487a.f) r0
            int r1 = r0.f43299k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f43299k = r1
            goto L_0x0018
        L_0x0013:
            e4.a$f r0 = new e4.a$f
            r0.<init>(r9, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f43297i
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f43299k
            r3 = 1
            if (r2 == 0) goto L_0x0057
            if (r2 != r3) goto L_0x004f
            int r10 = r0.f43296h
            java.lang.Object r11 = r0.f43295g
            d4.i r11 = (d4.C3472i) r11
            java.lang.Object r12 = r0.f43294f
            X3.b r12 = (X3.b) r12
            java.lang.Object r13 = r0.f43293e
            j4.n r13 = (j4.C3627n) r13
            java.lang.Object r14 = r0.f43292d
            java.lang.Object r2 = r0.f43291c
            j4.i r2 = (j4.C3622i) r2
            java.lang.Object r4 = r0.f43290b
            X3.a r4 = (X3.a) r4
            java.lang.Object r5 = r0.f43289a
            e4.a r5 = (e4.C3487a) r5
            lf.w.b(r15)
            r6 = r0
            r0 = r10
            r10 = r4
            r4 = r6
            r7 = r2
            r2 = r11
            r11 = r7
            r8 = r14
            r14 = r12
            r12 = r8
            goto L_0x0095
        L_0x004f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0057:
            lf.w.b(r15)
            r15 = 0
            r5 = r9
        L_0x005c:
            X3.g r2 = r5.f43250a
            kotlin.Pair r15 = r10.j(r12, r13, r2, r15)
            if (r15 == 0) goto L_0x00b5
            java.lang.Object r2 = r15.c()
            d4.i r2 = (d4.C3472i) r2
            java.lang.Object r15 = r15.d()
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            int r15 = r15 + r3
            r14.n(r11, r2, r13)
            r0.f43289a = r5
            r0.f43290b = r10
            r0.f43291c = r11
            r0.f43292d = r12
            r0.f43293e = r13
            r0.f43294f = r14
            r0.f43295g = r2
            r0.f43296h = r15
            r0.f43299k = r3
            java.lang.Object r4 = r2.a(r0)
            if (r4 != r1) goto L_0x0091
            return r1
        L_0x0091:
            r6 = r0
            r0 = r15
            r15 = r4
            r4 = r6
        L_0x0095:
            d4.h r15 = (d4.C3471h) r15
            r14.c(r11, r2, r13, r15)     // Catch:{ all -> 0x00a0 }
            if (r15 == 0) goto L_0x009d
            return r15
        L_0x009d:
            r15 = r0
            r0 = r4
            goto L_0x005c
        L_0x00a0:
            r10 = move-exception
            boolean r11 = r15 instanceof d4.m
            if (r11 == 0) goto L_0x00a8
            d4.m r15 = (d4.m) r15
            goto L_0x00a9
        L_0x00a8:
            r15 = 0
        L_0x00a9:
            if (r15 == 0) goto L_0x00b4
            a4.S r11 = r15.c()
            if (r11 == 0) goto L_0x00b4
            o4.l.d(r11)
        L_0x00b4:
            throw r10
        L_0x00b5:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Unable to create a fetcher that supports: "
            r10.append(r11)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C3487a.k(X3.a, j4.i, java.lang.Object, j4.n, X3.b, qf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(e4.C3488b.a r14, qf.C6658d r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof e4.C3487a.g
            if (r0 == 0) goto L_0x0013
            r0 = r15
            e4.a$g r0 = (e4.C3487a.g) r0
            int r1 = r0.f43304e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f43304e = r1
            goto L_0x0018
        L_0x0013:
            e4.a$g r0 = new e4.a$g
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f43302c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f43304e
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r14 = r0.f43301b
            e4.b$a r14 = (e4.C3488b.a) r14
            java.lang.Object r0 = r0.f43300a
            e4.a r0 = (e4.C3487a) r0
            lf.w.b(r15)     // Catch:{ all -> 0x0032 }
            goto L_0x009f
        L_0x0032:
            r15 = move-exception
            goto L_0x00a0
        L_0x0034:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x003c:
            lf.w.b(r15)
            j4.i r6 = r14.a()     // Catch:{ all -> 0x0078 }
            java.lang.Object r15 = r6.m()     // Catch:{ all -> 0x0078 }
            k4.i r2 = r14.getSize()     // Catch:{ all -> 0x0078 }
            X3.b r9 = o4.l.g(r14)     // Catch:{ all -> 0x0078 }
            j4.q r4 = r13.f43252c     // Catch:{ all -> 0x0078 }
            j4.n r8 = r4.f(r6, r2)     // Catch:{ all -> 0x0078 }
            k4.h r4 = r8.n()     // Catch:{ all -> 0x0078 }
            r9.m(r6, r15)     // Catch:{ all -> 0x0078 }
            X3.g r5 = r13.f43250a     // Catch:{ all -> 0x0078 }
            X3.a r5 = r5.getComponents()     // Catch:{ all -> 0x0078 }
            java.lang.Object r7 = r5.g(r15, r8)     // Catch:{ all -> 0x0078 }
            r9.i(r6, r7)     // Catch:{ all -> 0x0078 }
            h4.d r15 = r13.f43253d     // Catch:{ all -> 0x0078 }
            h4.c$b r10 = r15.f(r6, r7, r8, r9)     // Catch:{ all -> 0x0078 }
            if (r10 == 0) goto L_0x007b
            h4.d r15 = r13.f43253d     // Catch:{ all -> 0x0078 }
            h4.c$c r15 = r15.a(r6, r10, r2, r4)     // Catch:{ all -> 0x0078 }
            goto L_0x007c
        L_0x0078:
            r15 = move-exception
            r0 = r13
            goto L_0x00a0
        L_0x007b:
            r15 = 0
        L_0x007c:
            if (r15 == 0) goto L_0x0085
            h4.d r0 = r13.f43253d     // Catch:{ all -> 0x0078 }
            j4.r r14 = r0.g(r14, r6, r10, r15)     // Catch:{ all -> 0x0078 }
            return r14
        L_0x0085:
            Ug.G r15 = r6.v()     // Catch:{ all -> 0x0078 }
            e4.a$h r2 = new e4.a$h     // Catch:{ all -> 0x0078 }
            r12 = 0
            r4 = r2
            r5 = r13
            r11 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0078 }
            r0.f43300a = r13     // Catch:{ all -> 0x0078 }
            r0.f43301b = r14     // Catch:{ all -> 0x0078 }
            r0.f43304e = r3     // Catch:{ all -> 0x0078 }
            java.lang.Object r15 = Ug.C5572i.g(r15, r2, r0)     // Catch:{ all -> 0x0078 }
            if (r15 != r1) goto L_0x009f
            return r1
        L_0x009f:
            return r15
        L_0x00a0:
            boolean r1 = r15 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L_0x00af
            j4.q r0 = r0.f43252c
            j4.i r14 = r14.a()
            j4.f r14 = r0.a(r14, r15)
            return r14
        L_0x00af:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C3487a.a(e4.b$a, qf.d):java.lang.Object");
    }

    public final Object l(b bVar, C3622i iVar, C3627n nVar, X3.b bVar2, C6658d dVar) {
        List O10 = iVar.O();
        if (O10.isEmpty()) {
            return bVar;
        }
        if ((bVar.e() instanceof BitmapDrawable) || iVar.g()) {
            return C5572i.g(iVar.N(), new i(this, bVar, nVar, O10, bVar2, iVar, (C6658d) null), dVar);
        }
        return bVar;
    }
}
