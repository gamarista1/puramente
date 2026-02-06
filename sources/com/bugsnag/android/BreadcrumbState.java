package com.bugsnag.android;

import K4.g;
import K4.r;
import com.bugsnag.android.K0;
import com.bugsnag.android.v1;
import com.google.android.gms.common.api.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import mf.C6559l;
import mf.C6565s;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00038\u0002XD¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/bugsnag/android/BreadcrumbState;", "Lcom/bugsnag/android/o;", "Lcom/bugsnag/android/K0$a;", "", "maxBreadcrumbs", "Lcom/bugsnag/android/z;", "callbackState", "Lcom/bugsnag/android/S0;", "logger", "<init>", "(ILcom/bugsnag/android/z;Lcom/bugsnag/android/S0;)V", "getBreadcrumbIndex", "()I", "Lcom/bugsnag/android/Breadcrumb;", "breadcrumb", "Llf/M;", "add", "(Lcom/bugsnag/android/Breadcrumb;)V", "", "copy", "()Ljava/util/List;", "Lcom/bugsnag/android/K0;", "writer", "toStream", "(Lcom/bugsnag/android/K0;)V", "I", "Lcom/bugsnag/android/z;", "Lcom/bugsnag/android/S0;", "validIndexMask", "", "store", "[Lcom/bugsnag/android/Breadcrumb;", "Ljava/util/concurrent/atomic/AtomicInteger;", "index", "Ljava/util/concurrent/atomic/AtomicInteger;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BreadcrumbState extends C3261o implements K0.a {
    private final C3284z callbackState;
    private final AtomicInteger index;
    private final S0 logger;
    private final int maxBreadcrumbs;
    private final Breadcrumb[] store;
    private final int validIndexMask = a.e.API_PRIORITY_OTHER;

    public BreadcrumbState(int i10, C3284z zVar, S0 s02) {
        this.maxBreadcrumbs = i10;
        this.callbackState = zVar;
        this.logger = s02;
        this.store = new Breadcrumb[i10];
        this.index = new AtomicInteger(0);
    }

    private final int getBreadcrumbIndex() {
        int i10;
        do {
            i10 = this.index.get() & this.validIndexMask;
        } while (!this.index.compareAndSet(i10, (i10 + 1) % this.maxBreadcrumbs));
        return i10;
    }

    public final void add(Breadcrumb breadcrumb) {
        if (this.maxBreadcrumbs != 0 && this.callbackState.g(breadcrumb, this.logger)) {
            this.store[getBreadcrumbIndex()] = breadcrumb;
            if (!getObservers$bugsnag_android_core_release().isEmpty()) {
                C3267q qVar = breadcrumb.impl;
                String str = qVar.f38822a;
                BreadcrumbType breadcrumbType = qVar.f38823b;
                String c10 = g.c(qVar.f38825d);
                Map map = breadcrumb.impl.f38824c;
                if (map == null) {
                    map = new LinkedHashMap();
                }
                v1.a aVar = new v1.a(str, breadcrumbType, c10, map);
                for (r onStateChange : getObservers$bugsnag_android_core_release()) {
                    onStateChange.onStateChange(aVar);
                }
            }
        }
    }

    public final List<Breadcrumb> copy() {
        if (this.maxBreadcrumbs == 0) {
            return C6565s.n();
        }
        int i10 = -1;
        while (i10 == -1) {
            i10 = this.index.getAndSet(-1);
        }
        try {
            int i11 = this.maxBreadcrumbs;
            Breadcrumb[] breadcrumbArr = new Breadcrumb[i11];
            C6559l.m(this.store, breadcrumbArr, 0, i10, i11);
            C6559l.m(this.store, breadcrumbArr, this.maxBreadcrumbs - i10, 0, i10);
            return C6559l.Z(breadcrumbArr);
        } finally {
            this.index.set(i10);
        }
    }

    public void toStream(K0 k02) {
        List<Breadcrumb> copy = copy();
        k02.f();
        for (Breadcrumb stream : copy) {
            stream.toStream(k02);
        }
        k02.q();
    }
}
