package androidx.work.impl.background.systemalarm;

import M3.b;
import M3.d;
import M3.e;
import O3.n;
import P3.m;
import P3.u;
import Q3.C;
import Q3.w;
import Ug.C5600w0;
import Ug.G;
import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.A;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public class f implements d, C.a {

    /* renamed from: o  reason: collision with root package name */
    private static final String f18854o = s.i("DelayMetCommandHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f18855a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18856b;

    /* renamed from: c  reason: collision with root package name */
    private final m f18857c;

    /* renamed from: d  reason: collision with root package name */
    private final g f18858d;

    /* renamed from: e  reason: collision with root package name */
    private final e f18859e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f18860f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private int f18861g = 0;

    /* renamed from: h  reason: collision with root package name */
    private final Executor f18862h;

    /* renamed from: i  reason: collision with root package name */
    private final Executor f18863i;

    /* renamed from: j  reason: collision with root package name */
    private PowerManager.WakeLock f18864j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f18865k = false;

    /* renamed from: l  reason: collision with root package name */
    private final A f18866l;

    /* renamed from: m  reason: collision with root package name */
    private final G f18867m;

    /* renamed from: n  reason: collision with root package name */
    private volatile C5600w0 f18868n;

    f(Context context, int i10, g gVar, A a10) {
        this.f18855a = context;
        this.f18856b = i10;
        this.f18858d = gVar;
        this.f18857c = a10.a();
        this.f18866l = a10;
        n m10 = gVar.g().m();
        this.f18862h = gVar.f().c();
        this.f18863i = gVar.f().a();
        this.f18867m = gVar.f().b();
        this.f18859e = new e(m10);
    }

    private void d() {
        synchronized (this.f18860f) {
            try {
                if (this.f18868n != null) {
                    this.f18868n.n((CancellationException) null);
                }
                this.f18858d.h().b(this.f18857c);
                PowerManager.WakeLock wakeLock = this.f18864j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    s e10 = s.e();
                    String str = f18854o;
                    e10.a(str, "Releasing wakelock " + this.f18864j + "for WorkSpec " + this.f18857c);
                    this.f18864j.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public void h() {
        if (this.f18861g == 0) {
            this.f18861g = 1;
            s e10 = s.e();
            String str = f18854o;
            e10.a(str, "onAllConstraintsMet for " + this.f18857c);
            if (this.f18858d.e().r(this.f18866l)) {
                this.f18858d.h().a(this.f18857c, 600000, this);
            } else {
                d();
            }
        } else {
            s e11 = s.e();
            String str2 = f18854o;
            e11.a(str2, "Already started work for " + this.f18857c);
        }
    }

    /* access modifiers changed from: private */
    public void i() {
        String b10 = this.f18857c.b();
        if (this.f18861g < 2) {
            this.f18861g = 2;
            s e10 = s.e();
            String str = f18854o;
            e10.a(str, "Stopping work for WorkSpec " + b10);
            this.f18863i.execute(new g.b(this.f18858d, b.f(this.f18855a, this.f18857c), this.f18856b));
            if (this.f18858d.e().k(this.f18857c.b())) {
                s e11 = s.e();
                e11.a(str, "WorkSpec " + b10 + " needs to be rescheduled");
                this.f18863i.execute(new g.b(this.f18858d, b.e(this.f18855a, this.f18857c), this.f18856b));
                return;
            }
            s e12 = s.e();
            e12.a(str, "Processor does not have WorkSpec " + b10 + ". No need to reschedule");
            return;
        }
        s e13 = s.e();
        String str2 = f18854o;
        e13.a(str2, "Already stopped work for " + b10);
    }

    public void a(m mVar) {
        s e10 = s.e();
        String str = f18854o;
        e10.a(str, "Exceeded time limits on execution for " + mVar);
        this.f18862h.execute(new d(this));
    }

    public void e(u uVar, b bVar) {
        if (bVar instanceof b.a) {
            this.f18862h.execute(new e(this));
        } else {
            this.f18862h.execute(new d(this));
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        String b10 = this.f18857c.b();
        Context context = this.f18855a;
        this.f18864j = w.b(context, b10 + " (" + this.f18856b + ")");
        s e10 = s.e();
        String str = f18854o;
        e10.a(str, "Acquiring wakelock " + this.f18864j + "for WorkSpec " + b10);
        this.f18864j.acquire();
        u h10 = this.f18858d.g().n().H().h(b10);
        if (h10 == null) {
            this.f18862h.execute(new d(this));
            return;
        }
        boolean k10 = h10.k();
        this.f18865k = k10;
        if (!k10) {
            s e11 = s.e();
            e11.a(str, "No constraints for " + b10);
            this.f18862h.execute(new e(this));
            return;
        }
        this.f18868n = M3.f.b(this.f18859e, h10, this.f18867m, this);
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z10) {
        s e10 = s.e();
        String str = f18854o;
        e10.a(str, "onExecuted " + this.f18857c + ", " + z10);
        d();
        if (z10) {
            this.f18863i.execute(new g.b(this.f18858d, b.e(this.f18855a, this.f18857c), this.f18856b));
        }
        if (this.f18865k) {
            this.f18863i.execute(new g.b(this.f18858d, b.a(this.f18855a), this.f18856b));
        }
    }
}
