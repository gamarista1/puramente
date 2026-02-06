package R6;

import M5.d;
import T5.i;
import V6.n;
import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final d f33717a;

    /* renamed from: b  reason: collision with root package name */
    private final n f33718b;

    /* renamed from: c  reason: collision with root package name */
    private final n.b f33719c = new a();

    /* renamed from: d  reason: collision with root package name */
    private final LinkedHashSet f33720d = new LinkedHashSet();

    class a implements n.b {
        a() {
        }

        /* renamed from: b */
        public void a(d dVar, boolean z10) {
            c.this.f(dVar, z10);
        }
    }

    static class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private final d f33722a;

        /* renamed from: b  reason: collision with root package name */
        private final int f33723b;

        public b(d dVar, int i10) {
            this.f33722a = dVar;
            this.f33723b = i10;
        }

        public String a() {
            return null;
        }

        public boolean b(Uri uri) {
            return this.f33722a.b(uri);
        }

        public boolean c() {
            return false;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f33723b != bVar.f33723b || !this.f33722a.equals(bVar.f33722a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f33722a.hashCode() * 1013) + this.f33723b;
        }

        public String toString() {
            return i.b(this).b("imageCacheKey", this.f33722a).a("frameIndex", this.f33723b).toString();
        }
    }

    public c(d dVar, n nVar) {
        this.f33717a = dVar;
        this.f33718b = nVar;
    }

    private b e(int i10) {
        return new b(this.f33717a, i10);
    }

    private synchronized d g() {
        d dVar;
        Iterator it = this.f33720d.iterator();
        if (it.hasNext()) {
            dVar = (d) it.next();
            it.remove();
        } else {
            dVar = null;
        }
        return dVar;
    }

    public X5.a a(int i10, X5.a aVar) {
        return this.f33718b.f(e(i10), aVar, this.f33719c);
    }

    public boolean b(int i10) {
        return this.f33718b.contains(e(i10));
    }

    public X5.a c(int i10) {
        return this.f33718b.get(e(i10));
    }

    public X5.a d() {
        X5.a e10;
        do {
            d g10 = g();
            if (g10 == null) {
                return null;
            }
            e10 = this.f33718b.e(g10);
        } while (e10 == null);
        return e10;
    }

    public synchronized void f(d dVar, boolean z10) {
        if (z10) {
            try {
                this.f33720d.add(dVar);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        } else {
            this.f33720d.remove(dVar);
        }
    }
}
