package com.google.android.play.integrity.internal;

/* renamed from: com.google.android.play.integrity.internal.i  reason: case insensitive filesystem */
public final class C4746i implements m {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f56582c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile m f56583a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f56584b = f56582c;

    private C4746i(m mVar) {
        this.f56583a = mVar;
    }

    public static m b(m mVar) {
        return mVar instanceof C4746i ? mVar : new C4746i(mVar);
    }

    public final Object a() {
        Object obj = this.f56584b;
        Object obj2 = f56582c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f56584b;
                    if (obj == obj2) {
                        obj = this.f56583a.a();
                        Object obj3 = this.f56584b;
                        if (obj3 != obj2) {
                            if (obj3 != obj) {
                                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                            }
                        }
                        this.f56584b = obj;
                        this.f56583a = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return obj;
    }
}
