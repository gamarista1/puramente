package W4;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import o5.k;

public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    private final g f34820a = new g();

    /* renamed from: b  reason: collision with root package name */
    private final b f34821b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final Map f34822c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map f34823d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final int f34824e;

    /* renamed from: f  reason: collision with root package name */
    private int f34825f;

    private static final class a implements l {

        /* renamed from: a  reason: collision with root package name */
        private final b f34826a;

        /* renamed from: b  reason: collision with root package name */
        int f34827b;

        /* renamed from: c  reason: collision with root package name */
        private Class f34828c;

        a(b bVar) {
            this.f34826a = bVar;
        }

        public void a() {
            this.f34826a.c(this);
        }

        /* access modifiers changed from: package-private */
        public void b(int i10, Class cls) {
            this.f34827b = i10;
            this.f34828c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f34827b == aVar.f34827b && this.f34828c == aVar.f34828c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int i11 = this.f34827b * 31;
            Class cls = this.f34828c;
            if (cls != null) {
                i10 = cls.hashCode();
            } else {
                i10 = 0;
            }
            return i11 + i10;
        }

        public String toString() {
            return "Key{size=" + this.f34827b + "array=" + this.f34828c + '}';
        }
    }

    private static final class b extends c {
        b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        /* access modifiers changed from: package-private */
        public a e(int i10, Class cls) {
            a aVar = (a) b();
            aVar.b(i10, cls);
            return aVar;
        }
    }

    public i(int i10) {
        this.f34824e = i10;
    }

    private void g(int i10, Class cls) {
        NavigableMap n10 = n(cls);
        Integer num = (Integer) n10.get(Integer.valueOf(i10));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
        } else if (num.intValue() == 1) {
            n10.remove(Integer.valueOf(i10));
        } else {
            n10.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
        }
    }

    private void h() {
        i(this.f34824e);
    }

    private void i(int i10) {
        while (this.f34825f > i10) {
            Object f10 = this.f34820a.f();
            k.d(f10);
            a j10 = j(f10);
            this.f34825f -= j10.o(f10) * j10.n();
            g(j10.o(f10), f10.getClass());
            if (Log.isLoggable(j10.m(), 2)) {
                Log.v(j10.m(), "evicted: " + j10.o(f10));
            }
        }
    }

    private a j(Object obj) {
        return k(obj.getClass());
    }

    private a k(Class cls) {
        a aVar = (a) this.f34823d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new h();
            } else if (cls.equals(byte[].class)) {
                aVar = new f();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f34823d.put(cls, aVar);
        }
        return aVar;
    }

    private Object l(a aVar) {
        return this.f34820a.a(aVar);
    }

    private Object m(a aVar, Class cls) {
        a k10 = k(cls);
        Object l10 = l(aVar);
        if (l10 != null) {
            this.f34825f -= k10.o(l10) * k10.n();
            g(k10.o(l10), cls);
        }
        if (l10 != null) {
            return l10;
        }
        if (Log.isLoggable(k10.m(), 2)) {
            Log.v(k10.m(), "Allocated " + aVar.f34827b + " bytes");
        }
        return k10.newArray(aVar.f34827b);
    }

    private NavigableMap n(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f34822c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f34822c.put(cls, treeMap);
        return treeMap;
    }

    private boolean o() {
        int i10 = this.f34825f;
        if (i10 == 0 || this.f34824e / i10 >= 2) {
            return true;
        }
        return false;
    }

    private boolean p(int i10) {
        if (i10 <= this.f34824e / 2) {
            return true;
        }
        return false;
    }

    private boolean q(int i10, Integer num) {
        if (num == null || (!o() && num.intValue() > i10 * 8)) {
            return false;
        }
        return true;
    }

    public synchronized void a(int i10) {
        if (i10 >= 40) {
            try {
                b();
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        } else if (i10 >= 20 || i10 == 15) {
            i(this.f34824e / 2);
        }
    }

    public synchronized void b() {
        i(0);
    }

    public synchronized void c(Object obj) {
        Class<?> cls = obj.getClass();
        a k10 = k(cls);
        int o10 = k10.o(obj);
        int n10 = k10.n() * o10;
        if (p(n10)) {
            a e10 = this.f34821b.e(o10, cls);
            this.f34820a.d(e10, obj);
            NavigableMap n11 = n(cls);
            Integer num = (Integer) n11.get(Integer.valueOf(e10.f34827b));
            Integer valueOf = Integer.valueOf(e10.f34827b);
            int i10 = 1;
            if (num != null) {
                i10 = 1 + num.intValue();
            }
            n11.put(valueOf, Integer.valueOf(i10));
            this.f34825f += n10;
            h();
        }
    }

    public synchronized Object d(int i10, Class cls) {
        a aVar;
        try {
            Integer num = (Integer) n(cls).ceilingKey(Integer.valueOf(i10));
            if (q(i10, num)) {
                aVar = this.f34821b.e(num.intValue(), cls);
            } else {
                aVar = this.f34821b.e(i10, cls);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return m(aVar, cls);
    }

    public synchronized Object e(int i10, Class cls) {
        return m(this.f34821b.e(i10, cls), cls);
    }

    public void f(Object obj, Class cls) {
        c(obj);
    }
}
