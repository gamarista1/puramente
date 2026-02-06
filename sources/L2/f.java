package l2;

import f2.s;
import f2.x;
import java.nio.ByteBuffer;

public class f extends C2169a {

    /* renamed from: b  reason: collision with root package name */
    public s f23518b;

    /* renamed from: c  reason: collision with root package name */
    public final c f23519c;

    /* renamed from: d  reason: collision with root package name */
    public ByteBuffer f23520d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f23521e;

    /* renamed from: f  reason: collision with root package name */
    public long f23522f;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f23523g;

    /* renamed from: h  reason: collision with root package name */
    private final int f23524h;

    /* renamed from: i  reason: collision with root package name */
    private final int f23525i;

    public static final class a extends IllegalStateException {

        /* renamed from: a  reason: collision with root package name */
        public final int f23526a;

        /* renamed from: b  reason: collision with root package name */
        public final int f23527b;

        public a(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f23526a = i10;
            this.f23527b = i11;
        }
    }

    static {
        x.a("media3.decoder");
    }

    public f(int i10) {
        this(i10, 0);
    }

    private ByteBuffer t(int i10) {
        int i11;
        int i12 = this.f23524h;
        if (i12 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i12 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f23520d;
        if (byteBuffer == null) {
            i11 = 0;
        } else {
            i11 = byteBuffer.capacity();
        }
        throw new a(i11, i10);
    }

    public static f z() {
        return new f(0);
    }

    public void A(int i10) {
        ByteBuffer byteBuffer = this.f23523g;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f23523g = ByteBuffer.allocate(i10);
        } else {
            this.f23523g.clear();
        }
    }

    public void i() {
        super.i();
        ByteBuffer byteBuffer = this.f23520d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f23523g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f23521e = false;
    }

    public void u(int i10) {
        int i11 = i10 + this.f23525i;
        ByteBuffer byteBuffer = this.f23520d;
        if (byteBuffer == null) {
            this.f23520d = t(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f23520d = byteBuffer;
            return;
        }
        ByteBuffer t10 = t(i12);
        t10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            t10.put(byteBuffer);
        }
        this.f23520d = t10;
    }

    public final void x() {
        ByteBuffer byteBuffer = this.f23520d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f23523g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean y() {
        return j(1073741824);
    }

    public f(int i10, int i11) {
        this.f23519c = new c();
        this.f23524h = i10;
        this.f23525i = i11;
    }
}
