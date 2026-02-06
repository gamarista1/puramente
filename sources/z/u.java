package z;

import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.K;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import w.C2797i;
import w.C2798j;
import w.l0;
import yf.p;

public abstract class u {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f29043a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f29044b;

        /* renamed from: c  reason: collision with root package name */
        int f29045c;

        a(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f29044b = obj;
            this.f29045c |= Integer.MIN_VALUE;
            return u.a((y) null, 0.0f, (C2797i) null, this);
        }
    }

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f29046a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f29047b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f29048c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2797i f29049d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ K f29050e;

        static final class a extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ K f29051a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v f29052b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(K k10, v vVar) {
                super(2);
                this.f29051a = k10;
                this.f29052b = vVar;
            }

            public final void a(float f10, float f11) {
                K k10 = this.f29051a;
                float f12 = k10.f71756a;
                k10.f71756a = f12 + this.f29052b.a(f10 - f12);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(float f10, C2797i iVar, K k10, C6658d dVar) {
            super(2, dVar);
            this.f29048c = f10;
            this.f29049d = iVar;
            this.f29050e = k10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f29048c, this.f29049d, this.f29050e, dVar);
            bVar.f29047b = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(v vVar, C6658d dVar) {
            return ((b) create(vVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f29046a;
            if (i10 == 0) {
                w.b(obj);
                float f11 = this.f29048c;
                C2797i iVar = this.f29049d;
                a aVar = new a(this.f29050e, (v) this.f29047b);
                this.f29046a = 1;
                if (l0.e(0.0f, f11, 0.0f, iVar, aVar, this, 4, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f29053a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f29054b;

        /* renamed from: c  reason: collision with root package name */
        int f29055c;

        c(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f29054b = obj;
            this.f29055c |= Integer.MIN_VALUE;
            return u.c((y) null, 0.0f, this);
        }
    }

    static final class d extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f29056a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f29057b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ K f29058c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f29059d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(K k10, float f10, C6658d dVar) {
            super(2, dVar);
            this.f29058c = k10;
            this.f29059d = f10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            d dVar2 = new d(this.f29058c, this.f29059d, dVar);
            dVar2.f29057b = obj;
            return dVar2;
        }

        /* renamed from: i */
        public final Object invoke(v vVar, C6658d dVar) {
            return ((d) create(vVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f29056a == 0) {
                w.b(obj);
                this.f29058c.f71756a = ((v) this.f29057b).a(this.f29059d);
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(z.y r7, float r8, w.C2797i r9, qf.C6658d r10) {
        /*
            boolean r0 = r10 instanceof z.u.a
            if (r0 == 0) goto L_0x0014
            r0 = r10
            z.u$a r0 = (z.u.a) r0
            int r1 = r0.f29045c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f29045c = r1
        L_0x0012:
            r4 = r0
            goto L_0x001a
        L_0x0014:
            z.u$a r0 = new z.u$a
            r0.<init>(r10)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r10 = r4.f29044b
            java.lang.Object r0 = rf.C6680b.f()
            int r1 = r4.f29045c
            r2 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 != r2) goto L_0x002f
            java.lang.Object r7 = r4.f29043a
            kotlin.jvm.internal.K r7 = (kotlin.jvm.internal.K) r7
            lf.w.b(r10)
            goto L_0x0055
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            lf.w.b(r10)
            kotlin.jvm.internal.K r10 = new kotlin.jvm.internal.K
            r10.<init>()
            z.u$b r3 = new z.u$b
            r1 = 0
            r3.<init>(r8, r9, r10, r1)
            r4.f29043a = r10
            r4.f29045c = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r7 = z.y.a(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L_0x0054
            return r0
        L_0x0054:
            r7 = r10
        L_0x0055:
            float r7 = r7.f71756a
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.b.b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z.u.a(z.y, float, w.i, qf.d):java.lang.Object");
    }

    public static /* synthetic */ Object b(y yVar, float f10, C2797i iVar, C6658d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = C2798j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        return a(yVar, f10, iVar, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(z.y r7, float r8, qf.C6658d r9) {
        /*
            boolean r0 = r9 instanceof z.u.c
            if (r0 == 0) goto L_0x0014
            r0 = r9
            z.u$c r0 = (z.u.c) r0
            int r1 = r0.f29055c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f29055c = r1
        L_0x0012:
            r4 = r0
            goto L_0x001a
        L_0x0014:
            z.u$c r0 = new z.u$c
            r0.<init>(r9)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r9 = r4.f29054b
            java.lang.Object r0 = rf.C6680b.f()
            int r1 = r4.f29055c
            r2 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 != r2) goto L_0x002f
            java.lang.Object r7 = r4.f29053a
            kotlin.jvm.internal.K r7 = (kotlin.jvm.internal.K) r7
            lf.w.b(r9)
            goto L_0x0055
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            lf.w.b(r9)
            kotlin.jvm.internal.K r9 = new kotlin.jvm.internal.K
            r9.<init>()
            z.u$d r3 = new z.u$d
            r1 = 0
            r3.<init>(r9, r8, r1)
            r4.f29053a = r9
            r4.f29055c = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r7 = z.y.a(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L_0x0054
            return r0
        L_0x0054:
            r7 = r9
        L_0x0055:
            float r7 = r7.f71756a
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.b.b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z.u.c(z.y, float, qf.d):java.lang.Object");
    }
}
