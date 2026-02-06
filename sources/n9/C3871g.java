package n9;

import java.nio.ByteBuffer;
import k9.C3711n0;

/* renamed from: n9.g  reason: case insensitive filesystem */
public class C3871g extends C3865a {

    /* renamed from: b  reason: collision with root package name */
    public final C3867c f46949b;

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer f46950c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f46951d;

    /* renamed from: e  reason: collision with root package name */
    public long f46952e;

    /* renamed from: f  reason: collision with root package name */
    public ByteBuffer f46953f;

    /* renamed from: g  reason: collision with root package name */
    private final int f46954g;

    /* renamed from: h  reason: collision with root package name */
    private final int f46955h;

    /* renamed from: n9.g$a */
    public static final class a extends IllegalStateException {

        /* renamed from: a  reason: collision with root package name */
        public final int f46956a;

        /* renamed from: b  reason: collision with root package name */
        public final int f46957b;

        public a(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f46956a = i10;
            this.f46957b = i11;
        }
    }

    static {
        C3711n0.a("goog.exo.decoder");
    }

    public C3871g(int i10) {
        this(i10, 0);
    }

    public static C3871g A() {
        return new C3871g(0);
    }

    private ByteBuffer u(int i10) {
        int i11;
        int i12 = this.f46954g;
        if (i12 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i12 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f46950c;
        if (byteBuffer == null) {
            i11 = 0;
        } else {
            i11 = byteBuffer.capacity();
        }
        throw new a(i11, i10);
    }

    public void C(int i10) {
        ByteBuffer byteBuffer = this.f46953f;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f46953f = ByteBuffer.allocate(i10);
        } else {
            this.f46953f.clear();
        }
    }

    public void i() {
        super.i();
        ByteBuffer byteBuffer = this.f46950c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f46953f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f46951d = false;
    }

    public void x(int i10) {
        int i11 = i10 + this.f46955h;
        ByteBuffer byteBuffer = this.f46950c;
        if (byteBuffer == null) {
            this.f46950c = u(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f46950c = byteBuffer;
            return;
        }
        ByteBuffer u10 = u(i12);
        u10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            u10.put(byteBuffer);
        }
        this.f46950c = u10;
    }

    public final void y() {
        ByteBuffer byteBuffer = this.f46950c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f46953f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean z() {
        return l(1073741824);
    }

    public C3871g(int i10, int i11) {
        this.f46949b = new C3867c();
        this.f46954g = i10;
        this.f46955h = i11;
    }
}
