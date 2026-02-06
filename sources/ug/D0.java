package Ug;

import Zg.r;
import kotlin.jvm.internal.C6496s;

public abstract class D0 extends r implements C5592s0, C5559b0, C5589q0 {

    /* renamed from: d  reason: collision with root package name */
    public E0 f65281d;

    public boolean a() {
        return true;
    }

    public J0 d() {
        return null;
    }

    public void dispose() {
        v().O0(this);
    }

    public String toString() {
        return O.a(this) + '@' + O.b(this) + "[job@" + O.b(v()) + ']';
    }

    public final E0 v() {
        E0 e02 = this.f65281d;
        if (e02 != null) {
            return e02;
        }
        C6496s.v("job");
        return null;
    }

    public final void w(E0 e02) {
        this.f65281d = e02;
    }
}
