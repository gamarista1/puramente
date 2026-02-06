package androidx.core.util;

import kotlin.jvm.internal.C6496s;
import x1.e;

public class Pools$SimplePool implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f15978a;

    /* renamed from: b  reason: collision with root package name */
    private int f15979b;

    public Pools$SimplePool(int i10) {
        if (i10 > 0) {
            this.f15978a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private final boolean c(Object obj) {
        int i10 = this.f15979b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f15978a[i11] == obj) {
                return true;
            }
        }
        return false;
    }

    public boolean a(Object obj) {
        C6496s.h(obj, "instance");
        if (!c(obj)) {
            int i10 = this.f15979b;
            Object[] objArr = this.f15978a;
            if (i10 >= objArr.length) {
                return false;
            }
            objArr[i10] = obj;
            this.f15979b = i10 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public Object b() {
        int i10 = this.f15979b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = this.f15978a[i11];
        C6496s.f(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f15978a[i11] = null;
        this.f15979b--;
        return obj;
    }
}
