package G;

import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import qf.C6658d;
import yf.C6798l;
import z.C2939C;
import z.n;
import z.v;

final class E implements n {

    /* renamed from: a  reason: collision with root package name */
    private final C2939C f2241a;

    /* renamed from: b  reason: collision with root package name */
    private final C f2242b;

    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f2243a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ E f2244b;

        /* renamed from: c  reason: collision with root package name */
        int f2245c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(E e10, C6658d dVar) {
            super(dVar);
            this.f2244b = e10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f2243a = obj;
            this.f2245c |= Integer.MIN_VALUE;
            return this.f2244b.a((v) null, 0.0f, this);
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E f2246a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f2247b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(E e10, v vVar) {
            super(1);
            this.f2246a = e10;
            this.f2247b = vVar;
        }

        public final void a(float f10) {
            float f11;
            if (this.f2246a.d().H() != 0) {
                f11 = f10 / ((float) this.f2246a.d().H());
            } else {
                f11 = 0.0f;
            }
            this.f2246a.d().k0(this.f2247b, Af.a.d(f11) + this.f2246a.d().v());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return C6514M.f71813a;
        }
    }

    public E(C2939C c10, C c11) {
        this.f2241a = c10;
        this.f2242b = c11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(z.v r5, float r6, qf.C6658d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof G.E.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            G.E$a r0 = (G.E.a) r0
            int r1 = r0.f2245c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f2245c = r1
            goto L_0x0018
        L_0x0013:
            G.E$a r0 = new G.E$a
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f2243a
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f2245c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            lf.w.b(r7)
            goto L_0x0044
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            lf.w.b(r7)
            z.C r7 = r4.f2241a
            G.E$b r2 = new G.E$b
            r2.<init>(r4, r5)
            r0.f2245c = r3
            java.lang.Object r7 = r7.c(r5, r6, r2, r0)
            if (r7 != r1) goto L_0x0044
            return r1
        L_0x0044:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: G.E.a(z.v, float, qf.d):java.lang.Object");
    }

    public final C d() {
        return this.f2242b;
    }
}
