package com.google.android.gms.common.api.internal;

import Aa.C4245e;
import Ea.C4279b;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.c;
import android.util.Log;
import androidx.collection.C1587a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C4499k;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import ya.C5286c;

public final class L implements f.b, f.c {

    /* renamed from: a  reason: collision with root package name */
    private final Queue f53960a = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final a.f f53961b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C4490b f53962c;

    /* renamed from: d  reason: collision with root package name */
    private final B f53963d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f53964e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final Map f53965f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final int f53966g;

    /* renamed from: h  reason: collision with root package name */
    private final f0 f53967h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public boolean f53968i;

    /* renamed from: j  reason: collision with root package name */
    private final List f53969j = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private ConnectionResult f53970m = null;

    /* renamed from: n  reason: collision with root package name */
    private int f53971n = 0;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ C4495g f53972o;

    public L(C4495g gVar, e eVar) {
        this.f53972o = gVar;
        a.f zab = eVar.zab(gVar.f54039n.getLooper(), this);
        this.f53961b = zab;
        this.f53962c = eVar.getApiKey();
        this.f53963d = new B();
        this.f53966g = eVar.zaa();
        if (zab.requiresSignIn()) {
            this.f53967h = eVar.zac(gVar.f54030e, gVar.f54039n);
        } else {
            this.f53967h = null;
        }
    }

    static /* bridge */ /* synthetic */ void B(L l10, N n10) {
        if (!l10.f53969j.contains(n10) || l10.f53968i) {
            return;
        }
        if (!l10.f53961b.isConnected()) {
            l10.E();
        } else {
            l10.j();
        }
    }

