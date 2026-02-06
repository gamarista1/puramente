package H0;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.C6488j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zf.C6828a;

public interface g0 {

    public static final class a implements Collection, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private final Set f2608a;

        public a(Set set) {
            this.f2608a = set;
        }

        /* renamed from: a */
        public final boolean add(Object obj) {
            return this.f2608a.add(obj);
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public int b() {
            return this.f2608a.size();
        }

        public final void clear() {
            this.f2608a.clear();
        }

        public boolean contains(Object obj) {
            return this.f2608a.contains(obj);
        }

        public boolean containsAll(Collection collection) {
            return this.f2608a.containsAll(collection);
        }

        public boolean isEmpty() {
            return this.f2608a.isEmpty();
        }

        public Iterator iterator() {
            return this.f2608a.iterator();
        }

        public final boolean remove(Object obj) {
            return this.f2608a.remove(obj);
        }

        public final boolean removeAll(Collection collection) {
            return this.f2608a.remove(collection);
        }

        public boolean removeIf(Predicate predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean retainAll(Collection collection) {
            return this.f2608a.retainAll(collection);
        }

        public final /* bridge */ int size() {
            return b();
        }

        public Object[] toArray() {
            return C6488j.a(this);
        }

        public Object[] toArray(Object[] objArr) {
            return C6488j.b(this, objArr);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(Set set, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new LinkedHashSet() : set);
        }
    }

    void a(a aVar);

    boolean b(Object obj, Object obj2);
}
