package com.google.android.gms.measurement.internal;

import Pa.e;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

final class E4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f54545a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f54546b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f54547c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f54548d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ E5 f54549e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C4644k4 f54550f;

    E4(C4644k4 k4Var, AtomicReference atomicReference, String str, String str2, String str3, E5 e52) {
        this.f54545a = atomicReference;
        this.f54546b = str;
        this.f54547c = str2;
        this.f54548d = str3;
        this.f54549e = e52;
        this.f54550f = k4Var;
    }

    public final void run() {
        synchronized (this.f54545a) {
            try {
                e w10 = this.f54550f.f55206d;
                if (w10 == null) {
                    this.f54550f.zzj().B().d("(legacy) Failed to get conditional properties; not connected to service", V1.q(this.f54546b), this.f54547c, this.f54548d);
                    this.f54545a.set(Collections.emptyList());
                    this.f54545a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f54546b)) {
                    C4536s.l(this.f54549e);
                    this.f54545a.set(w10.d(this.f54547c, this.f54548d, this.f54549e));
                } else {
                    this.f54545a.set(w10.x(this.f54546b, this.f54547c, this.f54548d));
                }
                this.f54550f.g0();
                this.f54545a.notify();
            } catch (RemoteException e10) {
                try {
                    this.f54550f.zzj().B().d("(legacy) Failed to get conditional properties; remote exception", V1.q(this.f54546b), this.f54547c, e10);
                    this.f54545a.set(Collections.emptyList());
                    this.f54545a.notify();
                } catch (Throwable th2) {
                    this.f54545a.notify();
                    throw th2;
                }
            }
        }
    }
}
