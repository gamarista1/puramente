package com.google.firebase.storage;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;

public abstract class D extends C4846b {

    /* renamed from: j  reason: collision with root package name */
    private static final HashMap f57976j;

    /* renamed from: k  reason: collision with root package name */
    private static final HashMap f57977k;

    /* renamed from: a  reason: collision with root package name */
    protected final Object f57978a = new Object();

    /* renamed from: b  reason: collision with root package name */
    final J f57979b = new J(this, 128, new q(this));

    /* renamed from: c  reason: collision with root package name */
    final J f57980c = new J(this, 64, new u(this));

    /* renamed from: d  reason: collision with root package name */
    final J f57981d = new J(this, 448, new v(this));

    /* renamed from: e  reason: collision with root package name */
    final J f57982e = new J(this, 256, new w(this));

    /* renamed from: f  reason: collision with root package name */
    final J f57983f = new J(this, -465, new x());

    /* renamed from: g  reason: collision with root package name */
    final J f57984g = new J(this, 16, new y());

    /* renamed from: h  reason: collision with root package name */
    private volatile int f57985h = 1;

    /* renamed from: i  reason: collision with root package name */
    private a f57986i;

    protected interface a {
        Exception a();
    }

    public class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final Exception f57987a;

        public b(Exception exc) {
            if (exc != null) {
                this.f57987a = exc;
            } else if (D.this.isCanceled()) {
                this.f57987a = m.c(Status.f53911j);
            } else if (D.this.B() == 64) {
                this.f57987a = m.c(Status.f53909h);
            } else {
                this.f57987a = null;
            }
        }

        public Exception a() {
            return this.f57987a;
        }

        public D b() {
            return D.this;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f57976j = hashMap;
        HashMap hashMap2 = new HashMap();
        f57977k = hashMap2;
        hashMap.put(1, new HashSet(Arrays.asList(new Integer[]{16, 256})));
        hashMap.put(2, new HashSet(Arrays.asList(new Integer[]{8, 32})));
        hashMap.put(4, new HashSet(Arrays.asList(new Integer[]{8, 32})));
        hashMap.put(16, new HashSet(Arrays.asList(new Integer[]{2, 256})));
        hashMap.put(64, new HashSet(Arrays.asList(new Integer[]{2, 256})));
        hashMap2.put(1, new HashSet(Arrays.asList(new Integer[]{2, 64})));
        hashMap2.put(2, new HashSet(Arrays.asList(new Integer[]{4, 64, 128})));
        hashMap2.put(4, new HashSet(Arrays.asList(new Integer[]{4, 64, 128})));
        hashMap2.put(8, new HashSet(Arrays.asList(new Integer[]{16, 64, 128})));
        hashMap2.put(32, new HashSet(Arrays.asList(new Integer[]{256, 64, 128})));
    }

    protected D() {
    }

    private a A() {
        a aVar = this.f57986i;
        if (aVar != null) {
            return aVar;
        }
        if (!isComplete()) {
            return null;
        }
        if (this.f57986i == null) {
            this.f57986i = g0();
        }
        return this.f57986i;
    }

    private String G(int i10) {
        if (i10 == 1) {
            return "INTERNAL_STATE_NOT_STARTED";
        }
        if (i10 == 2) {
            return "INTERNAL_STATE_QUEUED";
        }
        if (i10 == 4) {
            return "INTERNAL_STATE_IN_PROGRESS";
        }
        if (i10 == 8) {
            return "INTERNAL_STATE_PAUSING";
        }
        if (i10 == 16) {
            return "INTERNAL_STATE_PAUSED";
        }
        if (i10 == 32) {
            return "INTERNAL_STATE_CANCELING";
        }
        if (i10 == 64) {
            return "INTERNAL_STATE_FAILURE";
        }
        if (i10 == 128) {
            return "INTERNAL_STATE_SUCCESS";
        }
        if (i10 != 256) {
            return "Unknown Internal State!";
        }
        return "INTERNAL_STATE_CANCELED";
    }

