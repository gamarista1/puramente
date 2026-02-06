package c0;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;

public final class k extends C1887a {

    /* renamed from: c  reason: collision with root package name */
    private int f19203c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f19204d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f19205e;

    public k(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        boolean z10;
        this.f19203c = i12;
        Object[] objArr2 = new Object[i12];
        this.f19204d = objArr2;
        if (i10 == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f19205e = z10;
        objArr2[0] = objArr;
        l(i10 - (z10 ? 1 : 0), 1);
    }

    private final Object k() {
        Object obj = this.f19204d[this.f19203c - 1];
        C6496s.f(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[c() & 31];
    }

    private final void l(int i10, int i11) {
        int i12 = (this.f19203c - i11) * 5;
        while (i11 < this.f19203c) {
            Object[] objArr = this.f19204d;
            Object[] objArr2 = objArr[i11 - 1];
            C6496s.f(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = objArr2[l.a(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    private final void n(int i10) {
        int i11 = 0;
        while (l.a(c(), i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            l(c(), ((this.f19203c - 1) - (i11 / 5)) + 1);
        }
    }

    public Object next() {
        if (hasNext()) {
            Object k10 = k();
            g(c() + 1);
            if (c() == e()) {
                this.f19205e = true;
                return k10;
            }
            n(0);
            return k10;
        }
        throw new NoSuchElementException();
    }

    public final void o(Object[] objArr, int i10, int i11, int i12) {
        g(i10);
        j(i11);
        this.f19203c = i12;
        if (this.f19204d.length < i12) {
            this.f19204d = new Object[i12];
        }
        boolean z10 = false;
        this.f19204d[0] = objArr;
        if (i10 == i11) {
            z10 = true;
        }
        this.f19205e = z10;
        l(i10 - (z10 ? 1 : 0), 1);
    }

    public Object previous() {
        if (hasPrevious()) {
            g(c() - 1);
            if (this.f19205e) {
                this.f19205e = false;
                return k();
            }
            n(31);
            return k();
        }
        throw new NoSuchElementException();
    }
}
