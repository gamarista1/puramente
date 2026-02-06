package D0;

import android.view.MotionEvent;
import q0.C2421g;
import yf.C6798l;

public abstract class M {
    public static final void a(long j10, C6798l lVar) {
        MotionEvent obtain = MotionEvent.obtain(j10, j10, 3, 0.0f, 0.0f, 0);
        obtain.setSource(0);
        lVar.invoke(obtain);
        obtain.recycle();
    }

    public static final void b(C1124o oVar, long j10, C6798l lVar) {
        d(oVar, j10, lVar, true);
    }

    public static final void c(C1124o oVar, long j10, C6798l lVar) {
        d(oVar, j10, lVar, false);
    }

    private static final void d(C1124o oVar, long j10, C6798l lVar, boolean z10) {
        MotionEvent e10 = oVar.e();
        if (e10 != null) {
            int action = e10.getAction();
            if (z10) {
                e10.setAction(3);
            }
            e10.offsetLocation(-C2421g.m(j10), -C2421g.n(j10));
            lVar.invoke(e10);
            e10.offsetLocation(C2421g.m(j10), C2421g.n(j10));
            e10.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
    }
}
