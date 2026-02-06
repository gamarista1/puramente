package t2;

import f2.H;
import f2.w;

public final class h0 extends C2656v {

    /* renamed from: f  reason: collision with root package name */
    private final w f26268f;

    public h0(H h10, w wVar) {
        super(h10);
        this.f26268f = wVar;
    }

    public H.c o(int i10, H.c cVar, long j10) {
        Object obj;
        super.o(i10, cVar, j10);
        w wVar = this.f26268f;
        cVar.f19769c = wVar;
        w.h hVar = wVar.f20157b;
        if (hVar != null) {
            obj = hVar.f20256h;
        } else {
            obj = null;
        }
        cVar.f19768b = obj;
        return cVar;
    }
}
