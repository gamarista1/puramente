package J0;

import J0.G;
import J0.S;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public final class N {

    /* renamed from: a  reason: collision with root package name */
    private final G f3701a;

    /* renamed from: b  reason: collision with root package name */
    private final C1249o f3702b;

    /* renamed from: c  reason: collision with root package name */
    private final List f3703c;

    public N(G g10, C1249o oVar, List list) {
        this.f3701a = g10;
        this.f3702b = oVar;
        this.f3703c = list;
    }

    private final boolean b(G g10) {
        G.e eVar;
        Object obj;
        G n02 = g10.n0();
        Object obj2 = null;
        if (n02 != null) {
            eVar = n02.W();
        } else {
            eVar = null;
        }
        if (g10.e() || !(g10.o0() == Integer.MAX_VALUE || n02 == null || !n02.e())) {
            if (g10.d0()) {
                List list = this.f3703c;
                int size = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i10);
                    S.a aVar = (S.a) obj;
                    if (C6496s.c(aVar.a(), g10) && !aVar.c()) {
                        break;
                    }
                    i10++;
                }
                if (obj != null) {
                    return true;
                }
            }
            if (g10.d0()) {
                if (this.f3702b.d(g10) || g10.W() == G.e.LookaheadMeasuring || ((n02 != null && n02.d0()) || ((n02 != null && n02.Y()) || eVar == G.e.Measuring))) {
                    return true;
                }
                return false;
            } else if (g10.V()) {
                if (this.f3702b.d(g10) || n02 == null || n02.d0() || n02.V() || eVar == G.e.Measuring || eVar == G.e.LayingOut) {
                    return true;
                }
                return false;
            }
        }
        if (C6496s.c(g10.M0(), Boolean.TRUE)) {
            if (g10.Y()) {
                List list2 = this.f3703c;
                int size2 = list2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    Object obj3 = list2.get(i11);
                    S.a aVar2 = (S.a) obj3;
                    if (C6496s.c(aVar2.a(), g10) && aVar2.c()) {
                        obj2 = obj3;
                        break;
                    }
                    i11++;
                }
                if (obj2 != null) {
                    return true;
                }
            }
            if (g10.Y()) {
                if (this.f3702b.e(g10, true) || ((n02 != null && n02.Y()) || eVar == G.e.LookaheadMeasuring || (n02 != null && n02.d0() && C6496s.c(g10.a0(), g10)))) {
                    return true;
                }
                return false;
            } else if (g10.X()) {
                if (this.f3702b.e(g10, true) || n02 == null || n02.Y() || n02.X() || eVar == G.e.LookaheadMeasuring || eVar == G.e.LookaheadLayingOut || (n02.V() && C6496s.c(g10.a0(), g10))) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    private final boolean c(G g10) {
        if (!b(g10)) {
            return false;
        }
        List H10 = g10.H();
        int size = H10.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!c((G) H10.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tree state:");
        C6496s.g(sb2, "append(value)");
        sb2.append(10);
        C6496s.g(sb2, "append('\\n')");
        e(this, sb2, this.f3701a, 0);
        return sb2.toString();
    }

    private static final void e(N n10, StringBuilder sb2, G g10, int i10) {
        String f10 = n10.f(g10);
        if (f10.length() > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("..");
            }
            sb2.append(f10);
            C6496s.g(sb2, "append(value)");
            sb2.append(10);
            C6496s.g(sb2, "append('\\n')");
            i10++;
        }
        List H10 = g10.H();
        int size = H10.size();
        for (int i12 = 0; i12 < size; i12++) {
            e(n10, sb2, (G) H10.get(i12), i10);
        }
    }

    private final String f(G g10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g10);
        StringBuilder sb3 = new StringBuilder();
        sb3.append('[');
        sb3.append(g10.W());
        sb3.append(']');
        sb2.append(sb3.toString());
        if (!g10.e()) {
            sb2.append("[!isPlaced]");
        }
        sb2.append("[measuredByParent=" + g10.f0() + ']');
        if (!b(g10)) {
            sb2.append("[INCONSISTENT]");
        }
        return sb2.toString();
    }

    public final void a() {
        if (!c(this.f3701a)) {
            System.out.println(d());
            throw new IllegalStateException("Inconsistency found!");
        }
    }
}
