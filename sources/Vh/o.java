package Vh;

import ci.c;
import ci.d;
import java.nio.ByteBuffer;

public class o extends b {

    /* renamed from: e  reason: collision with root package name */
    private static c f65541e = d.j(o.class);

    /* renamed from: d  reason: collision with root package name */
    private ByteBuffer f65542d;

    /* access modifiers changed from: package-private */
    public int a() {
        throw new RuntimeException("sdjlhfl");
    }

    public void e(ByteBuffer byteBuffer) {
        this.f65542d = byteBuffer.slice();
    }

    public String toString() {
        return "UnknownDescriptor" + "{tag=" + this.f65505a + ", sizeOfInstance=" + this.f65506b + ", data=" + this.f65542d + '}';
    }
}
