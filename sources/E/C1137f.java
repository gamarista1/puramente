package E;

import java.util.concurrent.CancellationException;
import w.C2799k;

/* renamed from: E.f  reason: case insensitive filesystem */
final class C1137f extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    private final int f1614a;

    /* renamed from: b  reason: collision with root package name */
    private final C2799k f1615b;

    public C1137f(int i10, C2799k kVar) {
        this.f1614a = i10;
        this.f1615b = kVar;
    }

    public final int a() {
        return this.f1614a;
    }

    public final C2799k b() {
        return this.f1615b;
    }
}
