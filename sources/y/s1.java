package Y;

import Ug.C5572i;
import Ug.K;
import Wg.d;
import Xg.C5694f;
import Xg.C5695g;
import Xg.C5696h;
import androidx.collection.L;
import androidx.collection.W;
import i0.C2053g;
import i0.C2057k;
import i0.y;
import java.util.Collection;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import qf.h;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;

abstract /* synthetic */ class s1 {

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f10125a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f10126b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f10127c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5694f f10128d;

        /* renamed from: Y.s1$a$a  reason: collision with other inner class name */
        static final class C0187a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ G0 f10129a;

            C0187a(G0 g02) {
                this.f10129a = g02;
            }

            public final Object emit(Object obj, C6658d dVar) {
                this.f10129a.setValue(obj);
                return C6514M.f71813a;
            }
        }

        static final class b extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f10130a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C5694f f10131b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ G0 f10132c;

            /* renamed from: Y.s1$a$b$a  reason: collision with other inner class name */
            static final class C0188a implements C5695g {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ G0 f10133a;

                C0188a(G0 g02) {
                    this.f10133a = g02;
                }

                public final Object emit(Object obj, C6658d dVar) {
                    this.f10133a.setValue(obj);
                    return C6514M.f71813a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C5694f fVar, G0 g02, C6658d dVar) {
                super(2, dVar);
                this.f10131b = fVar;
                this.f10132c = g02;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new b(this.f10131b, this.f10132c, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f10130a;
                if (i10 == 0) {
                    w.b(obj);
                    C5694f fVar = this.f10131b;
                    C0188a aVar = new C0188a(this.f10132c);
                    this.f10130a = 1;
                    if (fVar.collect(aVar, this) == f10) {
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
        a(g gVar, C5694f fVar, C6658d dVar) {
            super(2, dVar);
            this.f10127c = gVar;
            this.f10128d = fVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f10127c, this.f10128d, dVar);
            aVar.f10126b = obj;
            return aVar;
        }

        public final Object invoke(G0 g02, C6658d dVar) {
            return ((a) create(g02, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f10125a;
            if (i10 == 0) {
                w.b(obj);
                G0 g02 = (G0) this.f10126b;
                if (C6496s.c(this.f10127c, h.f72645a)) {
                    C5694f fVar = this.f10128d;
                    C0187a aVar = new C0187a(g02);
                    this.f10125a = 1;
                    if (fVar.collect(aVar, this) == f10) {
                        return f10;
                    }
                } else {
                    g gVar = this.f10127c;
                    b bVar = new b(this.f10128d, g02, (C6658d) null);
                    this.f10125a = 2;
                    if (C5572i.g(gVar, bVar, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f10134a;

        /* renamed from: b  reason: collision with root package name */
        Object f10135b;

        /* renamed from: c  reason: collision with root package name */
        Object f10136c;

        /* renamed from: d  reason: collision with root package name */
        Object f10137d;

        /* renamed from: e  reason: collision with root package name */
        Object f10138e;

        /* renamed from: f  reason: collision with root package name */
        int f10139f;

        /* renamed from: g  reason: collision with root package name */
        int f10140g;

        /* renamed from: h  reason: collision with root package name */
        private /* synthetic */ Object f10141h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C6787a f10142i;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ L f10143a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(L l10) {
                super(1);
                this.f10143a = l10;
            }

            public final void a(Object obj) {
                if (obj instanceof y) {
                    ((y) obj).s(C2053g.a(4));
                }
                this.f10143a.h(obj);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(obj);
                return C6514M.f71813a;
            }
        }

        /* renamed from: Y.s1$b$b  reason: collision with other inner class name */
        static final class C0189b extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f10144a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0189b(d dVar) {
                super(2);
                this.f10144a = dVar;
            }

            public final void a(Set set, C2057k kVar) {
                Set set2 = set;
                if (set2 instanceof a0.d) {
                    W a10 = ((a0.d) set2).a();
                    Object[] objArr = a10.f12131b;
                    long[] jArr = a10.f12130a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        loop0:
                        while (true) {
                            long j10 = jArr[i10];
                            if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((255 & j10) < 128) {
                                        Object obj = objArr[(i10 << 3) + i12];
                                        if (!(obj instanceof y) || ((y) obj).q(C2053g.a(4))) {
                                            break loop0;
                                        }
                                    }
                                    j10 >>= 8;
                                }
                                if (i11 != 8) {
                                    break;
                                }
                            }
                            if (i10 == length) {
                                break;
                            }
                            i10++;
                        }
                    }
                    return;
                }
                Iterable iterable = set2;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (Object next : iterable) {
                        if (next instanceof y) {
                            if (((y) next).q(C2053g.a(4))) {
                            }
                        }
                    }
                }
                return;
                this.f10144a.c(set2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((Set) obj, (C2057k) obj2);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C6787a aVar, C6658d dVar) {
            super(2, dVar);
            this.f10142i = aVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f10142i, dVar);
            bVar.f10141h = obj;
            return bVar;
        }

        public final Object invoke(C5695g gVar, C6658d dVar) {
            return ((b) create(gVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: Xg.g} */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x013f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0141, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
            r14.s(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0145, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
            r14.d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0149, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
            r14 = th;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x0028, B:20:0x009c, B:22:0x00a0] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00d6  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00e1 A[Catch:{ all -> 0x012f, all -> 0x012d, all -> 0x0055 }] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9 A[Catch:{ all -> 0x012f, all -> 0x012d, all -> 0x0055 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r13.f10140g
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0070
                if (r1 == r5) goto L_0x0059
                if (r1 == r3) goto L_0x0038
                if (r1 != r2) goto L_0x0030
                java.lang.Object r1 = r13.f10138e
                java.lang.Object r6 = r13.f10137d
                i0.f r6 = (i0.C2052f) r6
                java.lang.Object r7 = r13.f10136c
                Wg.d r7 = (Wg.d) r7
                java.lang.Object r8 = r13.f10135b
                yf.l r8 = (yf.C6798l) r8
                java.lang.Object r9 = r13.f10134a
                androidx.collection.L r9 = (androidx.collection.L) r9
                java.lang.Object r10 = r13.f10141h
                Xg.g r10 = (Xg.C5695g) r10
            L_0x0028:
                lf.w.b(r14)     // Catch:{ all -> 0x002d }
                goto L_0x00bf
            L_0x002d:
                r14 = move-exception
                goto L_0x014a
            L_0x0030:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x0038:
                int r1 = r13.f10139f
                java.lang.Object r6 = r13.f10138e
                java.lang.Object r7 = r13.f10137d
                i0.f r7 = (i0.C2052f) r7
                java.lang.Object r8 = r13.f10136c
                Wg.d r8 = (Wg.d) r8
                java.lang.Object r9 = r13.f10135b
                yf.l r9 = (yf.C6798l) r9
                java.lang.Object r10 = r13.f10134a
                androidx.collection.L r10 = (androidx.collection.L) r10
                java.lang.Object r11 = r13.f10141h
                Xg.g r11 = (Xg.C5695g) r11
                lf.w.b(r14)     // Catch:{ all -> 0x0055 }
                goto L_0x00dd
            L_0x0055:
                r14 = move-exception
                r6 = r7
                goto L_0x014a
            L_0x0059:
                java.lang.Object r1 = r13.f10138e
                java.lang.Object r6 = r13.f10137d
                i0.f r6 = (i0.C2052f) r6
                java.lang.Object r7 = r13.f10136c
                Wg.d r7 = (Wg.d) r7
                java.lang.Object r8 = r13.f10135b
                yf.l r8 = (yf.C6798l) r8
                java.lang.Object r9 = r13.f10134a
                androidx.collection.L r9 = (androidx.collection.L) r9
                java.lang.Object r10 = r13.f10141h
                Xg.g r10 = (Xg.C5695g) r10
                goto L_0x0028
            L_0x0070:
                lf.w.b(r14)
                java.lang.Object r14 = r13.f10141h
                r10 = r14
                Xg.g r10 = (Xg.C5695g) r10
                androidx.collection.L r9 = new androidx.collection.L
                r14 = 0
                r9.<init>(r4, r5, r14)
                Y.s1$b$a r8 = new Y.s1$b$a
                r8.<init>(r9)
                r1 = 2147483647(0x7fffffff, float:NaN)
                r6 = 6
                Wg.d r7 = Wg.g.b(r1, r14, r14, r6, r14)
                i0.k$a r14 = i0.C2057k.f21728e
                Y.s1$b$b r1 = new Y.s1$b$b
                r1.<init>(r7)
                i0.f r6 = r14.i(r1)
                i0.k r14 = r14.p(r8)     // Catch:{ all -> 0x002d }
                yf.a r1 = r13.f10142i     // Catch:{ all -> 0x002d }
                i0.k r11 = r14.l()     // Catch:{ all -> 0x013f }
                java.lang.Object r1 = r1.invoke()     // Catch:{ all -> 0x0141 }
                r14.s(r11)     // Catch:{ all -> 0x013f }
                r14.d()     // Catch:{ all -> 0x002d }
                r13.f10141h = r10     // Catch:{ all -> 0x002d }
                r13.f10134a = r9     // Catch:{ all -> 0x002d }
                r13.f10135b = r8     // Catch:{ all -> 0x002d }
                r13.f10136c = r7     // Catch:{ all -> 0x002d }
                r13.f10137d = r6     // Catch:{ all -> 0x002d }
                r13.f10138e = r1     // Catch:{ all -> 0x002d }
                r13.f10140g = r5     // Catch:{ all -> 0x002d }
                java.lang.Object r14 = r10.emit(r1, r13)     // Catch:{ all -> 0x002d }
                if (r14 != r0) goto L_0x00bf
                return r0
            L_0x00bf:
                r13.f10141h = r10     // Catch:{ all -> 0x002d }
                r13.f10134a = r9     // Catch:{ all -> 0x002d }
                r13.f10135b = r8     // Catch:{ all -> 0x002d }
                r13.f10136c = r7     // Catch:{ all -> 0x002d }
                r13.f10137d = r6     // Catch:{ all -> 0x002d }
                r13.f10138e = r1     // Catch:{ all -> 0x002d }
                r13.f10139f = r4     // Catch:{ all -> 0x002d }
                r13.f10140g = r3     // Catch:{ all -> 0x002d }
                java.lang.Object r14 = r7.l(r13)     // Catch:{ all -> 0x002d }
                if (r14 != r0) goto L_0x00d6
                return r0
            L_0x00d6:
                r11 = r10
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r1
                r1 = r4
            L_0x00dd:
                java.util.Set r14 = (java.util.Set) r14     // Catch:{ all -> 0x0055 }
            L_0x00df:
                if (r1 != 0) goto L_0x00ea
                boolean r14 = Y.s1.d(r10, r14)     // Catch:{ all -> 0x0055 }
                if (r14 == 0) goto L_0x00e8
                goto L_0x00ea
            L_0x00e8:
                r1 = r4
                goto L_0x00eb
            L_0x00ea:
                r1 = r5
            L_0x00eb:
                java.lang.Object r14 = r8.i()     // Catch:{ all -> 0x0055 }
                java.lang.Object r14 = Wg.h.f(r14)     // Catch:{ all -> 0x0055 }
                java.util.Set r14 = (java.util.Set) r14     // Catch:{ all -> 0x0055 }
                if (r14 != 0) goto L_0x00df
                if (r1 == 0) goto L_0x0138
                r10.m()     // Catch:{ all -> 0x0055 }
                i0.k$a r14 = i0.C2057k.f21728e     // Catch:{ all -> 0x0055 }
                i0.k r14 = r14.p(r9)     // Catch:{ all -> 0x0055 }
                yf.a r1 = r13.f10142i     // Catch:{ all -> 0x0055 }
                i0.k r12 = r14.l()     // Catch:{ all -> 0x012d }
                java.lang.Object r1 = r1.invoke()     // Catch:{ all -> 0x012f }
                r14.s(r12)     // Catch:{ all -> 0x012d }
                r14.d()     // Catch:{ all -> 0x0055 }
                boolean r14 = kotlin.jvm.internal.C6496s.c(r1, r6)     // Catch:{ all -> 0x0055 }
                if (r14 != 0) goto L_0x0138
                r13.f10141h = r11     // Catch:{ all -> 0x0055 }
                r13.f10134a = r10     // Catch:{ all -> 0x0055 }
                r13.f10135b = r9     // Catch:{ all -> 0x0055 }
                r13.f10136c = r8     // Catch:{ all -> 0x0055 }
                r13.f10137d = r7     // Catch:{ all -> 0x0055 }
                r13.f10138e = r1     // Catch:{ all -> 0x0055 }
                r13.f10140g = r2     // Catch:{ all -> 0x0055 }
                java.lang.Object r14 = r11.emit(r1, r13)     // Catch:{ all -> 0x0055 }
                if (r14 != r0) goto L_0x0139
                return r0
            L_0x012d:
                r0 = move-exception
                goto L_0x0134
            L_0x012f:
                r0 = move-exception
                r14.s(r12)     // Catch:{ all -> 0x012d }
                throw r0     // Catch:{ all -> 0x012d }
            L_0x0134:
                r14.d()     // Catch:{ all -> 0x0055 }
                throw r0     // Catch:{ all -> 0x0055 }
            L_0x0138:
                r1 = r6
            L_0x0139:
                r6 = r7
                r7 = r8
                r8 = r9
                r9 = r10
                r10 = r11
                goto L_0x00bf
            L_0x013f:
                r0 = move-exception
                goto L_0x0146
            L_0x0141:
                r0 = move-exception
                r14.s(r11)     // Catch:{ all -> 0x013f }
                throw r0     // Catch:{ all -> 0x013f }
            L_0x0146:
                r14.d()     // Catch:{ all -> 0x002d }
                throw r0     // Catch:{ all -> 0x002d }
            L_0x014a:
                r6.dispose()
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: Y.s1.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: yf.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final Y.A1 b(Xg.C5694f r6, java.lang.Object r7, qf.g r8, Y.C1500m r9, int r10, int r11) {
        /*
            r11 = r11 & 2
            if (r11 == 0) goto L_0x0006
            qf.h r8 = qf.h.f72645a
        L_0x0006:
            r2 = r8
            boolean r8 = Y.C1506p.H()
            if (r8 == 0) goto L_0x0016
            r8 = -1
            java.lang.String r11 = "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:65)"
            r0 = -606625098(0xffffffffdbd7a2b6, float:-1.21392045E17)
            Y.C1506p.Q(r0, r10, r8, r11)
        L_0x0016:
            boolean r8 = r9.C(r2)
            boolean r11 = r9.C(r6)
            r8 = r8 | r11
            java.lang.Object r11 = r9.A()
            if (r8 != 0) goto L_0x002d
            Y.m$a r8 = Y.C1500m.f10026a
            java.lang.Object r8 = r8.a()
            if (r11 != r8) goto L_0x0036
        L_0x002d:
            Y.s1$a r11 = new Y.s1$a
            r8 = 0
            r11.<init>(r2, r6, r8)
            r9.r(r11)
        L_0x0036:
            r3 = r11
            yf.p r3 = (yf.p) r3
            int r8 = r10 >> 3
            r8 = r8 & 14
            int r11 = r10 << 3
            r11 = r11 & 112(0x70, float:1.57E-43)
            r8 = r8 | r11
            r10 = r10 & 896(0x380, float:1.256E-42)
            r5 = r8 | r10
            r0 = r7
            r1 = r6
            r4 = r9
            Y.A1 r6 = Y.p1.k(r0, r1, r2, r3, r4, r5)
            boolean r7 = Y.C1506p.H()
            if (r7 == 0) goto L_0x0056
            Y.C1506p.P()
        L_0x0056:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.s1.b(Xg.f, java.lang.Object, qf.g, Y.m, int, int):Y.A1");
    }

    public static final A1 c(Xg.L l10, g gVar, C1500m mVar, int i10, int i11) {
        if ((i11 & 1) != 0) {
            gVar = h.f72645a;
        }
        g gVar2 = gVar;
        if (C1506p.H()) {
            C1506p.Q(-1439883919, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:49)");
        }
        A1 a10 = p1.a(l10, l10.getValue(), gVar2, mVar, (i10 & 14) | ((i10 << 3) & 896), 0);
        if (C1506p.H()) {
            C1506p.P();
        }
        return a10;
    }

    /* access modifiers changed from: private */
    public static final boolean d(L l10, Set set) {
        Object[] objArr = l10.f12131b;
        long[] jArr = l10.f12130a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128 && set.contains(objArr[(i10 << 3) + i12])) {
                        return true;
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return false;
                }
            }
            if (i10 == length) {
                return false;
            }
            i10++;
        }
    }

    public static final C5694f e(C6787a aVar) {
        return C5696h.y(new b(aVar, (C6658d) null));
    }
}
