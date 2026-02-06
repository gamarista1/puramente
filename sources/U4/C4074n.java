package u4;

import H4.l;
import java.io.InputStream;

/* renamed from: u4.n  reason: case insensitive filesystem */
public final /* synthetic */ class C4074n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InputStream f48550a;

    public /* synthetic */ C4074n(InputStream inputStream) {
        this.f48550a = inputStream;
    }

    public final void run() {
        l.c(this.f48550a);
    }
}
