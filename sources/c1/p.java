package c1;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class p {

    /* renamed from: e  reason: collision with root package name */
    public static final a f19229e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final p f19230f = new p(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final int f19231a;

    /* renamed from: b  reason: collision with root package name */
    private final int f19232b;

    /* renamed from: c  reason: collision with root package name */
    private final int f19233c;

    /* renamed from: d  reason: collision with root package name */
    private final int f19234d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p a() {
            return p.f19230f;
        }

        private a() {
        }
    }

    public p(int i10, int i11, int i12, int i13) {
        this.f19231a = i10;
        this.f19232b = i11;
        this.f19233c = i12;
        this.f19234d = i13;
    }

    public static /* synthetic */ p c(p pVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = pVar.f19231a;
        }
        if ((i14 & 2) != 0) {
            i11 = pVar.f19232b;
        }
        if ((i14 & 4) != 0) {
            i12 = pVar.f19233c;
        }
        if ((i14 & 8) != 0) {
            i13 = pVar.f19234d;
        }
        return pVar.b(i10, i11, i12, i13);
    }

    public final p b(int i10, int i11, int i12, int i13) {
        return new p(i10, i11, i12, i13);
    }

    public final int d() {
        return this.f19234d;
    }

    public final long e() {
        return o.a(this.f19231a + (k() / 2), this.f19232b + (f() / 2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f19231a == pVar.f19231a && this.f19232b == pVar.f19232b && this.f19233c == pVar.f19233c && this.f19234d == pVar.f19234d) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f19234d - this.f19232b;
    }

    public final int g() {
        return this.f19231a;
    }

    public final int h() {
        return this.f19233c;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f19231a) * 31) + Integer.hashCode(this.f19232b)) * 31) + Integer.hashCode(this.f19233c)) * 31) + Integer.hashCode(this.f19234d);
    }

    public final int i() {
        return this.f19232b;
    }

    public final long j() {
        return o.a(this.f19231a, this.f19232b);
    }

    public final int k() {
        return this.f19233c - this.f19231a;
    }

    public final boolean l() {
        if (this.f19231a >= this.f19233c || this.f19232b >= this.f19234d) {
            return true;
        }
        return false;
    }

    public final p m(int i10, int i11) {
        return new p(this.f19231a + i10, this.f19232b + i11, this.f19233c + i10, this.f19234d + i11);
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.f19231a + ", " + this.f19232b + ", " + this.f19233c + ", " + this.f19234d + ')';
    }
}
