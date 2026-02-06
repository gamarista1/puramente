package lf;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: lf.J  reason: case insensitive filesystem */
public final class C6511J implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f71808b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final short f71809a;

    /* renamed from: lf.J$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ C6511J(short s10) {
        this.f71809a = s10;
    }

    public static final /* synthetic */ C6511J a(short s10) {
        return new C6511J(s10);
    }

    public static boolean c(short s10, Object obj) {
        if ((obj instanceof C6511J) && s10 == ((C6511J) obj).i()) {
            return true;
        }
        return false;
    }

    public static int e(short s10) {
        return Short.hashCode(s10);
    }

    public static String f(short s10) {
        return String.valueOf(s10 & 65535);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C6496s.i(i() & 65535, ((C6511J) obj).i() & 65535);
    }

    public boolean equals(Object obj) {
        return c(this.f71809a, obj);
    }

    public int hashCode() {
        return e(this.f71809a);
    }

    public final /* synthetic */ short i() {
        return this.f71809a;
    }

    public String toString() {
        return f(this.f71809a);
    }

    public static short b(short s10) {
        return s10;
    }
}
