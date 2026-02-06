package m3;

import Xg.C5694f;
import Xg.C5695g;
import Xg.N;
import Xg.x;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;

/* renamed from: m3.h  reason: case insensitive filesystem */
public final class C2209h {

    /* renamed from: a  reason: collision with root package name */
    private final x f24008a;

    /* renamed from: b  reason: collision with root package name */
    private final C5694f f24009b;

    /* renamed from: m3.h$a */
    public static final class a implements C5694f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5694f f24010a;

        /* renamed from: m3.h$a$a  reason: collision with other inner class name */
        public static final class C0398a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5695g f24011a;

            /* renamed from: m3.h$a$a$a  reason: collision with other inner class name */
            public static final class C0399a extends d {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f24012a;

                /* renamed from: b  reason: collision with root package name */
                int f24013b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C0398a f24014c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0399a(C0398a aVar, C6658d dVar) {
                    super(dVar);
                    this.f24014c = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f24012a = obj;
                    this.f24013b |= Integer.MIN_VALUE;
                    return this.f24014c.emit((Object) null, this);
                }
            }

            public C0398a(C5695g gVar) {
                this.f24011a = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, qf.C6658d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof m3.C2209h.a.C0398a.C0399a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    m3.h$a$a$a r0 = (m3.C2209h.a.C0398a.C0399a) r0
                    int r1 = r0.f24013b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f24013b = r1
                    goto L_0x0018
                L_0x0013:
                    m3.h$a$a$a r0 = new m3.h$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f24012a
                    java.lang.Object r1 = rf.C6680b.f()
                    int r2 = r0.f24013b
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    lf.w.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    lf.w.b(r6)
                    Xg.g r6 = r4.f24011a
                    kotlin.Pair r5 = (kotlin.Pair) r5
                    java.lang.Object r5 = r5.d()
                    if (r5 == 0) goto L_0x0047
                    r0.f24013b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    lf.M r5 = lf.C6514M.f71813a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: m3.C2209h.a.C0398a.emit(java.lang.Object, qf.d):java.lang.Object");
            }
        }

        public a(C5694f fVar) {
            this.f24010a = fVar;
        }

        public Object collect(C5695g gVar, C6658d dVar) {
            Object collect = this.f24010a.collect(new C0398a(gVar), dVar);
            if (collect == C6680b.f()) {
                return collect;
            }
            return C6514M.f71813a;
        }
    }

    public C2209h(Object obj) {
        x a10 = N.a(new Pair(Integer.MIN_VALUE, obj));
        this.f24008a = a10;
        this.f24009b = new a(a10);
    }

    public final C5694f a() {
        return this.f24009b;
    }

    public final void b(Object obj) {
        C6496s.h(obj, "data");
        x xVar = this.f24008a;
        xVar.setValue(new Pair(Integer.valueOf(((Number) ((Pair) xVar.getValue()).c()).intValue() + 1), obj));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2209h(Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : obj);
    }
}
