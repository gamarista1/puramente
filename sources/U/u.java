package U;

import B.c;
import B.d;
import B.e;
import B.g;
import B.h;
import B.i;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import q0.C2427m;
import qf.C6658d;
import r0.C2541w0;
import r0.C2544x0;
import r0.C2547y0;
import rf.C6680b;
import t0.C2603d;
import t0.C2605f;
import t0.C2606g;
import w.C2782a;
import w.C2784b;
import w.C2797i;
import yf.C6787a;
import yf.C6798l;
import yf.p;

final class u {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6302a;

    /* renamed from: b  reason: collision with root package name */
    private final C6787a f6303b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C2782a f6304c = C2784b.b(0.0f, 0.0f, 2, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    private final List f6305d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private i f6306e;

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f6307a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f6308b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f6309c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2797i f6310d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(u uVar, float f10, C2797i iVar, C6658d dVar) {
            super(2, dVar);
            this.f6308b = uVar;
            this.f6309c = f10;
            this.f6310d = iVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f6308b, this.f6309c, this.f6310d, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f6307a;
            if (i10 == 0) {
                w.b(obj);
                C2782a a10 = this.f6308b.f6304c;
                Float b10 = kotlin.coroutines.jvm.internal.b.b(this.f6309c);
                C2797i iVar = this.f6310d;
                this.f6307a = 1;
                if (C2782a.f(a10, b10, iVar, (Object) null, (C6798l) null, this, 12, (Object) null) == f10) {
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
        int f6311a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f6312b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2797i f6313c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(u uVar, C2797i iVar, C6658d dVar) {
            super(2, dVar);
            this.f6312b = uVar;
            this.f6313c = iVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new b(this.f6312b, this.f6313c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f6311a;
            if (i10 == 0) {
                w.b(obj);
                C2782a a10 = this.f6312b.f6304c;
                Float b10 = kotlin.coroutines.jvm.internal.b.b(0.0f);
                C2797i iVar = this.f6313c;
                this.f6311a = 1;
                if (C2782a.f(a10, b10, iVar, (Object) null, (C6798l) null, this, 12, (Object) null) == f10) {
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

    public u(boolean z10, C6787a aVar) {
        this.f6302a = z10;
        this.f6303b = aVar;
    }

    public final void b(C2605f fVar, float f10, long j10) {
        long j11;
        float floatValue = ((Number) this.f6304c.m()).floatValue();
        if (floatValue > 0.0f) {
            long o10 = C2544x0.o(j10, floatValue, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            if (this.f6302a) {
                float k10 = C2427m.k(fVar.d());
                float i10 = C2427m.i(fVar.d());
                int b10 = C2541w0.f25557a.b();
                C2603d w12 = fVar.w1();
                long d10 = w12.d();
                w12.f().q();
                try {
                    w12.e().c(0.0f, 0.0f, k10, i10, b10);
                    j11 = d10;
                    try {
                        C2605f.n0(fVar, o10, f10, 0, 0.0f, (C2606g) null, (C2547y0) null, 0, 124, (Object) null);
                        w12.f().h();
                        w12.h(j11);
                    } catch (Throwable th2) {
                        th = th2;
                        w12.f().h();
                        w12.h(j11);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    j11 = d10;
                    w12.f().h();
                    w12.h(j11);
                    throw th;
                }
            } else {
                C2605f.n0(fVar, o10, f10, 0, 0.0f, (C2606g) null, (C2547y0) null, 0, 124, (Object) null);
            }
        }
    }

    public final void c(i iVar, K k10) {
        float f10;
        boolean z10 = iVar instanceof g;
        if (z10) {
            this.f6305d.add(iVar);
        } else if (iVar instanceof h) {
            this.f6305d.remove(((h) iVar).a());
        } else if (iVar instanceof d) {
            this.f6305d.add(iVar);
        } else if (iVar instanceof e) {
            this.f6305d.remove(((e) iVar).a());
        } else if (iVar instanceof B.b) {
            this.f6305d.add(iVar);
        } else if (iVar instanceof c) {
            this.f6305d.remove(((c) iVar).a());
        } else if (iVar instanceof B.a) {
            this.f6305d.remove(((B.a) iVar).a());
        } else {
            return;
        }
        i iVar2 = (i) C6565s.B0(this.f6305d);
        if (!C6496s.c(this.f6306e, iVar2)) {
            if (iVar2 != null) {
                g gVar = (g) this.f6303b.invoke();
                if (z10) {
                    f10 = gVar.c();
                } else if (iVar instanceof d) {
                    f10 = gVar.b();
                } else if (iVar instanceof B.b) {
                    f10 = gVar.a();
                } else {
                    f10 = 0.0f;
                }
                C5600w0 unused = C5576k.d(k10, (qf.g) null, (M) null, new a(this, f10, p.d(iVar2), (C6658d) null), 3, (Object) null);
            } else {
                C5600w0 unused2 = C5576k.d(k10, (qf.g) null, (M) null, new b(this, p.e(this.f6306e), (C6658d) null), 3, (Object) null);
            }
            this.f6306e = iVar2;
        }
    }
}
