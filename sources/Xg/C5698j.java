package Xg;

import Wg.t;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import qf.C6658d;
import qf.g;
import rf.C6680b;

/* renamed from: Xg.j  reason: case insensitive filesystem */
abstract /* synthetic */ class C5698j {

    /* renamed from: Xg.j$a */
    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f66520a;

        /* renamed from: b  reason: collision with root package name */
        Object f66521b;

        /* renamed from: c  reason: collision with root package name */
        Object f66522c;

        /* renamed from: d  reason: collision with root package name */
        boolean f66523d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f66524e;

        /* renamed from: f  reason: collision with root package name */
        int f66525f;

        a(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f66524e = obj;
            this.f66525f |= Integer.MIN_VALUE;
            return C5698j.d((C5695g) null, (t) null, false, this);
        }
    }

    public static final C5694f b(t tVar) {
        return new C5691c(tVar, true, (g) null, 0, (Wg.a) null, 28, (DefaultConstructorMarker) null);
    }

    public static final Object c(C5695g gVar, t tVar, C6658d dVar) {
        Object d10 = d(gVar, tVar, true, dVar);
        if (d10 == C6680b.f()) {
            return d10;
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009e, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
        if (r8 != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a1, code lost:
        Wg.k.a(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a4, code lost:
        throw r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072 A[Catch:{ all -> 0x009e }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073 A[Catch:{ all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f A[Catch:{ all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(Xg.C5695g r6, Wg.t r7, boolean r8, qf.C6658d r9) {
        /*
            boolean r0 = r9 instanceof Xg.C5698j.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            Xg.j$a r0 = (Xg.C5698j.a) r0
            int r1 = r0.f66525f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f66525f = r1
            goto L_0x0018
        L_0x0013:
            Xg.j$a r0 = new Xg.j$a
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f66524e
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f66525f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0058
            if (r2 == r4) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            boolean r8 = r0.f66523d
            java.lang.Object r6 = r0.f66522c
            Wg.f r6 = (Wg.f) r6
            java.lang.Object r7 = r0.f66521b
            Wg.t r7 = (Wg.t) r7
            java.lang.Object r2 = r0.f66520a
            Xg.g r2 = (Xg.C5695g) r2
            lf.w.b(r9)     // Catch:{ all -> 0x003c }
        L_0x0039:
            r9 = r6
            r6 = r2
            goto L_0x0062
        L_0x003c:
            r6 = move-exception
            goto L_0x009d
        L_0x003e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0046:
            boolean r8 = r0.f66523d
            java.lang.Object r6 = r0.f66522c
            Wg.f r6 = (Wg.f) r6
            java.lang.Object r7 = r0.f66521b
            Wg.t r7 = (Wg.t) r7
            java.lang.Object r2 = r0.f66520a
            Xg.g r2 = (Xg.C5695g) r2
            lf.w.b(r9)     // Catch:{ all -> 0x003c }
            goto L_0x0077
        L_0x0058:
            lf.w.b(r9)
            Xg.C5696h.s(r6)
            Wg.f r9 = r7.iterator()     // Catch:{ all -> 0x003c }
        L_0x0062:
            r0.f66520a = r6     // Catch:{ all -> 0x003c }
            r0.f66521b = r7     // Catch:{ all -> 0x003c }
            r0.f66522c = r9     // Catch:{ all -> 0x003c }
            r0.f66523d = r8     // Catch:{ all -> 0x003c }
            r0.f66525f = r4     // Catch:{ all -> 0x003c }
            java.lang.Object r2 = r9.a(r0)     // Catch:{ all -> 0x003c }
            if (r2 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L_0x0077:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x003c }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x003c }
            if (r9 == 0) goto L_0x0094
            java.lang.Object r9 = r6.next()     // Catch:{ all -> 0x003c }
            r0.f66520a = r2     // Catch:{ all -> 0x003c }
            r0.f66521b = r7     // Catch:{ all -> 0x003c }
            r0.f66522c = r6     // Catch:{ all -> 0x003c }
            r0.f66523d = r8     // Catch:{ all -> 0x003c }
            r0.f66525f = r3     // Catch:{ all -> 0x003c }
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch:{ all -> 0x003c }
            if (r9 != r1) goto L_0x0039
            return r1
        L_0x0094:
            if (r8 == 0) goto L_0x009a
            r6 = 0
            Wg.k.a(r7, r6)
        L_0x009a:
            lf.M r6 = lf.C6514M.f71813a
            return r6
        L_0x009d:
            throw r6     // Catch:{ all -> 0x009e }
        L_0x009e:
            r9 = move-exception
            if (r8 == 0) goto L_0x00a4
            Wg.k.a(r7, r6)
        L_0x00a4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Xg.C5698j.d(Xg.g, Wg.t, boolean, qf.d):java.lang.Object");
    }
}
