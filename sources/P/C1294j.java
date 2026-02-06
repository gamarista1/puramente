package P;

import P.C1295k;
import Q0.L;
import b1.i;

/* renamed from: P.j  reason: case insensitive filesystem */
public final class C1294j {

    /* renamed from: g  reason: collision with root package name */
    public static final int f4901g = L.f5272g;

    /* renamed from: a  reason: collision with root package name */
    private final long f4902a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4903b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4904c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4905d;

    /* renamed from: e  reason: collision with root package name */
    private final int f4906e;

    /* renamed from: f  reason: collision with root package name */
    private final L f4907f;

    public C1294j(long j10, int i10, int i11, int i12, int i13, L l10) {
        this.f4902a = j10;
        this.f4903b = i10;
        this.f4904c = i11;
        this.f4905d = i12;
        this.f4906e = i13;
        this.f4907f = l10;
    }

    private final i b() {
        return y.b(this.f4907f, this.f4905d);
    }

    private final i j() {
        return y.b(this.f4907f, this.f4904c);
    }

    public final C1295k.a a(int i10) {
        return new C1295k.a(y.b(this.f4907f, i10), i10, this.f4902a);
    }

    public final String c() {
        return this.f4907f.l().j().j();
    }

    public final C1289e d() {
        int i10 = this.f4904c;
        int i11 = this.f4905d;
        if (i10 < i11) {
            return C1289e.NOT_CROSSED;
        }
        if (i10 > i11) {
            return C1289e.CROSSED;
        }
        return C1289e.COLLAPSED;
    }

    public final int e() {
        return this.f4905d;
    }

    public final int f() {
        return this.f4906e;
    }

    public final int g() {
        return this.f4904c;
    }

    public final long h() {
        return this.f4902a;
    }

    public final int i() {
        return this.f4903b;
    }

    public final L k() {
        return this.f4907f;
    }

    public final int l() {
        return c().length();
    }

    public final boolean m(C1294j jVar) {
        if (this.f4902a == jVar.f4902a && this.f4904c == jVar.f4904c && this.f4905d == jVar.f4905d) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "SelectionInfo(id=" + this.f4902a + ", range=(" + this.f4904c + '-' + j() + ',' + this.f4905d + '-' + b() + "), prevOffset=" + this.f4906e + ')';
    }
}
