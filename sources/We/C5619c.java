package We;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: We.c  reason: case insensitive filesystem */
final class C5619c extends AbstractCollection implements Queue, Serializable {
    private static final long serialVersionUID = -8423413834657610406L;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public transient Object[] f65806a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public transient int f65807b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public transient int f65808c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public transient boolean f65809d = false;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final int f65810e;

    /* renamed from: We.c$a */
    class a implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        private int f65811a;

        /* renamed from: b  reason: collision with root package name */
        private int f65812b = -1;

        /* renamed from: c  reason: collision with root package name */
        private boolean f65813c;

        a() {
            this.f65811a = C5619c.this.f65807b;
            this.f65813c = C5619c.this.f65809d;
        }

        public boolean hasNext() {
            if (this.f65813c || this.f65811a != C5619c.this.f65808c) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (hasNext()) {
                this.f65813c = false;
                int i10 = this.f65811a;
                this.f65812b = i10;
                this.f65811a = C5619c.this.v(i10);
                return C5619c.this.f65806a[this.f65812b];
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            int i10 = this.f65812b;
            if (i10 == -1) {
                throw new IllegalStateException();
            } else if (i10 == C5619c.this.f65807b) {
                C5619c.this.remove();
                this.f65812b = -1;
            } else {
                int i11 = this.f65812b + 1;
                if (C5619c.this.f65807b >= this.f65812b || i11 >= C5619c.this.f65808c) {
                    while (i11 != C5619c.this.f65808c) {
                        if (i11 >= C5619c.this.f65810e) {
                            C5619c.this.f65806a[i11 - 1] = C5619c.this.f65806a[0];
                            i11 = 0;
                        } else {
                            C5619c.this.f65806a[C5619c.this.t(i11)] = C5619c.this.f65806a[i11];
                            i11 = C5619c.this.v(i11);
                        }
                    }
                } else {
                    System.arraycopy(C5619c.this.f65806a, i11, C5619c.this.f65806a, this.f65812b, C5619c.this.f65808c - i11);
                }
                this.f65812b = -1;
                C5619c cVar = C5619c.this;
                int unused = cVar.f65808c = cVar.t(cVar.f65808c);
                C5619c.this.f65806a[C5619c.this.f65808c] = null;
                boolean unused2 = C5619c.this.f65809d = false;
                this.f65811a = C5619c.this.t(this.f65811a);
            }
        }
    }

    C5619c(int i10) {
        if (i10 > 0) {
            Object[] objArr = new Object[i10];
            this.f65806a = objArr;
            this.f65810e = objArr.length;
            return;
        }
        throw new IllegalArgumentException("The size must be greater than 0");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        boolean z10;
        objectInputStream.defaultReadObject();
        this.f65806a = new Object[this.f65810e];
        int readInt = objectInputStream.readInt();
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f65806a[i10] = objectInputStream.readObject();
        }
        this.f65807b = 0;
        if (readInt == this.f65810e) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f65809d = z10;
        if (z10) {
            this.f65808c = 0;
        } else {
            this.f65808c = readInt;
        }
    }

    /* access modifiers changed from: private */
    public int t(int i10) {
        int i11 = i10 - 1;
        if (i11 < 0) {
            return this.f65810e - 1;
        }
        return i11;
    }

    /* access modifiers changed from: private */
    public int v(int i10) {
        int i11 = i10 + 1;
        if (i11 >= this.f65810e) {
            return 0;
        }
        return i11;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public boolean add(Object obj) {
        if (obj != null) {
            if (x()) {
                remove();
            }
            Object[] objArr = this.f65806a;
            int i10 = this.f65808c;
            int i11 = i10 + 1;
            this.f65808c = i11;
            objArr[i10] = obj;
            if (i11 >= this.f65810e) {
                this.f65808c = 0;
            }
            if (this.f65808c == this.f65807b) {
                this.f65809d = true;
            }
            return true;
        }
        throw new NullPointerException("Attempted to add null object to queue");
    }

    public void clear() {
        this.f65809d = false;
        this.f65807b = 0;
        this.f65808c = 0;
        Arrays.fill(this.f65806a, (Object) null);
    }

    public Object element() {
        if (!isEmpty()) {
            return peek();
        }
        throw new NoSuchElementException("queue is empty");
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return new a();
    }

    public boolean offer(Object obj) {
        return add(obj);
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f65806a[this.f65807b];
    }

    public Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    public Object remove() {
        if (!isEmpty()) {
            Object[] objArr = this.f65806a;
            int i10 = this.f65807b;
            Object obj = objArr[i10];
            if (obj != null) {
                int i11 = i10 + 1;
                this.f65807b = i11;
                objArr[i10] = null;
                if (i11 >= this.f65810e) {
                    this.f65807b = 0;
                }
                this.f65809d = false;
            }
            return obj;
        }
        throw new NoSuchElementException("queue is empty");
    }

    public int size() {
        int i10;
        int i11 = this.f65808c;
        int i12 = this.f65807b;
        if (i11 < i12) {
            return (this.f65810e - i12) + i11;
        }
        if (i11 != i12) {
            return i11 - i12;
        }
        if (this.f65809d) {
            i10 = this.f65810e;
        } else {
            i10 = 0;
        }
        return i10;
    }

    public boolean x() {
        if (size() == this.f65810e) {
            return true;
        }
        return false;
    }
}
