package Mg;

import kotlin.jvm.internal.C6496s;

public abstract class e extends C5480a {

    /* renamed from: a  reason: collision with root package name */
    private c f64144a;

    protected e(c cVar) {
        C6496s.h(cVar, "arrayMap");
        this.f64144a = cVar;
    }

    /* access modifiers changed from: protected */
    public final c a() {
        return this.f64144a;
    }

    /* access modifiers changed from: protected */
    public final void k(String str, Object obj) {
        C6496s.h(str, "keyQualifiedName");
        C6496s.h(obj, "value");
        int e10 = b().e(str);
        int a10 = this.f64144a.a();
        if (a10 != 0) {
            if (a10 == 1) {
                c cVar = this.f64144a;
                C6496s.f(cVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                o oVar = (o) cVar;
                if (oVar.g() == e10) {
                    this.f64144a = new o(obj, e10);
                    return;
                }
                d dVar = new d();
                this.f64144a = dVar;
                dVar.b(oVar.g(), oVar.getValue());
            }
            this.f64144a.b(e10, obj);
            return;
        }
        this.f64144a = new o(obj, e10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e() {
        /*
            r2 = this;
            Mg.i r0 = Mg.i.f64157a
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>"
            kotlin.jvm.internal.C6496s.f(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Mg.e.<init>():void");
    }
}
