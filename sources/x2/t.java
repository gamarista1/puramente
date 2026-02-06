package x2;

import x2.C2900D;

public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C2900D.a f28394a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f28395b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f28396c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f28397d;

    public /* synthetic */ t(C2900D.a aVar, String str, long j10, long j11) {
        this.f28394a = aVar;
        this.f28395b = str;
        this.f28396c = j10;
        this.f28397d = j11;
    }

    public final void run() {
        this.f28394a.q(this.f28395b, this.f28396c, this.f28397d);
    }
}
