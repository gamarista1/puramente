package c0;

import b0.C1865c;
import b0.C1867e;
import f0.C1957a;
import f0.d;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import yf.C6798l;

public final class j extends C1888b implements C1865c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f19199c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f19200d = 8;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final j f19201e = new j(new Object[0]);

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f19202b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            return j.f19201e;
        }

        private a() {
        }
    }

    public j(Object[] objArr) {
        boolean z10;
        this.f19202b = objArr;
        if (objArr.length <= 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        C1957a.a(z10);
    }

    private final Object[] g(int i10) {
        return new Object[i10];
    }

    public C1867e J(C6798l lVar) {
        Object[] objArr = this.f19202b;
        int size = size();
        int size2 = size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size2; i10++) {
            Object obj = this.f19202b[i10];
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                if (!z10) {
                    Object[] objArr2 = this.f19202b;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    C6496s.g(objArr, "copyOf(this, size)");
                    z10 = true;
                    size = i10;
                }
            } else if (z10) {
                objArr[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        if (size == 0) {
            return f19201e;
        }
        return new j(C6559l.s(objArr, 0, size));
    }

    public int a() {
        return this.f19202b.length;
    }

    public C1867e add(Object obj) {
        if (size() < 32) {
            Object[] copyOf = Arrays.copyOf(this.f19202b, size() + 1);
            C6496s.g(copyOf, "copyOf(this, newSize)");
            copyOf[size()] = obj;
            return new j(copyOf);
        }
        return new C1891e(this.f19202b, l.c(obj), size() + 1, 0);
    }

    public C1867e addAll(Collection collection) {
        if (size() + collection.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.f19202b, size() + collection.size());
            C6496s.g(copyOf, "copyOf(this, newSize)");
            int size = size();
            for (Object obj : collection) {
                copyOf[size] = obj;
                size++;
            }
            return new j(copyOf);
        }
        C1867e.a builder = builder();
        builder.addAll(collection);
        return builder.f();
    }

    public C1867e.a builder() {
        return new f(this, (Object[]) null, this.f19202b, 0);
    }

    public Object get(int i10) {
        d.a(i10, size());
        return this.f19202b[i10];
    }

    public int indexOf(Object obj) {
        return C6559l.q0(this.f19202b, obj);
    }

    public int lastIndexOf(Object obj) {
        return C6559l.Q0(this.f19202b, obj);
    }

    public ListIterator listIterator(int i10) {
        d.b(i10, size());
        return new C1889c(this.f19202b, i10, size());
    }

    public C1867e set(int i10, Object obj) {
        d.a(i10, size());
        Object[] objArr = this.f19202b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C6496s.g(copyOf, "copyOf(this, size)");
        copyOf[i10] = obj;
        return new j(copyOf);
    }

    public C1867e y(int i10) {
        d.a(i10, size());
        if (size() == 1) {
            return f19201e;
        }
        Object[] copyOf = Arrays.copyOf(this.f19202b, size() - 1);
        C6496s.g(copyOf, "copyOf(this, newSize)");
        C6559l.m(this.f19202b, copyOf, i10, i10 + 1, size());
        return new j(copyOf);
    }

    public C1867e add(int i10, Object obj) {
        d.b(i10, size());
        if (i10 == size()) {
            return add(obj);
        }
        if (size() < 32) {
            Object[] g10 = g(size() + 1);
            C6559l.q(this.f19202b, g10, 0, 0, i10, 6, (Object) null);
            C6559l.m(this.f19202b, g10, i10 + 1, i10, size());
            g10[i10] = obj;
            return new j(g10);
        }
        Object[] objArr = this.f19202b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C6496s.g(copyOf, "copyOf(this, size)");
        C6559l.m(this.f19202b, copyOf, i10 + 1, i10, size() - 1);
        copyOf[i10] = obj;
        return new C1891e(copyOf, l.c(this.f19202b[31]), size() + 1, 0);
    }
}
