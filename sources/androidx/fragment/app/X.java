package androidx.fragment.app;

import Z1.a;
import Z1.b;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.C1788k;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1800x;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import x3.C2912d;
import x3.C2913e;
import x3.C2914f;

class X implements C1788k, C2914f, e0 {

    /* renamed from: a  reason: collision with root package name */
    private final C1769q f16866a;

    /* renamed from: b  reason: collision with root package name */
    private final d0 f16867b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f16868c;

    /* renamed from: d  reason: collision with root package name */
    private c0.c f16869d;

    /* renamed from: e  reason: collision with root package name */
    private C1800x f16870e = null;

    /* renamed from: f  reason: collision with root package name */
    private C2913e f16871f = null;

    X(C1769q qVar, d0 d0Var, Runnable runnable) {
        this.f16866a = qVar;
        this.f16867b = d0Var;
        this.f16868c = runnable;
    }

    /* access modifiers changed from: package-private */
    public void a(C1790m.a aVar) {
        this.f16870e.i(aVar);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f16870e == null) {
            this.f16870e = new C1800x(this);
            C2913e a10 = C2913e.a(this);
            this.f16871f = a10;
            a10.c();
            this.f16868c.run();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        if (this.f16870e != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void d(Bundle bundle) {
        this.f16871f.d(bundle);
    }

    /* access modifiers changed from: package-private */
    public void e(Bundle bundle) {
        this.f16871f.e(bundle);
    }

    /* access modifiers changed from: package-private */
    public void f(C1790m.b bVar) {
        this.f16870e.n(bVar);
    }

    public a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f16866a.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        b bVar = new b();
        if (application != null) {
            bVar.c(c0.a.f17204h, application);
        }
        bVar.c(T.f17166a, this.f16866a);
        bVar.c(T.f17167b, this);
        if (this.f16866a.getArguments() != null) {
            bVar.c(T.f17168c, this.f16866a.getArguments());
        }
        return bVar;
    }

    public c0.c getDefaultViewModelProviderFactory() {
        Application application;
        c0.c defaultViewModelProviderFactory = this.f16866a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f16866a.mDefaultFactory)) {
            this.f16869d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f16869d == null) {
            Context applicationContext = this.f16866a.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                } else if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            C1769q qVar = this.f16866a;
            this.f16869d = new W(application, qVar, qVar.getArguments());
        }
        return this.f16869d;
    }

    public C1790m getLifecycle() {
        b();
        return this.f16870e;
    }

    public C2912d getSavedStateRegistry() {
        b();
        return this.f16871f.b();
    }

    public d0 getViewModelStore() {
        b();
        return this.f16867b;
    }
}
