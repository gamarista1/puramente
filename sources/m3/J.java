package m3;

import Xg.C5694f;
import Xg.C5695g;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.p;

abstract /* synthetic */ class J {

    public static final class a implements C5694f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5694f f23836a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f23837b;

        /* renamed from: m3.J$a$a  reason: collision with other inner class name */
        public static final class C0381a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5695g f23838a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p f23839b;

            /* renamed from: m3.J$a$a$a  reason: collision with other inner class name */
            public static final class C0382a extends d {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f23840a;

                /* renamed from: b  reason: collision with root package name */
                int f23841b;

                /* renamed from: c  reason: collision with root package name */
                Object f23842c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C0381a f23843d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0382a(C0381a aVar, C6658d dVar) {
                    super(dVar);
                    this.f23843d = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f23840a = obj;
                    this.f23841b |= Integer.MIN_VALUE;
                    return this.f23843d.emit((Object) null, this);
                }
            }

            public C0381a(C5695g gVar, p pVar) {
                this.f23838a = gVar;
                this.f23839b = pVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x005e A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, qf.C6658d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof m3.J.a.C0381a.C0382a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    m3.J$a$a$a r0 = (m3.J.a.C0381a.C0382a) r0
                    int r1 = r0.f23841b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f23841b = r1
                    goto L_0x0018
                L_0x0013:
                    m3.J$a$a$a r0 = new m3.J$a$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f23840a
                    java.lang.Object r1 = rf.C6680b.f()
                    int r2 = r0.f23841b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003c
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    lf.w.b(r8)
                    goto L_0x005f
                L_0x002c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0034:
                    java.lang.Object r7 = r0.f23842c
                    Xg.g r7 = (Xg.C5695g) r7
                    lf.w.b(r8)
                    goto L_0x0053
                L_0x003c:
                    lf.w.b(r8)
                    Xg.g r8 = r6.f23838a
                    m3.x r7 = (m3.C2224x) r7
                    yf.p r2 = r6.f23839b
                    r0.f23842c = r8
                    r0.f23841b = r4
                    java.lang.Object r7 = r7.a(r2, r0)
                    if (r7 != r1) goto L_0x0050
                    return r1
                L_0x0050:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L_0x0053:
                    r2 = 0
                    r0.f23842c = r2
                    r0.f23841b = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L_0x005f
                    return r1
                L_0x005f:
                    lf.M r7 = lf.C6514M.f71813a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: m3.J.a.C0381a.emit(java.lang.Object, qf.d):java.lang.Object");
            }
        }

        public a(C5694f fVar, p pVar) {
            this.f23836a = fVar;
            this.f23837b = pVar;
        }

        public Object collect(C5695g gVar, C6658d dVar) {
            Object collect = this.f23836a.collect(new C0381a(gVar, this.f23837b), dVar);
            if (collect == C6680b.f()) {
                return collect;
            }
            return C6514M.f71813a;
        }
    }

    public static final /* synthetic */ C2201F a(C2201F f10, p pVar) {
        C6496s.h(f10, "<this>");
        C6496s.h(pVar, "transform");
        return new C2201F(new a(f10.d(), pVar), f10.f(), f10.e(), (C6787a) null, 8, (DefaultConstructorMarker) null);
    }
}
