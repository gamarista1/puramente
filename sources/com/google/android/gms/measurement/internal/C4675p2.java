package com.google.android.gms.measurement.internal;

import Da.C4250b;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzoj;

/* renamed from: com.google.android.gms.measurement.internal.p2  reason: case insensitive filesystem */
final class C4675p2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzbz f55258a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ServiceConnection f55259b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C4663n2 f55260c;

    C4675p2(C4663n2 n2Var, zzbz zzbz, ServiceConnection serviceConnection) {
        this.f55258a = zzbz;
        this.f55259b = serviceConnection;
        this.f55260c = n2Var;
    }

    public final void run() {
        boolean z10;
        C4663n2 n2Var = this.f55260c;
        C4669o2 o2Var = n2Var.f55245b;
        String a10 = n2Var.f55244a;
        zzbz zzbz = this.f55258a;
        ServiceConnection serviceConnection = this.f55259b;
        Bundle a11 = o2Var.a(a10, zzbz);
        o2Var.f55248a.zzl().i();
        o2Var.f55248a.L();
        if (a11 != null) {
            long j10 = a11.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j10 == 0) {
                o2Var.f55248a.zzj().G().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a11.getString(Constants.INSTALL_REFERRER);
                if (string == null || string.isEmpty()) {
                    o2Var.f55248a.zzj().B().a("No referrer defined in Install Referrer response");
                } else {
                    o2Var.f55248a.zzj().F().b("InstallReferrer API result", string);
                    if (!zzoj.zza() || !o2Var.f55248a.u().o(F.f54610N0)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    B5 G10 = o2Var.f55248a.G();
                    Bundle x10 = G10.x(Uri.parse("?" + string), z10);
                    if (x10 == null) {
                        o2Var.f55248a.zzj().B().a("No campaign params defined in Install Referrer result");
                    } else {
                        if (z10) {
                            long j11 = a11.getLong("referrer_click_timestamp_server_seconds", 0) * 1000;
                            if (j11 > 0) {
                                x10.putLong("click_timestamp", j11);
                            }
                        } else {
                            String string2 = x10.getString(Constants.MEDIUM);
                            if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                                long j12 = a11.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                                if (j12 == 0) {
                                    o2Var.f55248a.zzj().B().a("Install Referrer is missing click timestamp for ad campaign");
                                } else {
                                    x10.putLong("click_timestamp", j12);
                                }
                            }
                        }
                        if (j10 == o2Var.f55248a.A().f55094h.a()) {
                            o2Var.f55248a.zzj().F().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (o2Var.f55248a.k()) {
                            o2Var.f55248a.A().f55094h.b(j10);
                            o2Var.f55248a.zzj().F().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            x10.putString("_cis", "referrer API v2");
                            o2Var.f55248a.C().c0("auto", "_cmp", x10, a10);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            C4250b.b().c(o2Var.f55248a.zza(), serviceConnection);
        }
    }
}
