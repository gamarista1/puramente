package Xg;

public interface H {

    /* renamed from: a  reason: collision with root package name */
    public static final a f66443a = a.f66444a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f66444a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final H f66445b = new I();

        /* renamed from: c  reason: collision with root package name */
        private static final H f66446c = new J();

        private a() {
        }

        public static /* synthetic */ H b(a aVar, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            if ((i10 & 2) != 0) {
                j11 = Long.MAX_VALUE;
            }
            return aVar.a(j10, j11);
        }

        public final H a(long j10, long j11) {
            return new K(j10, j11);
        }

        public final H c() {
            return f66445b;
        }

        public final H d() {
            return f66446c;
        }
    }

    C5694f a(L l10);
}
