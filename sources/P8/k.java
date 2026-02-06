package P8;

import Q8.a;

public class k extends e {

    /* renamed from: g  reason: collision with root package name */
    static final int f33560g = e.a("VP8X");

    /* renamed from: d  reason: collision with root package name */
    byte f33561d;

    /* renamed from: e  reason: collision with root package name */
    public int f33562e;

    /* renamed from: f  reason: collision with root package name */
    public int f33563f;

    /* access modifiers changed from: package-private */
    public void b(a aVar) {
        this.f33561d = aVar.peek();
        aVar.skip(3);
        this.f33562e = aVar.a();
        this.f33563f = aVar.a();
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        if ((this.f33561d & 16) == 16) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        if ((this.f33561d & 2) == 2) {
            return true;
        }
        return false;
    }
}
