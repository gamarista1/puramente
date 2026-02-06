package C7;

import kotlin.jvm.internal.C6496s;
import x1.e;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f30083a;

    /* renamed from: b  reason: collision with root package name */
    private int f30084b;

    public b(int i10) {
        this.f30083a = new Object[i10];
    }

    public synchronized boolean a(Object obj) {
        C6496s.h(obj, "instance");
        int i10 = this.f30084b;
        Object[] objArr = this.f30083a;
        if (i10 == objArr.length) {
            return false;
        }
        objArr[i10] = obj;
        this.f30084b = i10 + 1;
        return true;
    }

    public synchronized Object b() {
        int i10 = this.f30084b;
        if (i10 == 0) {
            return null;
        }
        int i11 = i10 - 1;
        this.f30084b = i11;
        Object obj = this.f30083a[i11];
        C6496s.f(obj, "null cannot be cast to non-null type T of com.facebook.react.common.ClearableSynchronizedPool");
        this.f30083a[i11] = null;
        return obj;
    }

    public final synchronized void c() {
        try {
            int i10 = this.f30084b;
            for (int i11 = 0; i11 < i10; i11++) {
                this.f30083a[i11] = null;
            }
            this.f30084b = 0;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }
}
