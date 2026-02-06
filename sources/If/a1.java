package If;

import java.lang.ref.SoftReference;
import yf.C6787a;

public abstract class a1 {

    public static class a extends b implements C6787a {

        /* renamed from: b  reason: collision with root package name */
        private final C6787a f63645b;

        /* renamed from: c  reason: collision with root package name */
        private volatile SoftReference f63646c;

        public a(Object obj, C6787a aVar) {
            if (aVar == null) {
                e(0);
            }
            this.f63646c = null;
            this.f63645b = aVar;
            if (obj != null) {
                this.f63646c = new SoftReference(a(obj));
            }
        }

        private static /* synthetic */ void e(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"}));
        }

        public Object invoke() {
            Object obj;
            SoftReference softReference = this.f63646c;
            if (softReference != null && (obj = softReference.get()) != null) {
                return c(obj);
            }
            Object invoke = this.f63645b.invoke();
            this.f63646c = new SoftReference(a(invoke));
            return invoke;
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        private static final Object f63647a = new a();

        static class a {
            a() {
            }
        }

        /* access modifiers changed from: protected */
        public Object a(Object obj) {
            if (obj == null) {
                return f63647a;
            }
            return obj;
        }

        public final Object b(Object obj, Object obj2) {
            return invoke();
        }

        /* access modifiers changed from: protected */
        public Object c(Object obj) {
            if (obj == f63647a) {
                return null;
            }
            return obj;
        }

        public abstract Object invoke();
    }

    private static /* synthetic */ void a(int i10) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"}));
    }

    public static a b(Object obj, C6787a aVar) {
        if (aVar == null) {
            a(0);
        }
        return new a(obj, aVar);
    }

    public static a c(C6787a aVar) {
        if (aVar == null) {
            a(1);
        }
        return b((Object) null, aVar);
    }
}
