package o5;

public abstract class f {

    class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private volatile Object f47041a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f47042b;

        a(b bVar) {
            this.f47042b = bVar;
        }

        public Object get() {
            if (this.f47041a == null) {
                synchronized (this) {
                    try {
                        if (this.f47041a == null) {
                            this.f47041a = k.d(this.f47042b.get());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f47041a;
        }
    }

    public interface b {
        Object get();
    }

    public static b a(b bVar) {
        return new a(bVar);
    }
}
