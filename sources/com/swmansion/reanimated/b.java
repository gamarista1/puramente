package com.swmansion.reanimated;

import android.view.View;
import com.facebook.react.views.scroll.e;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f59616a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f59617b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f59618c;

    public /* synthetic */ b(View view, int i10, int i11) {
        this.f59616a = view;
        this.f59617b = i10;
        this.f59618c = i11;
    }

    public final void run() {
        ((e) this.f59616a).smoothScrollTo(this.f59617b, this.f59618c);
    }
}
