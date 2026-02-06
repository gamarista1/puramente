package G;

import E.C1135d;
import E.C1146o;
import E.J;
import yf.C6798l;
import yf.r;

final class p extends C1146o {

    /* renamed from: a  reason: collision with root package name */
    private final r f2353a;

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f2354b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2355c;

    /* renamed from: d  reason: collision with root package name */
    private final C1135d f2356d;

    public p(r rVar, C6798l lVar, int i10) {
        this.f2353a = rVar;
        this.f2354b = lVar;
        this.f2355c = i10;
        J j10 = new J();
        j10.b(i10, new l(lVar, rVar));
        this.f2356d = j10;
    }

    public C1135d g() {
        return this.f2356d;
    }
}
