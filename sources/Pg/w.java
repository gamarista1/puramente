package pg;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class w extends AbstractList implements RandomAccess, n {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final n f72588a;

    class a implements ListIterator {

        /* renamed from: a  reason: collision with root package name */
        ListIterator f72589a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f72590b;

        a(int i10) {
            this.f72590b = i10;
            this.f72589a = w.this.f72588a.listIterator(i10);
        }

        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public String next() {
            return (String) this.f72589a.next();
        }

        /* renamed from: c */
        public String previous() {
            return (String) this.f72589a.previous();
        }

        /* renamed from: d */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f72589a.hasNext();
        }

        public boolean hasPrevious() {
            return this.f72589a.hasPrevious();
        }

        public int nextIndex() {
            return this.f72589a.nextIndex();
        }

        public int previousIndex() {
            return this.f72589a.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        Iterator f72592a;

        b() {
            this.f72592a = w.this.f72588a.iterator();
        }

        /* renamed from: a */
        public String next() {
            return (String) this.f72592a.next();
        }

        public boolean hasNext() {
            return this.f72592a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public w(n nVar) {
        this.f72588a = nVar;
    }

    public C6642d G(int i10) {
        return this.f72588a.G(i10);
    }

    /* renamed from: b */
    public String get(int i10) {
        return (String) this.f72588a.get(i10);
    }

    public void d0(C6642d dVar) {
        throw new UnsupportedOperationException();
    }

    public List e() {
        return this.f72588a.e();
    }

    public Iterator iterator() {
        return new b();
    }

    public ListIterator listIterator(int i10) {
        return new a(i10);
    }

    public int size() {
        return this.f72588a.size();
    }

    public n j() {
        return this;
    }
}
