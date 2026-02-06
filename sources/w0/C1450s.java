package W0;

import X0.e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: W0.s  reason: case insensitive filesystem */
public final class C1450s {

    /* renamed from: g  reason: collision with root package name */
    public static final a f8604g = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final C1450s f8605h = new C1450s(false, 0, false, 0, 0, (K) null, (e) null, 127, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f8606a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8607b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8608c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8609d;

    /* renamed from: e  reason: collision with root package name */
    private final int f8610e;

    /* renamed from: f  reason: collision with root package name */
    private final e f8611f;

    /* renamed from: W0.s$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1450s a() {
            return C1450s.f8605h;
        }

        private a() {
        }
    }

    public /* synthetic */ C1450s(boolean z10, int i10, boolean z11, int i11, int i12, K k10, e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, i10, z11, i11, i12, k10, eVar);
    }

    public final boolean b() {
        return this.f8608c;
    }

    public final int c() {
        return this.f8607b;
    }

    public final e d() {
        return this.f8611f;
    }

    public final int e() {
        return this.f8610e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1450s)) {
            return false;
        }
        C1450s sVar = (C1450s) obj;
        if (this.f8606a != sVar.f8606a || !C1455x.i(this.f8607b, sVar.f8607b) || this.f8608c != sVar.f8608c || !C1456y.n(this.f8609d, sVar.f8609d) || !r.m(this.f8610e, sVar.f8610e)) {
            return false;
        }
        sVar.getClass();
        if (C6496s.c((Object) null, (Object) null) && C6496s.c(this.f8611f, sVar.f8611f)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f8609d;
    }

    public final K g() {
        return null;
    }

    public final boolean h() {
        return this.f8606a;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f8606a) * 31) + C1455x.j(this.f8607b)) * 31) + Boolean.hashCode(this.f8608c)) * 31) + C1456y.o(this.f8609d)) * 31) + r.n(this.f8610e)) * 961) + this.f8611f.hashCode();
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.f8606a + ", capitalization=" + C1455x.k(this.f8607b) + ", autoCorrect=" + this.f8608c + ", keyboardType=" + C1456y.p(this.f8609d) + ", imeAction=" + r.o(this.f8610e) + ", platformImeOptions=" + null + ", hintLocales=" + this.f8611f + ')';
    }

    private C1450s(boolean z10, int i10, boolean z11, int i11, int i12, K k10, e eVar) {
        this.f8606a = z10;
        this.f8607b = i10;
        this.f8608c = z11;
        this.f8609d = i11;
        this.f8610e = i12;
        this.f8611f = eVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C1450s(boolean r9, int r10, boolean r11, int r12, int r13, W0.K r14, X0.e r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 1
            if (r0 == 0) goto L_0x0006
            r0 = 0
            goto L_0x0007
        L_0x0006:
            r0 = r9
        L_0x0007:
            r1 = r16 & 2
            if (r1 == 0) goto L_0x0012
            W0.x$a r1 = W0.C1455x.f8616b
            int r1 = r1.b()
            goto L_0x0013
        L_0x0012:
            r1 = r10
        L_0x0013:
            r2 = r16 & 4
            if (r2 == 0) goto L_0x0019
            r2 = 1
            goto L_0x001a
        L_0x0019:
            r2 = r11
        L_0x001a:
            r3 = r16 & 8
            if (r3 == 0) goto L_0x0025
            W0.y$a r3 = W0.C1456y.f8623b
            int r3 = r3.h()
            goto L_0x0026
        L_0x0025:
            r3 = r12
        L_0x0026:
            r4 = r16 & 16
            if (r4 == 0) goto L_0x0031
            W0.r$a r4 = W0.r.f8593b
            int r4 = r4.a()
            goto L_0x0032
        L_0x0031:
            r4 = r13
        L_0x0032:
            r5 = r16 & 32
            if (r5 == 0) goto L_0x0038
            r5 = 0
            goto L_0x0039
        L_0x0038:
            r5 = r14
        L_0x0039:
            r6 = r16 & 64
            if (r6 == 0) goto L_0x0044
            X0.e$a r6 = X0.e.f9568c
            X0.e r6 = r6.b()
            goto L_0x0045
        L_0x0044:
            r6 = r15
        L_0x0045:
            r7 = 0
            r9 = r8
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.C1450s.<init>(boolean, int, boolean, int, int, W0.K, X0.e, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
