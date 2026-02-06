package X5;

import T5.k;
import java.util.IdentityHashMap;
import java.util.Map;

public class i {

    /* renamed from: d  reason: collision with root package name */
    private static final Map f35039d = new IdentityHashMap();

    /* renamed from: a  reason: collision with root package name */
    private Object f35040a;

    /* renamed from: b  reason: collision with root package name */
    private int f35041b = 1;

    /* renamed from: c  reason: collision with root package name */
    private final h f35042c;

    public static class a extends RuntimeException {
        public a() {
            super("Null shared reference");
        }
    }

    public i(Object obj, h hVar, boolean z10) {
        this.f35040a = k.g(obj);
        this.f35042c = hVar;
        if (z10) {
            a(obj);
        }
    }

    private static void a(Object obj) {
        Map map = f35039d;
        synchronized (map) {
            try {
                Integer num = (Integer) map.get(obj);
                if (num == null) {
                    map.put(obj, 1);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() + 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private synchronized int c() {
        boolean z10;
        int i10;
        e();
        if (this.f35041b > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        i10 = this.f35041b - 1;
        this.f35041b = i10;
        return i10;
    }

    private void e() {
        if (!h(this)) {
            throw new a();
        }
    }

    public static boolean h(i iVar) {
        if (iVar == null || !iVar.g()) {
            return false;
        }
        return true;
    }

    private static void i(Object obj) {
        Map map = f35039d;
        synchronized (map) {
            try {
                Integer num = (Integer) map.get(obj);
                if (num == null) {
                    U5.a.O("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                } else if (num.intValue() == 1) {
                    map.remove(obj);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void b() {
        e();
        this.f35041b++;
    }

    public void d() {
        Object obj;
        if (c() == 0) {
            synchronized (this) {
                obj = this.f35040a;
                this.f35040a = null;
            }
            if (obj != null) {
                h hVar = this.f35042c;
                if (hVar != null) {
                    hVar.a(obj);
                }
                i(obj);
            }
        }
    }

    public synchronized Object f() {
        return this.f35040a;
    }

    public synchronized boolean g() {
        boolean z10;
        if (this.f35041b > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }
}
