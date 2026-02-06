package com.google.firebase.perf.application;

import Bc.d;
import com.google.firebase.perf.application.a;
import java.lang.ref.WeakReference;

public abstract class b implements a.b {
    private final WeakReference<a.b> appStateCallback;
    private final a appStateMonitor;
    private d currentAppState;
    private boolean isRegisteredForAppState;

    protected b() {
        this(a.b());
    }

    public d getAppState() {
        return this.currentAppState;
    }

    public WeakReference<a.b> getAppStateCallback() {
        return this.appStateCallback;
    }

    /* access modifiers changed from: protected */
    public void incrementTsnsCount(int i10) {
        this.appStateMonitor.e(i10);
    }

    public void onUpdateAppState(d dVar) {
        d dVar2 = this.currentAppState;
        d dVar3 = d.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (dVar2 == dVar3) {
            this.currentAppState = dVar;
        } else if (dVar2 != dVar && dVar != dVar3) {
            this.currentAppState = d.FOREGROUND_BACKGROUND;
        }
    }

    /* access modifiers changed from: protected */
    public void registerForAppState() {
        if (!this.isRegisteredForAppState) {
            this.currentAppState = this.appStateMonitor.a();
            this.appStateMonitor.k(this.appStateCallback);
            this.isRegisteredForAppState = true;
        }
    }

    /* access modifiers changed from: protected */
    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            this.appStateMonitor.p(this.appStateCallback);
            this.isRegisteredForAppState = false;
        }
    }

    protected b(a aVar) {
        this.isRegisteredForAppState = false;
        this.currentAppState = d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = aVar;
        this.appStateCallback = new WeakReference<>(this);
    }
}
