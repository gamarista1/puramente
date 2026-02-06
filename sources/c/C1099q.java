package C;

import C.C1101t;
import H0.E;
import H0.U;
import androidx.collection.C1598l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: C.q  reason: case insensitive filesystem */
public final class C1099q {

    /* renamed from: a  reason: collision with root package name */
    private final int f1013a;

    /* renamed from: b  reason: collision with root package name */
    private final C1102u f1014b;

    /* renamed from: c  reason: collision with root package name */
    private final long f1015c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1016d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1017e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1018f;

    /* renamed from: C.q$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final E f1019a;

        /* renamed from: b  reason: collision with root package name */
        private final U f1020b;

        /* renamed from: c  reason: collision with root package name */
        private final long f1021c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f1022d;

        public /* synthetic */ a(E e10, U u10, long j10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(e10, u10, j10, z10);
        }

        public final E a() {
            return this.f1019a;
        }

        public final long b() {
            return this.f1021c;
        }

        public final boolean c() {
            return this.f1022d;
        }

        public final U d() {
            return this.f1020b;
        }

        public final void e(boolean z10) {
            this.f1022d = z10;
        }

        private a(E e10, U u10, long j10, boolean z10) {
            this.f1019a = e10;
            this.f1020b = u10;
            this.f1021c = j10;
            this.f1022d = z10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(E e10, U u10, long j10, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(e10, u10, j10, (i10 & 8) != 0 ? true : z10, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: C.q$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f1023a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f1024b;

        public b(boolean z10, boolean z11) {
            this.f1023a = z10;
            this.f1024b = z11;
        }

        public final boolean a() {
            return this.f1024b;
        }

        public final boolean b() {
            return this.f1023a;
        }
    }

    public /* synthetic */ C1099q(int i10, C1102u uVar, long j10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, uVar, j10, i11, i12, i13);
    }

    public final a a(b bVar, boolean z10, int i10, int i11, int i12, int i13) {
        a e10;
        boolean z11;
        if (!bVar.a() || (e10 = this.f1014b.e(z10, i10, i11)) == null) {
            return null;
        }
        if (i10 < 0 || (i13 != 0 && (i12 - C1598l.e(e10.b()) < 0 || i13 >= this.f1013a))) {
            z11 = false;
        } else {
            z11 = true;
        }
        e10.e(z11);
        return e10;
    }

    public final b b(boolean z10, int i10, long j10, C1598l lVar, int i11, int i12, int i13, boolean z11, boolean z12) {
        C1598l f10;
        int i14 = i10;
        int i15 = i11;
        int i16 = i13;
        int i17 = i12 + i16;
        if (lVar == null) {
            return new b(true, true);
        }
        if (this.f1014b.i() != C1101t.a.Visible && (i15 >= this.f1016d || C1598l.f(j10) - C1598l.f(lVar.i()) < 0)) {
            return new b(true, true);
        }
        if (i14 == 0 || (i14 < this.f1013a && C1598l.e(j10) - C1598l.e(lVar.i()) >= 0)) {
            int max = i12 + Math.max(i16, C1598l.f(lVar.i()));
            if (z12) {
                f10 = null;
            } else {
                boolean z13 = z10;
                f10 = this.f1014b.f(z10, i15, max);
            }
            C1598l lVar2 = f10;
            if (lVar2 != null) {
                lVar2.i();
                if (i14 + 1 >= this.f1013a || ((C1598l.e(j10) - C1598l.e(lVar.i())) - this.f1017e) - C1598l.e(lVar2.i()) < 0) {
                    if (z12) {
                        return new b(true, true);
                    }
                    b b10 = b(false, 0, C1598l.b(c1.b.l(this.f1015c), (C1598l.f(j10) - this.f1018f) - Math.max(i16, C1598l.f(lVar.i()))), lVar2, i15 + 1, max, 0, true, true);
                    return new b(b10.a(), b10.a());
                }
            }
            return new b(false, false);
        } else if (z11) {
            return new b(true, true);
        } else {
            int i18 = i15 + 1;
            return new b(true, b(z10, 0, C1598l.b(c1.b.l(this.f1015c), (C1598l.f(j10) - this.f1018f) - i16), C1598l.a(C1598l.b(C1598l.e(lVar.i()) - this.f1017e, C1598l.f(lVar.i()))), i18, i17, 0, true, false).a());
        }
    }

    private C1099q(int i10, C1102u uVar, long j10, int i11, int i12, int i13) {
        this.f1013a = i10;
        this.f1014b = uVar;
        this.f1015c = j10;
        this.f1016d = i11;
        this.f1017e = i12;
        this.f1018f = i13;
    }
}
