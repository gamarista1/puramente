package Jc;

import Hc.C4299b;
import I1.f;
import Sg.m;
import Tg.a;
import android.util.Log;
import dh.C5817a;
import jc.C5046e;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import org.json.JSONObject;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

public final class c implements h {

    /* renamed from: g  reason: collision with root package name */
    private static final a f51357g = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final g f51358a;

    /* renamed from: b  reason: collision with root package name */
    private final C5046e f51359b;

    /* renamed from: c  reason: collision with root package name */
    private final C4299b f51360c;

    /* renamed from: d  reason: collision with root package name */
    private final a f51361d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final g f51362e;

    /* renamed from: f  reason: collision with root package name */
    private final C5817a f51363f = dh.c.b(false, 1, (Object) null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f51364a;

        /* renamed from: b  reason: collision with root package name */
        Object f51365b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f51366c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f51367d;

        /* renamed from: e  reason: collision with root package name */
        int f51368e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, C6658d dVar) {
            super(dVar);
            this.f51367d = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f51366c = obj;
            this.f51368e |= Integer.MIN_VALUE;
            return this.f51367d.d(this);
        }
    }

    /* renamed from: Jc.c$c  reason: collision with other inner class name */
    static final class C0789c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f51369a;

        /* renamed from: b  reason: collision with root package name */
        Object f51370b;

        /* renamed from: c  reason: collision with root package name */
        int f51371c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f51372d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f51373e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0789c(c cVar, C6658d dVar) {
            super(2, dVar);
            this.f51373e = cVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            C0789c cVar = new C0789c(this.f51373e, dVar);
            cVar.f51372d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(JSONObject jSONObject, C6658d dVar) {
            return ((C0789c) create(jSONObject, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f9, code lost:
            if (((java.lang.Integer) r8.f71759a) == null) goto L_0x0115;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fb, code lost:
            r12.f51372d = r1;
            r12.f51369a = r0;
            r12.f51370b = null;
            r12.f51371c = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0112, code lost:
            if (Jc.c.e(r12.f51373e).m((java.lang.Integer) r8.f71759a, r12) != r4) goto L_0x0115;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0114, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0119, code lost:
            if (((java.lang.Double) r1.f71759a) == null) goto L_0x0135;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x011b, code lost:
            r12.f51372d = r0;
            r12.f51369a = null;
            r12.f51370b = null;
            r12.f51371c = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0132, code lost:
            if (Jc.c.e(r12.f51373e).i((java.lang.Double) r1.f71759a, r12) != r4) goto L_0x0135;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0134, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0139, code lost:
            if (((java.lang.Integer) r0.f71759a) == null) goto L_0x0158;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x013b, code lost:
            r12.f51372d = null;
            r12.f51369a = null;
            r12.f51370b = null;
            r12.f51371c = 4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0152, code lost:
            if (Jc.c.e(r12.f51373e).j((java.lang.Integer) r0.f71759a, r12) != r4) goto L_0x0155;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0154, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0155, code lost:
            r13 = lf.C6514M.f71813a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0158, code lost:
            r13 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0159, code lost:
            if (r13 != null) goto L_0x0178;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x015b, code lost:
            r13 = Jc.c.e(r12.f51373e);
            r0 = kotlin.coroutines.jvm.internal.b.c(86400);
            r12.f51372d = null;
            r12.f51369a = null;
            r12.f51370b = null;
            r12.f51371c = 5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0175, code lost:
            if (r13.j(r0, r12) != r4) goto L_0x0178;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0177, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0178, code lost:
            r13 = Jc.c.e(r12.f51373e);
            r0 = kotlin.coroutines.jvm.internal.b.d(java.lang.System.currentTimeMillis());
            r12.f51372d = null;
            r12.f51369a = null;
            r12.f51370b = null;
            r12.f51371c = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0193, code lost:
            if (r13.k(r0, r12) != r4) goto L_0x0196;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0195, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0198, code lost:
            return lf.C6514M.f71813a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00d7  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00f3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.String r0 = "cache_duration"
                java.lang.String r1 = "session_timeout_seconds"
                java.lang.String r2 = "sampling_rate"
                java.lang.String r3 = "sessions_enabled"
                java.lang.Object r4 = rf.C6680b.f()
                int r5 = r12.f51371c
                r6 = 0
                switch(r5) {
                    case 0: goto L_0x0050;
                    case 1: goto L_0x003f;
                    case 2: goto L_0x0032;
                    case 3: goto L_0x0029;
                    case 4: goto L_0x0024;
                    case 5: goto L_0x001f;
                    case 6: goto L_0x001a;
                    default: goto L_0x0012;
                }
            L_0x0012:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x001a:
                lf.w.b(r13)
                goto L_0x0196
            L_0x001f:
                lf.w.b(r13)
                goto L_0x0178
            L_0x0024:
                lf.w.b(r13)
                goto L_0x0155
            L_0x0029:
                java.lang.Object r0 = r12.f51372d
                kotlin.jvm.internal.N r0 = (kotlin.jvm.internal.N) r0
                lf.w.b(r13)
                goto L_0x0135
            L_0x0032:
                java.lang.Object r0 = r12.f51369a
                kotlin.jvm.internal.N r0 = (kotlin.jvm.internal.N) r0
                java.lang.Object r1 = r12.f51372d
                kotlin.jvm.internal.N r1 = (kotlin.jvm.internal.N) r1
                lf.w.b(r13)
                goto L_0x0115
            L_0x003f:
                java.lang.Object r0 = r12.f51370b
                kotlin.jvm.internal.N r0 = (kotlin.jvm.internal.N) r0
                java.lang.Object r1 = r12.f51369a
                kotlin.jvm.internal.N r1 = (kotlin.jvm.internal.N) r1
                java.lang.Object r2 = r12.f51372d
                kotlin.jvm.internal.N r2 = (kotlin.jvm.internal.N) r2
                lf.w.b(r13)
                goto L_0x00f0
            L_0x0050:
                lf.w.b(r13)
                java.lang.Object r13 = r12.f51372d
                org.json.JSONObject r13 = (org.json.JSONObject) r13
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r7 = "Fetched settings: "
                r5.append(r7)
                r5.append(r13)
                java.lang.String r5 = r5.toString()
                java.lang.String r7 = "SessionConfigFetcher"
                android.util.Log.d(r7, r5)
                kotlin.jvm.internal.N r5 = new kotlin.jvm.internal.N
                r5.<init>()
                kotlin.jvm.internal.N r8 = new kotlin.jvm.internal.N
                r8.<init>()
                kotlin.jvm.internal.N r9 = new kotlin.jvm.internal.N
                r9.<init>()
                java.lang.String r10 = "app_quality"
                boolean r11 = r13.has(r10)
                if (r11 == 0) goto L_0x00d4
                java.lang.Object r13 = r13.get(r10)
                java.lang.String r10 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.C6496s.f(r13, r10)
                org.json.JSONObject r13 = (org.json.JSONObject) r13
                boolean r10 = r13.has(r3)     // Catch:{ JSONException -> 0x009c }
                if (r10 == 0) goto L_0x009f
                java.lang.Object r3 = r13.get(r3)     // Catch:{ JSONException -> 0x009c }
                java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ JSONException -> 0x009c }
                goto L_0x00a0
            L_0x009c:
                r13 = move-exception
                r3 = r6
                goto L_0x00ce
            L_0x009f:
                r3 = r6
            L_0x00a0:
                boolean r10 = r13.has(r2)     // Catch:{ JSONException -> 0x00af }
                if (r10 == 0) goto L_0x00b1
                java.lang.Object r2 = r13.get(r2)     // Catch:{ JSONException -> 0x00af }
                java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ JSONException -> 0x00af }
                r5.f71759a = r2     // Catch:{ JSONException -> 0x00af }
                goto L_0x00b1
            L_0x00af:
                r13 = move-exception
                goto L_0x00ce
            L_0x00b1:
                boolean r2 = r13.has(r1)     // Catch:{ JSONException -> 0x00af }
                if (r2 == 0) goto L_0x00bf
                java.lang.Object r1 = r13.get(r1)     // Catch:{ JSONException -> 0x00af }
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ JSONException -> 0x00af }
                r8.f71759a = r1     // Catch:{ JSONException -> 0x00af }
            L_0x00bf:
                boolean r1 = r13.has(r0)     // Catch:{ JSONException -> 0x00af }
                if (r1 == 0) goto L_0x00d5
                java.lang.Object r13 = r13.get(r0)     // Catch:{ JSONException -> 0x00af }
                java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ JSONException -> 0x00af }
                r9.f71759a = r13     // Catch:{ JSONException -> 0x00af }
                goto L_0x00d5
            L_0x00ce:
                java.lang.String r0 = "Error parsing the configs remotely fetched: "
                android.util.Log.e(r7, r0, r13)
                goto L_0x00d5
            L_0x00d4:
                r3 = r6
            L_0x00d5:
                if (r3 == 0) goto L_0x00f3
                Jc.c r13 = r12.f51373e
                Jc.g r13 = r13.f51362e
                r12.f51372d = r5
                r12.f51369a = r8
                r12.f51370b = r9
                r0 = 1
                r12.f51371c = r0
                java.lang.Object r13 = r13.n(r3, r12)
                if (r13 != r4) goto L_0x00ed
                return r4
            L_0x00ed:
                r2 = r5
                r1 = r8
                r0 = r9
            L_0x00f0:
                r8 = r1
                r1 = r2
                goto L_0x00f5
            L_0x00f3:
                r1 = r5
                r0 = r9
            L_0x00f5:
                java.lang.Object r13 = r8.f71759a
                java.lang.Integer r13 = (java.lang.Integer) r13
                if (r13 == 0) goto L_0x0115
                Jc.c r13 = r12.f51373e
                Jc.g r13 = r13.f51362e
                java.lang.Object r2 = r8.f71759a
                java.lang.Integer r2 = (java.lang.Integer) r2
                r12.f51372d = r1
                r12.f51369a = r0
                r12.f51370b = r6
                r3 = 2
                r12.f51371c = r3
                java.lang.Object r13 = r13.m(r2, r12)
                if (r13 != r4) goto L_0x0115
                return r4
            L_0x0115:
                java.lang.Object r13 = r1.f71759a
                java.lang.Double r13 = (java.lang.Double) r13
                if (r13 == 0) goto L_0x0135
                Jc.c r13 = r12.f51373e
                Jc.g r13 = r13.f51362e
                java.lang.Object r1 = r1.f71759a
                java.lang.Double r1 = (java.lang.Double) r1
                r12.f51372d = r0
                r12.f51369a = r6
                r12.f51370b = r6
                r2 = 3
                r12.f51371c = r2
                java.lang.Object r13 = r13.i(r1, r12)
                if (r13 != r4) goto L_0x0135
                return r4
            L_0x0135:
                java.lang.Object r13 = r0.f71759a
                java.lang.Integer r13 = (java.lang.Integer) r13
                if (r13 == 0) goto L_0x0158
                Jc.c r13 = r12.f51373e
                Jc.g r13 = r13.f51362e
                java.lang.Object r0 = r0.f71759a
                java.lang.Integer r0 = (java.lang.Integer) r0
                r12.f51372d = r6
                r12.f51369a = r6
                r12.f51370b = r6
                r1 = 4
                r12.f51371c = r1
                java.lang.Object r13 = r13.j(r0, r12)
                if (r13 != r4) goto L_0x0155
                return r4
            L_0x0155:
                lf.M r13 = lf.C6514M.f71813a
                goto L_0x0159
            L_0x0158:
                r13 = r6
            L_0x0159:
                if (r13 != 0) goto L_0x0178
                Jc.c r13 = r12.f51373e
                Jc.g r13 = r13.f51362e
                r0 = 86400(0x15180, float:1.21072E-40)
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.b.c(r0)
                r12.f51372d = r6
                r12.f51369a = r6
                r12.f51370b = r6
                r1 = 5
                r12.f51371c = r1
                java.lang.Object r13 = r13.j(r0, r12)
                if (r13 != r4) goto L_0x0178
                return r4
            L_0x0178:
                Jc.c r13 = r12.f51373e
                Jc.g r13 = r13.f51362e
                long r0 = java.lang.System.currentTimeMillis()
                java.lang.Long r0 = kotlin.coroutines.jvm.internal.b.d(r0)
                r12.f51372d = r6
                r12.f51369a = r6
                r12.f51370b = r6
                r1 = 6
                r12.f51371c = r1
                java.lang.Object r13 = r13.k(r0, r12)
                if (r13 != r4) goto L_0x0196
                return r4
            L_0x0196:
                lf.M r13 = lf.C6514M.f71813a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: Jc.c.C0789c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class d extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f51374a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f51375b;

        d(C6658d dVar) {
            super(2, dVar);
        }

        public final C6658d create(Object obj, C6658d dVar) {
            d dVar2 = new d(dVar);
            dVar2.f51375b = obj;
            return dVar2;
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f51374a == 0) {
                w.b(obj);
                Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f51375b));
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(String str, C6658d dVar) {
            return ((d) create(str, dVar)).invokeSuspend(C6514M.f71813a);
        }
    }

    public c(g gVar, C5046e eVar, C4299b bVar, a aVar, f fVar) {
        C6496s.h(gVar, "backgroundDispatcher");
        C6496s.h(eVar, "firebaseInstallationsApi");
        C6496s.h(bVar, "appInfo");
        C6496s.h(aVar, "configsFetcher");
        C6496s.h(fVar, "dataStore");
        this.f51358a = gVar;
        this.f51359b = eVar;
        this.f51360c = bVar;
        this.f51361d = aVar;
        this.f51362e = new g(fVar);
    }

    private final String f(String str) {
        return new m("/").e(str, "");
    }

    public Boolean a() {
        return this.f51362e.g();
    }

    public Tg.a b() {
        Integer e10 = this.f51362e.e();
        if (e10 == null) {
            return null;
        }
        a.C0955a aVar = Tg.a.f65168b;
        return Tg.a.f(Tg.c.s(e10.intValue(), Tg.d.SECONDS));
    }

    public Double c() {
        return this.f51362e.f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e A[Catch:{ all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009f A[SYNTHETIC, Splitter:B:41:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c1 A[Catch:{ all -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(qf.C6658d r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof Jc.c.b
            if (r0 == 0) goto L_0x0013
            r0 = r14
            Jc.c$b r0 = (Jc.c.b) r0
            int r1 = r0.f51368e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f51368e = r1
            goto L_0x0018
        L_0x0013:
            Jc.c$b r0 = new Jc.c$b
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f51366c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f51368e
            r3 = 3
            r4 = 1
            java.lang.String r5 = "SessionConfigFetcher"
            r6 = 2
            r7 = 0
            if (r2 == 0) goto L_0x0060
            if (r2 == r4) goto L_0x0053
            if (r2 == r6) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r0 = r0.f51364a
            dh.a r0 = (dh.C5817a) r0
            lf.w.b(r14)     // Catch:{ all -> 0x0037 }
            goto L_0x014a
        L_0x0037:
            r14 = move-exception
            goto L_0x0152
        L_0x003a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0042:
            java.lang.Object r2 = r0.f51365b
            dh.a r2 = (dh.C5817a) r2
            java.lang.Object r4 = r0.f51364a
            Jc.c r4 = (Jc.c) r4
            lf.w.b(r14)     // Catch:{ all -> 0x004f }
            goto L_0x00b3
        L_0x004f:
            r14 = move-exception
            r0 = r2
            goto L_0x0152
        L_0x0053:
            java.lang.Object r2 = r0.f51365b
            dh.a r2 = (dh.C5817a) r2
            java.lang.Object r4 = r0.f51364a
            Jc.c r4 = (Jc.c) r4
            lf.w.b(r14)
            r14 = r2
            goto L_0x0086
        L_0x0060:
            lf.w.b(r14)
            dh.a r14 = r13.f51363f
            boolean r14 = r14.d()
            if (r14 != 0) goto L_0x0076
            Jc.g r14 = r13.f51362e
            boolean r14 = r14.d()
            if (r14 != 0) goto L_0x0076
            lf.M r14 = lf.C6514M.f71813a
            return r14
        L_0x0076:
            dh.a r14 = r13.f51363f
            r0.f51364a = r13
            r0.f51365b = r14
            r0.f51368e = r4
            java.lang.Object r2 = r14.a(r7, r0)
            if (r2 != r1) goto L_0x0085
            return r1
        L_0x0085:
            r4 = r13
        L_0x0086:
            Jc.g r2 = r4.f51362e     // Catch:{ all -> 0x0099 }
            boolean r2 = r2.d()     // Catch:{ all -> 0x0099 }
            if (r2 != 0) goto L_0x009f
            java.lang.String r0 = "Remote settings cache not expired. Using cached values."
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0099 }
            lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x0099 }
            r14.e(r7)
            return r0
        L_0x0099:
            r0 = move-exception
            r12 = r0
            r0 = r14
            r14 = r12
            goto L_0x0152
        L_0x009f:
            Hc.s$a r2 = Hc.s.f51030c     // Catch:{ all -> 0x0099 }
            jc.e r8 = r4.f51359b     // Catch:{ all -> 0x0099 }
            r0.f51364a = r4     // Catch:{ all -> 0x0099 }
            r0.f51365b = r14     // Catch:{ all -> 0x0099 }
            r0.f51368e = r6     // Catch:{ all -> 0x0099 }
            java.lang.Object r2 = r2.a(r8, r0)     // Catch:{ all -> 0x0099 }
            if (r2 != r1) goto L_0x00b0
            return r1
        L_0x00b0:
            r12 = r2
            r2 = r14
            r14 = r12
        L_0x00b3:
            Hc.s r14 = (Hc.s) r14     // Catch:{ all -> 0x004f }
            java.lang.String r14 = r14.b()     // Catch:{ all -> 0x004f }
            java.lang.String r8 = ""
            boolean r8 = kotlin.jvm.internal.C6496s.c(r14, r8)     // Catch:{ all -> 0x004f }
            if (r8 == 0) goto L_0x00cc
            java.lang.String r14 = "Error getting Firebase Installation ID. Skipping this Session Event."
            android.util.Log.w(r5, r14)     // Catch:{ all -> 0x004f }
            lf.M r14 = lf.C6514M.f71813a     // Catch:{ all -> 0x004f }
            r2.e(r7)
            return r14
        L_0x00cc:
            java.lang.String r8 = "X-Crashlytics-Installation-ID"
            kotlin.Pair r14 = lf.C6502A.a(r8, r14)     // Catch:{ all -> 0x004f }
            java.lang.String r8 = "X-Crashlytics-Device-Model"
            kotlin.jvm.internal.U r9 = kotlin.jvm.internal.U.f71764a     // Catch:{ all -> 0x004f }
            java.lang.String r9 = "%s/%s"
            java.lang.String r10 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x004f }
            java.lang.String r11 = android.os.Build.MODEL     // Catch:{ all -> 0x004f }
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r11}     // Catch:{ all -> 0x004f }
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r10, r6)     // Catch:{ all -> 0x004f }
            java.lang.String r6 = java.lang.String.format(r9, r6)     // Catch:{ all -> 0x004f }
            java.lang.String r9 = "format(format, *args)"
            kotlin.jvm.internal.C6496s.g(r6, r9)     // Catch:{ all -> 0x004f }
            java.lang.String r6 = r4.f(r6)     // Catch:{ all -> 0x004f }
            kotlin.Pair r6 = lf.C6502A.a(r8, r6)     // Catch:{ all -> 0x004f }
            java.lang.String r8 = "X-Crashlytics-OS-Build-Version"
            java.lang.String r9 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ all -> 0x004f }
            java.lang.String r10 = "INCREMENTAL"
            kotlin.jvm.internal.C6496s.g(r9, r10)     // Catch:{ all -> 0x004f }
            java.lang.String r9 = r4.f(r9)     // Catch:{ all -> 0x004f }
            kotlin.Pair r8 = lf.C6502A.a(r8, r9)     // Catch:{ all -> 0x004f }
            java.lang.String r9 = "X-Crashlytics-OS-Display-Version"
            java.lang.String r10 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x004f }
            java.lang.String r11 = "RELEASE"
            kotlin.jvm.internal.C6496s.g(r10, r11)     // Catch:{ all -> 0x004f }
            java.lang.String r10 = r4.f(r10)     // Catch:{ all -> 0x004f }
            kotlin.Pair r9 = lf.C6502A.a(r9, r10)     // Catch:{ all -> 0x004f }
            java.lang.String r10 = "X-Crashlytics-API-Client-Version"
            Hc.b r11 = r4.f51360c     // Catch:{ all -> 0x004f }
            java.lang.String r11 = r11.f()     // Catch:{ all -> 0x004f }
            kotlin.Pair r10 = lf.C6502A.a(r10, r11)     // Catch:{ all -> 0x004f }
            kotlin.Pair[] r14 = new kotlin.Pair[]{r14, r6, r8, r9, r10}     // Catch:{ all -> 0x004f }
            java.util.Map r14 = mf.O.l(r14)     // Catch:{ all -> 0x004f }
            java.lang.String r6 = "Fetching settings from server."
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x004f }
            Jc.a r5 = r4.f51361d     // Catch:{ all -> 0x004f }
            Jc.c$c r6 = new Jc.c$c     // Catch:{ all -> 0x004f }
            r6.<init>(r4, r7)     // Catch:{ all -> 0x004f }
            Jc.c$d r4 = new Jc.c$d     // Catch:{ all -> 0x004f }
            r4.<init>(r7)     // Catch:{ all -> 0x004f }
            r0.f51364a = r2     // Catch:{ all -> 0x004f }
            r0.f51365b = r7     // Catch:{ all -> 0x004f }
            r0.f51368e = r3     // Catch:{ all -> 0x004f }
            java.lang.Object r14 = r5.a(r14, r6, r4, r0)     // Catch:{ all -> 0x004f }
            if (r14 != r1) goto L_0x0149
            return r1
        L_0x0149:
            r0 = r2
        L_0x014a:
            lf.M r14 = lf.C6514M.f71813a     // Catch:{ all -> 0x0037 }
            r0.e(r7)
            lf.M r14 = lf.C6514M.f71813a
            return r14
        L_0x0152:
            r0.e(r7)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Jc.c.d(qf.d):java.lang.Object");
    }
}
