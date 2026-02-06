package Ac;

import com.google.firebase.perf.metrics.Trace;
import uc.C5233a;
import vc.C5253f;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private static final C5233a f50249a = C5233a.e();

    public static Trace a(Trace trace, C5253f.a aVar) {
        if (aVar.d() > 0) {
            trace.putMetric(b.FRAMES_TOTAL.toString(), (long) aVar.d());
        }
        if (aVar.c() > 0) {
            trace.putMetric(b.FRAMES_SLOW.toString(), (long) aVar.c());
        }
        if (aVar.b() > 0) {
            trace.putMetric(b.FRAMES_FROZEN.toString(), (long) aVar.b());
        }
        C5233a aVar2 = f50249a;
        aVar2.a("Screen trace: " + trace.getName() + " _fr_tot:" + aVar.d() + " _fr_slo:" + aVar.c() + " _fr_fzn:" + aVar.b());
        return trace;
    }
}
