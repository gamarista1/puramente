package Z3;

import android.graphics.ColorSpace;
import h4.C3568c;
import j4.C3622i;
import kotlin.jvm.internal.C6496s;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    private static final p f10497a = new a();

    public static final class a implements p {
        a() {
        }

        public int c(Object obj) {
            int i10;
            int i11;
            int i12;
            int i13 = 0;
            if (obj instanceof C3622i) {
                C3622i iVar = (C3622i) obj;
                int hashCode = ((iVar.l().hashCode() * 31) + iVar.m().hashCode()) * 31;
                C3568c.b G10 = iVar.G();
                if (G10 != null) {
                    i10 = G10.hashCode();
                } else {
                    i10 = 0;
                }
                int i14 = (hashCode + i10) * 31;
                C3568c.b B10 = iVar.B();
                if (B10 != null) {
                    i11 = B10.hashCode();
                } else {
                    i11 = 0;
                }
                int i15 = (i14 + i11) * 31;
                String r10 = iVar.r();
                if (r10 != null) {
                    i12 = r10.hashCode();
                } else {
                    i12 = 0;
                }
                int hashCode2 = (((i15 + i12) * 31) + iVar.j().hashCode()) * 31;
                ColorSpace k10 = iVar.k();
                if (k10 != null) {
                    i13 = k10.hashCode();
                }
                return ((((((((((((((((((((((((((hashCode2 + i13) * 31) + iVar.O().hashCode()) * 31) + iVar.x().hashCode()) * 31) + Boolean.hashCode(iVar.g())) * 31) + Boolean.hashCode(iVar.h())) * 31) + Boolean.hashCode(iVar.i())) * 31) + Boolean.hashCode(iVar.I())) * 31) + iVar.C().hashCode()) * 31) + iVar.s().hashCode()) * 31) + iVar.D().hashCode()) * 31) + iVar.K().hashCode()) * 31) + iVar.J().hashCode()) * 31) + iVar.H().hashCode()) * 31) + iVar.E().hashCode();
            } else if (obj != null) {
                return obj.hashCode();
            } else {
                return 0;
            }
        }

        public boolean d(Object obj, Object obj2) {
            if (obj == obj2) {
                return true;
            }
            if (!(obj instanceof C3622i) || !(obj2 instanceof C3622i)) {
                return C6496s.c(obj, obj2);
            }
            C3622i iVar = (C3622i) obj;
            C3622i iVar2 = (C3622i) obj2;
            if (!C6496s.c(iVar.l(), iVar2.l()) || !C6496s.c(iVar.m(), iVar2.m()) || !C6496s.c(iVar.G(), iVar2.G()) || !C6496s.c(iVar.B(), iVar2.B()) || !C6496s.c(iVar.r(), iVar2.r()) || iVar.j() != iVar2.j() || !C6496s.c(iVar.k(), iVar2.k()) || !C6496s.c(iVar.O(), iVar2.O()) || !C6496s.c(iVar.x(), iVar2.x()) || iVar.g() != iVar2.g() || iVar.h() != iVar2.h() || iVar.i() != iVar2.i() || iVar.I() != iVar2.I() || iVar.C() != iVar2.C() || iVar.s() != iVar2.s() || iVar.D() != iVar2.D() || !C6496s.c(iVar.K(), iVar2.K()) || iVar.J() != iVar2.J() || iVar.H() != iVar2.H() || !C6496s.c(iVar.E(), iVar2.E())) {
                return false;
            }
            return true;
        }
    }

    public static final p a() {
        return f10497a;
    }
}
