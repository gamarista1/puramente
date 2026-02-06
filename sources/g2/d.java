package g2;

import g2.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class d implements b {

    /* renamed from: b  reason: collision with root package name */
    protected b.a f21004b;

    /* renamed from: c  reason: collision with root package name */
    protected b.a f21005c;

    /* renamed from: d  reason: collision with root package name */
    private b.a f21006d;

    /* renamed from: e  reason: collision with root package name */
    private b.a f21007e;

    /* renamed from: f  reason: collision with root package name */
    private ByteBuffer f21008f;

    /* renamed from: g  reason: collision with root package name */
    private ByteBuffer f21009g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f21010h;

    public d() {
        ByteBuffer byteBuffer = b.f20997a;
        this.f21008f = byteBuffer;
        this.f21009g = byteBuffer;
        b.a aVar = b.a.f20998e;
        this.f21006d = aVar;
        this.f21007e = aVar;
        this.f21004b = aVar;
        this.f21005c = aVar;
    }

    public boolean a() {
        if (this.f21007e != b.a.f20998e) {
            return true;
        }
        return false;
    }

    public boolean b() {
        if (!this.f21010h || this.f21009g != b.f20997a) {
            return false;
        }
        return true;
    }

    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f21009g;
        this.f21009g = b.f20997a;
        return byteBuffer;
    }

    public final void e() {
        this.f21010h = true;
        j();
    }

    public final b.a f(b.a aVar) {
        this.f21006d = aVar;
        this.f21007e = h(aVar);
        if (a()) {
            return this.f21007e;
        }
        return b.a.f20998e;
    }

    public final void flush() {
        this.f21009g = b.f20997a;
        this.f21010h = false;
        this.f21004b = this.f21006d;
        this.f21005c = this.f21007e;
        i();
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        return this.f21009g.hasRemaining();
    }

    /* access modifiers changed from: protected */
    public abstract b.a h(b.a aVar);

    /* access modifiers changed from: protected */
    public final ByteBuffer l(int i10) {
        if (this.f21008f.capacity() < i10) {
            this.f21008f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f21008f.clear();
        }
        ByteBuffer byteBuffer = this.f21008f;
        this.f21009g = byteBuffer;
        return byteBuffer;
    }

    public final void reset() {
        flush();
        this.f21008f = b.f20997a;
        b.a aVar = b.a.f20998e;
        this.f21006d = aVar;
        this.f21007e = aVar;
        this.f21004b = aVar;
        this.f21005c = aVar;
        k();
    }

    /* access modifiers changed from: protected */
    public void i() {
    }

    /* access modifiers changed from: protected */
    public void j() {
    }

    /* access modifiers changed from: protected */
    public void k() {
    }
}
