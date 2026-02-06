package com.bugsnag.android;

import Sg.p;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.bugsnag.android.p0  reason: case insensitive filesystem */
public final class C3265p0 {

    /* renamed from: i  reason: collision with root package name */
    public static final a f38799i = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final A f38800a;

    /* renamed from: b  reason: collision with root package name */
    private final Collection f38801b;

    /* renamed from: c  reason: collision with root package name */
    private final C3252l f38802c = new C3252l();

    /* renamed from: d  reason: collision with root package name */
    private final C3226c0 f38803d = new C3226c0();

    /* renamed from: e  reason: collision with root package name */
    private final t1 f38804e;

    /* renamed from: f  reason: collision with root package name */
    private final C3253l0 f38805f;

    /* renamed from: g  reason: collision with root package name */
    private final C1 f38806g;

    /* renamed from: h  reason: collision with root package name */
    private final C3264p f38807h;

    /* renamed from: com.bugsnag.android.p0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3265p0(A a10, Collection collection) {
        this.f38800a = a10;
        this.f38801b = collection;
        t1 t1Var = new t1();
        this.f38804e = t1Var;
        this.f38805f = new C3253l0(t1Var, a10.t());
        this.f38806g = new C1(t1Var, a10.t());
        this.f38807h = new C3264p(a10.t());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(java.util.Map r10, com.bugsnag.android.C3262o0 r11) {
        /*
            r9 = this;
            java.lang.String r0 = "traceId"
            java.lang.Object r0 = r10.get(r0)
            boolean r1 = r0 instanceof java.lang.String
            r2 = 0
            if (r1 == 0) goto L_0x000e
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x000f
        L_0x000e:
            r0 = r2
        L_0x000f:
            r1 = 16
            if (r0 != 0) goto L_0x0015
        L_0x0013:
            r4 = r2
            goto L_0x004e
        L_0x0015:
            int r3 = r0.length()
            r4 = 32
            if (r3 != r4) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r0 = r2
        L_0x001f:
            if (r0 != 0) goto L_0x0022
            goto L_0x0013
        L_0x0022:
            r3 = 0
            java.lang.String r3 = r0.substring(r3, r1)
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.C6496s.g(r3, r4)
            java.lang.Long r3 = r9.d(r3)
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.C6496s.g(r0, r4)
            java.lang.Long r0 = r9.d(r0)
            if (r3 == 0) goto L_0x0013
            if (r0 == 0) goto L_0x0013
            java.util.UUID r4 = new java.util.UUID
            long r5 = r3.longValue()
            long r7 = r0.longValue()
            r4.<init>(r5, r7)
        L_0x004e:
            java.lang.String r0 = "spanId"
            java.lang.Object r10 = r10.get(r0)
            boolean r0 = r10 instanceof java.lang.String
            if (r0 == 0) goto L_0x005b
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x005c
        L_0x005b:
            r10 = r2
        L_0x005c:
            if (r10 != 0) goto L_0x005f
            goto L_0x006e
        L_0x005f:
            int r0 = r10.length()
            if (r0 != r1) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r10 = r2
        L_0x0067:
            if (r10 != 0) goto L_0x006a
            goto L_0x006e
        L_0x006a:
            java.lang.Long r2 = r9.d(r10)
        L_0x006e:
            if (r4 == 0) goto L_0x0079
            if (r2 == 0) goto L_0x0079
            long r0 = r2.longValue()
            r11.x(r4, r0)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C3265p0.b(java.util.Map, com.bugsnag.android.o0):void");
    }

    private final boolean c(Map map, boolean z10) {
        Object obj = map.get("unhandledOverridden");
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        if (!((Boolean) obj).booleanValue()) {
            return z10;
        }
        if (!z10) {
            return true;
        }
        return false;
    }

    private final Long d(String str) {
        if (str.length() != 16 || str.charAt(0) == '-' || str.charAt(3) == '-') {
            return null;
        }
        String substring = str.substring(0, 2);
        C6496s.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        Long p10 = p.p(substring, 16);
        if (p10 == null) {
            return null;
        }
        long longValue = p10.longValue();
        String substring2 = str.substring(2);
        C6496s.g(substring2, "this as java.lang.String).substring(startIndex)");
        Long p11 = p.p(substring2, 16);
        if (p11 == null) {
            return null;
        }
        return Long.valueOf(p11.longValue() | (longValue << 56));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.Map} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bugsnag.android.C3262o0 a(java.util.Map r14) {
        /*
            r13 = this;
            java.lang.String r0 = "severityReason"
            java.lang.Object r0 = r14.get(r0)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>"
            if (r0 == 0) goto L_0x02ac
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r2 = "featureFlags"
            java.lang.Object r2 = r14.get(r2)
            boolean r3 = r2 instanceof java.util.List
            r4 = 0
            if (r3 == 0) goto L_0x001a
            java.util.List r2 = (java.util.List) r2
            goto L_0x001b
        L_0x001a:
            r2 = r4
        L_0x001b:
            java.lang.String r3 = "type"
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
            if (r3 == 0) goto L_0x02a6
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r3 = "severity"
            java.lang.Object r3 = r14.get(r3)
            if (r3 == 0) goto L_0x02a0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r6 = "unhandled"
            java.lang.Object r6 = r14.get(r6)
            if (r6 == 0) goto L_0x0298
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r9 = r6.booleanValue()
            boolean r10 = r13.c(r0, r9)
            com.bugsnag.android.q1 r0 = new com.bugsnag.android.q1
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toUpperCase(r6)
            java.lang.String r6 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.C6496s.g(r3, r6)
            com.bugsnag.android.Severity r8 = com.bugsnag.android.Severity.valueOf(r3)
            r11 = 0
            r12 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            com.bugsnag.android.A r3 = r13.f38800a
            com.bugsnag.android.o0 r0 = com.bugsnag.android.NativeInterface.createEvent(r4, r3, r0)
            java.lang.String r3 = "context"
            java.lang.Object r3 = r14.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r0.r(r3)
            java.lang.String r3 = "groupingHash"
            java.lang.Object r3 = r14.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r0.t(r3)
            java.lang.String r3 = "apiKey"
            java.lang.Object r3 = r14.get(r3)
            boolean r6 = r3 instanceof java.lang.String
            if (r6 == 0) goto L_0x0084
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0085
        L_0x0084:
            r3 = r4
        L_0x0085:
            if (r3 != 0) goto L_0x0089
        L_0x0087:
            r3 = r4
            goto L_0x008f
        L_0x0089:
            int r6 = r3.length()
            if (r6 <= 0) goto L_0x0087
        L_0x008f:
            if (r3 != 0) goto L_0x0092
            goto L_0x0095
        L_0x0092:
            r0.o(r3)
        L_0x0095:
            com.bugsnag.android.l r3 = r13.f38802c
            java.lang.String r6 = "app"
            java.lang.Object r6 = r14.get(r6)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>"
            if (r6 == 0) goto L_0x0292
            java.util.Map r6 = kotlin.jvm.internal.V.d(r6)
            com.bugsnag.android.n r3 = r3.a(r6)
            r0.p(r3)
            com.bugsnag.android.c0 r3 = r13.f38803d
            java.lang.String r6 = "device"
            java.lang.Object r6 = r14.get(r6)
            if (r6 == 0) goto L_0x028c
            java.util.Map r6 = kotlin.jvm.internal.V.d(r6)
            com.bugsnag.android.i0 r3 = r3.a(r6)
            r0.s(r3)
            com.bugsnag.android.M1 r3 = new com.bugsnag.android.M1
            r3.<init>()
            java.lang.String r6 = "user"
            java.lang.Object r6 = r14.get(r6)
            if (r6 == 0) goto L_0x0286
            java.util.Map r6 = kotlin.jvm.internal.V.d(r6)
            com.bugsnag.android.L1 r3 = r3.a(r6)
            java.lang.String r6 = r3.b()
            java.lang.String r7 = r3.a()
            java.lang.String r3 = r3.c()
            r0.y(r6, r7, r3)
            r0.d()
            if (r2 != 0) goto L_0x00eb
            goto L_0x0119
        L_0x00eb:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x00f1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0119
            java.lang.Object r3 = r2.next()
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r6 = "featureFlag"
            java.lang.Object r6 = r3.get(r6)
            if (r6 == 0) goto L_0x0113
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "variant"
            java.lang.Object r3 = r3.get(r7)
            java.lang.String r3 = (java.lang.String) r3
            r0.a(r6, r3)
            goto L_0x00f1
        L_0x0113:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r5)
            throw r14
        L_0x0119:
            java.lang.String r2 = "errors"
            java.lang.Object r2 = r14.get(r2)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any?>>"
            if (r2 == 0) goto L_0x0280
            java.util.List r2 = (java.util.List) r2
            java.util.List r5 = r0.h()
            r5.clear()
            java.util.List r5 = r0.h()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            com.bugsnag.android.l0 r6 = r13.f38805f
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r9 = mf.C6565s.y(r2, r8)
            r7.<init>(r9)
            java.util.Iterator r2 = r2.iterator()
        L_0x0143:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x0157
            java.lang.Object r9 = r2.next()
            java.util.Map r9 = (java.util.Map) r9
            com.bugsnag.android.k0 r9 = r6.a(r9)
            r7.add(r9)
            goto L_0x0143
        L_0x0157:
            r5.addAll(r7)
            java.lang.String r2 = "nativeStack"
            boolean r2 = r14.containsKey(r2)
            if (r2 == 0) goto L_0x01a8
            java.util.List r2 = r0.h()
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x01a8
            lf.v$a r2 = lf.v.f71841b     // Catch:{ all -> 0x019e }
            java.util.List r2 = r0.h()     // Catch:{ all -> 0x019e }
            java.lang.Object r2 = mf.C6565s.o0(r2)     // Catch:{ all -> 0x019e }
            com.bugsnag.android.k0 r2 = (com.bugsnag.android.C3250k0) r2     // Catch:{ all -> 0x019e }
            com.bugsnag.android.a1 r5 = new com.bugsnag.android.a1     // Catch:{ all -> 0x019e }
            java.util.Collection r6 = r13.f38801b     // Catch:{ all -> 0x019e }
            com.bugsnag.android.A r7 = r13.f38800a     // Catch:{ all -> 0x019e }
            K4.k r7 = r7.m()     // Catch:{ all -> 0x019e }
            r5.<init>(r6, r7)     // Catch:{ all -> 0x019e }
            java.util.List r5 = r5.a(r14)     // Catch:{ all -> 0x019e }
            java.util.List r2 = r2.d()     // Catch:{ all -> 0x019e }
            java.util.Collection r5 = (java.util.Collection) r5     // Catch:{ all -> 0x019e }
            r6 = 0
            boolean r2 = r2.addAll(r6, r5)     // Catch:{ all -> 0x019e }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x019e }
            lf.v.b(r2)     // Catch:{ all -> 0x019e }
            goto L_0x01a8
        L_0x019e:
            r2 = move-exception
            lf.v$a r5 = lf.v.f71841b
            java.lang.Object r2 = lf.w.a(r2)
            lf.v.b(r2)
        L_0x01a8:
            java.lang.String r2 = "threads"
            java.lang.Object r2 = r14.get(r2)
            if (r2 == 0) goto L_0x027a
            java.util.List r2 = (java.util.List) r2
            java.util.List r5 = r0.l()
            r5.clear()
            java.util.List r5 = r0.l()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            com.bugsnag.android.C1 r6 = r13.f38806g
            java.util.ArrayList r7 = new java.util.ArrayList
            int r9 = mf.C6565s.y(r2, r8)
            r7.<init>(r9)
            java.util.Iterator r2 = r2.iterator()
        L_0x01ce:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x01e2
            java.lang.Object r9 = r2.next()
            java.util.Map r9 = (java.util.Map) r9
            com.bugsnag.android.B1 r9 = r6.a(r9)
            r7.add(r9)
            goto L_0x01ce
        L_0x01e2:
            r5.addAll(r7)
            java.lang.String r2 = "breadcrumbs"
            java.lang.Object r2 = r14.get(r2)
            if (r2 == 0) goto L_0x0274
            java.util.List r2 = (java.util.List) r2
            java.util.List r3 = r0.g()
            r3.clear()
            java.util.List r3 = r0.g()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            com.bugsnag.android.p r5 = r13.f38807h
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = mf.C6565s.y(r2, r8)
            r6.<init>(r7)
            java.util.Iterator r2 = r2.iterator()
        L_0x020b:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x021f
            java.lang.Object r7 = r2.next()
            java.util.Map r7 = (java.util.Map) r7
            com.bugsnag.android.Breadcrumb r7 = r5.a(r7)
            r6.add(r7)
            goto L_0x020b
        L_0x021f:
            r3.addAll(r6)
            java.lang.String r2 = "metadata"
            java.lang.Object r2 = r14.get(r2)
            if (r2 == 0) goto L_0x026c
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0234:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0258
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.getValue()
            if (r3 == 0) goto L_0x0252
            java.util.Map r3 = (java.util.Map) r3
            r0.c(r5, r3)
            goto L_0x0234
        L_0x0252:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r1)
            throw r14
        L_0x0258:
            java.lang.String r1 = "correlation"
            java.lang.Object r14 = r14.get(r1)
            boolean r1 = r14 instanceof java.util.Map
            if (r1 == 0) goto L_0x0265
            r4 = r14
            java.util.Map r4 = (java.util.Map) r4
        L_0x0265:
            if (r4 != 0) goto L_0x0268
            goto L_0x026b
        L_0x0268:
            r13.b(r4, r0)
        L_0x026b:
            return r0
        L_0x026c:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            r14.<init>(r0)
            throw r14
        L_0x0274:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r3)
            throw r14
        L_0x027a:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r3)
            throw r14
        L_0x0280:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r3)
            throw r14
        L_0x0286:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r7)
            throw r14
        L_0x028c:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r7)
            throw r14
        L_0x0292:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r7)
            throw r14
        L_0x0298:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            r14.<init>(r0)
            throw r14
        L_0x02a0:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r5)
            throw r14
        L_0x02a6:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r5)
            throw r14
        L_0x02ac:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r1)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C3265p0.a(java.util.Map):com.bugsnag.android.o0");
    }
}
