package f2;

import i2.C2076a;
import i2.L;

/* renamed from: f2.m  reason: case insensitive filesystem */
public final class C1978m {

    /* renamed from: e  reason: collision with root package name */
    public static final C1978m f19999e = new b(0).e();

    /* renamed from: f  reason: collision with root package name */
    private static final String f20000f = L.y0(0);

    /* renamed from: g  reason: collision with root package name */
    private static final String f20001g = L.y0(1);

    /* renamed from: h  reason: collision with root package name */
    private static final String f20002h = L.y0(2);

    /* renamed from: i  reason: collision with root package name */
    private static final String f20003i = L.y0(3);

    /* renamed from: a  reason: collision with root package name */
    public final int f20004a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20005b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20006c;

    /* renamed from: d  reason: collision with root package name */
    public final String f20007d;

    /* renamed from: f2.m$b */
    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f20008a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f20009b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f20010c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f20011d;

        public b(int i10) {
            this.f20008a = i10;
        }

        public C1978m e() {
            boolean z10;
            if (this.f20009b <= this.f20010c) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2076a.a(z10);
            return new C1978m(this);
        }

        public b f(int i10) {
            this.f20010c = i10;
            return this;
        }

        public b g(int i10) {
            this.f20009b = i10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1978m)) {
            return false;
        }
        C1978m mVar = (C1978m) obj;
        if (this.f20004a == mVar.f20004a && this.f20005b == mVar.f20005b && this.f20006c == mVar.f20006c && L.c(this.f20007d, mVar.f20007d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = (((((527 + this.f20004a) * 31) + this.f20005b) * 31) + this.f20006c) * 31;
        String str = this.f20007d;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return i11 + i10;
    }

    private C1978m(b bVar) {
        this.f20004a = bVar.f20008a;
        this.f20005b = bVar.f20009b;
        this.f20006c = bVar.f20010c;
        this.f20007d = bVar.f20011d;
    }
}
