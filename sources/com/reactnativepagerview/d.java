package com.reactnativepagerview;

import androidx.viewpager2.widget.f;
import com.facebook.react.uimanager.C3415h0;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f59443a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C3415h0 f59444b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f59445c;

    public /* synthetic */ d(f fVar, C3415h0 h0Var, b bVar) {
        this.f59443a = fVar;
        this.f59444b = h0Var;
        this.f59445c = bVar;
    }

    public final void run() {
        PagerViewViewManager.createViewInstance$lambda$0(this.f59443a, this.f59444b, this.f59445c);
    }
}
