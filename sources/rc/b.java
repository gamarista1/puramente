package rc;

import android.content.Context;
import com.google.firebase.perf.config.a;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;
import ub.C5230g;
import ub.r;

public class b {
    public b(C5230g gVar, r rVar, Executor executor) {
        Context m10 = gVar.m();
        a.g().O(m10);
        com.google.firebase.perf.application.a b10 = com.google.firebase.perf.application.a.b();
        b10.i(m10);
        b10.j(new f());
        if (rVar != null) {
            AppStartTrace k10 = AppStartTrace.k();
            k10.v(m10);
            executor.execute(new AppStartTrace.c(k10));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
