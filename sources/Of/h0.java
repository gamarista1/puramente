package Of;

public interface h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f64497a = new a();

    static class a implements h0 {
        a() {
        }

        private static /* synthetic */ void d(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"}));
        }

        public i0 b() {
            i0 i0Var = i0.f64498a;
            if (i0Var == null) {
                d(0);
            }
            return i0Var;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    i0 b();
}
