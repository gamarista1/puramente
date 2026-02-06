package ga;

import N9.C3070t;
import N9.T;
import N9.V;
import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.adjust.sdk.network.ErrorCodes;
import com.google.android.gms.common.api.a;
import com.google.common.collect.C4763n;
import com.google.common.collect.C4770v;
import com.google.common.collect.O;
import ga.C3564a;
import ga.r;
import ga.t;
import ga.y;
import ja.C3645a;
import ja.C3647c;
import ja.M;
import ja.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k9.C3700i;
import k9.C3717q0;
import k9.b1;
import k9.c1;
import k9.n1;
import m9.C3847e;
import nb.p;
import o2.U;

public class m extends t {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final O f43803k = O.b(new d());
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final O f43804l = O.b(new e());

    /* renamed from: d  reason: collision with root package name */
    private final Object f43805d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f43806e;

    /* renamed from: f  reason: collision with root package name */
    private final r.b f43807f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f43808g;

    /* renamed from: h  reason: collision with root package name */
    private d f43809h;

    /* renamed from: i  reason: collision with root package name */
    private f f43810i;

    /* renamed from: j  reason: collision with root package name */
    private C3847e f43811j;

    private static final class b extends h implements Comparable {

        /* renamed from: e  reason: collision with root package name */
        private final int f43812e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f43813f;

        /* renamed from: g  reason: collision with root package name */
        private final String f43814g = m.Q(this.f43887d.f45761c);

        /* renamed from: h  reason: collision with root package name */
        private final d f43815h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f43816i;

        /* renamed from: j  reason: collision with root package name */
        private final int f43817j;

        /* renamed from: k  reason: collision with root package name */
        private final int f43818k;

        /* renamed from: l  reason: collision with root package name */
        private final int f43819l;

        /* renamed from: m  reason: collision with root package name */
        private final boolean f43820m;

        /* renamed from: n  reason: collision with root package name */
        private final int f43821n;

        /* renamed from: o  reason: collision with root package name */
        private final int f43822o;

        /* renamed from: p  reason: collision with root package name */
        private final boolean f43823p;

        /* renamed from: q  reason: collision with root package name */
        private final int f43824q;

        /* renamed from: r  reason: collision with root package name */
        private final int f43825r;

        /* renamed from: s  reason: collision with root package name */
        private final int f43826s;

        /* renamed from: t  reason: collision with root package name */
        private final int f43827t;

        /* renamed from: u  reason: collision with root package name */
        private final boolean f43828u;

        /* renamed from: v  reason: collision with root package name */
        private final boolean f43829v;

