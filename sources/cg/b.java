package Cg;

import Bg.B;
import Bg.C5320f;
import Bg.C5327m;
import Bg.C5328n;
import Bg.C5329o;
import Bg.C5331q;
import Bg.C5335v;
import Bg.C5336w;
import Bg.C5337x;
import Eg.n;
import Ff.f;
import Gg.p;
import Lf.o;
import Of.H;
import Of.M;
import Of.S;
import Qf.c;
import Wf.c;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6493o;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import mf.C6565s;
import pg.C6645g;
import xg.C6784b;
import yf.C6798l;

public final class b implements Lf.b {

    /* renamed from: b  reason: collision with root package name */
    private final d f62634b = new d();

    /* synthetic */ class a extends C6493o implements C6798l {
        a(Object obj) {
            super(1, obj);
        }

        public final String getName() {
            return "loadResource";
        }

        public final f getOwner() {
            return O.b(d.class);
        }

        public final String getSignature() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }

        /* renamed from: i */
        public final InputStream invoke(String str) {
            C6496s.h(str, "p0");
            return ((d) this.receiver).a(str);
        }
    }

    public Of.O a(n nVar, H h10, Iterable iterable, c cVar, Qf.a aVar, boolean z10) {
        C6496s.h(nVar, "storageManager");
        C6496s.h(h10, "builtInsModule");
        C6496s.h(iterable, "classDescriptorFactories");
        C6496s.h(cVar, "platformDependentDeclarationFilter");
        C6496s.h(aVar, "additionalClassPartsProvider");
        return b(nVar, h10, o.f63927H, iterable, cVar, aVar, z10, new a(this.f62634b));
    }

    public final Of.O b(n nVar, H h10, Set set, Iterable iterable, c cVar, Qf.a aVar, boolean z10, C6798l lVar) {
        n nVar2 = nVar;
        H h11 = h10;
        Set set2 = set;
        C6798l lVar2 = lVar;
        C6496s.h(nVar2, "storageManager");
        C6496s.h(h11, "module");
        C6496s.h(set2, "packageFqNames");
        C6496s.h(iterable, "classDescriptorFactories");
        C6496s.h(cVar, "platformDependentDeclarationFilter");
        C6496s.h(aVar, "additionalClassPartsProvider");
        C6496s.h(lVar2, "loadResource");
        Iterable<ng.c> iterable2 = set2;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable2, 10));
        for (ng.c cVar2 : iterable2) {
            String r10 = a.f62633r.r(cVar2);
            InputStream inputStream = (InputStream) lVar2.invoke(r10);
            if (inputStream != null) {
                arrayList.add(c.f62635o.a(cVar2, nVar, h10, inputStream, z10));
            } else {
                throw new IllegalStateException("Resource not found in classpath: " + r10);
            }
        }
        S s10 = r2;
        S s11 = new S(arrayList);
        M m10 = r1;
        M m11 = new M(nVar2, h11);
        C5329o.a aVar2 = C5329o.a.f62566a;
        C5331q qVar = r5;
        C5331q qVar2 = new C5331q(s11);
        C5320f fVar = r7;
        S s12 = s11;
        a aVar3 = a.f62633r;
        C5320f fVar2 = new C5320f(h11, m11, aVar3);
        B.a aVar4 = B.a.f62441a;
        C5336w wVar = C5336w.f62587a;
        C5328n nVar3 = r0;
        C5336w wVar2 = wVar;
        ArrayList arrayList2 = arrayList;
        C6496s.g(wVar, "DO_NOTHING");
        c.a aVar5 = c.a.f65944a;
        ArrayList<c> arrayList3 = arrayList2;
        C5337x.a aVar6 = C5337x.a.f62588a;
        C5327m a10 = C5327m.f62542a.a();
        C6645g e10 = aVar3.e();
        C6784b bVar = r1;
        C6784b bVar2 = new C6784b(nVar2, C6565s.n());
        S s13 = s12;
        C5328n nVar4 = new C5328n(nVar, h10, aVar2, qVar, fVar, s10, aVar4, wVar2, aVar5, aVar6, iterable, m10, a10, aVar, cVar, e10, (p) null, bVar, (List) null, (C5335v) null, 851968, (DefaultConstructorMarker) null);
        for (c L02 : arrayList3) {
            L02.L0(nVar3);
        }
        return s13;
    }
}
