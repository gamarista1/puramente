package mf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import zf.C6828a;

/* renamed from: mf.b  reason: case insensitive filesystem */
public abstract class C6549b implements Iterator, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private int f72051a;

    /* renamed from: b  reason: collision with root package name */
    private Object f72052b;

    private final boolean e() {
        this.f72051a = 3;
        a();
        if (this.f72051a == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public final void b() {
        this.f72051a = 2;
    }

    /* access modifiers changed from: protected */
    public final void c(Object obj) {
        this.f72052b = obj;
        this.f72051a = 1;
    }

    public boolean hasNext() {
        int i10 = this.f72051a;
        if (i10 == 0) {
            return e();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    public Object next() {
        int i10 = this.f72051a;
        if (i10 == 1) {
            this.f72051a = 0;
            return this.f72052b;
        } else if (i10 == 2 || !e()) {
            throw new NoSuchElementException();
        } else {
            this.f72051a = 0;
            return this.f72052b;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
