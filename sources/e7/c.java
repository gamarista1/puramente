package e7;

import U5.a;
import i7.C3593b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class c implements e {

    /* renamed from: a  reason: collision with root package name */
    private final List f43351a;

    public c(Set set) {
        this.f43351a = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar != null) {
                this.f43351a.add(eVar);
            }
        }
    }

    private void l(String str, Throwable th2) {
        a.n("ForwardingRequestListener", str, th2);
    }

    public void a(String str, String str2) {
        int size = this.f43351a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f43351a.get(i10)).a(str, str2);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerStart", e10);
            }
        }
    }

    public void b(C3593b bVar, String str, boolean z10) {
        int size = this.f43351a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f43351a.get(i10)).b(bVar, str, z10);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestSuccess", e10);
            }
        }
    }

    public void c(C3593b bVar, Object obj, String str, boolean z10) {
        int size = this.f43351a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f43351a.get(i10)).c(bVar, obj, str, z10);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestStart", e10);
            }
        }
    }

    public boolean d(String str) {
        int size = this.f43351a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((e) this.f43351a.get(i10)).d(str)) {
                return true;
            }
        }
        return false;
    }

    public void e(String str, String str2, Map map) {
        int size = this.f43351a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f43351a.get(i10)).e(str, str2, map);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    public void f(String str, String str2, Throwable th2, Map map) {
        int size = this.f43351a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f43351a.get(i10)).f(str, str2, th2, map);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithFailure", e10);
            }
        }
    }

    public void g(String str, String str2, Map map) {
        int size = this.f43351a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f43351a.get(i10)).g(str, str2, map);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithCancellation", e10);
            }
        }
    }

    public void h(String str, String str2, boolean z10) {
        int size = this.f43351a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f43351a.get(i10)).h(str, str2, z10);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    public void i(String str, String str2, String str3) {
        int size = this.f43351a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f43351a.get(i10)).i(str, str2, str3);
            } catch (Exception e10) {
                l("InternalListener exception in onIntermediateChunkStart", e10);
            }
        }
    }

    public void j(C3593b bVar, String str, Throwable th2, boolean z10) {
        int size = this.f43351a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f43351a.get(i10)).j(bVar, str, th2, z10);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestFailure", e10);
            }
        }
    }

    public void k(String str) {
        int size = this.f43351a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f43351a.get(i10)).k(str);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestCancellation", e10);
            }
        }
    }

    public c(e... eVarArr) {
        this.f43351a = new ArrayList(eVarArr.length);
        for (e eVar : eVarArr) {
            if (eVar != null) {
                this.f43351a.add(eVar);
            }
        }
    }
}
