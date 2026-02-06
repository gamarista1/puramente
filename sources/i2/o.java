package i2;

import android.os.Looper;
import android.os.Message;
import f2.r;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final C2078c f22130a;

    /* renamed from: b  reason: collision with root package name */
    private final C2087l f22131b;

    /* renamed from: c  reason: collision with root package name */
    private final b f22132c;

    /* renamed from: d  reason: collision with root package name */
    private final CopyOnWriteArraySet f22133d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayDeque f22134e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque f22135f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f22136g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f22137h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f22138i;

    public interface a {
        void invoke(Object obj);
    }

    public interface b {
        void a(Object obj, r rVar);
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f22139a;

        /* renamed from: b  reason: collision with root package name */
        private r.b f22140b = new r.b();

        /* renamed from: c  reason: collision with root package name */
        private boolean f22141c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f22142d;

        public c(Object obj) {
            this.f22139a = obj;
        }

        public void a(int i10, a aVar) {
            if (!this.f22142d) {
                if (i10 != -1) {
                    this.f22140b.a(i10);
                }
                this.f22141c = true;
                aVar.invoke(this.f22139a);
            }
        }

        public void b(b bVar) {
            if (!this.f22142d && this.f22141c) {
                r e10 = this.f22140b.e();
                this.f22140b = new r.b();
                this.f22141c = false;
                bVar.a(this.f22139a, e10);
            }
        }

        public void c(b bVar) {
            this.f22142d = true;
            if (this.f22141c) {
                this.f22141c = false;
                bVar.a(this.f22139a, this.f22140b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f22139a.equals(((c) obj).f22139a);
        }

        public int hashCode() {
            return this.f22139a.hashCode();
        }
    }

    public o(Looper looper, C2078c cVar, b bVar) {
        this(new CopyOnWriteArraySet(), looper, cVar, bVar, true);
    }

    /* access modifiers changed from: private */
    public boolean g(Message message) {
        Iterator it = this.f22133d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(this.f22132c);
            if (this.f22131b.b(1)) {
                break;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void h(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    private void m() {
        boolean z10;
        if (this.f22138i) {
            if (Thread.currentThread() == this.f22131b.k().getThread()) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2076a.g(z10);
        }
    }

    public void c(Object obj) {
        C2076a.e(obj);
        synchronized (this.f22136g) {
            try {
                if (!this.f22137h) {
                    this.f22133d.add(new c(obj));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public o d(Looper looper, C2078c cVar, b bVar) {
        return new o(this.f22133d, looper, cVar, bVar, this.f22138i);
    }

    public o e(Looper looper, b bVar) {
        return d(looper, this.f22130a, bVar);
    }

    public void f() {
        m();
        if (!this.f22135f.isEmpty()) {
            if (!this.f22131b.b(1)) {
                C2087l lVar = this.f22131b;
                lVar.j(lVar.a(1));
            }
            boolean isEmpty = this.f22134e.isEmpty();
            this.f22134e.addAll(this.f22135f);
            this.f22135f.clear();
            if (isEmpty) {
                while (!this.f22134e.isEmpty()) {
                    ((Runnable) this.f22134e.peekFirst()).run();
                    this.f22134e.removeFirst();
                }
            }
        }
    }

    public void i(int i10, a aVar) {
        m();
        this.f22135f.add(new n(new CopyOnWriteArraySet(this.f22133d), i10, aVar));
    }

    public void j() {
        m();
        synchronized (this.f22136g) {
            this.f22137h = true;
        }
        Iterator it = this.f22133d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).c(this.f22132c);
        }
        this.f22133d.clear();
    }

    public void k(Object obj) {
        m();
        Iterator it = this.f22133d.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f22139a.equals(obj)) {
                cVar.c(this.f22132c);
                this.f22133d.remove(cVar);
            }
        }
    }

    public void l(int i10, a aVar) {
        i(i10, aVar);
        f();
    }

    private o(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, C2078c cVar, b bVar, boolean z10) {
        this.f22130a = cVar;
        this.f22133d = copyOnWriteArraySet;
        this.f22132c = bVar;
        this.f22136g = new Object();
        this.f22134e = new ArrayDeque();
        this.f22135f = new ArrayDeque();
        this.f22131b = cVar.d(looper, new C2088m(this));
        this.f22138i = z10;
    }
}
