package G;

import Ef.m;

public final class B implements A {

    /* renamed from: b  reason: collision with root package name */
    private final int f2162b;

    public B(int i10) {
        this.f2162b = i10;
    }

    public int a(int i10, int i11, float f10, int i12, int i13) {
        long j10 = (long) i10;
        return m.l(i11, (int) m.e(j10 - ((long) this.f2162b), 0), (int) m.i(j10 + ((long) this.f2162b), 2147483647L));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof B) || this.f2162b != ((B) obj).f2162b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f2162b);
    }
}
