package H;

import H0.C1197s;
import H0.C1198t;
import J0.C1244j;
import J0.C1246l;
import android.graphics.Rect;
import android.view.View;
import lf.C6514M;
import q0.C2423i;
import qf.C6658d;
import yf.C6787a;

public abstract class d {

    static final class a implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1244j f2478a;

        a(C1244j jVar) {
            this.f2478a = jVar;
        }

        public final Object v1(C1197s sVar, C6787a aVar, C6658d dVar) {
            C2423i iVar;
            View a10 = C1246l.a(this.f2478a);
            long e10 = C1198t.e(sVar);
            C2423i iVar2 = (C2423i) aVar.invoke();
            if (iVar2 != null) {
                iVar = iVar2.t(e10);
            } else {
                iVar = null;
            }
            if (iVar != null) {
                a10.requestRectangleOnScreen(d.c(iVar), false);
            }
            return C6514M.f71813a;
        }
    }

    public static final a b(C1244j jVar) {
        return new a(jVar);
    }

    /* access modifiers changed from: private */
    public static final Rect c(C2423i iVar) {
        return new Rect((int) iVar.i(), (int) iVar.l(), (int) iVar.j(), (int) iVar.e());
    }
}
