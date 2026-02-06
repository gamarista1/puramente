package vc;

import Bc.m;
import com.google.firebase.perf.metrics.AppStartTrace;

/* renamed from: vc.e  reason: case insensitive filesystem */
public final /* synthetic */ class C5252e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppStartTrace f61760a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m.b f61761b;

    public /* synthetic */ C5252e(AppStartTrace appStartTrace, m.b bVar) {
        this.f61760a = appStartTrace;
        this.f61761b = bVar;
    }

    public final void run() {
        this.f61760a.p(this.f61761b);
    }
}
