package Q3;

import java.util.concurrent.Callable;

public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f5462a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f5463b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f5464c;

    public /* synthetic */ j(k kVar, int i10, int i11) {
        this.f5462a = kVar;
        this.f5463b = i10;
        this.f5464c = i11;
    }

    public final Object call() {
        return k.f(this.f5462a, this.f5463b, this.f5464c);
    }
}
