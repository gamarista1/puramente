package W2;

import W2.s;
import android.util.SparseArray;
import z2.J;
import z2.O;
import z2.r;

public final class u implements r {

    /* renamed from: a  reason: collision with root package name */
    private final r f8671a;

    /* renamed from: b  reason: collision with root package name */
    private final s.a f8672b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray f8673c = new SparseArray();

    public u(r rVar, s.a aVar) {
        this.f8671a = rVar;
        this.f8672b = aVar;
    }

    public void a() {
        for (int i10 = 0; i10 < this.f8673c.size(); i10++) {
            ((w) this.f8673c.valueAt(i10)).k();
        }
    }

    public O d(int i10, int i11) {
        if (i11 != 3) {
            return this.f8671a.d(i10, i11);
        }
        w wVar = (w) this.f8673c.get(i10);
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this.f8671a.d(i10, i11), this.f8672b);
        this.f8673c.put(i10, wVar2);
        return wVar2;
    }

    public void k() {
        this.f8671a.k();
    }

    public void u(J j10) {
        this.f8671a.u(j10);
    }
}
