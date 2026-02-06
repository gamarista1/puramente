package N9;

import N9.A;
import java.io.IOException;

/* renamed from: N9.v  reason: case insensitive filesystem */
public final /* synthetic */ class C3072v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ A.a f33294a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ A f33295b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C3065n f33296c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C3068q f33297d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ IOException f33298e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f33299f;

    public /* synthetic */ C3072v(A.a aVar, A a10, C3065n nVar, C3068q qVar, IOException iOException, boolean z10) {
        this.f33294a = aVar;
        this.f33295b = a10;
        this.f33296c = nVar;
        this.f33297d = qVar;
        this.f33298e = iOException;
        this.f33299f = z10;
    }

    public final void run() {
        this.f33294a.n(this.f33295b, this.f33296c, this.f33297d, this.f33298e, this.f33299f);
    }
}
