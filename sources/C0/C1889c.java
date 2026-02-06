package c0;

import java.util.NoSuchElementException;

/* renamed from: c0.c  reason: case insensitive filesystem */
public final class C1889c extends C1887a {

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f19177c;

    public C1889c(Object[] objArr, int i10, int i11) {
        super(i10, i11);
        this.f19177c = objArr;
    }

    public Object next() {
        if (hasNext()) {
            Object[] objArr = this.f19177c;
            int c10 = c();
            g(c10 + 1);
            return objArr[c10];
        }
        throw new NoSuchElementException();
    }

    public Object previous() {
        if (hasPrevious()) {
            Object[] objArr = this.f19177c;
            g(c() - 1);
            return objArr[c()];
        }
        throw new NoSuchElementException();
    }
}
