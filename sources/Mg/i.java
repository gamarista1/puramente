package Mg;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zf.C6828a;

public final class i extends c {

    /* renamed from: a  reason: collision with root package name */
    public static final i f64157a = new i();

    public static final class a implements Iterator, C6828a {
        a() {
        }

        /* renamed from: a */
        public Void next() {
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private i() {
        super((DefaultConstructorMarker) null);
    }

    public int a() {
        return 0;
    }

    /* renamed from: g */
    public Void get(int i10) {
        return null;
    }

    public Iterator iterator() {
        return new a();
    }

    /* renamed from: k */
    public void b(int i10, Void voidR) {
        C6496s.h(voidR, "value");
        throw new IllegalStateException();
    }
}
