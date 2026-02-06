package mf;

import java.util.Collection;
import kotlin.jvm.internal.C6488j;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;
import zf.C6828a;

/* renamed from: mf.a  reason: case insensitive filesystem */
public abstract class C6548a implements Collection, C6828a {

    /* renamed from: mf.a$a  reason: collision with other inner class name */
    static final class C1037a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6548a f72050a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1037a(C6548a aVar) {
            super(1);
            this.f72050a = aVar;
        }

        /* renamed from: a */
        public final CharSequence invoke(Object obj) {
            if (obj == this.f72050a) {
                return "(this Collection)";
            }
            return String.valueOf(obj);
        }
    }

    protected C6548a() {
    }

    public abstract int a();

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object c10 : this) {
            if (C6496s.c(c10, obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        C6496s.h(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return a();
    }

    public Object[] toArray() {
        return C6488j.a(this);
    }

    public String toString() {
        return C6565s.x0(this, ", ", "[", "]", 0, (CharSequence) null, new C1037a(this), 24, (Object) null);
    }

    public Object[] toArray(Object[] objArr) {
        C6496s.h(objArr, "array");
        return C6488j.b(this, objArr);
    }
}
