package Ib;

import Ib.c;
import Ib.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class k extends c {

    /* renamed from: a  reason: collision with root package name */
    private h f51151a;

    /* renamed from: b  reason: collision with root package name */
    private Comparator f51152b;

    public static k t(List list, Map map, c.a.C0782a aVar, Comparator comparator) {
        return b.b(list, map, aVar, comparator);
    }

    public static k v(Map map, Comparator comparator) {
        return b.b(new ArrayList(map.keySet()), map, c.a.e(), comparator);
    }

    private h x(Object obj) {
        h hVar = this.f51151a;
        while (!hVar.isEmpty()) {
            int compare = this.f51152b.compare(obj, hVar.getKey());
            if (compare < 0) {
                hVar = hVar.b();
            } else if (compare == 0) {
                return hVar;
            } else {
                hVar = hVar.o();
            }
        }
        return null;
    }

    public boolean a(Object obj) {
        if (x(obj) != null) {
            return true;
        }
        return false;
    }

    public Object b(Object obj) {
        h x10 = x(obj);
        if (x10 != null) {
            return x10.getValue();
        }
        return null;
    }

    public Comparator d() {
        return this.f51152b;
    }

    public Object g() {
        return this.f51151a.v().getKey();
    }

    public Object h() {
        return this.f51151a.u().getKey();
    }

    public boolean isEmpty() {
        return this.f51151a.isEmpty();
    }

    public Iterator iterator() {
        return new d(this.f51151a, (Object) null, this.f51152b, false);
    }

    public Object k(Object obj) {
        h hVar = this.f51151a;
        h hVar2 = null;
        while (!hVar.isEmpty()) {
            int compare = this.f51152b.compare(obj, hVar.getKey());
            if (compare == 0) {
                if (!hVar.b().isEmpty()) {
                    h b10 = hVar.b();
                    while (!b10.o().isEmpty()) {
                        b10 = b10.o();
                    }
                    return b10.getKey();
                } else if (hVar2 != null) {
                    return hVar2.getKey();
                } else {
                    return null;
                }
            } else if (compare < 0) {
                hVar = hVar.b();
            } else {
                hVar2 = hVar;
                hVar = hVar.o();
            }
        }
        throw new IllegalArgumentException("Couldn't find predecessor key of non-present key: " + obj);
    }

    public void m(h.b bVar) {
        this.f51151a.t(bVar);
    }

    public Iterator m0() {
        return new d(this.f51151a, (Object) null, this.f51152b, true);
    }

    public c n(Object obj, Object obj2) {
        return new k(this.f51151a.r(obj, obj2, this.f51152b).p((Object) null, (Object) null, h.a.BLACK, (h) null, (h) null), this.f51152b);
    }

    public c r(Object obj) {
        if (!a(obj)) {
            return this;
        }
        return new k(this.f51151a.s(obj, this.f51152b).p((Object) null, (Object) null, h.a.BLACK, (h) null, (h) null), this.f51152b);
    }

    public int size() {
        return this.f51151a.size();
    }

    private k(h hVar, Comparator comparator) {
        this.f51151a = hVar;
        this.f51152b = comparator;
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final List f51153a;

        /* renamed from: b  reason: collision with root package name */
        private final Map f51154b;

        /* renamed from: c  reason: collision with root package name */
        private final c.a.C0782a f51155c;

        /* renamed from: d  reason: collision with root package name */
        private j f51156d;

        /* renamed from: e  reason: collision with root package name */
        private j f51157e;

        /* renamed from: Ib.k$b$b  reason: collision with other inner class name */
        static class C0784b {

            /* renamed from: a  reason: collision with root package name */
            public boolean f51162a;

            /* renamed from: b  reason: collision with root package name */
            public int f51163b;

            C0784b() {
            }
        }

        private b(List list, Map map, c.a.C0782a aVar) {
            this.f51153a = list;
            this.f51154b = map;
            this.f51155c = aVar;
        }

        private h a(int i10, int i11) {
            if (i11 == 0) {
                return g.a();
            }
            if (i11 == 1) {
                Object obj = this.f51153a.get(i10);
                return new f(obj, d(obj), (h) null, (h) null);
            }
            int i12 = i11 / 2;
            int i13 = i10 + i12;
            h a10 = a(i10, i12);
            h a11 = a(i13 + 1, i12);
            Object obj2 = this.f51153a.get(i13);
            return new f(obj2, d(obj2), a10, a11);
        }

        public static k b(List list, Map map, c.a.C0782a aVar, Comparator comparator) {
            b bVar = new b(list, map, aVar);
            Collections.sort(list, comparator);
            Iterator it = new a(list.size()).iterator();
            int size = list.size();
            while (it.hasNext()) {
                C0784b bVar2 = (C0784b) it.next();
                int i10 = bVar2.f51163b;
                size -= i10;
                if (bVar2.f51162a) {
                    bVar.c(h.a.BLACK, i10, size);
                } else {
                    bVar.c(h.a.BLACK, i10, size);
                    int i11 = bVar2.f51163b;
                    size -= i11;
                    bVar.c(h.a.RED, i11, size);
                }
            }
            h hVar = bVar.f51156d;
            if (hVar == null) {
                hVar = g.a();
            }
            return new k(hVar, comparator);
        }

        private void c(h.a aVar, int i10, int i11) {
            j jVar;
            h a10 = a(i11 + 1, i10 - 1);
            Object obj = this.f51153a.get(i11);
            if (aVar == h.a.RED) {
                jVar = new i(obj, d(obj), (h) null, a10);
            } else {
                jVar = new f(obj, d(obj), (h) null, a10);
            }
            if (this.f51156d == null) {
                this.f51156d = jVar;
                this.f51157e = jVar;
                return;
            }
            this.f51157e.m(jVar);
            this.f51157e = jVar;
        }

        private Object d(Object obj) {
            return this.f51154b.get(this.f51155c.a(obj));
        }

        static class a implements Iterable {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public long f51158a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public final int f51159b;

            public a(int i10) {
                int i11 = i10 + 1;
                int floor = (int) Math.floor(Math.log((double) i11) / Math.log(2.0d));
                this.f51159b = floor;
                this.f51158a = (((long) Math.pow(2.0d, (double) floor)) - 1) & ((long) i11);
            }

            public Iterator iterator() {
                return new C0783a();
            }

            /* renamed from: Ib.k$b$a$a  reason: collision with other inner class name */
            class C0783a implements Iterator {

                /* renamed from: a  reason: collision with root package name */
                private int f51160a;

                C0783a() {
                    this.f51160a = a.this.f51159b - 1;
                }

                /* renamed from: a */
                public C0784b next() {
                    boolean z10;
                    C0784b bVar = new C0784b();
                    if ((a.this.f51158a & ((long) (1 << this.f51160a))) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bVar.f51162a = z10;
                    bVar.f51163b = (int) Math.pow(2.0d, (double) this.f51160a);
                    this.f51160a--;
                    return bVar;
                }

                public boolean hasNext() {
                    if (this.f51160a >= 0) {
                        return true;
                    }
                    return false;
                }

                public void remove() {
                }
            }
        }
    }
}
