package Xg;

import Ug.K;
import Wg.a;
import Wg.r;
import Wg.t;
import Yg.e;
import Yg.x;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import qf.C6658d;
import qf.g;
import qf.h;
import rf.C6680b;

/* renamed from: Xg.c  reason: case insensitive filesystem */
final class C5691c extends e {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f66498f = AtomicIntegerFieldUpdater.newUpdater(C5691c.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: d  reason: collision with root package name */
    private final t f66499d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f66500e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5691c(t tVar, boolean z10, g gVar, int i10, a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(tVar, z10, (i11 & 4) != 0 ? h.f72645a : gVar, (i11 & 8) != 0 ? -3 : i10, (i11 & 16) != 0 ? a.SUSPEND : aVar);
    }

    private final void p() {
        if (this.f66500e && f66498f.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    public Object collect(C5695g gVar, C6658d dVar) {
        if (this.f66784b == -3) {
            p();
            Object a10 = C5698j.d(gVar, this.f66499d, this.f66500e, dVar);
            if (a10 == C6680b.f()) {
                return a10;
            }
            return C6514M.f71813a;
        }
        Object collect = super.collect(gVar, dVar);
        if (collect == C6680b.f()) {
            return collect;
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: protected */
    public String f() {
        return "channel=" + this.f66499d;
    }

    /* access modifiers changed from: protected */
    public Object i(r rVar, C6658d dVar) {
        Object a10 = C5698j.d(new x(rVar), this.f66499d, this.f66500e, dVar);
        if (a10 == C6680b.f()) {
            return a10;
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: protected */
    public e j(g gVar, int i10, a aVar) {
        return new C5691c(this.f66499d, this.f66500e, gVar, i10, aVar);
    }

    public C5694f k() {
        return new C5691c(this.f66499d, this.f66500e, (g) null, 0, (a) null, 28, (DefaultConstructorMarker) null);
    }

    public t n(K k10) {
        p();
        if (this.f66784b == -3) {
            return this.f66499d;
        }
        return super.n(k10);
    }

    public C5691c(t tVar, boolean z10, g gVar, int i10, a aVar) {
        super(gVar, i10, aVar);
        this.f66499d = tVar;
        this.f66500e = z10;
        this.consumed$volatile = 0;
    }
}
