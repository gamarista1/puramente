package Db;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.C4491c;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import ub.C5230g;

/* renamed from: Db.a0  reason: case insensitive filesystem */
public final class C4252a0 {

    /* renamed from: a  reason: collision with root package name */
    private volatile int f50486a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C4269q f50487b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f50488c;

    public C4252a0(C5230g gVar) {
        this(gVar.m(), new C4269q(gVar));
    }

    /* access modifiers changed from: private */
    public final boolean f() {
        if (this.f50486a <= 0 || this.f50488c) {
            return false;
        }
        return true;
    }

    public final void b() {
        this.f50487b.b();
    }

    public final void c(int i10) {
        if (i10 > 0 && this.f50486a == 0) {
            this.f50486a = i10;
            if (f()) {
                this.f50487b.c();
            }
        } else if (i10 == 0 && this.f50486a != 0) {
            this.f50487b.b();
        }
        this.f50486a = i10;
    }

    public final void e(zzafm zzafm) {
        if (zzafm != null) {
            long zza = zzafm.zza();
            if (zza <= 0) {
                zza = 3600;
            }
            C4269q qVar = this.f50487b;
            qVar.f50543b = zzafm.zzb() + (zza * 1000);
            qVar.f50544c = -1;
            if (f()) {
                this.f50487b.c();
            }
        }
    }

    private C4252a0(Context context, C4269q qVar) {
        this.f50488c = false;
        this.f50486a = 0;
        this.f50487b = qVar;
        C4491c.c((Application) context.getApplicationContext());
        C4491c.b().a(new Z(this));
    }
}
