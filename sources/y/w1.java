package Y;

import j0.C2117b;
import java.util.ArrayList;
import java.util.Iterator;
import lf.C6527k;
import zf.C6828a;

final class w1 implements Iterator, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final C1476c1 f10188a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10189b;

    /* renamed from: c  reason: collision with root package name */
    private final V f10190c;

    /* renamed from: d  reason: collision with root package name */
    private final x1 f10191d;

    /* renamed from: e  reason: collision with root package name */
    private final int f10192e;

    /* renamed from: f  reason: collision with root package name */
    private int f10193f;

    public w1(C1476c1 c1Var, int i10, V v10, x1 x1Var) {
        this.f10188a = c1Var;
        this.f10189b = i10;
        this.f10191d = x1Var;
        this.f10192e = c1Var.H();
    }

    /* renamed from: a */
    public C2117b next() {
        Object obj;
        ArrayList b10 = this.f10190c.b();
        if (b10 != null) {
            int i10 = this.f10193f;
            this.f10193f = i10 + 1;
            obj = b10.get(i10);
        } else {
            obj = null;
        }
        if (obj instanceof C1477d) {
            return new C1479d1(this.f10188a, ((C1477d) obj).a(), this.f10192e);
        }
        if (obj instanceof V) {
            return new y1(this.f10188a, this.f10189b, (V) obj, new R0(this.f10191d, this.f10193f - 1));
        }
        C1506p.s("Unexpected group information structure");
        throw new C6527k();
    }

    public boolean hasNext() {
        ArrayList b10 = this.f10190c.b();
        if (b10 == null || this.f10193f >= b10.size()) {
            return false;
        }
        return true;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
