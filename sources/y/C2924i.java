package y;

import Y.C1510r0;
import Y.o1;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2421g;
import q0.C2422h;

/* renamed from: y.i  reason: case insensitive filesystem */
public final class C2924i {

    /* renamed from: a  reason: collision with root package name */
    private final C1510r0 f28492a;

    /* renamed from: y.i$a */
    public static abstract class a {

        /* renamed from: y.i$a$a  reason: collision with other inner class name */
        public static final class C0476a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0476a f28493a = new C0476a();

            private C0476a() {
                super((DefaultConstructorMarker) null);
            }

            public String toString() {
                return "Closed";
            }
        }

        /* renamed from: y.i$a$b */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final long f28494a;

            public /* synthetic */ b(long j10, DefaultConstructorMarker defaultConstructorMarker) {
                this(j10);
            }

            public final long a() {
                return this.f28494a;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                return C2421g.j(this.f28494a, ((b) obj).f28494a);
            }

            public int hashCode() {
                return C2421g.o(this.f28494a);
            }

            public String toString() {
                return "Open(offset=" + C2421g.t(this.f28494a) + ')';
            }

            private b(long j10) {
                super((DefaultConstructorMarker) null);
                this.f28494a = j10;
                if (!C2422h.c(j10)) {
                    throw new IllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
                }
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2924i(a aVar) {
        this.f28492a = u1.d(aVar, (o1) null, 2, (Object) null);
    }

    public final a a() {
        return (a) this.f28492a.getValue();
    }

    public final void b(a aVar) {
        this.f28492a.setValue(aVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2924i)) {
            return false;
        }
        return C6496s.c(((C2924i) obj).a(), a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return "ContextMenuState(status=" + a() + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2924i(a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? a.C0476a.f28493a : aVar);
    }
}
