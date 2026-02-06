package Z3;

import H0.C1203y;
import H0.E;
import H0.G;
import H0.H;
import H0.U;
import Xg.C5694f;
import Xg.C5695g;
import Xg.C5696h;
import Xg.N;
import Xg.x;
import c1.b;
import java.util.Map;
import k4.C3668j;
import kotlin.coroutines.jvm.internal.d;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;

public final class l implements C3668j, C1203y {

    /* renamed from: b  reason: collision with root package name */
    private final x f10474b = N.a(b.a(z.g()));

    public static final class a implements C5694f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5694f f10475a;

        /* renamed from: Z3.l$a$a  reason: collision with other inner class name */
        public static final class C0197a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5695g f10476a;

            /* renamed from: Z3.l$a$a$a  reason: collision with other inner class name */
            public static final class C0198a extends d {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f10477a;

                /* renamed from: b  reason: collision with root package name */
                int f10478b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C0197a f10479c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0198a(C0197a aVar, C6658d dVar) {
                    super(dVar);
                    this.f10479c = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f10477a = obj;
                    this.f10478b |= Integer.MIN_VALUE;
                    return this.f10479c.emit((Object) null, this);
                }
            }

            public C0197a(C5695g gVar) {
                this.f10476a = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, qf.C6658d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof Z3.l.a.C0197a.C0198a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    Z3.l$a$a$a r0 = (Z3.l.a.C0197a.C0198a) r0
                    int r1 = r0.f10478b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f10478b = r1
                    goto L_0x0018
                L_0x0013:
                    Z3.l$a$a$a r0 = new Z3.l$a$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f10477a
                    java.lang.Object r1 = rf.C6680b.f()
                    int r2 = r0.f10478b
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    lf.w.b(r8)
                    goto L_0x004b
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    lf.w.b(r8)
                    Xg.g r8 = r6.f10476a
                    c1.b r7 = (c1.b) r7
                    long r4 = r7.r()
                    k4.i r7 = Z3.z.o(r4)
                    if (r7 == 0) goto L_0x004b
                    r0.f10478b = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x004b
                    return r1
                L_0x004b:
                    lf.M r7 = lf.C6514M.f71813a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: Z3.l.a.C0197a.emit(java.lang.Object, qf.d):java.lang.Object");
            }
        }

        public a(C5694f fVar) {
            this.f10475a = fVar;
        }

        public Object collect(C5695g gVar, C6658d dVar) {
            Object collect = this.f10475a.collect(new C0197a(gVar), dVar);
            if (collect == C6680b.f()) {
                return collect;
            }
            return C6514M.f71813a;
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M w(U u10, U.a aVar) {
        U.a.h(aVar, u10, 0, 0, 0.0f, 4, (Object) null);
        return C6514M.f71813a;
    }

    public Object b(C6658d dVar) {
        return C5696h.u(new a(this.f10474b), dVar);
    }

    public G o(H h10, E e10, long j10) {
        this.f10474b.setValue(b.a(j10));
        U v02 = e10.v0(j10);
        return H.N(h10, v02.X0(), v02.R0(), (Map) null, new k(v02), 4, (Object) null);
    }

    public final void y(long j10) {
        this.f10474b.setValue(b.a(j10));
    }
}
