package lf;

import java.io.Serializable;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class v implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f71841b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Object f71842a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f71843a;

        public b(Throwable th2) {
            C6496s.h(th2, "exception");
            this.f71843a = th2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b) || !C6496s.c(this.f71843a, ((b) obj).f71843a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f71843a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f71843a + ')';
        }
    }

    private /* synthetic */ v(Object obj) {
        this.f71842a = obj;
    }

    public static final /* synthetic */ v a(Object obj) {
        return new v(obj);
    }

    public static boolean c(Object obj, Object obj2) {
        if ((obj2 instanceof v) && C6496s.c(obj, ((v) obj2).j())) {
            return true;
        }
        return false;
    }

    public static final boolean d(Object obj, Object obj2) {
        return C6496s.c(obj, obj2);
    }

    public static final Throwable e(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f71843a;
        }
        return null;
    }

    public static int f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean g(Object obj) {
        return obj instanceof b;
    }

    public static final boolean h(Object obj) {
        return !(obj instanceof b);
    }

    public static String i(Object obj) {
        if (obj instanceof b) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f71842a, obj);
    }

    public int hashCode() {
        return f(this.f71842a);
    }

    public final /* synthetic */ Object j() {
        return this.f71842a;
    }

    public String toString() {
        return i(this.f71842a);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
