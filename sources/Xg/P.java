package Xg;

import kotlin.coroutines.jvm.internal.d;
import qf.C6658d;
import yf.p;

public final class P implements C5695g {

    /* renamed from: a  reason: collision with root package name */
    private final C5695g f66476a;

    /* renamed from: b  reason: collision with root package name */
    private final p f66477b;

    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f66478a;

        /* renamed from: b  reason: collision with root package name */
        Object f66479b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f66480c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ P f66481d;

        /* renamed from: e  reason: collision with root package name */
        int f66482e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(P p10, C6658d dVar) {
            super(dVar);
            this.f66481d = p10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f66480c = obj;
            this.f66482e |= Integer.MIN_VALUE;
            return this.f66481d.a(this);
        }
    }

    public P(C5695g gVar, p pVar) {
        this.f66476a = gVar;
        this.f66477b = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(qf.C6658d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof Xg.P.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Xg.P$a r0 = (Xg.P.a) r0
            int r1 = r0.f66482e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f66482e = r1
            goto L_0x0018
        L_0x0013:
            Xg.P$a r0 = new Xg.P$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f66480c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f66482e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            lf.w.b(r7)
            goto L_0x0079
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0034:
            java.lang.Object r2 = r0.f66479b
            Yg.u r2 = (Yg.u) r2
            java.lang.Object r4 = r0.f66478a
            Xg.P r4 = (Xg.P) r4
            lf.w.b(r7)     // Catch:{ all -> 0x0040 }
            goto L_0x0060
        L_0x0040:
            r7 = move-exception
            goto L_0x007f
        L_0x0042:
            lf.w.b(r7)
            Yg.u r2 = new Yg.u
            Xg.g r7 = r6.f66476a
            qf.g r5 = r0.getContext()
            r2.<init>(r7, r5)
            yf.p r7 = r6.f66477b     // Catch:{ all -> 0x0040 }
            r0.f66478a = r6     // Catch:{ all -> 0x0040 }
            r0.f66479b = r2     // Catch:{ all -> 0x0040 }
            r0.f66482e = r4     // Catch:{ all -> 0x0040 }
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch:{ all -> 0x0040 }
            if (r7 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r4 = r6
        L_0x0060:
            r2.releaseIntercepted()
            Xg.g r7 = r4.f66476a
            boolean r2 = r7 instanceof Xg.P
            if (r2 == 0) goto L_0x007c
            Xg.P r7 = (Xg.P) r7
            r2 = 0
            r0.f66478a = r2
            r0.f66479b = r2
            r0.f66482e = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L_0x0079
            return r1
        L_0x0079:
            lf.M r7 = lf.C6514M.f71813a
            return r7
        L_0x007c:
            lf.M r7 = lf.C6514M.f71813a
            return r7
        L_0x007f:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Xg.P.a(qf.d):java.lang.Object");
    }

    public Object emit(Object obj, C6658d dVar) {
        return this.f66476a.emit(obj, dVar);
    }
}
