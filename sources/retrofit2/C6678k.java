package retrofit2;

import retrofit2.C6676i;

/* renamed from: retrofit2.k  reason: case insensitive filesystem */
public final /* synthetic */ class C6678k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6676i.b.a f72901a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C6673f f72902b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Throwable f72903c;

    public /* synthetic */ C6678k(C6676i.b.a aVar, C6673f fVar, Throwable th2) {
        this.f72901a = aVar;
        this.f72902b = fVar;
        this.f72903c = th2;
    }

    public final void run() {
        this.f72901a.c(this.f72902b, this.f72903c);
    }
}
