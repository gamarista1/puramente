package zc;

import W8.c;
import W8.d;
import W8.h;
import W8.i;
import ic.C5027b;
import uc.C5233a;

/* renamed from: zc.b  reason: case insensitive filesystem */
final class C5304b {

    /* renamed from: d  reason: collision with root package name */
    private static final C5233a f62363d = C5233a.e();

    /* renamed from: a  reason: collision with root package name */
    private final String f62364a;

    /* renamed from: b  reason: collision with root package name */
    private final C5027b f62365b;

    /* renamed from: c  reason: collision with root package name */
    private h f62366c;

    C5304b(C5027b bVar, String str) {
        this.f62364a = str;
        this.f62365b = bVar;
    }

    private boolean a() {
        if (this.f62366c == null) {
            i iVar = (i) this.f62365b.get();
            if (iVar != null) {
                this.f62366c = iVar.a(this.f62364a, Bc.i.class, c.b("proto"), new C5303a());
            } else {
                f62363d.j("Flg TransportFactory is not available at the moment");
            }
        }
        if (this.f62366c != null) {
            return true;
        }
        return false;
    }

    public void b(Bc.i iVar) {
        if (!a()) {
            f62363d.j("Unable to dispatch event because Flg Transport is not available");
        } else {
            this.f62366c.a(d.e(iVar));
        }
    }
}
