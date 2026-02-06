package ia;

import ja.C3645a;
import ja.M;
import java.util.ArrayList;

/* renamed from: ia.f  reason: case insensitive filesystem */
public abstract class C3608f implements C3612j {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f44435a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList f44436b = new ArrayList(1);

    /* renamed from: c  reason: collision with root package name */
    private int f44437c;

    /* renamed from: d  reason: collision with root package name */
    private n f44438d;

    protected C3608f(boolean z10) {
        this.f44435a = z10;
    }

    public final void n(J j10) {
        C3645a.e(j10);
        if (!this.f44436b.contains(j10)) {
            this.f44436b.add(j10);
            this.f44437c++;
        }
    }

    /* access modifiers changed from: protected */
    public final void o(int i10) {
        n nVar = (n) M.j(this.f44438d);
        for (int i11 = 0; i11 < this.f44437c; i11++) {
            ((J) this.f44436b.get(i11)).e(this, nVar, this.f44435a, i10);
        }
    }

    /* access modifiers changed from: protected */
    public final void p() {
        n nVar = (n) M.j(this.f44438d);
        for (int i10 = 0; i10 < this.f44437c; i10++) {
            ((J) this.f44436b.get(i10)).d(this, nVar, this.f44435a);
        }
        this.f44438d = null;
    }

    /* access modifiers changed from: protected */
    public final void q(n nVar) {
        for (int i10 = 0; i10 < this.f44437c; i10++) {
            ((J) this.f44436b.get(i10)).i(this, nVar, this.f44435a);
        }
    }

    /* access modifiers changed from: protected */
    public final void r(n nVar) {
        this.f44438d = nVar;
        for (int i10 = 0; i10 < this.f44437c; i10++) {
            ((J) this.f44436b.get(i10)).b(this, nVar, this.f44435a);
        }
    }
}
