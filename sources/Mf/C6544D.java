package mf;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import zf.C6828a;

/* renamed from: mf.D  reason: case insensitive filesystem */
public final class C6544D implements ListIterator, C6828a {

    /* renamed from: a  reason: collision with root package name */
    public static final C6544D f72028a = new C6544D();

    private C6544D() {
    }

    /* renamed from: a */
    public Void next() {
        throw new NoSuchElementException();
    }

    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public Void previous() {
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public int nextIndex() {
        return 0;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
