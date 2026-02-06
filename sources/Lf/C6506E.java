package lf;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: lf.E  reason: case insensitive filesystem */
public final class C6506E implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f71797b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f71798a;

    /* renamed from: lf.E$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ C6506E(int i10) {
        this.f71798a = i10;
    }

    public static final /* synthetic */ C6506E a(int i10) {
        return new C6506E(i10);
    }

    public static boolean c(int i10, Object obj) {
        if ((obj instanceof C6506E) && i10 == ((C6506E) obj).i()) {
            return true;
        }
        return false;
    }

    public static int e(int i10) {
        return Integer.hashCode(i10);
    }

    public static String f(int i10) {
        return String.valueOf(((long) i10) & 4294967295L);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C6516O.a(i(), ((C6506E) obj).i());
    }

    public boolean equals(Object obj) {
        return c(this.f71798a, obj);
    }

    public int hashCode() {
        return e(this.f71798a);
    }

    public final /* synthetic */ int i() {
        return this.f71798a;
    }

    public String toString() {
        return f(this.f71798a);
    }

    public static int b(int i10) {
        return i10;
    }
}
