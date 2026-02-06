package Jc;

import L1.d;
import L1.f;
import Ug.K;
import Xg.C5694f;
import Xg.C5696h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

public final class g {

    /* renamed from: c  reason: collision with root package name */
    private static final b f51400c = new b((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static final d.a f51401d = f.a("firebase_sessions_enabled");

    /* renamed from: e  reason: collision with root package name */
    private static final d.a f51402e = f.b("firebase_sessions_sampling_rate");

    /* renamed from: f  reason: collision with root package name */
    private static final d.a f51403f = f.d("firebase_sessions_restart_timeout");

    /* renamed from: g  reason: collision with root package name */
    private static final d.a f51404g = f.d("firebase_sessions_cache_duration");

    /* renamed from: h  reason: collision with root package name */
    private static final d.a f51405h = f.e("firebase_sessions_cache_updated_time");
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final I1.f f51406a;

    /* renamed from: b  reason: collision with root package name */
    private e f51407b;

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f51408a;

        /* renamed from: b  reason: collision with root package name */
        int f51409b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f51410c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, C6658d dVar) {
            super(2, dVar);
            this.f51410c = gVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f51410c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            g gVar;
            Object f10 = C6680b.f();
            int i10 = this.f51409b;
            if (i10 == 0) {
                w.b(obj);
                g gVar2 = this.f51410c;
                C5694f data = gVar2.f51406a.getData();
                this.f51408a = gVar2;
                this.f51409b = 1;
                Object u10 = C5696h.u(data, this);
                if (u10 == f10) {
                    return f10;
                }
                gVar = gVar2;
                obj = u10;
            } else if (i10 == 1) {
                gVar = (g) this.f51408a;
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar.l(((L1.d) obj).d());
            return C6514M.f71813a;
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f51411a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f51412b;

        /* renamed from: c  reason: collision with root package name */
        int f51413c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar, C6658d dVar) {
            super(dVar);
            this.f51412b = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f51411a = obj;
            this.f51413c |= Integer.MIN_VALUE;
            return this.f51412b.h((d.a) null, (Object) null, this);
        }
    }

    static final class d extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f51414a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f51415b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f51416c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d.a f51417d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f51418e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Object obj, d.a aVar, g gVar, C6658d dVar) {
            super(2, dVar);
            this.f51416c = obj;
            this.f51417d = aVar;
            this.f51418e = gVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            d dVar2 = new d(this.f51416c, this.f51417d, this.f51418e, dVar);
            dVar2.f51415b = obj;
            return dVar2;
        }

        /* renamed from: i */
        public final Object invoke(L1.a aVar, C6658d dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f51414a == 0) {
                w.b(obj);
                L1.a aVar = (L1.a) this.f51415b;
                Object obj2 = this.f51416c;
                if (obj2 != null) {
                    aVar.i(this.f51417d, obj2);
                } else {
                    aVar.h(this.f51417d);
                }
                this.f51418e.l(aVar);
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public g(I1.f fVar) {
        C6496s.h(fVar, "dataStore");
        this.f51406a = fVar;
        Object unused = C5574j.b((qf.g) null, new a(this, (C6658d) null), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(L1.d.a r6, java.lang.Object r7, qf.C6658d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof Jc.g.c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            Jc.g$c r0 = (Jc.g.c) r0
            int r1 = r0.f51413c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f51413c = r1
            goto L_0x0018
        L_0x0013:
            Jc.g$c r0 = new Jc.g$c
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f51411a
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f51413c
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            lf.w.b(r8)     // Catch:{ IOException -> 0x0029 }
            goto L_0x005d
        L_0x0029:
            r6 = move-exception
            goto L_0x0047
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            lf.w.b(r8)
            I1.f r8 = r5.f51406a     // Catch:{ IOException -> 0x0029 }
            Jc.g$d r2 = new Jc.g$d     // Catch:{ IOException -> 0x0029 }
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch:{ IOException -> 0x0029 }
            r0.f51413c = r3     // Catch:{ IOException -> 0x0029 }
            java.lang.Object r6 = L1.g.a(r8, r2, r0)     // Catch:{ IOException -> 0x0029 }
            if (r6 != r1) goto L_0x005d
            return r1
        L_0x0047:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed to update cache config value: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L_0x005d:
            lf.M r6 = lf.C6514M.f71813a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Jc.g.h(L1.d$a, java.lang.Object, qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void l(L1.d dVar) {
        this.f51407b = new e((Boolean) dVar.b(f51401d), (Double) dVar.b(f51402e), (Integer) dVar.b(f51403f), (Integer) dVar.b(f51404g), (Long) dVar.b(f51405h));
    }

    public final boolean d() {
        e eVar = this.f51407b;
        e eVar2 = null;
        if (eVar == null) {
            C6496s.v("sessionConfigs");
            eVar = null;
        }
        Long b10 = eVar.b();
        e eVar3 = this.f51407b;
        if (eVar3 == null) {
            C6496s.v("sessionConfigs");
        } else {
            eVar2 = eVar3;
        }
        Integer a10 = eVar2.a();
        if (b10 == null || a10 == null || (System.currentTimeMillis() - b10.longValue()) / ((long) 1000) >= ((long) a10.intValue())) {
            return true;
        }
        return false;
    }

    public final Integer e() {
        e eVar = this.f51407b;
        if (eVar == null) {
            C6496s.v("sessionConfigs");
            eVar = null;
        }
        return eVar.d();
    }

    public final Double f() {
        e eVar = this.f51407b;
        if (eVar == null) {
            C6496s.v("sessionConfigs");
            eVar = null;
        }
        return eVar.e();
    }

    public final Boolean g() {
        e eVar = this.f51407b;
        if (eVar == null) {
            C6496s.v("sessionConfigs");
            eVar = null;
        }
        return eVar.c();
    }

    public final Object i(Double d10, C6658d dVar) {
        Object h10 = h(f51402e, d10, dVar);
        if (h10 == C6680b.f()) {
            return h10;
        }
        return C6514M.f71813a;
    }

    public final Object j(Integer num, C6658d dVar) {
        Object h10 = h(f51404g, num, dVar);
        if (h10 == C6680b.f()) {
            return h10;
        }
        return C6514M.f71813a;
    }

    public final Object k(Long l10, C6658d dVar) {
        Object h10 = h(f51405h, l10, dVar);
        if (h10 == C6680b.f()) {
            return h10;
        }
        return C6514M.f71813a;
    }

    public final Object m(Integer num, C6658d dVar) {
        Object h10 = h(f51403f, num, dVar);
        if (h10 == C6680b.f()) {
            return h10;
        }
        return C6514M.f71813a;
    }

    public final Object n(Boolean bool, C6658d dVar) {
        Object h10 = h(f51401d, bool, dVar);
        if (h10 == C6680b.f()) {
            return h10;
        }
        return C6514M.f71813a;
    }
}
