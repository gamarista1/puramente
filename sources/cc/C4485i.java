package cc;

import Zb.b;
import Zb.c;
import Zb.g;

/* renamed from: cc.i  reason: case insensitive filesystem */
class C4485i implements g {

    /* renamed from: a  reason: collision with root package name */
    private boolean f53712a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f53713b = false;

    /* renamed from: c  reason: collision with root package name */
    private c f53714c;

    /* renamed from: d  reason: collision with root package name */
    private final C4482f f53715d;

    C4485i(C4482f fVar) {
        this.f53715d = fVar;
    }

    private void a() {
        if (!this.f53712a) {
            this.f53712a = true;
            return;
        }
        throw new b("Cannot encode a second value in the ValueEncoderContext");
    }

    /* access modifiers changed from: package-private */
    public void b(c cVar, boolean z10) {
        this.f53712a = false;
        this.f53714c = cVar;
        this.f53713b = z10;
    }

    public g e(String str) {
        a();
        this.f53715d.i(this.f53714c, str, this.f53713b);
        return this;
    }

    public g g(boolean z10) {
        a();
        this.f53715d.o(this.f53714c, z10, this.f53713b);
        return this;
    }
}
