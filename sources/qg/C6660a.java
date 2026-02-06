package qg;

import sf.C6714a;

/* renamed from: qg.a  reason: case insensitive filesystem */
public enum C6660a {
    NO_ARGUMENTS(false, false, 3, (boolean) null),
    UNLESS_EMPTY(true, false, 2, (boolean) null),
    ALWAYS_PARENTHESIZED(true, true);
    

    /* renamed from: a  reason: collision with root package name */
    private final boolean f72676a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f72677b;

    static {
        C6660a[] a10;
        f72675g = C6714a.a(a10);
    }

    private C6660a(boolean z10, boolean z11) {
        this.f72676a = z10;
        this.f72677b = z11;
    }

    public final boolean b() {
        return this.f72676a;
    }

    public final boolean c() {
        return this.f72677b;
    }
}
