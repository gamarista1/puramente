package W0;

import Q0.B;
import Q0.C1321d;
import Q0.S;
import h0.C2026j;
import h0.C2027k;
import h0.C2028l;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yf.C6798l;
import yf.p;

public final class Q {

    /* renamed from: d  reason: collision with root package name */
    public static final c f8505d = new c((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private static final C2026j f8506e = C2027k.a(a.f8510a, b.f8511a);

    /* renamed from: a  reason: collision with root package name */
    private final C1321d f8507a;

    /* renamed from: b  reason: collision with root package name */
    private final long f8508b;

    /* renamed from: c  reason: collision with root package name */
    private final Q0.Q f8509c;

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8510a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(C2028l lVar, Q q10) {
            return C6565s.h(B.y(q10.e(), B.h(), lVar), B.y(Q0.Q.b(q10.g()), B.j(Q0.Q.f5291b), lVar));
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f8511a = new b();

        b() {
            super(1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: Q0.Q} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final W0.Q invoke(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"
                kotlin.jvm.internal.C6496s.f(r9, r0)
                java.util.List r9 = (java.util.List) r9
                W0.Q r7 = new W0.Q
                r0 = 0
                java.lang.Object r0 = r9.get(r0)
                h0.j r1 = Q0.B.h()
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                boolean r3 = kotlin.jvm.internal.C6496s.c(r0, r2)
                r4 = 0
                if (r3 == 0) goto L_0x0021
                boolean r3 = r1 instanceof Q0.C1332o
                if (r3 != 0) goto L_0x0021
            L_0x001f:
                r1 = r4
                goto L_0x002a
            L_0x0021:
                if (r0 == 0) goto L_0x001f
                java.lang.Object r0 = r1.b(r0)
                Q0.d r0 = (Q0.C1321d) r0
                r1 = r0
            L_0x002a:
                kotlin.jvm.internal.C6496s.e(r1)
                r0 = 1
                java.lang.Object r9 = r9.get(r0)
                Q0.Q$a r0 = Q0.Q.f5291b
                h0.j r0 = Q0.B.j(r0)
                boolean r2 = kotlin.jvm.internal.C6496s.c(r9, r2)
                if (r2 == 0) goto L_0x0043
                boolean r2 = r0 instanceof Q0.C1332o
                if (r2 != 0) goto L_0x0043
                goto L_0x004c
            L_0x0043:
                if (r9 == 0) goto L_0x004c
                java.lang.Object r9 = r0.b(r9)
                r4 = r9
                Q0.Q r4 = (Q0.Q) r4
            L_0x004c:
                kotlin.jvm.internal.C6496s.e(r4)
                long r2 = r4.r()
                r5 = 4
                r6 = 0
                r4 = 0
                r0 = r7
                r0.<init>((Q0.C1321d) r1, (long) r2, (Q0.Q) r4, (int) r5, (kotlin.jvm.internal.DefaultConstructorMarker) r6)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: W0.Q.b.invoke(java.lang.Object):W0.Q");
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ Q(C1321d dVar, long j10, Q0.Q q10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j10, q10);
    }

    public static /* synthetic */ Q c(Q q10, C1321d dVar, long j10, Q0.Q q11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = q10.f8507a;
        }
        if ((i10 & 2) != 0) {
            j10 = q10.f8508b;
        }
        if ((i10 & 4) != 0) {
            q11 = q10.f8509c;
        }
        return q10.a(dVar, j10, q11);
    }

    public static /* synthetic */ Q d(Q q10, String str, long j10, Q0.Q q11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = q10.f8508b;
        }
        if ((i10 & 4) != 0) {
            q11 = q10.f8509c;
        }
        return q10.b(str, j10, q11);
    }

    public final Q a(C1321d dVar, long j10, Q0.Q q10) {
        return new Q(dVar, j10, q10, (DefaultConstructorMarker) null);
    }

    public final Q b(String str, long j10, Q0.Q q10) {
        return new Q(new C1321d(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), j10, q10, (DefaultConstructorMarker) null);
    }

    public final C1321d e() {
        return this.f8507a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        if (!Q0.Q.g(this.f8508b, q10.f8508b) || !C6496s.c(this.f8509c, q10.f8509c) || !C6496s.c(this.f8507a, q10.f8507a)) {
            return false;
        }
        return true;
    }

    public final Q0.Q f() {
        return this.f8509c;
    }

    public final long g() {
        return this.f8508b;
    }

    public final String h() {
        return this.f8507a.j();
    }

    public int hashCode() {
        int i10;
        int hashCode = ((this.f8507a.hashCode() * 31) + Q0.Q.o(this.f8508b)) * 31;
        Q0.Q q10 = this.f8509c;
        if (q10 != null) {
            i10 = Q0.Q.o(q10.r());
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "TextFieldValue(text='" + this.f8507a + "', selection=" + Q0.Q.q(this.f8508b) + ", composition=" + this.f8509c + ')';
    }

    public /* synthetic */ Q(String str, long j10, Q0.Q q10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, q10);
    }

    private Q(C1321d dVar, long j10, Q0.Q q10) {
        this.f8507a = dVar;
        this.f8508b = S.c(j10, 0, h().length());
        this.f8509c = q10 != null ? Q0.Q.b(S.c(q10.r(), 0, h().length())) : null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(C1321d dVar, long j10, Q0.Q q10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i10 & 2) != 0 ? Q0.Q.f5291b.a() : j10, (i10 & 4) != 0 ? null : q10, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(String str, long j10, Q0.Q q10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? Q0.Q.f5291b.a() : j10, (i10 & 4) != 0 ? null : q10, (DefaultConstructorMarker) null);
    }

    private Q(String str, long j10, Q0.Q q10) {
        this(new C1321d(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), j10, q10, (DefaultConstructorMarker) null);
    }
}
