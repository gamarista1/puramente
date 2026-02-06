package Yf;

import Lf.o;
import Pf.c;
import Xf.I;
import ag.k;
import bg.C5769j;
import eg.C5824a;
import eg.C5827d;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.O;
import ng.b;
import ng.f;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f66744a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final f f66745b;

    /* renamed from: c  reason: collision with root package name */
    private static final f f66746c;

    /* renamed from: d  reason: collision with root package name */
    private static final f f66747d;

    /* renamed from: e  reason: collision with root package name */
    private static final Map f66748e = O.l(C6502A.a(o.a.f63968H, I.f66265d), C6502A.a(o.a.f63976L, I.f66267f), C6502A.a(o.a.f63984P, I.f66270i));

    static {
        f i10 = f.i(MetricTracker.Object.MESSAGE);
        C6496s.g(i10, "identifier(...)");
        f66745b = i10;
        f i11 = f.i("allowedTargets");
        C6496s.g(i11, "identifier(...)");
        f66746c = i11;
        f i12 = f.i("value");
        C6496s.g(i12, "identifier(...)");
        f66747d = i12;
    }

    private d() {
    }

    public static /* synthetic */ c f(d dVar, C5824a aVar, k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return dVar.e(aVar, kVar, z10);
    }

    public final c a(ng.c cVar, C5827d dVar, k kVar) {
        C5824a i10;
        C6496s.h(cVar, "kotlinName");
        C6496s.h(dVar, "annotationOwner");
        C6496s.h(kVar, "c");
        if (C6496s.c(cVar, o.a.f64043y)) {
            ng.c cVar2 = I.f66269h;
            C6496s.g(cVar2, "DEPRECATED_ANNOTATION");
            C5824a i11 = dVar.i(cVar2);
            if (i11 != null || dVar.E()) {
                return new h(i11, kVar);
            }
        }
        ng.c cVar3 = (ng.c) f66748e.get(cVar);
        if (cVar3 == null || (i10 = dVar.i(cVar3)) == null) {
            return null;
        }
        return f(f66744a, i10, kVar, false, 4, (Object) null);
    }

    public final f b() {
        return f66745b;
    }

    public final f c() {
        return f66747d;
    }

    public final f d() {
        return f66746c;
    }

    public final c e(C5824a aVar, k kVar, boolean z10) {
        C6496s.h(aVar, "annotation");
        C6496s.h(kVar, "c");
        b d10 = aVar.d();
        b.a aVar2 = b.f72283d;
        ng.c cVar = I.f66265d;
        C6496s.g(cVar, "TARGET_ANNOTATION");
        if (C6496s.c(d10, aVar2.c(cVar))) {
            return new n(aVar, kVar);
        }
        ng.c cVar2 = I.f66267f;
        C6496s.g(cVar2, "RETENTION_ANNOTATION");
        if (C6496s.c(d10, aVar2.c(cVar2))) {
            return new l(aVar, kVar);
        }
        ng.c cVar3 = I.f66270i;
        C6496s.g(cVar3, "DOCUMENTED_ANNOTATION");
        if (C6496s.c(d10, aVar2.c(cVar3))) {
            return new c(kVar, aVar, o.a.f63984P);
        }
        ng.c cVar4 = I.f66269h;
        C6496s.g(cVar4, "DEPRECATED_ANNOTATION");
        if (C6496s.c(d10, aVar2.c(cVar4))) {
            return null;
        }
        return new C5769j(kVar, aVar, z10);
    }
}
