package Lb;

import com.google.firebase.database.c;
import java.util.HashMap;
import java.util.Map;

public class r {

    /* renamed from: b  reason: collision with root package name */
    private static final r f51883b = new r();

    /* renamed from: a  reason: collision with root package name */
    private final Map f51884a = new HashMap();

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f51885a;

        a(n nVar) {
            this.f51885a = nVar;
        }

        public void run() {
            this.f51885a.O();
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f51886a;

        b(n nVar) {
            this.f51886a = nVar;
        }

        public void run() {
            this.f51886a.d0();
        }
    }

    private n a(C4373g gVar, q qVar, c cVar) {
        n nVar;
        gVar.k();
        String str = "https://" + qVar.f51879a + "/" + qVar.f51881c;
        synchronized (this.f51884a) {
            try {
                if (!this.f51884a.containsKey(gVar)) {
                    this.f51884a.put(gVar, new HashMap());
                }
                Map map = (Map) this.f51884a.get(gVar);
                if (!map.containsKey(str)) {
                    nVar = new n(qVar, gVar, cVar);
                    map.put(str, nVar);
                } else {
                    throw new IllegalStateException("createLocalRepo() called for existing repo.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    public static n b(C4373g gVar, q qVar, c cVar) {
        return f51883b.a(gVar, qVar, cVar);
    }

    public static void c(n nVar) {
        nVar.g0(new a(nVar));
    }

    public static void d(n nVar) {
        nVar.g0(new b(nVar));
    }
}
