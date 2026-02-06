package com.google.android.gms.measurement.internal;

import Da.C4250b;
import Pa.C4378a;
import Pa.e;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdg;
import com.google.android.gms.internal.measurement.zznk;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import za.C5298a;

/* renamed from: com.google.android.gms.measurement.internal.k4  reason: case insensitive filesystem */
public final class C4644k4 extends C4578b1 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final J4 f55205c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public e f55206d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Boolean f55207e;

    /* renamed from: f  reason: collision with root package name */
    private final C4689s f55208f;

    /* renamed from: g  reason: collision with root package name */
    private final C4603e5 f55209g;

    /* renamed from: h  reason: collision with root package name */
    private final List f55210h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final C4689s f55211i;

    protected C4644k4(E2 e22) {
        super(e22);
        this.f55209g = new C4603e5(e22.zzb());
        this.f55205c = new J4(this);
        this.f55208f = new C4683q4(this, e22);
        this.f55211i = new C4730y4(this, e22);
    }

    static /* synthetic */ void I(C4644k4 k4Var, ComponentName componentName) {
        k4Var.i();
        if (k4Var.f55206d != null) {
            k4Var.f55206d = null;
            k4Var.zzj().F().b("Disconnected from device MeasurementService", componentName);
            k4Var.i();
            k4Var.T();
        }
    }

    private final void K(Runnable runnable) {
        i();
        if (a0()) {
            runnable.run();
        } else if (((long) this.f55210h.size()) >= 1000) {
            zzj().B().a("Discarding data. Max runnable queue size reached");
        } else {
            this.f55210h.add(runnable);
            this.f55211i.b(60000);
            T();
        }
    }

    /* access modifiers changed from: private */
    public final void f0() {
        i();
        zzj().F().b("Processing queued up service tasks", Integer.valueOf(this.f55210h.size()));
        for (Runnable run : this.f55210h) {
            try {
                run.run();
            } catch (RuntimeException e10) {
                zzj().B().b("Task exception while flushing queue", e10);
            }
        }
        this.f55210h.clear();
        this.f55211i.a();
    }

    /* access modifiers changed from: private */
    public final void g0() {
        i();
        this.f55209g.c();
        this.f55208f.b(((Long) F.f54603K.a((Object) null)).longValue());
    }

    private final E5 j0(boolean z10) {
        String str;
        Q1 k10 = k();
        if (z10) {
            str = zzj().J();
        } else {
            str = null;
        }
        return k10.w(str);
    }

    static /* synthetic */ void l0(C4644k4 k4Var) {
        k4Var.i();
        if (k4Var.a0()) {
            k4Var.zzj().F().a("Inactivity, disconnecting from the service");
            k4Var.U();
        }
    }

    public final void A(zzdg zzdg) {
        i();
        q();
        K(new C4706u4(this, j0(false), zzdg));
    }

    public final void B(zzdg zzdg, D d10, String str) {
        i();
        q();
        if (f().p(d.f54103a) != 0) {
            zzj().G().a("Not bundling data. Service unavailable or out of date");
            f().Q(zzdg, new byte[0]);
            return;
        }
        K(new B4(this, d10, str, zzdg));
    }

    /* access modifiers changed from: protected */
    public final void C(zzdg zzdg, String str, String str2) {
        i();
        q();
        K(new H4(this, str, str2, j0(false), zzdg));
    }

    /* access modifiers changed from: protected */
    public final void D(zzdg zzdg, String str, String str2, boolean z10) {
        i();
        q();
        K(new C4677p4(this, str, str2, j0(false), z10, zzdg));
    }

    /* access modifiers changed from: protected */
    public final void E(C4604f fVar) {
        C4536s.l(fVar);
        i();
        q();
        K(new F4(this, true, j0(true), l().z(fVar), new C4604f(fVar), fVar));
    }

    /* access modifiers changed from: protected */
    public final void F(D d10, String str) {
        C4536s.l(d10);
        i();
        q();
        K(new C4(this, true, j0(true), l().A(d10), d10, str));
    }

    /* access modifiers changed from: protected */
    public final void G(C4595d4 d4Var) {
        i();
        q();
        K(new C4718w4(this, d4Var));
    }

    /* access modifiers changed from: protected */
    public final void J(A5 a52) {
        i();
        q();
        K(new C4700t4(this, j0(true), l().B(a52), a52));
    }

    public final void L(AtomicReference atomicReference) {
        i();
        q();
        K(new C4712v4(this, atomicReference, j0(false)));
    }

    /* access modifiers changed from: protected */
    public final void M(AtomicReference atomicReference, Bundle bundle) {
        i();
        q();
        K(new C4688r4(this, atomicReference, j0(false), bundle));
    }

    /* access modifiers changed from: protected */
    public final void N(AtomicReference atomicReference, String str, String str2, String str3) {
        i();
        q();
        K(new E4(this, atomicReference, str, str2, str3, j0(false)));
    }

    /* access modifiers changed from: protected */
    public final void O(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        i();
        q();
        K(new G4(this, atomicReference, str, str2, str3, j0(false), z10));
    }

    /* access modifiers changed from: protected */
    public final void P(boolean z10) {
        i();
        q();
        if ((!zznk.zza() || !a().o(F.f54626V0)) && z10) {
            l().C();
        }
        if (c0()) {
            K(new D4(this, j0(false)));
        }
    }

    /* access modifiers changed from: protected */
    public final C4378a Q() {
        i();
        q();
        e eVar = this.f55206d;
        if (eVar == null) {
            T();
            zzj().A().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        E5 j02 = j0(false);
        C4536s.l(j02);
        try {
            C4378a W10 = eVar.W(j02);
            g0();
            return W10;
        } catch (RemoteException e10) {
            zzj().B().b("Failed to get consents; remote exception", e10);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final Boolean R() {
        return this.f55207e;
    }

    /* access modifiers changed from: protected */
    public final void S() {
        i();
        q();
        E5 j02 = j0(true);
        l().D();
        K(new C4724x4(this, j02));
    }

    /* access modifiers changed from: package-private */
    public final void T() {
        i();
        q();
        if (!a0()) {
            if (e0()) {
                this.f55205c.d();
            } else if (!a().Q()) {
                List<ResolveInfo> queryIntentServices = zza().getPackageManager().queryIntentServices(new Intent().setClassName(zza(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                    zzj().B().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                intent.setComponent(new ComponentName(zza(), "com.google.android.gms.measurement.AppMeasurementService"));
                this.f55205c.e(intent);
            }
        }
    }

    public final void U() {
        i();
        q();
        this.f55205c.g();
        try {
            C4250b.b().c(zza(), this.f55205c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f55206d = null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void V() {
        e eVar = this.f55206d;
        if (eVar == null) {
            zzj().B().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            E5 j02 = j0(false);
            C4536s.l(j02);
            eVar.A0(j02);
            g0();
        } catch (RemoteException e10) {
            zzj().B().b("Failed to send Dma consent settings to the service", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void W() {
        e eVar = this.f55206d;
        if (eVar == null) {
            zzj().B().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            E5 j02 = j0(false);
            C4536s.l(j02);
            eVar.o1(j02);
            g0();
        } catch (RemoteException e10) {
            zzj().B().b("Failed to send storage consent settings to the service", e10);
        }
    }

    /* access modifiers changed from: protected */
    public final void X() {
        i();
        q();
        E5 j02 = j0(false);
        l().C();
        K(new C4694s4(this, j02));
    }

    /* access modifiers changed from: protected */
    public final void Y() {
        i();
        q();
        K(new C4658m4(this));
    }

    /* access modifiers changed from: protected */
    public final void Z() {
        i();
        q();
        K(new A4(this, j0(true)));
    }

    public final /* bridge */ /* synthetic */ C4618h a() {
        return super.a();
    }

    public final boolean a0() {
        i();
        q();
        if (this.f55206d != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean b0() {
        i();
        q();
        if (e0() && f().D0() < 200900) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C4713w c() {
        return super.c();
    }

    /* access modifiers changed from: package-private */
    public final boolean c0() {
        i();
        q();
        if (e0() && f().D0() < ((Integer) F.f54666p0.a((Object) null)).intValue()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ R1 d() {
        return super.d();
    }

    /* access modifiers changed from: package-private */
    public final boolean d0() {
        i();
        q();
        if (e0() && f().D0() < 241200) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C4614g2 e() {
        return super.e();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e0() {
        /*
            r5 = this;
            r5.i()
            r5.q()
            java.lang.Boolean r0 = r5.f55207e
            if (r0 != 0) goto L_0x0103
            r5.i()
            r5.q()
            com.google.android.gms.measurement.internal.g2 r0 = r5.e()
            java.lang.Boolean r0 = r0.I()
            r1 = 1
            if (r0 == 0) goto L_0x0023
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L_0x0023
            goto L_0x00fd
        L_0x0023:
            com.google.android.gms.measurement.internal.Q1 r2 = r5.k()
            int r2 = r2.x()
            r3 = 0
            if (r2 != r1) goto L_0x0031
        L_0x002e:
            r0 = r1
            goto L_0x00d9
        L_0x0031:
            com.google.android.gms.measurement.internal.V1 r2 = r5.zzj()
            com.google.android.gms.measurement.internal.X1 r2 = r2.F()
            java.lang.String r4 = "Checking service availability"
            r2.a(r4)
            com.google.android.gms.measurement.internal.B5 r2 = r5.f()
            r4 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.p(r4)
            if (r2 == 0) goto L_0x00ca
            if (r2 == r1) goto L_0x00bc
            r4 = 2
            if (r2 == r4) goto L_0x009a
            r0 = 3
            if (r2 == r0) goto L_0x008c
            r0 = 9
            if (r2 == r0) goto L_0x007e
            r0 = 18
            if (r2 == r0) goto L_0x0070
            com.google.android.gms.measurement.internal.V1 r0 = r5.zzj()
            com.google.android.gms.measurement.internal.X1 r0 = r0.G()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "Unexpected service status"
            r0.b(r2, r1)
        L_0x006c:
            r0 = r3
            r1 = r0
            goto L_0x00d9
        L_0x0070:
            com.google.android.gms.measurement.internal.V1 r0 = r5.zzj()
            com.google.android.gms.measurement.internal.X1 r0 = r0.G()
            java.lang.String r2 = "Service updating"
            r0.a(r2)
            goto L_0x002e
        L_0x007e:
            com.google.android.gms.measurement.internal.V1 r0 = r5.zzj()
            com.google.android.gms.measurement.internal.X1 r0 = r0.G()
            java.lang.String r1 = "Service invalid"
            r0.a(r1)
            goto L_0x006c
        L_0x008c:
            com.google.android.gms.measurement.internal.V1 r0 = r5.zzj()
            com.google.android.gms.measurement.internal.X1 r0 = r0.G()
            java.lang.String r1 = "Service disabled"
            r0.a(r1)
            goto L_0x006c
        L_0x009a:
            com.google.android.gms.measurement.internal.V1 r2 = r5.zzj()
            com.google.android.gms.measurement.internal.X1 r2 = r2.A()
            java.lang.String r4 = "Service container out of date"
            r2.a(r4)
            com.google.android.gms.measurement.internal.B5 r2 = r5.f()
            int r2 = r2.D0()
            r4 = 17443(0x4423, float:2.4443E-41)
            if (r2 >= r4) goto L_0x00b6
        L_0x00b3:
            r0 = r1
            r1 = r3
            goto L_0x00d9
        L_0x00b6:
            if (r0 != 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r1 = r3
        L_0x00ba:
            r0 = r3
            goto L_0x00d9
        L_0x00bc:
            com.google.android.gms.measurement.internal.V1 r0 = r5.zzj()
            com.google.android.gms.measurement.internal.X1 r0 = r0.F()
            java.lang.String r2 = "Service missing"
            r0.a(r2)
            goto L_0x00b3
        L_0x00ca:
            com.google.android.gms.measurement.internal.V1 r0 = r5.zzj()
            com.google.android.gms.measurement.internal.X1 r0 = r0.F()
            java.lang.String r2 = "Service available"
            r0.a(r2)
            goto L_0x002e
        L_0x00d9:
            if (r1 != 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.h r2 = r5.a()
            boolean r2 = r2.Q()
            if (r2 == 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.V1 r0 = r5.zzj()
            com.google.android.gms.measurement.internal.X1 r0 = r0.B()
            java.lang.String r2 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r2)
            goto L_0x00f4
        L_0x00f3:
            r3 = r0
        L_0x00f4:
            if (r3 == 0) goto L_0x00fd
            com.google.android.gms.measurement.internal.g2 r0 = r5.e()
            r0.s(r1)
        L_0x00fd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.f55207e = r0
        L_0x0103:
            java.lang.Boolean r0 = r5.f55207e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4644k4.e0():boolean");
    }

    public final /* bridge */ /* synthetic */ B5 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    /* access modifiers changed from: protected */
    public final void i0(boolean z10) {
        i();
        q();
        if ((!zznk.zza() || !a().o(F.f54626V0)) && z10) {
            l().C();
        }
        K(new C4671o4(this));
    }

    public final /* bridge */ /* synthetic */ C4731z j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ Q1 k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ P1 l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ C4643k3 m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ C4609f4 n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ C4644k4 o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ V4 p() {
        return super.p();
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void x(e eVar) {
        i();
        C4536s.l(eVar);
        this.f55206d = eVar;
        g0();
        f0();
    }

    /* access modifiers changed from: package-private */
    public final void y(e eVar, C5298a aVar, E5 e52) {
        int i10;
        i();
        q();
        int i11 = 100;
        int i12 = 0;
        while (i12 < 1001 && i11 == 100) {
            ArrayList arrayList = new ArrayList();
            List x10 = l().x(100);
            if (x10 != null) {
                arrayList.addAll(x10);
                i10 = x10.size();
            } else {
                i10 = 0;
            }
            if (aVar != null && i10 < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                C5298a aVar2 = (C5298a) obj;
                if (aVar2 instanceof D) {
                    try {
                        eVar.c0((D) aVar2, e52);
                    } catch (RemoteException e10) {
                        zzj().B().b("Failed to send event to the service", e10);
                    }
                } else if (aVar2 instanceof A5) {
                    try {
                        eVar.t0((A5) aVar2, e52);
                    } catch (RemoteException e11) {
                        zzj().B().b("Failed to send user property to the service", e11);
                    }
                } else if (aVar2 instanceof C4604f) {
                    try {
                        eVar.J0((C4604f) aVar2, e52);
                    } catch (RemoteException e12) {
                        zzj().B().b("Failed to send conditional user property to the service", e12);
                    }
                } else {
                    zzj().B().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i12++;
            i11 = i10;
        }
    }

    public final void z(Bundle bundle) {
        i();
        q();
        K(new C4736z4(this, j0(false), bundle));
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ Ea.e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ C4583c zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ V1 zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ C4734z2 zzl() {
        return super.zzl();
    }
}
