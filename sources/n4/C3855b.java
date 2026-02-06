package n4;

import j4.C3619f;
import j4.C3623j;
import j4.C3631r;
import lf.C6535s;
import n4.C3856c;

/* renamed from: n4.b  reason: case insensitive filesystem */
public final class C3855b implements C3856c {

    /* renamed from: a  reason: collision with root package name */
    private final C3857d f46854a;

    /* renamed from: b  reason: collision with root package name */
    private final C3623j f46855b;

    /* renamed from: n4.b$a */
    public static final class a implements C3856c.a {
        public C3856c a(C3857d dVar, C3623j jVar) {
            return new C3855b(dVar, jVar);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }
    }

    public C3855b(C3857d dVar, C3623j jVar) {
        this.f46854a = dVar;
        this.f46855b = jVar;
    }

    public void a() {
        C3623j jVar = this.f46855b;
        if (jVar instanceof C3631r) {
            this.f46854a.onSuccess(((C3631r) jVar).a());
        } else if (jVar instanceof C3619f) {
            this.f46854a.onError(((C3619f) jVar).a());
        } else {
            throw new C6535s();
        }
    }
}
