package com.facebook.react;

import I7.e;
import K7.a;
import M7.b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.L;
import com.facebook.react.devsupport.k0;
import n7.C3863a;

/* renamed from: com.facebook.react.z  reason: case insensitive filesystem */
public class C3448z {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f42348a;

    /* renamed from: b  reason: collision with root package name */
    private Z f42349b;

    /* renamed from: c  reason: collision with root package name */
    private final String f42350c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f42351d;

    /* renamed from: e  reason: collision with root package name */
    private L f42352e;

    /* renamed from: f  reason: collision with root package name */
    private O f42353f;

    /* renamed from: g  reason: collision with root package name */
    private A f42354g;

    /* renamed from: h  reason: collision with root package name */
    private a f42355h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f42356i;

    public C3448z(Activity activity, O o10, String str, Bundle bundle) {
        this.f42356i = b.i();
        this.f42348a = activity;
        this.f42350c = str;
        this.f42351d = bundle;
        this.f42352e = new L();
        this.f42353f = o10;
    }

    private e d() {
        A a10;
        if (b.e() && (a10 = this.f42354g) != null && a10.f() != null) {
            return this.f42354g.f();
        }
        if (!f().g() || f().c() == null) {
            return null;
        }
        return f().c().E();
    }

    private O f() {
        return this.f42353f;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i() {
        if (this.f42353f.g() && this.f42353f.c() != null) {
            this.f42353f.c().n0();
        }
    }

    /* access modifiers changed from: protected */
    public Z b() {
        Z z10 = new Z(this.f42348a);
        z10.setIsFabric(h());
        return z10;
    }

    public ReactContext c() {
        if (!b.e()) {
            return e().D();
        }
        A a10 = this.f42354g;
        if (a10 != null) {
            return a10.i();
        }
        return null;
    }

    public J e() {
        return f().c();
    }

    public Z g() {
        if (!b.e()) {
            return this.f42349b;
        }
        a aVar = this.f42355h;
        if (aVar != null) {
            return (Z) aVar.a();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return this.f42356i;
    }

    public void j(String str) {
        if (b.e()) {
            if (this.f42355h == null) {
                this.f42355h = this.f42354g.e(this.f42348a, str, this.f42351d);
            }
            this.f42355h.start();
        } else if (this.f42349b == null) {
            Z b10 = b();
            this.f42349b = b10;
            b10.s(f().c(), str, this.f42351d);
        } else {
            throw new IllegalStateException("Cannot loadApp while app is already running.");
        }
    }

    public void k(int i10, int i11, Intent intent, boolean z10) {
        if (b.e()) {
            this.f42354g.onActivityResult(this.f42348a, i10, i11, intent);
        } else if (f().g() && z10) {
            f().c().Y(this.f42348a, i10, i11, intent);
        }
    }

    public boolean l() {
        if (b.e()) {
            this.f42354g.h();
            return true;
        } else if (!f().g()) {
            return false;
        } else {
            f().c().Z();
            return true;
        }
    }

    public void m(Configuration configuration) {
        if (b.e()) {
            this.f42354g.k((Context) C3863a.c(this.f42348a));
        } else if (f().g()) {
            e().a0((Context) C3863a.c(this.f42348a), configuration);
        }
    }

    public void n() {
        x();
        if (b.e()) {
            this.f42354g.n(this.f42348a);
        } else if (f().g()) {
            f().c().c0(this.f42348a);
        }
    }

    public void o() {
        if (b.e()) {
            this.f42354g.l(this.f42348a);
        } else if (f().g()) {
            f().c().e0(this.f42348a);
        }
    }

    public void p() {
        if (!(this.f42348a instanceof U7.b)) {
            throw new ClassCastException("Host Activity does not implement DefaultHardwareBackBtnHandler");
        } else if (b.e()) {
            A a10 = this.f42354g;
            Activity activity = this.f42348a;
            a10.g(activity, (U7.b) activity);
        } else if (f().g()) {
            J c10 = f().c();
            Activity activity2 = this.f42348a;
            c10.g0(activity2, (U7.b) activity2);
        }
    }

    public boolean q(int i10, KeyEvent keyEvent) {
        A a10;
        if (i10 != 90) {
            return false;
        }
        if ((!b.e() || (a10 = this.f42354g) == null || a10.f() == null) && (!f().g() || !f().f())) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean r(int i10) {
        A a10;
        if (i10 != 90) {
            return false;
        }
        if (b.e() && (a10 = this.f42354g) != null) {
            e f10 = a10.f();
            if (f10 == null || (f10 instanceof k0)) {
                return false;
            }
            f10.D();
            return true;
        } else if (!f().g() || !f().f()) {
            return false;
        } else {
            f().c().v0();
            return true;
        }
    }

    public boolean s(Intent intent) {
        if (b.e()) {
            this.f42354g.onNewIntent(intent);
            return true;
        } else if (!f().g()) {
            return false;
        } else {
            f().c().i0(intent);
            return true;
        }
    }

    public void t() {
        if (b.e()) {
            this.f42354g.o(this.f42348a);
        } else if (f().g()) {
            f().c().j0(this.f42348a);
        }
    }

    public void u(boolean z10) {
        if (b.e()) {
            this.f42354g.onWindowFocusChange(z10);
        } else if (f().g()) {
            f().c().k0(z10);
        }
    }

    public void v() {
        e d10 = d();
        if (d10 != null) {
            if (!(d10 instanceof k0)) {
                d10.z();
            } else if (b.e()) {
                A a10 = this.f42354g;
                if (a10 != null) {
                    a10.d("ReactDelegate.reload()");
                }
            } else {
                UiThreadUtil.runOnUiThread(new C3447y(this));
            }
        }
    }

    public boolean w(int i10, KeyEvent keyEvent) {
        e d10 = d();
        if (d10 != null && !(d10 instanceof k0)) {
            if (i10 == 82) {
                d10.D();
                return true;
            } else if (((L) C3863a.c(this.f42352e)).b(i10, this.f42348a.getCurrentFocus())) {
                d10.z();
                return true;
            }
        }
        return false;
    }

    public void x() {
        if (b.e()) {
            a aVar = this.f42355h;
            if (aVar != null) {
                aVar.stop();
                this.f42355h = null;
                return;
            }
            return;
        }
        Z z10 = this.f42349b;
        if (z10 != null) {
            z10.t();
            this.f42349b = null;
        }
    }

    public C3448z(Activity activity, A a10, String str, Bundle bundle) {
        this.f42356i = b.i();
        this.f42348a = activity;
        this.f42350c = str;
        this.f42351d = bundle;
        this.f42352e = new L();
        this.f42354g = a10;
    }

    public C3448z(Activity activity, O o10, String str, Bundle bundle, boolean z10) {
        b.i();
        this.f42356i = z10;
        this.f42348a = activity;
        this.f42350c = str;
        this.f42351d = bundle;
        this.f42352e = new L();
        this.f42353f = o10;
    }
}
