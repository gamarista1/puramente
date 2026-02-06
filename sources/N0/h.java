package N0;

import Ef.m;
import kotlin.coroutines.jvm.internal.d;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;
import yf.p;

final class h {

    /* renamed from: a  reason: collision with root package name */
    private final int f4367a;

    /* renamed from: b  reason: collision with root package name */
    private final p f4368b;

    /* renamed from: c  reason: collision with root package name */
    private float f4369c;

    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f4370a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f4371b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f4372c;

        /* renamed from: d  reason: collision with root package name */
        int f4373d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, C6658d dVar) {
            super(dVar);
            this.f4372c = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f4371b = obj;
            this.f4373d |= Integer.MIN_VALUE;
            return this.f4372c.e(0.0f, this);
        }
    }

    public h(int i10, p pVar) {
        this.f4367a = i10;
        this.f4368b = pVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(float r5, qf.C6658d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof N0.h.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            N0.h$a r0 = (N0.h.a) r0
            int r1 = r0.f4373d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f4373d = r1
            goto L_0x0018
        L_0x0013:
            N0.h$a r0 = new N0.h$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f4371b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f4373d
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f4370a
            N0.h r5 = (N0.h) r5
            lf.w.b(r6)
            goto L_0x004a
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            lf.w.b(r6)
            yf.p r6 = r4.f4368b
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.b(r5)
            r0.f4370a = r4
            r0.f4373d = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L_0x0049
            return r1
        L_0x0049:
            r5 = r4
        L_0x004a:
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r0 = r5.f4369c
            float r0 = r0 + r6
            r5.f4369c = r0
            lf.M r5 = lf.C6514M.f71813a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.h.e(float, qf.d):java.lang.Object");
    }

    public final float b() {
        return this.f4369c;
    }

    public final int c(int i10) {
        return m.l(i10 - Af.a.d(this.f4369c), 0, this.f4367a);
    }

    public final void d() {
        this.f4369c = 0.0f;
    }

    public final Object f(int i10, int i11, C6658d dVar) {
        if (i10 <= i11) {
            int i12 = i11 - i10;
            int i13 = this.f4367a;
            if (i12 <= i13) {
                float f10 = (float) i10;
                float f11 = this.f4369c;
                if (f10 >= f11 && ((float) i11) <= ((float) i13) + f11) {
                    return C6514M.f71813a;
                }
                if (f10 >= f11) {
                    i10 = i11 - i13;
                }
                Object g10 = g((float) i10, dVar);
                if (g10 == C6680b.f()) {
                    return g10;
                }
                return C6514M.f71813a;
            }
            throw new IllegalArgumentException(("Expected range (" + i12 + ") to be ≤ viewportSize=" + this.f4367a).toString());
        }
        throw new IllegalArgumentException(("Expected min=" + i10 + " ≤ max=" + i11).toString());
    }

    public final Object g(float f10, C6658d dVar) {
        Object e10 = e(f10 - this.f4369c, dVar);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }
}
