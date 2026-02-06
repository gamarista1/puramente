package androidx.work;

/* renamed from: androidx.work.f  reason: case insensitive filesystem */
public final /* synthetic */ class C1839f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f18735a;

    public /* synthetic */ C1839f(CoroutineWorker coroutineWorker) {
        this.f18735a = coroutineWorker;
    }

    public final void run() {
        CoroutineWorker.b(this.f18735a);
    }
}
