package Z4;

import T4.i;
import Z4.n;
import com.bumptech.glide.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o5.k;
import x1.e;

public class r {

    /* renamed from: e  reason: collision with root package name */
    private static final c f35918e = new c();

    /* renamed from: f  reason: collision with root package name */
    private static final n f35919f = new a();

    /* renamed from: a  reason: collision with root package name */
    private final List f35920a;

    /* renamed from: b  reason: collision with root package name */
    private final c f35921b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f35922c;

    /* renamed from: d  reason: collision with root package name */
    private final e f35923d;

    private static class a implements n {
        a() {
        }

        public n.a a(Object obj, int i10, int i11, i iVar) {
            return null;
        }

        public boolean b(Object obj) {
            return false;
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Class f35924a;

        /* renamed from: b  reason: collision with root package name */
        final Class f35925b;

        /* renamed from: c  reason: collision with root package name */
        final o f35926c;

        public b(Class cls, Class cls2, o oVar) {
            this.f35924a = cls;
            this.f35925b = cls2;
            this.f35926c = oVar;
        }

        public boolean a(Class cls) {
            return this.f35924a.isAssignableFrom(cls);
        }

        public boolean b(Class cls, Class cls2) {
            if (!a(cls) || !this.f35925b.isAssignableFrom(cls2)) {
                return false;
            }
            return true;
        }
    }

    static class c {
        c() {
        }

        public q a(List list, e eVar) {
            return new q(list, eVar);
        }
    }

    public r(e eVar) {
        this(eVar, f35918e);
    }

    private void a(Class cls, Class cls2, o oVar, boolean z10) {
        int i10;
        b bVar = new b(cls, cls2, oVar);
        List list = this.f35920a;
        if (z10) {
            i10 = list.size();
        } else {
            i10 = 0;
        }
        list.add(i10, bVar);
    }

    private n c(b bVar) {
        return (n) k.d(bVar.f35926c.c(this));
    }

    private static n f() {
        return f35919f;
    }

    private o h(b bVar) {
        return bVar.f35926c;
    }

    /* access modifiers changed from: package-private */
    public synchronized void b(Class cls, Class cls2, o oVar) {
        a(cls, cls2, oVar, true);
    }

    public synchronized n d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b bVar : this.f35920a) {
                if (this.f35922c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f35922c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f35922c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f35921b.a(arrayList, this.f35923d);
            } else if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            } else if (z10) {
                return f();
            } else {
                throw new j.c(cls, cls2);
            }
        } catch (Throwable th2) {
            this.f35922c.clear();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized List e(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f35920a) {
                if (!this.f35922c.contains(bVar)) {
                    if (bVar.a(cls)) {
                        this.f35922c.add(bVar);
                        arrayList.add(c(bVar));
                        this.f35922c.remove(bVar);
                    }
                }
            }
        } catch (Throwable th2) {
            this.f35922c.clear();
            throw th2;
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public synchronized List g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f35920a) {
            if (!arrayList.contains(bVar.f35925b) && bVar.a(cls)) {
                arrayList.add(bVar.f35925b);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public synchronized List i(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f35920a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.b(cls, cls2)) {
                it.remove();
                arrayList.add(h(bVar));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public synchronized List j(Class cls, Class cls2, o oVar) {
        List i10;
        i10 = i(cls, cls2);
        b(cls, cls2, oVar);
        return i10;
    }

    r(e eVar, c cVar) {
        this.f35920a = new ArrayList();
        this.f35922c = new HashSet();
        this.f35923d = eVar;
        this.f35921b = cVar;
    }
}
