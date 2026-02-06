package W0;

import Q0.C1321d;
import Q0.Q;
import Q0.S;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: W0.l  reason: case insensitive filesystem */
public final class C1444l {

    /* renamed from: f  reason: collision with root package name */
    public static final a f8582f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f8583g = 8;

    /* renamed from: a  reason: collision with root package name */
    private final J f8584a;

    /* renamed from: b  reason: collision with root package name */
    private int f8585b;

    /* renamed from: c  reason: collision with root package name */
    private int f8586c;

    /* renamed from: d  reason: collision with root package name */
    private int f8587d;

    /* renamed from: e  reason: collision with root package name */
    private int f8588e;

    /* renamed from: W0.l$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ C1444l(C1321d dVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j10);
    }

    private final void q(int i10) {
        if (i10 >= 0) {
            this.f8586c = i10;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i10).toString());
    }

    private final void r(int i10) {
        if (i10 >= 0) {
            this.f8585b = i10;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i10).toString());
    }

    public final void a() {
        this.f8587d = -1;
        this.f8588e = -1;
    }

    public final void b(int i10, int i11) {
        long b10 = S.b(i10, i11);
        this.f8584a.c(i10, i11, "");
        long a10 = C1445m.a(S.b(this.f8585b, this.f8586c), b10);
        r(Q.l(a10));
        q(Q.k(a10));
        if (l()) {
            long a11 = C1445m.a(S.b(this.f8587d, this.f8588e), b10);
            if (Q.h(a11)) {
                a();
                return;
            }
            this.f8587d = Q.l(a11);
            this.f8588e = Q.k(a11);
        }
    }

    public final char c(int i10) {
        return this.f8584a.a(i10);
    }

    public final Q d() {
        if (l()) {
            return Q.b(S.b(this.f8587d, this.f8588e));
        }
        return null;
    }

    public final int e() {
        return this.f8588e;
    }

    public final int f() {
        return this.f8587d;
    }

    public final int g() {
        int i10 = this.f8585b;
        int i11 = this.f8586c;
        if (i10 == i11) {
            return i11;
        }
        return -1;
    }

    public final int h() {
        return this.f8584a.b();
    }

    public final long i() {
        return S.b(this.f8585b, this.f8586c);
    }

    public final int j() {
        return this.f8586c;
    }

    public final int k() {
        return this.f8585b;
    }

    public final boolean l() {
        if (this.f8587d != -1) {
            return true;
        }
        return false;
    }

    public final void m(int i10, int i11, String str) {
        if (i10 < 0 || i10 > this.f8584a.b()) {
            throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.f8584a.b());
        } else if (i11 < 0 || i11 > this.f8584a.b()) {
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.f8584a.b());
        } else if (i10 <= i11) {
            this.f8584a.c(i10, i11, str);
            r(str.length() + i10);
            q(i10 + str.length());
            this.f8587d = -1;
            this.f8588e = -1;
        } else {
            throw new IllegalArgumentException("Do not set reversed range: " + i10 + " > " + i11);
        }
    }

    public final void n(int i10, int i11) {
        if (i10 < 0 || i10 > this.f8584a.b()) {
            throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.f8584a.b());
        } else if (i11 < 0 || i11 > this.f8584a.b()) {
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.f8584a.b());
        } else if (i10 < i11) {
            this.f8587d = i10;
            this.f8588e = i11;
        } else {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i10 + " > " + i11);
        }
    }

    public final void o(int i10) {
        p(i10, i10);
    }

    public final void p(int i10, int i11) {
        if (i10 < 0 || i10 > this.f8584a.b()) {
            throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.f8584a.b());
        } else if (i11 < 0 || i11 > this.f8584a.b()) {
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.f8584a.b());
        } else if (i10 <= i11) {
            r(i10);
            q(i11);
        } else {
            throw new IllegalArgumentException("Do not set reversed range: " + i10 + " > " + i11);
        }
    }

    public final C1321d s() {
        return new C1321d(toString(), (List) null, (List) null, 6, (DefaultConstructorMarker) null);
    }

    public String toString() {
        return this.f8584a.toString();
    }

    private C1444l(C1321d dVar, long j10) {
        this.f8584a = new J(dVar.j());
        this.f8585b = Q.l(j10);
        this.f8586c = Q.k(j10);
        this.f8587d = -1;
        this.f8588e = -1;
        int l10 = Q.l(j10);
        int k10 = Q.k(j10);
        if (l10 < 0 || l10 > dVar.length()) {
            throw new IndexOutOfBoundsException("start (" + l10 + ") offset is outside of text region " + dVar.length());
        } else if (k10 < 0 || k10 > dVar.length()) {
            throw new IndexOutOfBoundsException("end (" + k10 + ") offset is outside of text region " + dVar.length());
        } else if (l10 > k10) {
            throw new IllegalArgumentException("Do not set reversed range: " + l10 + " > " + k10);
        }
    }
}
