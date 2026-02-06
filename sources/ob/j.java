package Ob;

import Lb.l;
import java.util.Map;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private Tb.b f52119a;

    /* renamed from: b  reason: collision with root package name */
    private j f52120b;

    /* renamed from: c  reason: collision with root package name */
    private k f52121c;

    class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f52122a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f52123b;

        a(c cVar, boolean z10) {
            this.f52122a = cVar;
            this.f52123b = z10;
        }

        public void a(j jVar) {
            jVar.e(this.f52122a, true, this.f52123b);
        }
    }

    public interface b {
        boolean a(j jVar);
    }

    public interface c {
        void a(j jVar);
    }

    public j(Tb.b bVar, j jVar, k kVar) {
        this.f52119a = bVar;
        this.f52120b = jVar;
        this.f52121c = kVar;
    }

    private void m(Tb.b bVar, j jVar) {
        boolean i10 = jVar.i();
        boolean containsKey = this.f52121c.f52125a.containsKey(bVar);
        if (i10 && containsKey) {
            this.f52121c.f52125a.remove(bVar);
            n();
        } else if (!i10 && !containsKey) {
            this.f52121c.f52125a.put(bVar, jVar.f52121c);
            n();
        }
    }

    private void n() {
        j jVar = this.f52120b;
        if (jVar != null) {
            jVar.m(this.f52119a, this);
        }
    }

    public boolean a(b bVar) {
        return b(bVar, false);
    }

    public boolean b(b bVar, boolean z10) {
        j jVar;
        if (z10) {
            jVar = this;
        } else {
            jVar = this.f52120b;
        }
        while (jVar != null) {
            if (bVar.a(jVar)) {
                return true;
            }
            jVar = jVar.f52120b;
        }
        return false;
    }

    public void c(c cVar) {
        Object[] array = this.f52121c.f52125a.entrySet().toArray();
        for (Object obj : array) {
            Map.Entry entry = (Map.Entry) obj;
            cVar.a(new j((Tb.b) entry.getKey(), this, (k) entry.getValue()));
        }
    }

    public void d(c cVar) {
        e(cVar, false, false);
    }

    public void e(c cVar, boolean z10, boolean z11) {
        if (z10 && !z11) {
            cVar.a(this);
        }
        c(new a(cVar, z11));
        if (z10 && z11) {
            cVar.a(this);
        }
    }

    public l f() {
        boolean z10;
        if (this.f52120b != null) {
            if (this.f52119a != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            l.f(z10);
            return this.f52120b.f().x(this.f52119a);
        } else if (this.f52119a != null) {
            return new l(this.f52119a);
        } else {
            return l.D();
        }
    }

    public Object g() {
        return this.f52121c.f52126b;
    }

    public boolean h() {
        return !this.f52121c.f52125a.isEmpty();
    }

    public boolean i() {
        k kVar = this.f52121c;
        if (kVar.f52126b != null || !kVar.f52125a.isEmpty()) {
            return false;
        }
        return true;
    }

    public void j(Object obj) {
        this.f52121c.f52126b = obj;
        n();
    }

    public j k(l lVar) {
        k kVar;
        Tb.b E10 = lVar.E();
        j jVar = this;
        while (E10 != null) {
            if (jVar.f52121c.f52125a.containsKey(E10)) {
                kVar = (k) jVar.f52121c.f52125a.get(E10);
            } else {
                kVar = new k();
            }
            j jVar2 = new j(E10, jVar, kVar);
            lVar = lVar.N();
            E10 = lVar.E();
            jVar = jVar2;
        }
        return jVar;
    }

    /* access modifiers changed from: package-private */
    public String l(String str) {
        String str2;
        Tb.b bVar = this.f52119a;
        if (bVar == null) {
            str2 = "<anon>";
        } else {
            str2 = bVar.b();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append("\n");
        k kVar = this.f52121c;
        sb2.append(kVar.a(str + "\t"));
        return sb2.toString();
    }

    public String toString() {
        return l("");
    }

    public j() {
        this((Tb.b) null, (j) null, new k());
    }
}
