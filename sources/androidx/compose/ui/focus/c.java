package androidx.compose.ui.focus;

import k0.i;
import kotlin.jvm.internal.C6496s;
import p0.b;
import p0.l;
import yf.C6798l;

final class c extends i.c implements b {

    /* renamed from: n  reason: collision with root package name */
    private C6798l f13313n;

    /* renamed from: o  reason: collision with root package name */
    private l f13314o;

    public c(C6798l lVar) {
        this.f13313n = lVar;
    }

    public final void l2(C6798l lVar) {
        this.f13313n = lVar;
    }

    public void m0(l lVar) {
        if (!C6496s.c(this.f13314o, lVar)) {
            this.f13314o = lVar;
            this.f13313n.invoke(lVar);
        }
    }
}
