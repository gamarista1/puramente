package Of;

import Eg.n;
import Fg.C5366d0;
import Fg.N0;
import Fg.v0;
import Pf.h;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import ng.f;

/* renamed from: Of.c  reason: case insensitive filesystem */
final class C5485c implements m0 {

    /* renamed from: a  reason: collision with root package name */
    private final m0 f64476a;

    /* renamed from: b  reason: collision with root package name */
    private final C5495m f64477b;

    /* renamed from: c  reason: collision with root package name */
    private final int f64478c;

    public C5485c(m0 m0Var, C5495m mVar, int i10) {
        C6496s.h(m0Var, "originalDescriptor");
        C6496s.h(mVar, "declarationDescriptor");
        this.f64476a = m0Var;
        this.f64477b = mVar;
        this.f64478c = i10;
    }

    public n N() {
        n N10 = this.f64476a.N();
        C6496s.g(N10, "getStorageManager(...)");
        return N10;
    }

    public boolean R() {
        return true;
    }

    public Object U(C5497o oVar, Object obj) {
        return this.f64476a.U(oVar, obj);
    }

    public C5495m b() {
        return this.f64477b;
    }

    public h getAnnotations() {
        return this.f64476a.getAnnotations();
    }

    public int getIndex() {
        return this.f64478c + this.f64476a.getIndex();
    }

    public f getName() {
        f name = this.f64476a.getName();
        C6496s.g(name, "getName(...)");
        return name;
    }

    public List getUpperBounds() {
        List upperBounds = this.f64476a.getUpperBounds();
        C6496s.g(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    public h0 i() {
        h0 i10 = this.f64476a.i();
        C6496s.g(i10, "getSource(...)");
        return i10;
    }

    public v0 l() {
        v0 l10 = this.f64476a.l();
        C6496s.g(l10, "getTypeConstructor(...)");
        return l10;
    }

    public N0 n() {
        N0 n10 = this.f64476a.n();
        C6496s.g(n10, "getVariance(...)");
        return n10;
    }

    public C5366d0 p() {
        C5366d0 p10 = this.f64476a.p();
        C6496s.g(p10, "getDefaultType(...)");
        return p10;
    }

    public String toString() {
        return this.f64476a + "[inner-copy]";
    }

    public boolean x() {
        return this.f64476a.x();
    }

    public m0 a() {
        m0 a10 = this.f64476a.a();
        C6496s.g(a10, "getOriginal(...)");
        return a10;
    }
}
