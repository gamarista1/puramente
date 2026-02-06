package M3;

import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class b {

    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f4313a = new a();

        private a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: M3.b$b  reason: collision with other inner class name */
    public static final class C0106b extends b {

        /* renamed from: a  reason: collision with root package name */
        private final int f4314a;

        public C0106b(int i10) {
            super((DefaultConstructorMarker) null);
            this.f4314a = i10;
        }

        public final int a() {
            return this.f4314a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0106b) && this.f4314a == ((C0106b) obj).f4314a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.f4314a);
        }

        public String toString() {
            return "ConstraintsNotMet(reason=" + this.f4314a + ')';
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
