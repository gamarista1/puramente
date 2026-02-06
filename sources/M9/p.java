package m9;

import m9.r;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r.a f46676a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f46677b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f46678c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f46679d;

    public /* synthetic */ p(r.a aVar, int i10, long j10, long j11) {
        this.f46676a = aVar;
        this.f46677b = i10;
        this.f46678c = j10;
        this.f46679d = j11;
    }

    public final void run() {
        this.f46676a.A(this.f46677b, this.f46678c, this.f46679d);
    }
}
