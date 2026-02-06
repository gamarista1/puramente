package m9;

import ja.C3645a;
import ja.M;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import m9.C3849g;

public final class I implements C3849g {

    /* renamed from: b  reason: collision with root package name */
    private int f46586b;

    /* renamed from: c  reason: collision with root package name */
    private float f46587c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f46588d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private C3849g.a f46589e;

    /* renamed from: f  reason: collision with root package name */
    private C3849g.a f46590f;

    /* renamed from: g  reason: collision with root package name */
    private C3849g.a f46591g;

    /* renamed from: h  reason: collision with root package name */
    private C3849g.a f46592h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f46593i;

    /* renamed from: j  reason: collision with root package name */
    private H f46594j;

    /* renamed from: k  reason: collision with root package name */
    private ByteBuffer f46595k;

    /* renamed from: l  reason: collision with root package name */
    private ShortBuffer f46596l;

    /* renamed from: m  reason: collision with root package name */
    private ByteBuffer f46597m;

    /* renamed from: n  reason: collision with root package name */
    private long f46598n;

    /* renamed from: o  reason: collision with root package name */
    private long f46599o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f46600p;

    public I() {
        C3849g.a aVar = C3849g.a.f46652e;
        this.f46589e = aVar;
        this.f46590f = aVar;
        this.f46591g = aVar;
        this.f46592h = aVar;
        ByteBuffer byteBuffer = C3849g.f46651a;
        this.f46595k = byteBuffer;
        this.f46596l = byteBuffer.asShortBuffer();
        this.f46597m = byteBuffer;
        this.f46586b = -1;
    }

    public boolean a() {
        if (this.f46590f.f46653a == -1 || (Math.abs(this.f46587c - 1.0f) < 1.0E-4f && Math.abs(this.f46588d - 1.0f) < 1.0E-4f && this.f46590f.f46653a == this.f46589e.f46653a)) {
            return false;
        }
        return true;
    }

    public boolean b() {
        H h10;
        if (!this.f46600p || ((h10 = this.f46594j) != null && h10.k() != 0)) {
            return false;
        }
        return true;
    }

    public ByteBuffer c() {
        int k10;
        H h10 = this.f46594j;
        if (h10 != null && (k10 = h10.k()) > 0) {
            if (this.f46595k.capacity() < k10) {
                ByteBuffer order = ByteBuffer.allocateDirect(k10).order(ByteOrder.nativeOrder());
                this.f46595k = order;
                this.f46596l = order.asShortBuffer();
            } else {
                this.f46595k.clear();
                this.f46596l.clear();
            }
            h10.j(this.f46596l);
            this.f46599o += (long) k10;
            this.f46595k.limit(k10);
            this.f46597m = this.f46595k;
        }
        ByteBuffer byteBuffer = this.f46597m;
        this.f46597m = C3849g.f46651a;
        return byteBuffer;
    }

    public void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f46598n += (long) remaining;
            ((H) C3645a.e(this.f46594j)).t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public void e() {
        H h10 = this.f46594j;
        if (h10 != null) {
            h10.s();
        }
        this.f46600p = true;
    }

    public C3849g.a f(C3849g.a aVar) {
        if (aVar.f46655c == 2) {
            int i10 = this.f46586b;
            if (i10 == -1) {
                i10 = aVar.f46653a;
            }
            this.f46589e = aVar;
            C3849g.a aVar2 = new C3849g.a(i10, aVar.f46654b, 2);
            this.f46590f = aVar2;
            this.f46593i = true;
            return aVar2;
        }
        throw new C3849g.b(aVar);
    }

    public void flush() {
        if (a()) {
            C3849g.a aVar = this.f46589e;
            this.f46591g = aVar;
            C3849g.a aVar2 = this.f46590f;
            this.f46592h = aVar2;
            if (this.f46593i) {
                this.f46594j = new H(aVar.f46653a, aVar.f46654b, this.f46587c, this.f46588d, aVar2.f46653a);
            } else {
                H h10 = this.f46594j;
                if (h10 != null) {
                    h10.i();
                }
            }
        }
        this.f46597m = C3849g.f46651a;
        this.f46598n = 0;
        this.f46599o = 0;
        this.f46600p = false;
    }

    public long g(long j10) {
        if (this.f46599o < 1024) {
            return (long) (((double) this.f46587c) * ((double) j10));
        }
        long l10 = this.f46598n - ((long) ((H) C3645a.e(this.f46594j)).l());
        int i10 = this.f46592h.f46653a;
        int i11 = this.f46591g.f46653a;
        if (i10 == i11) {
            return M.O0(j10, l10, this.f46599o);
        }
        return M.O0(j10, l10 * ((long) i10), this.f46599o * ((long) i11));
    }

    public void h(float f10) {
        if (this.f46588d != f10) {
            this.f46588d = f10;
            this.f46593i = true;
        }
    }

    public void i(float f10) {
        if (this.f46587c != f10) {
            this.f46587c = f10;
            this.f46593i = true;
        }
    }

    public void reset() {
        this.f46587c = 1.0f;
        this.f46588d = 1.0f;
        C3849g.a aVar = C3849g.a.f46652e;
        this.f46589e = aVar;
        this.f46590f = aVar;
        this.f46591g = aVar;
        this.f46592h = aVar;
        ByteBuffer byteBuffer = C3849g.f46651a;
        this.f46595k = byteBuffer;
        this.f46596l = byteBuffer.asShortBuffer();
        this.f46597m = byteBuffer;
        this.f46586b = -1;
        this.f46593i = false;
        this.f46594j = null;
        this.f46598n = 0;
        this.f46599o = 0;
        this.f46600p = false;
    }
}
