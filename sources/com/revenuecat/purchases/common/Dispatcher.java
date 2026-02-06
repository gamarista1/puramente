package com.revenuecat.purchases.common;

import Cf.c;
import Ef.l;
import Ef.m;
import Tg.a;
import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.verification.SignatureVerificationException;
import io.branch.rnbranch.RNBranchModule;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import org.json.JSONException;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0010\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/common/Dispatcher;", "", "Ljava/util/concurrent/ExecutorService;", "executorService", "Landroid/os/Handler;", "mainHandler", "", "runningIntegrationTests", "<init>", "(Ljava/util/concurrent/ExecutorService;Landroid/os/Handler;Z)V", "Ljava/lang/Runnable;", "command", "Lcom/revenuecat/purchases/common/Delay;", "delay", "Llf/M;", "enqueue", "(Ljava/lang/Runnable;Lcom/revenuecat/purchases/common/Delay;)V", "close", "()V", "isClosed", "()Z", "Ljava/util/concurrent/ExecutorService;", "Landroid/os/Handler;", "Z", "Companion", "AsyncCall", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class Dispatcher {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Deprecated
    public static final double INTEGRATION_TEST_DELAY_PERCENTAGE = 0.01d;
    private final ExecutorService executorService;
    private final Handler mainHandler;
    private final boolean runningIntegrationTests;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0003¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;", "Ljava/lang/Runnable;", "<init>", "()V", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "call", "()Lcom/revenuecat/purchases/common/networking/HTTPResult;", "Lcom/revenuecat/purchases/PurchasesError;", "error", "Llf/M;", "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "result", "onCompletion", "(Lcom/revenuecat/purchases/common/networking/HTTPResult;)V", "run", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class AsyncCall implements Runnable {
        public abstract HTTPResult call();

        public void onCompletion(HTTPResult hTTPResult) {
            C6496s.h(hTTPResult, "result");
        }

        public void onError(PurchasesError purchasesError) {
            C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        }

        public void run() {
            try {
                onCompletion(call());
            } catch (JSONException e10) {
                PurchasesError purchasesError = ErrorsKt.toPurchasesError((Exception) e10);
                LogUtilsKt.errorLog(purchasesError);
                onError(purchasesError);
            } catch (IOException e11) {
                PurchasesError purchasesError2 = ErrorsKt.toPurchasesError((Exception) e11);
                LogUtilsKt.errorLog(purchasesError2);
                onError(purchasesError2);
            } catch (SecurityException e12) {
                PurchasesError purchasesError3 = ErrorsKt.toPurchasesError((Exception) e12);
                LogUtilsKt.errorLog(purchasesError3);
                onError(purchasesError3);
            } catch (SignatureVerificationException e13) {
                PurchasesError purchasesError4 = ErrorsKt.toPurchasesError((Exception) e13);
                LogUtilsKt.errorLog(purchasesError4);
                onError(purchasesError4);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/Dispatcher$Companion;", "", "()V", "INTEGRATION_TEST_DELAY_PERCENTAGE", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public Dispatcher(ExecutorService executorService2, Handler handler, boolean z10) {
        C6496s.h(executorService2, "executorService");
        this.executorService = executorService2;
        this.mainHandler = handler;
        this.runningIntegrationTests = z10;
    }

    public static /* synthetic */ void enqueue$default(Dispatcher dispatcher, Runnable runnable, Delay delay, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                delay = Delay.NONE;
            }
            dispatcher.enqueue(runnable, delay);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
    }

    /* access modifiers changed from: private */
    public static final void enqueue$lambda$2$lambda$1(Runnable runnable, Dispatcher dispatcher) {
        C6496s.h(runnable, "$command");
        C6496s.h(dispatcher, "this$0");
        try {
            runnable.run();
        } catch (Throwable th2) {
            LogUtilsKt.errorLog$default("Exception running command: " + th2, (Throwable) null, 2, (Object) null);
            Handler handler = dispatcher.mainHandler;
            if (handler != null) {
                handler.post(new a(th2));
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void enqueue$lambda$2$lambda$1$lambda$0(Throwable th2) {
        C6496s.h(th2, "$e");
        throw th2;
    }

    public void close() {
        synchronized (this.executorService) {
            this.executorService.shutdownNow();
        }
    }

    public void enqueue(Runnable runnable, Delay delay) {
        C6496s.h(runnable, "command");
        C6496s.h(delay, "delay");
        synchronized (this.executorService) {
            try {
                if (!this.executorService.isShutdown()) {
                    b bVar = new b(runnable, this);
                    if (delay == Delay.NONE || !(this.executorService instanceof ScheduledExecutorService)) {
                        this.executorService.submit(bVar);
                    } else {
                        long r10 = m.r(new l(a.t(delay.m46getMinDelayUwyO8pc()), a.t(delay.m45getMaxDelayUwyO8pc())), c.f62630a);
                        if (this.runningIntegrationTests) {
                            r10 = (long) (((double) r10) * 0.01d);
                        }
                        ((ScheduledExecutorService) this.executorService).schedule(bVar, r10, TimeUnit.MILLISECONDS);
                    }
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean isClosed() {
        boolean isShutdown;
        synchronized (this.executorService) {
            isShutdown = this.executorService.isShutdown();
        }
        return isShutdown;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Dispatcher(ExecutorService executorService2, Handler handler, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(executorService2, (i10 & 2) != 0 ? new Handler(Looper.getMainLooper()) : handler, (i10 & 4) != 0 ? false : z10);
    }
}
