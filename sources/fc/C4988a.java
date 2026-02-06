package fc;

import javax.inject.Provider;

/* renamed from: fc.a  reason: case insensitive filesystem */
public final class C4988a implements Provider {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f60526c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Provider f60527a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f60528b = f60526c;

    private C4988a(Provider provider) {
        this.f60527a = provider;
    }

    public static Provider a(Provider provider) {
        d.b(provider);
        if (provider instanceof C4988a) {
            return provider;
        }
        return new C4988a(provider);
    }

    private static Object b(Object obj, Object obj2) {
        if (obj == f60526c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public Object get() {
        Object obj = this.f60528b;
        Object obj2 = f60526c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f60528b;
                    if (obj == obj2) {
                        obj = this.f60527a.get();
                        this.f60528b = b(this.f60528b, obj);
                        this.f60527a = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return obj;
    }
}
