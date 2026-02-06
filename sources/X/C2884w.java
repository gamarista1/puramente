package x;

import android.content.Context;
import android.widget.EdgeEffect;
import c1.r;

/* renamed from: x.w  reason: case insensitive filesystem */
final class C2884w {

    /* renamed from: a  reason: collision with root package name */
    private final Context f27979a;

    /* renamed from: b  reason: collision with root package name */
    private final int f27980b;

    /* renamed from: c  reason: collision with root package name */
    private long f27981c = r.f19235b.a();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public EdgeEffect f27982d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public EdgeEffect f27983e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public EdgeEffect f27984f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public EdgeEffect f27985g;

    /* renamed from: h  reason: collision with root package name */
    private EdgeEffect f27986h;

    /* renamed from: i  reason: collision with root package name */
    private EdgeEffect f27987i;

    /* renamed from: j  reason: collision with root package name */
    private EdgeEffect f27988j;

    /* renamed from: k  reason: collision with root package name */
    private EdgeEffect f27989k;

    public C2884w(Context context, int i10) {
        this.f27979a = context;
        this.f27980b = i10;
    }

    private final EdgeEffect e() {
        EdgeEffect a10 = C2883v.f27978a.a(this.f27979a);
        a10.setColor(this.f27980b);
        if (!r.e(this.f27981c, r.f19235b.a())) {
            a10.setSize(r.g(this.f27981c), r.f(this.f27981c));
        }
        return a10;
    }

    private final boolean n(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    private final boolean x(EdgeEffect edgeEffect) {
        boolean z10 = false;
        if (edgeEffect == null) {
            return false;
        }
        if (C2883v.f27978a.b(edgeEffect) == 0.0f) {
            z10 = true;
        }
        return !z10;
    }

    public final boolean A() {
        return x(this.f27982d);
    }

    public final void B(long j10) {
        this.f27981c = j10;
        EdgeEffect edgeEffect = this.f27982d;
        if (edgeEffect != null) {
            edgeEffect.setSize(r.g(j10), r.f(j10));
        }
        EdgeEffect edgeEffect2 = this.f27983e;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize(r.g(j10), r.f(j10));
        }
        EdgeEffect edgeEffect3 = this.f27984f;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize(r.f(j10), r.g(j10));
        }
        EdgeEffect edgeEffect4 = this.f27985g;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize(r.f(j10), r.g(j10));
        }
        EdgeEffect edgeEffect5 = this.f27986h;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize(r.g(j10), r.f(j10));
        }
        EdgeEffect edgeEffect6 = this.f27987i;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize(r.g(j10), r.f(j10));
        }
        EdgeEffect edgeEffect7 = this.f27988j;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize(r.f(j10), r.g(j10));
        }
        EdgeEffect edgeEffect8 = this.f27989k;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize(r.f(j10), r.g(j10));
        }
    }

    public final EdgeEffect f() {
        EdgeEffect edgeEffect = this.f27983e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e10 = e();
        this.f27983e = e10;
        return e10;
    }

    public final EdgeEffect g() {
        EdgeEffect edgeEffect = this.f27987i;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e10 = e();
        this.f27987i = e10;
        return e10;
    }

    public final EdgeEffect h() {
        EdgeEffect edgeEffect = this.f27984f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e10 = e();
        this.f27984f = e10;
        return e10;
    }

    public final EdgeEffect i() {
        EdgeEffect edgeEffect = this.f27988j;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e10 = e();
        this.f27988j = e10;
        return e10;
    }

    public final EdgeEffect j() {
        EdgeEffect edgeEffect = this.f27985g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e10 = e();
        this.f27985g = e10;
        return e10;
    }

    public final EdgeEffect k() {
        EdgeEffect edgeEffect = this.f27989k;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e10 = e();
        this.f27989k = e10;
        return e10;
    }

    public final EdgeEffect l() {
        EdgeEffect edgeEffect = this.f27982d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e10 = e();
        this.f27982d = e10;
        return e10;
    }

    public final EdgeEffect m() {
        EdgeEffect edgeEffect = this.f27986h;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect e10 = e();
        this.f27986h = e10;
        return e10;
    }

    public final boolean o() {
        return n(this.f27983e);
    }

    public final boolean p() {
        return x(this.f27987i);
    }

    public final boolean q() {
        return x(this.f27983e);
    }

    public final boolean r() {
        return n(this.f27984f);
    }

    public final boolean s() {
        return x(this.f27988j);
    }

    public final boolean t() {
        return x(this.f27984f);
    }

    public final boolean u() {
        return n(this.f27985g);
    }

    public final boolean v() {
        return x(this.f27989k);
    }

    public final boolean w() {
        return x(this.f27985g);
    }

    public final boolean y() {
        return n(this.f27982d);
    }

    public final boolean z() {
        return x(this.f27986h);
    }
}
