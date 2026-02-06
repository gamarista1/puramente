package Ab;

import Bb.a;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ic.C5027b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import ub.C5230g;
import ub.m;
import zb.C5299a;
import zb.C5301c;

public class f extends C5301c {

    /* renamed from: a  reason: collision with root package name */
    private final C5230g f50180a;

    /* renamed from: b  reason: collision with root package name */
    private final C5027b f50181b;

    /* renamed from: c  reason: collision with root package name */
    private final List f50182c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final List f50183d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final k f50184e;

    /* renamed from: f  reason: collision with root package name */
    private final l f50185f;

    /* renamed from: g  reason: collision with root package name */
    private final Executor f50186g;

    /* renamed from: h  reason: collision with root package name */
    private final Executor f50187h;

    /* renamed from: i  reason: collision with root package name */
    private final Executor f50188i;

    /* renamed from: j  reason: collision with root package name */
    private final Task f50189j;

    /* renamed from: k  reason: collision with root package name */
    private final a f50190k;

    /* renamed from: l  reason: collision with root package name */
    private C5299a f50191l;

    public f(C5230g gVar, C5027b bVar, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService) {
        C4536s.l(gVar);
        C4536s.l(bVar);
        this.f50180a = gVar;
        this.f50181b = bVar;
        this.f50184e = new k(gVar.m(), gVar.s());
        this.f50185f = new l(gVar.m(), this, executor2, scheduledExecutorService);
        this.f50186g = executor;
        this.f50187h = executor2;
        this.f50188i = executor3;
        this.f50189j = m(executor3);
        this.f50190k = new a.C0766a();
    }

    private boolean i() {
        C5299a aVar = this.f50191l;
        if (aVar == null || aVar.a() - this.f50190k.currentTimeMillis() <= 300000) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Task j(Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(b.c((C5299a) task.getResult()));
        }
        return Tasks.forResult(b.d(new m(task.getException().getMessage(), task.getException())));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task k(boolean z10, Task task) {
        if (z10 || !i()) {
            return Tasks.forResult(b.d(new m("No AppCheckProvider installed.")));
        }
        return Tasks.forResult(b.c(this.f50191l));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l(TaskCompletionSource taskCompletionSource) {
        C5299a d10 = this.f50184e.d();
        if (d10 != null) {
            n(d10);
        }
        taskCompletionSource.setResult(null);
    }

    private Task m(Executor executor) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new c(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public Task a(boolean z10) {
        return this.f50189j.continueWithTask(this.f50187h, new d(this, z10));
    }

    public void b(Cb.a aVar) {
        C4536s.l(aVar);
        this.f50182c.add(aVar);
        this.f50185f.d(this.f50182c.size() + this.f50183d.size());
        if (i()) {
            aVar.a(b.c(this.f50191l));
        }
    }

    public Task c() {
        return h().continueWithTask(this.f50187h, new e());
    }

    /* access modifiers changed from: package-private */
    public Task g() {
        throw null;
    }

    public Task h() {
        return Tasks.forException(new m("No AppCheckProvider installed."));
    }

    /* access modifiers changed from: package-private */
    public void n(C5299a aVar) {
        this.f50191l = aVar;
    }
}
