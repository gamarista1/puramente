package W5;

import java.nio.ByteBuffer;
import x1.e;

public class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final b f34852a = new b();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static int f34853b = 16384;

    /* renamed from: c  reason: collision with root package name */
    private static final ThreadLocal f34854c = new a();

    class a extends ThreadLocal {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ByteBuffer initialValue() {
            return ByteBuffer.allocate(b.f34853b);
        }
    }

    public static int e() {
        return f34853b;
    }

    /* renamed from: d */
    public ByteBuffer b() {
        return (ByteBuffer) f34854c.get();
    }

    /* renamed from: f */
    public boolean a(ByteBuffer byteBuffer) {
        return true;
    }
}
