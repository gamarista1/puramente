package eh;

import Ug.C5582n;
import Ug.C5584o;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.v;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;

/* renamed from: eh.b  reason: case insensitive filesystem */
public abstract class C5839b {

    /* renamed from: eh.b$a */
    static final class a implements OnCompleteListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5582n f67465a;

        a(C5582n nVar) {
            this.f67465a = nVar;
        }

        public final void onComplete(Task task) {
            Exception exception = task.getException();
            if (exception != null) {
                C5582n nVar = this.f67465a;
                v.a aVar = v.f71841b;
                nVar.resumeWith(v.b(w.a(exception)));
            } else if (task.isCanceled()) {
                C5582n.a.a(this.f67465a, (Throwable) null, 1, (Object) null);
            } else {
                C5582n nVar2 = this.f67465a;
                v.a aVar2 = v.f71841b;
                nVar2.resumeWith(v.b(task.getResult()));
            }
        }
    }

    /* renamed from: eh.b$b  reason: collision with other inner class name */
    static final class C0993b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CancellationTokenSource f67466a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0993b(CancellationTokenSource cancellationTokenSource) {
            super(1);
            this.f67466a = cancellationTokenSource;
        }

        public final void a(Throwable th2) {
            this.f67466a.cancel();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    public static final Object a(Task task, C6658d dVar) {
        return b(task, (CancellationTokenSource) null, dVar);
    }

    private static final Object b(Task task, CancellationTokenSource cancellationTokenSource, C6658d dVar) {
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception != null) {
                throw exception;
            } else if (!task.isCanceled()) {
                return task.getResult();
            } else {
                throw new CancellationException("Task " + task + " was cancelled normally.");
            }
        } else {
            C5584o oVar = new C5584o(C6680b.c(dVar), 1);
            oVar.E();
            task.addOnCompleteListener((Executor) C5838a.f67464a, new a(oVar));
            if (cancellationTokenSource != null) {
                oVar.s(new C0993b(cancellationTokenSource));
            }
            Object v10 = oVar.v();
            if (v10 == C6680b.f()) {
                h.c(dVar);
            }
            return v10;
        }
    }
}
