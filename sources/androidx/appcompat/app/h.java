package androidx.appcompat.app;

import androidx.appcompat.app.g;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g.c f10995a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f10996b;

    public /* synthetic */ h(g.c cVar, Runnable runnable) {
        this.f10995a = cVar;
        this.f10996b = runnable;
    }

    public final void run() {
        this.f10995a.b(this.f10996b);
    }
}
