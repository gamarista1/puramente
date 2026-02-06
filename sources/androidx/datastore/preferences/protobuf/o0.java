package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class o0 extends AbstractList implements D, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final D f16413a;

    class a implements ListIterator {

        /* renamed from: a  reason: collision with root package name */
        ListIterator f16414a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f16415b;

        a(int i10) {
            this.f16415b = i10;
            this.f16414a = o0.this.f16413a.listIterator(i10);
        }

        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public String next() {
            return (String) this.f16414a.next();
        }

        /* renamed from: c */
        public String previous() {
            return (String) this.f16414a.previous();
        }

        /* renamed from: d */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f16414a.hasNext();
        }

        public boolean hasPrevious() {
            return this.f16414a.hasPrevious();
        }

        public int nextIndex() {
            return this.f16414a.nextIndex();
        }

        public int previousIndex() {
            return this.f16414a.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        Iterator f16417a;

        b() {
            this.f16417a = o0.this.f16413a.iterator();
        }

        /* renamed from: a */
        public String next() {
            return (String) this.f16417a.next();
        }

        public boolean hasNext() {
            return this.f16417a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public o0(D d10) {
        this.f16413a = d10;
    }

    public void X(C1734g gVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public String get(int i10) {
        return (String) this.f16413a.get(i10);
    }

    public List e() {
        return this.f16413a.e();
    }

    public Iterator iterator() {
        return new b();
    }

    public D j() {
        return this;
    }

    public ListIterator listIterator(int i10) {
        return new a(i10);
    }

    public Object s(int i10) {
        return this.f16413a.s(i10);
    }

    public int size() {
        return this.f16413a.size();
    }
}
