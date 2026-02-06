package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import zf.C6828a;

/* renamed from: kotlin.jvm.internal.b  reason: case insensitive filesystem */
final class C6480b implements Iterator, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f71774a;

    /* renamed from: b  reason: collision with root package name */
    private int f71775b;

    public C6480b(Object[] objArr) {
        C6496s.h(objArr, "array");
        this.f71774a = objArr;
    }

    public boolean hasNext() {
        if (this.f71775b < this.f71774a.length) {
            return true;
        }
        return false;
    }

    public Object next() {
        try {
            Object[] objArr = this.f71774a;
            int i10 = this.f71775b;
            this.f71775b = i10 + 1;
            return objArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f71775b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
