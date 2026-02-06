package Ac;

import android.view.View;
import android.view.ViewTreeObserver;

public final /* synthetic */ class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f50232a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f50233b;

    public /* synthetic */ d(e eVar, View view) {
        this.f50232a = eVar;
        this.f50233b = view;
    }

    public final void onGlobalLayout() {
        this.f50232a.d(this.f50233b);
    }
}
