package i0;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import lf.C6527k;
import zf.C6828a;

final class w implements ListIterator, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final r f21811a;

    /* renamed from: b  reason: collision with root package name */
    private int f21812b;

    /* renamed from: c  reason: collision with root package name */
    private int f21813c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f21814d;

    public w(r rVar, int i10) {
        this.f21811a = rVar;
        this.f21812b = i10 - 1;
        this.f21814d = rVar.r();
    }

    private final void a() {
        if (this.f21811a.r() != this.f21814d) {
            throw new ConcurrentModificationException();
        }
    }

    public void add(Object obj) {
        a();
        this.f21811a.add(this.f21812b + 1, obj);
        this.f21813c = -1;
        this.f21812b++;
        this.f21814d = this.f21811a.r();
    }

    public boolean hasNext() {
        if (this.f21812b < this.f21811a.size() - 1) {
            return true;
        }
        return false;
    }

    public boolean hasPrevious() {
        if (this.f21812b >= 0) {
            return true;
        }
        return false;
    }

    public Object next() {
        a();
        int i10 = this.f21812b + 1;
        this.f21813c = i10;
        s.g(i10, this.f21811a.size());
        Object obj = this.f21811a.get(i10);
        this.f21812b = i10;
        return obj;
    }

    public int nextIndex() {
        return this.f21812b + 1;
    }

    public Object previous() {
        a();
        s.g(this.f21812b, this.f21811a.size());
        int i10 = this.f21812b;
        this.f21813c = i10;
        this.f21812b--;
        return this.f21811a.get(i10);
    }

    public int previousIndex() {
        return this.f21812b;
    }

    public void remove() {
        a();
        this.f21811a.remove(this.f21812b);
        this.f21812b--;
        this.f21813c = -1;
        this.f21814d = this.f21811a.r();
    }

    public void set(Object obj) {
        a();
        int i10 = this.f21813c;
        if (i10 >= 0) {
            this.f21811a.set(i10, obj);
            this.f21814d = this.f21811a.r();
            return;
        }
        Void unused = s.e();
        throw new C6527k();
    }
}
