package ag;

import Lf.o;
import Pf.c;
import Pf.h;
import Rg.k;
import Yf.d;
import eg.C5824a;
import eg.C5827d;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

public final class g implements h {

    /* renamed from: a  reason: collision with root package name */
    private final k f67069a;

    /* renamed from: b  reason: collision with root package name */
    private final C5827d f67070b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f67071c;

    /* renamed from: d  reason: collision with root package name */
    private final Eg.h f67072d;

    public g(k kVar, C5827d dVar, boolean z10) {
        C6496s.h(kVar, "c");
        C6496s.h(dVar, "annotationOwner");
        this.f67069a = kVar;
        this.f67070b = dVar;
        this.f67071c = z10;
        this.f67072d = kVar.a().u().c(new f(this));
    }

    /* access modifiers changed from: private */
    public static final c b(g gVar, C5824a aVar) {
        C6496s.h(aVar, "annotation");
        return d.f66744a.e(aVar, gVar.f67069a, gVar.f67071c);
    }

    public c i(ng.c cVar) {
        c cVar2;
        C6496s.h(cVar, "fqName");
        C5824a i10 = this.f67070b.i(cVar);
        if (i10 == null || (cVar2 = (c) this.f67072d.invoke(i10)) == null) {
            return d.f66744a.a(cVar, this.f67070b, this.f67069a);
        }
        return cVar2;
    }

    public boolean isEmpty() {
        if (!this.f67070b.getAnnotations().isEmpty() || this.f67070b.E()) {
            return false;
        }
        return true;
    }

    public Iterator iterator() {
        return k.q(k.C(k.x(C6565s.b0(this.f67070b.getAnnotations()), this.f67072d), d.f66744a.a(o.a.f64043y, this.f67070b, this.f67069a))).iterator();
    }

    public boolean n0(ng.c cVar) {
        return h.b.b(this, cVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(k kVar, C5827d dVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, dVar, (i10 & 4) != 0 ? false : z10);
    }
}
