package C7;

import kotlin.jvm.internal.C6496s;
import n7.C3863a;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private Thread f30101a;

    public final void a() {
        Thread currentThread = Thread.currentThread();
        if (this.f30101a == null) {
            this.f30101a = currentThread;
        }
        C3863a.a(C6496s.c(this.f30101a, currentThread));
    }
}
