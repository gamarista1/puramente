package com.google.android.gms.common.api.internal;

import Ea.i;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.c;
import android.util.Log;
import androidx.collection.C1588b;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.C4499k;
import com.google.android.gms.common.internal.C4527i;
import com.google.android.gms.common.internal.C4534p;
import com.google.android.gms.common.internal.C4537t;
import com.google.android.gms.common.internal.C4538u;
import com.google.android.gms.common.internal.C4540w;
import com.google.android.gms.common.internal.C4541x;
import com.google.android.gms.common.internal.C4542y;
import com.google.android.gms.common.internal.L;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.api.internal.g  reason: case insensitive filesystem */
public class C4495g implements Handler.Callback {

    /* renamed from: p  reason: collision with root package name */
    public static final Status f54022p = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static final Status f54023q = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final Object f54024r = new Object();

    /* renamed from: s  reason: collision with root package name */
    private static C4495g f54025s;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public long f54026a = 10000;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f54027b = false;

    /* renamed from: c  reason: collision with root package name */
    private C4540w f54028c;

    /* renamed from: d  reason: collision with root package name */
    private C4542y f54029d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Context f54030e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final a f54031f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final L f54032g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicInteger f54033h = new AtomicInteger(1);

    /* renamed from: i  reason: collision with root package name */
    private final AtomicInteger f54034i = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final Map f54035j = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public C f54036k = null;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final Set f54037l = new C1588b();

    /* renamed from: m  reason: collision with root package name */
    private final Set f54038m = new C1588b();
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Handler f54039n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public volatile boolean f54040o = true;

    private C4495g(Context context, Looper looper, a aVar) {
        this.f54030e = context;
        zau zau = new zau(looper, this);
        this.f54039n = zau;
        this.f54031f = aVar;
        this.f54032g = new L(aVar);
        if (i.a(context)) {
            this.f54040o = false;
        }
        zau.sendMessage(zau.obtainMessage(6));
    }

