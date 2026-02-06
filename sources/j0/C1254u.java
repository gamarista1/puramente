package J0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import k0.i;
import kotlin.jvm.internal.C6488j;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import mf.C6565s;
import yf.C6787a;
import zf.C6828a;

/* renamed from: J0.u  reason: case insensitive filesystem */
public final class C1254u implements List, C6828a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Object[] f3923a = new Object[16];

    /* renamed from: b  reason: collision with root package name */
    private long[] f3924b = new long[16];
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f3925c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f3926d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3927e = true;

    /* renamed from: J0.u$b */
    private final class b implements List, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private final int f3932a;

        /* renamed from: b  reason: collision with root package name */
        private final int f3933b;

        public b(int i10, int i11) {
            this.f3932a = i10;
            this.f3933b = i11;
        }

        public boolean a(i.c cVar) {
            if (indexOf(cVar) != -1) {
                return true;
            }
            return false;
        }

        public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(int i10, Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: b */
        public i.c get(int i10) {
            Object obj = C1254u.this.f3923a[i10 + this.f3932a];
            C6496s.f(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (i.c) obj;
        }

        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof i.c)) {
                return false;
            }
            return a((i.c) obj);
        }

        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((i.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int g() {
            return this.f3933b - this.f3932a;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof i.c)) {
                return -1;
            }
            return k((i.c) obj);
        }

        public boolean isEmpty() {
            if (size() == 0) {
                return true;
            }
            return false;
        }

        public Iterator iterator() {
            C1254u uVar = C1254u.this;
            int i10 = this.f3932a;
            return new a(i10, i10, this.f3933b);
        }

        public int k(i.c cVar) {
            int i10 = this.f3932a;
            int i11 = this.f3933b;
            if (i10 > i11) {
                return -1;
            }
            while (!C6496s.c(C1254u.this.f3923a[i10], cVar)) {
                if (i10 == i11) {
                    return -1;
                }
                i10++;
            }
            return i10 - this.f3932a;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof i.c)) {
                return -1;
            }
            return n((i.c) obj);
        }

        public ListIterator listIterator() {
            C1254u uVar = C1254u.this;
            int i10 = this.f3932a;
            return new a(i10, i10, this.f3933b);
        }

        public int n(i.c cVar) {
            int i10 = this.f3933b;
            int i11 = this.f3932a;
            if (i11 > i10) {
                return -1;
            }
            while (!C6496s.c(C1254u.this.f3923a[i10], cVar)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f3932a;
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
            C1254u uVar = C1254u.this;
            int i12 = this.f3932a;
            return new b(i10 + i12, i12 + i11);
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
            C1254u uVar = C1254u.this;
            int i11 = this.f3932a;
            return new a(i10 + i11, i11, this.f3933b);
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Object[] toArray(Object[] objArr) {
            return C6488j.b(this, objArr);
        }
    }

    private final void N() {
        int i10 = this.f3925c + 1;
        int p10 = C6565s.p(this);
        if (i10 <= p10) {
            while (true) {
                this.f3923a[i10] = null;
                if (i10 == p10) {
                    break;
                }
                i10++;
            }
        }
        this.f3926d = this.f3925c + 1;
    }

    private final void r() {
        int i10 = this.f3925c;
        Object[] objArr = this.f3923a;
        if (i10 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            C6496s.g(copyOf, "copyOf(this, newSize)");
            this.f3923a = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f3924b, length);
            C6496s.g(copyOf2, "copyOf(this, newSize)");
            this.f3924b = copyOf2;
        }
    }

    private final long t() {
        long b10 = C1255v.a(Float.POSITIVE_INFINITY, false);
        int i10 = this.f3925c + 1;
        int p10 = C6565s.p(this);
        if (i10 <= p10) {
            while (true) {
                long b11 = C1251q.b(this.f3924b[i10]);
                if (C1251q.a(b11, b10) < 0) {
                    b10 = b11;
                }
                if (C1251q.c(b10) >= 0.0f || !C1251q.d(b10)) {
                    if (i10 == p10) {
                        break;
                    }
                    i10++;
                } else {
                    return b10;
                }
            }
        }
        return b10;
    }

    public final boolean A() {
        long t10 = t();
        if (C1251q.c(t10) >= 0.0f || !C1251q.d(t10)) {
            return false;
        }
        return true;
    }

    public final void C(i.c cVar, boolean z10, C6787a aVar) {
        D(cVar, -1.0f, z10, aVar);
        C1235c0 K12 = cVar.K1();
        if (K12 != null && !K12.k3()) {
            this.f3927e = false;
        }
    }

    public final void D(i.c cVar, float f10, boolean z10, C6787a aVar) {
        int i10 = this.f3925c;
        this.f3925c = i10 + 1;
        r();
        Object[] objArr = this.f3923a;
        int i11 = this.f3925c;
        objArr[i11] = cVar;
        this.f3924b[i11] = C1255v.a(f10, z10);
        N();
        aVar.invoke();
        this.f3925c = i10;
    }

    public int E(i.c cVar) {
        int p10 = C6565s.p(this);
        if (p10 < 0) {
            return -1;
        }
        int i10 = 0;
        while (!C6496s.c(this.f3923a[i10], cVar)) {
            if (i10 == p10) {
                return -1;
            }
            i10++;
        }
        return i10;
    }

    public final boolean H(float f10, boolean z10) {
        if (this.f3925c == C6565s.p(this)) {
            return true;
        }
        if (C1251q.a(t(), C1255v.a(f10, z10)) > 0) {
            return true;
        }
        return false;
    }

    public int I(i.c cVar) {
        for (int p10 = C6565s.p(this); -1 < p10; p10--) {
            if (C6496s.c(this.f3923a[p10], cVar)) {
                return p10;
            }
        }
        return -1;
    }

    public final void P(i.c cVar, float f10, boolean z10, C6787a aVar) {
        if (this.f3925c == C6565s.p(this)) {
            D(cVar, f10, z10, aVar);
            if (this.f3925c + 1 == C6565s.p(this)) {
                N();
                return;
            }
            return;
        }
        long t10 = t();
        int i10 = this.f3925c;
        this.f3925c = C6565s.p(this);
        D(cVar, f10, z10, aVar);
        if (this.f3925c + 1 < C6565s.p(this) && C1251q.a(t10, t()) > 0) {
            int i11 = this.f3925c + 1;
            int i12 = i10 + 1;
            Object[] objArr = this.f3923a;
            C6559l.m(objArr, objArr, i12, i11, size());
            long[] jArr = this.f3924b;
            C6559l.l(jArr, jArr, i12, i11, size());
            this.f3925c = ((size() + i10) - this.f3925c) - 1;
        }
        N();
        this.f3925c = i10;
    }

    public final void a() {
        this.f3925c = size() - 1;
    }

    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        this.f3925c = -1;
        N();
        this.f3927e = true;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof i.c)) {
            return false;
        }
        return n((i.c) obj);
    }

    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((i.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof i.c)) {
            return -1;
        }
        return E((i.c) obj);
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return new a(this, 0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof i.c)) {
            return -1;
        }
        return I((i.c) obj);
    }

    public ListIterator listIterator() {
        return new a(this, 0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public boolean n(i.c cVar) {
        if (indexOf(cVar) != -1) {
            return true;
        }
        return false;
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
        return z();
    }

    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i10, int i11) {
        return new b(i10, i11);
    }

    public Object[] toArray() {
        return C6488j.a(this);
    }

    /* renamed from: v */
    public i.c get(int i10) {
        Object obj = this.f3923a[i10];
        C6496s.f(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (i.c) obj;
    }

    public final boolean x() {
        return this.f3927e;
    }

    public int z() {
        return this.f3926d;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator listIterator(int i10) {
        return new a(this, i10, 0, 0, 6, (DefaultConstructorMarker) null);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray(Object[] objArr) {
        return C6488j.b(this, objArr);
    }

    /* renamed from: J0.u$a */
    private final class a implements ListIterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private int f3928a;

        /* renamed from: b  reason: collision with root package name */
        private final int f3929b;

        /* renamed from: c  reason: collision with root package name */
        private final int f3930c;

        public a(int i10, int i11, int i12) {
            this.f3928a = i10;
            this.f3929b = i11;
            this.f3930c = i12;
        }

        /* renamed from: a */
        public i.c next() {
            Object[] g10 = C1254u.this.f3923a;
            int i10 = this.f3928a;
            this.f3928a = i10 + 1;
            Object obj = g10[i10];
            C6496s.f(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (i.c) obj;
        }

        public /* bridge */ /* synthetic */ void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: b */
        public i.c previous() {
            Object[] g10 = C1254u.this.f3923a;
            int i10 = this.f3928a - 1;
            this.f3928a = i10;
            Object obj = g10[i10];
            C6496s.f(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (i.c) obj;
        }

        public boolean hasNext() {
            if (this.f3928a < this.f3930c) {
                return true;
            }
            return false;
        }

        public boolean hasPrevious() {
            if (this.f3928a > this.f3929b) {
                return true;
            }
            return false;
        }

        public int nextIndex() {
            return this.f3928a - this.f3929b;
        }

        public int previousIndex() {
            return (this.f3928a - this.f3929b) - 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(C1254u uVar, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? uVar.size() : i12);
        }
    }
}
