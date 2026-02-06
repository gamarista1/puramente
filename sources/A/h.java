package A;

import Ef.m;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.K;
import lf.C6514M;
import qf.C6658d;
import w.C2796h;
import w.C2797i;
import w.C2799k;
import w.C2814z;
import yf.C6798l;
import z.C2939C;
import z.v;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private static final float f398a = c1.h.j((float) 400);

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        float f399a;

        /* renamed from: b  reason: collision with root package name */
        Object f400b;

        /* renamed from: c  reason: collision with root package name */
        Object f401c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f402d;

        /* renamed from: e  reason: collision with root package name */
        int f403e;

        a(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f402d = obj;
            this.f403e |= Integer.MIN_VALUE;
            return h.f((v) null, 0.0f, (C2799k) null, (C2814z) null, (C6798l) null, this);
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f404a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ K f405b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ v f406c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6798l f407d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(float f10, K k10, v vVar, C6798l lVar) {
            super(1);
            this.f404a = f10;
            this.f405b = k10;
            this.f406c = vVar;
            this.f407d = lVar;
        }

        public final void a(C2796h hVar) {
            if (Math.abs(((Number) hVar.e()).floatValue()) >= Math.abs(this.f404a)) {
                float e10 = h.j(((Number) hVar.e()).floatValue(), this.f404a);
                h.g(hVar, this.f406c, this.f407d, e10 - this.f405b.f71756a);
                hVar.a();
                this.f405b.f71756a = e10;
                return;
            }
            h.g(hVar, this.f406c, this.f407d, ((Number) hVar.e()).floatValue() - this.f405b.f71756a);
            this.f405b.f71756a = ((Number) hVar.e()).floatValue();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2796h) obj);
            return C6514M.f71813a;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        float f408a;

        /* renamed from: b  reason: collision with root package name */
        float f409b;

        /* renamed from: c  reason: collision with root package name */
        Object f410c;

        /* renamed from: d  reason: collision with root package name */
        Object f411d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f412e;

        /* renamed from: f  reason: collision with root package name */
        int f413f;

        c(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f412e = obj;
            this.f413f |= Integer.MIN_VALUE;
            return h.h((v) null, 0.0f, 0.0f, (C2799k) null, (C2797i) null, (C6798l) null, this);
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f414a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ K f415b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ v f416c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6798l f417d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(float f10, K k10, v vVar, C6798l lVar) {
            super(1);
            this.f414a = f10;
            this.f415b = k10;
            this.f416c = vVar;
            this.f417d = lVar;
        }

        public final void a(C2796h hVar) {
            float e10 = h.j(((Number) hVar.e()).floatValue(), this.f414a);
            float f10 = e10 - this.f415b.f71756a;
            float a10 = this.f416c.a(f10);
            this.f417d.invoke(Float.valueOf(a10));
            if (Math.abs(f10 - a10) > 0.5f || e10 != ((Number) hVar.e()).floatValue()) {
                hVar.a();
            }
            this.f415b.f71756a += a10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2796h) obj);
            return C6514M.f71813a;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object f(z.v r5, float r6, w.C2799k r7, w.C2814z r8, yf.C6798l r9, qf.C6658d r10) {
        /*
            boolean r0 = r10 instanceof A.h.a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            A.h$a r0 = (A.h.a) r0
            int r1 = r0.f403e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f403e = r1
            goto L_0x0018
        L_0x0013:
            A.h$a r0 = new A.h$a
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.f402d
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f403e
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            float r6 = r0.f399a
            java.lang.Object r5 = r0.f401c
            kotlin.jvm.internal.K r5 = (kotlin.jvm.internal.K) r5
            java.lang.Object r7 = r0.f400b
            w.k r7 = (w.C2799k) r7
            lf.w.b(r10)
            goto L_0x006b
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            lf.w.b(r10)
            kotlin.jvm.internal.K r10 = new kotlin.jvm.internal.K
            r10.<init>()
            java.lang.Object r2 = r7.n()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0054
            r2 = r3
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            r2 = r2 ^ r3
            A.h$b r4 = new A.h$b
            r4.<init>(r6, r10, r5, r9)
            r0.f400b = r7
            r0.f401c = r10
            r0.f399a = r6
            r0.f403e = r3
            java.lang.Object r5 = w.l0.g(r7, r8, r2, r4, r0)
            if (r5 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r5 = r10
        L_0x006b:
            A.a r8 = new A.a
            float r5 = r5.f71756a
            float r6 = r6 - r5
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.b(r6)
            r8.<init>(r5, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: A.h.f(z.v, float, w.k, w.z, yf.l, qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final void g(C2796h hVar, v vVar, C6798l lVar, float f10) {
        float a10 = vVar.a(f10);
        lVar.invoke(Float.valueOf(a10));
        if (Math.abs(f10 - a10) > 0.5f) {
            hVar.a();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object h(z.v r12, float r13, float r14, w.C2799k r15, w.C2797i r16, yf.C6798l r17, qf.C6658d r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof A.h.c
            if (r1 == 0) goto L_0x0016
            r1 = r0
            A.h$c r1 = (A.h.c) r1
            int r2 = r1.f413f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.f413f = r2
        L_0x0014:
            r7 = r1
            goto L_0x001c
        L_0x0016:
            A.h$c r1 = new A.h$c
            r1.<init>(r0)
            goto L_0x0014
        L_0x001c:
            java.lang.Object r0 = r7.f412e
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r7.f413f
            r3 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            float r1 = r7.f409b
            float r2 = r7.f408a
            java.lang.Object r3 = r7.f411d
            kotlin.jvm.internal.K r3 = (kotlin.jvm.internal.K) r3
            java.lang.Object r4 = r7.f410c
            w.k r4 = (w.C2799k) r4
            lf.w.b(r0)
            r10 = r2
            r0 = r4
            goto L_0x0090
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            lf.w.b(r0)
            kotlin.jvm.internal.K r0 = new kotlin.jvm.internal.K
            r0.<init>()
            java.lang.Object r2 = r15.n()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.b.b(r13)
            java.lang.Object r2 = r15.n()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x006a
            r2 = r3
            goto L_0x006b
        L_0x006a:
            r2 = 0
        L_0x006b:
            r5 = r2 ^ 1
            A.h$d r6 = new A.h$d
            r2 = r12
            r9 = r14
            r10 = r17
            r6.<init>(r14, r0, r12, r10)
            r9 = r15
            r7.f410c = r9
            r7.f411d = r0
            r10 = r13
            r7.f408a = r10
            r7.f409b = r8
            r7.f413f = r3
            r2 = r15
            r3 = r4
            r4 = r16
            java.lang.Object r2 = w.l0.i(r2, r3, r4, r5, r6, r7)
            if (r2 != r1) goto L_0x008d
            return r1
        L_0x008d:
            r3 = r0
            r1 = r8
            r0 = r9
        L_0x0090:
            java.lang.Object r2 = r0.n()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = j(r2, r1)
            A.a r11 = new A.a
            float r1 = r3.f71756a
            float r10 = r10 - r1
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.b.b(r10)
            r8 = 29
            r9 = 0
            r1 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            w.k r0 = w.C2800l.g(r0, r1, r2, r3, r5, r7, r8, r9)
            r11.<init>(r10, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: A.h.h(z.v, float, float, w.k, w.i, yf.l, qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final Object i(v vVar, float f10, float f11, b bVar, C6798l lVar, C6658d dVar) {
        return bVar.a(vVar, kotlin.coroutines.jvm.internal.b.b(f10), kotlin.coroutines.jvm.internal.b.b(f11), lVar, dVar);
    }

    /* access modifiers changed from: private */
    public static final float j(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        if (f11 > 0.0f) {
            return m.g(f10, f11);
        }
        return m.c(f10, f11);
    }

    public static final float k() {
        return f398a;
    }

    public static final C2939C l(i iVar, C2814z zVar, C2797i iVar2) {
        return new g(iVar, zVar, iVar2);
    }
}
