package G;

import E.C1139h;
import java.util.List;
import lf.C6514M;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import x.C2848L;
import yf.p;
import z.v;
import z.y;

public abstract class q {

    public static final class a implements C1139h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C f2357a;

        a(C c10) {
            this.f2357a = c10;
        }

        private final int h() {
            return this.f2357a.G() + this.f2357a.I();
        }

        public int a() {
            return this.f2357a.F();
        }

        public int b() {
            return ((f) C6565s.z0(this.f2357a.C().k())).getIndex();
        }

        public float c(int i10) {
            Object obj;
            List k10 = this.f2357a.C().k();
            int size = k10.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    obj = null;
                    break;
                }
                obj = k10.get(i11);
                if (((f) obj).getIndex() == i10) {
                    break;
                }
                i11++;
            }
            f fVar = (f) obj;
            if (fVar == null) {
                return (((float) (i10 - this.f2357a.v())) * ((float) h())) - (this.f2357a.w() * ((float) this.f2357a.H()));
            }
            return (float) fVar.a();
        }

        public void d(v vVar, int i10, int i11) {
            this.f2357a.i0(i10, ((float) i11) / ((float) this.f2357a.H()), true);
        }

        public Object e(p pVar, C6658d dVar) {
            Object a10 = y.a(this.f2357a, (C2848L) null, pVar, dVar, 1, (Object) null);
            if (a10 == C6680b.f()) {
                return a10;
            }
            return C6514M.f71813a;
        }

        public int f() {
            return this.f2357a.z();
        }

        public int g() {
            return this.f2357a.y();
        }
    }

    public static final C1139h a(C c10) {
        return new a(c10);
    }
}
