package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

public final class n0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final int f54203a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C4518c f54204b;

    public n0(C4518c cVar, int i10) {
        this.f54204b = cVar;
        this.f54203a = i10;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C4532n nVar;
        C4518c cVar = this.f54204b;
        if (iBinder == null) {
            C4518c.zzk(cVar, 16);
            return;
        }
        synchronized (cVar.zzq) {
            try {
                C4518c cVar2 = this.f54204b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof C4532n)) {
                    nVar = new C4521d0(iBinder);
                } else {
                    nVar = (C4532n) queryLocalInterface;
                }
                cVar2.zzr = nVar;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        this.f54204b.zzl(0, (Bundle) null, this.f54203a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f54204b.zzq) {
            this.f54204b.zzr = null;
        }
        C4518c cVar = this.f54204b;
        int i10 = this.f54203a;
        Handler handler = cVar.zzb;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
