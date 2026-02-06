package androidx.collection;

/* renamed from: androidx.collection.l  reason: case insensitive filesystem */
public final class C1598l {

    /* renamed from: a  reason: collision with root package name */
    public final long f12184a;

    private /* synthetic */ C1598l(long j10) {
        this.f12184a = j10;
    }

    public static final /* synthetic */ C1598l a(long j10) {
        return new C1598l(j10);
    }

    public static long b(int i10, int i11) {
        return c((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof C1598l) && j10 == ((C1598l) obj).i();
    }

    public static final int e(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int f(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static String h(long j10) {
        return '(' + e(j10) + ", " + f(j10) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f12184a, obj);
    }

    public int hashCode() {
        return g(this.f12184a);
    }

    public final /* synthetic */ long i() {
        return this.f12184a;
    }

    public String toString() {
        return h(this.f12184a);
    }
}
