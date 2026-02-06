package We;

import p003if.i;

/* renamed from: We.t0  reason: case insensitive filesystem */
public final class C5653t0 implements C5657v0 {

    /* renamed from: a  reason: collision with root package name */
    private final C5657v0 f65935a;

    public C5653t0() {
        if (a()) {
            this.f65935a = new B0();
        } else {
            this.f65935a = new G0();
        }
    }

    private static boolean a() {
        if (!i.b() || !i.a()) {
            return false;
        }
        return true;
    }
}
