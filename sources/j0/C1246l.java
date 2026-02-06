package J0;

import G0.a;
import android.view.View;
import kotlin.jvm.internal.C6496s;

/* renamed from: J0.l  reason: case insensitive filesystem */
public abstract class C1246l {
    public static final View a(C1244j jVar) {
        if (!jVar.v0().S1()) {
            a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        m0 b10 = K.b(C1245k.m(jVar));
        C6496s.f(b10, "null cannot be cast to non-null type android.view.View");
        return (View) b10;
    }
}
