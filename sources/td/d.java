package Td;

import Gh.C5404e;
import Gh.C5413n;
import Gh.U;
import kotlin.jvm.internal.C6496s;
import rh.D;

final class d extends C5413n {

    /* renamed from: b  reason: collision with root package name */
    private final D f52599b;

    /* renamed from: c  reason: collision with root package name */
    private final c f52600c;

    /* renamed from: d  reason: collision with root package name */
    private long f52601d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(U u10, D d10, c cVar) {
        super(u10);
        C6496s.h(u10, "sink");
        C6496s.h(d10, "requestBody");
        C6496s.h(cVar, "progressListener");
        this.f52599b = d10;
        this.f52600c = cVar;
    }

    public void P(C5404e eVar, long j10) {
        C6496s.h(eVar, "source");
        super.P(eVar, j10);
        long j11 = this.f52601d + j10;
        this.f52601d = j11;
        this.f52600c.a(j11, this.f52599b.contentLength());
    }
}
