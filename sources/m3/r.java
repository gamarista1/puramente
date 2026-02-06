package m3;

import io.branch.rnbranch.RNBranchModule;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f24094a;

    public static final class a extends r {

        /* renamed from: b  reason: collision with root package name */
        private final Throwable f24095b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Throwable th2) {
            super(false, (DefaultConstructorMarker) null);
            C6496s.h(th2, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
            this.f24095b = th2;
        }

        public final Throwable b() {
            return this.f24095b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (a() != aVar.a() || !C6496s.c(this.f24095b, aVar.f24095b)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Boolean.hashCode(a()) + this.f24095b.hashCode();
        }

        public String toString() {
            return "Error(endOfPaginationReached=" + a() + ", error=" + this.f24095b + ')';
        }
    }

    public static final class b extends r {

        /* renamed from: b  reason: collision with root package name */
        public static final b f24096b = new b();

        private b() {
            super(false, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b) || a() != ((b) obj).a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(a());
        }

        public String toString() {
            return "Loading(endOfPaginationReached=" + a() + ')';
        }
    }

    public static final class c extends r {

        /* renamed from: b  reason: collision with root package name */
        public static final a f24097b = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final c f24098c = new c(true);
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final c f24099d = new c(false);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a() {
                return c.f24098c;
            }

            public final c b() {
                return c.f24099d;
            }

            private a() {
            }
        }

        public c(boolean z10) {
            super(z10, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c) || a() != ((c) obj).a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(a());
        }

        public String toString() {
            return "NotLoading(endOfPaginationReached=" + a() + ')';
        }
    }

    public /* synthetic */ r(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10);
    }

    public final boolean a() {
        return this.f24094a;
    }

    private r(boolean z10) {
        this.f24094a = z10;
    }
}
