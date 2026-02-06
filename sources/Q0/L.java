package Q0;

import b1.i;
import c1.r;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2423i;
import r0.S1;

public final class L {

    /* renamed from: g  reason: collision with root package name */
    public static final int f5272g = 8;

    /* renamed from: a  reason: collision with root package name */
    private final K f5273a;

    /* renamed from: b  reason: collision with root package name */
    private final C1328k f5274b;

    /* renamed from: c  reason: collision with root package name */
    private final long f5275c;

    /* renamed from: d  reason: collision with root package name */
    private final float f5276d;

    /* renamed from: e  reason: collision with root package name */
    private final float f5277e;

    /* renamed from: f  reason: collision with root package name */
    private final List f5278f;

    public /* synthetic */ L(K k10, C1328k kVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(k10, kVar, j10);
    }

    public static /* synthetic */ L b(L l10, K k10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            k10 = l10.f5273a;
        }
        if ((i10 & 2) != 0) {
            j10 = l10.f5275c;
        }
        return l10.a(k10, j10);
    }

    public static /* synthetic */ int p(L l10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return l10.o(i10, z10);
    }

    public final List A() {
        return this.f5278f;
    }

    public final long B() {
        return this.f5275c;
    }

    public final long C(int i10) {
        return this.f5274b.B(i10);
    }

    public final L a(K k10, long j10) {
        return new L(k10, this.f5274b, j10, (DefaultConstructorMarker) null);
    }

    public final i c(int i10) {
        return this.f5274b.c(i10);
    }

    public final C2423i d(int i10) {
        return this.f5274b.d(i10);
    }

    public final C2423i e(int i10) {
        return this.f5274b.e(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        if (C6496s.c(this.f5273a, l10.f5273a) && C6496s.c(this.f5274b, l10.f5274b) && r.e(this.f5275c, l10.f5275c) && this.f5276d == l10.f5276d && this.f5277e == l10.f5277e && C6496s.c(this.f5278f, l10.f5278f)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (this.f5274b.f() || ((float) r.f(this.f5275c)) < this.f5274b.h()) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (((float) r.g(this.f5275c)) < this.f5274b.A()) {
            return true;
        }
        return false;
    }

    public final float h() {
        return this.f5276d;
    }

    public int hashCode() {
        return (((((((((this.f5273a.hashCode() * 31) + this.f5274b.hashCode()) * 31) + r.h(this.f5275c)) * 31) + Float.hashCode(this.f5276d)) * 31) + Float.hashCode(this.f5277e)) * 31) + this.f5278f.hashCode();
    }

    public final boolean i() {
        if (g() || f()) {
            return true;
        }
        return false;
    }

    public final float j(int i10, boolean z10) {
        return this.f5274b.i(i10, z10);
    }

    public final float k() {
        return this.f5277e;
    }

    public final K l() {
        return this.f5273a;
    }

    public final float m(int i10) {
        return this.f5274b.l(i10);
    }

    public final int n() {
        return this.f5274b.m();
    }

    public final int o(int i10, boolean z10) {
        return this.f5274b.n(i10, z10);
    }

    public final int q(int i10) {
        return this.f5274b.o(i10);
    }

    public final int r(float f10) {
        return this.f5274b.p(f10);
    }

    public final float s(int i10) {
        return this.f5274b.q(i10);
    }

    public final float t(int i10) {
        return this.f5274b.r(i10);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.f5273a + ", multiParagraph=" + this.f5274b + ", size=" + r.i(this.f5275c) + ", firstBaseline=" + this.f5276d + ", lastBaseline=" + this.f5277e + ", placeholderRects=" + this.f5278f + ')';
    }

    public final int u(int i10) {
        return this.f5274b.s(i10);
    }

    public final float v(int i10) {
        return this.f5274b.t(i10);
    }

    public final C1328k w() {
        return this.f5274b;
    }

    public final int x(long j10) {
        return this.f5274b.u(j10);
    }

    public final i y(int i10) {
        return this.f5274b.v(i10);
    }

    public final S1 z(int i10, int i11) {
        return this.f5274b.x(i10, i11);
    }

    private L(K k10, C1328k kVar, long j10) {
        this.f5273a = k10;
        this.f5274b = kVar;
        this.f5275c = j10;
        this.f5276d = kVar.g();
        this.f5277e = kVar.k();
        this.f5278f = kVar.y();
    }
}
