package G;

public interface A {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2160a = a.f2161a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f2161a = new a();

        private a() {
        }

        public final A a(int i10) {
            if (i10 >= 0) {
                return new B(i10);
            }
            throw new IllegalArgumentException(("pages should be greater than or equal to 0. You have used " + i10 + '.').toString());
        }
    }

    int a(int i10, int i11, float f10, int i12, int i13);
}
