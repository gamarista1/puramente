package J;

import W0.C1450s;
import W0.C1455x;
import W0.C1456y;
import W0.K;
import W0.r;
import X0.e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: J.x  reason: case insensitive filesystem */
public final class C1227x {

    /* renamed from: g  reason: collision with root package name */
    public static final a f3486g = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final C1227x f3487h = new C1227x(0, (Boolean) null, 0, 0, (K) null, (Boolean) null, (e) null, 127, (DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    private static final C1227x f3488i = new C1227x(0, Boolean.FALSE, C1456y.f8623b.f(), 0, (K) null, (Boolean) null, (e) null, 121, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f3489a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f3490b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3491c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3492d;

    /* renamed from: e  reason: collision with root package name */
    private final Boolean f3493e;

    /* renamed from: f  reason: collision with root package name */
    private final e f3494f;

    /* renamed from: J.x$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1227x a() {
            return C1227x.f3487h;
        }

        private a() {
        }
    }

    public /* synthetic */ C1227x(int i10, Boolean bool, int i11, int i12, K k10, Boolean bool2, e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, bool, i11, i12, k10, bool2, eVar);
    }

    public static /* synthetic */ C1227x c(C1227x xVar, int i10, Boolean bool, int i11, int i12, K k10, Boolean bool2, e eVar, int i13, Object obj) {
        K k11;
        Boolean bool3;
        e eVar2;
        if ((i13 & 1) != 0) {
            i10 = xVar.f3489a;
        }
        if ((i13 & 2) != 0) {
            bool = xVar.f3490b;
        }
        Boolean bool4 = bool;
        if ((i13 & 4) != 0) {
            i11 = xVar.f3491c;
        }
        int i14 = i11;
        if ((i13 & 8) != 0) {
            i12 = xVar.f3492d;
        }
        int i15 = i12;
        if ((i13 & 16) != 0) {
            xVar.getClass();
            k11 = null;
        } else {
            k11 = k10;
        }
        if ((i13 & 32) != 0) {
            bool3 = null;
        } else {
            bool3 = bool2;
        }
        if ((i13 & 64) != 0) {
            eVar2 = null;
        } else {
            eVar2 = eVar;
        }
        return xVar.b(i10, bool4, i14, i15, k11, bool3, eVar2);
    }

    private final boolean d() {
        Boolean bool = this.f3490b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final int e() {
        C1455x f10 = C1455x.f(this.f3489a);
        int l10 = f10.l();
        C1455x.a aVar = C1455x.f8616b;
        if (C1455x.i(l10, aVar.d())) {
            f10 = null;
        }
        if (f10 != null) {
            return f10.l();
        }
        return aVar.b();
    }

    private final e f() {
        e eVar = this.f3494f;
        if (eVar == null) {
            return e.f9568c.b();
        }
        return eVar;
    }

    private final int h() {
        C1456y k10 = C1456y.k(this.f3491c);
        int q10 = k10.q();
        C1456y.a aVar = C1456y.f8623b;
        if (C1456y.n(q10, aVar.i())) {
            k10 = null;
        }
        if (k10 != null) {
            return k10.q();
        }
        return aVar.h();
    }

    public final C1227x b(int i10, Boolean bool, int i11, int i12, K k10, Boolean bool2, e eVar) {
        return new C1227x(i10, bool, i11, i12, k10, bool2, eVar, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1227x)) {
            return false;
        }
        C1227x xVar = (C1227x) obj;
        if (!C1455x.i(this.f3489a, xVar.f3489a) || !C6496s.c(this.f3490b, xVar.f3490b) || !C1456y.n(this.f3491c, xVar.f3491c) || !r.m(this.f3492d, xVar.f3492d)) {
            return false;
        }
        xVar.getClass();
        if (C6496s.c((Object) null, (Object) null) && C6496s.c(this.f3493e, xVar.f3493e) && C6496s.c(this.f3494f, xVar.f3494f)) {
            return true;
        }
        return false;
    }

    public final int g() {
        r j10 = r.j(this.f3492d);
        int p10 = j10.p();
        r.a aVar = r.f8593b;
        if (r.m(p10, aVar.i())) {
            j10 = null;
        }
        if (j10 != null) {
            return j10.p();
        }
        return aVar.a();
    }

    public int hashCode() {
        int i10;
        int i11;
        int j10 = C1455x.j(this.f3489a) * 31;
        Boolean bool = this.f3490b;
        int i12 = 0;
        if (bool != null) {
            i10 = bool.hashCode();
        } else {
            i10 = 0;
        }
        int o10 = (((((j10 + i10) * 31) + C1456y.o(this.f3491c)) * 31) + r.n(this.f3492d)) * 961;
        Boolean bool2 = this.f3493e;
        if (bool2 != null) {
            i11 = bool2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (o10 + i11) * 31;
        e eVar = this.f3494f;
        if (eVar != null) {
            i12 = eVar.hashCode();
        }
        return i13 + i12;
    }

    public final C1450s i(boolean z10) {
        return new C1450s(z10, e(), d(), h(), g(), (K) null, f(), (DefaultConstructorMarker) null);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + C1455x.k(this.f3489a) + ", autoCorrectEnabled=" + this.f3490b + ", keyboardType=" + C1456y.p(this.f3491c) + ", imeAction=" + r.o(this.f3492d) + ", platformImeOptions=" + null + "showKeyboardOnFocus=" + this.f3493e + ", hintLocales=" + this.f3494f + ')';
    }

    private C1227x(int i10, Boolean bool, int i11, int i12, K k10, Boolean bool2, e eVar) {
        this.f3489a = i10;
        this.f3490b = bool;
        this.f3491c = i11;
        this.f3492d = i12;
        this.f3493e = bool2;
        this.f3494f = eVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C1227x(int r9, java.lang.Boolean r10, int r11, int r12, W0.K r13, java.lang.Boolean r14, X0.e r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 1
            if (r0 == 0) goto L_0x000b
            W0.x$a r0 = W0.C1455x.f8616b
            int r0 = r0.d()
            goto L_0x000c
        L_0x000b:
            r0 = r9
        L_0x000c:
            r1 = r16 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r1 = r2
            goto L_0x0014
        L_0x0013:
            r1 = r10
        L_0x0014:
            r3 = r16 & 4
            if (r3 == 0) goto L_0x001f
            W0.y$a r3 = W0.C1456y.f8623b
            int r3 = r3.i()
            goto L_0x0020
        L_0x001f:
            r3 = r11
        L_0x0020:
            r4 = r16 & 8
            if (r4 == 0) goto L_0x002b
            W0.r$a r4 = W0.r.f8593b
            int r4 = r4.i()
            goto L_0x002c
        L_0x002b:
            r4 = r12
        L_0x002c:
            r5 = r16 & 16
            if (r5 == 0) goto L_0x0032
            r5 = r2
            goto L_0x0033
        L_0x0032:
            r5 = r13
        L_0x0033:
            r6 = r16 & 32
            if (r6 == 0) goto L_0x0039
            r6 = r2
            goto L_0x003a
        L_0x0039:
            r6 = r14
        L_0x003a:
            r7 = r16 & 64
            if (r7 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r2 = r15
        L_0x0040:
            r7 = 0
            r9 = r8
            r10 = r0
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r2
            r17 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C1227x.<init>(int, java.lang.Boolean, int, int, W0.K, java.lang.Boolean, X0.e, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
