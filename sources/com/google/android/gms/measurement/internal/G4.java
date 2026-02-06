package com.google.android.gms.measurement.internal;

import Pa.e;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

final class G4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f54700a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f54701b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f54702c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f54703d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ E5 f54704e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f54705f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ C4644k4 f54706g;

    G4(C4644k4 k4Var, AtomicReference atomicReference, String str, String str2, String str3, E5 e52, boolean z10) {
        this.f54700a = atomicReference;
        this.f54701b = str;
        this.f54702c = str2;
        this.f54703d = str3;
        this.f54704e = e52;
        this.f54705f = z10;
        this.f54706g = k4Var;
    }

    public final void run() {
        synchronized (this.f54700a) {
            try {
                e w10 = this.f54706g.f55206d;
                if (w10 == null) {
                    this.f54706g.zzj().B().d("(legacy) Failed to get user properties; not connected to service", V1.q(this.f54701b), this.f54702c, this.f54703d);
                    this.f54700a.set(Collections.emptyList());
                    this.f54700a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f54701b)) {
                    C4536s.l(this.f54704e);
                    this.f54700a.set(w10.c1(this.f54702c, this.f54703d, this.f54705f, this.f54704e));
                } else {
                    this.f54700a.set(w10.h(this.f54701b, this.f54702c, this.f54703d, this.f54705f));
                }
                this.f54706g.g0();
                this.f54700a.notify();
            } catch (RemoteException e10) {
                try {
                    this.f54706g.zzj().B().d("(legacy) Failed to get user properties; remote exception", V1.q(this.f54701b), this.f54702c, e10);
                    this.f54700a.set(Collections.emptyList());
                    this.f54700a.notify();
                } catch (Throwable th2) {
                    this.f54700a.notify();
                    throw th2;
                }
            }
        }
    }
}
