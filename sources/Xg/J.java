package Xg;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.C6527k;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

final class J implements H {

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f66447a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f66448b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ L f66449c;

        /* renamed from: Xg.J$a$a  reason: collision with other inner class name */
        static final class C0964a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.J f66450a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C5695g f66451b;

            /* renamed from: Xg.J$a$a$a  reason: collision with other inner class name */
            static final class C0965a extends d {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f66452a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C0964a f66453b;

                /* renamed from: c  reason: collision with root package name */
                int f66454c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0965a(C0964a aVar, C6658d dVar) {
                    super(dVar);
                    this.f66453b = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f66452a = obj;
                    this.f66454c |= Integer.MIN_VALUE;
                    return this.f66453b.a(0, this);
                }
            }

            C0964a(kotlin.jvm.internal.J j10, C5695g gVar) {
                this.f66450a = j10;
                this.f66451b = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object a(int r5, qf.C6658d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Xg.J.a.C0964a.C0965a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Xg.J$a$a$a r0 = (Xg.J.a.C0964a.C0965a) r0
                    int r1 = r0.f66454c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f66454c = r1
                    goto L_0x0018
                L_0x0013:
                    Xg.J$a$a$a r0 = new Xg.J$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f66452a
                    java.lang.Object r1 = rf.C6680b.f()
                    int r2 = r0.f66454c
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    lf.w.b(r6)
                    goto L_0x004b
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    lf.w.b(r6)
                    if (r5 <= 0) goto L_0x004e
                    kotlin.jvm.internal.J r5 = r4.f66450a
                    boolean r6 = r5.f71755a
                    if (r6 != 0) goto L_0x004e
                    r5.f71755a = r3
                    Xg.g r5 = r4.f66451b
                    Xg.F r6 = Xg.F.START
                    r0.f66454c = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L_0x004b
                    return r1
                L_0x004b:
                    lf.M r5 = lf.C6514M.f71813a
                    return r5
                L_0x004e:
                    lf.M r5 = lf.C6514M.f71813a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Xg.J.a.C0964a.a(int, qf.d):java.lang.Object");
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C6658d dVar) {
                return a(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(L l10, C6658d dVar) {
            super(2, dVar);
            this.f66449c = l10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f66449c, dVar);
            aVar.f66448b = obj;
            return aVar;
        }

        public final Object invoke(C5695g gVar, C6658d dVar) {
            return ((a) create(gVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f66447a;
            if (i10 == 0) {
                w.b(obj);
                kotlin.jvm.internal.J j10 = new kotlin.jvm.internal.J();
                L l10 = this.f66449c;
                C0964a aVar = new C0964a(j10, (C5695g) this.f66448b);
                this.f66447a = 1;
                if (l10.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                w.b(obj);
            }
            throw new C6527k();
        }
    }

    public C5694f a(L l10) {
        return C5696h.y(new a(l10, (C6658d) null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
