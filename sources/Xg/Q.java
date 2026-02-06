package Xg;

import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import qf.C6658d;
import yf.p;

final class Q implements B {

    /* renamed from: a  reason: collision with root package name */
    private final B f66483a;

    /* renamed from: b  reason: collision with root package name */
    private final p f66484b;

    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f66485a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Q f66486b;

        /* renamed from: c  reason: collision with root package name */
        int f66487c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Q q10, C6658d dVar) {
            super(dVar);
            this.f66486b = q10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f66485a = obj;
            this.f66487c |= Integer.MIN_VALUE;
            return this.f66486b.collect((C5695g) null, this);
        }
    }

    public Q(B b10, p pVar) {
        this.f66483a = b10;
        this.f66484b = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(Xg.C5695g r6, qf.C6658d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Xg.Q.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Xg.Q$a r0 = (Xg.Q.a) r0
            int r1 = r0.f66487c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f66487c = r1
            goto L_0x0018
        L_0x0013:
            Xg.Q$a r0 = new Xg.Q$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f66485a
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f66487c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002d:
            lf.w.b(r7)
            goto L_0x0046
        L_0x0031:
            lf.w.b(r7)
            Xg.B r7 = r5.f66483a
            Xg.P r2 = new Xg.P
            yf.p r4 = r5.f66484b
            r2.<init>(r6, r4)
            r0.f66487c = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L_0x0046
            return r1
        L_0x0046:
            lf.k r6 = new lf.k
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Xg.Q.collect(Xg.g, qf.d):java.lang.Object");
    }

    public List d() {
        return this.f66483a.d();
    }
}
