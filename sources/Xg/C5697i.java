package Xg;

import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

/* renamed from: Xg.i  reason: case insensitive filesystem */
abstract /* synthetic */ class C5697i {

    /* renamed from: Xg.i$a */
    public static final class a implements C5694f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object[] f66511a;

        /* renamed from: Xg.i$a$a  reason: collision with other inner class name */
        public static final class C0968a extends d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f66512a;

            /* renamed from: b  reason: collision with root package name */
            int f66513b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f66514c;

            /* renamed from: d  reason: collision with root package name */
            Object f66515d;

            /* renamed from: e  reason: collision with root package name */
            Object f66516e;

            /* renamed from: f  reason: collision with root package name */
            int f66517f;

            /* renamed from: g  reason: collision with root package name */
            int f66518g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0968a(a aVar, C6658d dVar) {
                super(dVar);
                this.f66514c = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f66512a = obj;
                this.f66513b |= Integer.MIN_VALUE;
                return this.f66514c.collect((C5695g) null, this);
            }
        }

        public a(Object[] objArr) {
            this.f66511a = objArr;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object collect(Xg.C5695g r8, qf.C6658d r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof Xg.C5697i.a.C0968a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                Xg.i$a$a r0 = (Xg.C5697i.a.C0968a) r0
                int r1 = r0.f66513b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f66513b = r1
                goto L_0x0018
            L_0x0013:
                Xg.i$a$a r0 = new Xg.i$a$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f66512a
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f66513b
                r3 = 1
                if (r2 == 0) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                int r8 = r0.f66518g
                int r2 = r0.f66517f
                java.lang.Object r4 = r0.f66516e
                Xg.g r4 = (Xg.C5695g) r4
                java.lang.Object r5 = r0.f66515d
                Xg.i$a r5 = (Xg.C5697i.a) r5
                lf.w.b(r9)
                r9 = r4
                goto L_0x0060
            L_0x0036:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x003e:
                lf.w.b(r9)
                java.lang.Object[] r9 = r7.f66511a
                int r9 = r9.length
                r2 = 0
                r5 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L_0x0049:
                if (r2 >= r8) goto L_0x0062
                java.lang.Object[] r4 = r5.f66511a
                r4 = r4[r2]
                r0.f66515d = r5
                r0.f66516e = r9
                r0.f66517f = r2
                r0.f66518g = r8
                r0.f66513b = r3
                java.lang.Object r4 = r9.emit(r4, r0)
                if (r4 != r1) goto L_0x0060
                return r1
            L_0x0060:
                int r2 = r2 + r3
                goto L_0x0049
            L_0x0062:
                lf.M r8 = lf.C6514M.f71813a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Xg.C5697i.a.collect(Xg.g, qf.d):java.lang.Object");
        }
    }

    /* renamed from: Xg.i$b */
    public static final class b implements C5694f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f66519a;

        public b(Object obj) {
            this.f66519a = obj;
        }

        public Object collect(C5695g gVar, C6658d dVar) {
            Object emit = gVar.emit(this.f66519a, dVar);
            if (emit == C6680b.f()) {
                return emit;
            }
            return C6514M.f71813a;
        }
    }

    public static final C5694f a(p pVar) {
        return new C5690b(pVar, (g) null, 0, (Wg.a) null, 14, (DefaultConstructorMarker) null);
    }

    public static final C5694f b(p pVar) {
        return new A(pVar);
    }

    public static final C5694f c(Object obj) {
        return new b(obj);
    }

    public static final C5694f d(Object... objArr) {
        return new a(objArr);
    }
}
