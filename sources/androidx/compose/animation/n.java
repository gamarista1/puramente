package androidx.compose.animation;

import c1.r;
import v.C2738u;
import w.C2763G;
import yf.p;

final class n implements C2738u {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f12407a;

    /* renamed from: b  reason: collision with root package name */
    private final p f12408b;

    public n(boolean z10, p pVar) {
        this.f12407a = z10;
        this.f12408b = pVar;
    }

    public boolean a() {
        return this.f12407a;
    }

    public C2763G b(long j10, long j11) {
        return (C2763G) this.f12408b.invoke(r.b(j10), r.b(j11));
    }
}
