package Cd;

import javax.inject.Provider;

public final class a implements Provider {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f50398c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Provider f50399a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f50400b = f50398c;

    private a(Provider provider) {
        this.f50399a = provider;
    }

    public static Provider a(Provider provider) {
        b.b(provider);
        if (provider instanceof a) {
            return provider;
        }
        return new a(provider);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f50398c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public Object get() {
        Object obj = this.f50400b;
        Object obj2 = f50398c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f50400b;
                    if (obj == obj2) {
                        obj = this.f50399a.get();
                        this.f50400b = b(this.f50400b, obj);
                        this.f50399a = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return obj;
    }
}
