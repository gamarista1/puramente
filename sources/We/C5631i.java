package We;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: We.i  reason: case insensitive filesystem */
final class C5631i extends AbstractCollection implements Queue, Serializable {
    private static final long serialVersionUID = -8423413834657610417L;

    /* renamed from: We.i$a */
    class a implements Iterator {
        a() {
        }

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new IllegalStateException();
        }
    }

    public boolean add(Object obj) {
        return false;
    }

    public Object element() {
        return null;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return new a();
    }

    public boolean offer(Object obj) {
        return false;
    }

    public Object peek() {
        return null;
    }

    public Object poll() {
        return null;
    }

    public Object remove() {
        throw new NoSuchElementException("queue is disabled");
    }

    public int size() {
        return 0;
    }

    public void clear() {
    }
}
