package ga;

import N9.C3070t;
import N9.V;
import ia.C3607e;
import ja.C3645a;
import k9.b1;
import k9.n1;
import m9.C3847e;

public abstract class A {

    /* renamed from: a  reason: collision with root package name */
    private a f43756a;

    /* renamed from: b  reason: collision with root package name */
    private C3607e f43757b;

    public interface a {
        void a();
    }

    /* access modifiers changed from: protected */
    public final C3607e a() {
        return (C3607e) C3645a.h(this.f43757b);
    }

    public void b(a aVar, C3607e eVar) {
        this.f43756a = aVar;
        this.f43757b = eVar;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        a aVar = this.f43756a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public abstract boolean d();

    public abstract void e(Object obj);

    public void f() {
        this.f43756a = null;
        this.f43757b = null;
    }

    public abstract B g(b1[] b1VarArr, V v10, C3070t.b bVar, n1 n1Var);

    public abstract void h(C3847e eVar);
}
