package J;

import D0.A;
import D0.C1111b;
import D0.J;
import Ug.C5600w0;
import Ug.K;
import Ug.L;
import Ug.M;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import q0.C2421g;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import z.j;
import z.o;

public abstract class B {

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f2819a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f2820b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ J f2821c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ K f2822d;

        /* renamed from: J.B$a$a  reason: collision with other inner class name */
        static final class C0050a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f2823a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ J f2824b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ K f2825c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0050a(J j10, K k10, C6658d dVar) {
                super(2, dVar);
                this.f2824b = j10;
                this.f2825c = k10;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new C0050a(this.f2824b, this.f2825c, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((C0050a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f2823a;
                if (i10 == 0) {
                    w.b(obj);
                    J j10 = this.f2824b;
                    K k10 = this.f2825c;
                    this.f2823a = 1;
                    if (B.e(j10, k10, this) == f10) {
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

        static final class b extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f2826a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ J f2827b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ K f2828c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(J j10, K k10, C6658d dVar) {
                super(2, dVar);
                this.f2827b = j10;
                this.f2828c = k10;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new b(this.f2827b, this.f2828c, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f2826a;
                if (i10 == 0) {
                    w.b(obj);
                    J j10 = this.f2827b;
                    K k10 = this.f2828c;
                    this.f2826a = 1;
                    if (B.d(j10, k10, this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(J j10, K k10, C6658d dVar) {
            super(2, dVar);
            this.f2821c = j10;
            this.f2822d = k10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f2821c, this.f2822d, dVar);
            aVar.f2820b = obj;
            return aVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f2819a == 0) {
                w.b(obj);
                K k10 = (K) this.f2820b;
                M m10 = M.UNDISPATCHED;
                M m11 = m10;
                C5600w0 unused = C5576k.d(k10, (g) null, m11, new C0050a(this.f2821c, this.f2822d, (C6658d) null), 1, (Object) null);
                return C5576k.d(k10, (g) null, m11, new b(this.f2821c, this.f2822d, (C6658d) null), 1, (Object) null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ K f2829a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(K k10) {
            super(1);
            this.f2829a = k10;
        }

        public final void a(long j10) {
            this.f2829a.b(j10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C2421g) obj).v());
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ K f2830a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(K k10) {
            super(0);
            this.f2830a = k10;
        }

        public final void invoke() {
            this.f2830a.onStop();
        }
    }

    static final class d extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ K f2831a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(K k10) {
            super(0);
            this.f2831a = k10;
        }

        public final void invoke() {
            this.f2831a.onCancel();
        }
    }

    static final class e extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ K f2832a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(K k10) {
            super(2);
            this.f2832a = k10;
        }

        public final void a(A a10, long j10) {
            this.f2832a.d(j10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((A) obj, ((C2421g) obj2).v());
            return C6514M.f71813a;
        }
    }

    static final class f extends k implements p {

        /* renamed from: b  reason: collision with root package name */
        Object f2833b;

        /* renamed from: c  reason: collision with root package name */
        int f2834c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f2835d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ K f2836e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(K k10, C6658d dVar) {
            super(2, dVar);
            this.f2836e = k10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            f fVar = new f(this.f2836e, dVar);
            fVar.f2835d = obj;
            return fVar;
        }

        /* renamed from: i */
        public final Object invoke(C1111b bVar, C6658d dVar) {
            return ((f) create(bVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: D0.b} */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x005d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0089 A[SYNTHETIC] */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r12.f2834c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002a
                if (r1 == r3) goto L_0x0022
                if (r1 != r2) goto L_0x001a
                java.lang.Object r1 = r12.f2833b
                D0.A r1 = (D0.A) r1
                java.lang.Object r4 = r12.f2835d
                D0.b r4 = (D0.C1111b) r4
                lf.w.b(r13)
                goto L_0x005e
            L_0x001a:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0022:
                java.lang.Object r1 = r12.f2835d
                D0.b r1 = (D0.C1111b) r1
                lf.w.b(r13)
                goto L_0x0043
            L_0x002a:
                lf.w.b(r13)
                java.lang.Object r13 = r12.f2835d
                r1 = r13
                D0.b r1 = (D0.C1111b) r1
                r12.f2835d = r1
                r12.f2834c = r3
                r5 = 0
                r6 = 0
                r8 = 2
                r9 = 0
                r4 = r1
                r7 = r12
                java.lang.Object r13 = z.C2938B.e(r4, r5, r6, r7, r8, r9)
                if (r13 != r0) goto L_0x0043
                return r0
            L_0x0043:
                D0.A r13 = (D0.A) r13
                J.K r4 = r12.f2836e
                long r5 = r13.h()
                r4.a(r5)
                r4 = r1
                r1 = r13
            L_0x0050:
                r12.f2835d = r4
                r12.f2833b = r1
                r12.f2834c = r2
                r13 = 0
                java.lang.Object r13 = D0.C1111b.u0(r4, r13, r12, r3, r13)
                if (r13 != r0) goto L_0x005e
                return r0
            L_0x005e:
                D0.o r13 = (D0.C1124o) r13
                java.util.List r13 = r13.c()
                int r5 = r13.size()
                r6 = 0
            L_0x0069:
                if (r6 >= r5) goto L_0x0089
                java.lang.Object r7 = r13.get(r6)
                D0.A r7 = (D0.A) r7
                long r8 = r7.f()
                long r10 = r1.f()
                boolean r8 = D0.z.d(r8, r10)
                if (r8 == 0) goto L_0x0086
                boolean r7 = r7.i()
                if (r7 == 0) goto L_0x0086
                goto L_0x0050
            L_0x0086:
                int r6 = r6 + 1
                goto L_0x0069
            L_0x0089:
                J.K r13 = r12.f2836e
                r13.c()
                lf.M r13 = lf.C6514M.f71813a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: J.B.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object c(J j10, K k10, C6658d dVar) {
        Object e10 = L.e(new a(j10, k10, (C6658d) null), dVar);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final Object d(J j10, K k10, C6658d dVar) {
        Object d10 = j.d(j10, new b(k10), new c(k10), new d(k10), new e(k10), dVar);
        if (d10 == C6680b.f()) {
            return d10;
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final Object e(J j10, K k10, C6658d dVar) {
        Object c10 = o.c(j10, new f(k10, (C6658d) null), dVar);
        if (c10 == C6680b.f()) {
            return c10;
        }
        return C6514M.f71813a;
    }
}
