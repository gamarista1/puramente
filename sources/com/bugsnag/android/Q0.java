package com.bugsnag.android;

import K4.k;
import K4.r;
import com.bugsnag.android.v1;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Q0 extends C3261o {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f38574a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f38575b;

    /* renamed from: c  reason: collision with root package name */
    private final S0 f38576c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q0(k kVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, (i10 & 2) != 0 ? new ScheduledThreadPoolExecutor(1) : scheduledThreadPoolExecutor);
    }

    /* access modifiers changed from: private */
    public static final void c(Q0 q02) {
        q02.e();
    }

    public final boolean d() {
        return this.f38575b.get();
    }

    public final void e() {
        this.f38574a.shutdown();
        this.f38575b.set(false);
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            v1.p pVar = new v1.p(false);
            for (r onStateChange : getObservers$bugsnag_android_core_release()) {
                onStateChange.onStateChange(pVar);
            }
        }
        this.f38576c.g("App launch period marked as complete");
    }

    public Q0(k kVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f38574a = scheduledThreadPoolExecutor;
        this.f38575b = new AtomicBoolean(true);
        this.f38576c = kVar.r();
        long q10 = kVar.q();
        if (q10 > 0) {
            scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
            try {
                scheduledThreadPoolExecutor.schedule(new P0(this), q10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                this.f38576c.b("Failed to schedule timer for LaunchCrashTracker", e10);
            }
        }
    }
}
