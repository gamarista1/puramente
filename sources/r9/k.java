package R9;

import ja.M;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import k9.C3717q0;
import pb.C5133a;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    final i f33816a;

    /* renamed from: b  reason: collision with root package name */
    final long f33817b;

    /* renamed from: c  reason: collision with root package name */
    final long f33818c;

    public static abstract class a extends k {

        /* renamed from: d  reason: collision with root package name */
        final long f33819d;

        /* renamed from: e  reason: collision with root package name */
        final long f33820e;

        /* renamed from: f  reason: collision with root package name */
        final List f33821f;

        /* renamed from: g  reason: collision with root package name */
        private final long f33822g;

        /* renamed from: h  reason: collision with root package name */
        private final long f33823h;

        /* renamed from: i  reason: collision with root package name */
        final long f33824i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i iVar, long j10, long j11, long j12, long j13, List list, long j14, long j15, long j16) {
            super(iVar, j10, j11);
            this.f33819d = j12;
            this.f33820e = j13;
            this.f33821f = list;
            this.f33824i = j14;
            this.f33822g = j15;
            this.f33823h = j16;
        }

        public long c(long j10, long j11) {
            long g10 = g(j10);
            if (g10 != -1) {
                return g10;
            }
            return (long) ((int) (i((j11 - this.f33823h) + this.f33824i, j10) - d(j10, j11)));
        }

        public long d(long j10, long j11) {
            if (g(j10) == -1) {
                long j12 = this.f33822g;
                if (j12 != -9223372036854775807L) {
                    return Math.max(e(), i((j11 - this.f33823h) - j12, j10));
                }
            }
            return e();
        }

        public long e() {
            return this.f33819d;
        }

        public long f(long j10, long j11) {
            if (this.f33821f != null) {
                return -9223372036854775807L;
            }
            long d10 = d(j10, j11) + c(j10, j11);
            return (j(d10) + h(d10, j10)) - this.f33824i;
        }

        public abstract long g(long j10);

        public final long h(long j10, long j11) {
            List list = this.f33821f;
            if (list != null) {
                return (((d) list.get((int) (j10 - this.f33819d))).f33830b * 1000000) / this.f33817b;
            }
            long g10 = g(j11);
            if (g10 == -1 || j10 != (e() + g10) - 1) {
                return (this.f33820e * 1000000) / this.f33817b;
            }
            return j11 - j(j10);
        }

        public long i(long j10, long j11) {
            long e10 = e();
            long g10 = g(j11);
            if (g10 == 0) {
                return e10;
            }
            if (this.f33821f == null) {
                long j12 = this.f33819d + (j10 / ((this.f33820e * 1000000) / this.f33817b));
                if (j12 < e10) {
                    return e10;
                }
                if (g10 == -1) {
                    return j12;
                }
                return Math.min(j12, (e10 + g10) - 1);
            }
            long j13 = (g10 + e10) - 1;
            long j14 = e10;
            while (j14 <= j13) {
                long j15 = ((j13 - j14) / 2) + j14;
                int i10 = (j(j15) > j10 ? 1 : (j(j15) == j10 ? 0 : -1));
                if (i10 < 0) {
                    j14 = j15 + 1;
                } else if (i10 <= 0) {
                    return j15;
                } else {
                    j13 = j15 - 1;
                }
            }
            if (j14 == e10) {
                return j14;
            }
            return j13;
        }

        public final long j(long j10) {
            long j11;
            List list = this.f33821f;
            if (list != null) {
                j11 = ((d) list.get((int) (j10 - this.f33819d))).f33829a - this.f33818c;
            } else {
                j11 = (j10 - this.f33819d) * this.f33820e;
            }
            return M.O0(j11, 1000000, this.f33817b);
        }

        public abstract i k(j jVar, long j10);

        public boolean l() {
            if (this.f33821f != null) {
                return true;
            }
            return false;
        }
    }

    public static final class b extends a {

        /* renamed from: j  reason: collision with root package name */
        final List f33825j;

        public b(i iVar, long j10, long j11, long j12, long j13, List list, long j14, List list2, long j15, long j16) {
            super(iVar, j10, j11, j12, j13, list, j14, j15, j16);
            this.f33825j = list2;
        }

        public long g(long j10) {
            return (long) this.f33825j.size();
        }

        public i k(j jVar, long j10) {
            return (i) this.f33825j.get((int) (j10 - this.f33819d));
        }

        public boolean l() {
            return true;
        }
    }

    public static final class c extends a {

        /* renamed from: j  reason: collision with root package name */
        final n f33826j;

        /* renamed from: k  reason: collision with root package name */
        final n f33827k;

        /* renamed from: l  reason: collision with root package name */
        final long f33828l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(i iVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, n nVar, n nVar2, long j16, long j17) {
            super(iVar, j10, j11, j12, j14, list, j15, j16, j17);
            this.f33826j = nVar;
            this.f33827k = nVar2;
            this.f33828l = j13;
        }

        public i a(j jVar) {
            n nVar = this.f33826j;
            if (nVar == null) {
                return k.super.a(jVar);
            }
            C3717q0 q0Var = jVar.f33803b;
            return new i(nVar.a(q0Var.f45759a, 0, q0Var.f45766h, 0), 0, -1);
        }

        public long g(long j10) {
            List list = this.f33821f;
            if (list != null) {
                return (long) list.size();
            }
            long j11 = this.f33828l;
            if (j11 != -1) {
                return (j11 - this.f33819d) + 1;
            }
            if (j10 != -9223372036854775807L) {
                return C5133a.a(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f33817b)), BigInteger.valueOf(this.f33820e).multiply(BigInteger.valueOf(1000000)), RoundingMode.CEILING).longValue();
            }
            return -1;
        }

        public i k(j jVar, long j10) {
            long j11;
            List list = this.f33821f;
            if (list != null) {
                j11 = ((d) list.get((int) (j10 - this.f33819d))).f33829a;
            } else {
                j11 = (j10 - this.f33819d) * this.f33820e;
            }
            long j12 = j11;
            n nVar = this.f33827k;
            C3717q0 q0Var = jVar.f33803b;
            return new i(nVar.a(q0Var.f45759a, j10, q0Var.f45766h, j12), 0, -1);
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        final long f33829a;

        /* renamed from: b  reason: collision with root package name */
        final long f33830b;

        public d(long j10, long j11) {
            this.f33829a = j10;
            this.f33830b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f33829a == dVar.f33829a && this.f33830b == dVar.f33830b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f33829a) * 31) + ((int) this.f33830b);
        }
    }

    public k(i iVar, long j10, long j11) {
        this.f33816a = iVar;
        this.f33817b = j10;
        this.f33818c = j11;
    }

    public i a(j jVar) {
        return this.f33816a;
    }

    public long b() {
        return M.O0(this.f33818c, 1000000, this.f33817b);
    }

    public static class e extends k {

        /* renamed from: d  reason: collision with root package name */
        final long f33831d;

        /* renamed from: e  reason: collision with root package name */
        final long f33832e;

        public e(i iVar, long j10, long j11, long j12, long j13) {
            super(iVar, j10, j11);
            this.f33831d = j12;
            this.f33832e = j13;
        }

        public i c() {
            long j10 = this.f33832e;
            if (j10 <= 0) {
                return null;
            }
            return new i((String) null, this.f33831d, j10);
        }

        public e() {
            this((i) null, 1, 0, 0, 0);
        }
    }
}
