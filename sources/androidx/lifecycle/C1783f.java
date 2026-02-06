package androidx.lifecycle;

/* renamed from: androidx.lifecycle.f  reason: case insensitive filesystem */
public final /* synthetic */ class C1783f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1784g f17216a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f17217b;

    public /* synthetic */ C1783f(C1784g gVar, Runnable runnable) {
        this.f17216a = gVar;
        this.f17217b = runnable;
    }

    public final void run() {
        C1784g.d(this.f17216a, this.f17217b);
    }
}
