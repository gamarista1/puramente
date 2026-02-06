package C;

import H0.U;
import c1.t;
import k0.c;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: C.m  reason: case insensitive filesystem */
public abstract class C1095m {

    /* renamed from: a  reason: collision with root package name */
    public static final b f994a = new b((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final C1095m f995b = a.f998e;

    /* renamed from: c  reason: collision with root package name */
    private static final C1095m f996c = e.f1001e;

    /* renamed from: d  reason: collision with root package name */
    private static final C1095m f997d = c.f999e;

    /* renamed from: C.m$a */
    private static final class a extends C1095m {

        /* renamed from: e  reason: collision with root package name */
        public static final a f998e = new a();

        private a() {
            super((DefaultConstructorMarker) null);
        }

        public int a(int i10, t tVar, U u10, int i11) {
            return i10 / 2;
        }
    }

    /* renamed from: C.m$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1095m a(c.b bVar) {
            return new d(bVar);
        }

        public final C1095m b(c.C0368c cVar) {
            return new f(cVar);
        }

        private b() {
        }
    }

    /* renamed from: C.m$c */
    private static final class c extends C1095m {

        /* renamed from: e  reason: collision with root package name */
        public static final c f999e = new c();

        private c() {
            super((DefaultConstructorMarker) null);
        }

        public int a(int i10, t tVar, U u10, int i11) {
            if (tVar == t.Ltr) {
                return i10;
            }
            return 0;
        }
    }

    /* renamed from: C.m$d */
    private static final class d extends C1095m {

        /* renamed from: e  reason: collision with root package name */
        private final c.b f1000e;

        public d(c.b bVar) {
            super((DefaultConstructorMarker) null);
            this.f1000e = bVar;
        }

        public int a(int i10, t tVar, U u10, int i11) {
            return this.f1000e.a(0, i10, tVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && C6496s.c(this.f1000e, ((d) obj).f1000e)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f1000e.hashCode();
        }

        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f1000e + ')';
        }
    }

    /* renamed from: C.m$e */
    private static final class e extends C1095m {

        /* renamed from: e  reason: collision with root package name */
        public static final e f1001e = new e();

        private e() {
            super((DefaultConstructorMarker) null);
        }

        public int a(int i10, t tVar, U u10, int i11) {
            if (tVar == t.Ltr) {
                return 0;
            }
            return i10;
        }
    }

    /* renamed from: C.m$f */
    private static final class f extends C1095m {

        /* renamed from: e  reason: collision with root package name */
        private final c.C0368c f1002e;

        public f(c.C0368c cVar) {
            super((DefaultConstructorMarker) null);
            this.f1002e = cVar;
        }

        public int a(int i10, t tVar, U u10, int i11) {
            return this.f1002e.a(0, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof f) && C6496s.c(this.f1002e, ((f) obj).f1002e)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f1002e.hashCode();
        }

        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.f1002e + ')';
        }
    }

    public /* synthetic */ C1095m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int a(int i10, t tVar, U u10, int i11);

    public Integer b(U u10) {
        return null;
    }

    public boolean c() {
        return false;
    }

    private C1095m() {
    }
}
