package lh;

import com.amazon.a.a.o.b.f;
import gh.C5978b;
import gh.C5985i;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.C6488j;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yf.C6798l;
import zf.C6828a;

@C5985i(with = C6540d.class)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 .2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001\bB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001aH\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u001b\u0010\u001dJ&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u0014\u0010-\u001a\u00020\u000e8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b,\u0010'¨\u0006/"}, d2 = {"Llh/c;", "Llh/i;", "", "content", "<init>", "(Ljava/util/List;)V", "element", "", "a", "(Llh/i;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "b", "(I)Llh/i;", "k", "(Llh/i;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "n", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "g", "size", "Companion", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lh.c  reason: case insensitive filesystem */
public final class C6539c extends i implements List<i>, C6828a {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final List f71955a;

    /* renamed from: lh.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return C6540d.f71956a;
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6539c(List list) {
        super((DefaultConstructorMarker) null);
        C6496s.h(list, "content");
        this.f71955a = list;
    }

    public boolean a(i iVar) {
        C6496s.h(iVar, "element");
        return this.f71955a.contains(iVar);
    }

    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public i get(int i10) {
        return (i) this.f71955a.get(i10);
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return a((i) obj);
    }

    public boolean containsAll(Collection collection) {
        C6496s.h(collection, "elements");
        return this.f71955a.containsAll(collection);
    }

    public boolean equals(Object obj) {
        return C6496s.c(this.f71955a, obj);
    }

    public int g() {
        return this.f71955a.size();
    }

    public int hashCode() {
        return this.f71955a.hashCode();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        return k((i) obj);
    }

    public boolean isEmpty() {
        return this.f71955a.isEmpty();
    }

    public Iterator iterator() {
        return this.f71955a.iterator();
    }

    public int k(i iVar) {
        C6496s.h(iVar, "element");
        return this.f71955a.indexOf(iVar);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof i)) {
            return -1;
        }
        return n((i) obj);
    }

    public ListIterator listIterator() {
        return this.f71955a.listIterator();
    }

    public int n(i iVar) {
        C6496s.h(iVar, "element");
        return this.f71955a.lastIndexOf(iVar);
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
        return this.f71955a.subList(i10, i11);
    }

    public Object[] toArray() {
        return C6488j.a(this);
    }

    public String toString() {
        return C6565s.x0(this.f71955a, f.f37529a, "[", "]", 0, (CharSequence) null, (C6798l) null, 56, (Object) null);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator listIterator(int i10) {
        return this.f71955a.listIterator(i10);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray(Object[] objArr) {
        C6496s.h(objArr, "array");
        return C6488j.b(this, objArr);
    }
}
