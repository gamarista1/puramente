package q8;

import X6.C3096t;
import X6.x;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;

/* renamed from: q8.b  reason: case insensitive filesystem */
public final class C3960b {

    /* renamed from: a  reason: collision with root package name */
    public static final C3960b f47782a = new C3960b();

    /* renamed from: q8.b$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final C3959a f47783a;

        /* renamed from: b  reason: collision with root package name */
        public final C3959a f47784b;

        public a(C3959a aVar, C3959a aVar2) {
            this.f47783a = aVar;
            this.f47784b = aVar2;
        }
    }

    private C3960b() {
    }

    public static final a a(int i10, int i11, List list) {
        C6496s.h(list, "sources");
        return b(i10, i11, list, 1.0d);
    }

    public static final a b(int i10, int i11, List list, double d10) {
        C6496s.h(list, "sources");
        C3959a aVar = null;
        if (list.isEmpty()) {
            return new a((C3959a) null, (C3959a) null);
        }
        if (list.size() == 1) {
            return new a((C3959a) list.get(0), (C3959a) null);
        }
        if (i10 <= 0 || i11 <= 0) {
            return new a((C3959a) null, (C3959a) null);
        }
        C3096t j10 = x.l().j();
        C6496s.g(j10, "getImagePipeline(...)");
        double d11 = ((double) (i10 * i11)) * d10;
        Iterator it = list.iterator();
        double d12 = Double.MAX_VALUE;
        double d13 = Double.MAX_VALUE;
        C3959a aVar2 = null;
        C3959a aVar3 = null;
        while (it.hasNext()) {
            C3959a aVar4 = (C3959a) it.next();
            double abs = Math.abs(1.0d - (aVar4.d() / d11));
            if (abs < d12) {
                aVar3 = aVar4;
                d12 = abs;
            }
            if (abs < d13 && aVar4.c() != X7.a.RELOAD) {
                if (j10.t(aVar4.f()) || j10.v(aVar4.f())) {
                    aVar2 = aVar4;
                    d13 = abs;
                }
            }
        }
        if (aVar2 == null || aVar3 == null || !C6496s.c(aVar2.e(), aVar3.e())) {
            aVar = aVar2;
        }
        return new a(aVar3, aVar);
    }
}
