package com.google.firebase.perf.application;

import Ac.g;
import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.core.app.i;
import androidx.fragment.app.C1769q;
import java.util.HashMap;
import java.util.Map;
import uc.C5233a;
import vc.C5253f;

public class d {

    /* renamed from: e  reason: collision with root package name */
    private static final C5233a f57635e = C5233a.e();

    /* renamed from: a  reason: collision with root package name */
    private final Activity f57636a;

    /* renamed from: b  reason: collision with root package name */
    private final i f57637b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f57638c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f57639d;

    public d(Activity activity) {
        this(activity, new i(), new HashMap());
    }

    static boolean a() {
        return true;
    }

    private g b() {
        if (!this.f57639d) {
            f57635e.a("No recording has been started.");
            return g.a();
        }
        SparseIntArray[] b10 = this.f57637b.b();
        if (b10 == null) {
            f57635e.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return g.a();
        } else if (b10[0] != null) {
            return g.e(C5253f.a(b10));
        } else {
            f57635e.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return g.a();
        }
    }

    public void c() {
        if (this.f57639d) {
            f57635e.b("FrameMetricsAggregator is already recording %s", this.f57636a.getClass().getSimpleName());
            return;
        }
        this.f57637b.a(this.f57636a);
        this.f57639d = true;
    }

    public void d(C1769q qVar) {
        if (!this.f57639d) {
            f57635e.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
        } else if (this.f57638c.containsKey(qVar)) {
            f57635e.b("Cannot start sub-recording because one is already ongoing with the key %s", qVar.getClass().getSimpleName());
        } else {
            g b10 = b();
            if (!b10.d()) {
                f57635e.b("startFragment(%s): snapshot() failed", qVar.getClass().getSimpleName());
            } else {
                this.f57638c.put(qVar, (C5253f.a) b10.c());
            }
        }
    }

    public g e() {
        if (!this.f57639d) {
            f57635e.a("Cannot stop because no recording was started");
            return g.a();
        }
        if (!this.f57638c.isEmpty()) {
            f57635e.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f57638c.clear();
        }
        g b10 = b();
        try {
            this.f57637b.c(this.f57636a);
        } catch (IllegalArgumentException | NullPointerException e10) {
            if (!(e10 instanceof NullPointerException) || Build.VERSION.SDK_INT <= 28) {
                f57635e.k("View not hardware accelerated. Unable to collect FrameMetrics. %s", e10.toString());
                b10 = g.a();
            } else {
                throw e10;
            }
        }
        this.f57637b.d();
        this.f57639d = false;
        return b10;
    }

    public g f(C1769q qVar) {
        if (!this.f57639d) {
            f57635e.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return g.a();
        } else if (!this.f57638c.containsKey(qVar)) {
            f57635e.b("Sub-recording associated with key %s was not started or does not exist", qVar.getClass().getSimpleName());
            return g.a();
        } else {
            C5253f.a aVar = (C5253f.a) this.f57638c.remove(qVar);
            g b10 = b();
            if (b10.d()) {
                return g.e(((C5253f.a) b10.c()).a(aVar));
            }
            f57635e.b("stopFragment(%s): snapshot() failed", qVar.getClass().getSimpleName());
            return g.a();
        }
    }

    d(Activity activity, i iVar, Map map) {
        this.f57639d = false;
        this.f57636a = activity;
        this.f57637b = iVar;
        this.f57638c = map;
    }
}
