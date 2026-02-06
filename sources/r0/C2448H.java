package r0;

import android.graphics.Canvas;
import kotlin.jvm.internal.C6496s;

/* renamed from: r0.H  reason: case insensitive filesystem */
public abstract class C2448H {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Canvas f25422a = new Canvas();

    public static final C2520p0 a(H1 h12) {
        C2446G g10 = new C2446G();
        g10.z(new Canvas(C2465Q.b(h12)));
        return g10;
    }

    public static final C2520p0 b(Canvas canvas) {
        C2446G g10 = new C2446G();
        g10.z(canvas);
        return g10;
    }

    public static final Canvas d(C2520p0 p0Var) {
        C6496s.f(p0Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((C2446G) p0Var).a();
    }
}
