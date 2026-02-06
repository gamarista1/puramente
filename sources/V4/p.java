package V4;

import T4.f;
import o5.k;

class p implements v {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f34611a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f34612b;

    /* renamed from: c  reason: collision with root package name */
    private final v f34613c;

    /* renamed from: d  reason: collision with root package name */
    private final a f34614d;

    /* renamed from: e  reason: collision with root package name */
    private final f f34615e;

    /* renamed from: f  reason: collision with root package name */
    private int f34616f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f34617g;

    interface a {
        void d(f fVar, p pVar);
    }

    p(v vVar, boolean z10, boolean z11, f fVar, a aVar) {
        this.f34613c = (v) k.d(vVar);
        this.f34611a = z10;
        this.f34612b = z11;
        this.f34615e = fVar;
        this.f34614d = (a) k.d(aVar);
    }

    public Class a() {
        return this.f34613c.a();
    }

    /* access modifiers changed from: package-private */
    public synchronized void b() {
        if (!this.f34617g) {
            this.f34616f++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* access modifiers changed from: package-private */
    public v c() {
        return this.f34613c;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f34611a;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f34616f;
            if (i10 > 0) {
                z10 = true;
                int i11 = i10 - 1;
                this.f34616f = i11;
                if (i11 != 0) {
                    z10 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z10) {
            this.f34614d.d(this.f34615e, this);
        }
    }

    public Object get() {
        return this.f34613c.get();
    }

    public int getSize() {
        return this.f34613c.getSize();
    }

    public synchronized void recycle() {
        if (this.f34616f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f34617g) {
            this.f34617g = true;
            if (this.f34612b) {
                this.f34613c.recycle();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f34611a + ", listener=" + this.f34614d + ", key=" + this.f34615e + ", acquired=" + this.f34616f + ", isRecycled=" + this.f34617g + ", resource=" + this.f34613c + '}';
    }
}
