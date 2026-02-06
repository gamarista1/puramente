package Yg;

import Wg.a;
import Xg.C5694f;
import Xg.C5695g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import qf.C6658d;
import qf.g;
import rf.C6680b;

public final class h extends g {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(C5694f fVar, g gVar, int i10, a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i11 & 2) != 0 ? qf.h.f72645a : gVar, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? a.SUSPEND : aVar);
    }

    /* access modifiers changed from: protected */
    public e j(g gVar, int i10, a aVar) {
        return new h(this.f66793d, gVar, i10, aVar);
    }

    public C5694f k() {
        return this.f66793d;
    }

    /* access modifiers changed from: protected */
    public Object r(C5695g gVar, C6658d dVar) {
        Object collect = this.f66793d.collect(gVar, dVar);
        if (collect == C6680b.f()) {
            return collect;
        }
        return C6514M.f71813a;
    }

    public h(C5694f fVar, g gVar, int i10, a aVar) {
        super(fVar, gVar, i10, aVar);
    }
}
