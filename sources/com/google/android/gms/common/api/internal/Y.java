package com.google.android.gms.common.api.internal;

import Ea.C4279b;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.internal.C4518c;
import com.google.android.gms.common.internal.C4524f;
import com.google.android.gms.common.internal.C4534p;
import com.google.android.gms.common.internal.C4537t;
import com.google.android.gms.common.internal.C4538u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

final class Y implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    private final C4495g f53989a;

    /* renamed from: b  reason: collision with root package name */
    private final int f53990b;

    /* renamed from: c  reason: collision with root package name */
    private final C4490b f53991c;

    /* renamed from: d  reason: collision with root package name */
    private final long f53992d;

    /* renamed from: e  reason: collision with root package name */
    private final long f53993e;

    Y(C4495g gVar, int i10, C4490b bVar, long j10, long j11, String str, String str2) {
        this.f53989a = gVar;
        this.f53990b = i10;
        this.f53991c = bVar;
        this.f53992d = j10;
        this.f53993e = j11;
    }

    static Y a(C4495g gVar, int i10, C4490b bVar) {
        boolean z10;
        long j10;
        long j11;
        if (!gVar.e()) {
            return null;
        }
        C4538u a10 = C4537t.b().a();
        if (a10 == null) {
            z10 = true;
        } else if (!a10.q0()) {
            return null;
        } else {
            z10 = a10.r0();
            L t10 = gVar.t(bVar);
            if (t10 != null) {
                if (!(t10.v() instanceof C4518c)) {
                    return null;
                }
                C4518c cVar = (C4518c) t10.v();
                if (cVar.hasConnectionInfo() && !cVar.isConnecting()) {
                    C4524f b10 = b(t10, cVar, i10);
                    if (b10 == null) {
                        return null;
                    }
                    t10.G();
                    z10 = b10.s0();
                }
            }
        }
        if (z10) {
            j10 = System.currentTimeMillis();
        } else {
            j10 = 0;
        }
        if (z10) {
            j11 = SystemClock.elapsedRealtime();
        } else {
            j11 = 0;
        }
        return new Y(gVar, i10, bVar, j10, j11, (String) null, (String) null);
    }

    private static C4524f b(L l10, C4518c cVar, int i10) {
        int[] p02;
        int[] q02;
        C4524f telemetryConfiguration = cVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.r0() || ((p02 = telemetryConfiguration.p0()) != null ? !C4279b.a(p02, i10) : !((q02 = telemetryConfiguration.q0()) == null || !C4279b.a(q02, i10))) || l10.t() >= telemetryConfiguration.o0()) {
            return null;
        }
        return telemetryConfiguration;
    }

    public final void onComplete(Task task) {
        L t10;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j10;
        long j11;
        if (this.f53989a.e()) {
            C4538u a10 = C4537t.b().a();
            if ((a10 == null || a10.q0()) && (t10 = this.f53989a.t(this.f53991c)) != null && (t10.v() instanceof C4518c)) {
                C4518c cVar = (C4518c) t10.v();
                boolean z11 = true;
                int i15 = 0;
                if (this.f53992d > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int gCoreServiceId = cVar.getGCoreServiceId();
                int i16 = 100;
                if (a10 != null) {
                    boolean r02 = z10 & a10.r0();
                    int o02 = a10.o0();
                    int p02 = a10.p0();
                    i12 = a10.s0();
                    if (cVar.hasConnectionInfo() && !cVar.isConnecting()) {
                        C4524f b10 = b(t10, cVar, this.f53990b);
                        if (b10 != null) {
                            if (!b10.s0() || this.f53992d <= 0) {
                                z11 = false;
                            }
                            p02 = b10.o0();
                            r02 = z11;
                        } else {
                            return;
                        }
                    }
                    i11 = o02;
                    i10 = p02;
                } else {
                    i12 = 0;
                    i10 = 100;
                    i11 = 5000;
                }
                C4495g gVar = this.f53989a;
                if (task.isSuccessful()) {
                    i13 = 0;
                } else {
                    if (!task.isCanceled()) {
                        Exception exception = task.getException();
                        if (exception instanceof b) {
                            Status status = ((b) exception).getStatus();
                            i16 = status.p0();
                            ConnectionResult o03 = status.o0();
                            if (o03 != null) {
                                i13 = o03.o0();
                                i15 = i16;
                            }
                        } else {
                            i15 = 101;
                            i13 = -1;
                        }
                    }
                    i15 = i16;
                    i13 = -1;
                }
                if (z10) {
                    long j12 = this.f53992d;
                    long j13 = this.f53993e;
                    long currentTimeMillis = System.currentTimeMillis();
                    i14 = (int) (SystemClock.elapsedRealtime() - j13);
                    j10 = currentTimeMillis;
                    j11 = j12;
                } else {
                    j11 = 0;
                    j10 = 0;
                    i14 = -1;
                }
                gVar.E(new C4534p(this.f53990b, i15, i13, j11, j10, (String) null, (String) null, gCoreServiceId, i14), i12, (long) i11, i10);
            }
        }
    }
}
