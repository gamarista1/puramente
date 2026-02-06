package U;

import B.j;
import B.n;
import J0.C1243i;
import J0.C1252s;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2443E0;
import r0.C2448H;
import r0.C2520p0;
import t0.C2605f;
import yf.C6787a;

public final class b extends q implements k {

    /* renamed from: y  reason: collision with root package name */
    private j f6205y;

    /* renamed from: z  reason: collision with root package name */
    private n f6206z;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f6207a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.f6207a = bVar;
        }

        public final void invoke() {
            C1252s.a(this.f6207a);
        }
    }

    public /* synthetic */ b(j jVar, boolean z10, float f10, C2443E0 e02, C6787a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, z10, f10, e02, aVar);
    }

    private final void A2(n nVar) {
        this.f6206z = nVar;
        C1252s.a(this);
    }

    private final j z2() {
        j jVar = this.f6205y;
        if (jVar != null) {
            C6496s.e(jVar);
            return jVar;
        }
        j a10 = t.c(t.e((View) C1243i.a(this, AndroidCompositionLocals_androidKt.k())));
        this.f6205y = a10;
        C6496s.e(a10);
        return a10;
    }

    public void W1() {
        j jVar = this.f6205y;
        if (jVar != null) {
            jVar.a(this);
        }
    }

    public void k1() {
        A2((n) null);
    }

    public void q2(n.b bVar, long j10, float f10) {
        n b10 = z2().b(this);
        b10.b(bVar, s2(), j10, Af.a.d(f10), u2(), ((g) t2().invoke()).d(), new a(this));
        A2(b10);
    }

    public void r2(C2605f fVar) {
        C2520p0 f10 = fVar.w1().f();
        n nVar = this.f6206z;
        if (nVar != null) {
            nVar.f(v2(), u2(), ((g) t2().invoke()).d());
            nVar.draw(C2448H.d(f10));
        }
    }

    public void x2(n.b bVar) {
        n nVar = this.f6206z;
        if (nVar != null) {
            nVar.e();
        }
    }

    private b(j jVar, boolean z10, float f10, C2443E0 e02, C6787a aVar) {
        super(jVar, z10, f10, e02, aVar, (DefaultConstructorMarker) null);
    }
}
