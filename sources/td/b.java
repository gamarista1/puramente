package Td;

import Gh.C5405f;
import Gh.H;
import kotlin.jvm.internal.C6496s;
import rh.D;
import rh.y;

public final class b extends D {

    /* renamed from: a  reason: collision with root package name */
    private final D f52597a;

    /* renamed from: b  reason: collision with root package name */
    private final c f52598b;

    public b(D d10, c cVar) {
        C6496s.h(d10, "requestBody");
        C6496s.h(cVar, "progressListener");
        this.f52597a = d10;
        this.f52598b = cVar;
    }

    public long contentLength() {
        return this.f52597a.contentLength();
    }

    public y contentType() {
        return this.f52597a.contentType();
    }

    public void writeTo(C5405f fVar) {
        C6496s.h(fVar, "sink");
        C5405f c10 = H.c(new d(fVar, this, this.f52598b));
        this.f52597a.writeTo(c10);
        c10.flush();
    }
}
