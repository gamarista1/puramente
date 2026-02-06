package nf;

import io.intercom.android.sdk.models.AttributeType;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6550c;
import mf.C6553f;
import mf.C6559l;
import mf.C6565s;
import zf.C6828a;
import zf.C6831d;

/* renamed from: nf.b  reason: case insensitive filesystem */
public final class C6610b extends C6553f implements List, RandomAccess, Serializable, C6831d {

    /* renamed from: d  reason: collision with root package name */
    private static final C1040b f72225d = new C1040b((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private static final C6610b f72226e;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Object[] f72227a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f72228b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f72229c;

    /* renamed from: nf.b$a */
    public static final class a extends C6553f implements List, RandomAccess, Serializable, C6831d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public Object[] f72230a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final int f72231b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f72232c;

        /* renamed from: d  reason: collision with root package name */
        private final a f72233d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final C6610b f72234e;

        /* renamed from: nf.b$a$a  reason: collision with other inner class name */
        private static final class C1039a implements ListIterator, C6828a {

            /* renamed from: a  reason: collision with root package name */
            private final a f72235a;

            /* renamed from: b  reason: collision with root package name */
            private int f72236b;

            /* renamed from: c  reason: collision with root package name */
            private int f72237c = -1;

            /* renamed from: d  reason: collision with root package name */
            private int f72238d;

            public C1039a(a aVar, int i10) {
                C6496s.h(aVar, AttributeType.LIST);
                this.f72235a = aVar;
                this.f72236b = i10;
                this.f72238d = aVar.modCount;
            }

            private final void a() {
                if (this.f72235a.f72234e.modCount != this.f72238d) {
                    throw new ConcurrentModificationException();
                }
            }

            public void add(Object obj) {
                a();
                a aVar = this.f72235a;
                int i10 = this.f72236b;
                this.f72236b = i10 + 1;
                aVar.add(i10, obj);
                this.f72237c = -1;
                this.f72238d = this.f72235a.modCount;
            }

            public boolean hasNext() {
                if (this.f72236b < this.f72235a.f72232c) {
                    return true;
                }
                return false;
            }

            public boolean hasPrevious() {
                if (this.f72236b > 0) {
                    return true;
                }
                return false;
            }

            public Object next() {
                a();
                if (this.f72236b < this.f72235a.f72232c) {
                    int i10 = this.f72236b;
                    this.f72236b = i10 + 1;
                    this.f72237c = i10;
                    return this.f72235a.f72230a[this.f72235a.f72231b + this.f72237c];
                }
                throw new NoSuchElementException();
            }

            public int nextIndex() {
                return this.f72236b;
            }

            public Object previous() {
                a();
                int i10 = this.f72236b;
                if (i10 > 0) {
                    int i11 = i10 - 1;
                    this.f72236b = i11;
                    this.f72237c = i11;
                    return this.f72235a.f72230a[this.f72235a.f72231b + this.f72237c];
                }
                throw new NoSuchElementException();
            }

            public int previousIndex() {
                return this.f72236b - 1;
            }

            public void remove() {
                a();
                int i10 = this.f72237c;
                if (i10 != -1) {
                    this.f72235a.remove(i10);
                    this.f72236b = this.f72237c;
                    this.f72237c = -1;
                    this.f72238d = this.f72235a.modCount;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }

            public void set(Object obj) {
                a();
                int i10 = this.f72237c;
                if (i10 != -1) {
                    this.f72235a.set(i10, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
        }

        public a(Object[] objArr, int i10, int i11, a aVar, C6610b bVar) {
            C6496s.h(objArr, "backing");
            C6496s.h(bVar, "root");
            this.f72230a = objArr;
            this.f72231b = i10;
            this.f72232c = i11;
            this.f72233d = aVar;
            this.f72234e = bVar;
            this.modCount = bVar.modCount;
        }

        private final void A() {
            if (D()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean C(List list) {
            return C6611c.h(this.f72230a, this.f72231b, this.f72232c, list);
        }

        private final boolean D() {
            return this.f72234e.f72229c;
        }

        private final void E() {
            this.modCount++;
        }

        private final Object H(int i10) {
            Object obj;
            E();
            a aVar = this.f72233d;
            if (aVar != null) {
                obj = aVar.H(i10);
            } else {
                obj = this.f72234e.S(i10);
            }
            this.f72232c--;
            return obj;
        }

        private final void I(int i10, int i11) {
            if (i11 > 0) {
                E();
            }
            a aVar = this.f72233d;
            if (aVar != null) {
                aVar.I(i10, i11);
            } else {
                this.f72234e.W(i10, i11);
            }
            this.f72232c -= i11;
        }

        private final int N(int i10, int i11, Collection collection, boolean z10) {
            int i12;
            a aVar = this.f72233d;
            if (aVar != null) {
                i12 = aVar.N(i10, i11, collection, z10);
            } else {
                i12 = this.f72234e.Z(i10, i11, collection, z10);
            }
            if (i12 > 0) {
                E();
            }
            this.f72232c -= i12;
            return i12;
        }

        private final void v(int i10, Collection collection, int i11) {
            E();
            a aVar = this.f72233d;
            if (aVar != null) {
                aVar.v(i10, collection, i11);
            } else {
                this.f72234e.C(i10, collection, i11);
            }
            this.f72230a = this.f72234e.f72227a;
            this.f72232c += i11;
        }

        private final Object writeReplace() {
            if (D()) {
                return new C6616h(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        private final void x(int i10, Object obj) {
            E();
            a aVar = this.f72233d;
            if (aVar != null) {
                aVar.x(i10, obj);
            } else {
                this.f72234e.D(i10, obj);
            }
            this.f72230a = this.f72234e.f72227a;
            this.f72232c++;
        }

        private final void z() {
            if (this.f72234e.modCount != this.modCount) {
                throw new ConcurrentModificationException();
            }
        }

        public int a() {
            z();
            return this.f72232c;
        }

        public boolean add(Object obj) {
            A();
            z();
            x(this.f72231b + this.f72232c, obj);
            return true;
        }

        public boolean addAll(Collection collection) {
            C6496s.h(collection, "elements");
            A();
            z();
            int size = collection.size();
            v(this.f72231b + this.f72232c, collection, size);
            return size > 0;
        }

        public Object b(int i10) {
            A();
            z();
            C6550c.f72053a.b(i10, this.f72232c);
            return H(this.f72231b + i10);
        }

        public void clear() {
            A();
            z();
            I(this.f72231b, this.f72232c);
        }

        public boolean equals(Object obj) {
            z();
            if (obj == this || ((obj instanceof List) && C((List) obj))) {
                return true;
            }
            return false;
        }

        public Object get(int i10) {
            z();
            C6550c.f72053a.b(i10, this.f72232c);
            return this.f72230a[this.f72231b + i10];
        }

        public int hashCode() {
            z();
            return C6611c.i(this.f72230a, this.f72231b, this.f72232c);
        }

        public int indexOf(Object obj) {
            z();
            for (int i10 = 0; i10 < this.f72232c; i10++) {
                if (C6496s.c(this.f72230a[this.f72231b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            z();
            if (this.f72232c == 0) {
                return true;
            }
            return false;
        }

        public Iterator iterator() {
            return listIterator(0);
        }

        public int lastIndexOf(Object obj) {
            z();
            for (int i10 = this.f72232c - 1; i10 >= 0; i10--) {
                if (C6496s.c(this.f72230a[this.f72231b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        public ListIterator listIterator() {
            return listIterator(0);
        }

        public boolean remove(Object obj) {
            A();
            z();
            int indexOf = indexOf(obj);
            if (indexOf >= 0) {
                remove(indexOf);
            }
            if (indexOf >= 0) {
                return true;
            }
            return false;
        }

        public boolean removeAll(Collection collection) {
            C6496s.h(collection, "elements");
            A();
            z();
            if (N(this.f72231b, this.f72232c, collection, false) > 0) {
                return true;
            }
            return false;
        }

        public boolean retainAll(Collection collection) {
            C6496s.h(collection, "elements");
            A();
            z();
            if (N(this.f72231b, this.f72232c, collection, true) > 0) {
                return true;
            }
            return false;
        }

        public Object set(int i10, Object obj) {
            A();
            z();
            C6550c.f72053a.b(i10, this.f72232c);
            Object[] objArr = this.f72230a;
            int i11 = this.f72231b;
            Object obj2 = objArr[i11 + i10];
            objArr[i11 + i10] = obj;
            return obj2;
        }

        public List subList(int i10, int i11) {
            C6550c.f72053a.d(i10, i11, this.f72232c);
            return new a(this.f72230a, this.f72231b + i10, i11 - i10, this, this.f72234e);
        }

        public Object[] toArray(Object[] objArr) {
            C6496s.h(objArr, "array");
            z();
            int length = objArr.length;
            int i10 = this.f72232c;
            if (length < i10) {
                Object[] objArr2 = this.f72230a;
                int i11 = this.f72231b;
                Object[] copyOfRange = Arrays.copyOfRange(objArr2, i11, i10 + i11, objArr.getClass());
                C6496s.g(copyOfRange, "copyOfRange(...)");
                return copyOfRange;
            }
            Object[] objArr3 = this.f72230a;
            int i12 = this.f72231b;
            C6559l.m(objArr3, objArr, 0, i12, i10 + i12);
            return C6565s.g(this.f72232c, objArr);
        }

        public String toString() {
            z();
            return C6611c.j(this.f72230a, this.f72231b, this.f72232c, this);
        }

        public ListIterator listIterator(int i10) {
            z();
            C6550c.f72053a.c(i10, this.f72232c);
            return new C1039a(this, i10);
        }

        public void add(int i10, Object obj) {
            A();
            z();
            C6550c.f72053a.c(i10, this.f72232c);
            x(this.f72231b + i10, obj);
        }

        public boolean addAll(int i10, Collection collection) {
            C6496s.h(collection, "elements");
            A();
            z();
            C6550c.f72053a.c(i10, this.f72232c);
            int size = collection.size();
            v(this.f72231b + i10, collection, size);
            return size > 0;
        }

        public Object[] toArray() {
            z();
            Object[] objArr = this.f72230a;
            int i10 = this.f72231b;
            return C6559l.s(objArr, i10, this.f72232c + i10);
        }
    }

    /* renamed from: nf.b$b  reason: collision with other inner class name */
    private static final class C1040b {
        public /* synthetic */ C1040b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1040b() {
        }
    }

    /* renamed from: nf.b$c */
    private static final class c implements ListIterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private final C6610b f72239a;

        /* renamed from: b  reason: collision with root package name */
        private int f72240b;

        /* renamed from: c  reason: collision with root package name */
        private int f72241c = -1;

        /* renamed from: d  reason: collision with root package name */
        private int f72242d;

        public c(C6610b bVar, int i10) {
            C6496s.h(bVar, AttributeType.LIST);
            this.f72239a = bVar;
            this.f72240b = i10;
            this.f72242d = bVar.modCount;
        }

        private final void a() {
            if (this.f72239a.modCount != this.f72242d) {
                throw new ConcurrentModificationException();
            }
        }

        public void add(Object obj) {
            a();
            C6610b bVar = this.f72239a;
            int i10 = this.f72240b;
            this.f72240b = i10 + 1;
            bVar.add(i10, obj);
            this.f72241c = -1;
            this.f72242d = this.f72239a.modCount;
        }

        public boolean hasNext() {
            if (this.f72240b < this.f72239a.f72228b) {
                return true;
            }
            return false;
        }

        public boolean hasPrevious() {
            if (this.f72240b > 0) {
                return true;
            }
            return false;
        }

        public Object next() {
            a();
            if (this.f72240b < this.f72239a.f72228b) {
                int i10 = this.f72240b;
                this.f72240b = i10 + 1;
                this.f72241c = i10;
                return this.f72239a.f72227a[this.f72241c];
            }
            throw new NoSuchElementException();
        }

        public int nextIndex() {
            return this.f72240b;
        }

        public Object previous() {
            a();
            int i10 = this.f72240b;
            if (i10 > 0) {
                int i11 = i10 - 1;
                this.f72240b = i11;
                this.f72241c = i11;
                return this.f72239a.f72227a[this.f72241c];
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.f72240b - 1;
        }

        public void remove() {
            a();
            int i10 = this.f72241c;
            if (i10 != -1) {
                this.f72239a.remove(i10);
                this.f72240b = this.f72241c;
                this.f72241c = -1;
                this.f72242d = this.f72239a.modCount;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }

        public void set(Object obj) {
            a();
            int i10 = this.f72241c;
            if (i10 != -1) {
                this.f72239a.set(i10, obj);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
    }

    static {
        C6610b bVar = new C6610b(0);
        bVar.f72229c = true;
        f72226e = bVar;
    }

    public C6610b(int i10) {
        this.f72227a = C6611c.d(i10);
    }

    /* access modifiers changed from: private */
    public final void C(int i10, Collection collection, int i11) {
        R();
        Q(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f72227a[i10 + i12] = it.next();
        }
    }

    /* access modifiers changed from: private */
    public final void D(int i10, Object obj) {
        R();
        Q(i10, 1);
        this.f72227a[i10] = obj;
    }

    private final void H() {
        if (this.f72229c) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean I(List list) {
        return C6611c.h(this.f72227a, 0, this.f72228b, list);
    }

    private final void N(int i10) {
        if (i10 >= 0) {
            Object[] objArr = this.f72227a;
            if (i10 > objArr.length) {
                this.f72227a = C6611c.e(this.f72227a, C6550c.f72053a.e(objArr.length, i10));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void P(int i10) {
        N(this.f72228b + i10);
    }

    private final void Q(int i10, int i11) {
        P(i11);
        Object[] objArr = this.f72227a;
        C6559l.m(objArr, objArr, i10 + i11, i10, this.f72228b);
        this.f72228b += i11;
    }

    private final void R() {
        this.modCount++;
    }

    /* access modifiers changed from: private */
    public final Object S(int i10) {
        R();
        Object[] objArr = this.f72227a;
        Object obj = objArr[i10];
        C6559l.m(objArr, objArr, i10, i10 + 1, this.f72228b);
        C6611c.f(this.f72227a, this.f72228b - 1);
        this.f72228b--;
        return obj;
    }

    /* access modifiers changed from: private */
    public final void W(int i10, int i11) {
        if (i11 > 0) {
            R();
        }
        Object[] objArr = this.f72227a;
        C6559l.m(objArr, objArr, i10, i10 + i11, this.f72228b);
        Object[] objArr2 = this.f72227a;
        int i12 = this.f72228b;
        C6611c.g(objArr2, i12 - i11, i12);
        this.f72228b -= i11;
    }

    /* access modifiers changed from: private */
    public final int Z(int i10, int i11, Collection collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f72227a[i14]) == z10) {
                Object[] objArr = this.f72227a;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f72227a;
        C6559l.m(objArr2, objArr2, i10 + i13, i11 + i10, this.f72228b);
        Object[] objArr3 = this.f72227a;
        int i16 = this.f72228b;
        C6611c.g(objArr3, i16 - i15, i16);
        if (i15 > 0) {
            R();
        }
        this.f72228b -= i15;
        return i15;
    }

    private final Object writeReplace() {
        if (this.f72229c) {
            return new C6616h(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    public final List E() {
        H();
        this.f72229c = true;
        if (this.f72228b > 0) {
            return this;
        }
        return f72226e;
    }

    public int a() {
        return this.f72228b;
    }

    public boolean add(Object obj) {
        H();
        D(this.f72228b, obj);
        return true;
    }

    public boolean addAll(Collection collection) {
        C6496s.h(collection, "elements");
        H();
        int size = collection.size();
        C(this.f72228b, collection, size);
        return size > 0;
    }

    public Object b(int i10) {
        H();
        C6550c.f72053a.b(i10, this.f72228b);
        return S(i10);
    }

    public void clear() {
        H();
        W(0, this.f72228b);
    }

    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof List) && I((List) obj))) {
            return true;
        }
        return false;
    }

    public Object get(int i10) {
        C6550c.f72053a.b(i10, this.f72228b);
        return this.f72227a[i10];
    }

    public int hashCode() {
        return C6611c.i(this.f72227a, 0, this.f72228b);
    }

    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f72228b; i10++) {
            if (C6496s.c(this.f72227a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (this.f72228b == 0) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        for (int i10 = this.f72228b - 1; i10 >= 0; i10--) {
            if (C6496s.c(this.f72227a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public boolean remove(Object obj) {
        H();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    public boolean removeAll(Collection collection) {
        C6496s.h(collection, "elements");
        H();
        if (Z(0, this.f72228b, collection, false) > 0) {
            return true;
        }
        return false;
    }

    public boolean retainAll(Collection collection) {
        C6496s.h(collection, "elements");
        H();
        if (Z(0, this.f72228b, collection, true) > 0) {
            return true;
        }
        return false;
    }

    public Object set(int i10, Object obj) {
        H();
        C6550c.f72053a.b(i10, this.f72228b);
        Object[] objArr = this.f72227a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public List subList(int i10, int i11) {
        C6550c.f72053a.d(i10, i11, this.f72228b);
        return new a(this.f72227a, i10, i11 - i10, (a) null, this);
    }

    public Object[] toArray(Object[] objArr) {
        C6496s.h(objArr, "array");
        int length = objArr.length;
        int i10 = this.f72228b;
        if (length < i10) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f72227a, 0, i10, objArr.getClass());
            C6496s.g(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        C6559l.m(this.f72227a, objArr, 0, 0, i10);
        return C6565s.g(this.f72228b, objArr);
    }

    public String toString() {
        return C6611c.j(this.f72227a, 0, this.f72228b, this);
    }

    public ListIterator listIterator(int i10) {
        C6550c.f72053a.c(i10, this.f72228b);
        return new c(this, i10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6610b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    public void add(int i10, Object obj) {
        H();
        C6550c.f72053a.c(i10, this.f72228b);
        D(i10, obj);
    }

    public boolean addAll(int i10, Collection collection) {
        C6496s.h(collection, "elements");
        H();
        C6550c.f72053a.c(i10, this.f72228b);
        int size = collection.size();
        C(i10, collection, size);
        return size > 0;
    }

    public Object[] toArray() {
        return C6559l.s(this.f72227a, 0, this.f72228b);
    }
}
