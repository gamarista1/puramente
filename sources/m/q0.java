package M;

import H0.C1197s;
import J.C1228y;
import P.G;
import Ug.C5600w0;
import W0.L;
import androidx.compose.ui.platform.C1651m1;
import androidx.compose.ui.platform.v1;
import yf.p;

public abstract class q0 implements L {

    /* renamed from: a  reason: collision with root package name */
    private a f4254a;

    public interface a {
        C1228y E1();

        C5600w0 U0(p pVar);

        G f1();

        C1651m1 getSoftwareKeyboardController();

        v1 getViewConfiguration();

        C1197s x0();
    }

    public final void f() {
        C1651m1 softwareKeyboardController;
        a aVar = this.f4254a;
        if (aVar != null && (softwareKeyboardController = aVar.getSoftwareKeyboardController()) != null) {
            softwareKeyboardController.a();
        }
    }

    public final void g() {
        C1651m1 softwareKeyboardController;
        a aVar = this.f4254a;
        if (aVar != null && (softwareKeyboardController = aVar.getSoftwareKeyboardController()) != null) {
            softwareKeyboardController.b();
        }
    }

    /* access modifiers changed from: protected */
    public final a i() {
        return this.f4254a;
    }

    public final void j(a aVar) {
        if (this.f4254a == null) {
            this.f4254a = aVar;
            return;
        }
        throw new IllegalStateException("Expected textInputModifierNode to be null");
    }

    public abstract void k();

    public final void l(a aVar) {
        if (this.f4254a == aVar) {
            this.f4254a = null;
            return;
        }
        throw new IllegalStateException(("Expected textInputModifierNode to be " + aVar + " but was " + this.f4254a).toString());
    }
}
