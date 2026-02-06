package P;

import O0.u;
import b1.i;
import c1.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2421g;
import q0.C2422h;
import yf.p;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    private static final float f4971a;

    /* renamed from: b  reason: collision with root package name */
    private static final float f4972b;

    /* renamed from: c  reason: collision with root package name */
    private static final u f4973c = new u("SelectionHandleInfo", (p) null, 2, (DefaultConstructorMarker) null);

    static {
        float f10 = (float) 25;
        f4971a = h.j(f10);
        f4972b = h.j(f10);
    }

    public static final long a(long j10) {
        return C2422h.a(C2421g.m(j10), C2421g.n(j10) - 1.0f);
    }

    public static final float b() {
        return f4972b;
    }

    public static final float c() {
        return f4971a;
    }

    public static final u d() {
        return f4973c;
    }

    public static final boolean e(i iVar, boolean z10) {
        if ((iVar != i.Ltr || z10) && (iVar != i.Rtl || !z10)) {
            return false;
        }
        return true;
    }

    public static final boolean f(boolean z10, i iVar, boolean z11) {
        if (z10) {
            return e(iVar, z11);
        }
        if (!e(iVar, z11)) {
            return true;
        }
        return false;
    }
}
