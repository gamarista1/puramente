package com.google.android.gms.measurement.internal;

import Da.C4250b;
import Pa.e;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C4518c;
import com.google.android.gms.common.internal.C4536s;

public final class J4 implements ServiceConnection, C4518c.a, C4518c.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f54735a;

    /* renamed from: b  reason: collision with root package name */
    private volatile T1 f54736b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C4644k4 f54737c;

    protected J4(C4644k4 k4Var) {
        this.f54737c = k4Var;
    }

    public final void a(Bundle bundle) {
        C4536s.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C4536s.l(this.f54736b);
                this.f54737c.zzl().y(new K4(this, (e) this.f54736b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f54736b = null;
                this.f54735a = false;
            }
        }
    }

    public final void b(int i10) {
        C4536s.e("MeasurementServiceConnection.onConnectionSuspended");
        this.f54737c.zzj().A().a("Service connection suspended");
        this.f54737c.zzl().y(new O4(this));
    }

    public final void c(ConnectionResult connectionResult) {
        C4536s.e("MeasurementServiceConnection.onConnectionFailed");
        V1 z10 = this.f54737c.f55074a.z();
        if (z10 != null) {
            z10.G().b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f54735a = false;
            this.f54736b = null;
        }
        this.f54737c.zzl().y(new M4(this));
    }

    public final void d() {
        this.f54737c.i();
        Context zza = this.f54737c.zza();
        synchronized (this) {
            try {
                if (this.f54735a) {
                    this.f54737c.zzj().F().a("Connection attempt already in progress");
                } else if (this.f54736b == null || (!this.f54736b.isConnecting() && !this.f54736b.isConnected())) {
                    this.f54736b = new T1(zza, Looper.getMainLooper(), this, this);
                    this.f54737c.zzj().F().a("Connecting to remote service");
                    this.f54735a = true;
                    C4536s.l(this.f54736b);
                    this.f54736b.checkAvailabilityAndConnect();
                } else {
                    this.f54737c.zzj().F().a("Already awaiting connection attempt");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(Intent intent) {
        this.f54737c.i();
        Context zza = this.f54737c.zza();
        C4250b b10 = C4250b.b();
        synchronized (this) {
            try {
                if (this.f54735a) {
                    this.f54737c.zzj().F().a("Connection attempt already in progress");
                    return;
                }
                this.f54737c.zzj().F().a("Using local app measurement service");
                this.f54735a = true;
                b10.a(zza, intent, this.f54737c.f55205c, 129);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        if (this.f54736b != null && (this.f54736b.isConnected() || this.f54736b.isConnecting())) {
            this.f54736b.disconnect();
        }
        this.f54736b = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.f54737c.zzj().B().a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0060 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C4536s.e(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.f54735a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.k4 r4 = r3.f54737c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.V1 r4 = r4.zzj()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.X1 r4 = r4.B()     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x0097
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x0050
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0060 }
            boolean r2 = r1 instanceof Pa.e     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x003a
            Pa.e r1 = (Pa.e) r1     // Catch:{ RemoteException -> 0x0060 }
        L_0x0038:
            r0 = r1
            goto L_0x0040
        L_0x003a:
            com.google.android.gms.measurement.internal.O1 r1 = new com.google.android.gms.measurement.internal.O1     // Catch:{ RemoteException -> 0x0060 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x0038
        L_0x0040:
            com.google.android.gms.measurement.internal.k4 r5 = r3.f54737c     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.measurement.internal.V1 r5 = r5.zzj()     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.measurement.internal.X1 r5 = r5.F()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.a(r1)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x006f
        L_0x0050:
            com.google.android.gms.measurement.internal.k4 r5 = r3.f54737c     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.measurement.internal.V1 r5 = r5.zzj()     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.measurement.internal.X1 r5 = r5.B()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.b(r2, r1)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x006f
        L_0x0060:
            com.google.android.gms.measurement.internal.k4 r5 = r3.f54737c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.V1 r5 = r5.zzj()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.X1 r5 = r5.B()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.a(r1)     // Catch:{ all -> 0x001c }
        L_0x006f:
            if (r0 != 0) goto L_0x0087
            r3.f54735a = r4     // Catch:{ all -> 0x001c }
            Da.b r4 = Da.C4250b.b()     // Catch:{ IllegalArgumentException -> 0x0095 }
            com.google.android.gms.measurement.internal.k4 r5 = r3.f54737c     // Catch:{ IllegalArgumentException -> 0x0095 }
            android.content.Context r5 = r5.zza()     // Catch:{ IllegalArgumentException -> 0x0095 }
            com.google.android.gms.measurement.internal.k4 r0 = r3.f54737c     // Catch:{ IllegalArgumentException -> 0x0095 }
            com.google.android.gms.measurement.internal.J4 r0 = r0.f55205c     // Catch:{ IllegalArgumentException -> 0x0095 }
            r4.c(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0095 }
            goto L_0x0095
        L_0x0087:
            com.google.android.gms.measurement.internal.k4 r4 = r3.f54737c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.z2 r4 = r4.zzl()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.I4 r5 = new com.google.android.gms.measurement.internal.I4     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.y(r5)     // Catch:{ all -> 0x001c }
        L_0x0095:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x0097:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.J4.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C4536s.e("MeasurementServiceConnection.onServiceDisconnected");
        this.f54737c.zzj().A().a("Service disconnected");
        this.f54737c.zzl().y(new L4(this, componentName));
    }
}
