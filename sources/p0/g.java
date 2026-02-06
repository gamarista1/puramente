package p0;

import F0.b;
import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.d;
import k0.i;
import kotlin.jvm.internal.C6498u;
import q0.C2423i;
import yf.C6787a;
import yf.C6798l;

public interface g extends e {

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f25107a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static /* synthetic */ boolean a(g gVar, KeyEvent keyEvent, C6787a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                aVar = a.f25107a;
            }
            return gVar.h(keyEvent, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
    }

    Boolean b(int i10, C2423i iVar, C6798l lVar);

    q d();

    boolean f(KeyEvent keyEvent);

    void g(b bVar);

    boolean h(KeyEvent keyEvent, C6787a aVar);

    void i(FocusTargetNode focusTargetNode);

    boolean j(d dVar, C2423i iVar);

    i k();

    boolean l(boolean z10, boolean z11, boolean z12, int i10);

    l m();

    void n(h hVar);

    C2423i o();

    void p();

    boolean q(b bVar);
}
