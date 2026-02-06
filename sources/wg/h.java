package Wg;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final b f66032b = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final c f66033c = new c();

    /* renamed from: a  reason: collision with root package name */
    private final Object f66034a;

    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f66035a;

        public a(Throwable th2) {
            this.f66035a = th2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a) || !C6496s.c(this.f66035a, ((a) obj).f66035a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            Throwable th2 = this.f66035a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Closed(" + this.f66035a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(Throwable th2) {
            return h.c(new a(th2));
        }

        public final Object b() {
            return h.c(h.f66033c);
        }

        public final Object c(Object obj) {
            return h.c(obj);
        }

        private b() {
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ h(Object obj) {
        this.f66034a = obj;
    }

    public static final /* synthetic */ h b(Object obj) {
        return new h(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        if ((obj2 instanceof h) && C6496s.c(obj, ((h) obj2).k())) {
            return true;
        }
        return false;
    }

    public static final Throwable e(Object obj) {
        a aVar;
        if (obj instanceof a) {
            aVar = (a) obj;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar.f66035a;
        }
        return null;
    }

    public static final Object f(Object obj) {
        if (!(obj instanceof c)) {
            return obj;
        }
        return null;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f66034a, obj);
    }

    public int hashCode() {
        return g(this.f66034a);
    }

    public final /* synthetic */ Object k() {
        return this.f66034a;
    }

    public String toString() {
        return j(this.f66034a);
    }

    public static Object c(Object obj) {
        return obj;
    }
}
