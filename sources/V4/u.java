package V4;

import o5.k;
import p5.C3931a;
import p5.C3933c;
import x1.e;

final class u implements v, C3931a.f {

    /* renamed from: e  reason: collision with root package name */
    private static final e f34633e = C3931a.d(20, new a());

    /* renamed from: a  reason: collision with root package name */
    private final C3933c f34634a = C3933c.a();

    /* renamed from: b  reason: collision with root package name */
    private v f34635b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f34636c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f34637d;

    class a implements C3931a.d {
        a() {
        }

        /* renamed from: a */
        public u create() {
            return new u();
        }
    }

    u() {
    }

    private void c(v vVar) {
        this.f34637d = false;
        this.f34636c = true;
        this.f34635b = vVar;
    }

    static u d(v vVar) {
        u uVar = (u) k.d((u) f34633e.b());
        uVar.c(vVar);
        return uVar;
    }

    private void e() {
        this.f34635b = null;
        f34633e.a(this);
    }

    public Class a() {
        return this.f34635b.a();
    }

    public C3933c b() {
        return this.f34634a;
    }

    /* access modifiers changed from: package-private */
    public synchronized void f() {
        this.f34634a.c();
        if (this.f34636c) {
            this.f34636c = false;
            if (this.f34637d) {
                recycle();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public Object get() {
        return this.f34635b.get();
    }

    public int getSize() {
        return this.f34635b.getSize();
    }

    public synchronized void recycle() {
        this.f34634a.c();
        this.f34637d = true;
        if (!this.f34636c) {
            this.f34635b.recycle();
            e();
        }
    }
}
