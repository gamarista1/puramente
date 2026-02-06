package U;

import B.i;
import B.n;
import Ug.K;
import Y.A1;
import kotlin.jvm.internal.C6498u;
import t0.C2605f;
import x.C2844H;
import yf.C6787a;

public abstract class o implements C2844H {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6274a;

    /* renamed from: b  reason: collision with root package name */
    private final u f6275b;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1 f6276a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(A1 a12) {
            super(0);
            this.f6276a = a12;
        }

        /* renamed from: a */
        public final g invoke() {
            return (g) this.f6276a.getValue();
        }
    }

    public o(boolean z10, A1 a12) {
        this.f6274a = z10;
        this.f6275b = new u(z10, new a(a12));
    }

    public abstract void e(n.b bVar, K k10);

    public final void f(C2605f fVar, float f10, long j10) {
        float f11;
        u uVar = this.f6275b;
        if (Float.isNaN(f10)) {
            f11 = i.a(fVar, this.f6274a, fVar.d());
        } else {
            f11 = fVar.t1(f10);
        }
        uVar.b(fVar, f11, j10);
    }

    public abstract void g(n.b bVar);

    public final void h(i iVar, K k10) {
        this.f6275b.c(iVar, k10);
    }
}
