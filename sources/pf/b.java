package Pf;

public abstract class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final h f64580a;

    public b(h hVar) {
        if (hVar == null) {
            i0(0);
        }
        this.f64580a = hVar;
    }

    private static /* synthetic */ void i0(int i10) {
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
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i10 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
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

    public h getAnnotations() {
        h hVar = this.f64580a;
        if (hVar == null) {
            i0(1);
        }
        return hVar;
    }
}
