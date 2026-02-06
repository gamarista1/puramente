package Nf;

import Bg.B;
import Bg.C5317c;
import Bg.C5320f;
import Bg.C5327m;
import Bg.C5328n;
import Bg.C5329o;
import Bg.C5331q;
import Bg.C5336w;
import Bg.C5337x;
import Bg.C5339z;
import Bg.r;
import Eg.n;
import Gg.p;
import Of.H;
import Of.M;
import Qf.c;
import Wf.c;
import gg.C5972v;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import xg.C6783a;
import yf.C6798l;

public final class w extends C5317c {

    /* renamed from: f  reason: collision with root package name */
    public static final a f64336f = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(n nVar, C5972v vVar, H h10, M m10, Qf.a aVar, c cVar, C5329o oVar, p pVar, C6783a aVar2) {
        super(nVar, vVar, h10);
        n nVar2 = nVar;
        H h11 = h10;
        M m11 = m10;
        C6496s.h(nVar2, "storageManager");
        C6496s.h(vVar, "finder");
        C6496s.h(h11, "moduleDescriptor");
        C6496s.h(m11, "notFoundClasses");
        C6496s.h(aVar, "additionalClassPartsProvider");
        C6496s.h(cVar, "platformDependentDeclarationFilter");
        C6496s.h(oVar, "deserializationConfiguration");
        C6496s.h(pVar, "kotlinTypeChecker");
        C6496s.h(aVar2, "samConversionResolver");
        C5331q qVar = r5;
        C5331q qVar2 = new C5331q(this);
        C5320f fVar = r8;
        Cg.a aVar3 = Cg.a.f62633r;
        C5320f fVar2 = new C5320f(h11, m11, aVar3);
        B.a aVar4 = B.a.f62441a;
        C5336w wVar = C5336w.f62587a;
        C6496s.g(wVar, "DO_NOTHING");
        C5328n nVar3 = r0;
        n nVar4 = nVar;
        C5328n nVar5 = new C5328n(nVar4, h10, oVar, qVar, fVar, this, aVar4, wVar, c.a.f65944a, C5337x.a.f62588a, C6565s.q(new Mf.a(nVar2, h10), new g(nVar, h10, (C6798l) null, 4, (DefaultConstructorMarker) null)), m10, C5327m.f62542a.a(), aVar, cVar, aVar3.e(), pVar, aVar2, (List) null, C5339z.f62595a, 262144, (DefaultConstructorMarker) null);
        k(nVar3);
    }

    /* access modifiers changed from: protected */
    public r e(ng.c cVar) {
        C6496s.h(cVar, "fqName");
        InputStream c10 = h().c(cVar);
        if (c10 == null) {
            return null;
        }
        return Cg.c.f62635o.a(cVar, j(), i(), c10, false);
    }
}
