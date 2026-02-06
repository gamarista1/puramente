package Eb;

import ic.C5026a;
import ic.C5027b;

class C implements C5027b, C5026a {

    /* renamed from: c  reason: collision with root package name */
    private static final C5026a.C0893a f50676c = new z();

    /* renamed from: d  reason: collision with root package name */
    private static final C5027b f50677d = new A();

    /* renamed from: a  reason: collision with root package name */
    private C5026a.C0893a f50678a;

    /* renamed from: b  reason: collision with root package name */
    private volatile C5027b f50679b;

    private C(C5026a.C0893a aVar, C5027b bVar) {
        this.f50678a = aVar;
        this.f50679b = bVar;
    }

    static C e() {
        return new C(f50676c, f50677d);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void h(C5026a.C0893a aVar, C5026a.C0893a aVar2, C5027b bVar) {
        aVar.a(bVar);
        aVar2.a(bVar);
    }

    static C i(C5027b bVar) {
        return new C((C5026a.C0893a) null, bVar);
    }

    public void a(C5026a.C0893a aVar) {
        C5027b bVar;
        C5027b bVar2;
        C5027b bVar3 = this.f50679b;
        C5027b bVar4 = f50677d;
        if (bVar3 != bVar4) {
            aVar.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f50679b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                this.f50678a = new B(this.f50678a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.a(bVar);
        }
    }

    public Object get() {
        return this.f50679b.get();
    }

    /* access modifiers changed from: package-private */
    public void j(C5027b bVar) {
        C5026a.C0893a aVar;
        if (this.f50679b == f50677d) {
            synchronized (this) {
                aVar = this.f50678a;
                this.f50678a = null;
                this.f50679b = bVar;
            }
            aVar.a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f(C5027b bVar) {
    }
}
