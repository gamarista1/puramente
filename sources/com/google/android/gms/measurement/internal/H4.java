package com.google.android.gms.measurement.internal;

import Pa.e;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdg;
import java.util.ArrayList;

final class H4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f54712a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f54713b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ E5 f54714c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzdg f54715d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C4644k4 f54716e;

    H4(C4644k4 k4Var, String str, String str2, E5 e52, zzdg zzdg) {
        this.f54712a = str;
        this.f54713b = str2;
        this.f54714c = e52;
        this.f54715d = zzdg;
        this.f54716e = k4Var;
    }

    public final void run() {
        ArrayList arrayList = new ArrayList();
        try {
            e w10 = this.f54716e.f55206d;
            if (w10 == null) {
                this.f54716e.zzj().B().c("Failed to get conditional properties; not connected to service", this.f54712a, this.f54713b);
                return;
            }
            C4536s.l(this.f54714c);
            arrayList = B5.o0(w10.d(this.f54712a, this.f54713b, this.f54714c));
            this.f54716e.g0();
            this.f54716e.f().O(this.f54715d, arrayList);
        } catch (RemoteException e10) {
            this.f54716e.zzj().B().d("Failed to get conditional properties; remote exception", this.f54712a, this.f54713b, e10);
        } finally {
            this.f54716e.f().O(this.f54715d, arrayList);
        }
    }
}
