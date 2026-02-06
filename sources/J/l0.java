package J;

import W0.Q;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f3381a;

    /* renamed from: b  reason: collision with root package name */
    private a f3382b;

    /* renamed from: c  reason: collision with root package name */
    private a f3383c;

    /* renamed from: d  reason: collision with root package name */
    private int f3384d;

    /* renamed from: e  reason: collision with root package name */
    private Long f3385e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3386f;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private a f3387a;

        /* renamed from: b  reason: collision with root package name */
        private Q f3388b;

        public a(a aVar, Q q10) {
            this.f3387a = aVar;
            this.f3388b = q10;
        }

        public final a a() {
            return this.f3387a;
        }

        public final Q b() {
            return this.f3388b;
        }

        public final void c(a aVar) {
            this.f3387a = aVar;
        }

        public final void d(Q q10) {
            this.f3388b = q10;
        }
    }

    public l0(int i10) {
        this.f3381a = i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e A[LOOP:0: B:6:0x000e->B:12:0x001e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0023 A[EDGE_INSN: B:15:0x0023->B:13:0x0023 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void d() {
        /*
            r3 = this;
            J.l0$a r0 = r3.f3382b
            r1 = 0
            if (r0 == 0) goto L_0x000a
            J.l0$a r2 = r0.a()
            goto L_0x000b
        L_0x000a:
            r2 = r1
        L_0x000b:
            if (r2 != 0) goto L_0x000e
            return
        L_0x000e:
            if (r0 == 0) goto L_0x001b
            J.l0$a r2 = r0.a()
            if (r2 == 0) goto L_0x001b
            J.l0$a r2 = r2.a()
            goto L_0x001c
        L_0x001b:
            r2 = r1
        L_0x001c:
            if (r2 == 0) goto L_0x0023
            J.l0$a r0 = r0.a()
            goto L_0x000e
        L_0x0023:
            if (r0 != 0) goto L_0x0026
            goto L_0x0029
        L_0x0026:
            r0.c(r1)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J.l0.d():void");
    }

    public static /* synthetic */ void f(l0 l0Var, Q q10, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = n0.a();
        }
        l0Var.e(q10, j10);
    }

    public final void a() {
        this.f3386f = true;
    }

    public final void b(Q q10) {
        Q q11;
        String str;
        Q b10;
        this.f3386f = false;
        a aVar = this.f3382b;
        if (aVar != null) {
            q11 = aVar.b();
        } else {
            q11 = null;
        }
        if (!C6496s.c(q10, q11)) {
            String h10 = q10.h();
            a aVar2 = this.f3382b;
            if (aVar2 == null || (b10 = aVar2.b()) == null) {
                str = null;
            } else {
                str = b10.h();
            }
            if (C6496s.c(h10, str)) {
                a aVar3 = this.f3382b;
                if (aVar3 != null) {
                    aVar3.d(q10);
                    return;
                }
                return;
            }
            this.f3382b = new a(this.f3382b, q10);
            this.f3383c = null;
            int length = this.f3384d + q10.h().length();
            this.f3384d = length;
            if (length > this.f3381a) {
                d();
            }
        }
    }

    public final Q c() {
        a aVar = this.f3383c;
        if (aVar == null) {
            return null;
        }
        this.f3383c = aVar.a();
        this.f3382b = new a(this.f3382b, aVar.b());
        this.f3384d += aVar.b().h().length();
        return aVar.b();
    }

    public final void e(Q q10, long j10) {
        long j11;
        if (!this.f3386f) {
            Long l10 = this.f3385e;
            if (l10 != null) {
                j11 = l10.longValue();
            } else {
                j11 = 0;
            }
            if (j10 <= j11 + ((long) m0.a())) {
                return;
            }
        }
        this.f3385e = Long.valueOf(j10);
        b(q10);
    }

    public final Q g() {
        a a10;
        a aVar = this.f3382b;
        if (aVar == null || (a10 = aVar.a()) == null) {
            return null;
        }
        this.f3382b = a10;
        this.f3384d -= aVar.b().h().length();
        this.f3383c = new a(this.f3383c, aVar.b());
        return a10.b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 100000 : i10);
    }
}
