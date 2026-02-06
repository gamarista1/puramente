package j4;

import sf.C6714a;

/* renamed from: j4.b  reason: case insensitive filesystem */
public enum C3615b {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);
    

    /* renamed from: a  reason: collision with root package name */
    private final boolean f44632a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f44633b;

    static {
        C3615b[] a10;
        f44631h = C6714a.a(a10);
    }

    private C3615b(boolean z10, boolean z11) {
        this.f44632a = z10;
        this.f44633b = z11;
    }

    public final boolean b() {
        return this.f44632a;
    }

    public final boolean c() {
        return this.f44633b;
    }
}
