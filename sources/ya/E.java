package ya;

import java.util.concurrent.Callable;

final class E extends G {

    /* renamed from: f  reason: collision with root package name */
    private final Callable f62262f;

    /* synthetic */ E(Callable callable, D d10) {
        super(false, 1, 5, (String) null, (Throwable) null, (F) null);
        this.f62262f = callable;
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        try {
            return (String) this.f62262f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
