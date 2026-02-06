package J0;

import D0.P;
import D0.x;
import H0.U;
import I0.f;
import V0.h;
import W0.T;
import android.view.View;
import androidx.compose.ui.platform.C1637i;
import androidx.compose.ui.platform.C1638i0;
import androidx.compose.ui.platform.C1651m1;
import androidx.compose.ui.platform.D1;
import androidx.compose.ui.platform.p1;
import androidx.compose.ui.platform.v1;
import c1.d;
import c1.t;
import l0.g;
import l0.w;
import n0.C2230c;
import qf.C6658d;
import r0.F1;
import u0.C2673c;
import yf.C6787a;
import yf.p;
import z0.C2951a;

public interface m0 extends P {

    /* renamed from: K  reason: collision with root package name */
    public static final a f3894K = a.f3895a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f3895a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static boolean f3896b;

        private a() {
        }

        public final boolean a() {
            return f3896b;
        }
    }

    public interface b {
        void k();
    }

    static /* synthetic */ l0 B(m0 m0Var, p pVar, C6787a aVar, C2673c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                cVar = null;
            }
            return m0Var.w(pVar, aVar, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
    }

    static /* synthetic */ void i(m0 m0Var, G g10, boolean z10, boolean z11, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            m0Var.A(g10, z10, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
    }

    static /* synthetic */ void j(m0 m0Var, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            m0Var.a(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
    }

    static /* synthetic */ void l(m0 m0Var, G g10, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            if ((i10 & 8) != 0) {
                z12 = true;
            }
            m0Var.b(g10, z10, z11, z12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
    }

    static /* synthetic */ void q(m0 m0Var, G g10, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            m0Var.e(g10, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
    }

    void A(G g10, boolean z10, boolean z11);

    void a(boolean z10);

    void b(G g10, boolean z10, boolean z11, boolean z12);

    void c(G g10);

    long d(long j10);

    void e(G g10, boolean z10);

    void g(View view);

    C1637i getAccessibilityManager();

    g getAutofill();

    w getAutofillTree();

    C1638i0 getClipboardManager();

    qf.g getCoroutineContext();

    d getDensity();

    C2230c getDragAndDropManager();

    p0.g getFocusOwner();

    h.b getFontFamilyResolver();

    V0.g getFontLoader();

    F1 getGraphicsContext();

    C2951a getHapticFeedBack();

    A0.b getInputModeManager();

    t getLayoutDirection();

    f getModifierLocalManager();

    U.a getPlacementScope();

    x getPointerIconService();

    G getRoot();

    I getSharedDrawScope();

    boolean getShowLayoutBounds();

    o0 getSnapshotObserver();

    C1651m1 getSoftwareKeyboardController();

    T getTextInputService();

    p1 getTextToolbar();

    v1 getViewConfiguration();

    D1 getWindowInfo();

    void h(C6787a aVar);

    Object k(p pVar, C6658d dVar);

    void m(G g10, long j10);

    long r(long j10);

    void s(G g10);

    void setShowLayoutBounds(boolean z10);

    void t(G g10);

    void v(G g10);

    l0 w(p pVar, C6787a aVar, C2673c cVar);

    void x();

    void z();
}
