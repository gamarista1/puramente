package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzcy;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

final class C2 extends FutureTask implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    private final long f54473a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f54474b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54475c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C4734z2 f54476d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2(C4734z2 z2Var, Runnable runnable, boolean z10, String str) {
        super(zzcy.zza().zza(runnable), (Object) null);
        this.f54476d = z2Var;
        C4536s.l(str);
        long andIncrement = C4734z2.f55423l.getAndIncrement();
        this.f54473a = andIncrement;
        this.f54475c = str;
        this.f54474b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            z2Var.zzj().B().a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C2 c22 = (C2) obj;
        boolean z10 = this.f54474b;
        if (z10 == c22.f54474b) {
            long j10 = this.f54473a;
            long j11 = c22.f54473a;
            if (j10 < j11) {
                return -1;
            }
            if (j10 > j11) {
                return 1;
            }
            this.f54476d.zzj().D().b("Two tasks share the same index. index", Long.valueOf(this.f54473a));
            return 0;
        } else if (z10) {
            return -1;
        } else {
            return 1;
        }
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th2) {
        this.f54476d.zzj().B().b(this.f54475c, th2);
        super.setException(th2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2(C4734z2 z2Var, Callable callable, boolean z10, String str) {
        super(zzcy.zza().zza(callable));
        this.f54476d = z2Var;
        C4536s.l(str);
        long andIncrement = C4734z2.f55423l.getAndIncrement();
        this.f54473a = andIncrement;
        this.f54475c = str;
        this.f54474b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            z2Var.zzj().B().a("Tasks index overflow");
        }
    }
}
