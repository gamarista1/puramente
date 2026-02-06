package ja;

import android.os.Looper;
import android.os.Message;
import ja.C3656l;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final C3648d f45041a;

    /* renamed from: b  reason: collision with root package name */
    private final o f45042b;

    /* renamed from: c  reason: collision with root package name */
    private final b f45043c;

    /* renamed from: d  reason: collision with root package name */
    private final CopyOnWriteArraySet f45044d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayDeque f45045e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque f45046f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f45047g;

    public interface a {
        void invoke(Object obj);
    }

    public interface b {
        void a(Object obj, C3656l lVar);
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f45048a;

        /* renamed from: b  reason: collision with root package name */
        private C3656l.b f45049b = new C3656l.b();

        /* renamed from: c  reason: collision with root package name */
        private boolean f45050c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f45051d;

        public c(Object obj) {
            this.f45048a = obj;
        }

        public void a(int i10, a aVar) {
            if (!this.f45051d) {
                if (i10 != -1) {
                    this.f45049b.a(i10);
                }
                this.f45050c = true;
                aVar.invoke(this.f45048a);
            }
        }

        public void b(b bVar) {
            if (!this.f45051d && this.f45050c) {
                C3656l e10 = this.f45049b.e();
                this.f45049b = new C3656l.b();
                this.f45050c = false;
                bVar.a(this.f45048a, e10);
            }
        }

        public void c(b bVar) {
            this.f45051d = true;
            if (this.f45050c) {
                bVar.a(this.f45048a, this.f45049b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f45048a.equals(((c) obj).f45048a);
        }

        public int hashCode() {
            return this.f45048a.hashCode();
        }
    }

    public r(Looper looper, C3648d dVar, b bVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, bVar);
    }

    /* access modifiers changed from: private */
    public boolean g(Message message) {
        Iterator it = this.f45044d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(this.f45043c);
            if (this.f45042b.b(0)) {
                return true;
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

    public void c(Object obj) {
        if (!this.f45047g) {
            C3645a.e(obj);
            this.f45044d.add(new c(obj));
        }
    }

    public r d(Looper looper, C3648d dVar, b bVar) {
        return new r(this.f45044d, looper, dVar, bVar);
    }

    public r e(Looper looper, b bVar) {
        return d(looper, this.f45041a, bVar);
    }

    public void f() {
        if (!this.f45046f.isEmpty()) {
            if (!this.f45042b.b(0)) {
                o oVar = this.f45042b;
                oVar.j(oVar.a(0));
            }
            boolean isEmpty = this.f45045e.isEmpty();
            this.f45045e.addAll(this.f45046f);
            this.f45046f.clear();
            if (isEmpty) {
                while (!this.f45045e.isEmpty()) {
                    ((Runnable) this.f45045e.peekFirst()).run();
                    this.f45045e.removeFirst();
                }
            }
        }
    }

    public void i(int i10, a aVar) {
        this.f45046f.add(new p(new CopyOnWriteArraySet(this.f45044d), i10, aVar));
    }

    public void j() {
        Iterator it = this.f45044d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).c(this.f45043c);
        }
        this.f45044d.clear();
        this.f45047g = true;
    }

    public void k(int i10, a aVar) {
        i(i10, aVar);
        f();
    }

    private r(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, C3648d dVar, b bVar) {
        this.f45041a = dVar;
        this.f45044d = copyOnWriteArraySet;
        this.f45043c = bVar;
        this.f45045e = new ArrayDeque();
        this.f45046f = new ArrayDeque();
        this.f45042b = dVar.d(looper, new q(this));
    }
}
