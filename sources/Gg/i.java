package Gg;

import Fg.B0;
import Fg.C5366d0;
import Fg.M0;
import Fg.r0;
import Hg.h;
import Hg.l;
import Jg.b;
import Jg.d;
import Of.m0;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yf.C6787a;
import yg.C6812k;

public final class i extends C5366d0 implements d {

    /* renamed from: b  reason: collision with root package name */
    private final b f63182b;

    /* renamed from: c  reason: collision with root package name */
    private final n f63183c;

    /* renamed from: d  reason: collision with root package name */
    private final M0 f63184d;

    /* renamed from: e  reason: collision with root package name */
    private final r0 f63185e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f63186f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f63187g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(b bVar, n nVar, M0 m02, r0 r0Var, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, nVar, m02, (i10 & 8) != 0 ? r0.f63046b.j() : r0Var, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? false : z11);
    }

    public List L0() {
        return C6565s.n();
    }

    public r0 M0() {
        return this.f63185e;
    }

    public boolean O0() {
        return this.f63186f;
    }

    /* renamed from: V0 */
    public C5366d0 T0(r0 r0Var) {
        C6496s.h(r0Var, "newAttributes");
        return new i(this.f63182b, N0(), this.f63184d, r0Var, O0(), this.f63187g);
    }

    public final b W0() {
        return this.f63182b;
    }

    /* renamed from: X0 */
    public n N0() {
        return this.f63183c;
    }

    public final M0 Y0() {
        return this.f63184d;
    }

    public final boolean Z0() {
        return this.f63187g;
    }

    /* renamed from: a1 */
    public i U0(boolean z10) {
        return new i(this.f63182b, N0(), this.f63184d, M0(), z10, false, 32, (DefaultConstructorMarker) null);
    }

    /* renamed from: b1 */
    public i S0(g gVar) {
        M0 m02;
        C6496s.h(gVar, "kotlinTypeRefiner");
        b bVar = this.f63182b;
        n q10 = N0().n(gVar);
        M0 m03 = this.f63184d;
        if (m03 != null) {
            m02 = gVar.h(m03).Q0();
        } else {
            m02 = null;
        }
        return new i(bVar, q10, m02, M0(), O0(), false, 32, (DefaultConstructorMarker) null);
    }

    public C6812k o() {
        return l.a(h.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public i(b bVar, n nVar, M0 m02, r0 r0Var, boolean z10, boolean z11) {
        C6496s.h(bVar, "captureStatus");
        C6496s.h(nVar, "constructor");
        C6496s.h(r0Var, "attributes");
        this.f63182b = bVar;
        this.f63183c = nVar;
        this.f63184d = m02;
        this.f63185e = r0Var;
        this.f63186f = z10;
        this.f63187g = z11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i(b bVar, M0 m02, B0 b02, m0 m0Var) {
        this(bVar, new n(b02, (C6787a) null, (n) null, m0Var, 6, (DefaultConstructorMarker) null), m02, (r0) null, false, false, 56, (DefaultConstructorMarker) null);
        C6496s.h(bVar, "captureStatus");
        C6496s.h(b02, "projection");
        C6496s.h(m0Var, "typeParameter");
    }
}