        public b(int i10, T t10, int i11, d dVar, int i12, boolean z10, p pVar) {
            super(i10, t10, i11);
            int i13;
            int i14;
            boolean z11;
            boolean z12;
            boolean z13;
            int i15;
            boolean z14;
            this.f43815h = dVar;
            boolean z15 = false;
            this.f43816i = m.I(i12, false);
            int i16 = 0;
            while (true) {
                int size = dVar.f43934n.size();
                i13 = a.e.API_PRIORITY_OTHER;
                if (i16 >= size) {
                    i14 = 0;
                    i16 = Integer.MAX_VALUE;
                    break;
                }
                i14 = m.B(this.f43887d, (String) dVar.f43934n.get(i16), false);
                if (i14 > 0) {
                    break;
                }
                i16++;
            }
            this.f43818k = i16;
            this.f43817j = i14;
            this.f43819l = m.E(this.f43887d.f45763e, dVar.f43935o);
            C3717q0 q0Var = this.f43887d;
            int i17 = q0Var.f45763e;
            if (i17 == 0 || (i17 & 1) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f43820m = z11;
            if ((q0Var.f45762d & 1) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f43823p = z12;
            int i18 = q0Var.f45783y;
            this.f43824q = i18;
            this.f43825r = q0Var.f45784z;
            int i19 = q0Var.f45766h;
            this.f43826s = i19;
            if ((i19 == -1 || i19 <= dVar.f43937q) && ((i18 == -1 || i18 <= dVar.f43936p) && pVar.apply(q0Var))) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f43813f = z13;
            String[] h02 = M.h0();
            int i20 = 0;
            while (true) {
                if (i20 >= h02.length) {
                    i15 = 0;
                    i20 = Integer.MAX_VALUE;
                    break;
                }
                i15 = m.B(this.f43887d, h02[i20], false);
                if (i15 > 0) {
                    break;
                }
                i20++;
            }
            this.f43821n = i20;
            this.f43822o = i15;
            int i21 = 0;
            while (true) {
                if (i21 < dVar.f43938r.size()) {
                    String str = this.f43887d.f45770l;
                    if (str != null && str.equals(dVar.f43938r.get(i21))) {
                        i13 = i21;
                        break;
                    }
                    i21++;
                } else {
                    break;
                }
            }
            this.f43827t = i13;
            if (b1.i(i12) == 128) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f43828u = z14;
            this.f43829v = b1.s(i12) == 64 ? true : z15;
            this.f43812e = i(i12, z10);
        }

        public static int c(List list, List list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static C4770v f(int i10, T t10, d dVar, int[] iArr, boolean z10, p pVar) {
            C4770v.a t11 = C4770v.t();
            T t12 = t10;
            for (int i11 = 0; i11 < t12.f33189a; i11++) {
                t11.a(new b(i10, t10, i11, dVar, iArr[i11], z10, pVar));
            }
            return t11.k();
        }

        private int i(int i10, boolean z10) {
            if (!m.I(i10, this.f43815h.f43845g0)) {
                return 0;
            }
            if (!this.f43813f && !this.f43815h.f43839H) {
                return 0;
            }
            if (m.I(i10, false) && this.f43813f && this.f43887d.f45766h != -1) {
                d dVar = this.f43815h;
                if (dVar.f43944x || dVar.f43943w || (!dVar.f43847i0 && z10)) {
                    return 1;
                }
                return 2;
            }
            return 1;
        }

        public int a() {
            return this.f43812e;
        }

        /* renamed from: e */
        public int compareTo(b bVar) {
            O o10;
            O o11;
            if (!this.f43813f || !this.f43816i) {
                o10 = m.f43803k.g();
            } else {
                o10 = m.f43803k;
            }
            C4763n f10 = C4763n.j().g(this.f43816i, bVar.f43816i).f(Integer.valueOf(this.f43818k), Integer.valueOf(bVar.f43818k), O.d().g()).d(this.f43817j, bVar.f43817j).d(this.f43819l, bVar.f43819l).g(this.f43823p, bVar.f43823p).g(this.f43820m, bVar.f43820m).f(Integer.valueOf(this.f43821n), Integer.valueOf(bVar.f43821n), O.d().g()).d(this.f43822o, bVar.f43822o).g(this.f43813f, bVar.f43813f).f(Integer.valueOf(this.f43827t), Integer.valueOf(bVar.f43827t), O.d().g());
            Integer valueOf = Integer.valueOf(this.f43826s);
            Integer valueOf2 = Integer.valueOf(bVar.f43826s);
            if (this.f43815h.f43943w) {
                o11 = m.f43803k.g();
            } else {
                o11 = m.f43804l;
            }
            C4763n f11 = f10.f(valueOf, valueOf2, o11).g(this.f43828u, bVar.f43828u).g(this.f43829v, bVar.f43829v).f(Integer.valueOf(this.f43824q), Integer.valueOf(bVar.f43824q), o10).f(Integer.valueOf(this.f43825r), Integer.valueOf(bVar.f43825r), o10);
            Integer valueOf3 = Integer.valueOf(this.f43826s);
            Integer valueOf4 = Integer.valueOf(bVar.f43826s);
            if (!M.c(this.f43814g, bVar.f43814g)) {
                o10 = m.f43804l;
            }
            return f11.f(valueOf3, valueOf4, o10).i();
        }

        /* renamed from: j */
        public boolean b(b bVar) {
            int i10;
            String str;
            int i11;
            d dVar = this.f43815h;
            if ((dVar.f43842Y || ((i11 = this.f43887d.f45783y) != -1 && i11 == bVar.f43887d.f45783y)) && (dVar.f43840I || ((str = this.f43887d.f45770l) != null && TextUtils.equals(str, bVar.f43887d.f45770l)))) {
                d dVar2 = this.f43815h;
                if ((dVar2.f43841X || ((i10 = this.f43887d.f45784z) != -1 && i10 == bVar.f43887d.f45784z)) && (dVar2.f43843Z || (this.f43828u == bVar.f43828u && this.f43829v == bVar.f43829v))) {
                    return true;
                }
            }
            return false;
        }
    }

    private static final class c implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f43830a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f43831b;

        public c(C3717q0 q0Var, int i10) {
            this.f43830a = (q0Var.f45762d & 1) == 0 ? false : true;
            this.f43831b = m.I(i10, false);
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            return C4763n.j().g(this.f43831b, cVar.f43831b).g(this.f43830a, cVar.f43830a).i();
        }
    }

    public static final class d extends y implements C3700i {

        /* renamed from: l0  reason: collision with root package name */
        public static final d f43832l0;

        /* renamed from: m0  reason: collision with root package name */
        public static final d f43833m0;

        /* renamed from: n0  reason: collision with root package name */
        public static final C3700i.a f43834n0 = new n();

        /* renamed from: D  reason: collision with root package name */
        public final boolean f43835D;

        /* renamed from: E  reason: collision with root package name */
        public final boolean f43836E;

        /* renamed from: F  reason: collision with root package name */
        public final boolean f43837F;

        /* renamed from: G  reason: collision with root package name */
        public final boolean f43838G;

        /* renamed from: H  reason: collision with root package name */
        public final boolean f43839H;

        /* renamed from: I  reason: collision with root package name */
        public final boolean f43840I;

        /* renamed from: X  reason: collision with root package name */
        public final boolean f43841X;

        /* renamed from: Y  reason: collision with root package name */
        public final boolean f43842Y;

        /* renamed from: Z  reason: collision with root package name */
        public final boolean f43843Z;

        /* renamed from: f0  reason: collision with root package name */
        public final boolean f43844f0;

        /* renamed from: g0  reason: collision with root package name */
        public final boolean f43845g0;

        /* renamed from: h0  reason: collision with root package name */
        public final boolean f43846h0;

        /* renamed from: i0  reason: collision with root package name */
        public final boolean f43847i0;
        /* access modifiers changed from: private */

        /* renamed from: j0  reason: collision with root package name */
        public final SparseArray f43848j0;
        /* access modifiers changed from: private */

        /* renamed from: k0  reason: collision with root package name */
        public final SparseBooleanArray f43849k0;

        static {
            d X10 = new a().A();
            f43832l0 = X10;
            f43833m0 = X10;
        }

        private static boolean f(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean g(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (indexOfKey < 0 || !h((Map) sparseArray.valueAt(i10), (Map) sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean h(java.util.Map r4, java.util.Map r5) {
            /*
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto L_0x000c
                return r2
            L_0x000c:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L_0x0014:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x003b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                N9.V r1 = (N9.V) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L_0x003a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = ja.M.c(r0, r1)
                if (r0 != 0) goto L_0x0014
            L_0x003a:
                return r2
            L_0x003b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: ga.m.d.h(java.util.Map, java.util.Map):boolean");
        }

        public static d j(Context context) {
            return new a(context).A();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (super.equals(dVar) && this.f43835D == dVar.f43835D && this.f43836E == dVar.f43836E && this.f43837F == dVar.f43837F && this.f43838G == dVar.f43838G && this.f43839H == dVar.f43839H && this.f43840I == dVar.f43840I && this.f43841X == dVar.f43841X && this.f43842Y == dVar.f43842Y && this.f43843Z == dVar.f43843Z && this.f43844f0 == dVar.f43844f0 && this.f43845g0 == dVar.f43845g0 && this.f43846h0 == dVar.f43846h0 && this.f43847i0 == dVar.f43847i0 && f(this.f43849k0, dVar.f43849k0) && g(this.f43848j0, dVar.f43848j0)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f43835D ? 1 : 0)) * 31) + (this.f43836E ? 1 : 0)) * 31) + (this.f43837F ? 1 : 0)) * 31) + (this.f43838G ? 1 : 0)) * 31) + (this.f43839H ? 1 : 0)) * 31) + (this.f43840I ? 1 : 0)) * 31) + (this.f43841X ? 1 : 0)) * 31) + (this.f43842Y ? 1 : 0)) * 31) + (this.f43843Z ? 1 : 0)) * 31) + (this.f43844f0 ? 1 : 0)) * 31) + (this.f43845g0 ? 1 : 0)) * 31) + (this.f43846h0 ? 1 : 0)) * 31) + (this.f43847i0 ? 1 : 0);
        }

        public a i() {
            return new a();
        }

        public boolean k(int i10) {
            return this.f43849k0.get(i10);
        }

        public e l(int i10, V v10) {
            Map map = (Map) this.f43848j0.get(i10);
            if (map != null) {
                return (e) map.get(v10);
            }
            return null;
        }

        public boolean m(int i10, V v10) {
            Map map = (Map) this.f43848j0.get(i10);
            if (map == null || !map.containsKey(v10)) {
                return false;
            }
            return true;
        }

        public static final class a extends y.a {
            /* access modifiers changed from: private */

            /* renamed from: A  reason: collision with root package name */
            public boolean f43850A;
            /* access modifiers changed from: private */

            /* renamed from: B  reason: collision with root package name */
            public boolean f43851B;
            /* access modifiers changed from: private */

            /* renamed from: C  reason: collision with root package name */
            public boolean f43852C;
            /* access modifiers changed from: private */

            /* renamed from: D  reason: collision with root package name */
            public boolean f43853D;
            /* access modifiers changed from: private */

            /* renamed from: E  reason: collision with root package name */
            public boolean f43854E;
            /* access modifiers changed from: private */

            /* renamed from: F  reason: collision with root package name */
            public boolean f43855F;
            /* access modifiers changed from: private */

            /* renamed from: G  reason: collision with root package name */
            public boolean f43856G;
            /* access modifiers changed from: private */

            /* renamed from: H  reason: collision with root package name */
            public boolean f43857H;
            /* access modifiers changed from: private */

            /* renamed from: I  reason: collision with root package name */
            public boolean f43858I;
            /* access modifiers changed from: private */

            /* renamed from: J  reason: collision with root package name */
            public boolean f43859J;
            /* access modifiers changed from: private */

            /* renamed from: K  reason: collision with root package name */
            public boolean f43860K;
            /* access modifiers changed from: private */

            /* renamed from: L  reason: collision with root package name */
            public boolean f43861L;
            /* access modifiers changed from: private */

            /* renamed from: M  reason: collision with root package name */
            public boolean f43862M;
            /* access modifiers changed from: private */

            /* renamed from: N  reason: collision with root package name */
            public final SparseArray f43863N;
            /* access modifiers changed from: private */

            /* renamed from: O  reason: collision with root package name */
            public final SparseBooleanArray f43864O;

            private static SparseArray Y(SparseArray sparseArray) {
                SparseArray sparseArray2 = new SparseArray();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            private void Z() {
                this.f43850A = true;
                this.f43851B = false;
                this.f43852C = true;
                this.f43853D = false;
                this.f43854E = true;
                this.f43855F = false;
                this.f43856G = false;
                this.f43857H = false;
                this.f43858I = false;
                this.f43859J = true;
                this.f43860K = true;
                this.f43861L = false;
                this.f43862M = true;
            }

            private SparseBooleanArray a0(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int append : iArr) {
                    sparseBooleanArray.append(append, true);
                }
                return sparseBooleanArray;
            }

            private void q0(Bundle bundle) {
                C4770v vVar;
                SparseArray sparseArray;
                int[] intArray = bundle.getIntArray(y.b(1010));
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(y.b(1011));
                if (parcelableArrayList == null) {
                    vVar = C4770v.E();
                } else {
                    vVar = C3647c.b(V.f33195e, parcelableArrayList);
                }
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(y.b(1012));
                if (sparseParcelableArray == null) {
                    sparseArray = new SparseArray();
                } else {
                    sparseArray = C3647c.c(e.f43865e, sparseParcelableArray);
                }
                if (intArray != null && intArray.length == vVar.size()) {
                    for (int i10 = 0; i10 < intArray.length; i10++) {
                        p0(intArray[i10], (V) vVar.get(i10), (e) sparseArray.get(i10));
                    }
                }
            }

            /* renamed from: X */
            public d A() {
                return new d(this);
            }

            /* access modifiers changed from: protected */
            public a b0(y yVar) {
                super.D(yVar);
                return this;
            }

            public a c0(boolean z10) {
                this.f43857H = z10;
                return this;
            }

            public a d0(boolean z10) {
                this.f43858I = z10;
                return this;
            }

            public a e0(boolean z10) {
                this.f43855F = z10;
                return this;
            }

            public a f0(boolean z10) {
                this.f43856G = z10;
                return this;
            }

            public a g0(boolean z10) {
                this.f43862M = z10;
                return this;
            }

            public a h0(boolean z10) {
                this.f43853D = z10;
                return this;
            }

            public a i0(boolean z10) {
                this.f43851B = z10;
                return this;
            }

            public a j0(boolean z10) {
                this.f43852C = z10;
                return this;
            }

            public a k0(boolean z10) {
                this.f43859J = z10;
                return this;
            }

            public a l0(boolean z10) {
                this.f43854E = z10;
                return this;
            }

            public a m0(boolean z10) {
                this.f43860K = z10;
                return this;
            }

            public a n0(boolean z10) {
                this.f43850A = z10;
                return this;
            }

            /* renamed from: o0 */
            public a E(Context context) {
                super.E(context);
                return this;
            }

            public a p0(int i10, V v10, e eVar) {
                Map map = (Map) this.f43863N.get(i10);
                if (map == null) {
                    map = new HashMap();
                    this.f43863N.put(i10, map);
                }
                if (map.containsKey(v10) && M.c(map.get(v10), eVar)) {
                    return this;
                }
                map.put(v10, eVar);
                return this;
            }

            public a r0(boolean z10) {
                this.f43861L = z10;
                return this;
            }

            /* renamed from: s0 */
            public a G(int i10, int i11, boolean z10) {
                super.G(i10, i11, z10);
                return this;
            }

            /* renamed from: t0 */
            public a H(Context context, boolean z10) {
                super.H(context, z10);
                return this;
            }

            public a() {
                this.f43863N = new SparseArray();
                this.f43864O = new SparseBooleanArray();
                Z();
            }

            public a(Context context) {
                super(context);
                this.f43863N = new SparseArray();
                this.f43864O = new SparseBooleanArray();
                Z();
            }

            private a(d dVar) {
                super((y) dVar);
                this.f43850A = dVar.f43835D;
                this.f43851B = dVar.f43836E;
                this.f43852C = dVar.f43837F;
                this.f43853D = dVar.f43838G;
                this.f43854E = dVar.f43839H;
                this.f43855F = dVar.f43840I;
                this.f43856G = dVar.f43841X;
                this.f43857H = dVar.f43842Y;
                this.f43858I = dVar.f43843Z;
                this.f43859J = dVar.f43844f0;
                this.f43860K = dVar.f43845g0;
                this.f43861L = dVar.f43846h0;
                this.f43862M = dVar.f43847i0;
                this.f43863N = Y(dVar.f43848j0);
                this.f43864O = dVar.f43849k0.clone();
            }

            private a(Bundle bundle) {
                super(bundle);
                Z();
                d dVar = d.f43832l0;
                n0(bundle.getBoolean(y.b(1000), dVar.f43835D));
                i0(bundle.getBoolean(y.b(ErrorCodes.SERVER_RETRY_IN), dVar.f43836E));
                j0(bundle.getBoolean(y.b(ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION), dVar.f43837F));
                h0(bundle.getBoolean(y.b(1014), dVar.f43838G));
                l0(bundle.getBoolean(y.b(ErrorCodes.MALFORMED_URL_EXCEPTION), dVar.f43839H));
                e0(bundle.getBoolean(y.b(ErrorCodes.PROTOCOL_EXCEPTION), dVar.f43840I));
                f0(bundle.getBoolean(y.b(ErrorCodes.SOCKET_TIMEOUT_EXCEPTION), dVar.f43841X));
                c0(bundle.getBoolean(y.b(ErrorCodes.SSL_HANDSHAKE_EXCEPTION), dVar.f43842Y));
                d0(bundle.getBoolean(y.b(1015), dVar.f43843Z));
                k0(bundle.getBoolean(y.b(1016), dVar.f43844f0));
                m0(bundle.getBoolean(y.b(ErrorCodes.IO_EXCEPTION), dVar.f43845g0));
                r0(bundle.getBoolean(y.b(1008), dVar.f43846h0));
                g0(bundle.getBoolean(y.b(1009), dVar.f43847i0));
                this.f43863N = new SparseArray();
                q0(bundle);
                this.f43864O = a0(bundle.getIntArray(y.b(1013)));
            }
        }

        private d(a aVar) {
            super(aVar);
            this.f43835D = aVar.f43850A;
            this.f43836E = aVar.f43851B;
            this.f43837F = aVar.f43852C;
            this.f43838G = aVar.f43853D;
            this.f43839H = aVar.f43854E;
            this.f43840I = aVar.f43855F;
            this.f43841X = aVar.f43856G;
            this.f43842Y = aVar.f43857H;
            this.f43843Z = aVar.f43858I;
            this.f43844f0 = aVar.f43859J;
            this.f43845g0 = aVar.f43860K;
            this.f43846h0 = aVar.f43861L;
            this.f43847i0 = aVar.f43862M;
            this.f43848j0 = aVar.f43863N;
            this.f43849k0 = aVar.f43864O;
        }
    }

    public static final class e implements C3700i {

        /* renamed from: e  reason: collision with root package name */
        public static final C3700i.a f43865e = new o();

        /* renamed from: a  reason: collision with root package name */
        public final int f43866a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f43867b;

        /* renamed from: c  reason: collision with root package name */
        public final int f43868c;

        /* renamed from: d  reason: collision with root package name */
        public final int f43869d;

        public e(int i10, int[] iArr, int i11) {
            this.f43866a = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f43867b = copyOf;
            this.f43868c = iArr.length;
            this.f43869d = i11;
            Arrays.sort(copyOf);
        }

        private static String b(int i10) {
            return Integer.toString(i10, 36);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ e c(Bundle bundle) {
            boolean z10 = false;
            int i10 = bundle.getInt(b(0), -1);
            int[] intArray = bundle.getIntArray(b(1));
            int i11 = bundle.getInt(b(2), -1);
            if (i10 >= 0 && i11 >= 0) {
                z10 = true;
            }
            C3645a.a(z10);
            C3645a.e(intArray);
            return new e(i10, intArray, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f43866a == eVar.f43866a && Arrays.equals(this.f43867b, eVar.f43867b) && this.f43869d == eVar.f43869d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f43866a * 31) + Arrays.hashCode(this.f43867b)) * 31) + this.f43869d;
        }
    }

    private static class f {

        /* renamed from: a  reason: collision with root package name */
        private final Spatializer f43870a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f43871b;

        /* renamed from: c  reason: collision with root package name */
        private Handler f43872c;

        /* renamed from: d  reason: collision with root package name */
        private Spatializer$OnSpatializerStateChangedListener f43873d;

        class a implements Spatializer$OnSpatializerStateChangedListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m f43874a;

            a(f fVar, m mVar) {
                this.f43874a = mVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f43874a.P();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f43874a.P();
            }
        }

        private f(Spatializer spatializer) {
            boolean z10;
            this.f43870a = spatializer;
            if (spatializer.getImmersiveAudioLevel() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f43871b = z10;
        }

        public static f g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new f(audioManager.getSpatializer());
        }

        public boolean a(C3847e eVar, C3717q0 q0Var) {
            int i10;
            if (!"audio/eac3-joc".equals(q0Var.f45770l) || q0Var.f45783y != 16) {
                i10 = q0Var.f45783y;
            } else {
                i10 = 12;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(M.G(i10));
            int i11 = q0Var.f45784z;
            if (i11 != -1) {
                channelMask.setSampleRate(i11);
            }
            return this.f43870a.canBeSpatialized(eVar.b().f46639a, channelMask.build());
        }

        public void b(m mVar, Looper looper) {
            if (this.f43873d == null && this.f43872c == null) {
                this.f43873d = new a(this, mVar);
                Handler handler = new Handler(looper);
                this.f43872c = handler;
                Spatializer spatializer = this.f43870a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new U(handler), this.f43873d);
            }
        }

        public boolean c() {
            return this.f43870a.isAvailable();
        }

        public boolean d() {
            return this.f43870a.isEnabled();
        }

        public boolean e() {
            return this.f43871b;
        }

        public void f() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f43873d;
            if (spatializer$OnSpatializerStateChangedListener != null && this.f43872c != null) {
                this.f43870a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
                ((Handler) M.j(this.f43872c)).removeCallbacksAndMessages((Object) null);
                this.f43872c = null;
                this.f43873d = null;
            }
        }
    }

    private static final class g extends h implements Comparable {

        /* renamed from: e  reason: collision with root package name */
        private final int f43875e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f43876f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f43877g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f43878h;

        /* renamed from: i  reason: collision with root package name */
        private final int f43879i;

        /* renamed from: j  reason: collision with root package name */
        private final int f43880j;

        /* renamed from: k  reason: collision with root package name */
        private final int f43881k;

        /* renamed from: l  reason: collision with root package name */
        private final int f43882l;

        /* renamed from: m  reason: collision with root package name */
        private final boolean f43883m;

        public g(int i10, T t10, int i11, d dVar, int i12, String str) {
            super(i10, t10, i11);
            boolean z10;
            boolean z11;
            C4770v vVar;
            int i13;
            boolean z12;
            boolean z13;
            boolean z14;
            int i14 = 0;
            this.f43876f = m.I(i12, false);
            int i15 = this.f43887d.f45762d & (~dVar.f43941u);
            if ((i15 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f43877g = z10;
            if ((i15 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f43878h = z11;
            if (dVar.f43939s.isEmpty()) {
                vVar = C4770v.H("");
            } else {
                vVar = dVar.f43939s;
            }
            int i16 = 0;
            while (true) {
                if (i16 >= vVar.size()) {
                    i16 = a.e.API_PRIORITY_OTHER;
                    i13 = 0;
                    break;
                }
                i13 = m.B(this.f43887d, (String) vVar.get(i16), dVar.f43942v);
                if (i13 > 0) {
                    break;
                }
                i16++;
            }
            this.f43879i = i16;
            this.f43880j = i13;
            int t11 = m.E(this.f43887d.f45763e, dVar.f43940t);
            this.f43881k = t11;
            if ((this.f43887d.f45763e & 1088) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f43883m = z12;
            if (m.Q(str) == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            int B10 = m.B(this.f43887d, str, z13);
            this.f43882l = B10;
            if (i13 > 0 || ((dVar.f43939s.isEmpty() && t11 > 0) || this.f43877g || (this.f43878h && B10 > 0))) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (m.I(i12, dVar.f43845g0) && z14) {
                i14 = 1;
            }
            this.f43875e = i14;
        }

        public static int c(List list, List list2) {
            return ((g) list.get(0)).compareTo((g) list2.get(0));
        }

        public static C4770v f(int i10, T t10, d dVar, int[] iArr, String str) {
            C4770v.a t11 = C4770v.t();
            for (int i11 = 0; i11 < t10.f33189a; i11++) {
                t11.a(new g(i10, t10, i11, dVar, iArr[i11], str));
            }
            return t11.k();
        }

        public int a() {
            return this.f43875e;
        }

        /* renamed from: e */
        public int compareTo(g gVar) {
            O o10;
            C4763n g10 = C4763n.j().g(this.f43876f, gVar.f43876f).f(Integer.valueOf(this.f43879i), Integer.valueOf(gVar.f43879i), O.d().g()).d(this.f43880j, gVar.f43880j).d(this.f43881k, gVar.f43881k).g(this.f43877g, gVar.f43877g);
            Boolean valueOf = Boolean.valueOf(this.f43878h);
            Boolean valueOf2 = Boolean.valueOf(gVar.f43878h);
            if (this.f43880j == 0) {
                o10 = O.d();
            } else {
                o10 = O.d().g();
            }
            C4763n d10 = g10.f(valueOf, valueOf2, o10).d(this.f43882l, gVar.f43882l);
            if (this.f43881k == 0) {
                d10 = d10.h(this.f43883m, gVar.f43883m);
            }
            return d10.i();
        }

        /* renamed from: i */
        public boolean b(g gVar) {
            return false;
        }
    }

    private static abstract class h {

        /* renamed from: a  reason: collision with root package name */
        public final int f43884a;

        /* renamed from: b  reason: collision with root package name */
        public final T f43885b;

        /* renamed from: c  reason: collision with root package name */
        public final int f43886c;

        /* renamed from: d  reason: collision with root package name */
        public final C3717q0 f43887d;

        public interface a {
            List a(int i10, T t10, int[] iArr);
        }

        public h(int i10, T t10, int i11) {
            this.f43884a = i10;
            this.f43885b = t10;
            this.f43886c = i11;
            this.f43887d = t10.b(i11);
        }

        public abstract int a();

        public abstract boolean b(h hVar);
    }

    private static final class i extends h {

        /* renamed from: e  reason: collision with root package name */
        private final boolean f43888e;

        /* renamed from: f  reason: collision with root package name */
        private final d f43889f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f43890g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f43891h;

        /* renamed from: i  reason: collision with root package name */
        private final int f43892i;

        /* renamed from: j  reason: collision with root package name */
        private final int f43893j;

        /* renamed from: k  reason: collision with root package name */
        private final int f43894k;

        /* renamed from: l  reason: collision with root package name */
        private final int f43895l;

        /* renamed from: m  reason: collision with root package name */
        private final boolean f43896m;

        /* renamed from: n  reason: collision with root package name */
        private final boolean f43897n;

        /* renamed from: o  reason: collision with root package name */
        private final int f43898o;

        /* renamed from: p  reason: collision with root package name */
        private final boolean f43899p;

        /* renamed from: q  reason: collision with root package name */
        private final boolean f43900q;

        /* renamed from: r  reason: collision with root package name */
        private final int f43901r;

        /* JADX WARNING: Removed duplicated region for block: B:54:0x00a4  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00b2  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x00d5  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x00d7  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x00e2  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x00c8 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public i(int r5, N9.T r6, int r7, ga.m.d r8, int r9, int r10, boolean r11) {
            /*
                r4 = this;
                r4.<init>(r5, r6, r7)
                r4.f43889f = r8
                boolean r5 = r8.f43837F
                if (r5 == 0) goto L_0x000c
                r5 = 24
                goto L_0x000e
            L_0x000c:
                r5 = 16
            L_0x000e:
                boolean r6 = r8.f43836E
                r7 = 0
                r0 = 1
                if (r6 == 0) goto L_0x001a
                r6 = r10 & r5
                if (r6 == 0) goto L_0x001a
                r6 = r0
                goto L_0x001b
            L_0x001a:
                r6 = r7
            L_0x001b:
                r4.f43897n = r6
                r6 = -1082130432(0xffffffffbf800000, float:-1.0)
                r10 = -1
                if (r11 == 0) goto L_0x004b
                k9.q0 r1 = r4.f43887d
                int r2 = r1.f45775q
                if (r2 == r10) goto L_0x002c
                int r3 = r8.f43921a
                if (r2 > r3) goto L_0x004b
            L_0x002c:
                int r2 = r1.f45776r
                if (r2 == r10) goto L_0x0034
                int r3 = r8.f43922b
                if (r2 > r3) goto L_0x004b
            L_0x0034:
                float r2 = r1.f45777s
                int r3 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r3 == 0) goto L_0x0041
                int r3 = r8.f43923c
                float r3 = (float) r3
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 > 0) goto L_0x004b
            L_0x0041:
                int r1 = r1.f45766h
                if (r1 == r10) goto L_0x0049
                int r2 = r8.f43924d
                if (r1 > r2) goto L_0x004b
            L_0x0049:
                r1 = r0
                goto L_0x004c
            L_0x004b:
                r1 = r7
            L_0x004c:
                r4.f43888e = r1
                if (r11 == 0) goto L_0x0079
                k9.q0 r11 = r4.f43887d
                int r1 = r11.f45775q
                if (r1 == r10) goto L_0x005a
                int r2 = r8.f43925e
                if (r1 < r2) goto L_0x0079
            L_0x005a:
                int r1 = r11.f45776r
                if (r1 == r10) goto L_0x0062
                int r2 = r8.f43926f
                if (r1 < r2) goto L_0x0079
            L_0x0062:
                float r1 = r11.f45777s
                int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r6 == 0) goto L_0x006f
                int r6 = r8.f43927g
                float r6 = (float) r6
                int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r6 < 0) goto L_0x0079
            L_0x006f:
                int r6 = r11.f45766h
                if (r6 == r10) goto L_0x0077
                int r10 = r8.f43928h
                if (r6 < r10) goto L_0x0079
            L_0x0077:
                r6 = r0
                goto L_0x007a
            L_0x0079:
                r6 = r7
            L_0x007a:
                r4.f43890g = r6
                boolean r6 = ga.m.I(r9, r7)
                r4.f43891h = r6
                k9.q0 r6 = r4.f43887d
                int r10 = r6.f45766h
                r4.f43892i = r10
                int r6 = r6.f()
                r4.f43893j = r6
                k9.q0 r6 = r4.f43887d
                int r6 = r6.f45763e
                int r10 = r8.f43933m
                int r6 = ga.m.E(r6, r10)
                r4.f43895l = r6
                k9.q0 r6 = r4.f43887d
                int r6 = r6.f45763e
                if (r6 == 0) goto L_0x00a6
                r6 = r6 & r0
                if (r6 == 0) goto L_0x00a4
                goto L_0x00a6
            L_0x00a4:
                r6 = r7
                goto L_0x00a7
            L_0x00a6:
                r6 = r0
            L_0x00a7:
                r4.f43896m = r6
                r6 = r7
            L_0x00aa:
                com.google.common.collect.v r10 = r8.f43932l
                int r10 = r10.size()
                if (r6 >= r10) goto L_0x00c8
                k9.q0 r10 = r4.f43887d
                java.lang.String r10 = r10.f45770l
                if (r10 == 0) goto L_0x00c5
                com.google.common.collect.v r11 = r8.f43932l
                java.lang.Object r11 = r11.get(r6)
                boolean r10 = r10.equals(r11)
                if (r10 == 0) goto L_0x00c5
                goto L_0x00cb
            L_0x00c5:
                int r6 = r6 + 1
                goto L_0x00aa
            L_0x00c8:
                r6 = 2147483647(0x7fffffff, float:NaN)
            L_0x00cb:
                r4.f43894k = r6
                int r6 = k9.b1.i(r9)
                r8 = 128(0x80, float:1.794E-43)
                if (r6 != r8) goto L_0x00d7
                r6 = r0
                goto L_0x00d8
            L_0x00d7:
                r6 = r7
            L_0x00d8:
                r4.f43899p = r6
                int r6 = k9.b1.s(r9)
                r8 = 64
                if (r6 != r8) goto L_0x00e3
                r7 = r0
            L_0x00e3:
                r4.f43900q = r7
                k9.q0 r6 = r4.f43887d
                java.lang.String r6 = r6.f45770l
                int r6 = ga.m.F(r6)
                r4.f43901r = r6
                int r5 = r4.m(r9, r5)
                r4.f43898o = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ga.m.i.<init>(int, N9.T, int, ga.m$d, int, int, boolean):void");
        }

        /* access modifiers changed from: private */
        public static int f(i iVar, i iVar2) {
            C4763n g10 = C4763n.j().g(iVar.f43891h, iVar2.f43891h).d(iVar.f43895l, iVar2.f43895l).g(iVar.f43896m, iVar2.f43896m).g(iVar.f43888e, iVar2.f43888e).g(iVar.f43890g, iVar2.f43890g).f(Integer.valueOf(iVar.f43894k), Integer.valueOf(iVar2.f43894k), O.d().g()).g(iVar.f43899p, iVar2.f43899p).g(iVar.f43900q, iVar2.f43900q);
            if (iVar.f43899p && iVar.f43900q) {
                g10 = g10.d(iVar.f43901r, iVar2.f43901r);
            }
            return g10.i();
        }

        /* access modifiers changed from: private */
        public static int i(i iVar, i iVar2) {
            O o10;
            O o11;
            if (!iVar.f43888e || !iVar.f43891h) {
                o10 = m.f43803k.g();
            } else {
                o10 = m.f43803k;
            }
            C4763n j10 = C4763n.j();
            Integer valueOf = Integer.valueOf(iVar.f43892i);
            Integer valueOf2 = Integer.valueOf(iVar2.f43892i);
            if (iVar.f43889f.f43943w) {
                o11 = m.f43803k.g();
            } else {
                o11 = m.f43804l;
            }
            return j10.f(valueOf, valueOf2, o11).f(Integer.valueOf(iVar.f43893j), Integer.valueOf(iVar2.f43893j), o10).f(Integer.valueOf(iVar.f43892i), Integer.valueOf(iVar2.f43892i), o10).i();
        }

        public static int j(List list, List list2) {
            return C4763n.j().f((i) Collections.max(list, new p()), (i) Collections.max(list2, new p()), new p()).d(list.size(), list2.size()).f((i) Collections.max(list, new q()), (i) Collections.max(list2, new q()), new q()).i();
        }

        public static C4770v l(int i10, T t10, d dVar, int[] iArr, int i11) {
            boolean z10;
            T t11 = t10;
            d dVar2 = dVar;
            int s10 = m.C(t11, dVar2.f43929i, dVar2.f43930j, dVar2.f43931k);
            C4770v.a t12 = C4770v.t();
            for (int i12 = 0; i12 < t11.f33189a; i12++) {
                int f10 = t11.b(i12).f();
                if (s10 == Integer.MAX_VALUE || (f10 != -1 && f10 <= s10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t12.a(new i(i10, t10, i12, dVar, iArr[i12], i11, z10));
            }
            return t12.k();
        }

        private int m(int i10, int i11) {
            if ((this.f43887d.f45763e & 16384) != 0 || !m.I(i10, this.f43889f.f43845g0)) {
                return 0;
            }
            if (!this.f43888e && !this.f43889f.f43835D) {
                return 0;
            }
            if (m.I(i10, false) && this.f43890g && this.f43888e && this.f43887d.f45766h != -1) {
                d dVar = this.f43889f;
                if (dVar.f43944x || dVar.f43943w || (i10 & i11) == 0) {
                    return 1;
                }
                return 2;
            }
            return 1;
        }

        public int a() {
            return this.f43898o;
        }

        /* renamed from: o */
        public boolean b(i iVar) {
            if ((this.f43897n || M.c(this.f43887d.f45770l, iVar.f43887d.f45770l)) && (this.f43889f.f43838G || (this.f43899p == iVar.f43899p && this.f43900q == iVar.f43900q))) {
                return true;
            }
            return false;
        }
    }

    public m(Context context) {
        this(context, new C3564a.b());
    }

    private static void A(V v10, y yVar, Map map) {
        w wVar;
        for (int i10 = 0; i10 < v10.f33196a; i10++) {
            w wVar2 = (w) yVar.f43945y.get(v10.b(i10));
            if (wVar2 != null && ((wVar = (w) map.get(Integer.valueOf(wVar2.b()))) == null || (wVar.f43917b.isEmpty() && !wVar2.f43917b.isEmpty()))) {
                map.put(Integer.valueOf(wVar2.b()), wVar2);
            }
        }
    }

    protected static int B(C3717q0 q0Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(q0Var.f45761c)) {
            return 4;
        }
        String Q10 = Q(str);
        String Q11 = Q(q0Var.f45761c);
        if (Q11 == null || Q10 == null) {
            if (!z10 || Q11 != null) {
                return 0;
            }
            return 1;
        } else if (Q11.startsWith(Q10) || Q10.startsWith(Q11)) {
            return 3;
        } else {
            if (M.S0(Q11, "-")[0].equals(M.S0(Q10, "-")[0])) {
                return 2;
            }
            return 0;
        }
    }

    /* access modifiers changed from: private */
    public static int C(T t10, int i10, int i11, boolean z10) {
        int i12;
        int i13 = a.e.API_PRIORITY_OTHER;
        if (!(i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE)) {
            for (int i14 = 0; i14 < t10.f33189a; i14++) {
                C3717q0 b10 = t10.b(i14);
                int i15 = b10.f45775q;
                if (i15 > 0 && (i12 = b10.f45776r) > 0) {
                    Point D10 = D(z10, i10, i11, i15, i12);
                    int i16 = b10.f45775q;
                    int i17 = b10.f45776r;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (((float) D10.x) * 0.98f)) && i17 >= ((int) (((float) D10.y) * 0.98f)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r1 != r3) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Point D(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L_0x000f
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L_0x0008
            r1 = r0
            goto L_0x0009
        L_0x0008:
            r1 = r3
        L_0x0009:
            if (r4 <= r5) goto L_0x000c
            r3 = r0
        L_0x000c:
            if (r1 == r3) goto L_0x000f
            goto L_0x0012
        L_0x000f:
            r2 = r5
            r5 = r4
            r4 = r2
        L_0x0012:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L_0x0022
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = ja.M.l(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L_0x0022:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = ja.M.l(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.m.D(boolean, int, int, int, int):android.graphics.Point");
    }

    /* access modifiers changed from: private */
    public static int E(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return a.e.API_PRIORITY_OTHER;
    }

    /* access modifiers changed from: private */
    public static int F(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1662735862:
                if (str.equals("video/av01")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 4;
            case 1:
                return 3;
            case 2:
                return 1;
            case 3:
                return 2;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: private */
    public boolean G(C3717q0 q0Var) {
        boolean z10;
        f fVar;
        f fVar2;
        synchronized (this.f43805d) {
            try {
                if (this.f43809h.f43844f0 && !this.f43808g && q0Var.f45783y > 2) {
                    if (H(q0Var)) {
                        if (M.f44981a >= 32 && (fVar2 = this.f43810i) != null && fVar2.e()) {
                        }
                    }
                    if (M.f44981a < 32 || (fVar = this.f43810i) == null || !fVar.e() || !this.f43810i.c() || !this.f43810i.d() || !this.f43810i.a(this.f43811j, q0Var)) {
                        z10 = false;
                    }
                }
                z10 = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    private static boolean H(C3717q0 q0Var) {
        String str = q0Var.f45770l;
        if (str == null) {
            return false;
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    protected static boolean I(int i10, boolean z10) {
        int B10 = b1.B(i10);
        if (B10 == 4 || (z10 && B10 == 3)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List J(d dVar, boolean z10, int i10, T t10, int[] iArr) {
        return b.f(i10, t10, dVar, iArr, z10, new l(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int M(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            if (num2.intValue() == -1) {
                return 0;
            }
            return -1;
        } else if (num2.intValue() == -1) {
            return 1;
        } else {
            return num.intValue() - num2.intValue();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int N(Integer num, Integer num2) {
        return 0;
    }

    private static void O(t.a aVar, int[][][] iArr, c1[] c1VarArr, r[] rVarArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= aVar.d()) {
                z10 = true;
                break;
            }
            int e10 = aVar.e(i12);
            r rVar = rVarArr[i12];
            if ((e10 == 1 || e10 == 2) && rVar != null && R(iArr[i12], aVar.f(i12), rVar)) {
                if (e10 == 1) {
                    if (i11 != -1) {
                        break;
                    }
                    i11 = i12;
                } else if (i10 != -1) {
                    break;
                } else {
                    i10 = i12;
                }
            }
            i12++;
        }
        z10 = false;
        if (!(i11 == -1 || i10 == -1)) {
            z11 = true;
        }
        if (z10 && z11) {
            c1 c1Var = new c1(true);
            c1VarArr[i11] = c1Var;
            c1VarArr[i10] = c1Var;
        }
    }

    /* access modifiers changed from: private */
    public void P() {
        boolean z10;
        f fVar;
        synchronized (this.f43805d) {
            try {
                if (!this.f43809h.f43844f0 || this.f43808g || M.f44981a < 32 || (fVar = this.f43810i) == null || !fVar.e()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (z10) {
            c();
        }
    }

    protected static String Q(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    private static boolean R(int[][] iArr, V v10, r rVar) {
        if (rVar == null) {
            return false;
        }
        int c10 = v10.c(rVar.g());
        for (int i10 = 0; i10 < rVar.length(); i10++) {
            if (b1.m(iArr[c10][rVar.c(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private Pair W(int i10, t.a aVar, int[][][] iArr, h.a aVar2, Comparator comparator) {
        int i11;
        Object obj;
        t.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int d10 = aVar.d();
        int i12 = 0;
        while (i12 < d10) {
            if (i10 == aVar3.e(i12)) {
                V f10 = aVar3.f(i12);
                int i13 = 0;
                while (i13 < f10.f33196a) {
                    T b10 = f10.b(i13);
                    List a10 = aVar2.a(i12, b10, iArr[i12][i13]);
                    boolean[] zArr = new boolean[b10.f33189a];
                    int i14 = 0;
                    while (i14 < b10.f33189a) {
                        h hVar = (h) a10.get(i14);
                        int a11 = hVar.a();
                        if (zArr[i14] || a11 == 0) {
                            i11 = d10;
                        } else {
                            if (a11 == 1) {
                                obj = C4770v.H(hVar);
                                i11 = d10;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(hVar);
                                int i15 = i14 + 1;
                                while (i15 < b10.f33189a) {
                                    h hVar2 = (h) a10.get(i15);
                                    int i16 = d10;
                                    if (hVar2.a() == 2 && hVar.b(hVar2)) {
                                        arrayList2.add(hVar2);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    t.a aVar4 = aVar;
                                    d10 = i16;
                                }
                                i11 = d10;
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        i14++;
                        t.a aVar5 = aVar;
                        d10 = i11;
                    }
                    int i17 = d10;
                    i13++;
                    t.a aVar6 = aVar;
                }
            }
            h.a aVar7 = aVar2;
            i12++;
            aVar3 = aVar;
            d10 = d10;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i18 = 0; i18 < list.size(); i18++) {
            iArr2[i18] = ((h) list.get(i18)).f43886c;
        }
        h hVar3 = (h) list.get(0);
        return Pair.create(new r.a(hVar3.f43885b, iArr2), Integer.valueOf(hVar3.f43884a));
    }

    private static void y(t.a aVar, d dVar, r.a[] aVarArr) {
        r.a aVar2;
        int d10 = aVar.d();
        for (int i10 = 0; i10 < d10; i10++) {
            V f10 = aVar.f(i10);
            if (dVar.m(i10, f10)) {
                e l10 = dVar.l(i10, f10);
                if (l10 == null || l10.f43867b.length == 0) {
                    aVar2 = null;
                } else {
                    aVar2 = new r.a(f10.b(l10.f43866a), l10.f43867b, l10.f43869d);
                }
                aVarArr[i10] = aVar2;
            }
        }
    }

    private static void z(t.a aVar, y yVar, r.a[] aVarArr) {
        r.a aVar2;
        int d10 = aVar.d();
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < d10; i10++) {
            A(aVar.f(i10), yVar, hashMap);
        }
        A(aVar.h(), yVar, hashMap);
        for (int i11 = 0; i11 < d10; i11++) {
            w wVar = (w) hashMap.get(Integer.valueOf(aVar.e(i11)));
            if (wVar != null) {
                if (wVar.f43917b.isEmpty() || aVar.f(i11).c(wVar.f43916a) == -1) {
                    aVar2 = null;
                } else {
                    aVar2 = new r.a(wVar.f43916a, com.google.common.primitives.f.n(wVar.f43917b));
                }
                aVarArr[i11] = aVar2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public r.a[] S(t.a aVar, int[][][] iArr, int[] iArr2, d dVar) {
        String str;
        int d10 = aVar.d();
        r.a[] aVarArr = new r.a[d10];
        Pair X10 = X(aVar, iArr, iArr2, dVar);
        if (X10 != null) {
            aVarArr[((Integer) X10.second).intValue()] = (r.a) X10.first;
        }
        Pair T10 = T(aVar, iArr, iArr2, dVar);
        if (T10 != null) {
            aVarArr[((Integer) T10.second).intValue()] = (r.a) T10.first;
        }
        if (T10 == null) {
            str = null;
        } else {
            Object obj = T10.first;
            str = ((r.a) obj).f43902a.b(((r.a) obj).f43903b[0]).f45761c;
        }
        Pair V10 = V(aVar, iArr, dVar, str);
        if (V10 != null) {
            aVarArr[((Integer) V10.second).intValue()] = (r.a) V10.first;
        }
        for (int i10 = 0; i10 < d10; i10++) {
            int e10 = aVar.e(i10);
            if (!(e10 == 2 || e10 == 1 || e10 == 3)) {
                aVarArr[i10] = U(e10, aVar.f(i10), iArr[i10], dVar);
            }
        }
        return aVarArr;
    }

    /* access modifiers changed from: protected */
    public Pair T(t.a aVar, int[][][] iArr, int[] iArr2, d dVar) {
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < aVar.d()) {
                if (2 == aVar.e(i10) && aVar.f(i10).f33196a > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return W(1, aVar, iArr, new h(this, dVar, z10), new i());
    }

    /* access modifiers changed from: protected */
    public r.a U(int i10, V v10, int[][] iArr, d dVar) {
        T t10 = null;
        c cVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < v10.f33196a; i12++) {
            T b10 = v10.b(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < b10.f33189a; i13++) {
                if (I(iArr2[i13], dVar.f43845g0)) {
                    c cVar2 = new c(b10.b(i13), iArr2[i13]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        t10 = b10;
                        i11 = i13;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (t10 == null) {
            return null;
        }
        return new r.a(t10, i11);
    }

    /* access modifiers changed from: protected */
    public Pair V(t.a aVar, int[][][] iArr, d dVar, String str) {
        return W(3, aVar, iArr, new j(dVar, str), new k());
    }

    /* access modifiers changed from: protected */
    public Pair X(t.a aVar, int[][][] iArr, int[] iArr2, d dVar) {
        return W(2, aVar, iArr, new f(dVar, iArr2), new g());
    }

    public boolean d() {
        return true;
    }

    public void f() {
        f fVar;
        synchronized (this.f43805d) {
            try {
                if (M.f44981a >= 32 && (fVar = this.f43810i) != null) {
                    fVar.f();
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        super.f();
    }

    public void h(C3847e eVar) {
        boolean equals;
        synchronized (this.f43805d) {
            equals = this.f43811j.equals(eVar);
            this.f43811j = eVar;
        }
        if (!equals) {
            P();
        }
    }

    /* access modifiers changed from: protected */
    public final Pair l(t.a aVar, int[][][] iArr, int[] iArr2, C3070t.b bVar, n1 n1Var) {
        d dVar;
        c1 c1Var;
        f fVar;
        synchronized (this.f43805d) {
            try {
                dVar = this.f43809h;
                if (dVar.f43844f0 && M.f44981a >= 32 && (fVar = this.f43810i) != null) {
                    fVar.b(this, (Looper) C3645a.h(Looper.myLooper()));
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        int d10 = aVar.d();
        r.a[] S10 = S(aVar, iArr, iArr2, dVar);
        z(aVar, dVar, S10);
        y(aVar, dVar, S10);
        for (int i10 = 0; i10 < d10; i10++) {
            int e10 = aVar.e(i10);
            if (dVar.k(i10) || dVar.f43946z.contains(Integer.valueOf(e10))) {
                S10[i10] = null;
            }
        }
        r[] a10 = this.f43807f.a(S10, a(), bVar, n1Var);
        c1[] c1VarArr = new c1[d10];
        for (int i11 = 0; i11 < d10; i11++) {
            int e11 = aVar.e(i11);
            if (dVar.k(i11) || dVar.f43946z.contains(Integer.valueOf(e11)) || (aVar.e(i11) != -2 && a10[i11] == null)) {
                c1Var = null;
            } else {
                c1Var = c1.f45519b;
            }
            c1VarArr[i11] = c1Var;
        }
        if (dVar.f43846h0) {
            O(aVar, iArr, c1VarArr, a10);
        }
        return Pair.create(c1VarArr, a10);
    }

    public m(Context context, r.b bVar) {
        this(context, (y) d.j(context), bVar);
    }

    public m(Context context, y yVar, r.b bVar) {
        this(yVar, bVar, context);
    }

    private m(y yVar, r.b bVar, Context context) {
        this.f43805d = new Object();
        this.f43806e = context != null ? context.getApplicationContext() : null;
        this.f43807f = bVar;
        if (yVar instanceof d) {
            this.f43809h = (d) yVar;
        } else {
            this.f43809h = (context == null ? d.f43832l0 : d.j(context)).i().b0(yVar).A();
        }
        this.f43811j = C3847e.f46631g;
        boolean z10 = context != null && M.y0(context);
        this.f43808g = z10;
        if (!z10 && context != null && M.f44981a >= 32) {
            this.f43810i = f.g(context);
        }
        if (this.f43809h.f43844f0 && context == null) {
            s.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
