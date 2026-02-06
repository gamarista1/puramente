package M;

import java.util.function.IntConsumer;

/* renamed from: M.b  reason: case insensitive filesystem */
public final /* synthetic */ class C1261b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntConsumer f4207a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f4208b;

    public /* synthetic */ C1261b(IntConsumer intConsumer, int i10) {
        this.f4207a = intConsumer;
        this.f4208b = i10;
    }

    public final void run() {
        C1262c.c(this.f4207a, this.f4208b);
    }
}
