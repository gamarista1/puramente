package c0;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import zf.C6828a;

/* renamed from: c0.a  reason: case insensitive filesystem */
public abstract class C1887a implements ListIterator, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private int f19174a;

    /* renamed from: b  reason: collision with root package name */
    private int f19175b;

    public C1887a(int i10, int i11) {
        this.f19174a = i10;
        this.f19175b = i11;
    }

    public final void a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int c() {
        return this.f19174a;
    }

    public final int e() {
        return this.f19175b;
    }

    public final void g(int i10) {
        this.f19174a = i10;
    }

    public boolean hasNext() {
        if (this.f19174a < this.f19175b) {
            return true;
        }
        return false;
    }

    public boolean hasPrevious() {
        if (this.f19174a > 0) {
            return true;
        }
        return false;
    }

    public final void j(int i10) {
        this.f19175b = i10;
    }

    public int nextIndex() {
        return this.f19174a;
    }

    public int previousIndex() {
        return this.f19174a - 1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
