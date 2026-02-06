package Db;

import Ba.C4246a;
import Ea.h;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzg;
import ub.C5230g;

/* renamed from: Db.q  reason: case insensitive filesystem */
public final class C4269q {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static C4246a f50541h = new C4246a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a  reason: collision with root package name */
    private final C5230g f50542a;

    /* renamed from: b  reason: collision with root package name */
    volatile long f50543b;

    /* renamed from: c  reason: collision with root package name */
    volatile long f50544c;

    /* renamed from: d  reason: collision with root package name */
    private long f50545d;

    /* renamed from: e  reason: collision with root package name */
    private HandlerThread f50546e;

    /* renamed from: f  reason: collision with root package name */
    private Handler f50547f = new zzg(this.f50546e.getLooper());

    /* renamed from: g  reason: collision with root package name */
    private Runnable f50548g;

    public C4269q(C5230g gVar) {
        f50541h.g("Initializing TokenRefresher", new Object[0]);
        C5230g gVar2 = (C5230g) C4536s.l(gVar);
        this.f50542a = gVar2;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f50546e = handlerThread;
        handlerThread.start();
        this.f50548g = new C4271t(this, gVar2.q());
        this.f50545d = 300000;
    }

    public final void b() {
        this.f50547f.removeCallbacks(this.f50548g);
    }

    public final void c() {
        C4246a aVar = f50541h;
        long j10 = this.f50543b - this.f50545d;
        aVar.g("Scheduling refresh for " + j10, new Object[0]);
        b();
        this.f50544c = Math.max((this.f50543b - h.c().currentTimeMillis()) - this.f50545d, 0) / 1000;
        this.f50547f.postDelayed(this.f50548g, this.f50544c * 1000);
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        long j10;
        int i10 = (int) this.f50544c;
        if (i10 == 30 || i10 == 60 || i10 == 120 || i10 == 240 || i10 == 480) {
            j10 = 2 * this.f50544c;
        } else if (i10 != 960) {
            j10 = 30;
        } else {
            j10 = 960;
        }
        this.f50544c = j10;
        this.f50543b = h.c().currentTimeMillis() + (this.f50544c * 1000);
        C4246a aVar = f50541h;
        long j11 = this.f50543b;
        aVar.g("Scheduling refresh for " + j11, new Object[0]);
        this.f50547f.postDelayed(this.f50548g, this.f50544c * 1000);
    }
}
