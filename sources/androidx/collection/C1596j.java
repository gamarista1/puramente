package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;
import u.C2667d;
import zf.C6828a;

/* renamed from: androidx.collection.j  reason: case insensitive filesystem */
public abstract class C1596j implements Iterator, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private int f12176a;

    /* renamed from: b  reason: collision with root package name */
    private int f12177b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12178c;

    public C1596j(int i10) {
        this.f12176a = i10;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i10);

    /* access modifiers changed from: protected */
    public abstract void b(int i10);

    public boolean hasNext() {
        if (this.f12177b < this.f12176a) {
            return true;
        }
        return false;
    }

    public Object next() {
        if (hasNext()) {
            Object a10 = a(this.f12177b);
            this.f12177b++;
            this.f12178c = true;
            return a10;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        if (!this.f12178c) {
            C2667d.b("Call next() before removing an element.");
        }
        int i10 = this.f12177b - 1;
        this.f12177b = i10;
        b(i10);
        this.f12176a--;
        this.f12178c = false;
    }
}
