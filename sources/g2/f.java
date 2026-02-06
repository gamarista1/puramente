package g2;

import g2.b;
import i2.C2076a;
import i2.L;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public class f implements b {

    /* renamed from: b  reason: collision with root package name */
    private int f21033b;

    /* renamed from: c  reason: collision with root package name */
    private float f21034c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f21035d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private b.a f21036e;

    /* renamed from: f  reason: collision with root package name */
    private b.a f21037f;

    /* renamed from: g  reason: collision with root package name */
    private b.a f21038g;

    /* renamed from: h  reason: collision with root package name */
    private b.a f21039h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f21040i;

    /* renamed from: j  reason: collision with root package name */
    private e f21041j;

    /* renamed from: k  reason: collision with root package name */
    private ByteBuffer f21042k;

    /* renamed from: l  reason: collision with root package name */
    private ShortBuffer f21043l;

    /* renamed from: m  reason: collision with root package name */
    private ByteBuffer f21044m;

    /* renamed from: n  reason: collision with root package name */
    private long f21045n;

    /* renamed from: o  reason: collision with root package name */
    private long f21046o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f21047p;

    public f() {
        b.a aVar = b.a.f20998e;
        this.f21036e = aVar;
        this.f21037f = aVar;
        this.f21038g = aVar;
        this.f21039h = aVar;
        ByteBuffer byteBuffer = b.f20997a;
        this.f21042k = byteBuffer;
        this.f21043l = byteBuffer.asShortBuffer();
        this.f21044m = byteBuffer;
        this.f21033b = -1;
    }

    public final boolean a() {
        if (this.f21037f.f20999a == -1 || (Math.abs(this.f21034c - 1.0f) < 1.0E-4f && Math.abs(this.f21035d - 1.0f) < 1.0E-4f && this.f21037f.f20999a == this.f21036e.f20999a)) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        e eVar;
        if (!this.f21047p || ((eVar = this.f21041j) != null && eVar.k() != 0)) {
            return false;
        }
        return true;
    }

    public final ByteBuffer c() {
        int k10;
        e eVar = this.f21041j;
        if (eVar != null && (k10 = eVar.k()) > 0) {
            if (this.f21042k.capacity() < k10) {
                ByteBuffer order = ByteBuffer.allocateDirect(k10).order(ByteOrder.nativeOrder());
                this.f21042k = order;
                this.f21043l = order.asShortBuffer();
            } else {
                this.f21042k.clear();
                this.f21043l.clear();
            }
            eVar.j(this.f21043l);
            this.f21046o += (long) k10;
            this.f21042k.limit(k10);
            this.f21044m = this.f21042k;
        }
        ByteBuffer byteBuffer = this.f21044m;
        this.f21044m = b.f20997a;
        return byteBuffer;
    }

    public final void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f21045n += (long) remaining;
            ((e) C2076a.e(this.f21041j)).t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public final void e() {
        e eVar = this.f21041j;
        if (eVar != null) {
            eVar.s();
        }
        this.f21047p = true;
    }

    public final b.a f(b.a aVar) {
        if (aVar.f21001c == 2) {
            int i10 = this.f21033b;
            if (i10 == -1) {
                i10 = aVar.f20999a;
            }
            this.f21036e = aVar;
            b.a aVar2 = new b.a(i10, aVar.f21000b, 2);
            this.f21037f = aVar2;
            this.f21040i = true;
            return aVar2;
        }
        throw new b.C0349b(aVar);
    }

    public final void flush() {
        if (a()) {
            b.a aVar = this.f21036e;
            this.f21038g = aVar;
            b.a aVar2 = this.f21037f;
            this.f21039h = aVar2;
            if (this.f21040i) {
                this.f21041j = new e(aVar.f20999a, aVar.f21000b, this.f21034c, this.f21035d, aVar2.f20999a);
            } else {
                e eVar = this.f21041j;
                if (eVar != null) {
                    eVar.i();
                }
            }
        }
        this.f21044m = b.f20997a;
        this.f21045n = 0;
        this.f21046o = 0;
        this.f21047p = false;
    }

    public final long g(long j10) {
        if (this.f21046o < 1024) {
            return (long) (((double) this.f21034c) * ((double) j10));
        }
        long l10 = this.f21045n - ((long) ((e) C2076a.e(this.f21041j)).l());
        int i10 = this.f21039h.f20999a;
        int i11 = this.f21038g.f20999a;
        if (i10 == i11) {
            return L.U0(j10, l10, this.f21046o);
        }
        return L.U0(j10, l10 * ((long) i10), this.f21046o * ((long) i11));
    }

    public final void h(float f10) {
        if (this.f21035d != f10) {
            this.f21035d = f10;
            this.f21040i = true;
        }
    }

    public final void i(float f10) {
        if (this.f21034c != f10) {
            this.f21034c = f10;
            this.f21040i = true;
        }
    }

    public final void reset() {
        this.f21034c = 1.0f;
        this.f21035d = 1.0f;
        b.a aVar = b.a.f20998e;
        this.f21036e = aVar;
        this.f21037f = aVar;
        this.f21038g = aVar;
        this.f21039h = aVar;
        ByteBuffer byteBuffer = b.f20997a;
        this.f21042k = byteBuffer;
        this.f21043l = byteBuffer.asShortBuffer();
        this.f21044m = byteBuffer;
        this.f21033b = -1;
        this.f21040i = false;
        this.f21041j = null;
        this.f21045n = 0;
        this.f21046o = 0;
        this.f21047p = false;
    }
}
