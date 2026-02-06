package androidx.constraintlayout.motion.widget;

import android.view.View;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f14781a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View[] f14782b;

    public /* synthetic */ q(r rVar, View[] viewArr) {
        this.f14781a = rVar;
        this.f14782b = viewArr;
    }

    public final void run() {
        this.f14781a.j(this.f14782b);
    }
}
