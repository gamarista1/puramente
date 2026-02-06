package gg;

import Bg.C5327m;
import Bg.C5329o;
import Bg.C5336w;
import Eg.n;
import Fg.C5396x;
import Gg.p;
import Gg.q;
import Of.H;
import Of.M;
import Of.k0;
import Wf.c;
import Xf.A;
import Xf.C5671d;
import Xf.C5687u;
import Xf.C5688v;
import Xf.D;
import Yf.i;
import Yf.o;
import ag.d;
import ag.e;
import ag.j;
import com.amazon.a.a.n.a.a.g;
import dg.C5816b;
import fg.C5905e0;
import fg.C5908g;
import gg.C5944D;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mg.C6577e;
import ng.b;
import wg.C6770f;
import xg.C6784b;

/* renamed from: gg.l  reason: case insensitive filesystem */
public abstract class C5962l {

    /* renamed from: gg.l$a */
    public static final class a implements A {
        a() {
        }

        public List a(b bVar) {
            C6496s.h(bVar, "classId");
            return null;
        }
    }

    public static final C5961k a(H h10, n nVar, M m10, j jVar, C5972v vVar, C5964n nVar2, C5336w wVar, C6577e eVar) {
        n nVar3 = nVar;
        M m11 = m10;
        C5972v vVar2 = vVar;
        C5964n nVar4 = nVar2;
        C6577e eVar2 = eVar;
        C6496s.h(h10, "module");
        C6496s.h(nVar3, "storageManager");
        C6496s.h(m11, "notFoundClasses");
        j jVar2 = jVar;
        C6496s.h(jVar2, "lazyJavaPackageFragmentProvider");
        C6496s.h(vVar2, "reflectKotlinClassFinder");
        C6496s.h(nVar4, "deserializedDescriptorResolver");
        C5336w wVar2 = wVar;
        C6496s.h(wVar2, "errorReporter");
        C6496s.h(eVar2, "jvmMetadataVersion");
        C5965o oVar = new C5965o(vVar2, nVar4);
        C5958h a10 = C5959i.a(h10, m11, nVar3, vVar2, eVar2);
        return new C5961k(nVar3, h10, C5329o.a.f62566a, oVar, a10, jVar2, m11, wVar2, c.a.f65944a, C5327m.f62542a.a(), p.f63198b.a(), new Ig.a(C6565s.e(C5396x.f63077a)));
    }

    public static final j b(C5687u uVar, H h10, n nVar, M m10, C5972v vVar, C5964n nVar2, C5336w wVar, C5816b bVar, ag.n nVar3, C5944D d10) {
        n nVar4 = nVar;
        C6496s.h(uVar, "javaClassFinder");
        C6496s.h(h10, "module");
        C6496s.h(nVar4, "storageManager");
        C6496s.h(m10, "notFoundClasses");
        C6496s.h(vVar, "reflectKotlinClassFinder");
        C6496s.h(nVar2, "deserializedDescriptorResolver");
        C6496s.h(wVar, "errorReporter");
        C6496s.h(bVar, "javaSourceElementFactory");
        C6496s.h(nVar3, "singleModuleClassResolver");
        C6496s.h(d10, "packagePartProvider");
        o oVar = o.f66764a;
        o oVar2 = oVar;
        C6496s.g(oVar, "DO_NOTHING");
        Yf.j jVar = Yf.j.f66757a;
        Yf.j jVar2 = jVar;
        C6496s.g(jVar, g.f37322a);
        i.a aVar = i.a.f66756a;
        d dVar = r0;
        C6784b bVar2 = r14;
        C6784b bVar3 = new C6784b(nVar4, C6565s.n());
        k0.a aVar2 = k0.a.f64500a;
        c.a aVar3 = c.a.f65944a;
        C5687u uVar2 = uVar;
        Lf.n nVar5 = r2;
        Lf.n nVar6 = new Lf.n(h10, m10);
        C5671d dVar2 = r0;
        D.b bVar4 = D.f66244d;
        C5671d dVar3 = new C5671d(bVar4.a());
        C5905e0 e0Var = r0;
        e.a aVar4 = e.a.f67067a;
        e.a aVar5 = aVar4;
        C5905e0 e0Var2 = new C5905e0(new C5908g(aVar4));
        C5688v.a aVar6 = C5688v.a.f66396a;
        q a10 = p.f63198b.a();
        D a11 = bVar4.a();
        a aVar7 = r0;
        a aVar8 = new a();
        n nVar7 = nVar;
        C5687u uVar3 = uVar2;
        C5972v vVar2 = vVar;
        d dVar4 = new d(nVar7, uVar3, vVar2, nVar2, oVar2, wVar, jVar2, aVar, bVar2, bVar, nVar3, d10, aVar2, aVar3, h10, nVar5, dVar2, e0Var, aVar6, aVar5, a10, a11, aVar7, (C6770f) null, 8388608, (DefaultConstructorMarker) null);
        return new j(dVar);
    }

    public static /* synthetic */ j c(C5687u uVar, H h10, n nVar, M m10, C5972v vVar, C5964n nVar2, C5336w wVar, C5816b bVar, ag.n nVar3, C5944D d10, int i10, Object obj) {
        C5944D.a aVar;
        if ((i10 & 512) != 0) {
            aVar = C5944D.a.f67714a;
        } else {
            aVar = d10;
        }
        return b(uVar, h10, nVar, m10, vVar, nVar2, wVar, bVar, nVar3, aVar);
    }
}
