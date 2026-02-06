package Pg;

public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f64714a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f64715b = false;

    static class a {
        a() {
        }

        public String toString() {
            return "NULL_VALUE";
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Throwable f64716a;

        /* synthetic */ b(Throwable th2, a aVar) {
            this(th2);
        }

        private static /* synthetic */ void a(int i10) {
            String str;
            int i11;
            Throwable th2;
            if (i10 != 1) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i10 != 1) {
                i11 = 3;
            } else {
                i11 = 2;
            }
            Object[] objArr = new Object[i11];
            if (i10 != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i10 != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 != 1) {
                th2 = new IllegalArgumentException(format);
            } else {
                th2 = new IllegalStateException(format);
            }
            throw th2;
        }

        public Throwable b() {
            Throwable th2 = this.f64716a;
            if (th2 == null) {
                a(1);
            }
            return th2;
        }

        public String toString() {
            return this.f64716a.toString();
        }

        private b(Throwable th2) {
            if (th2 == null) {
                a(0);
            }
            this.f64716a = th2;
        }
    }

    public static class c extends RuntimeException {
        public c(Throwable th2) {
            super("Rethrow stored exception", th2);
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 == 1 || i10 == 2) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i10 == 1 || i10 == 2) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i10 != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i10 == 1 || i10 == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (!(i10 == 1 || i10 == 2)) {
            if (i10 == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i10 != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String format = String.format(str, objArr);
        if (i10 == 1 || i10 == 2) {
            th2 = new IllegalStateException(format);
        } else {
            th2 = new IllegalArgumentException(format);
        }
        throw th2;
    }

    public static Object b(Object obj) {
        if (obj == null && (obj = f64714a) == null) {
            a(1);
        }
        return obj;
    }

    public static Object c(Throwable th2) {
        if (th2 == null) {
            a(3);
        }
        return new b(th2, (a) null);
    }

    public static Object d(Object obj) {
        if (obj == null) {
            a(4);
        }
        return e(f(obj));
    }

    public static Object e(Object obj) {
        if (obj == null) {
            a(0);
        }
        if (obj == f64714a) {
            return null;
        }
        return obj;
    }

    public static Object f(Object obj) {
        if (!(obj instanceof b)) {
            return obj;
        }
        Throwable b10 = ((b) obj).b();
        if (!f64715b || !d.a(b10)) {
            throw d.b(b10);
        }
        throw new c(b10);
    }
}
