package I0;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class a extends g {

    /* renamed from: a  reason: collision with root package name */
    private j f2671a;

    public a(j jVar) {
        super((DefaultConstructorMarker) null);
        this.f2671a = jVar;
    }

    public boolean a(c cVar) {
        if (cVar == this.f2671a.getKey()) {
            return true;
        }
        return false;
    }

    public Object b(c cVar) {
        boolean z10;
        if (cVar == this.f2671a.getKey()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            G0.a.b("Check failed.");
        }
        return this.f2671a.getValue();
    }

    public final void c(j jVar) {
        this.f2671a = jVar;
    }
}
