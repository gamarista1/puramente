package pg;

import com.adjust.sdk.Constants;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: pg.d  reason: case insensitive filesystem */
public abstract class C6642d implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    public static final C6642d f72492a = new o(new byte[0]);

    /* renamed from: pg.d$a */
    public interface a extends Iterator {
        byte nextByte();
    }

    C6642d() {
    }

    private static C6642d a(Iterator it, int i10) {
        if (i10 == 1) {
            return (C6642d) it.next();
        }
        int i11 = i10 >>> 1;
        return a(it, i11).b(a(it, i10 - i11));
    }

    public static C6642d d(Iterable iterable) {
        Collection collection;
        if (!(iterable instanceof Collection)) {
            collection = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                collection.add((C6642d) it.next());
            }
        } else {
            collection = (Collection) iterable;
        }
        if (collection.isEmpty()) {
            return f72492a;
        }
        return a(collection.iterator(), collection.size());
    }

    public static C6642d g(byte[] bArr) {
        return h(bArr, 0, bArr.length);
    }

    public static C6642d h(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new o(bArr2);
    }

    public static C6642d k(String str) {
        try {
            return new o(str.getBytes(Constants.ENCODING));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public static b x() {
        return new b(128);
    }

    /* access modifiers changed from: protected */
    public abstract int A(int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public abstract int C();

    public byte[] D() {
        int size = size();
        if (size == 0) {
            return C6648j.f72547a;
        }
        byte[] bArr = new byte[size];
        n(bArr, 0, 0, size);
        return bArr;
    }

    public abstract String E(String str);

    public String H() {
        try {
            return E(Constants.ENCODING);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public void I(OutputStream outputStream, int i10, int i11) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i11 >= 0) {
            int i12 = i10 + i11;
            if (i12 > size()) {
                StringBuilder sb3 = new StringBuilder(39);
                sb3.append("Source end offset exceeded: ");
                sb3.append(i12);
                throw new IndexOutOfBoundsException(sb3.toString());
            } else if (i11 > 0) {
                N(outputStream, i10, i11);
            }
        } else {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i11);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void N(OutputStream outputStream, int i10, int i11);

    public C6642d b(C6642d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return t.S(this, dVar);
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append("+");
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public void m(byte[] bArr, int i10, int i11, int i12) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        } else if (i12 >= 0) {
            int i13 = i10 + i12;
            if (i13 <= size()) {
                int i14 = i11 + i12;
                if (i14 > bArr.length) {
                    StringBuilder sb4 = new StringBuilder(34);
                    sb4.append("Target end offset < 0: ");
                    sb4.append(i14);
                    throw new IndexOutOfBoundsException(sb4.toString());
                } else if (i12 > 0) {
                    n(bArr, i10, i11, i12);
                }
            } else {
                StringBuilder sb5 = new StringBuilder(34);
                sb5.append("Source end offset < 0: ");
                sb5.append(i13);
                throw new IndexOutOfBoundsException(sb5.toString());
            }
        } else {
            StringBuilder sb6 = new StringBuilder(23);
            sb6.append("Length < 0: ");
            sb6.append(i12);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    /* access modifiers changed from: protected */
    public abstract void n(byte[] bArr, int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public abstract int r();

    public abstract int size();

    /* access modifiers changed from: protected */
    public abstract boolean t();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public abstract boolean v();

    /* access modifiers changed from: protected */
    public abstract int z(int i10, int i11, int i12);

    /* renamed from: pg.d$b */
    public static final class b extends OutputStream {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f72493f = new byte[0];

        /* renamed from: a  reason: collision with root package name */
        private final int f72494a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList f72495b;

        /* renamed from: c  reason: collision with root package name */
        private int f72496c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f72497d;

        /* renamed from: e  reason: collision with root package name */
        private int f72498e;

        b(int i10) {
            if (i10 >= 0) {
                this.f72494a = i10;
                this.f72495b = new ArrayList();
                this.f72497d = new byte[i10];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        private byte[] a(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            return bArr2;
        }

        private void b(int i10) {
            this.f72495b.add(new o(this.f72497d));
            int length = this.f72496c + this.f72497d.length;
            this.f72496c = length;
            this.f72497d = new byte[Math.max(this.f72494a, Math.max(i10, length >>> 1))];
            this.f72498e = 0;
        }

        private void f() {
            int i10 = this.f72498e;
            byte[] bArr = this.f72497d;
            if (i10 >= bArr.length) {
                this.f72495b.add(new o(this.f72497d));
                this.f72497d = f72493f;
            } else if (i10 > 0) {
                this.f72495b.add(new o(a(bArr, i10)));
            }
            this.f72496c += this.f72498e;
            this.f72498e = 0;
        }

        public synchronized C6642d n() {
            f();
            return C6642d.d(this.f72495b);
        }

        public synchronized int size() {
            return this.f72496c + this.f72498e;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
        }

        public synchronized void write(int i10) {
            try {
                if (this.f72498e == this.f72497d.length) {
                    b(1);
                }
                byte[] bArr = this.f72497d;
                int i11 = this.f72498e;
                this.f72498e = i11 + 1;
                bArr[i11] = (byte) i10;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }

        public synchronized void write(byte[] bArr, int i10, int i11) {
            try {
                byte[] bArr2 = this.f72497d;
                int length = bArr2.length;
                int i12 = this.f72498e;
                if (i11 <= length - i12) {
                    System.arraycopy(bArr, i10, bArr2, i12, i11);
                    this.f72498e += i11;
                } else {
                    int length2 = bArr2.length - i12;
                    System.arraycopy(bArr, i10, bArr2, i12, length2);
                    int i13 = i11 - length2;
                    b(i13);
                    System.arraycopy(bArr, i10 + length2, this.f72497d, 0, i13);
                    this.f72498e = i13;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }
}
