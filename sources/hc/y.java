package Hc;

import L1.d;
import Ug.C5600w0;
import Ug.K;
import Ug.L;
import Ug.M;
import Xg.C5694f;
import Xg.C5695g;
import Xg.C5696h;
import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.O;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.p;
import yf.q;

public final class y implements com.google.firebase.sessions.a {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final c f51052f = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Bf.c f51053g = K1.a.b(x.f51048a.a(), new J1.b(b.f51061a), (C6798l) null, (K) null, 12, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Context f51054b;

    /* renamed from: c  reason: collision with root package name */
    private final qf.g f51055c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference f51056d = new AtomicReference();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C5694f f51057e;

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f51058a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ y f51059b;

        /* renamed from: Hc.y$a$a  reason: collision with other inner class name */
        static final class C0779a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ y f51060a;

            C0779a(y yVar) {
                this.f51060a = yVar;
            }

            /* renamed from: a */
            public final Object emit(l lVar, C6658d dVar) {
                this.f51060a.f51056d.set(lVar);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(y yVar, C6658d dVar) {
            super(2, dVar);
            this.f51059b = yVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f51059b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f51058a;
            if (i10 == 0) {
                w.b(obj);
                C5694f g10 = this.f51059b.f51057e;
                C0779a aVar = new C0779a(this.f51059b);
                this.f51058a = 1;
                if (g10.collect(aVar, this) == f10) {
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

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f51061a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final L1.d invoke(I1.a aVar) {
            C6496s.h(aVar, "ex");
            Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + w.f51047a.e() + '.', aVar);
            return L1.e.a();
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ Ff.l[] f51062a = {O.j(new H(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final I1.f b(Context context) {
            return (I1.f) y.f51053g.a(context, f51062a[0]);
        }

        private c() {
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final d f51063a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final d.a f51064b = L1.f.f("session_id");

        private d() {
        }

        public final d.a a() {
            return f51064b;
        }
    }

    static final class e extends l implements q {

        /* renamed from: a  reason: collision with root package name */
        int f51065a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f51066b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f51067c;

        e(C6658d dVar) {
            super(3, dVar);
        }

        /* renamed from: i */
        public final Object invoke(C5695g gVar, Throwable th2, C6658d dVar) {
            e eVar = new e(dVar);
            eVar.f51066b = gVar;
            eVar.f51067c = th2;
            return eVar.invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f51065a;
            if (i10 == 0) {
                w.b(obj);
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f51067c);
                L1.d a10 = L1.e.a();
                this.f51066b = null;
                this.f51065a = 1;
                if (((C5695g) this.f51066b).emit(a10, this) == f10) {
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

    public static final class f implements C5694f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5694f f51068a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ y f51069b;

        public static final class a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5695g f51070a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ y f51071b;

            /* renamed from: Hc.y$f$a$a  reason: collision with other inner class name */
            public static final class C0780a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f51072a;

                /* renamed from: b  reason: collision with root package name */
                int f51073b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ a f51074c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0780a(a aVar, C6658d dVar) {
                    super(dVar);
                    this.f51074c = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f51072a = obj;
                    this.f51073b |= Integer.MIN_VALUE;
                    return this.f51074c.emit((Object) null, this);
                }
            }

            public a(C5695g gVar, y yVar) {
                this.f51070a = gVar;
                this.f51071b = yVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, qf.C6658d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Hc.y.f.a.C0780a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Hc.y$f$a$a r0 = (Hc.y.f.a.C0780a) r0
                    int r1 = r0.f51073b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f51073b = r1
                    goto L_0x0018
                L_0x0013:
                    Hc.y$f$a$a r0 = new Hc.y$f$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f51072a
                    java.lang.Object r1 = rf.C6680b.f()
                    int r2 = r0.f51073b
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    lf.w.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    lf.w.b(r6)
                    Xg.g r6 = r4.f51070a
                    L1.d r5 = (L1.d) r5
                    Hc.y r2 = r4.f51071b
                    Hc.l r5 = r2.i(r5)
                    r0.f51073b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    lf.M r5 = lf.C6514M.f71813a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Hc.y.f.a.emit(java.lang.Object, qf.d):java.lang.Object");
            }
        }

        public f(C5694f fVar, y yVar) {
            this.f51068a = fVar;
            this.f51069b = yVar;
        }

        public Object collect(C5695g gVar, C6658d dVar) {
            Object collect = this.f51068a.collect(new a(gVar, this.f51069b), dVar);
            if (collect == C6680b.f()) {
                return collect;
            }
            return C6514M.f71813a;
        }
    }

    static final class g extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f51075a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ y f51076b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f51077c;

        static final class a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f51078a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f51079b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f51080c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(String str, C6658d dVar) {
                super(2, dVar);
                this.f51080c = str;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                a aVar = new a(this.f51080c, dVar);
                aVar.f51079b = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(L1.a aVar, C6658d dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                C6680b.f();
                if (this.f51078a == 0) {
                    w.b(obj);
                    ((L1.a) this.f51079b).i(d.f51063a.a(), this.f51080c);
                    return C6514M.f71813a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(y yVar, String str, C6658d dVar) {
            super(2, dVar);
            this.f51076b = yVar;
            this.f51077c = str;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new g(this.f51076b, this.f51077c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((g) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f51075a;
            if (i10 == 0) {
                w.b(obj);
                I1.f a10 = y.f51052f.b(this.f51076b.f51054b);
                a aVar = new a(this.f51077c, (C6658d) null);
                this.f51075a = 1;
                if (L1.g.a(a10, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    w.b(obj);
                } catch (IOException e10) {
                    Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e10);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    public y(Context context, qf.g gVar) {
        C6496s.h(context, "context");
        C6496s.h(gVar, "backgroundDispatcher");
        this.f51054b = context;
        this.f51055c = gVar;
        this.f51057e = new f(C5696h.f(f51052f.b(context).getData(), new e((C6658d) null)), this);
        C5600w0 unused = C5576k.d(L.a(gVar), (qf.g) null, (M) null, new a(this, (C6658d) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final l i(L1.d dVar) {
        return new l((String) dVar.b(d.f51063a.a()));
    }

    public String a() {
        l lVar = (l) this.f51056d.get();
        if (lVar != null) {
            return lVar.a();
        }
        return null;
    }

    public void b(String str) {
        C6496s.h(str, "sessionId");
        C5600w0 unused = C5576k.d(L.a(this.f51055c), (qf.g) null, (M) null, new g(this, str, (C6658d) null), 3, (Object) null);
    }
}
