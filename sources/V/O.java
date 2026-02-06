package V;

import B.d;
import B.e;
import B.g;
import B.h;
import B.i;
import B.j;
import B.n;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Xg.C5694f;
import Xg.C5695g;
import Y.A1;
import Y.C1500m;
import Y.C1506p;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import yf.p;

public class O {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final float f6765a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final float f6766b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final float f6767c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final float f6768d;

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f6769a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ P f6770b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O f6771c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(P p10, O o10, C6658d dVar) {
            super(2, dVar);
            this.f6770b = p10;
            this.f6771c = o10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f6770b, this.f6771c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f6769a;
            if (i10 == 0) {
                w.b(obj);
                P p10 = this.f6770b;
                float a10 = this.f6771c.f6765a;
                float d10 = this.f6771c.f6766b;
                float c10 = this.f6771c.f6768d;
                float b10 = this.f6771c.f6767c;
                this.f6769a = 1;
                if (p10.f(a10, d10, c10, b10, this) == f10) {
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
        int f6772a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f6773b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f6774c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ P f6775d;

        static final class a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f6776a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ K f6777b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ P f6778c;

            /* renamed from: V.O$b$a$a  reason: collision with other inner class name */
            static final class C0157a extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f6779a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ P f6780b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ i f6781c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0157a(P p10, i iVar, C6658d dVar) {
                    super(2, dVar);
                    this.f6780b = p10;
                    this.f6781c = iVar;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new C0157a(this.f6780b, this.f6781c, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((C0157a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f6779a;
                    if (i10 == 0) {
                        w.b(obj);
                        P p10 = this.f6780b;
                        i iVar = this.f6781c;
                        this.f6779a = 1;
                        if (p10.b(iVar, this) == f10) {
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

            a(List list, K k10, P p10) {
                this.f6776a = list;
                this.f6777b = k10;
                this.f6778c = p10;
            }

            /* renamed from: a */
            public final Object emit(i iVar, C6658d dVar) {
                if (iVar instanceof g) {
                    this.f6776a.add(iVar);
                } else if (iVar instanceof h) {
                    this.f6776a.remove(((h) iVar).a());
                } else if (iVar instanceof d) {
                    this.f6776a.add(iVar);
                } else if (iVar instanceof e) {
                    this.f6776a.remove(((e) iVar).a());
                } else if (iVar instanceof n.b) {
                    this.f6776a.add(iVar);
                } else if (iVar instanceof n.c) {
                    this.f6776a.remove(((n.c) iVar).a());
                } else if (iVar instanceof n.a) {
                    this.f6776a.remove(((n.a) iVar).a());
                }
                C5600w0 unused = C5576k.d(this.f6777b, (qf.g) null, (M) null, new C0157a(this.f6778c, (i) C6565s.B0(this.f6776a), (C6658d) null), 3, (Object) null);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar, P p10, C6658d dVar) {
            super(2, dVar);
            this.f6774c = jVar;
            this.f6775d = p10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f6774c, this.f6775d, dVar);
            bVar.f6773b = obj;
            return bVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f6772a;
            if (i10 == 0) {
                w.b(obj);
                ArrayList arrayList = new ArrayList();
                C5694f c10 = this.f6774c.c();
                a aVar = new a(arrayList, (K) this.f6773b, this.f6775d);
                this.f6772a = 1;
                if (c10.collect(aVar, this) == f10) {
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

    public /* synthetic */ O(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: V.P} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: V.P} */
    /* JADX WARNING: type inference failed for: r10v1 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r10 == Y.C1500m.f10026a.a()) goto L_0x003b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final Y.A1 e(B.j r18, Y.C1500m r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            boolean r4 = Y.C1506p.H()
            if (r4 == 0) goto L_0x0017
            r4 = -1
            java.lang.String r5 = "androidx.compose.material3.FloatingActionButtonElevation.animateElevation (FloatingActionButton.kt:525)"
            r6 = -1845106002(0xffffffff9205eaae, float:-4.2256665E-28)
            Y.C1506p.Q(r6, r3, r4, r5)
        L_0x0017:
            r4 = r3 & 14
            r5 = r4 ^ 6
            r6 = 0
            r7 = 1
            r8 = 4
            if (r5 <= r8) goto L_0x0026
            boolean r9 = r2.S(r1)
            if (r9 != 0) goto L_0x002a
        L_0x0026:
            r9 = r3 & 6
            if (r9 != r8) goto L_0x002c
        L_0x002a:
            r9 = r7
            goto L_0x002d
        L_0x002c:
            r9 = r6
        L_0x002d:
            java.lang.Object r10 = r19.A()
            if (r9 != 0) goto L_0x003b
            Y.m$a r9 = Y.C1500m.f10026a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x004e
        L_0x003b:
            V.P r10 = new V.P
            float r12 = r0.f6765a
            float r13 = r0.f6766b
            float r14 = r0.f6768d
            float r15 = r0.f6767c
            r16 = 0
            r11 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            r2.r(r10)
        L_0x004e:
            V.P r10 = (V.P) r10
            boolean r9 = r2.C(r10)
            r11 = r3 & 112(0x70, float:1.57E-43)
            r11 = r11 ^ 48
            r12 = 32
            if (r11 <= r12) goto L_0x0062
            boolean r11 = r2.S(r0)
            if (r11 != 0) goto L_0x0066
        L_0x0062:
            r11 = r3 & 48
            if (r11 != r12) goto L_0x0068
        L_0x0066:
            r11 = r7
            goto L_0x0069
        L_0x0068:
            r11 = r6
        L_0x0069:
            r9 = r9 | r11
            java.lang.Object r11 = r19.A()
            r12 = 0
            if (r9 != 0) goto L_0x0079
            Y.m$a r9 = Y.C1500m.f10026a
            java.lang.Object r9 = r9.a()
            if (r11 != r9) goto L_0x0081
        L_0x0079:
            V.O$a r11 = new V.O$a
            r11.<init>(r10, r0, r12)
            r2.r(r11)
        L_0x0081:
            yf.p r11 = (yf.p) r11
            int r9 = r3 >> 3
            r9 = r9 & 14
            Y.P.g(r0, r11, r2, r9)
            if (r5 <= r8) goto L_0x0092
            boolean r5 = r2.S(r1)
            if (r5 != 0) goto L_0x0096
        L_0x0092:
            r3 = r3 & 6
            if (r3 != r8) goto L_0x0097
        L_0x0096:
            r6 = r7
        L_0x0097:
            boolean r3 = r2.C(r10)
            r3 = r3 | r6
            java.lang.Object r5 = r19.A()
            if (r3 != 0) goto L_0x00aa
            Y.m$a r3 = Y.C1500m.f10026a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x00b2
        L_0x00aa:
            V.O$b r5 = new V.O$b
            r5.<init>(r1, r10, r12)
            r2.r(r5)
        L_0x00b2:
            yf.p r5 = (yf.p) r5
            Y.P.g(r1, r5, r2, r4)
            Y.A1 r1 = r10.c()
            boolean r2 = Y.C1506p.H()
            if (r2 == 0) goto L_0x00c4
            Y.C1506p.P()
        L_0x00c4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: V.O.e(B.j, Y.m, int):Y.A1");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        if (c1.h.m(this.f6765a, o10.f6765a) && c1.h.m(this.f6766b, o10.f6766b) && c1.h.m(this.f6767c, o10.f6767c)) {
            return c1.h.m(this.f6768d, o10.f6768d);
        }
        return false;
    }

    public final A1 f(j jVar, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-424810125, i10, -1, "androidx.compose.material3.FloatingActionButtonElevation.shadowElevation (FloatingActionButton.kt:516)");
        }
        A1 e10 = e(jVar, mVar, i10 & 126);
        if (C1506p.H()) {
            C1506p.P();
        }
        return e10;
    }

    public final float g() {
        return this.f6765a;
    }

    public int hashCode() {
        return (((((c1.h.o(this.f6765a) * 31) + c1.h.o(this.f6766b)) * 31) + c1.h.o(this.f6767c)) * 31) + c1.h.o(this.f6768d);
    }

    private O(float f10, float f11, float f12, float f13) {
        this.f6765a = f10;
        this.f6766b = f11;
        this.f6767c = f12;
        this.f6768d = f13;
    }
}
