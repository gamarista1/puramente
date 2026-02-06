package M;

import Ug.C5600w0;
import Ug.K;
import Ug.L;
import Ug.M;
import Y.C1503n0;
import Y.D0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import w.C2780Y;
import yf.p;

/* renamed from: M.o  reason: case insensitive filesystem */
public final class C1274o {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public AtomicReference f4229a = new AtomicReference((Object) null);

    /* renamed from: b  reason: collision with root package name */
    private final C1503n0 f4230b = D0.a(0.0f);

    /* renamed from: M.o$a */
    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f4231a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f4232b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1274o f4233c;

        /* renamed from: M.o$a$a  reason: collision with other inner class name */
        static final class C0105a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f4234a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C5600w0 f4235b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C1274o f4236c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0105a(C5600w0 w0Var, C1274o oVar, C6658d dVar) {
                super(2, dVar);
                this.f4235b = w0Var;
                this.f4236c = oVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new C0105a(this.f4235b, this.f4236c, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((C0105a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x0049 A[Catch:{ all -> 0x0018 }, RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x0057 A[RETURN] */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = rf.C6680b.f()
                    int r1 = r8.f4234a
                    r2 = 0
                    r3 = 500(0x1f4, double:2.47E-321)
                    r5 = 3
                    r6 = 2
                    r7 = 1
                    if (r1 == 0) goto L_0x002a
                    if (r1 == r7) goto L_0x0026
                    if (r1 == r6) goto L_0x0022
                    if (r1 != r5) goto L_0x001a
                    lf.w.b(r9)     // Catch:{ all -> 0x0018 }
                    goto L_0x003a
                L_0x0018:
                    r9 = move-exception
                    goto L_0x0058
                L_0x001a:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L_0x0022:
                    lf.w.b(r9)     // Catch:{ all -> 0x0018 }
                    goto L_0x004a
                L_0x0026:
                    lf.w.b(r9)
                    goto L_0x003a
                L_0x002a:
                    lf.w.b(r9)
                    Ug.w0 r9 = r8.f4235b
                    if (r9 == 0) goto L_0x003a
                    r8.f4234a = r7
                    java.lang.Object r9 = Ug.A0.g(r9, r8)
                    if (r9 != r0) goto L_0x003a
                    return r0
                L_0x003a:
                    M.o r9 = r8.f4236c     // Catch:{ all -> 0x0018 }
                    r1 = 1065353216(0x3f800000, float:1.0)
                    r9.d(r1)     // Catch:{ all -> 0x0018 }
                    r8.f4234a = r6     // Catch:{ all -> 0x0018 }
                    java.lang.Object r9 = Ug.V.a(r3, r8)     // Catch:{ all -> 0x0018 }
                    if (r9 != r0) goto L_0x004a
                    return r0
                L_0x004a:
                    M.o r9 = r8.f4236c     // Catch:{ all -> 0x0018 }
                    r9.d(r2)     // Catch:{ all -> 0x0018 }
                    r8.f4234a = r5     // Catch:{ all -> 0x0018 }
                    java.lang.Object r9 = Ug.V.a(r3, r8)     // Catch:{ all -> 0x0018 }
                    if (r9 != r0) goto L_0x003a
                    return r0
                L_0x0058:
                    M.o r0 = r8.f4236c
                    r0.d(r2)
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: M.C1274o.a.C0105a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1274o oVar, C6658d dVar) {
            super(2, dVar);
            this.f4233c = oVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f4233c, dVar);
            aVar.f4232b = obj;
            return aVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f4231a == 0) {
                w.b(obj);
                return b.a(C2780Y.a(this.f4233c.f4229a, (Object) null, C5576k.d((K) this.f4232b, (g) null, (M) null, new C0105a((C5600w0) this.f4233c.f4229a.getAndSet((Object) null), this.f4233c, (C6658d) null), 3, (Object) null)));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: private */
    public final void d(float f10) {
        this.f4230b.l(f10);
    }

    public final float c() {
        return this.f4230b.c();
    }

    public final Object e(C6658d dVar) {
        Object e10 = L.e(new a(this, (C6658d) null), dVar);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }
}
