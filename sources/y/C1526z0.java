package Y;

import Y.C1490h0;
import kotlin.coroutines.jvm.internal.d;
import qf.C6658d;
import qf.g;
import yf.C6798l;
import yf.p;

/* renamed from: Y.z0  reason: case insensitive filesystem */
public final class C1526z0 implements C1490h0 {

    /* renamed from: a  reason: collision with root package name */
    private final C1490h0 f10211a;

    /* renamed from: b  reason: collision with root package name */
    private final C1475c0 f10212b = new C1475c0();

    /* renamed from: Y.z0$a */
    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f10213a;

        /* renamed from: b  reason: collision with root package name */
        Object f10214b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f10215c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1526z0 f10216d;

        /* renamed from: e  reason: collision with root package name */
        int f10217e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1526z0 z0Var, C6658d dVar) {
            super(dVar);
            this.f10216d = z0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f10215c = obj;
            this.f10217e |= Integer.MIN_VALUE;
            return this.f10216d.L0((C6798l) null, this);
        }
    }

    public C1526z0(C1490h0 h0Var) {
        this.f10211a = h0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063 A[PHI: r7 
      PHI: (r7v2 java.lang.Object) = (r7v4 java.lang.Object), (r7v1 java.lang.Object) binds: [B:19:0x0060, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object L0(yf.C6798l r6, qf.C6658d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Y.C1526z0.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Y.z0$a r0 = (Y.C1526z0.a) r0
            int r1 = r0.f10217e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10217e = r1
            goto L_0x0018
        L_0x0013:
            Y.z0$a r0 = new Y.z0$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f10215c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f10217e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            lf.w.b(r7)
            goto L_0x0063
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.f10214b
            yf.l r6 = (yf.C6798l) r6
            java.lang.Object r2 = r0.f10213a
            Y.z0 r2 = (Y.C1526z0) r2
            lf.w.b(r7)
            goto L_0x0053
        L_0x0040:
            lf.w.b(r7)
            Y.c0 r7 = r5.f10212b
            r0.f10213a = r5
            r0.f10214b = r6
            r0.f10217e = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r2 = r5
        L_0x0053:
            Y.h0 r7 = r2.f10211a
            r2 = 0
            r0.f10213a = r2
            r0.f10214b = r2
            r0.f10217e = r3
            java.lang.Object r7 = r7.L0(r6, r0)
            if (r7 != r1) goto L_0x0063
            return r1
        L_0x0063:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C1526z0.L0(yf.l, qf.d):java.lang.Object");
    }

    public g R0(g.c cVar) {
        return C1490h0.a.c(this, cVar);
    }

    public g.b b(g.c cVar) {
        return C1490h0.a.b(this, cVar);
    }

    public final void c() {
        this.f10212b.d();
    }

    public final void d() {
        this.f10212b.f();
    }

    public Object f0(Object obj, p pVar) {
        return C1490h0.a.a(this, obj, pVar);
    }

    public g n1(g gVar) {
        return C1490h0.a.d(this, gVar);
    }
}
