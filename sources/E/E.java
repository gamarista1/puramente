package E;

import i0.r;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.C6488j;
import zf.C6828a;

public final class E implements List, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final List f1556a;

    public interface a {
        int getIndex();

        Object getKey();
    }

    private E(List list) {
        this.f1556a = list;
    }

    public boolean a(a aVar) {
        return this.f1556a.contains(aVar);
    }

    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public a get(int i10) {
        return (a) this.f1556a.get(i10);
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return a((a) obj);
    }

    public boolean containsAll(Collection collection) {
        return this.f1556a.containsAll(collection);
    }

    public int g() {
        return this.f1556a.size();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof a)) {
            return -1;
        }
        return k((a) obj);
    }

    public boolean isEmpty() {
        return this.f1556a.isEmpty();
    }

    public Iterator iterator() {
        return this.f1556a.iterator();
    }

    public int k(a aVar) {
        return this.f1556a.indexOf(aVar);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof a)) {
            return -1;
        }
        return n((a) obj);
    }

    public ListIterator listIterator() {
        return this.f1556a.listIterator();
    }

    public int n(a aVar) {
        return this.f1556a.lastIndexOf(aVar);
    }

    public final void r(a aVar) {
        this.f1556a.add(aVar);
    }

    public /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return g();
    }

    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i10, int i11) {
        return this.f1556a.subList(i10, i11);
    }

    public final void t(a aVar) {
        this.f1556a.remove(aVar);
    }

    public Object[] toArray() {
        return C6488j.a(this);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator listIterator(int i10) {
        return this.f1556a.listIterator(i10);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray(Object[] objArr) {
        return C6488j.b(this, objArr);
    }

    public E() {
        this(new r());
    }
}
