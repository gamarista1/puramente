package a9;

import javax.inject.Provider;

/* renamed from: a9.a  reason: case insensitive filesystem */
public final class C3141a implements Provider {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f36175c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Provider f36176a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f36177b = f36175c;

    private C3141a(Provider provider) {
        this.f36176a = provider;
    }

    public static Provider a(Provider provider) {
        C3144d.b(provider);
        if (provider instanceof C3141a) {
            return provider;
        }
        return new C3141a(provider);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f36175c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public Object get() {
        Object obj = this.f36177b;
        Object obj2 = f36175c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f36177b;
                    if (obj == obj2) {
                        obj = this.f36176a.get();
                        this.f36177b = b(this.f36177b, obj);
                        this.f36176a = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return obj;
    }
}
