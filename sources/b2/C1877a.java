package b2;

import Ug.K;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C6496s;
import qf.g;

/* renamed from: b2.a  reason: case insensitive filesystem */
public final class C1877a implements AutoCloseable, K {

    /* renamed from: a  reason: collision with root package name */
    private final g f19158a;

    public C1877a(g gVar) {
        C6496s.h(gVar, "coroutineContext");
        this.f19158a = gVar;
    }

    public void close() {
        C0.f(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }

    public g getCoroutineContext() {
        return this.f19158a;
    }
}
