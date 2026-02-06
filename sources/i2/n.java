package i2;

import i2.o;
import java.util.concurrent.CopyOnWriteArraySet;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CopyOnWriteArraySet f22127a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f22128b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o.a f22129c;

    public /* synthetic */ n(CopyOnWriteArraySet copyOnWriteArraySet, int i10, o.a aVar) {
        this.f22127a = copyOnWriteArraySet;
        this.f22128b = i10;
        this.f22129c = aVar;
    }

    public final void run() {
        o.h(this.f22127a, this.f22128b, this.f22129c);
    }
}
