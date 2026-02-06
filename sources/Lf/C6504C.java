package lf;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: lf.C  reason: case insensitive filesystem */
public final class C6504C implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f71792b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final byte f71793a;

    /* renamed from: lf.C$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ C6504C(byte b10) {
        this.f71793a = b10;
    }

    public static final /* synthetic */ C6504C a(byte b10) {
        return new C6504C(b10);
    }

    public static boolean c(byte b10, Object obj) {
        if ((obj instanceof C6504C) && b10 == ((C6504C) obj).i()) {
            return true;
        }
        return false;
    }

    public static int e(byte b10) {
        return Byte.hashCode(b10);
    }

    public static String f(byte b10) {
        return String.valueOf(b10 & 255);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C6496s.i(i() & 255, ((C6504C) obj).i() & 255);
    }

    public boolean equals(Object obj) {
        return c(this.f71793a, obj);
    }

    public int hashCode() {
        return e(this.f71793a);
    }

    public final /* synthetic */ byte i() {
        return this.f71793a;
    }

    public String toString() {
        return f(this.f71793a);
    }

    public static byte b(byte b10) {
        return b10;
    }
}
