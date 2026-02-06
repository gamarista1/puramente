package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.c;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.C4530l;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.base.zau;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends k> extends h {
    static final ThreadLocal zaa = new u0();
    public static final /* synthetic */ int zad = 0;
    @KeepName
    private v0 resultGuardian;
    protected final a zab;
    protected final WeakReference zac;
    private final Object zae = new Object();
    private final CountDownLatch zaf = new CountDownLatch(1);
    private final ArrayList zag = new ArrayList();
    private l zah;
    private final AtomicReference zai = new AtomicReference();
    /* access modifiers changed from: private */
    public k zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private C4530l zao;
    private volatile k0 zap;
    private boolean zaq = false;

    public static class a extends zau {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(l lVar, k kVar) {
            int i10 = BasePendingResult.zad;
            sendMessage(obtainMessage(1, new Pair((l) C4536s.l(lVar), kVar)));
        }

        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                l lVar = (l) pair.first;
                k kVar = (k) pair.second;
                try {
                    lVar.a(kVar);
                } catch (RuntimeException e10) {
                    BasePendingResult.zal(kVar);
                    throw e10;
                }
            } else if (i10 != 2) {
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
            } else {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f53910i);
            }
        }
    }

    protected BasePendingResult(f fVar) {
        Looper looper;
        if (fVar != null) {
            looper = fVar.f();
        } else {
            looper = Looper.getMainLooper();
        }
        this.zab = new a(looper);
        this.zac = new WeakReference(fVar);
    }

    private final k a() {
        k kVar;
        synchronized (this.zae) {
            C4536s.p(!this.zal, "Result has already been consumed.");
            C4536s.p(isReady(), "Result is not ready.");
            kVar = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        c.a(this.zai.getAndSet((Object) null));
        return (k) C4536s.l(kVar);
    }

    private final void b(k kVar) {
        this.zaj = kVar;
        this.zak = kVar.getStatus();
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            l lVar = this.zah;
            if (lVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(lVar, a());
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((h.a) arrayList.get(i10)).a(this.zak);
        }
        this.zag.clear();
    }

    public static void zal(k kVar) {
    }

    public final void addStatusListener(h.a aVar) {
        boolean z10;
        if (aVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.b(z10, "Callback cannot be null.");
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    aVar.a(this.zak);
                } else {
                    this.zag.add(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final R await() {
        C4536s.k("await must not be called on the UI thread");
        boolean z10 = true;
        C4536s.p(!this.zal, "Result has already been consumed");
        if (this.zap != null) {
            z10 = false;
        }
        C4536s.p(z10, "Cannot await if then() has been called.");
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f53908g);
        }
        C4536s.p(isReady(), "Result is not ready.");
        return a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cancel() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.zae
            monitor-enter(r0)
            boolean r1 = r2.zam     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x0021
            boolean r1 = r2.zal     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x000c
            goto L_0x0021
        L_0x000c:
            com.google.android.gms.common.api.k r1 = r2.zaj     // Catch:{ all -> 0x001f }
            zal(r1)     // Catch:{ all -> 0x001f }
            r1 = 1
            r2.zam = r1     // Catch:{ all -> 0x001f }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f53911j     // Catch:{ all -> 0x001f }
            com.google.android.gms.common.api.k r1 = r2.createFailedResult(r1)     // Catch:{ all -> 0x001f }
            r2.b(r1)     // Catch:{ all -> 0x001f }
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r1 = move-exception
            goto L_0x0023
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.cancel():void");
    }

    /* access modifiers changed from: protected */
    public abstract k createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z10;
        synchronized (this.zae) {
            z10 = this.zam;
        }
        return z10;
    }

    public final boolean isReady() {
        if (this.zaf.getCount() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void setCancelToken(C4530l lVar) {
        synchronized (this.zae) {
        }
    }

    public final void setResult(R r10) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(r10);
                    return;
                }
                isReady();
                C4536s.p(!isReady(), "Results have already been set");
                C4536s.p(!this.zal, "Result has already been consumed");
                b(r10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setResultCallback(com.google.android.gms.common.api.l r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.zae
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000c
            r5 = 0
            r4.zah = r5     // Catch:{ all -> 0x000a }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x000a:
            r5 = move-exception
            goto L_0x003c
        L_0x000c:
            boolean r1 = r4.zal     // Catch:{ all -> 0x000a }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.C4536s.p(r1, r3)     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.internal.k0 r1 = r4.zap     // Catch:{ all -> 0x000a }
            if (r1 != 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.C4536s.p(r2, r1)     // Catch:{ all -> 0x000a }
            boolean r1 = r4.isCanceled()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0028
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x0028:
            boolean r1 = r4.isReady()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0038
            com.google.android.gms.common.api.internal.BasePendingResult$a r1 = r4.zab     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.k r2 = r4.a()     // Catch:{ all -> 0x000a }
            r1.a(r5, r2)     // Catch:{ all -> 0x000a }
            goto L_0x003a
        L_0x0038:
            r4.zah = r5     // Catch:{ all -> 0x000a }
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.setResultCallback(com.google.android.gms.common.api.l):void");
    }

    public final <S extends k> n then(m mVar) {
        boolean z10;
        n b10;
        C4536s.p(!this.zal, "Result has already been consumed.");
        synchronized (this.zae) {
            try {
                boolean z11 = false;
                if (this.zap == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C4536s.p(z10, "Cannot call then() twice.");
                if (this.zah == null) {
                    z11 = true;
                }
                C4536s.p(z11, "Cannot call then() if callbacks are set.");
                C4536s.p(!this.zam, "Cannot call then() if result was canceled.");
                this.zaq = true;
                this.zap = new k0(this.zac);
                b10 = this.zap.b(mVar);
                if (isReady()) {
                    this.zab.a(this.zap, a());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b10;
    }

    public final void zak() {
        boolean z10 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z10 = false;
        }
        this.zaq = z10;
    }

    public final boolean zam() {
        boolean isCanceled;
        synchronized (this.zae) {
            try {
                if (((f) this.zac.get()) != null) {
                    if (!this.zaq) {
                    }
                    isCanceled = isCanceled();
                }
                cancel();
                isCanceled = isCanceled();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return isCanceled;
    }

    public final void zan(l0 l0Var) {
        this.zai.set(l0Var);
    }

    @ResultIgnorabilityUnspecified
    public final R await(long j10, TimeUnit timeUnit) {
        if (j10 > 0) {
            C4536s.k("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z10 = true;
        C4536s.p(!this.zal, "Result has already been consumed.");
        if (this.zap != null) {
            z10 = false;
        }
        C4536s.p(z10, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j10, timeUnit)) {
                forceFailureUnlessReady(Status.f53910i);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f53908g);
        }
        C4536s.p(isReady(), "Result is not ready.");
        return a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setResultCallback(com.google.android.gms.common.api.l r5, long r6, java.util.concurrent.TimeUnit r8) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.zae
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000c
            r5 = 0
            r4.zah = r5     // Catch:{ all -> 0x000a }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x000a:
            r5 = move-exception
            goto L_0x004a
        L_0x000c:
            boolean r1 = r4.zal     // Catch:{ all -> 0x000a }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.C4536s.p(r1, r3)     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.internal.k0 r1 = r4.zap     // Catch:{ all -> 0x000a }
            if (r1 != 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.C4536s.p(r2, r1)     // Catch:{ all -> 0x000a }
            boolean r1 = r4.isCanceled()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0028
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x0028:
            boolean r1 = r4.isReady()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0038
            com.google.android.gms.common.api.internal.BasePendingResult$a r6 = r4.zab     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.k r7 = r4.a()     // Catch:{ all -> 0x000a }
            r6.a(r5, r7)     // Catch:{ all -> 0x000a }
            goto L_0x0048
        L_0x0038:
            r4.zah = r5     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.internal.BasePendingResult$a r5 = r4.zab     // Catch:{ all -> 0x000a }
            long r6 = r8.toMillis(r6)     // Catch:{ all -> 0x000a }
            r8 = 2
            android.os.Message r8 = r5.obtainMessage(r8, r4)     // Catch:{ all -> 0x000a }
            r5.sendMessageDelayed(r8, r6)     // Catch:{ all -> 0x000a }
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.setResultCallback(com.google.android.gms.common.api.l, long, java.util.concurrent.TimeUnit):void");
    }
}
