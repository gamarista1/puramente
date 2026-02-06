package com.swmansion.reanimated;

import android.view.View;
import com.facebook.react.views.scroll.f;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f59619a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f59620b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f59621c;

    public /* synthetic */ c(View view, int i10, int i11) {
        this.f59619a = view;
        this.f59620b = i10;
        this.f59621c = i11;
    }

    public final void run() {
        ((f) this.f59619a).smoothScrollTo(this.f59620b, this.f59621c);
    }
}
