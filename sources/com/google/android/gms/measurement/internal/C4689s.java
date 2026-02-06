package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzcz;

/* renamed from: com.google.android.gms.measurement.internal.s  reason: case insensitive filesystem */
abstract class C4689s {

    /* renamed from: d  reason: collision with root package name */
    private static volatile Handler f55337d;

    /* renamed from: a  reason: collision with root package name */
    private final C4615g3 f55338a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f55339b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public volatile long f55340c;

    C4689s(C4615g3 g3Var) {
        C4536s.l(g3Var);
        this.f55338a = g3Var;
        this.f55339b = new C4707v(this, g3Var);
    }

    private final Handler f() {
        Handler handler;
        if (f55337d != null) {
            return f55337d;
        }
        synchronized (C4689s.class) {
            try {
                if (f55337d == null) {
                    f55337d = new zzcz(this.f55338a.zza().getMainLooper());
                }
                handler = f55337d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f55340c = 0;
        f().removeCallbacks(this.f55339b);
    }

    public final void b(long j10) {
        a();
        if (j10 >= 0) {
            this.f55340c = this.f55338a.zzb().currentTimeMillis();
            if (!f().postDelayed(this.f55339b, j10)) {
                this.f55338a.zzj().B().b("Failed to schedule delayed post. time", Long.valueOf(j10));
            }
        }
    }

    public abstract void d();

    public final boolean e() {
        if (this.f55340c != 0) {
            return true;
        }
        return false;
    }
}
