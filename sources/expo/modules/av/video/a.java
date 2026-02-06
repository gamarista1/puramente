package expo.modules.av.video;

import sf.C6714a;

public enum a {
    FULLSCREEN_PLAYER_WILL_PRESENT(0),
    FULLSCREEN_PLAYER_DID_PRESENT(1),
    FULLSCREEN_PLAYER_WILL_DISMISS(2),
    FULLSCREEN_PLAYER_DID_DISMISS(3);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f60305a;

    static {
        a[] a10;
        f60304g = C6714a.a(a10);
    }

    private a(int i10) {
        this.f60305a = i10;
    }

    public final int b() {
        return this.f60305a;
    }
}
