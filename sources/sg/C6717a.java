package sg;

import Fg.B0;
import Fg.C5366d0;
import Fg.r0;
import Gg.g;
import Hg.h;
import Hg.l;
import Jg.d;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yg.C6812k;

/* renamed from: sg.a  reason: case insensitive filesystem */
public final class C6717a extends C5366d0 implements d {

    /* renamed from: b  reason: collision with root package name */
    private final B0 f73529b;

    /* renamed from: c  reason: collision with root package name */
    private final C6718b f73530c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f73531d;

    /* renamed from: e  reason: collision with root package name */
    private final r0 f73532e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6717a(B0 b02, C6718b bVar, boolean z10, r0 r0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(b02, (i10 & 2) != 0 ? new C6719c(b02) : bVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? r0.f63046b.j() : r0Var);
    }

    public List L0() {
        return C6565s.n();
    }

    public r0 M0() {
        return this.f73532e;
    }

    public boolean O0() {
        return this.f73531d;
    }

    /* renamed from: V0 */
    public C5366d0 T0(r0 r0Var) {
        C6496s.h(r0Var, "newAttributes");
        return new C6717a(this.f73529b, N0(), O0(), r0Var);
    }

    /* renamed from: W0 */
    public C6718b N0() {
        return this.f73530c;
    }

    /* renamed from: X0 */
    public C6717a U0(boolean z10) {
        if (z10 == O0()) {
            return this;
        }
        return new C6717a(this.f73529b, N0(), z10, M0());
    }

    /* renamed from: Y0 */
    public C6717a S0(g gVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        B0 n10 = this.f73529b.n(gVar);
        C6496s.g(n10, "refine(...)");
        return new C6717a(n10, N0(), O0(), M0());
    }

    public C6812k o() {
        return l.a(h.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Captured(");
        sb2.append(this.f73529b);
        sb2.append(')');
        if (O0()) {
            str = "?";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public C6717a(B0 b02, C6718b bVar, boolean z10, r0 r0Var) {
        C6496s.h(b02, "typeProjection");
        C6496s.h(bVar, "constructor");
        C6496s.h(r0Var, "attributes");
        this.f73529b = b02;
        this.f73530c = bVar;
        this.f73531d = z10;
        this.f73532e = r0Var;
    }
}
