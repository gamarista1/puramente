package com.revenuecat.purchases;

import androidx.lifecycle.C1798v;
import androidx.lifecycle.DefaultLifecycleObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/AppLifecycleHandler;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/revenuecat/purchases/LifecycleDelegate;", "lifecycleDelegate", "<init>", "(Lcom/revenuecat/purchases/LifecycleDelegate;)V", "Landroidx/lifecycle/v;", "owner", "Llf/M;", "onStart", "(Landroidx/lifecycle/v;)V", "onStop", "onCreate", "onResume", "onPause", "onDestroy", "Lcom/revenuecat/purchases/LifecycleDelegate;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppLifecycleHandler implements DefaultLifecycleObserver {
    private final LifecycleDelegate lifecycleDelegate;

    public AppLifecycleHandler(LifecycleDelegate lifecycleDelegate2) {
        C6496s.h(lifecycleDelegate2, "lifecycleDelegate");
        this.lifecycleDelegate = lifecycleDelegate2;
    }

    public void onCreate(C1798v vVar) {
        C6496s.h(vVar, "owner");
    }

    public void onDestroy(C1798v vVar) {
        C6496s.h(vVar, "owner");
    }

    public void onPause(C1798v vVar) {
        C6496s.h(vVar, "owner");
    }

    public void onResume(C1798v vVar) {
        C6496s.h(vVar, "owner");
    }

    public void onStart(C1798v vVar) {
        C6496s.h(vVar, "owner");
        this.lifecycleDelegate.onAppForegrounded();
    }

    public void onStop(C1798v vVar) {
        C6496s.h(vVar, "owner");
        this.lifecycleDelegate.onAppBackgrounded();
    }
}
