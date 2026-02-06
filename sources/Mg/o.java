package Mg;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zf.C6828a;

public final class o extends c {

    /* renamed from: a  reason: collision with root package name */
    private final Object f64166a;

    /* renamed from: b  reason: collision with root package name */
    private final int f64167b;

    public static final class a implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f64168a = true;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o f64169b;

        a(o oVar) {
            this.f64169b = oVar;
        }

        public boolean hasNext() {
            return this.f64168a;
        }

        public Object next() {
            if (this.f64168a) {
                this.f64168a = false;
                return this.f64169b.getValue();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(Object obj, int i10) {
        super((DefaultConstructorMarker) null);
        C6496s.h(obj, "value");
        this.f64166a = obj;
        this.f64167b = i10;
    }

    public int a() {
        return 1;
    }

    public void b(int i10, Object obj) {
        C6496s.h(obj, "value");
        throw new IllegalStateException();
    }

    public final int g() {
        return this.f64167b;
    }

    public Object get(int i10) {
        if (i10 == this.f64167b) {
            return this.f64166a;
        }
        return null;
    }

    public final Object getValue() {
        return this.f64166a;
    }

    public Iterator iterator() {
        return new a(this);
    }
}
