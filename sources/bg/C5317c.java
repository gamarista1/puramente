package Bg;

import Eg.h;
import Eg.n;
import Of.H;
import Of.N;
import Of.U;
import Pg.a;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.Y;
import ng.c;
import yf.C6798l;

/* renamed from: Bg.c  reason: case insensitive filesystem */
public abstract class C5317c implements U {

    /* renamed from: a  reason: collision with root package name */
    private final n f62517a;

    /* renamed from: b  reason: collision with root package name */
    private final A f62518b;

    /* renamed from: c  reason: collision with root package name */
    private final H f62519c;

    /* renamed from: d  reason: collision with root package name */
    protected C5328n f62520d;

    /* renamed from: e  reason: collision with root package name */
    private final h f62521e;

    public C5317c(n nVar, A a10, H h10) {
        C6496s.h(nVar, "storageManager");
        C6496s.h(a10, "finder");
        C6496s.h(h10, "moduleDescriptor");
        this.f62517a = nVar;
        this.f62518b = a10;
        this.f62519c = h10;
        this.f62521e = nVar.c(new C5316b(this));
    }

    /* access modifiers changed from: private */
    public static final N f(C5317c cVar, c cVar2) {
        C6496s.h(cVar2, "fqName");
        r e10 = cVar.e(cVar2);
        if (e10 == null) {
            return null;
        }
        e10.L0(cVar.g());
        return e10;
    }

    public List a(c cVar) {
        C6496s.h(cVar, "fqName");
        return C6565s.r(this.f62521e.invoke(cVar));
    }

    public void b(c cVar, Collection collection) {
        C6496s.h(cVar, "fqName");
        C6496s.h(collection, "packageFragments");
        a.a(collection, this.f62521e.invoke(cVar));
    }

    public boolean c(c cVar) {
        Object obj;
        C6496s.h(cVar, "fqName");
        if (this.f62521e.n(cVar)) {
            obj = (N) this.f62521e.invoke(cVar);
        } else {
            obj = e(cVar);
        }
        if (obj == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract r e(c cVar);

    /* access modifiers changed from: protected */
    public final C5328n g() {
        C5328n nVar = this.f62520d;
        if (nVar != null) {
            return nVar;
        }
        C6496s.v("components");
        return null;
    }

    /* access modifiers changed from: protected */
    public final A h() {
        return this.f62518b;
    }

    /* access modifiers changed from: protected */
    public final H i() {
        return this.f62519c;
    }

    /* access modifiers changed from: protected */
    public final n j() {
        return this.f62517a;
    }

    /* access modifiers changed from: protected */
    public final void k(C5328n nVar) {
        C6496s.h(nVar, "<set-?>");
        this.f62520d = nVar;
    }

    public Collection s(c cVar, C6798l lVar) {
        C6496s.h(cVar, "fqName");
        C6496s.h(lVar, "nameFilter");
        return Y.e();
    }
}
