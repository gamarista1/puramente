package m9;

import m9.r;

/* renamed from: m9.i  reason: case insensitive filesystem */
public final /* synthetic */ class C3851i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r.a f46659a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f46660b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f46661c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f46662d;

    public /* synthetic */ C3851i(r.a aVar, String str, long j10, long j11) {
        this.f46659a = aVar;
        this.f46660b = str;
        this.f46661c = j10;
        this.f46662d = j11;
    }

    public final void run() {
        this.f46659a.t(this.f46660b, this.f46661c, this.f46662d);
    }
}
