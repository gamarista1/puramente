package Z4;

import java.util.Queue;
import o5.h;
import o5.l;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private final h f35896a;

    class a extends h {
        a(long j10) {
            super(j10);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public void j(b bVar, Object obj) {
            bVar.c();
        }
    }

    static final class b {

        /* renamed from: d  reason: collision with root package name */
        private static final Queue f35898d = l.g(0);

        /* renamed from: a  reason: collision with root package name */
        private int f35899a;

        /* renamed from: b  reason: collision with root package name */
        private int f35900b;

        /* renamed from: c  reason: collision with root package name */
        private Object f35901c;

        private b() {
        }

        static b a(Object obj, int i10, int i11) {
            b bVar;
            Queue queue = f35898d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.b(obj, i10, i11);
            return bVar;
        }

        private void b(Object obj, int i10, int i11) {
            this.f35901c = obj;
            this.f35900b = i10;
            this.f35899a = i11;
        }

        public void c() {
            Queue queue = f35898d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f35900b == bVar.f35900b && this.f35899a == bVar.f35899a && this.f35901c.equals(bVar.f35901c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f35899a * 31) + this.f35900b) * 31) + this.f35901c.hashCode();
        }
    }

    public m(long j10) {
        this.f35896a = new a(j10);
    }

    public Object a(Object obj, int i10, int i11) {
        b a10 = b.a(obj, i10, i11);
        Object g10 = this.f35896a.g(a10);
        a10.c();
        return g10;
    }

    public void b(Object obj, int i10, int i11, Object obj2) {
        this.f35896a.k(b.a(obj, i10, i11), obj2);
    }
}
