package mf;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.C6496s;
import zf.C6828a;

class W extends C6550c {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final List f72040b;

    public static final class a implements ListIterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private final ListIterator f72041a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ W f72042b;

        a(W w10, int i10) {
            this.f72042b = w10;
            this.f72041a = w10.f72040b.listIterator(C6541A.Y(w10, i10));
        }

        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasNext() {
            return this.f72041a.hasPrevious();
        }

        public boolean hasPrevious() {
            return this.f72041a.hasNext();
        }

        public Object next() {
            return this.f72041a.previous();
        }

        public int nextIndex() {
            return C6541A.X(this.f72042b, this.f72041a.previousIndex());
        }

        public Object previous() {
            return this.f72041a.next();
        }

        public int previousIndex() {
            return C6541A.X(this.f72042b, this.f72041a.nextIndex());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public W(List list) {
        C6496s.h(list, "delegate");
        this.f72040b = list;
    }

    public int a() {
        return this.f72040b.size();
    }

    public Object get(int i10) {
        return this.f72040b.get(C6541A.W(this, i10));
    }

    public Iterator iterator() {
        return listIterator(0);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public ListIterator listIterator(int i10) {
        return new a(this, i10);
    }
}
