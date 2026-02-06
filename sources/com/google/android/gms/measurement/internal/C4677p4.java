package com.google.android.gms.measurement.internal;

import Pa.e;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdg;

/* renamed from: com.google.android.gms.measurement.internal.p4  reason: case insensitive filesystem */
final class C4677p4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f55263a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f55264b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ E5 f55265c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f55266d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzdg f55267e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C4644k4 f55268f;

    C4677p4(C4644k4 k4Var, String str, String str2, E5 e52, boolean z10, zzdg zzdg) {
        this.f55263a = str;
        this.f55264b = str2;
        this.f55265c = e52;
        this.f55266d = z10;
        this.f55267e = zzdg;
        this.f55268f = k4Var;
    }

    public final void run() {
        Bundle bundle = new Bundle();
        try {
            e w10 = this.f55268f.f55206d;
            if (w10 == null) {
                this.f55268f.zzj().B().c("Failed to get user properties; not connected to service", this.f55263a, this.f55264b);
                return;
            }
            C4536s.l(this.f55265c);
            bundle = B5.B(w10.c1(this.f55263a, this.f55264b, this.f55266d, this.f55265c));
            this.f55268f.g0();
            this.f55268f.f().M(this.f55267e, bundle);
        } catch (RemoteException e10) {
            this.f55268f.zzj().B().c("Failed to get user properties; remote exception", this.f55263a, e10);
        } finally {
            this.f55268f.f().M(this.f55267e, bundle);
        }
    }
}
