package Fg;

import sf.C6714a;

public enum N0 {
    INVARIANT("", true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);
    

    /* renamed from: a  reason: collision with root package name */
    private final String f62961a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f62962b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f62963c;

    /* renamed from: d  reason: collision with root package name */
    private final int f62964d;

    static {
        N0[] a10;
        f62960i = C6714a.a(a10);
    }

    private N0(String str, boolean z10, boolean z11, int i10) {
        this.f62961a = str;
        this.f62962b = z10;
        this.f62963c = z11;
        this.f62964d = i10;
    }

    public final boolean b() {
        return this.f62963c;
    }

    public final String c() {
        return this.f62961a;
    }

    public String toString() {
        return this.f62961a;
    }
}
