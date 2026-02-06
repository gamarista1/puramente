package u3;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import y3.g;
import y3.h;
import yf.C6798l;

/* renamed from: u3.c  reason: case insensitive filesystem */
public final class C2711c {

    /* renamed from: m  reason: collision with root package name */
    public static final a f26594m = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public h f26595a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f26596b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private Runnable f26597c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f26598d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private long f26599e;

    /* renamed from: f  reason: collision with root package name */
    private final Executor f26600f;

    /* renamed from: g  reason: collision with root package name */
    private int f26601g;

    /* renamed from: h  reason: collision with root package name */
    private long f26602h;

    /* renamed from: i  reason: collision with root package name */
    private g f26603i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f26604j;

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f26605k;

    /* renamed from: l  reason: collision with root package name */
    private final Runnable f26606l;

    /* renamed from: u3.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2711c(long j10, TimeUnit timeUnit, Executor executor) {
        C6496s.h(timeUnit, "autoCloseTimeUnit");
        C6496s.h(executor, "autoCloseExecutor");
        this.f26599e = timeUnit.toMillis(j10);
        this.f26600f = executor;
        this.f26602h = SystemClock.uptimeMillis();
        this.f26605k = new C2709a(this);
        this.f26606l = new C2710b(this);
    }

    /* access modifiers changed from: private */
    public static final void c(C2711c cVar) {
        C6514M m10;
        C6496s.h(cVar, "this$0");
        synchronized (cVar.f26598d) {
            try {
                if (SystemClock.uptimeMillis() - cVar.f26602h >= cVar.f26599e) {
                    if (cVar.f26601g == 0) {
                        Runnable runnable = cVar.f26597c;
                        if (runnable != null) {
                            runnable.run();
                            m10 = C6514M.f71813a;
                        } else {
                            m10 = null;
                        }
                        if (m10 != null) {
                            g gVar = cVar.f26603i;
                            if (gVar != null && gVar.isOpen()) {
                                gVar.close();
                            }
                            cVar.f26603i = null;
                            C6514M m11 = C6514M.f71813a;
                            return;
                        }
                        throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void f(C2711c cVar) {
        C6496s.h(cVar, "this$0");
        cVar.f26600f.execute(cVar.f26606l);
    }

    public final void d() {
        synchronized (this.f26598d) {
            try {
                this.f26604j = true;
                g gVar = this.f26603i;
                if (gVar != null) {
                    gVar.close();
                }
                this.f26603i = null;
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        synchronized (this.f26598d) {
            try {
                int i10 = this.f26601g;
                if (i10 > 0) {
                    int i11 = i10 - 1;
                    this.f26601g = i11;
                    if (i11 == 0) {
                        if (this.f26603i != null) {
                            this.f26596b.postDelayed(this.f26605k, this.f26599e);
                        } else {
                            return;
                        }
                    }
                    C6514M m10 = C6514M.f71813a;
                    return;
                }
                throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Object g(C6798l lVar) {
        C6496s.h(lVar, "block");
        try {
            return lVar.invoke(j());
        } finally {
            e();
        }
    }

    public final g h() {
        return this.f26603i;
    }

    public final h i() {
        h hVar = this.f26595a;
        if (hVar != null) {
            return hVar;
        }
        C6496s.v("delegateOpenHelper");
        return null;
    }

    public final g j() {
        synchronized (this.f26598d) {
            this.f26596b.removeCallbacks(this.f26605k);
            this.f26601g++;
            if (!this.f26604j) {
                g gVar = this.f26603i;
                if (gVar != null && gVar.isOpen()) {
                    return gVar;
                }
                g X02 = i().X0();
                this.f26603i = X02;
                return X02;
            }
            throw new IllegalStateException("Attempting to open already closed database.");
        }
    }

    public final void k(h hVar) {
        C6496s.h(hVar, "delegateOpenHelper");
        n(hVar);
    }

    public final boolean l() {
        return !this.f26604j;
    }

    public final void m(Runnable runnable) {
        C6496s.h(runnable, "onAutoClose");
        this.f26597c = runnable;
    }

    public final void n(h hVar) {
        C6496s.h(hVar, "<set-?>");
        this.f26595a = hVar;
    }
}
