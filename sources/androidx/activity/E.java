package androidx.activity;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;

public final class E {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f10737a;

    /* renamed from: b  reason: collision with root package name */
    private final C6787a f10738b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f10739c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private int f10740d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f10741e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f10742f;

    /* renamed from: g  reason: collision with root package name */
    private final List f10743g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f10744h = new D(this);

    public E(Executor executor, C6787a aVar) {
        C6496s.h(executor, "executor");
        C6496s.h(aVar, "reportFullyDrawn");
        this.f10737a = executor;
        this.f10738b = aVar;
    }

    /* access modifiers changed from: private */
    public static final void d(E e10) {
        C6496s.h(e10, "this$0");
        synchronized (e10.f10739c) {
            try {
                e10.f10741e = false;
                if (e10.f10740d == 0 && !e10.f10742f) {
                    e10.f10738b.invoke();
                    e10.b();
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f10739c) {
            try {
                this.f10742f = true;
                for (C6787a invoke : this.f10743g) {
                    invoke.invoke();
                }
                this.f10743g.clear();
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f10739c) {
            z10 = this.f10742f;
        }
        return z10;
    }
}
