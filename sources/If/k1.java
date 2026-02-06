package If;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C6496s;

final class k1 {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f63701a;

    /* renamed from: b  reason: collision with root package name */
    private final int f63702b;

    /* renamed from: c  reason: collision with root package name */
    private ClassLoader f63703c;

    public k1(ClassLoader classLoader) {
        C6496s.h(classLoader, "classLoader");
        this.f63701a = new WeakReference(classLoader);
        this.f63702b = System.identityHashCode(classLoader);
        this.f63703c = classLoader;
    }

    public final void a(ClassLoader classLoader) {
        this.f63703c = classLoader;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k1) || this.f63701a.get() != ((k1) obj).f63701a.get()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f63702b;
    }

    public String toString() {
        String obj;
        ClassLoader classLoader = (ClassLoader) this.f63701a.get();
        if (classLoader == null || (obj = classLoader.toString()) == null) {
            return "<null>";
        }
        return obj;
    }
}
