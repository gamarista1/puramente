package androidx.compose.foundation.relocation;

import H.b;
import k0.i;
import kotlin.jvm.internal.C6496s;

public final class e extends i.c {

    /* renamed from: n  reason: collision with root package name */
    private b f13116n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f13117o;

    public e(b bVar) {
        this.f13116n = bVar;
    }

    private final void l2() {
        b bVar = this.f13116n;
        if (bVar instanceof a) {
            C6496s.f(bVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((a) bVar).c().w(this);
        }
    }

    public boolean Q1() {
        return this.f13117o;
    }

    public void V1() {
        m2(this.f13116n);
    }

    public void W1() {
        l2();
    }

    public final void m2(b bVar) {
        l2();
        if (bVar instanceof a) {
            ((a) bVar).c().b(this);
        }
        this.f13116n = bVar;
    }
}
