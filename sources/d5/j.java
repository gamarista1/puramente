package D5;

import D5.u;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f30419a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u.b f30420b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Runnable f30421c;

    public /* synthetic */ j(l lVar, u.b bVar, Runnable runnable) {
        this.f30419a = lVar;
        this.f30420b = bVar;
        this.f30421c = runnable;
    }

    public final void run() {
        l.r(this.f30419a, this.f30420b, this.f30421c);
    }
}
