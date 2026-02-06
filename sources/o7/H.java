package o7;

import java.util.concurrent.Callable;

public final /* synthetic */ class H implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ I f47108a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f47109b;

    public /* synthetic */ H(I i10, Callable callable) {
        this.f47108a = i10;
        this.f47109b = callable;
    }

    public final Object call() {
        return I.b(this.f47108a, this.f47109b);
    }
}
