package v5;

import java.util.List;
import v5.g;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Integer f48760a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f48761b;

    public /* synthetic */ h(Integer num, List list) {
        this.f48760a = num;
        this.f48761b = list;
    }

    public final void run() {
        g.b.c(this.f48760a, this.f48761b);
    }
}
