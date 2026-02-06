package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.support.v4.media.session.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.C4536s;
import java.lang.ref.WeakReference;

public final class k0 extends n implements l {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public k0 f54050a = null;

    /* renamed from: b  reason: collision with root package name */
    private h f54051b = null;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Object f54052c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private Status f54053d = null;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference f54054e;

    /* renamed from: f  reason: collision with root package name */
    private final i0 f54055f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f54056g = false;

    public k0(WeakReference weakReference) {
        Looper looper;
        C4536s.m(weakReference, "GoogleApiClient reference must not be null");
        this.f54054e = weakReference;
        f fVar = (f) weakReference.get();
        if (fVar != null) {
            looper = fVar.f();
        } else {
            looper = Looper.getMainLooper();
        }
        this.f54055f = new i0(this, looper);
    }

    /* access modifiers changed from: private */
    public final void g(Status status) {
        synchronized (this.f54052c) {
            this.f54053d = status;
            i(status);
        }
    }

    private final void h() {
    }

    private final void i(Status status) {
        synchronized (this.f54052c) {
            try {
                if (j()) {
                    c.a(C4536s.l((Object) null));
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final boolean j() {
        f fVar = (f) this.f54054e.get();
        return false;
    }

    private static final void k(k kVar) {
    }

    public final void a(k kVar) {
        synchronized (this.f54052c) {
            try {
                if (!kVar.getStatus().s0()) {
                    g(kVar.getStatus());
                    k(kVar);
                } else if (j()) {
                    c.a(C4536s.l((Object) null));
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final n b(m mVar) {
        k0 k0Var;
        synchronized (this.f54052c) {
            C4536s.p(true, "Cannot call then() twice.");
            C4536s.p(true, "Cannot call then() and andFinally() on the same TransformedResult.");
            k0Var = new k0(this.f54054e);
            this.f54050a = k0Var;
            h();
        }
        return k0Var;
    }

    public final void f(h hVar) {
        synchronized (this.f54052c) {
            this.f54051b = hVar;
            h();
        }
    }
}
