package Pg;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public class k extends AbstractList implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private int f64702a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Object f64703b;

    private static class b implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        private static final b f64704a = new b();

        private b() {
        }

        public static b a() {
            return f64704a;
        }

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new IllegalStateException();
        }
    }

    private class c extends d {

        /* renamed from: b  reason: collision with root package name */
        private final int f64705b;

        public c() {
            super();
            this.f64705b = k.this.modCount;
        }

        /* access modifiers changed from: protected */
        public void a() {
            if (k.this.modCount != this.f64705b) {
                throw new ConcurrentModificationException("ModCount: " + k.this.modCount + "; expected: " + this.f64705b);
            }
        }

        /* access modifiers changed from: protected */
        public Object b() {
            return k.this.f64703b;
        }

        public void remove() {
            a();
            k.this.clear();
        }
    }

    private static abstract class d implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        private boolean f64707a;

        private d() {
        }

        /* access modifiers changed from: protected */
        public abstract void a();

        /* access modifiers changed from: protected */
        public abstract Object b();

        public final boolean hasNext() {
            return !this.f64707a;
        }

        public final Object next() {
            if (!this.f64707a) {
                this.f64707a = true;
                a();
                return b();
            }
            throw new NoSuchElementException();
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i10 == 2 || i10 == 3) {
            objArr[1] = "iterator";
        } else if (i10 == 5 || i10 == 6 || i10 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) {
            th2 = new IllegalStateException(format);
        } else {
            th2 = new IllegalArgumentException(format);
        }
        throw th2;
    }

    public boolean add(Object obj) {
        int i10 = this.f64702a;
        if (i10 == 0) {
            this.f64703b = obj;
        } else if (i10 == 1) {
            this.f64703b = new Object[]{this.f64703b, obj};
        } else {
            Object[] objArr = (Object[]) this.f64703b;
            int length = objArr.length;
            if (i10 >= length) {
                int i11 = ((length * 3) / 2) + 1;
                int i12 = i10 + 1;
                if (i11 < i12) {
                    i11 = i12;
                }
                Object[] objArr2 = new Object[i11];
                this.f64703b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f64702a] = obj;
        }
        this.f64702a++;
        this.modCount++;
        return true;
    }

    public void clear() {
        this.f64703b = null;
        this.f64702a = 0;
        this.modCount++;
    }

    public Object get(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f64702a)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f64702a);
        } else if (i11 == 1) {
            return this.f64703b;
        } else {
            return ((Object[]) this.f64703b)[i10];
        }
    }

    public Iterator iterator() {
        int i10 = this.f64702a;
        if (i10 == 0) {
            b a10 = b.a();
            if (a10 == null) {
                a(2);
            }
            return a10;
        } else if (i10 == 1) {
            return new c();
        } else {
            Iterator it = super.iterator();
            if (it == null) {
                a(3);
            }
            return it;
        }
    }

    public Object remove(int i10) {
        int i11;
        Object obj;
        if (i10 < 0 || i10 >= (i11 = this.f64702a)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f64702a);
        }
        if (i11 == 1) {
            obj = this.f64703b;
            this.f64703b = null;
        } else {
            Object[] objArr = (Object[]) this.f64703b;
            Object obj2 = objArr[i10];
            if (i11 == 2) {
                this.f64703b = objArr[1 - i10];
            } else {
                int i12 = (i11 - i10) - 1;
                if (i12 > 0) {
                    System.arraycopy(objArr, i10 + 1, objArr, i10, i12);
                }
                objArr[this.f64702a - 1] = null;
            }
            obj = obj2;
        }
        this.f64702a--;
        this.modCount++;
        return obj;
    }

    public Object set(int i10, Object obj) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f64702a)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f64702a);
        } else if (i11 == 1) {
            Object obj2 = this.f64703b;
            this.f64703b = obj;
            return obj2;
        } else {
            Object[] objArr = (Object[]) this.f64703b;
            Object obj3 = objArr[i10];
            objArr[i10] = obj;
            return obj3;
        }
    }

    public int size() {
        return this.f64702a;
    }

    public void sort(Comparator comparator) {
        int i10 = this.f64702a;
        if (i10 >= 2) {
            Arrays.sort((Object[]) this.f64703b, 0, i10, comparator);
        }
    }

    public Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            a(4);
        }
        int length = objArr.length;
        int i10 = this.f64702a;
        if (i10 == 1) {
            if (length != 0) {
                objArr[0] = this.f64703b;
            } else {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.f64703b;
                return objArr2;
            }
        } else if (length < i10) {
            Object[] copyOf = Arrays.copyOf((Object[]) this.f64703b, i10, objArr.getClass());
            if (copyOf == null) {
                a(6);
            }
            return copyOf;
        } else if (i10 != 0) {
            System.arraycopy(this.f64703b, 0, objArr, 0, i10);
        }
        int i11 = this.f64702a;
        if (length > i11) {
            objArr[i11] = null;
        }
        return objArr;
    }

    public void add(int i10, Object obj) {
        int i11;
        if (i10 < 0 || i10 > (i11 = this.f64702a)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f64702a);
        }
        if (i11 == 0) {
            this.f64703b = obj;
        } else if (i11 == 1 && i10 == 0) {
            this.f64703b = new Object[]{obj, this.f64703b};
        } else {
            Object[] objArr = new Object[(i11 + 1)];
            if (i11 == 1) {
                objArr[0] = this.f64703b;
            } else {
                Object[] objArr2 = (Object[]) this.f64703b;
                System.arraycopy(objArr2, 0, objArr, 0, i10);
                System.arraycopy(objArr2, i10, objArr, i10 + 1, this.f64702a - i10);
            }
            objArr[i10] = obj;
            this.f64703b = objArr;
        }
        this.f64702a++;
        this.modCount++;
    }
}
