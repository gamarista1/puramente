package J;

import B0.b;
import Ff.g;
import P.G;
import P.J;
import W0.I;
import W0.Q;
import Y.C1500m;
import Y.C1506p;
import android.view.KeyEvent;
import k0.h;
import k0.i;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;
import yf.q;

public abstract class S {

    static final class a extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1228y f2928a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ G f2929b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Q f2930c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f2931d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f2932e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ I f2933f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ l0 f2934g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C6798l f2935h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f2936i;

        /* renamed from: J.S$a$a  reason: collision with other inner class name */
        /* synthetic */ class C0054a extends C6494p implements C6798l {
            C0054a(Object obj) {
                super(1, obj, Q.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            }

            public final Boolean i(KeyEvent keyEvent) {
                return Boolean.valueOf(((Q) this.receiver).l(keyEvent));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return i(((b) obj).f());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1228y yVar, G g10, Q q10, boolean z10, boolean z11, I i10, l0 l0Var, C6798l lVar, int i11) {
            super(3);
            this.f2928a = yVar;
            this.f2929b = g10;
            this.f2930c = q10;
            this.f2931d = z10;
            this.f2932e = z11;
            this.f2933f = i10;
            this.f2934g = l0Var;
            this.f2935h = lVar;
            this.f2936i = i11;
        }

        public final i a(i iVar, C1500m mVar, int i10) {
            C1500m mVar2 = mVar;
            mVar2.T(851809892);
            if (C1506p.H()) {
                C1506p.Q(851809892, i10, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:245)");
            }
            Object A10 = mVar.A();
            C1500m.a aVar = C1500m.f10026a;
            if (A10 == aVar.a()) {
                A10 = new J();
                mVar2.r(A10);
            }
            J j10 = (J) A10;
            Object A11 = mVar.A();
            if (A11 == aVar.a()) {
                A11 = new C1214j();
                mVar2.r(A11);
            }
            Q q10 = new Q(this.f2928a, this.f2929b, this.f2930c, this.f2931d, this.f2932e, j10, this.f2933f, this.f2934g, (C1214j) A11, (r) null, this.f2935h, this.f2936i, 512, (DefaultConstructorMarker) null);
            i.a aVar2 = i.f23074a;
            boolean C10 = mVar2.C(q10);
            Object A12 = mVar.A();
            if (C10 || A12 == aVar.a()) {
                A12 = new C0054a(q10);
                mVar2.r(A12);
            }
            i a10 = androidx.compose.ui.input.key.a.a(aVar2, (C6798l) ((g) A12));
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.M();
            return a10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((i) obj, (C1500m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final i a(i iVar, C1228y yVar, G g10, Q q10, C6798l lVar, boolean z10, boolean z11, I i10, l0 l0Var, int i11) {
        i iVar2 = iVar;
        return h.c(iVar, (C6798l) null, new a(yVar, g10, q10, z10, z11, i10, l0Var, lVar, i11), 1, (Object) null);
    }
}
