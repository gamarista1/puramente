package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class o0 extends C4515a0 {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f54208g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ C4518c f54209h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o0(C4518c cVar, int i10, IBinder iBinder, Bundle bundle) {
        super(cVar, i10, bundle);
        this.f54209h = cVar;
        this.f54208g = iBinder;
    }

    /* access modifiers changed from: protected */
    public final void f(ConnectionResult connectionResult) {
        if (this.f54209h.zzx != null) {
            this.f54209h.zzx.c(connectionResult);
        }
        this.f54209h.onConnectionFailed(connectionResult);
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        try {
            IBinder iBinder = this.f54208g;
            C4536s.l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f54209h.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = this.f54209h.getServiceDescriptor();
                Log.w("GmsClient", "service descriptor mismatch: " + serviceDescriptor + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface createServiceInterface = this.f54209h.createServiceInterface(this.f54208g);
            if (createServiceInterface == null || (!C4518c.zzn(this.f54209h, 2, 4, createServiceInterface) && !C4518c.zzn(this.f54209h, 3, 4, createServiceInterface))) {
                return false;
            }
            this.f54209h.zzB = null;
            C4518c cVar = this.f54209h;
            Bundle connectionHint = cVar.getConnectionHint();
            if (cVar.zzw == null) {
                return true;
            }
            this.f54209h.zzw.a(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
