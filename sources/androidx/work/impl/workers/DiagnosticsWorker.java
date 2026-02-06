package androidx.work.impl.workers;

import P3.j;
import P3.o;
import P3.v;
import P3.z;
import S3.e;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.P;
import androidx.work.impl.WorkDatabase;
import androidx.work.r;
import androidx.work.s;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/r$a;", "a", "()Landroidx/work/r$a;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C6496s.h(context, "context");
        C6496s.h(workerParameters, "parameters");
    }

    public r.a a() {
        P i10 = P.i(getApplicationContext());
        C6496s.g(i10, "getInstance(applicationContext)");
        WorkDatabase n10 = i10.n();
        C6496s.g(n10, "workManager.workDatabase");
        v H10 = n10.H();
        o F10 = n10.F();
        z I10 = n10.I();
        j E10 = n10.E();
        List c10 = H10.c(i10.g().a().currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        List t10 = H10.t();
        List k10 = H10.k(200);
        if (!c10.isEmpty()) {
            s.e().f(e.f5907a, "Recently completed work:\n\n");
            s.e().f(e.f5907a, e.d(F10, I10, E10, c10));
        }
        if (!t10.isEmpty()) {
            s.e().f(e.f5907a, "Running work:\n\n");
            s.e().f(e.f5907a, e.d(F10, I10, E10, t10));
        }
        if (!k10.isEmpty()) {
            s.e().f(e.f5907a, "Enqueued work:\n\n");
            s.e().f(e.f5907a, e.d(F10, I10, E10, k10));
        }
        r.a c11 = r.a.c();
        C6496s.g(c11, "success()");
        return c11;
    }
}