    public static void a() {
        synchronized (f54024r) {
            try {
                C4495g gVar = f54025s;
                if (gVar != null) {
                    gVar.f54034i.incrementAndGet();
                    Handler handler = gVar.f54039n;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public static Status g(C4490b bVar, ConnectionResult connectionResult) {
        String b10 = bVar.b();
        String valueOf = String.valueOf(connectionResult);
        return new Status(connectionResult, "API: " + b10 + " is not available on this device. Connection failed with: " + valueOf);
    }

    private final L h(e eVar) {
        Map map = this.f54035j;
        C4490b apiKey = eVar.getApiKey();
        L l10 = (L) map.get(apiKey);
        if (l10 == null) {
            l10 = new L(this, eVar);
            this.f54035j.put(apiKey, l10);
        }
        if (l10.d()) {
            this.f54038m.add(apiKey);
        }
        l10.E();
        return l10;
    }

    private final C4542y i() {
        if (this.f54029d == null) {
            this.f54029d = C4541x.a(this.f54030e);
        }
        return this.f54029d;
    }

    private final void j() {
        C4540w wVar = this.f54028c;
        if (wVar != null) {
            if (wVar.o0() > 0 || e()) {
                i().a(wVar);
            }
            this.f54028c = null;
        }
    }

    private final void k(TaskCompletionSource taskCompletionSource, int i10, e eVar) {
        Y a10;
        if (i10 != 0 && (a10 = Y.a(this, i10, eVar.getApiKey())) != null) {
            Task task = taskCompletionSource.getTask();
            Handler handler = this.f54039n;
            handler.getClass();
            task.addOnCompleteListener((Executor) new F(handler), a10);
        }
    }

    public static C4495g u(Context context) {
        C4495g gVar;
        synchronized (f54024r) {
            try {
                if (f54025s == null) {
                    f54025s = new C4495g(context.getApplicationContext(), C4527i.c().getLooper(), a.o());
                }
                gVar = f54025s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public final void C(e eVar, int i10, C4492d dVar) {
        this.f54039n.sendMessage(this.f54039n.obtainMessage(4, new a0(new m0(i10, dVar), this.f54034i.get(), eVar)));
    }

    public final void D(e eVar, int i10, C4510w wVar, TaskCompletionSource taskCompletionSource, C4508u uVar) {
        k(taskCompletionSource, wVar.d(), eVar);
        this.f54039n.sendMessage(this.f54039n.obtainMessage(4, new a0(new n0(i10, wVar, taskCompletionSource, uVar), this.f54034i.get(), eVar)));
    }

    /* access modifiers changed from: package-private */
    public final void E(C4534p pVar, int i10, long j10, int i11) {
        this.f54039n.sendMessage(this.f54039n.obtainMessage(18, new Z(pVar, i10, j10, i11)));
    }

    public final void F(ConnectionResult connectionResult, int i10) {
        if (!f(connectionResult, i10)) {
            Handler handler = this.f54039n;
            handler.sendMessage(handler.obtainMessage(5, i10, 0, connectionResult));
        }
    }

    public final void G() {
        Handler handler = this.f54039n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void H(e eVar) {
        Handler handler = this.f54039n;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void b(C c10) {
        synchronized (f54024r) {
            try {
                if (this.f54036k != c10) {
                    this.f54036k = c10;
                    this.f54037l.clear();
                }
                this.f54037l.addAll(c10.i());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(C c10) {
        synchronized (f54024r) {
            try {
                if (this.f54036k == c10) {
                    this.f54036k = null;
                    this.f54037l.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        if (this.f54027b) {
            return false;
        }
        C4538u a10 = C4537t.b().a();
        if (a10 != null && !a10.q0()) {
            return false;
        }
        int a11 = this.f54032g.a(this.f54030e, 203400000);
        if (a11 == -1 || a11 == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean f(ConnectionResult connectionResult, int i10) {
        return this.f54031f.z(this.f54030e, connectionResult, i10);
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        L l10 = null;
        long j10 = 300000;
        switch (i10) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j10 = 10000;
                }
                this.f54026a = j10;
                this.f54039n.removeMessages(12);
                for (C4490b obtainMessage : this.f54035j.keySet()) {
                    Handler handler = this.f54039n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f54026a);
                }
                break;
            case 2:
                c.a(message.obj);
                throw null;
            case 3:
                for (L l11 : this.f54035j.values()) {
                    l11.D();
                    l11.E();
                }
                break;
            case 4:
            case 8:
            case 13:
                a0 a0Var = (a0) message.obj;
                L l12 = (L) this.f54035j.get(a0Var.f54000c.getApiKey());
                if (l12 == null) {
                    l12 = h(a0Var.f54000c);
                }
                if (l12.d() && this.f54034i.get() != a0Var.f53999b) {
                    a0Var.f53998a.a(f54022p);
                    l12.K();
                    break;
                } else {
                    l12.F(a0Var.f53998a);
                    break;
                }
            case 5:
                int i11 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it = this.f54035j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        L l13 = (L) it.next();
                        if (l13.s() == i11) {
                            l10 = l13;
                        }
                    }
                }
                if (l10 != null) {
                    if (connectionResult.o0() != 13) {
                        l10.h(g(l10.f53962c, connectionResult));
                        break;
                    } else {
                        String e10 = this.f54031f.e(connectionResult.o0());
                        String p02 = connectionResult.p0();
                        l10.h(new Status(17, "Error resolution was canceled by the user, original error message: " + e10 + ": " + p02));
                        break;
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                    break;
                }
            case 6:
                if (this.f54030e.getApplicationContext() instanceof Application) {
                    C4491c.c((Application) this.f54030e.getApplicationContext());
                    C4491c.b().a(new G(this));
                    if (!C4491c.b().e(true)) {
                        this.f54026a = 300000;
                        break;
                    }
                }
                break;
            case 7:
                h((e) message.obj);
                break;
            case 9:
                if (this.f54035j.containsKey(message.obj)) {
                    ((L) this.f54035j.get(message.obj)).J();
                    break;
                }
                break;
            case 10:
                for (C4490b remove : this.f54038m) {
                    L l14 = (L) this.f54035j.remove(remove);
                    if (l14 != null) {
                        l14.K();
                    }
                }
                this.f54038m.clear();
                break;
            case 11:
                if (this.f54035j.containsKey(message.obj)) {
                    ((L) this.f54035j.get(message.obj)).L();
                    break;
                }
                break;
            case 12:
                if (this.f54035j.containsKey(message.obj)) {
                    ((L) this.f54035j.get(message.obj)).e();
                    break;
                }
                break;
            case StdKeyDeserializer.TYPE_URL:
                D d10 = (D) message.obj;
                C4490b a10 = d10.a();
                if (this.f54035j.containsKey(a10)) {
                    d10.b().setResult(Boolean.valueOf(((L) this.f54035j.get(a10)).r(false)));
                    break;
                } else {
                    d10.b().setResult(Boolean.FALSE);
                    break;
                }
            case StdKeyDeserializer.TYPE_CLASS:
                N n10 = (N) message.obj;
                if (this.f54035j.containsKey(n10.f53973a)) {
                    L.B((L) this.f54035j.get(n10.f53973a), n10);
                    break;
                }
                break;
            case 16:
                N n11 = (N) message.obj;
                if (this.f54035j.containsKey(n11.f53973a)) {
                    L.C((L) this.f54035j.get(n11.f53973a), n11);
                    break;
                }
                break;
            case 17:
                j();
                break;
            case 18:
                Z z10 = (Z) message.obj;
                if (z10.f53996c != 0) {
                    C4540w wVar = this.f54028c;
                    if (wVar != null) {
                        List p03 = wVar.p0();
                        if (wVar.o0() != z10.f53995b || (p03 != null && p03.size() >= z10.f53997d)) {
                            this.f54039n.removeMessages(17);
                            j();
                        } else {
                            this.f54028c.q0(z10.f53994a);
                        }
                    }
                    if (this.f54028c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(z10.f53994a);
                        this.f54028c = new C4540w(z10.f53995b, arrayList);
                        Handler handler2 = this.f54039n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), z10.f53996c);
                        break;
                    }
                } else {
                    i().a(new C4540w(z10.f53995b, Arrays.asList(new C4534p[]{z10.f53994a})));
                    break;
                }
                break;
            case 19:
                this.f54027b = false;
                break;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
        return true;
    }

    public final int l() {
        return this.f54033h.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    public final L t(C4490b bVar) {
        return (L) this.f54035j.get(bVar);
    }

    public final Task w(e eVar) {
        D d10 = new D(eVar.getApiKey());
        this.f54039n.sendMessage(this.f54039n.obtainMessage(14, d10));
        return d10.b().getTask();
    }

    public final Task x(e eVar, C4499k.a aVar, int i10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        k(taskCompletionSource, i10, eVar);
        this.f54039n.sendMessage(this.f54039n.obtainMessage(13, new a0(new o0(aVar, taskCompletionSource), this.f54034i.get(), eVar)));
        return taskCompletionSource.getTask();
    }
}
