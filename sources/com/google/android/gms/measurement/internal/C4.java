package com.google.android.gms.measurement.internal;

import Pa.e;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;

final class C4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f54486a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ E5 f54487b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f54488c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ D f54489d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f54490e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C4644k4 f54491f;

    C4(C4644k4 k4Var, boolean z10, E5 e52, boolean z11, D d10, String str) {
        this.f54486a = z10;
        this.f54487b = e52;
        this.f54488c = z11;
        this.f54489d = d10;
        this.f54490e = str;
        this.f54491f = k4Var;
    }

    public final void run() {
        D d10;
        e w10 = this.f54491f.f55206d;
        if (w10 == null) {
            this.f54491f.zzj().B().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f54486a) {
            C4536s.l(this.f54487b);
            C4644k4 k4Var = this.f54491f;
            if (this.f54488c) {
                d10 = null;
            } else {
                d10 = this.f54489d;
            }
            k4Var.y(w10, d10, this.f54487b);
        } else {
            try {
                if (TextUtils.isEmpty(this.f54490e)) {
                    C4536s.l(this.f54487b);
                    w10.c0(this.f54489d, this.f54487b);
                } else {
                    w10.e(this.f54489d, this.f54490e, this.f54491f.zzj().J());
                }
            } catch (RemoteException e10) {
                this.f54491f.zzj().B().b("Failed to send event to the service", e10);
            }
        }
        this.f54491f.g0();
    }
}
