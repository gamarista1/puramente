package androidx.work;

import Ug.C5584o;
import Ug.C5600w0;
import Ug.C5605z;
import Ug.G;
import Ug.K;
import Ug.L;
import Ug.M;
import Ug.Z;
import android.content.Context;
import androidx.work.impl.utils.futures.c;
import androidx.work.r;
import com.google.common.util.concurrent.g;
import io.branch.rnbranch.RNBranchModule;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6521e;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u001b\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0018\u0010\u000bJ\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0000X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010!\u001a\b\u0012\u0004\u0012\u00020\t0 8\u0000X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010&\u001a\u00020%8\u0016X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010\u001a\u001a\u0004\b(\u0010)\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/r;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lcom/google/common/util/concurrent/g;", "Landroidx/work/r$a;", "startWork", "()Lcom/google/common/util/concurrent/g;", "doWork", "(Lqf/d;)Ljava/lang/Object;", "Landroidx/work/j;", "getForegroundInfo", "Landroidx/work/g;", "data", "Llf/M;", "setProgress", "(Landroidx/work/g;Lqf/d;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Landroidx/work/j;Lqf/d;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "()V", "LUg/z;", "job", "LUg/z;", "getJob$work_runtime_release", "()LUg/z;", "Landroidx/work/impl/utils/futures/c;", "future", "Landroidx/work/impl/utils/futures/c;", "getFuture$work_runtime_release", "()Landroidx/work/impl/utils/futures/c;", "LUg/G;", "coroutineContext", "LUg/G;", "getCoroutineContext", "()LUg/G;", "getCoroutineContext$annotations", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CoroutineWorker extends r {
    private final G coroutineContext;
    private final c future;
    private final C5605z job = C0.b((C5600w0) null, 1, (Object) null);

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f18637a;

        /* renamed from: b  reason: collision with root package name */
        int f18638b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o f18639c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f18640d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(o oVar, CoroutineWorker coroutineWorker, C6658d dVar) {
            super(2, dVar);
            this.f18639c = oVar;
            this.f18640d = coroutineWorker;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f18639c, this.f18640d, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            o oVar;
            Object f10 = C6680b.f();
            int i10 = this.f18638b;
            if (i10 == 0) {
                w.b(obj);
                o oVar2 = this.f18639c;
                CoroutineWorker coroutineWorker = this.f18640d;
                this.f18637a = oVar2;
                this.f18638b = 1;
                Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
                if (foregroundInfo == f10) {
                    return f10;
                }
                oVar = oVar2;
                obj = foregroundInfo;
            } else if (i10 == 1) {
                oVar = (o) this.f18637a;
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar.b(obj);
            return C6514M.f71813a;
        }
    }

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f18641a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f18642b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CoroutineWorker coroutineWorker, C6658d dVar) {
            super(2, dVar);
            this.f18642b = coroutineWorker;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new b(this.f18642b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f18641a;
            if (i10 == 0) {
                w.b(obj);
                CoroutineWorker coroutineWorker = this.f18642b;
                this.f18641a = 1;
                obj = coroutineWorker.doWork(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    w.b(obj);
                } catch (Throwable th2) {
                    this.f18642b.getFuture$work_runtime_release().q(th2);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f18642b.getFuture$work_runtime_release().p((r.a) obj);
            return C6514M.f71813a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C6496s.h(context, "appContext");
        C6496s.h(workerParameters, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS);
        c t10 = c.t();
        C6496s.g(t10, "create()");
        this.future = t10;
        t10.e(new C1839f(this), getTaskExecutor().c());
        this.coroutineContext = Z.a();
    }

    /* access modifiers changed from: private */
    public static final void b(CoroutineWorker coroutineWorker) {
        C6496s.h(coroutineWorker, "this$0");
        if (coroutineWorker.future.isCancelled()) {
            C5600w0.a.a(coroutineWorker.job, (CancellationException) null, 1, (Object) null);
        }
    }

    @C6521e
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, C6658d<? super j> dVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(C6658d dVar);

    public G getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(C6658d<? super j> dVar) {
        return getForegroundInfo$suspendImpl(this, dVar);
    }

    public final g getForegroundInfoAsync() {
        C5605z b10 = C0.b((C5600w0) null, 1, (Object) null);
        K a10 = L.a(getCoroutineContext().n1(b10));
        o oVar = new o(b10, (c) null, 2, (DefaultConstructorMarker) null);
        C5600w0 unused = C5576k.d(a10, (qf.g) null, (M) null, new a(oVar, this, (C6658d) null), 3, (Object) null);
        return oVar;
    }

    public final c getFuture$work_runtime_release() {
        return this.future;
    }

    public final C5605z getJob$work_runtime_release() {
        return this.job;
    }

    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public final Object setForeground(j jVar, C6658d<? super C6514M> dVar) {
        g foregroundAsync = setForegroundAsync(jVar);
        C6496s.g(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e10) {
                e = e10;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                throw e;
            }
        } else {
            C5584o oVar = new C5584o(C6680b.c(dVar), 1);
            oVar.E();
            foregroundAsync.e(new p(oVar, foregroundAsync), h.INSTANCE);
            oVar.s(new q(foregroundAsync));
            Object v10 = oVar.v();
            if (v10 == C6680b.f()) {
                h.c(dVar);
            }
            if (v10 == C6680b.f()) {
                return v10;
            }
        }
        return C6514M.f71813a;
    }

    public final Object setProgress(C1840g gVar, C6658d<? super C6514M> dVar) {
        g progressAsync = setProgressAsync(gVar);
        C6496s.g(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e10) {
                e = e10;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                throw e;
            }
        } else {
            C5584o oVar = new C5584o(C6680b.c(dVar), 1);
            oVar.E();
            progressAsync.e(new p(oVar, progressAsync), h.INSTANCE);
            oVar.s(new q(progressAsync));
            Object v10 = oVar.v();
            if (v10 == C6680b.f()) {
                h.c(dVar);
            }
            if (v10 == C6680b.f()) {
                return v10;
            }
        }
        return C6514M.f71813a;
    }

    public final g startWork() {
        C5600w0 unused = C5576k.d(L.a(getCoroutineContext().n1(this.job)), (qf.g) null, (M) null, new b(this, (C6658d) null), 3, (Object) null);
        return this.future;
    }
}
