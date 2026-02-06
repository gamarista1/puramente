package k2;

import i2.C2076a;
import i2.L;
import java.util.ArrayList;

/* renamed from: k2.b  reason: case insensitive filesystem */
public abstract class C2147b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f23173a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList f23174b = new ArrayList(1);

    /* renamed from: c  reason: collision with root package name */
    private int f23175c;

    /* renamed from: d  reason: collision with root package name */
    private j f23176d;

    protected C2147b(boolean z10) {
        this.f23173a = z10;
    }

    public final void n(x xVar) {
        C2076a.e(xVar);
        if (!this.f23174b.contains(xVar)) {
            this.f23174b.add(xVar);
            this.f23175c++;
        }
    }

    /* access modifiers changed from: protected */
    public final void o(int i10) {
        j jVar = (j) L.h(this.f23176d);
        for (int i11 = 0; i11 < this.f23175c; i11++) {
            ((x) this.f23174b.get(i11)).b(this, jVar, this.f23173a, i10);
        }
    }

    /* access modifiers changed from: protected */
    public final void p() {
        j jVar = (j) L.h(this.f23176d);
        for (int i10 = 0; i10 < this.f23175c; i10++) {
            ((x) this.f23174b.get(i10)).g(this, jVar, this.f23173a);
        }
        this.f23176d = null;
    }

    /* access modifiers changed from: protected */
    public final void q(j jVar) {
        for (int i10 = 0; i10 < this.f23175c; i10++) {
            ((x) this.f23174b.get(i10)).e(this, jVar, this.f23173a);
        }
    }

    /* access modifiers changed from: protected */
    public final void r(j jVar) {
        this.f23176d = jVar;
        for (int i10 = 0; i10 < this.f23175c; i10++) {
            ((x) this.f23174b.get(i10)).f(this, jVar, this.f23173a);
        }
    }
}
