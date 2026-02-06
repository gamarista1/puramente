package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.collection.C1588b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.C4536s;

public final class C extends t0 {

    /* renamed from: e  reason: collision with root package name */
    private final C1588b f53948e = new C1588b();

    /* renamed from: f  reason: collision with root package name */
    private final C4495g f53949f;

    C(C4498j jVar, C4495g gVar, a aVar) {
        super(jVar, aVar);
        this.f53949f = gVar;
        this.mLifecycleFragment.a("ConnectionlessLifecycleHelper", this);
    }

    public static void j(Activity activity, C4495g gVar, C4490b bVar) {
        C4498j fragment = LifecycleCallback.getFragment(activity);
        C c10 = (C) fragment.d("ConnectionlessLifecycleHelper", C.class);
        if (c10 == null) {
            c10 = new C(fragment, gVar, a.o());
        }
        C4536s.m(bVar, "ApiKey cannot be null");
        c10.f53948e.add(bVar);
        gVar.b(c10);
    }

    private final void k() {
        if (!this.f53948e.isEmpty()) {
            this.f53949f.b(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(ConnectionResult connectionResult, int i10) {
        this.f53949f.F(connectionResult, i10);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.f53949f.G();
    }

    /* access modifiers changed from: package-private */
    public final C1588b i() {
        return this.f53948e;
    }

    public final void onResume() {
        super.onResume();
        k();
    }

    public final void onStart() {
        super.onStart();
        k();
    }

    public final void onStop() {
        super.onStop();
        this.f53949f.c(this);
    }
}
