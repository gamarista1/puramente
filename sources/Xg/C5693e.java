package Xg;

import Yg.t;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.N;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.p;

/* renamed from: Xg.e  reason: case insensitive filesystem */
final class C5693e implements C5694f {

    /* renamed from: a  reason: collision with root package name */
    private final C5694f f66502a;

    /* renamed from: b  reason: collision with root package name */
    public final C6798l f66503b;

    /* renamed from: c  reason: collision with root package name */
    public final p f66504c;

    /* renamed from: Xg.e$a */
    static final class a implements C5695g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5693e f66505a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ N f66506b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5695g f66507c;

        /* renamed from: Xg.e$a$a  reason: collision with other inner class name */
        static final class C0967a extends d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f66508a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f66509b;

            /* renamed from: c  reason: collision with root package name */
            int f66510c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0967a(a aVar, C6658d dVar) {
                super(dVar);
                this.f66509b = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f66508a = obj;
                this.f66510c |= Integer.MIN_VALUE;
                return this.f66509b.emit((Object) null, this);
            }
        }

        a(C5693e eVar, N n10, C5695g gVar) {
            this.f66505a = eVar;
            this.f66506b = n10;
            this.f66507c = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(java.lang.Object r6, qf.C6658d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof Xg.C5693e.a.C0967a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                Xg.e$a$a r0 = (Xg.C5693e.a.C0967a) r0
                int r1 = r0.f66510c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f66510c = r1
                goto L_0x0018
            L_0x0013:
                Xg.e$a$a r0 = new Xg.e$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f66508a
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f66510c
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                lf.w.b(r7)
                goto L_0x0067
            L_0x0029:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0031:
                lf.w.b(r7)
                Xg.e r7 = r5.f66505a
                yf.l r7 = r7.f66503b
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.N r2 = r5.f66506b
                java.lang.Object r2 = r2.f71759a
                Zg.G r4 = Yg.t.f66850a
                if (r2 == r4) goto L_0x0058
                Xg.e r4 = r5.f66505a
                yf.p r4 = r4.f66504c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x0055
                goto L_0x0058
            L_0x0055:
                lf.M r6 = lf.C6514M.f71813a
                return r6
            L_0x0058:
                kotlin.jvm.internal.N r2 = r5.f66506b
                r2.f71759a = r7
                Xg.g r7 = r5.f66507c
                r0.f66510c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L_0x0067
                return r1
            L_0x0067:
                lf.M r6 = lf.C6514M.f71813a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Xg.C5693e.a.emit(java.lang.Object, qf.d):java.lang.Object");
        }
    }

    public C5693e(C5694f fVar, C6798l lVar, p pVar) {
        this.f66502a = fVar;
        this.f66503b = lVar;
        this.f66504c = pVar;
    }

    public Object collect(C5695g gVar, C6658d dVar) {
        N n10 = new N();
        n10.f71759a = t.f66850a;
        Object collect = this.f66502a.collect(new a(this, n10, gVar), dVar);
        if (collect == C6680b.f()) {
            return collect;
        }
        return C6514M.f71813a;
    }
}
