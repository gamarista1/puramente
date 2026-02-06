package r0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2421g;
import q0.C2422h;
import q0.C2427m;

/* renamed from: r0.n0  reason: case insensitive filesystem */
public abstract class C2514n0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f25547b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f25548a;

    /* renamed from: r0.n0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C2514n0 b(a aVar, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = k2.f25537a.a();
            }
            return aVar.a(list, f10, f11, i10);
        }

        public static /* synthetic */ C2514n0 e(a aVar, List list, long j10, long j11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = C2421g.f25320b.c();
            }
            long j12 = j10;
            if ((i11 & 4) != 0) {
                j11 = C2421g.f25320b.a();
            }
            long j13 = j11;
            if ((i11 & 8) != 0) {
                i10 = k2.f25537a.a();
            }
            return aVar.c(list, j12, j13, i10);
        }

        public static /* synthetic */ C2514n0 g(a aVar, List list, long j10, float f10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = C2421g.f25320b.b();
            }
            long j11 = j10;
            if ((i11 & 4) != 0) {
                f10 = Float.POSITIVE_INFINITY;
            }
            float f11 = f10;
            if ((i11 & 8) != 0) {
                i10 = k2.f25537a.a();
            }
            return aVar.f(list, j11, f11, i10);
        }

        public static /* synthetic */ C2514n0 j(a aVar, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = k2.f25537a.a();
            }
            return aVar.h(list, f10, f11, i10);
        }

        public static /* synthetic */ C2514n0 k(a aVar, Pair[] pairArr, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = k2.f25537a.a();
            }
            return aVar.i(pairArr, f10, f11, i10);
        }

        public final C2514n0 a(List list, float f10, float f11, int i10) {
            return c(list, C2422h.a(f10, 0.0f), C2422h.a(f11, 0.0f), i10);
        }

        public final C2514n0 c(List list, long j10, long j11, int i10) {
            return new L1(list, (List) null, j10, j11, i10, (DefaultConstructorMarker) null);
        }

        public final C2514n0 d(Pair[] pairArr, long j10, long j11, int i10) {
            Pair[] pairArr2 = pairArr;
            ArrayList arrayList = new ArrayList(r1);
            for (Pair d10 : pairArr2) {
                arrayList.add(C2544x0.k(((C2544x0) d10.d()).y()));
            }
            ArrayList arrayList2 = new ArrayList(r1);
            for (Pair c10 : pairArr2) {
                arrayList2.add(Float.valueOf(((Number) c10.c()).floatValue()));
            }
            return new L1(arrayList, arrayList2, j10, j11, i10, (DefaultConstructorMarker) null);
        }

        public final C2514n0 f(List list, long j10, float f10, int i10) {
            return new Y1(list, (List) null, j10, f10, i10, (DefaultConstructorMarker) null);
        }

        public final C2514n0 h(List list, float f10, float f11, int i10) {
            return c(list, C2422h.a(0.0f, f10), C2422h.a(0.0f, f11), i10);
        }

        public final C2514n0 i(Pair[] pairArr, float f10, float f11, int i10) {
            return d((Pair[]) Arrays.copyOf(pairArr, pairArr.length), C2422h.a(0.0f, f10), C2422h.a(0.0f, f11), i10);
        }

        private a() {
        }
    }

    public /* synthetic */ C2514n0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a(long j10, Q1 q12, float f10);

    private C2514n0() {
        this.f25548a = C2427m.f25341b.a();
    }
}
