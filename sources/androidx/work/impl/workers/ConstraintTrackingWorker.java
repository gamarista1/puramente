package androidx.work.impl.workers;

import M3.b;
import M3.d;
import M3.e;
import M3.f;
import O3.n;
import P3.u;
import P3.v;
import S3.a;
import S3.b;
import Ug.C5600w0;
import Ug.G;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.impl.P;
import androidx.work.impl.utils.futures.c;
import androidx.work.r;
import androidx.work.s;
import com.google.common.util.concurrent.g;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR8\u0010$\u001a&\u0012\f\u0012\n \"*\u0004\u0018\u00010\r0\r \"*\u0012\u0012\f\u0012\n \"*\u0004\u0018\u00010\r0\r\u0018\u00010!0!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R(\u0010)\u001a\u0004\u0018\u00010\u00012\b\u0010%\u001a\u0004\u0018\u00010\u00018G@BX\u000e¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/r;", "LM3/d;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Llf/M;", "d", "()V", "Lcom/google/common/util/concurrent/g;", "Landroidx/work/r$a;", "startWork", "()Lcom/google/common/util/concurrent/g;", "onStopped", "LP3/u;", "workSpec", "LM3/b;", "state", "e", "(LP3/u;LM3/b;)V", "a", "Landroidx/work/WorkerParameters;", "", "b", "Ljava/lang/Object;", "lock", "", "c", "Z", "areConstraintsUnmet", "Landroidx/work/impl/utils/futures/c;", "kotlin.jvm.PlatformType", "Landroidx/work/impl/utils/futures/c;", "future", "<set-?>", "Landroidx/work/r;", "getDelegate", "()Landroidx/work/r;", "delegate", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConstraintTrackingWorker extends r implements d {

    /* renamed from: a  reason: collision with root package name */
    private final WorkerParameters f19002a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f19003b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f19004c;

    /* renamed from: d  reason: collision with root package name */
    private final c f19005d = c.t();

    /* renamed from: e  reason: collision with root package name */
    private r f19006e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C6496s.h(context, "appContext");
        C6496s.h(workerParameters, "workerParameters");
        this.f19002a = workerParameters;
    }

    private final void d() {
        if (!this.f19005d.isCancelled()) {
            String i10 = getInputData().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            s e10 = s.e();
            C6496s.g(e10, "get()");
            if (i10 == null || i10.length() == 0) {
                e10.c(S3.d.f5906a, "No worker to delegate to.");
                c cVar = this.f19005d;
                C6496s.g(cVar, "future");
                boolean unused = S3.d.d(cVar);
                return;
            }
            r b10 = getWorkerFactory().b(getApplicationContext(), i10, this.f19002a);
            this.f19006e = b10;
            if (b10 == null) {
                e10.a(S3.d.f5906a, "No worker to delegate to.");
                c cVar2 = this.f19005d;
                C6496s.g(cVar2, "future");
                boolean unused2 = S3.d.d(cVar2);
                return;
            }
            P i11 = P.i(getApplicationContext());
            C6496s.g(i11, "getInstance(applicationContext)");
            v H10 = i11.n().H();
            String uuid = getId().toString();
            C6496s.g(uuid, "id.toString()");
            u h10 = H10.h(uuid);
            if (h10 == null) {
                c cVar3 = this.f19005d;
                C6496s.g(cVar3, "future");
                boolean unused3 = S3.d.d(cVar3);
                return;
            }
            n m10 = i11.m();
            C6496s.g(m10, "workManagerImpl.trackers");
            e eVar = new e(m10);
            G b11 = i11.o().b();
            C6496s.g(b11, "workManagerImpl.workTask…r.taskCoroutineDispatcher");
            this.f19005d.e(new b(f.b(eVar, h10, b11, this)), new Q3.v());
            if (eVar.a(h10)) {
                String a10 = S3.d.f5906a;
                e10.a(a10, "Constraints met for delegate " + i10);
                try {
                    r rVar = this.f19006e;
                    C6496s.e(rVar);
                    g startWork = rVar.startWork();
                    C6496s.g(startWork, "delegate!!.startWork()");
                    startWork.e(new S3.c(this, startWork), getBackgroundExecutor());
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                String a11 = S3.d.f5906a;
                e10.a(a11, "Constraints not met for delegate " + i10 + ". Requesting retry.");
                c cVar4 = this.f19005d;
                C6496s.g(cVar4, "future");
                boolean unused4 = S3.d.e(cVar4);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void f(C5600w0 w0Var) {
        C6496s.h(w0Var, "$job");
        w0Var.n((CancellationException) null);
    }

    /* access modifiers changed from: private */
    public static final void g(ConstraintTrackingWorker constraintTrackingWorker, g gVar) {
        C6496s.h(constraintTrackingWorker, "this$0");
        C6496s.h(gVar, "$innerFuture");
        synchronized (constraintTrackingWorker.f19003b) {
            try {
                if (constraintTrackingWorker.f19004c) {
                    c cVar = constraintTrackingWorker.f19005d;
                    C6496s.g(cVar, "future");
                    boolean unused = S3.d.e(cVar);
                } else {
                    constraintTrackingWorker.f19005d.r(gVar);
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void h(ConstraintTrackingWorker constraintTrackingWorker) {
        C6496s.h(constraintTrackingWorker, "this$0");
        constraintTrackingWorker.d();
    }

    public void e(u uVar, M3.b bVar) {
        C6496s.h(uVar, "workSpec");
        C6496s.h(bVar, "state");
        s e10 = s.e();
        String a10 = S3.d.f5906a;
        e10.a(a10, "Constraints changed for " + uVar);
        if (bVar instanceof b.C0106b) {
            synchronized (this.f19003b) {
                this.f19004c = true;
                C6514M m10 = C6514M.f71813a;
            }
        }
    }

    public void onStopped() {
        int i10;
        super.onStopped();
        r rVar = this.f19006e;
        if (rVar != null && !rVar.isStopped()) {
            if (Build.VERSION.SDK_INT >= 31) {
                i10 = getStopReason();
            } else {
                i10 = 0;
            }
            rVar.stop(i10);
        }
    }

    public g startWork() {
        getBackgroundExecutor().execute(new a(this));
        c cVar = this.f19005d;
        C6496s.g(cVar, "future");
        return cVar;
    }
}
