package M;

import android.view.inputmethod.EditorInfo;
import mf.C6565s;
import mf.Y;

/* renamed from: M.y  reason: case insensitive filesystem */
final class C1283y {

    /* renamed from: a  reason: collision with root package name */
    public static final C1283y f4288a = new C1283y();

    private C1283y() {
    }

    public final void a(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(C6565s.q(C1275p.a(), C1278t.a(), C1276q.a(), r.a(), C1279u.a(), C1280v.a(), C1281w.a()));
        editorInfo.setSupportedHandwritingGesturePreviews(Y.j(C1275p.a(), C1278t.a(), C1276q.a(), r.a()));
    }
}
