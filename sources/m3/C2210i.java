package m3;

import dh.C5817a;
import dh.c;
import kotlin.coroutines.jvm.internal.d;
import m3.C2224x;
import mf.C6565s;
import mf.I;
import qf.C6658d;

/* renamed from: m3.i  reason: case insensitive filesystem */
final class C2210i {

    /* renamed from: a  reason: collision with root package name */
    private final C2211j f24015a = new C2211j();

    /* renamed from: b  reason: collision with root package name */
    private final C5817a f24016b = c.b(false, 1, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    private int f24017c = -1;

    /* renamed from: m3.i$a */
    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f24018a;

        /* renamed from: b  reason: collision with root package name */
        Object f24019b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f24020c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2210i f24021d;

        /* renamed from: e  reason: collision with root package name */
        int f24022e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2210i iVar, C6658d dVar) {
            super(dVar);
            this.f24021d = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f24020c = obj;
            this.f24022e |= Integer.MIN_VALUE;
            return this.f24021d.b(this);
        }
    }

    /* renamed from: m3.i$b */
    static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f24023a;

        /* renamed from: b  reason: collision with root package name */
        Object f24024b;

        /* renamed from: c  reason: collision with root package name */
        Object f24025c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f24026d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C2210i f24027e;

        /* renamed from: f  reason: collision with root package name */
        int f24028f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2210i iVar, C6658d dVar) {
            super(dVar);
            this.f24027e = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f24026d = obj;
            this.f24028f |= Integer.MIN_VALUE;
            return this.f24027e.c((I) null, this);
        }
    }

    public final C2224x.b a() {
        C2224x xVar = (C2224x) C6565s.q0(this.f24015a.b());
        if (xVar == null || !(xVar instanceof C2224x.b)) {
            return null;
        }
        C2224x.b bVar = (C2224x.b) xVar;
        if (bVar.f() == C2220t.REFRESH) {
            return bVar;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074 A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(qf.C6658d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof m3.C2210i.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            m3.i$a r0 = (m3.C2210i.a) r0
            int r1 = r0.f24022e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f24022e = r1
            goto L_0x0018
        L_0x0013:
            m3.i$a r0 = new m3.i$a
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f24020c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f24022e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r1 = r0.f24019b
            dh.a r1 = (dh.C5817a) r1
            java.lang.Object r0 = r0.f24018a
            m3.i r0 = (m3.C2210i) r0
            lf.w.b(r9)
            goto L_0x004e
        L_0x0032:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003a:
            lf.w.b(r9)
            dh.a r9 = r8.f24016b
            r0.f24018a = r8
            r0.f24019b = r9
            r0.f24022e = r3
            java.lang.Object r0 = r9.a(r4, r0)
            if (r0 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r8
            r1 = r9
        L_0x004e:
            m3.j r9 = r0.f24015a     // Catch:{ all -> 0x0080 }
            java.util.List r9 = r9.b()     // Catch:{ all -> 0x0080 }
            int r0 = r0.f24017c     // Catch:{ all -> 0x0080 }
            int r2 = r9.size()     // Catch:{ all -> 0x0080 }
            int r0 = r0 - r2
            int r0 = r0 + r3
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch:{ all -> 0x0080 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0080 }
            r3 = 10
            int r3 = mf.C6565s.y(r9, r3)     // Catch:{ all -> 0x0080 }
            r2.<init>(r3)     // Catch:{ all -> 0x0080 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0080 }
            r3 = 0
        L_0x006e:
            boolean r5 = r9.hasNext()     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x008f
            java.lang.Object r5 = r9.next()     // Catch:{ all -> 0x0080 }
            int r6 = r3 + 1
            if (r3 >= 0) goto L_0x0082
            mf.C6565s.x()     // Catch:{ all -> 0x0080 }
            goto L_0x0082
        L_0x0080:
            r9 = move-exception
            goto L_0x0093
        L_0x0082:
            m3.x r5 = (m3.C2224x) r5     // Catch:{ all -> 0x0080 }
            mf.I r7 = new mf.I     // Catch:{ all -> 0x0080 }
            int r3 = r3 + r0
            r7.<init>(r3, r5)     // Catch:{ all -> 0x0080 }
            r2.add(r7)     // Catch:{ all -> 0x0080 }
            r3 = r6
            goto L_0x006e
        L_0x008f:
            r1.e(r4)
            return r2
        L_0x0093:
            r1.e(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.C2210i.b(qf.d):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(mf.I r6, qf.C6658d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof m3.C2210i.b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            m3.i$b r0 = (m3.C2210i.b) r0
            int r1 = r0.f24028f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f24028f = r1
            goto L_0x0018
        L_0x0013:
            m3.i$b r0 = new m3.i$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f24026d
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f24028f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r6 = r0.f24025c
            dh.a r6 = (dh.C5817a) r6
            java.lang.Object r1 = r0.f24024b
            mf.I r1 = (mf.I) r1
            java.lang.Object r0 = r0.f24023a
            m3.i r0 = (m3.C2210i) r0
            lf.w.b(r7)
            r7 = r6
            r6 = r1
            goto L_0x0055
        L_0x0038:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0040:
            lf.w.b(r7)
            dh.a r7 = r5.f24016b
            r0.f24023a = r5
            r0.f24024b = r6
            r0.f24025c = r7
            r0.f24028f = r3
            java.lang.Object r0 = r7.a(r4, r0)
            if (r0 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r0 = r5
        L_0x0055:
            int r1 = r6.c()     // Catch:{ all -> 0x006e }
            r0.f24017c = r1     // Catch:{ all -> 0x006e }
            m3.j r0 = r0.f24015a     // Catch:{ all -> 0x006e }
            java.lang.Object r6 = r6.d()     // Catch:{ all -> 0x006e }
            m3.x r6 = (m3.C2224x) r6     // Catch:{ all -> 0x006e }
            r0.a(r6)     // Catch:{ all -> 0x006e }
            lf.M r6 = lf.C6514M.f71813a     // Catch:{ all -> 0x006e }
            r7.e(r4)
            lf.M r6 = lf.C6514M.f71813a
            return r6
        L_0x006e:
            r6 = move-exception
            r7.e(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.C2210i.c(mf.I, qf.d):java.lang.Object");
    }
}
