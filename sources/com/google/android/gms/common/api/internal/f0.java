package com.google.android.gms.common.api.internal;

import Ra.e;
import Sa.d;
import Sa.l;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C4522e;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.common.internal.V;
import java.util.Set;

public final class f0 extends d implements f.b, f.c {

    /* renamed from: h  reason: collision with root package name */
    private static final a.C0818a f54014h = Ra.d.f52317c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f54015a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f54016b;

    /* renamed from: c  reason: collision with root package name */
    private final a.C0818a f54017c;

    /* renamed from: d  reason: collision with root package name */
    private final Set f54018d;

    /* renamed from: e  reason: collision with root package name */
    private final C4522e f54019e;

    /* renamed from: f  reason: collision with root package name */
    private e f54020f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public e0 f54021g;

    public f0(Context context, Handler handler, C4522e eVar) {
        a.C0818a aVar = f54014h;
        this.f54015a = context;
        this.f54016b = handler;
        this.f54019e = (C4522e) C4536s.m(eVar, "ClientSettings must not be null");
        this.f54018d = eVar.h();
        this.f54017c = aVar;
    }

    static /* bridge */ /* synthetic */ void s1(f0 f0Var, l lVar) {
        ConnectionResult o02 = lVar.o0();
        if (o02.s0()) {
            V v10 = (V) C4536s.l(lVar.p0());
            ConnectionResult o03 = v10.o0();
            if (!o03.s0()) {
                String valueOf = String.valueOf(o03);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                f0Var.f54021g.c(o03);
                f0Var.f54020f.disconnect();
                return;
            }
            f0Var.f54021g.b(v10.p0(), f0Var.f54018d);
        } else {
            f0Var.f54021g.c(o02);
        }
        f0Var.f54020f.disconnect();
    }

    public final void X0(l lVar) {
        this.f54016b.post(new d0(this, lVar));
    }

    public final void a(Bundle bundle) {
        this.f54020f.a(this);
    }

    public final void b(int i10) {
        this.f54021g.d(i10);
    }

    public final void c(ConnectionResult connectionResult) {
        this.f54021g.c(connectionResult);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [Ra.e, com.google.android.gms.common.api.a$f] */
    public final void t1(e0 e0Var) {
        e eVar = this.f54020f;
        if (eVar != null) {
            eVar.disconnect();
        }
        this.f54019e.l(Integer.valueOf(System.identityHashCode(this)));
        a.C0818a aVar = this.f54017c;
        Context context = this.f54015a;
        Handler handler = this.f54016b;
        C4522e eVar2 = this.f54019e;
        this.f54020f = aVar.buildClient(context, handler.getLooper(), eVar2, (Object) eVar2.i(), (f.b) this, (f.c) this);
        this.f54021g = e0Var;
        Set set = this.f54018d;
        if (set == null || set.isEmpty()) {
            this.f54016b.post(new c0(this));
        } else {
            this.f54020f.b();
        }
    }

    public final void u1() {
        e eVar = this.f54020f;
        if (eVar != null) {
            eVar.disconnect();
        }
    }
}
