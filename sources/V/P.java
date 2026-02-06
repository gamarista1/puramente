package V;

import B.g;
import B.i;
import B.n;
import Y.A1;
import c1.h;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;
import w.C2782a;
import w.t0;

final class P {

    /* renamed from: a  reason: collision with root package name */
    private float f6803a;

    /* renamed from: b  reason: collision with root package name */
    private float f6804b;

    /* renamed from: c  reason: collision with root package name */
    private float f6805c;

    /* renamed from: d  reason: collision with root package name */
    private float f6806d;

    /* renamed from: e  reason: collision with root package name */
    private final C2782a f6807e;

    /* renamed from: f  reason: collision with root package name */
    private i f6808f;

    /* renamed from: g  reason: collision with root package name */
    private i f6809g;

    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f6810a;

        /* renamed from: b  reason: collision with root package name */
        Object f6811b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f6812c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ P f6813d;

        /* renamed from: e  reason: collision with root package name */
        int f6814e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(P p10, C6658d dVar) {
            super(dVar);
            this.f6813d = p10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f6812c = obj;
            this.f6814e |= Integer.MIN_VALUE;
            return this.f6813d.b((i) null, this);
        }
    }

    static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f6815a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f6816b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ P f6817c;

        /* renamed from: d  reason: collision with root package name */
        int f6818d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(P p10, C6658d dVar) {
            super(dVar);
            this.f6817c = p10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f6816b = obj;
            this.f6818d |= Integer.MIN_VALUE;
            return this.f6817c.e(this);
        }
    }

    public /* synthetic */ P(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    private final float d(i iVar) {
        if (iVar instanceof n.b) {
            return this.f6804b;
        }
        if (iVar instanceof g) {
            return this.f6805c;
        }
        if (iVar instanceof B.d) {
            return this.f6806d;
        }
        return this.f6803a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(qf.C6658d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof V.P.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            V.P$b r0 = (V.P.b) r0
            int r1 = r0.f6818d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6818d = r1
            goto L_0x0018
        L_0x0013:
            V.P$b r0 = new V.P$b
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f6816b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f6818d
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r0 = r0.f6815a
            V.P r0 = (V.P) r0
            lf.w.b(r5)     // Catch:{ all -> 0x002d }
            goto L_0x0064
        L_0x002d:
            r5 = move-exception
            goto L_0x006b
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            lf.w.b(r5)
            B.i r5 = r4.f6809g
            float r5 = r4.d(r5)
            w.a r2 = r4.f6807e
            java.lang.Object r2 = r2.k()
            c1.h r2 = (c1.h) r2
            float r2 = r2.r()
            boolean r2 = c1.h.m(r2, r5)
            if (r2 != 0) goto L_0x0070
            w.a r2 = r4.f6807e     // Catch:{ all -> 0x0069 }
            c1.h r5 = c1.h.e(r5)     // Catch:{ all -> 0x0069 }
            r0.f6815a = r4     // Catch:{ all -> 0x0069 }
            r0.f6818d = r3     // Catch:{ all -> 0x0069 }
            java.lang.Object r5 = r2.t(r5, r0)     // Catch:{ all -> 0x0069 }
            if (r5 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r0 = r4
        L_0x0064:
            B.i r5 = r0.f6809g
            r0.f6808f = r5
            goto L_0x0070
        L_0x0069:
            r5 = move-exception
            r0 = r4
        L_0x006b:
            B.i r1 = r0.f6809g
            r0.f6808f = r1
            throw r5
        L_0x0070:
            lf.M r5 = lf.C6514M.f71813a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: V.P.e(qf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(B.i r6, qf.C6658d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof V.P.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            V.P$a r0 = (V.P.a) r0
            int r1 = r0.f6814e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6814e = r1
            goto L_0x0018
        L_0x0013:
            V.P$a r0 = new V.P$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f6812c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f6814e
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r6 = r0.f6811b
            B.i r6 = (B.i) r6
            java.lang.Object r0 = r0.f6810a
            V.P r0 = (V.P) r0
            lf.w.b(r7)     // Catch:{ all -> 0x0031 }
            goto L_0x006b
        L_0x0031:
            r7 = move-exception
            goto L_0x0070
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            lf.w.b(r7)
            float r7 = r5.d(r6)
            r5.f6809g = r6
            w.a r2 = r5.f6807e     // Catch:{ all -> 0x0067 }
            java.lang.Object r2 = r2.k()     // Catch:{ all -> 0x0067 }
            c1.h r2 = (c1.h) r2     // Catch:{ all -> 0x0067 }
            float r2 = r2.r()     // Catch:{ all -> 0x0067 }
            boolean r2 = c1.h.m(r2, r7)     // Catch:{ all -> 0x0067 }
            if (r2 != 0) goto L_0x006a
            w.a r2 = r5.f6807e     // Catch:{ all -> 0x0067 }
            B.i r4 = r5.f6808f     // Catch:{ all -> 0x0067 }
            r0.f6810a = r5     // Catch:{ all -> 0x0067 }
            r0.f6811b = r6     // Catch:{ all -> 0x0067 }
            r0.f6814e = r3     // Catch:{ all -> 0x0067 }
            java.lang.Object r7 = W.l.d(r2, r7, r4, r6, r0)     // Catch:{ all -> 0x0067 }
            if (r7 != r1) goto L_0x006a
            return r1
        L_0x0067:
            r7 = move-exception
            r0 = r5
            goto L_0x0070
        L_0x006a:
            r0 = r5
        L_0x006b:
            r0.f6808f = r6
            lf.M r6 = lf.C6514M.f71813a
            return r6
        L_0x0070:
            r0.f6808f = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: V.P.b(B.i, qf.d):java.lang.Object");
    }

    public final A1 c() {
        return this.f6807e.g();
    }

    public final Object f(float f10, float f11, float f12, float f13, C6658d dVar) {
        this.f6803a = f10;
        this.f6804b = f11;
        this.f6805c = f12;
        this.f6806d = f13;
        Object e10 = e(dVar);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    private P(float f10, float f11, float f12, float f13) {
        this.f6803a = f10;
        this.f6804b = f11;
        this.f6805c = f12;
        this.f6806d = f13;
        this.f6807e = new C2782a(h.e(this.f6803a), t0.b(h.f19213b), (Object) null, (String) null, 12, (DefaultConstructorMarker) null);
    }
}
