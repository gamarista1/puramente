package ka;

import ka.w;

public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w.a f46081a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f46082b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f46083c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f46084d;

    public /* synthetic */ s(w.a aVar, String str, long j10, long j11) {
        this.f46081a = aVar;
        this.f46082b = str;
        this.f46083c = j10;
        this.f46084d = j11;
    }

    public final void run() {
        this.f46081a.q(this.f46082b, this.f46083c, this.f46084d);
    }
}