    static /* bridge */ /* synthetic */ void C(L l10, N n10) {
        C5286c[] g10;
        if (l10.f53969j.remove(n10)) {
            l10.f53972o.f54039n.removeMessages(15, n10);
            l10.f53972o.f54039n.removeMessages(16, n10);
            C5286c a10 = n10.f53974b;
            ArrayList arrayList = new ArrayList(l10.f53960a.size());
            for (p0 p0Var : l10.f53960a) {
                if ((p0Var instanceof V) && (g10 = ((V) p0Var).g(l10)) != null && C4279b.b(g10, a10)) {
                    arrayList.add(p0Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                p0 p0Var2 = (p0) arrayList.get(i10);
                l10.f53960a.remove(p0Var2);
                p0Var2.b(new o(a10));
            }
        }
    }

    private final C5286c f(C5286c[] cVarArr) {
        if (!(cVarArr == null || cVarArr.length == 0)) {
            C5286c[] availableFeatures = this.f53961b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new C5286c[0];
            }
            C1587a aVar = new C1587a(availableFeatures.length);
            for (C5286c cVar : availableFeatures) {
                aVar.put(cVar.getName(), Long.valueOf(cVar.o0()));
            }
            for (C5286c cVar2 : cVarArr) {
                Long l10 = (Long) aVar.get(cVar2.getName());
                if (l10 == null || l10.longValue() < cVar2.o0()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    private final void g(ConnectionResult connectionResult) {
        Iterator it = this.f53964e.iterator();
        if (it.hasNext()) {
            c.a(it.next());
            if (C4535q.b(connectionResult, ConnectionResult.f53893e)) {
                this.f53961b.getEndpointPackageName();
            }
            throw null;
        }
        this.f53964e.clear();
    }

    /* access modifiers changed from: private */
    public final void h(Status status) {
        C4536s.d(this.f53972o.f54039n);
        i(status, (Exception) null, false);
    }

    private final void i(Status status, Exception exc, boolean z10) {
        boolean z11;
        C4536s.d(this.f53972o.f54039n);
        boolean z12 = true;
        if (status != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (exc != null) {
            z12 = false;
        }
        if (z11 != z12) {
            Iterator it = this.f53960a.iterator();
            while (it.hasNext()) {
                p0 p0Var = (p0) it.next();
                if (!z10 || p0Var.f54063a == 2) {
                    if (status != null) {
                        p0Var.a(status);
                    } else {
                        p0Var.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    private final void j() {
        ArrayList arrayList = new ArrayList(this.f53960a);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            p0 p0Var = (p0) arrayList.get(i10);
            if (this.f53961b.isConnected()) {
                if (p(p0Var)) {
                    this.f53960a.remove(p0Var);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void k() {
        D();
        g(ConnectionResult.f53893e);
        o();
        Iterator it = this.f53965f.values().iterator();
        if (!it.hasNext()) {
            j();
            m();
            return;
        }
        ((b0) it.next()).getClass();
        throw null;
    }

    /* access modifiers changed from: private */
    public final void l(int i10) {
        D();
        this.f53968i = true;
        this.f53963d.e(i10, this.f53961b.getLastDisconnectMessage());
        C4490b bVar = this.f53962c;
        C4495g gVar = this.f53972o;
        gVar.f54039n.sendMessageDelayed(Message.obtain(gVar.f54039n, 9, bVar), 5000);
        C4490b bVar2 = this.f53962c;
        C4495g gVar2 = this.f53972o;
        gVar2.f54039n.sendMessageDelayed(Message.obtain(gVar2.f54039n, 11, bVar2), 120000);
        this.f53972o.f54032g.c();
        for (b0 b0Var : this.f53965f.values()) {
            b0Var.f54005a.run();
        }
    }

    private final void m() {
        this.f53972o.f54039n.removeMessages(12, this.f53962c);
        C4490b bVar = this.f53962c;
        C4495g gVar = this.f53972o;
        gVar.f54039n.sendMessageDelayed(gVar.f54039n.obtainMessage(12, bVar), this.f53972o.f54026a);
    }

    private final void n(p0 p0Var) {
        p0Var.d(this.f53963d, d());
        try {
            p0Var.c(this);
        } catch (DeadObjectException unused) {
            b(1);
            this.f53961b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void o() {
        if (this.f53968i) {
            C4495g gVar = this.f53972o;
            gVar.f54039n.removeMessages(11, this.f53962c);
            C4495g gVar2 = this.f53972o;
            gVar2.f54039n.removeMessages(9, this.f53962c);
            this.f53968i = false;
        }
    }

    private final boolean p(p0 p0Var) {
        if (!(p0Var instanceof V)) {
            n(p0Var);
            return true;
        }
        V v10 = (V) p0Var;
        C5286c f10 = f(v10.g(this));
        if (f10 == null) {
            n(p0Var);
            return true;
        }
        String name = this.f53961b.getClass().getName();
        String name2 = f10.getName();
        long o02 = f10.o0();
        Log.w("GoogleApiManager", name + " could not execute call because it requires feature (" + name2 + ", " + o02 + ").");
        if (!this.f53972o.f54040o || !v10.f(this)) {
            v10.b(new o(f10));
            return true;
        }
        N n10 = new N(this.f53962c, f10, (M) null);
        int indexOf = this.f53969j.indexOf(n10);
        if (indexOf >= 0) {
            N n11 = (N) this.f53969j.get(indexOf);
            this.f53972o.f54039n.removeMessages(15, n11);
            C4495g gVar = this.f53972o;
            gVar.f54039n.sendMessageDelayed(Message.obtain(gVar.f54039n, 15, n11), 5000);
            return false;
        }
        this.f53969j.add(n10);
        C4495g gVar2 = this.f53972o;
        gVar2.f54039n.sendMessageDelayed(Message.obtain(gVar2.f54039n, 15, n10), 5000);
        C4495g gVar3 = this.f53972o;
        gVar3.f54039n.sendMessageDelayed(Message.obtain(gVar3.f54039n, 16, n10), 120000);
        ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
        if (q(connectionResult)) {
            return false;
        }
        this.f53972o.f(connectionResult, this.f53966g);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean q(com.google.android.gms.common.ConnectionResult r4) {
        /*
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.C4495g.f54024r
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.g r1 = r3.f53972o     // Catch:{ all -> 0x0027 }
            com.google.android.gms.common.api.internal.C r2 = r1.f54036k     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x0029
            java.util.Set r1 = r1.f54037l     // Catch:{ all -> 0x0027 }
            com.google.android.gms.common.api.internal.b r2 = r3.f53962c     // Catch:{ all -> 0x0027 }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0029
            com.google.android.gms.common.api.internal.g r1 = r3.f53972o     // Catch:{ all -> 0x0027 }
            com.google.android.gms.common.api.internal.C r1 = r1.f54036k     // Catch:{ all -> 0x0027 }
            int r2 = r3.f53966g     // Catch:{ all -> 0x0027 }
            r1.h(r4, r2)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            r4 = 1
            return r4
        L_0x0027:
            r4 = move-exception
            goto L_0x002c
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            r4 = 0
            return r4
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.L.q(com.google.android.gms.common.ConnectionResult):boolean");
    }

    /* access modifiers changed from: private */
    public final boolean r(boolean z10) {
        C4536s.d(this.f53972o.f54039n);
        if (!this.f53961b.isConnected() || !this.f53965f.isEmpty()) {
            return false;
        }
        if (!this.f53963d.g()) {
            this.f53961b.disconnect("Timing out service connection.");
            return true;
        } else if (!z10) {
            return false;
        } else {
            m();
            return false;
        }
    }

    public final void D() {
        C4536s.d(this.f53972o.f54039n);
        this.f53970m = null;
    }

    public final void E() {
        C4536s.d(this.f53972o.f54039n);
        if (!this.f53961b.isConnected() && !this.f53961b.isConnecting()) {
            try {
                C4495g gVar = this.f53972o;
                int b10 = gVar.f54032g.b(gVar.f54030e, this.f53961b);
                if (b10 != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(b10, (PendingIntent) null);
                    String name = this.f53961b.getClass().getName();
                    String obj = connectionResult.toString();
                    Log.w("GoogleApiManager", "The service for " + name + " is not available: " + obj);
                    H(connectionResult, (Exception) null);
                    return;
                }
                C4495g gVar2 = this.f53972o;
                a.f fVar = this.f53961b;
                P p10 = new P(gVar2, fVar, this.f53962c);
                if (fVar.requiresSignIn()) {
                    ((f0) C4536s.l(this.f53967h)).t1(p10);
                }
                try {
                    this.f53961b.connect(p10);
                } catch (SecurityException e10) {
                    H(new ConnectionResult(10), e10);
                }
            } catch (IllegalStateException e11) {
                H(new ConnectionResult(10), e11);
            }
        }
    }

    public final void F(p0 p0Var) {
        C4536s.d(this.f53972o.f54039n);
        if (!this.f53961b.isConnected()) {
            this.f53960a.add(p0Var);
            ConnectionResult connectionResult = this.f53970m;
            if (connectionResult == null || !connectionResult.r0()) {
                E();
            } else {
                H(this.f53970m, (Exception) null);
            }
        } else if (p(p0Var)) {
            m();
        } else {
            this.f53960a.add(p0Var);
        }
    }

    /* access modifiers changed from: package-private */
    public final void G() {
        this.f53971n++;
    }

    public final void H(ConnectionResult connectionResult, Exception exc) {
        C4536s.d(this.f53972o.f54039n);
        f0 f0Var = this.f53967h;
        if (f0Var != null) {
            f0Var.u1();
        }
        D();
        this.f53972o.f54032g.c();
        g(connectionResult);
        if ((this.f53961b instanceof C4245e) && connectionResult.o0() != 24) {
            this.f53972o.f54027b = true;
            C4495g gVar = this.f53972o;
            gVar.f54039n.sendMessageDelayed(gVar.f54039n.obtainMessage(19), 300000);
        }
        if (connectionResult.o0() == 4) {
            h(C4495g.f54023q);
        } else if (this.f53960a.isEmpty()) {
            this.f53970m = connectionResult;
        } else if (exc != null) {
            C4536s.d(this.f53972o.f54039n);
            i((Status) null, exc, false);
        } else if (this.f53972o.f54040o) {
            i(C4495g.g(this.f53962c, connectionResult), (Exception) null, true);
            if (!this.f53960a.isEmpty() && !q(connectionResult) && !this.f53972o.f(connectionResult, this.f53966g)) {
                if (connectionResult.o0() == 18) {
                    this.f53968i = true;
                }
                if (this.f53968i) {
                    C4495g gVar2 = this.f53972o;
                    gVar2.f54039n.sendMessageDelayed(Message.obtain(gVar2.f54039n, 9, this.f53962c), 5000);
                    return;
                }
                h(C4495g.g(this.f53962c, connectionResult));
            }
        } else {
            h(C4495g.g(this.f53962c, connectionResult));
        }
    }

    public final void I(ConnectionResult connectionResult) {
        C4536s.d(this.f53972o.f54039n);
        a.f fVar = this.f53961b;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        fVar.disconnect("onSignInFailed for " + name + " with " + valueOf);
        H(connectionResult, (Exception) null);
    }

    public final void J() {
        C4536s.d(this.f53972o.f54039n);
        if (this.f53968i) {
            E();
        }
    }

    public final void K() {
        C4536s.d(this.f53972o.f54039n);
        h(C4495g.f54022p);
        this.f53963d.f();
        for (C4499k.a o0Var : (C4499k.a[]) this.f53965f.keySet().toArray(new C4499k.a[0])) {
            F(new o0(o0Var, new TaskCompletionSource()));
        }
        g(new ConnectionResult(4));
        if (this.f53961b.isConnected()) {
            this.f53961b.onUserSignOut(new K(this));
        }
    }

    public final void L() {
        Status status;
        C4536s.d(this.f53972o.f54039n);
        if (this.f53968i) {
            o();
            C4495g gVar = this.f53972o;
            if (gVar.f54031f.g(gVar.f54030e) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            h(status);
            this.f53961b.disconnect("Timing out connection while resuming.");
        }
    }

    public final void a(Bundle bundle) {
        if (Looper.myLooper() == this.f53972o.f54039n.getLooper()) {
            k();
        } else {
            this.f53972o.f54039n.post(new H(this));
        }
    }

    public final void b(int i10) {
        if (Looper.myLooper() == this.f53972o.f54039n.getLooper()) {
            l(i10);
        } else {
            this.f53972o.f54039n.post(new I(this, i10));
        }
    }

    public final void c(ConnectionResult connectionResult) {
        H(connectionResult, (Exception) null);
    }

    public final boolean d() {
        return this.f53961b.requiresSignIn();
    }

    public final boolean e() {
        return r(true);
    }

    public final int s() {
        return this.f53966g;
    }

    /* access modifiers changed from: package-private */
    public final int t() {
        return this.f53971n;
    }

    public final a.f v() {
        return this.f53961b;
    }

    public final Map x() {
        return this.f53965f;
    }
}
