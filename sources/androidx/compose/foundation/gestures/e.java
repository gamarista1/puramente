package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.d;
import q0.C2421g;
import qf.C6658d;
import z.C2937A;

final class e implements C0.a {

    /* renamed from: a  reason: collision with root package name */
    private final C2937A f12688a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12689b;

    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        long f12690a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f12691b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f12692c;

        /* renamed from: d  reason: collision with root package name */
        int f12693d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, C6658d dVar) {
            super(dVar);
            this.f12692c = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12691b = obj;
            this.f12693d |= Integer.MIN_VALUE;
            return this.f12692c.b0(0, 0, this);
        }
    }

    public e(C2937A a10, boolean z10) {
        this.f12688a = a10;
        this.f12689b = z10;
    }

    public long M0(long j10, long j11, int i10) {
        if (this.f12689b) {
            return this.f12688a.r(j11);
        }
        return C2421g.f25320b.c();
    }

    public final void a(boolean z10) {
        this.f12689b = z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b0(long r3, long r5, qf.C6658d r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.foundation.gestures.e.a
            if (r3 == 0) goto L_0x0013
            r3 = r7
            androidx.compose.foundation.gestures.e$a r3 = (androidx.compose.foundation.gestures.e.a) r3
            int r4 = r3.f12693d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L_0x0013
            int r4 = r4 - r0
            r3.f12693d = r4
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.e$a r3 = new androidx.compose.foundation.gestures.e$a
            r3.<init>(r2, r7)
        L_0x0018:
            java.lang.Object r4 = r3.f12691b
            java.lang.Object r7 = rf.C6680b.f()
            int r0 = r3.f12693d
            r1 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r1) goto L_0x002b
            long r5 = r3.f12690a
            lf.w.b(r4)
            goto L_0x0047
        L_0x002b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L_0x0033:
            lf.w.b(r4)
            boolean r4 = r2.f12689b
            if (r4 == 0) goto L_0x0052
            z.A r4 = r2.f12688a
            r3.f12690a = r5
            r3.f12693d = r1
            java.lang.Object r4 = r4.n(r5, r3)
            if (r4 != r7) goto L_0x0047
            return r7
        L_0x0047:
            c1.y r4 = (c1.y) r4
            long r3 = r4.o()
            long r3 = c1.y.k(r5, r3)
            goto L_0x0058
        L_0x0052:
            c1.y$a r3 = c1.y.f19251b
            long r3 = r3.a()
        L_0x0058:
            c1.y r3 = c1.y.b(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e.b0(long, long, qf.d):java.lang.Object");
    }
}
