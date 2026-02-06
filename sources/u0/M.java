package u0;

import android.graphics.Outline;
import r0.C2469V;
import r0.S1;

public final class M {

    /* renamed from: a  reason: collision with root package name */
    public static final M f26448a = new M();

    private M() {
    }

    public final void a(Outline outline, S1 s12) {
        if (s12 instanceof C2469V) {
            outline.setPath(((C2469V) s12).u());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
