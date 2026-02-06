package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

final class b0 extends C1730c implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final b0 f16314d;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f16315b;

    /* renamed from: c  reason: collision with root package name */
    private int f16316c;

    static {
        b0 b0Var = new b0(new Object[0], 0);
        f16314d = b0Var;
        b0Var.l();
    }

    private b0(Object[] objArr, int i10) {
        this.f16315b = objArr;
        this.f16316c = i10;
    }

    private static Object[] b(int i10) {
        return new Object[i10];
    }

    public static b0 d() {
        return f16314d;
    }

    private void g(int i10) {
        if (i10 < 0 || i10 >= this.f16316c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    private String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f16316c;
    }

    public boolean add(Object obj) {
        a();
        int i10 = this.f16316c;
        Object[] objArr = this.f16315b;
        if (i10 == objArr.length) {
            this.f16315b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f16315b;
        int i11 = this.f16316c;
        this.f16316c = i11 + 1;
        objArr2[i11] = obj;
        this.modCount++;
        return true;
    }

    public Object get(int i10) {
        g(i10);
        return this.f16315b[i10];
    }

    /* renamed from: k */
    public b0 c(int i10) {
        if (i10 >= this.f16316c) {
            return new b0(Arrays.copyOf(this.f16315b, i10), this.f16316c);
        }
        throw new IllegalArgumentException();
    }

    public Object remove(int i10) {
        a();
        g(i10);
        Object[] objArr = this.f16315b;
        Object obj = objArr[i10];
        int i11 = this.f16316c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f16316c--;
        this.modCount++;
        return obj;
    }

    public Object set(int i10, Object obj) {
        a();
        g(i10);
        Object[] objArr = this.f16315b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        this.modCount++;
        return obj2;
    }

    public int size() {
        return this.f16316c;
    }

    public void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f16316c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        Object[] objArr = this.f16315b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] b10 = b(((i11 * 3) / 2) + 1);
            System.arraycopy(this.f16315b, 0, b10, 0, i10);
            System.arraycopy(this.f16315b, i10, b10, i10 + 1, this.f16316c - i10);
            this.f16315b = b10;
        }
        this.f16315b[i10] = obj;
        this.f16316c++;
        this.modCount++;
    }
}
