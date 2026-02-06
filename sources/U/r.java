package U;

import Y.C1500m;
import r0.C2544x0;
import r0.C2550z0;

public interface r {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6294a = a.f6295a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f6295a = new a();

        private a() {
        }

        public final g a(long j10, boolean z10) {
            if (!z10) {
                return s.f6299d;
            }
            if (((double) C2550z0.j(j10)) > 0.5d) {
                return s.f6297b;
            }
            return s.f6298c;
        }

        public final long b(long j10, boolean z10) {
            float j11 = C2550z0.j(j10);
            if (z10 || ((double) j11) >= 0.5d) {
                return j10;
            }
            return C2544x0.f25560b.i();
        }
    }

    g a(C1500m mVar, int i10);

    long b(C1500m mVar, int i10);
}
