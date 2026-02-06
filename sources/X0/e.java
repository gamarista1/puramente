package X0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.C6488j;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import zf.C6828a;

public final class e implements Collection, C6828a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f9568c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final e f9569d = new e(C6565s.n());

    /* renamed from: a  reason: collision with root package name */
    private final List f9570a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9571b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return g.a().b();
        }

        public final e b() {
            return e.f9569d;
        }

        private a() {
        }
    }

    public e(List list) {
        this.f9570a = list;
        this.f9571b = list.size();
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(d dVar) {
        return this.f9570a.contains(dVar);
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return b((d) obj);
    }

    public boolean containsAll(Collection collection) {
        return this.f9570a.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && C6496s.c(this.f9570a, ((e) obj).f9570a)) {
            return true;
        }
        return false;
    }

    public final d g(int i10) {
        return (d) this.f9570a.get(i10);
    }

    public int hashCode() {
        return this.f9570a.hashCode();
    }

    public boolean isEmpty() {
        return this.f9570a.isEmpty();
    }

    public Iterator iterator() {
        return this.f9570a.iterator();
    }

    public final List k() {
        return this.f9570a;
    }

    public int n() {
        return this.f9571b;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return n();
    }

    public Object[] toArray() {
        return C6488j.a(this);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.f9570a + ')';
    }

    public Object[] toArray(Object[] objArr) {
        return C6488j.b(this, objArr);
    }
}