    private String H(int[] iArr) {
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int G10 : iArr) {
            sb2.append(G(G10));
            sb2.append(", ");
        }
        return sb2.substring(0, sb2.length() - 2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void M(Continuation continuation, TaskCompletionSource taskCompletionSource, Task task) {
        try {
            Object then = continuation.then(this);
            if (!taskCompletionSource.getTask().isComplete()) {
                taskCompletionSource.setResult(then);
            }
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                taskCompletionSource.setException((Exception) e10.getCause());
            } else {
                taskCompletionSource.setException(e10);
            }
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void N(Continuation continuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource, Task task) {
        try {
            Task task2 = (Task) continuation.then(this);
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            if (task2 == null) {
                taskCompletionSource.setException(new NullPointerException("Continuation returned null"));
                return;
            }
            task2.addOnSuccessListener(new r(taskCompletionSource));
            task2.addOnFailureListener(new s(taskCompletionSource));
            Objects.requireNonNull(cancellationTokenSource);
            task2.addOnCanceledListener(new t(cancellationTokenSource));
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                taskCompletionSource.setException((Exception) e10.getCause());
            } else {
                taskCompletionSource.setException(e10);
            }
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void O() {
        try {
            e0();
        } finally {
            z();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void P(OnSuccessListener onSuccessListener, a aVar) {
        E.b().c(this);
        onSuccessListener.onSuccess(aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Q(OnFailureListener onFailureListener, a aVar) {
        E.b().c(this);
        onFailureListener.onFailure(aVar.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void R(OnCompleteListener onCompleteListener, a aVar) {
        E.b().c(this);
        onCompleteListener.onComplete(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void S(OnCanceledListener onCanceledListener, a aVar) {
        E.b().c(this);
        onCanceledListener.onCanceled();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void T(SuccessContinuation successContinuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource, a aVar) {
        try {
            Task then = successContinuation.then(aVar);
            Objects.requireNonNull(taskCompletionSource);
            then.addOnSuccessListener(new r(taskCompletionSource));
            then.addOnFailureListener(new s(taskCompletionSource));
            Objects.requireNonNull(cancellationTokenSource);
            then.addOnCanceledListener(new t(cancellationTokenSource));
        } catch (RuntimeExecutionException e10) {
            if (e10.getCause() instanceof Exception) {
                taskCompletionSource.setException((Exception) e10.getCause());
            } else {
                taskCompletionSource.setException(e10);
            }
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    private Task i0(Executor executor, SuccessContinuation successContinuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f57979b.d((Activity) null, executor, new C(successContinuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.getTask();
    }

    private Task x(Executor executor, Continuation continuation) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f57981d.d((Activity) null, executor, new z(this, continuation, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task y(Executor executor, Continuation continuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f57981d.d((Activity) null, executor, new B(this, continuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.getTask();
    }

    private void z() {
        if (!isComplete() && !L() && B() != 2 && !j0(256, false)) {
            j0(64, false);
        }
    }

    /* access modifiers changed from: package-private */
    public int B() {
        return this.f57985h;
    }

    /* renamed from: C */
    public a getResult() {
        if (A() != null) {
            Exception a10 = A().a();
            if (a10 == null) {
                return A();
            }
            throw new RuntimeExecutionException(a10);
        }
        throw new IllegalStateException();
    }

    /* renamed from: D */
    public a getResult(Class cls) {
        if (A() == null) {
            throw new IllegalStateException();
        } else if (!cls.isInstance(A().a())) {
            Exception a10 = A().a();
            if (a10 == null) {
                return A();
            }
            throw new RuntimeExecutionException(a10);
        } else {
            throw ((Throwable) cls.cast(A().a()));
        }
    }

    /* access modifiers changed from: package-private */
    public Runnable E() {
        return new A(this);
    }

    public a F() {
        return g0();
    }

    /* access modifiers changed from: package-private */
    public abstract o I();

    /* access modifiers changed from: package-private */
    public Object J() {
        return this.f57978a;
    }

    public boolean K() {
        if ((B() & -465) != 0) {
            return true;
        }
        return false;
    }

    public boolean L() {
        if ((B() & 16) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void U() {
    }

    /* access modifiers changed from: protected */
    public void V() {
    }

    /* access modifiers changed from: protected */
    public void W() {
    }

    /* access modifiers changed from: protected */
    public void X() {
    }

    /* access modifiers changed from: protected */
    public void Y() {
    }

    /* access modifiers changed from: protected */
    public void Z() {
    }

    public boolean a0() {
        return k0(new int[]{16, 8}, true);
    }

    /* access modifiers changed from: package-private */
    public boolean b0() {
        if (!j0(2, false)) {
            return false;
        }
        f0();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void c0() {
    }

    public Task continueWith(Continuation continuation) {
        return x((Executor) null, continuation);
    }

    public Task continueWithTask(Continuation continuation) {
        return y((Executor) null, continuation);
    }

    public boolean d0() {
        if (!j0(2, true)) {
            return false;
        }
        c0();
        f0();
        return true;
    }

    /* access modifiers changed from: package-private */
    public abstract void e0();

    /* access modifiers changed from: package-private */
    public abstract void f0();

    /* access modifiers changed from: package-private */
    public a g0() {
        a h02;
        synchronized (this.f57978a) {
            h02 = h0();
        }
        return h02;
    }

    public Exception getException() {
        if (A() == null) {
            return null;
        }
        return A().a();
    }

    /* access modifiers changed from: package-private */
    public abstract a h0();

    /* renamed from: i */
    public D addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        C4536s.l(onCanceledListener);
        C4536s.l(activity);
        this.f57982e.d(activity, (Executor) null, onCanceledListener);
        return this;
    }

    public boolean isCanceled() {
        if (B() == 256) {
            return true;
        }
        return false;
    }

    public boolean isComplete() {
        if ((B() & 448) != 0) {
            return true;
        }
        return false;
    }

    public boolean isSuccessful() {
        if ((B() & 128) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public D addOnCanceledListener(OnCanceledListener onCanceledListener) {
        C4536s.l(onCanceledListener);
        this.f57982e.d((Activity) null, (Executor) null, onCanceledListener);
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean j0(int i10, boolean z10) {
        return k0(new int[]{i10}, z10);
    }

    /* renamed from: k */
    public D addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        C4536s.l(onCanceledListener);
        C4536s.l(executor);
        this.f57982e.d((Activity) null, executor, onCanceledListener);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bf, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k0(int[] r9, boolean r10) {
        /*
            r8 = this;
            if (r10 == 0) goto L_0x0005
            java.util.HashMap r0 = f57976j
            goto L_0x0007
        L_0x0005:
            java.util.HashMap r0 = f57977k
        L_0x0007:
            java.lang.Object r1 = r8.f57978a
            monitor-enter(r1)
            int r2 = r9.length     // Catch:{ all -> 0x004a }
            r3 = 0
            r4 = r3
        L_0x000d:
            if (r4 >= r2) goto L_0x00c5
            r5 = r9[r4]     // Catch:{ all -> 0x004a }
            int r6 = r8.B()     // Catch:{ all -> 0x004a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x004a }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x004a }
            java.util.HashSet r6 = (java.util.HashSet) r6     // Catch:{ all -> 0x004a }
            if (r6 == 0) goto L_0x00c1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x004a }
            boolean r6 = r6.contains(r7)     // Catch:{ all -> 0x004a }
            if (r6 == 0) goto L_0x00c1
            r8.f57985h = r5     // Catch:{ all -> 0x004a }
            int r9 = r8.f57985h     // Catch:{ all -> 0x004a }
            r0 = 2
            if (r9 == r0) goto L_0x005d
            r0 = 4
            if (r9 == r0) goto L_0x0059
            r0 = 16
            if (r9 == r0) goto L_0x0055
            r0 = 64
            if (r9 == r0) goto L_0x0051
            r0 = 128(0x80, float:1.794E-43)
            if (r9 == r0) goto L_0x004d
            r0 = 256(0x100, float:3.59E-43)
            if (r9 == r0) goto L_0x0046
            goto L_0x0067
        L_0x0046:
            r8.U()     // Catch:{ all -> 0x004a }
            goto L_0x0067
        L_0x004a:
            r9 = move-exception
            goto L_0x00f7
        L_0x004d:
            r8.Z()     // Catch:{ all -> 0x004a }
            goto L_0x0067
        L_0x0051:
            r8.V()     // Catch:{ all -> 0x004a }
            goto L_0x0067
        L_0x0055:
            r8.W()     // Catch:{ all -> 0x004a }
            goto L_0x0067
        L_0x0059:
            r8.X()     // Catch:{ all -> 0x004a }
            goto L_0x0067
        L_0x005d:
            com.google.firebase.storage.E r9 = com.google.firebase.storage.E.b()     // Catch:{ all -> 0x004a }
            r9.a(r8)     // Catch:{ all -> 0x004a }
            r8.Y()     // Catch:{ all -> 0x004a }
        L_0x0067:
            com.google.firebase.storage.J r9 = r8.f57979b     // Catch:{ all -> 0x004a }
            r9.h()     // Catch:{ all -> 0x004a }
            com.google.firebase.storage.J r9 = r8.f57980c     // Catch:{ all -> 0x004a }
            r9.h()     // Catch:{ all -> 0x004a }
            com.google.firebase.storage.J r9 = r8.f57982e     // Catch:{ all -> 0x004a }
            r9.h()     // Catch:{ all -> 0x004a }
            com.google.firebase.storage.J r9 = r8.f57981d     // Catch:{ all -> 0x004a }
            r9.h()     // Catch:{ all -> 0x004a }
            com.google.firebase.storage.J r9 = r8.f57984g     // Catch:{ all -> 0x004a }
            r9.h()     // Catch:{ all -> 0x004a }
            com.google.firebase.storage.J r9 = r8.f57983f     // Catch:{ all -> 0x004a }
            r9.h()     // Catch:{ all -> 0x004a }
            java.lang.String r9 = "StorageTask"
            r0 = 3
            boolean r9 = android.util.Log.isLoggable(r9, r0)     // Catch:{ all -> 0x004a }
            if (r9 == 0) goto L_0x00be
            java.lang.String r9 = "StorageTask"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r0.<init>()     // Catch:{ all -> 0x004a }
            java.lang.String r2 = "changed internal state to: "
            r0.append(r2)     // Catch:{ all -> 0x004a }
            java.lang.String r2 = r8.G(r5)     // Catch:{ all -> 0x004a }
            r0.append(r2)     // Catch:{ all -> 0x004a }
            java.lang.String r2 = " isUser: "
            r0.append(r2)     // Catch:{ all -> 0x004a }
            r0.append(r10)     // Catch:{ all -> 0x004a }
            java.lang.String r10 = " from state:"
            r0.append(r10)     // Catch:{ all -> 0x004a }
            int r10 = r8.f57985h     // Catch:{ all -> 0x004a }
            java.lang.String r10 = r8.G(r10)     // Catch:{ all -> 0x004a }
            r0.append(r10)     // Catch:{ all -> 0x004a }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x004a }
            android.util.Log.d(r9, r10)     // Catch:{ all -> 0x004a }
        L_0x00be:
            monitor-exit(r1)     // Catch:{ all -> 0x004a }
            r9 = 1
            return r9
        L_0x00c1:
            int r4 = r4 + 1
            goto L_0x000d
        L_0x00c5:
            java.lang.String r0 = "StorageTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r2.<init>()     // Catch:{ all -> 0x004a }
            java.lang.String r4 = "unable to change internal state to: "
            r2.append(r4)     // Catch:{ all -> 0x004a }
            java.lang.String r9 = r8.H(r9)     // Catch:{ all -> 0x004a }
            r2.append(r9)     // Catch:{ all -> 0x004a }
            java.lang.String r9 = " isUser: "
            r2.append(r9)     // Catch:{ all -> 0x004a }
            r2.append(r10)     // Catch:{ all -> 0x004a }
            java.lang.String r9 = " from state:"
            r2.append(r9)     // Catch:{ all -> 0x004a }
            int r9 = r8.f57985h     // Catch:{ all -> 0x004a }
            java.lang.String r9 = r8.G(r9)     // Catch:{ all -> 0x004a }
            r2.append(r9)     // Catch:{ all -> 0x004a }
            java.lang.String r9 = r2.toString()     // Catch:{ all -> 0x004a }
            android.util.Log.w(r0, r9)     // Catch:{ all -> 0x004a }
            monitor-exit(r1)     // Catch:{ all -> 0x004a }
            return r3
        L_0x00f7:
            monitor-exit(r1)     // Catch:{ all -> 0x004a }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.storage.D.k0(int[], boolean):boolean");
    }

    /* renamed from: l */
    public D addOnCompleteListener(Activity activity, OnCompleteListener onCompleteListener) {
        C4536s.l(onCompleteListener);
        C4536s.l(activity);
        this.f57981d.d(activity, (Executor) null, onCompleteListener);
        return this;
    }

    /* renamed from: m */
    public D addOnCompleteListener(OnCompleteListener onCompleteListener) {
        C4536s.l(onCompleteListener);
        this.f57981d.d((Activity) null, (Executor) null, onCompleteListener);
        return this;
    }

    /* renamed from: n */
    public D addOnCompleteListener(Executor executor, OnCompleteListener onCompleteListener) {
        C4536s.l(onCompleteListener);
        C4536s.l(executor);
        this.f57981d.d((Activity) null, executor, onCompleteListener);
        return this;
    }

    /* renamed from: o */
    public D addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        C4536s.l(onFailureListener);
        C4536s.l(activity);
        this.f57980c.d(activity, (Executor) null, onFailureListener);
        return this;
    }

    public Task onSuccessTask(SuccessContinuation successContinuation) {
        return i0((Executor) null, successContinuation);
    }

    /* renamed from: p */
    public D addOnFailureListener(OnFailureListener onFailureListener) {
        C4536s.l(onFailureListener);
        this.f57980c.d((Activity) null, (Executor) null, onFailureListener);
        return this;
    }

    /* renamed from: q */
    public D addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        C4536s.l(onFailureListener);
        C4536s.l(executor);
        this.f57980c.d((Activity) null, executor, onFailureListener);
        return this;
    }

    public D r(Executor executor, C4855k kVar) {
        C4536s.l(kVar);
        C4536s.l(executor);
        this.f57984g.d((Activity) null, executor, kVar);
        return this;
    }

    public D s(Executor executor, C4856l lVar) {
        C4536s.l(lVar);
        C4536s.l(executor);
        this.f57983f.d((Activity) null, executor, lVar);
        return this;
    }

    /* renamed from: t */
    public D addOnSuccessListener(Activity activity, OnSuccessListener onSuccessListener) {
        C4536s.l(activity);
        C4536s.l(onSuccessListener);
        this.f57979b.d(activity, (Executor) null, onSuccessListener);
        return this;
    }

    /* renamed from: u */
    public D addOnSuccessListener(OnSuccessListener onSuccessListener) {
        C4536s.l(onSuccessListener);
        this.f57979b.d((Activity) null, (Executor) null, onSuccessListener);
        return this;
    }

    /* renamed from: v */
    public D addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener) {
        C4536s.l(executor);
        C4536s.l(onSuccessListener);
        this.f57979b.d((Activity) null, executor, onSuccessListener);
        return this;
    }

    public boolean w() {
        return k0(new int[]{256, 32}, true);
    }

    public Task continueWith(Executor executor, Continuation continuation) {
        return x(executor, continuation);
    }

    public Task continueWithTask(Executor executor, Continuation continuation) {
        return y(executor, continuation);
    }

    public Task onSuccessTask(Executor executor, SuccessContinuation successContinuation) {
        return i0(executor, successContinuation);
    }
}
