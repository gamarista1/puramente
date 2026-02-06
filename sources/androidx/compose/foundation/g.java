package androidx.compose.foundation;

import B.d;
import B.e;
import B.h;
import B.j;
import B.n;
import J0.C1244j;
import J0.C1252s;
import J0.r;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Xg.C5694f;
import Xg.C5695g;
import k0.i;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.L;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import r0.C2544x0;
import r0.C2547y0;
import rf.C6680b;
import t0.C2602c;
import t0.C2605f;
import t0.C2606g;
import x.C2845I;
import yf.p;

final class g implements C2845I {

    /* renamed from: a  reason: collision with root package name */
    public static final g f12562a = new g();

    private static final class a extends i.c implements r {
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public final j f12563n;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public boolean f12564o;
        /* access modifiers changed from: private */

        /* renamed from: p  reason: collision with root package name */
        public boolean f12565p;
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public boolean f12566q;

        /* renamed from: androidx.compose.foundation.g$a$a  reason: collision with other inner class name */
        static final class C0233a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f12567a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f12568b;

            /* renamed from: androidx.compose.foundation.g$a$a$a  reason: collision with other inner class name */
            static final class C0234a implements C5695g {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ L f12569a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ L f12570b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ L f12571c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ a f12572d;

                C0234a(L l10, L l11, L l12, a aVar) {
                    this.f12569a = l10;
                    this.f12570b = l11;
                    this.f12571c = l12;
                    this.f12572d = aVar;
                }

                /* renamed from: a */
                public final Object emit(B.i iVar, C6658d dVar) {
                    boolean z10;
                    boolean z11;
                    boolean z12;
                    boolean z13 = true;
                    if (iVar instanceof n.b) {
                        this.f12569a.f71757a++;
                    } else if (iVar instanceof n.c) {
                        L l10 = this.f12569a;
                        l10.f71757a--;
                    } else if (iVar instanceof n.a) {
                        L l11 = this.f12569a;
                        l11.f71757a--;
                    } else if (iVar instanceof B.g) {
                        this.f12570b.f71757a++;
                    } else if (iVar instanceof h) {
                        L l12 = this.f12570b;
                        l12.f71757a--;
                    } else if (iVar instanceof d) {
                        this.f12571c.f71757a++;
                    } else if (iVar instanceof e) {
                        L l13 = this.f12571c;
                        l13.f71757a--;
                    }
                    boolean z14 = false;
                    if (this.f12569a.f71757a > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f12570b.f71757a > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (this.f12571c.f71757a > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (this.f12572d.f12564o != z10) {
                        this.f12572d.f12564o = z10;
                        z14 = true;
                    }
                    if (this.f12572d.f12565p != z11) {
                        this.f12572d.f12565p = z11;
                        z14 = true;
                    }
                    if (this.f12572d.f12566q != z12) {
                        this.f12572d.f12566q = z12;
                    } else {
                        z13 = z14;
                    }
                    if (z13) {
                        C1252s.a(this.f12572d);
                    }
                    return C6514M.f71813a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0233a(a aVar, C6658d dVar) {
                super(2, dVar);
                this.f12568b = aVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new C0233a(this.f12568b, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((C0233a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f12567a;
                if (i10 == 0) {
                    w.b(obj);
                    L l10 = new L();
                    L l11 = new L();
                    L l12 = new L();
                    C5694f c10 = this.f12568b.f12563n.c();
                    C0234a aVar = new C0234a(l10, l11, l12, this.f12568b);
                    this.f12567a = 1;
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

        public a(j jVar) {
            this.f12563n = jVar;
        }

        public void V1() {
            C5600w0 unused = C5576k.d(L1(), (qf.g) null, (M) null, new C0233a(this, (C6658d) null), 3, (Object) null);
        }

        public void u(C2602c cVar) {
            cVar.H1();
            if (this.f12564o) {
                C2605f.c0(cVar, C2544x0.o(C2544x0.f25560b.a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, cVar.d(), 0.0f, (C2606g) null, (C2547y0) null, 0, 122, (Object) null);
            } else if (this.f12565p || this.f12566q) {
                C2605f.c0(cVar, C2544x0.o(C2544x0.f25560b.a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, cVar.d(), 0.0f, (C2606g) null, (C2547y0) null, 0, 122, (Object) null);
            }
        }
    }

    private g() {
    }

    public C1244j a(j jVar) {
        return new a(jVar);
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return -1;
    }
}
