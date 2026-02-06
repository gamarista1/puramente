package H0;

import kotlin.jvm.internal.C6494p;
import yf.p;

/* renamed from: H0.b  reason: case insensitive filesystem */
public abstract class C1181b {

    /* renamed from: a  reason: collision with root package name */
    private static final C1192m f2563a = new C1192m(a.f2565a);

    /* renamed from: b  reason: collision with root package name */
    private static final C1192m f2564b = new C1192m(C0043b.f2566a);

    /* renamed from: H0.b$a */
    /* synthetic */ class a extends C6494p implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2565a = new a();

        a() {
            super(2, Af.a.class, "min", "min(II)I", 1);
        }

        public final Integer i(int i10, int i11) {
            return Integer.valueOf(Math.min(i10, i11));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    /* renamed from: H0.b$b  reason: collision with other inner class name */
    /* synthetic */ class C0043b extends C6494p implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final C0043b f2566a = new C0043b();

        C0043b() {
            super(2, Af.a.class, "max", "max(II)I", 1);
        }

        public final Integer i(int i10, int i11) {
            return Integer.valueOf(Math.max(i10, i11));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    public static final C1192m a() {
        return f2563a;
    }

    public static final C1192m b() {
        return f2564b;
    }

    public static final int c(C1180a aVar, int i10, int i11) {
        return ((Number) aVar.a().invoke(Integer.valueOf(i10), Integer.valueOf(i11))).intValue();
    }
}
