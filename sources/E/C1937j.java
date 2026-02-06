package e;

import Ug.K;
import Wg.h;
import androidx.activity.C1546b;
import androidx.activity.G;
import yf.p;

/* renamed from: e.j  reason: case insensitive filesystem */
final class C1937j extends G {

    /* renamed from: d  reason: collision with root package name */
    private K f19509d;

    /* renamed from: e  reason: collision with root package name */
    private p f19510e;

    /* renamed from: f  reason: collision with root package name */
    private C1936i f19511f;

    public C1937j(boolean z10, K k10, p pVar) {
        super(z10);
        this.f19509d = k10;
        this.f19510e = pVar;
    }

    public void c() {
        super.c();
        C1936i iVar = this.f19511f;
        if (iVar != null) {
            iVar.a();
        }
        C1936i iVar2 = this.f19511f;
        if (iVar2 != null) {
            iVar2.f(false);
        }
    }

    public void d() {
        C1936i iVar = this.f19511f;
        if (iVar != null && !iVar.d()) {
            iVar.a();
            this.f19511f = null;
        }
        if (this.f19511f == null) {
            this.f19511f = new C1936i(this.f19509d, false, this.f19510e, this);
        }
        C1936i iVar2 = this.f19511f;
        if (iVar2 != null) {
            iVar2.b();
        }
        C1936i iVar3 = this.f19511f;
        if (iVar3 != null) {
            iVar3.f(false);
        }
    }

    public void e(C1546b bVar) {
        super.e(bVar);
        C1936i iVar = this.f19511f;
        if (iVar != null) {
            h.b(iVar.e(bVar));
        }
    }

    public void f(C1546b bVar) {
        super.f(bVar);
        C1936i iVar = this.f19511f;
        if (iVar != null) {
            iVar.a();
        }
        if (g()) {
            this.f19511f = new C1936i(this.f19509d, true, this.f19510e, this);
        }
    }

    public final void l(p pVar) {
        this.f19510e = pVar;
    }

    public final void m(boolean z10) {
        C1936i iVar;
        if (!z10 && g() && (iVar = this.f19511f) != null) {
            iVar.a();
        }
        j(z10);
    }

    public final void n(K k10) {
        this.f19509d = k10;
    }
}
