package Y;

import j0.C2117b;
import java.util.Iterator;
import zf.C6828a;

final class y1 implements C2117b, Iterable, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final C1476c1 f10205a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10206b;

    /* renamed from: c  reason: collision with root package name */
    private final V f10207c;

    /* renamed from: d  reason: collision with root package name */
    private final x1 f10208d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f10209e;

    /* renamed from: f  reason: collision with root package name */
    private final Iterable f10210f = this;

    public y1(C1476c1 c1Var, int i10, V v10, x1 x1Var) {
        this.f10205a = c1Var;
        this.f10206b = i10;
        this.f10208d = x1Var;
        this.f10209e = Integer.valueOf(v10.c());
    }

    public Iterator iterator() {
        return new w1(this.f10205a, this.f10206b, this.f10207c, this.f10208d);
    }
}
