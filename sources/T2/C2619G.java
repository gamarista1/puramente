package t2;

import java.io.IOException;
import t2.C2621I;

/* renamed from: t2.G  reason: case insensitive filesystem */
public final /* synthetic */ class C2619G implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C2621I.a f25976a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C2621I f25977b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C2658x f25978c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C2613A f25979d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ IOException f25980e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f25981f;

    public /* synthetic */ C2619G(C2621I.a aVar, C2621I i10, C2658x xVar, C2613A a10, IOException iOException, boolean z10) {
        this.f25976a = aVar;
        this.f25977b = i10;
        this.f25978c = xVar;
        this.f25979d = a10;
        this.f25980e = iOException;
        this.f25981f = z10;
    }

    public final void run() {
        this.f25976a.l(this.f25977b, this.f25978c, this.f25979d, this.f25980e, this.f25981f);
    }
}
