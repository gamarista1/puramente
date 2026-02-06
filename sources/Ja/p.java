package ja;

import ja.r;
import java.util.concurrent.CopyOnWriteArraySet;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CopyOnWriteArraySet f45037a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f45038b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r.a f45039c;

    public /* synthetic */ p(CopyOnWriteArraySet copyOnWriteArraySet, int i10, r.a aVar) {
        this.f45037a = copyOnWriteArraySet;
        this.f45038b = i10;
        this.f45039c = aVar;
    }

    public final void run() {
        r.h(this.f45037a, this.f45038b, this.f45039c);
    }
}
