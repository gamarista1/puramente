package com.bugsnag.android;

import K4.r;
import java.util.concurrent.CopyOnWriteArrayList;
import yf.C6787a;

/* renamed from: com.bugsnag.android.o  reason: case insensitive filesystem */
public abstract class C3261o {
    private final CopyOnWriteArrayList<r> observers = new CopyOnWriteArrayList<>();

    public final void addObserver(r rVar) {
        this.observers.addIfAbsent(rVar);
    }

    public final CopyOnWriteArrayList<r> getObservers$bugsnag_android_core_release() {
        return this.observers;
    }

    public final void removeObserver(r rVar) {
        this.observers.remove(rVar);
    }

    public final void updateState(v1 v1Var) {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            for (r onStateChange : getObservers$bugsnag_android_core_release()) {
                onStateChange.onStateChange(v1Var);
            }
        }
    }

    public final void updateState$bugsnag_android_core_release(C6787a aVar) {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            v1 v1Var = (v1) aVar.invoke();
            for (r onStateChange : getObservers$bugsnag_android_core_release()) {
                onStateChange.onStateChange(v1Var);
            }
        }
    }
}
