package m3;

import Xg.C5696h;
import Xg.L;
import Xg.N;
import Xg.x;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import m3.r;
import yf.C6798l;

/* renamed from: m3.v  reason: case insensitive filesystem */
public final class C2222v {

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList f24120a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final x f24121b;

    /* renamed from: c  reason: collision with root package name */
    private final L f24122c;

    /* renamed from: m3.v$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2222v f24123a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2219s f24124b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2219s f24125c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2222v vVar, C2219s sVar, C2219s sVar2) {
            super(1);
            this.f24123a = vVar;
            this.f24124b = sVar;
            this.f24125c = sVar2;
        }

        /* renamed from: a */
        public final C2208g invoke(C2208g gVar) {
            return this.f24123a.c(gVar, this.f24124b, this.f24125c);
        }
    }

    /* renamed from: m3.v$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f24126a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2220t f24127b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f24128c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2222v f24129d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z10, C2220t tVar, r rVar, C2222v vVar) {
            super(1);
            this.f24126a = z10;
            this.f24127b = tVar;
            this.f24128c = rVar;
            this.f24129d = vVar;
        }

        /* renamed from: a */
        public final C2208g invoke(C2208g gVar) {
            C2219s sVar;
            C2219s sVar2;
            if (gVar == null || (sVar = gVar.e()) == null) {
                sVar = C2219s.f24100f.a();
            }
            if (gVar != null) {
                sVar2 = gVar.b();
            } else {
                sVar2 = null;
            }
            if (this.f24126a) {
                sVar2 = C2219s.f24100f.a().i(this.f24127b, this.f24128c);
            } else {
                sVar = sVar.i(this.f24127b, this.f24128c);
            }
            return this.f24129d.c(gVar, sVar, sVar2);
        }
    }

    public C2222v() {
        x a10 = N.a((Object) null);
        this.f24121b = a10;
        this.f24122c = C5696h.b(a10);
    }

    private final r b(r rVar, r rVar2, r rVar3, r rVar4) {
        if (rVar4 == null) {
            return rVar3;
        }
        if (!(rVar instanceof r.b) || (((rVar2 instanceof r.c) && (rVar4 instanceof r.c)) || (rVar4 instanceof r.a))) {
            return rVar4;
        }
        return rVar;
    }

    /* access modifiers changed from: private */
    public final C2208g c(C2208g gVar, C2219s sVar, C2219s sVar2) {
        r rVar;
        r rVar2;
        r rVar3;
        r rVar4;
        r rVar5;
        if (gVar == null || (rVar = gVar.d()) == null) {
            rVar = r.c.f24097b.b();
        }
        r f10 = sVar.f();
        r f11 = sVar.f();
        r rVar6 = null;
        if (sVar2 != null) {
            rVar2 = sVar2.f();
        } else {
            rVar2 = null;
        }
        r b10 = b(rVar, f10, f11, rVar2);
        if (gVar == null || (rVar3 = gVar.c()) == null) {
            rVar3 = r.c.f24097b.b();
        }
        r f12 = sVar.f();
        r e10 = sVar.e();
        if (sVar2 != null) {
            rVar4 = sVar2.e();
        } else {
            rVar4 = null;
        }
        r b11 = b(rVar3, f12, e10, rVar4);
        if (gVar == null || (rVar5 = gVar.a()) == null) {
            rVar5 = r.c.f24097b.b();
        }
        r f13 = sVar.f();
        r d10 = sVar.d();
        if (sVar2 != null) {
            rVar6 = sVar2.d();
        }
        return new C2208g(b10, b11, b(rVar5, f13, d10, rVar6), sVar, sVar2);
    }

    private final void d(C6798l lVar) {
        Object value;
        C2208g gVar;
        x xVar = this.f24121b;
        do {
            value = xVar.getValue();
            C2208g gVar2 = (C2208g) value;
            gVar = (C2208g) lVar.invoke(gVar2);
            if (C6496s.c(gVar2, gVar)) {
                return;
            }
        } while (!xVar.e(value, gVar));
        if (gVar != null) {
            for (C6798l invoke : this.f24120a) {
                invoke.invoke(gVar);
            }
        }
    }

    public final L e() {
        return this.f24122c;
    }

    public final void f(C2219s sVar, C2219s sVar2) {
        C6496s.h(sVar, "sourceLoadStates");
        d(new a(this, sVar, sVar2));
    }

    public final void g(C2220t tVar, boolean z10, r rVar) {
        C6496s.h(tVar, "type");
        C6496s.h(rVar, "state");
        d(new b(z10, tVar, rVar, this));
    }
}
