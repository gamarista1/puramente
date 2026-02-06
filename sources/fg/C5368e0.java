package Fg;

import Hg.g;
import Hg.m;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;
import yg.C6812k;

/* renamed from: Fg.e0  reason: case insensitive filesystem */
final class C5368e0 extends C5366d0 {

    /* renamed from: b  reason: collision with root package name */
    private final v0 f62999b;

    /* renamed from: c  reason: collision with root package name */
    private final List f63000c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f63001d;

    /* renamed from: e  reason: collision with root package name */
    private final C6812k f63002e;

    /* renamed from: f  reason: collision with root package name */
    private final C6798l f63003f;

    public C5368e0(v0 v0Var, List list, boolean z10, C6812k kVar, C6798l lVar) {
        C6496s.h(v0Var, "constructor");
        C6496s.h(list, "arguments");
        C6496s.h(kVar, "memberScope");
        C6496s.h(lVar, "refinedTypeFactory");
        this.f62999b = v0Var;
        this.f63000c = list;
        this.f63001d = z10;
        this.f63002e = kVar;
        this.f63003f = lVar;
        if ((o() instanceof g) && !(o() instanceof m)) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + o() + 10 + N0());
        }
    }

    public List L0() {
        return this.f63000c;
    }

    public r0 M0() {
        return r0.f63046b.j();
    }

    public v0 N0() {
        return this.f62999b;
    }

    public boolean O0() {
        return this.f63001d;
    }

    /* renamed from: U0 */
    public C5366d0 R0(boolean z10) {
        if (z10 == O0()) {
            return this;
        }
        if (z10) {
            return new C5362b0(this);
        }
        return new Z(this);
    }

    /* renamed from: V0 */
    public C5366d0 T0(r0 r0Var) {
        C6496s.h(r0Var, "newAttributes");
        if (r0Var.isEmpty()) {
            return this;
        }
        return new C5370f0(this, r0Var);
    }

    /* renamed from: W0 */
    public C5366d0 S0(Gg.g gVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        C5366d0 d0Var = (C5366d0) this.f63003f.invoke(gVar);
        if (d0Var == null) {
            return this;
        }
        return d0Var;
    }

    public C6812k o() {
        return this.f63002e;
    }
}
