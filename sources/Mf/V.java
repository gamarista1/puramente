package mf;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.C6496s;
import zf.C6828a;

final class V extends C6553f {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final List f72037a;

    public static final class a implements ListIterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private final ListIterator f72038a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ V f72039b;

        a(V v10, int i10) {
            this.f72039b = v10;
            this.f72038a = v10.f72037a.listIterator(C6541A.Y(v10, i10));
        }

        public void add(Object obj) {
            this.f72038a.add(obj);
            this.f72038a.previous();
        }

        public boolean hasNext() {
            return this.f72038a.hasPrevious();
        }

        public boolean hasPrevious() {
            return this.f72038a.hasNext();
        }

        public Object next() {
            return this.f72038a.previous();
        }

        public int nextIndex() {
            return C6541A.X(this.f72039b, this.f72038a.previousIndex());
        }

        public Object previous() {
            return this.f72038a.next();
        }

        public int previousIndex() {
            return C6541A.X(this.f72039b, this.f72038a.nextIndex());
        }

        public void remove() {
            this.f72038a.remove();
        }

        public void set(Object obj) {
            this.f72038a.set(obj);
        }
    }

    public V(List list) {
        C6496s.h(list, "delegate");
        this.f72037a = list;
    }

    public int a() {
        return this.f72037a.size();
    }

    public void add(int i10, Object obj) {
        this.f72037a.add(C6541A.Y(this, i10), obj);
    }

    public Object b(int i10) {
        return this.f72037a.remove(C6541A.W(this, i10));
    }

    public void clear() {
        this.f72037a.clear();
    }

    public Object get(int i10) {
        return this.f72037a.get(C6541A.W(this, i10));
    }

    public Iterator iterator() {
        return listIterator(0);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public Object set(int i10, Object obj) {
        return this.f72037a.set(C6541A.W(this, i10), obj);
    }

    public ListIterator listIterator(int i10) {
        return new a(this, i10);
    }
}
