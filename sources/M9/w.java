package m9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import m9.C3849g;

public abstract class w implements C3849g {

    /* renamed from: b  reason: collision with root package name */
    protected C3849g.a f46738b;

    /* renamed from: c  reason: collision with root package name */
    protected C3849g.a f46739c;

    /* renamed from: d  reason: collision with root package name */
    private C3849g.a f46740d;

    /* renamed from: e  reason: collision with root package name */
    private C3849g.a f46741e;

    /* renamed from: f  reason: collision with root package name */
    private ByteBuffer f46742f;

    /* renamed from: g  reason: collision with root package name */
    private ByteBuffer f46743g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f46744h;

    public w() {
        ByteBuffer byteBuffer = C3849g.f46651a;
        this.f46742f = byteBuffer;
        this.f46743g = byteBuffer;
        C3849g.a aVar = C3849g.a.f46652e;
        this.f46740d = aVar;
        this.f46741e = aVar;
        this.f46738b = aVar;
        this.f46739c = aVar;
    }

    public boolean a() {
        if (this.f46741e != C3849g.a.f46652e) {
            return true;
        }
        return false;
    }

    public boolean b() {
        if (!this.f46744h || this.f46743g != C3849g.f46651a) {
            return false;
        }
        return true;
    }

    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f46743g;
        this.f46743g = C3849g.f46651a;
        return byteBuffer;
    }

    public final void e() {
        this.f46744h = true;
        j();
    }

    public final C3849g.a f(C3849g.a aVar) {
        this.f46740d = aVar;
        this.f46741e = h(aVar);
        if (a()) {
            return this.f46741e;
        }
        return C3849g.a.f46652e;
    }

    public final void flush() {
        this.f46743g = C3849g.f46651a;
        this.f46744h = false;
        this.f46738b = this.f46740d;
        this.f46739c = this.f46741e;
        i();
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        return this.f46743g.hasRemaining();
    }

    /* access modifiers changed from: protected */
    public abstract C3849g.a h(C3849g.a aVar);

    /* access modifiers changed from: protected */
    public final ByteBuffer l(int i10) {
        if (this.f46742f.capacity() < i10) {
            this.f46742f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f46742f.clear();
        }
        ByteBuffer byteBuffer = this.f46742f;
        this.f46743g = byteBuffer;
        return byteBuffer;
    }

    public final void reset() {
        flush();
        this.f46742f = C3849g.f46651a;
        C3849g.a aVar = C3849g.a.f46652e;
        this.f46740d = aVar;
        this.f46741e = aVar;
        this.f46738b = aVar;
        this.f46739c = aVar;
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
