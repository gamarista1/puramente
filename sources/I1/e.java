package I1;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.p;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2683a = new a((DefaultConstructorMarker) null);

    public static final class a {

        /* renamed from: I1.e$a$a  reason: collision with other inner class name */
        static final class C0045a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f2684a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f2685b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List f2686c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0045a(List list, C6658d dVar) {
                super(2, dVar);
                this.f2686c = list;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                C0045a aVar = new C0045a(this.f2686c, dVar);
                aVar.f2685b = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(i iVar, C6658d dVar) {
                return ((C0045a) create(iVar, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f2684a;
                if (i10 == 0) {
                    w.b(obj);
                    a aVar = e.f2683a;
                    List list = this.f2686c;
                    this.f2684a = 1;
                    if (aVar.c(list, (i) this.f2685b, this) == f10) {
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

        static final class b extends d {

            /* renamed from: a  reason: collision with root package name */
            Object f2687a;

            /* renamed from: b  reason: collision with root package name */
            Object f2688b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f2689c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a f2690d;

            /* renamed from: e  reason: collision with root package name */
            int f2691e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(a aVar, C6658d dVar) {
                super(dVar);
                this.f2690d = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f2689c = obj;
                this.f2691e |= Integer.MIN_VALUE;
                return this.f2690d.c((List) null, (i) null, this);
            }
        }

        static final class c extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            Object f2692a;

            /* renamed from: b  reason: collision with root package name */
            Object f2693b;

            /* renamed from: c  reason: collision with root package name */
            Object f2694c;

            /* renamed from: d  reason: collision with root package name */
            int f2695d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f2696e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ List f2697f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ List f2698g;

            /* renamed from: I1.e$a$c$a  reason: collision with other inner class name */
            static final class C0046a extends l implements C6798l {

                /* renamed from: a  reason: collision with root package name */
                int f2699a;

                C0046a(d dVar, C6658d dVar2) {
                    super(1, dVar2);
                }

                public final C6658d create(C6658d dVar) {
                    return new C0046a((d) null, dVar);
                }

                /* renamed from: i */
                public final Object invoke(C6658d dVar) {
                    return ((C0046a) create(dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    C6680b.f();
                    int i10 = this.f2699a;
                    if (i10 == 0) {
                        w.b(obj);
                        this.f2699a = 1;
                        throw null;
                    } else if (i10 == 1) {
                        w.b(obj);
                        return C6514M.f71813a;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(List list, List list2, C6658d dVar) {
                super(2, dVar);
                this.f2697f = list;
                this.f2698g = list2;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                c cVar = new c(this.f2697f, this.f2698g, dVar);
                cVar.f2696e = obj;
                return cVar;
            }

            /* renamed from: i */
            public final Object invoke(Object obj, C6658d dVar) {
                return ((c) create(obj, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                List list;
                Iterator it;
                C6680b.f();
                int i10 = this.f2695d;
                if (i10 == 0) {
                    w.b(obj);
                    obj = this.f2696e;
                    list = this.f2698g;
                    it = this.f2697f.iterator();
                } else if (i10 == 1) {
                    Object obj2 = this.f2694c;
                    android.support.v4.media.session.c.a(this.f2693b);
                    Iterator it2 = (Iterator) this.f2692a;
                    List list2 = (List) this.f2696e;
                    w.b(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        obj = obj2;
                        it = it2;
                        list = list2;
                    } else {
                        list2.add(new C0046a((d) null, (C6658d) null));
                        this.f2696e = list2;
                        this.f2692a = it2;
                        this.f2693b = null;
                        this.f2694c = null;
                        this.f2695d = 2;
                        throw null;
                    }
                } else if (i10 == 2) {
                    it = (Iterator) this.f2692a;
                    list = (List) this.f2696e;
                    w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (!it.hasNext()) {
                    return obj;
                }
                android.support.v4.media.session.c.a(it.next());
                this.f2696e = list;
                this.f2692a = it;
                this.f2693b = null;
                this.f2694c = obj;
                this.f2695d = 1;
                throw null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object c(java.util.List r7, I1.i r8, qf.C6658d r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof I1.e.a.b
                if (r0 == 0) goto L_0x0013
                r0 = r9
                I1.e$a$b r0 = (I1.e.a.b) r0
                int r1 = r0.f2691e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f2691e = r1
                goto L_0x0018
            L_0x0013:
                I1.e$a$b r0 = new I1.e$a$b
                r0.<init>(r6, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f2689c
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f2691e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r7 = r0.f2688b
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f2687a
                kotlin.jvm.internal.N r8 = (kotlin.jvm.internal.N) r8
                lf.w.b(r9)     // Catch:{ all -> 0x0034 }
                goto L_0x006b
            L_0x0034:
                r9 = move-exception
                goto L_0x0084
            L_0x0036:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x003e:
                java.lang.Object r7 = r0.f2687a
                java.util.List r7 = (java.util.List) r7
                lf.w.b(r9)
                goto L_0x0060
            L_0x0046:
                lf.w.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                I1.e$a$c r2 = new I1.e$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f2687a = r9
                r0.f2691e = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L_0x005f
                return r1
            L_0x005f:
                r7 = r9
            L_0x0060:
                kotlin.jvm.internal.N r8 = new kotlin.jvm.internal.N
                r8.<init>()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L_0x006b:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x0096
                java.lang.Object r9 = r7.next()
                yf.l r9 = (yf.C6798l) r9
                r0.f2687a = r8     // Catch:{ all -> 0x0034 }
                r0.f2688b = r7     // Catch:{ all -> 0x0034 }
                r0.f2691e = r3     // Catch:{ all -> 0x0034 }
                java.lang.Object r9 = r9.invoke(r0)     // Catch:{ all -> 0x0034 }
                if (r9 != r1) goto L_0x006b
                return r1
            L_0x0084:
                java.lang.Object r2 = r8.f71759a
                if (r2 != 0) goto L_0x008b
                r8.f71759a = r9
                goto L_0x006b
            L_0x008b:
                kotlin.jvm.internal.C6496s.e(r2)
                java.lang.Object r2 = r8.f71759a
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                lf.C6523g.a(r2, r9)
                goto L_0x006b
            L_0x0096:
                java.lang.Object r7 = r8.f71759a
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L_0x009f
                lf.M r7 = lf.C6514M.f71813a
                return r7
            L_0x009f:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: I1.e.a.c(java.util.List, I1.i, qf.d):java.lang.Object");
        }

        public final p b(List list) {
            C6496s.h(list, "migrations");
            return new C0045a(list, (C6658d) null);
        }

        private a() {
        }
    }
}
