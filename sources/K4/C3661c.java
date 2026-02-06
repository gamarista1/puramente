package k4;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: k4.c  reason: case insensitive filesystem */
public abstract class C3661c {

    /* renamed from: k4.c$a */
    public static final class a extends C3661c {

        /* renamed from: a  reason: collision with root package name */
        public final int f45103a;

        public a(int i10) {
            super((DefaultConstructorMarker) null);
            this.f45103a = i10;
            if (i10 <= 0) {
                throw new IllegalArgumentException("px must be > 0.");
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.f45103a != ((a) obj).f45103a) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f45103a;
        }

        public String toString() {
            return String.valueOf(this.f45103a);
        }
    }

    /* renamed from: k4.c$b */
    public static final class b extends C3661c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f45104a = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }

        public String toString() {
            return "Dimension.Undefined";
        }
    }

    public /* synthetic */ C3661c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C3661c() {
    }
}
