package Vh;

import bi.d;
import bi.e;
import java.nio.ByteBuffer;

public class n extends b {

    /* renamed from: d  reason: collision with root package name */
    int f65540d;

    public n() {
        this.f65505a = 6;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return 1;
    }

    public void e(ByteBuffer byteBuffer) {
        this.f65540d = d.l(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.f65540d == ((n) obj).f65540d) {
            return true;
        }
        return false;
    }

    public ByteBuffer g() {
        ByteBuffer allocate = ByteBuffer.allocate(b());
        e.i(allocate, 6);
        f(allocate, a());
        e.i(allocate, this.f65540d);
        return allocate;
    }

    public void h(int i10) {
        this.f65540d = i10;
    }

    public int hashCode() {
        return this.f65540d;
    }

    public String toString() {
        return "SLConfigDescriptor" + "{predefined=" + this.f65540d + '}';
    }
}
