package v2;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.exoplayer.q0;
import androidx.media3.exoplayer.r0;
import com.adjust.sdk.network.ErrorCodes;
import com.google.android.gms.common.api.a;
import com.google.common.collect.C4763n;
import com.google.common.collect.C4770v;
import com.google.common.collect.O;
import f2.C1968c;
import f2.H;
import f2.I;
import f2.J;
import f2.K;
import f2.s;
import i2.C2076a;
import i2.L;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import nb.p;
import o2.U;
import t2.C2615C;
import t2.j0;
import v2.C2751a;
import v2.x;
import v2.z;

public class n extends z implements r0.a {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final O f27012k = O.b(new C2754d());

    /* renamed from: d  reason: collision with root package name */
    private final Object f27013d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f27014e;

    /* renamed from: f  reason: collision with root package name */
    private final x.b f27015f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f27016g;

    /* renamed from: h  reason: collision with root package name */
    private e f27017h;

    /* renamed from: i  reason: collision with root package name */
    private g f27018i;

    /* renamed from: j  reason: collision with root package name */
    private C1968c f27019j;

    private static final class b extends i implements Comparable {

        /* renamed from: e  reason: collision with root package name */
        private final int f27020e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f27021f;

        /* renamed from: g  reason: collision with root package name */
        private final String f27022g;

        /* renamed from: h  reason: collision with root package name */
        private final e f27023h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f27024i;

        /* renamed from: j  reason: collision with root package name */
        private final int f27025j;

        /* renamed from: k  reason: collision with root package name */
        private final int f27026k;

        /* renamed from: l  reason: collision with root package name */
        private final int f27027l;

        /* renamed from: m  reason: collision with root package name */
        private final boolean f27028m;

        /* renamed from: n  reason: collision with root package name */
        private final boolean f27029n;

        /* renamed from: o  reason: collision with root package name */
        private final int f27030o;

        /* renamed from: p  reason: collision with root package name */
        private final int f27031p;

        /* renamed from: q  reason: collision with root package name */
        private final boolean f27032q;

        /* renamed from: r  reason: collision with root package name */
        private final int f27033r;

        /* renamed from: s  reason: collision with root package name */
        private final int f27034s;

        /* renamed from: t  reason: collision with root package name */
        private final int f27035t;

        /* renamed from: u  reason: collision with root package name */
        private final int f27036u;

        /* renamed from: v  reason: collision with root package name */
        private final boolean f27037v;

        /* renamed from: w  reason: collision with root package name */
        private final boolean f27038w;

        public b(int i10, I i11, int i12, e eVar, int i13, boolean z10, p pVar, int i14) {
            super(i10, i11, i12);
            int i15;
            boolean z11;
            int i16;
            int i17;
            boolean z12;
            boolean z13;
            boolean z14;
            int i18;
            boolean z15;
            this.f27023h = eVar;
            if (eVar.f27073s0) {
                i15 = 24;
            } else {
                i15 = 16;
            }
            boolean z16 = true;
            if (!eVar.f27069o0 || (i14 & i15) == 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f27028m = z11;
            this.f27022g = n.X(this.f27116d.f20073d);
            this.f27024i = r0.E(i13, false);
            int i19 = 0;
            while (true) {
                int size = eVar.f19842n.size();
                i16 = a.e.API_PRIORITY_OTHER;
                if (i19 >= size) {
                    i17 = 0;
                    i19 = Integer.MAX_VALUE;
                    break;
                }
                i17 = n.G(this.f27116d, (String) eVar.f19842n.get(i19), false);
                if (i17 > 0) {
                    break;
                }
                i19++;
            }
            this.f27026k = i19;
            this.f27025j = i17;
            this.f27027l = n.K(this.f27116d.f20075f, eVar.f19843o);
            s sVar = this.f27116d;
            int i20 = sVar.f20075f;
            if (i20 == 0 || (i20 & 1) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f27029n = z12;
            if ((sVar.f20074e & 1) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f27032q = z13;
            int i21 = sVar.f20059B;
            this.f27033r = i21;
            this.f27034s = sVar.f20060C;
            int i22 = sVar.f20078i;
            this.f27035t = i22;
            if ((i22 == -1 || i22 <= eVar.f19845q) && ((i21 == -1 || i21 <= eVar.f19844p) && pVar.apply(sVar))) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f27021f = z14;
            String[] l02 = L.l0();
            int i23 = 0;
            while (true) {
                if (i23 >= l02.length) {
                    i18 = 0;
                    i23 = Integer.MAX_VALUE;
                    break;
                }
                i18 = n.G(this.f27116d, l02[i23], false);
                if (i18 > 0) {
                    break;
                }
                i23++;
            }
            this.f27030o = i23;
            this.f27031p = i18;
            int i24 = 0;
            while (true) {
                if (i24 < eVar.f19846r.size()) {
                    String str = this.f27116d.f20083n;
                    if (str != null && str.equals(eVar.f19846r.get(i24))) {
                        i16 = i24;
                        break;
                    }
                    i24++;
                } else {
                    break;
                }
            }
            this.f27036u = i16;
            if (r0.i(i13) == 128) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.f27037v = z15;
            this.f27038w = r0.s(i13) != 64 ? false : z16;
            this.f27020e = i(i13, z10, i15);
        }

        public static int c(List list, List list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static C4770v f(int i10, I i11, e eVar, int[] iArr, boolean z10, p pVar, int i12) {
            C4770v.a t10 = C4770v.t();
            I i13 = i11;
            for (int i14 = 0; i14 < i13.f19785a; i14++) {
                t10.a(new b(i10, i11, i14, eVar, iArr[i14], z10, pVar, i12));
            }
            return t10.k();
        }

        private int i(int i10, boolean z10, int i11) {
            if (!r0.E(i10, this.f27023h.f27075u0)) {
                return 0;
            }
            if (!this.f27021f && !this.f27023h.f27068n0) {
                return 0;
            }
            e eVar = this.f27023h;
            if (eVar.f19847s.f19859a == 2 && !n.Y(eVar, i10, this.f27116d)) {
                return 0;
            }
            if (r0.E(i10, false) && this.f27021f && this.f27116d.f20078i != -1) {
                e eVar2 = this.f27023h;
                if (eVar2.f19854z || eVar2.f19853y || ((!eVar2.f27077w0 && z10) || eVar2.f19847s.f19859a == 2 || (i10 & i11) == 0)) {
                    return 1;
                }
                return 2;
            }
            return 1;
        }

        public int a() {
            return this.f27020e;
        }

        /* renamed from: e */
        public int compareTo(b bVar) {
            O o10;
            if (!this.f27021f || !this.f27024i) {
                o10 = n.f27012k.g();
            } else {
                o10 = n.f27012k;
            }
            C4763n f10 = C4763n.j().g(this.f27024i, bVar.f27024i).f(Integer.valueOf(this.f27026k), Integer.valueOf(bVar.f27026k), O.d().g()).d(this.f27025j, bVar.f27025j).d(this.f27027l, bVar.f27027l).g(this.f27032q, bVar.f27032q).g(this.f27029n, bVar.f27029n).f(Integer.valueOf(this.f27030o), Integer.valueOf(bVar.f27030o), O.d().g()).d(this.f27031p, bVar.f27031p).g(this.f27021f, bVar.f27021f).f(Integer.valueOf(this.f27036u), Integer.valueOf(bVar.f27036u), O.d().g());
            if (this.f27023h.f19853y) {
                f10 = f10.f(Integer.valueOf(this.f27035t), Integer.valueOf(bVar.f27035t), n.f27012k.g());
            }
            C4763n f11 = f10.g(this.f27037v, bVar.f27037v).g(this.f27038w, bVar.f27038w).f(Integer.valueOf(this.f27033r), Integer.valueOf(bVar.f27033r), o10).f(Integer.valueOf(this.f27034s), Integer.valueOf(bVar.f27034s), o10);
            if (L.c(this.f27022g, bVar.f27022g)) {
                f11 = f11.f(Integer.valueOf(this.f27035t), Integer.valueOf(bVar.f27035t), o10);
            }
            return f11.i();
        }

        /* renamed from: j */
        public boolean b(b bVar) {
            int i10;
            String str;
            int i11;
            if ((this.f27023h.f27071q0 || ((i11 = this.f27116d.f20059B) != -1 && i11 == bVar.f27116d.f20059B)) && (this.f27028m || ((str = this.f27116d.f20083n) != null && TextUtils.equals(str, bVar.f27116d.f20083n)))) {
                e eVar = this.f27023h;
                if ((eVar.f27070p0 || ((i10 = this.f27116d.f20060C) != -1 && i10 == bVar.f27116d.f20060C)) && (eVar.f27072r0 || (this.f27037v == bVar.f27037v && this.f27038w == bVar.f27038w))) {
                    return true;
                }
            }
            return false;
        }
    }

    private static final class c extends i implements Comparable {

        /* renamed from: e  reason: collision with root package name */
        private final int f27039e;

        /* renamed from: f  reason: collision with root package name */
        private final int f27040f = this.f27116d.d();

        public c(int i10, I i11, int i12, e eVar, int i13) {
            super(i10, i11, i12);
            this.f27039e = r0.E(i13, eVar.f27075u0) ? 1 : 0;
        }

        public static int c(List list, List list2) {
            return ((c) list.get(0)).compareTo((c) list2.get(0));
        }

        public static C4770v f(int i10, I i11, e eVar, int[] iArr) {
            C4770v.a t10 = C4770v.t();
            for (int i12 = 0; i12 < i11.f19785a; i12++) {
                t10.a(new c(i10, i11, i12, eVar, iArr[i12]));
            }
            return t10.k();
        }

        public int a() {
            return this.f27039e;
        }

        /* renamed from: e */
        public int compareTo(c cVar) {
            return Integer.compare(this.f27040f, cVar.f27040f);
        }

        /* renamed from: i */
        public boolean b(c cVar) {
            return false;
        }
    }

    private static final class d implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f27041a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f27042b;

        public d(s sVar, int i10) {
            this.f27041a = (sVar.f20074e & 1) == 0 ? false : true;
            this.f27042b = r0.E(i10, false);
        }

        /* renamed from: a */
        public int compareTo(d dVar) {
            return C4763n.j().g(this.f27042b, dVar.f27042b).g(this.f27041a, dVar.f27041a).i();
        }
    }

    public static final class e extends K {

        /* renamed from: A0  reason: collision with root package name */
        public static final e f27043A0;

        /* renamed from: B0  reason: collision with root package name */
        public static final e f27044B0;

        /* renamed from: C0  reason: collision with root package name */
        private static final String f27045C0 = L.y0(1000);

        /* renamed from: D0  reason: collision with root package name */
        private static final String f27046D0 = L.y0(ErrorCodes.SERVER_RETRY_IN);

        /* renamed from: E0  reason: collision with root package name */
        private static final String f27047E0 = L.y0(ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);

        /* renamed from: F0  reason: collision with root package name */
        private static final String f27048F0 = L.y0(ErrorCodes.MALFORMED_URL_EXCEPTION);

        /* renamed from: G0  reason: collision with root package name */
        private static final String f27049G0 = L.y0(ErrorCodes.PROTOCOL_EXCEPTION);

        /* renamed from: H0  reason: collision with root package name */
        private static final String f27050H0 = L.y0(ErrorCodes.SOCKET_TIMEOUT_EXCEPTION);

        /* renamed from: I0  reason: collision with root package name */
        private static final String f27051I0 = L.y0(ErrorCodes.SSL_HANDSHAKE_EXCEPTION);

        /* renamed from: J0  reason: collision with root package name */
        private static final String f27052J0 = L.y0(ErrorCodes.IO_EXCEPTION);

        /* renamed from: K0  reason: collision with root package name */
        private static final String f27053K0 = L.y0(1008);

        /* renamed from: L0  reason: collision with root package name */
        private static final String f27054L0 = L.y0(1009);

        /* renamed from: M0  reason: collision with root package name */
        private static final String f27055M0 = L.y0(1010);

        /* renamed from: N0  reason: collision with root package name */
        private static final String f27056N0 = L.y0(1011);

        /* renamed from: O0  reason: collision with root package name */
        private static final String f27057O0 = L.y0(1012);

        /* renamed from: P0  reason: collision with root package name */
        private static final String f27058P0 = L.y0(1013);

        /* renamed from: Q0  reason: collision with root package name */
        private static final String f27059Q0 = L.y0(1014);

        /* renamed from: R0  reason: collision with root package name */
        private static final String f27060R0 = L.y0(1015);

        /* renamed from: S0  reason: collision with root package name */
        private static final String f27061S0 = L.y0(1016);

        /* renamed from: T0  reason: collision with root package name */
        private static final String f27062T0 = L.y0(1017);

        /* renamed from: U0  reason: collision with root package name */
        private static final String f27063U0 = L.y0(1018);

        /* renamed from: j0  reason: collision with root package name */
        public final boolean f27064j0;

        /* renamed from: k0  reason: collision with root package name */
        public final boolean f27065k0;

        /* renamed from: l0  reason: collision with root package name */
        public final boolean f27066l0;

        /* renamed from: m0  reason: collision with root package name */
        public final boolean f27067m0;

        /* renamed from: n0  reason: collision with root package name */
        public final boolean f27068n0;

        /* renamed from: o0  reason: collision with root package name */
        public final boolean f27069o0;

        /* renamed from: p0  reason: collision with root package name */
        public final boolean f27070p0;

        /* renamed from: q0  reason: collision with root package name */
        public final boolean f27071q0;

        /* renamed from: r0  reason: collision with root package name */
        public final boolean f27072r0;

        /* renamed from: s0  reason: collision with root package name */
        public final boolean f27073s0;

        /* renamed from: t0  reason: collision with root package name */
        public final boolean f27074t0;

        /* renamed from: u0  reason: collision with root package name */
        public final boolean f27075u0;

        /* renamed from: v0  reason: collision with root package name */
        public final boolean f27076v0;

        /* renamed from: w0  reason: collision with root package name */
        public final boolean f27077w0;

        /* renamed from: x0  reason: collision with root package name */
        public final boolean f27078x0;
        /* access modifiers changed from: private */

        /* renamed from: y0  reason: collision with root package name */
        public final SparseArray f27079y0;
        /* access modifiers changed from: private */

        /* renamed from: z0  reason: collision with root package name */
        public final SparseBooleanArray f27080z0;

        public static final class a extends K.c {
            /* access modifiers changed from: private */

            /* renamed from: C  reason: collision with root package name */
            public boolean f27081C;
            /* access modifiers changed from: private */

            /* renamed from: D  reason: collision with root package name */
            public boolean f27082D;
            /* access modifiers changed from: private */

            /* renamed from: E  reason: collision with root package name */
            public boolean f27083E;
            /* access modifiers changed from: private */

            /* renamed from: F  reason: collision with root package name */
            public boolean f27084F;
            /* access modifiers changed from: private */

            /* renamed from: G  reason: collision with root package name */
            public boolean f27085G;
            /* access modifiers changed from: private */

            /* renamed from: H  reason: collision with root package name */
            public boolean f27086H;
            /* access modifiers changed from: private */

            /* renamed from: I  reason: collision with root package name */
            public boolean f27087I;
            /* access modifiers changed from: private */

            /* renamed from: J  reason: collision with root package name */
            public boolean f27088J;
            /* access modifiers changed from: private */

            /* renamed from: K  reason: collision with root package name */
            public boolean f27089K;
            /* access modifiers changed from: private */

            /* renamed from: L  reason: collision with root package name */
            public boolean f27090L;
            /* access modifiers changed from: private */

            /* renamed from: M  reason: collision with root package name */
            public boolean f27091M;
            /* access modifiers changed from: private */

            /* renamed from: N  reason: collision with root package name */
            public boolean f27092N;
            /* access modifiers changed from: private */

            /* renamed from: O  reason: collision with root package name */
            public boolean f27093O;
            /* access modifiers changed from: private */

            /* renamed from: P  reason: collision with root package name */
            public boolean f27094P;
            /* access modifiers changed from: private */

            /* renamed from: Q  reason: collision with root package name */
            public boolean f27095Q;
            /* access modifiers changed from: private */

            /* renamed from: R  reason: collision with root package name */
            public final SparseArray f27096R;
            /* access modifiers changed from: private */

            /* renamed from: S  reason: collision with root package name */
            public final SparseBooleanArray f27097S;

            private static SparseArray f0(SparseArray sparseArray) {
                SparseArray sparseArray2 = new SparseArray();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            private void g0() {
                this.f27081C = true;
                this.f27082D = false;
                this.f27083E = true;
                this.f27084F = false;
                this.f27085G = true;
                this.f27086H = false;
                this.f27087I = false;
                this.f27088J = false;
                this.f27089K = false;
                this.f27090L = true;
                this.f27091M = true;
                this.f27092N = true;
                this.f27093O = false;
                this.f27094P = true;
                this.f27095Q = false;
            }

            /* renamed from: d0 */
            public e C() {
                return new e(this);
            }

            /* renamed from: e0 */
            public a D(int i10) {
                super.D(i10);
                return this;
            }

            /* access modifiers changed from: protected */
            public a h0(K k10) {
                super.F(k10);
                return this;
            }

            /* renamed from: i0 */
            public a G(int i10) {
                super.G(i10);
                return this;
            }

            /* renamed from: j0 */
            public a H(J j10) {
                super.H(j10);
                return this;
            }

            /* renamed from: k0 */
            public a I(Context context) {
                super.I(context);
                return this;
            }

            /* renamed from: l0 */
            public a J(int i10, boolean z10) {
                super.J(i10, z10);
                return this;
            }

            /* renamed from: m0 */
            public a K(int i10, int i11, boolean z10) {
                super.K(i10, i11, z10);
                return this;
            }

            /* renamed from: n0 */
            public a L(Context context, boolean z10) {
                super.L(context, z10);
                return this;
            }

            public a() {
                this.f27096R = new SparseArray();
                this.f27097S = new SparseBooleanArray();
                g0();
            }

            public a(Context context) {
                super(context);
                this.f27096R = new SparseArray();
                this.f27097S = new SparseBooleanArray();
                g0();
            }

            private a(e eVar) {
                super((K) eVar);
                this.f27081C = eVar.f27064j0;
                this.f27082D = eVar.f27065k0;
                this.f27083E = eVar.f27066l0;
                this.f27084F = eVar.f27067m0;
                this.f27085G = eVar.f27068n0;
                this.f27086H = eVar.f27069o0;
                this.f27087I = eVar.f27070p0;
                this.f27088J = eVar.f27071q0;
                this.f27089K = eVar.f27072r0;
                this.f27090L = eVar.f27073s0;
                this.f27091M = eVar.f27074t0;
                this.f27092N = eVar.f27075u0;
                this.f27093O = eVar.f27076v0;
                this.f27094P = eVar.f27077w0;
                this.f27095Q = eVar.f27078x0;
                this.f27096R = f0(eVar.f27079y0);
                this.f27097S = eVar.f27080z0.clone();
            }
        }

        static {
            e d02 = new a().C();
            f27043A0 = d02;
            f27044B0 = d02;
        }

        private static boolean d(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
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

        private static boolean e(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (indexOfKey < 0 || !f((Map) sparseArray.valueAt(i10), (Map) sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean f(java.util.Map r4, java.util.Map r5) {
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
                t2.j0 r1 = (t2.j0) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L_0x003a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = i2.L.c(r0, r1)
                if (r0 != 0) goto L_0x0014
            L_0x003a:
                return r2
            L_0x003b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: v2.n.e.f(java.util.Map, java.util.Map):boolean");
        }

        public static e h(Context context) {
            return new a(context).C();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (super.equals(eVar) && this.f27064j0 == eVar.f27064j0 && this.f27065k0 == eVar.f27065k0 && this.f27066l0 == eVar.f27066l0 && this.f27067m0 == eVar.f27067m0 && this.f27068n0 == eVar.f27068n0 && this.f27069o0 == eVar.f27069o0 && this.f27070p0 == eVar.f27070p0 && this.f27071q0 == eVar.f27071q0 && this.f27072r0 == eVar.f27072r0 && this.f27073s0 == eVar.f27073s0 && this.f27074t0 == eVar.f27074t0 && this.f27075u0 == eVar.f27075u0 && this.f27076v0 == eVar.f27076v0 && this.f27077w0 == eVar.f27077w0 && this.f27078x0 == eVar.f27078x0 && d(this.f27080z0, eVar.f27080z0) && e(this.f27079y0, eVar.f27079y0)) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public a a() {
            return new a();
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f27064j0 ? 1 : 0)) * 31) + (this.f27065k0 ? 1 : 0)) * 31) + (this.f27066l0 ? 1 : 0)) * 31) + (this.f27067m0 ? 1 : 0)) * 31) + (this.f27068n0 ? 1 : 0)) * 31) + (this.f27069o0 ? 1 : 0)) * 31) + (this.f27070p0 ? 1 : 0)) * 31) + (this.f27071q0 ? 1 : 0)) * 31) + (this.f27072r0 ? 1 : 0)) * 31) + (this.f27073s0 ? 1 : 0)) * 31) + (this.f27074t0 ? 1 : 0)) * 31) + (this.f27075u0 ? 1 : 0)) * 31) + (this.f27076v0 ? 1 : 0)) * 31) + (this.f27077w0 ? 1 : 0)) * 31) + (this.f27078x0 ? 1 : 0);
        }

        public boolean i(int i10) {
            return this.f27080z0.get(i10);
        }

        public f j(int i10, j0 j0Var) {
            Map map = (Map) this.f27079y0.get(i10);
            if (map == null) {
                return null;
            }
            android.support.v4.media.session.c.a(map.get(j0Var));
            return null;
        }

        public boolean k(int i10, j0 j0Var) {
            Map map = (Map) this.f27079y0.get(i10);
            if (map == null || !map.containsKey(j0Var)) {
                return false;
            }
            return true;
        }

        private e(a aVar) {
            super(aVar);
            this.f27064j0 = aVar.f27081C;
            this.f27065k0 = aVar.f27082D;
            this.f27066l0 = aVar.f27083E;
            this.f27067m0 = aVar.f27084F;
            this.f27068n0 = aVar.f27085G;
            this.f27069o0 = aVar.f27086H;
            this.f27070p0 = aVar.f27087I;
            this.f27071q0 = aVar.f27088J;
            this.f27072r0 = aVar.f27089K;
            this.f27073s0 = aVar.f27090L;
            this.f27074t0 = aVar.f27091M;
            this.f27075u0 = aVar.f27092N;
            this.f27076v0 = aVar.f27093O;
            this.f27077w0 = aVar.f27094P;
            this.f27078x0 = aVar.f27095Q;
            this.f27079y0 = aVar.f27096R;
            this.f27080z0 = aVar.f27097S;
        }
    }

    public static final class f {
    }

    private static class g {

        /* renamed from: a  reason: collision with root package name */
        private final Spatializer f27098a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f27099b;

        /* renamed from: c  reason: collision with root package name */
        private Handler f27100c;

        /* renamed from: d  reason: collision with root package name */
        private Spatializer$OnSpatializerStateChangedListener f27101d;

        class a implements Spatializer$OnSpatializerStateChangedListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ n f27102a;

            a(n nVar) {
                this.f27102a = nVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f27102a.V();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f27102a.V();
            }
        }

        private g(Spatializer spatializer) {
            boolean z10;
            this.f27098a = spatializer;
            if (spatializer.getImmersiveAudioLevel() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f27099b = z10;
        }

        public static g g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new g(audioManager.getSpatializer());
        }

        public boolean a(C1968c cVar, s sVar) {
            int i10;
            if (!"audio/eac3-joc".equals(sVar.f20083n) || sVar.f20059B != 16) {
                i10 = sVar.f20059B;
            } else {
                i10 = 12;
            }
            int L10 = L.L(i10);
            if (L10 == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(L10);
            int i11 = sVar.f20060C;
            if (i11 != -1) {
                channelMask.setSampleRate(i11);
            }
            return this.f27098a.canBeSpatialized(cVar.a().f19963a, channelMask.build());
        }

        public void b(n nVar, Looper looper) {
            if (this.f27101d == null && this.f27100c == null) {
                this.f27101d = new a(nVar);
                Handler handler = new Handler(looper);
                this.f27100c = handler;
                Spatializer spatializer = this.f27098a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new U(handler), this.f27101d);
            }
        }

        public boolean c() {
            return this.f27098a.isAvailable();
        }

        public boolean d() {
            return this.f27098a.isEnabled();
        }

        public boolean e() {
            return this.f27099b;
        }

        public void f() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f27101d;
            if (spatializer$OnSpatializerStateChangedListener != null && this.f27100c != null) {
                this.f27098a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
                ((Handler) L.h(this.f27100c)).removeCallbacksAndMessages((Object) null);
                this.f27100c = null;
                this.f27101d = null;
            }
        }
    }

    private static final class h extends i implements Comparable {

        /* renamed from: e  reason: collision with root package name */
        private final int f27104e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f27105f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f27106g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f27107h;

        /* renamed from: i  reason: collision with root package name */
        private final int f27108i;

        /* renamed from: j  reason: collision with root package name */
        private final int f27109j;

        /* renamed from: k  reason: collision with root package name */
        private final int f27110k;

        /* renamed from: l  reason: collision with root package name */
        private final int f27111l;

        /* renamed from: m  reason: collision with root package name */
        private final boolean f27112m;

        public h(int i10, I i11, int i12, e eVar, int i13, String str) {
            super(i10, i11, i12);
            boolean z10;
            boolean z11;
            C4770v vVar;
            int i14;
            boolean z12;
            boolean z13;
            boolean z14;
            int i15 = 0;
            this.f27105f = r0.E(i13, false);
            int i16 = this.f27116d.f20074e & (~eVar.f19850v);
            if ((i16 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f27106g = z10;
            if ((i16 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f27107h = z11;
            if (eVar.f19848t.isEmpty()) {
                vVar = C4770v.H("");
            } else {
                vVar = eVar.f19848t;
            }
            int i17 = 0;
            while (true) {
                if (i17 >= vVar.size()) {
                    i17 = a.e.API_PRIORITY_OTHER;
                    i14 = 0;
                    break;
                }
                i14 = n.G(this.f27116d, (String) vVar.get(i17), eVar.f19851w);
                if (i14 > 0) {
                    break;
                }
                i17++;
            }
            this.f27108i = i17;
            this.f27109j = i14;
            int y10 = n.K(this.f27116d.f20075f, eVar.f19849u);
            this.f27110k = y10;
            if ((this.f27116d.f20075f & 1088) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f27112m = z12;
            if (n.X(str) == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            int G10 = n.G(this.f27116d, str, z13);
            this.f27111l = G10;
            if (i14 > 0 || ((eVar.f19848t.isEmpty() && y10 > 0) || this.f27106g || (this.f27107h && G10 > 0))) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (r0.E(i13, eVar.f27075u0) && z14) {
                i15 = 1;
            }
            this.f27104e = i15;
        }

        public static int c(List list, List list2) {
            return ((h) list.get(0)).compareTo((h) list2.get(0));
        }

        public static C4770v f(int i10, I i11, e eVar, int[] iArr, String str) {
            C4770v.a t10 = C4770v.t();
            for (int i12 = 0; i12 < i11.f19785a; i12++) {
                t10.a(new h(i10, i11, i12, eVar, iArr[i12], str));
            }
            return t10.k();
        }

        public int a() {
            return this.f27104e;
        }

        /* renamed from: e */
        public int compareTo(h hVar) {
            O o10;
            C4763n g10 = C4763n.j().g(this.f27105f, hVar.f27105f).f(Integer.valueOf(this.f27108i), Integer.valueOf(hVar.f27108i), O.d().g()).d(this.f27109j, hVar.f27109j).d(this.f27110k, hVar.f27110k).g(this.f27106g, hVar.f27106g);
            Boolean valueOf = Boolean.valueOf(this.f27107h);
            Boolean valueOf2 = Boolean.valueOf(hVar.f27107h);
            if (this.f27109j == 0) {
                o10 = O.d();
            } else {
                o10 = O.d().g();
            }
            C4763n d10 = g10.f(valueOf, valueOf2, o10).d(this.f27111l, hVar.f27111l);
            if (this.f27110k == 0) {
                d10 = d10.h(this.f27112m, hVar.f27112m);
            }
            return d10.i();
        }

        /* renamed from: i */
        public boolean b(h hVar) {
            return false;
        }
    }

    private static abstract class i {

        /* renamed from: a  reason: collision with root package name */
        public final int f27113a;

        /* renamed from: b  reason: collision with root package name */
        public final I f27114b;

        /* renamed from: c  reason: collision with root package name */
        public final int f27115c;

        /* renamed from: d  reason: collision with root package name */
        public final s f27116d;

        public interface a {
            List a(int i10, I i11, int[] iArr);
        }

        public i(int i10, I i11, int i12) {
            this.f27113a = i10;
            this.f27114b = i11;
            this.f27115c = i12;
            this.f27116d = i11.a(i12);
        }

        public abstract int a();

        public abstract boolean b(i iVar);
    }

    private static final class j extends i {

        /* renamed from: e  reason: collision with root package name */
        private final boolean f27117e;

        /* renamed from: f  reason: collision with root package name */
        private final e f27118f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f27119g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f27120h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f27121i;

        /* renamed from: j  reason: collision with root package name */
        private final int f27122j;

        /* renamed from: k  reason: collision with root package name */
        private final int f27123k;

        /* renamed from: l  reason: collision with root package name */
        private final int f27124l;

        /* renamed from: m  reason: collision with root package name */
        private final int f27125m;

        /* renamed from: n  reason: collision with root package name */
        private final boolean f27126n;

        /* renamed from: o  reason: collision with root package name */
        private final boolean f27127o;

        /* renamed from: p  reason: collision with root package name */
        private final int f27128p;

        /* renamed from: q  reason: collision with root package name */
        private final boolean f27129q;

        /* renamed from: r  reason: collision with root package name */
        private final boolean f27130r;

        /* renamed from: s  reason: collision with root package name */
        private final int f27131s;

        /* JADX WARNING: Removed duplicated region for block: B:54:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0092  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x00b5  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00b7  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x00c3  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x00f3  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x00d9 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public j(int r5, f2.I r6, int r7, v2.n.e r8, int r9, int r10, boolean r11) {
            /*
                r4 = this;
                r4.<init>(r5, r6, r7)
                r4.f27118f = r8
                boolean r5 = r8.f27066l0
                if (r5 == 0) goto L_0x000c
                r5 = 24
                goto L_0x000e
            L_0x000c:
                r5 = 16
            L_0x000e:
                boolean r6 = r8.f27065k0
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
                r4.f27127o = r6
                r6 = -1082130432(0xffffffffbf800000, float:-1.0)
                r10 = -1
                if (r11 == 0) goto L_0x004b
                f2.s r1 = r4.f27116d
                int r2 = r1.f20089t
                if (r2 == r10) goto L_0x002c
                int r3 = r8.f19829a
                if (r2 > r3) goto L_0x004b
            L_0x002c:
                int r2 = r1.f20090u
                if (r2 == r10) goto L_0x0034
                int r3 = r8.f19830b
                if (r2 > r3) goto L_0x004b
            L_0x0034:
                float r2 = r1.f20091v
                int r3 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r3 == 0) goto L_0x0041
                int r3 = r8.f19831c
                float r3 = (float) r3
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 > 0) goto L_0x004b
            L_0x0041:
                int r1 = r1.f20078i
                if (r1 == r10) goto L_0x0049
                int r2 = r8.f19832d
                if (r1 > r2) goto L_0x004b
            L_0x0049:
                r1 = r0
                goto L_0x004c
            L_0x004b:
                r1 = r7
            L_0x004c:
                r4.f27117e = r1
                if (r11 == 0) goto L_0x0079
                f2.s r11 = r4.f27116d
                int r1 = r11.f20089t
                if (r1 == r10) goto L_0x005a
                int r2 = r8.f19833e
                if (r1 < r2) goto L_0x0079
            L_0x005a:
                int r1 = r11.f20090u
                if (r1 == r10) goto L_0x0062
                int r2 = r8.f19834f
                if (r1 < r2) goto L_0x0079
            L_0x0062:
                float r1 = r11.f20091v
                int r2 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r2 == 0) goto L_0x006f
                int r2 = r8.f19835g
                float r2 = (float) r2
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 < 0) goto L_0x0079
            L_0x006f:
                int r11 = r11.f20078i
                if (r11 == r10) goto L_0x0077
                int r10 = r8.f19836h
                if (r11 < r10) goto L_0x0079
            L_0x0077:
                r10 = r0
                goto L_0x007a
            L_0x0079:
                r10 = r7
            L_0x007a:
                r4.f27119g = r10
                boolean r10 = androidx.media3.exoplayer.r0.E(r9, r7)
                r4.f27120h = r10
                f2.s r10 = r4.f27116d
                float r11 = r10.f20091v
                int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r6 == 0) goto L_0x0092
                r6 = 1092616192(0x41200000, float:10.0)
                int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r6 < 0) goto L_0x0092
                r6 = r0
                goto L_0x0093
            L_0x0092:
                r6 = r7
            L_0x0093:
                r4.f27121i = r6
                int r6 = r10.f20078i
                r4.f27122j = r6
                int r6 = r10.d()
                r4.f27123k = r6
                f2.s r6 = r4.f27116d
                int r6 = r6.f20075f
                int r10 = r8.f19841m
                int r6 = v2.n.K(r6, r10)
                r4.f27125m = r6
                f2.s r6 = r4.f27116d
                int r6 = r6.f20075f
                if (r6 == 0) goto L_0x00b7
                r6 = r6 & r0
                if (r6 == 0) goto L_0x00b5
                goto L_0x00b7
            L_0x00b5:
                r6 = r7
                goto L_0x00b8
            L_0x00b7:
                r6 = r0
            L_0x00b8:
                r4.f27126n = r6
                r6 = r7
            L_0x00bb:
                com.google.common.collect.v r10 = r8.f19840l
                int r10 = r10.size()
                if (r6 >= r10) goto L_0x00d9
                f2.s r10 = r4.f27116d
                java.lang.String r10 = r10.f20083n
                if (r10 == 0) goto L_0x00d6
                com.google.common.collect.v r11 = r8.f19840l
                java.lang.Object r11 = r11.get(r6)
                boolean r10 = r10.equals(r11)
                if (r10 == 0) goto L_0x00d6
                goto L_0x00dc
            L_0x00d6:
                int r6 = r6 + 1
                goto L_0x00bb
            L_0x00d9:
                r6 = 2147483647(0x7fffffff, float:NaN)
            L_0x00dc:
                r4.f27124l = r6
                int r6 = androidx.media3.exoplayer.r0.i(r9)
                r8 = 128(0x80, float:1.794E-43)
                if (r6 != r8) goto L_0x00e8
                r6 = r0
                goto L_0x00e9
            L_0x00e8:
                r6 = r7
            L_0x00e9:
                r4.f27129q = r6
                int r6 = androidx.media3.exoplayer.r0.s(r9)
                r8 = 64
                if (r6 != r8) goto L_0x00f4
                r7 = r0
            L_0x00f4:
                r4.f27130r = r7
                f2.s r6 = r4.f27116d
                java.lang.String r6 = r6.f20083n
                int r6 = v2.n.L(r6)
                r4.f27131s = r6
                int r5 = r4.m(r9, r5)
                r4.f27128p = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v2.n.j.<init>(int, f2.I, int, v2.n$e, int, int, boolean):void");
        }

        /* access modifiers changed from: private */
        public static int f(j jVar, j jVar2) {
            C4763n g10 = C4763n.j().g(jVar.f27120h, jVar2.f27120h).d(jVar.f27125m, jVar2.f27125m).g(jVar.f27126n, jVar2.f27126n).g(jVar.f27121i, jVar2.f27121i).g(jVar.f27117e, jVar2.f27117e).g(jVar.f27119g, jVar2.f27119g).f(Integer.valueOf(jVar.f27124l), Integer.valueOf(jVar2.f27124l), O.d().g()).g(jVar.f27129q, jVar2.f27129q).g(jVar.f27130r, jVar2.f27130r);
            if (jVar.f27129q && jVar.f27130r) {
                g10 = g10.d(jVar.f27131s, jVar2.f27131s);
            }
            return g10.i();
        }

        /* access modifiers changed from: private */
        public static int i(j jVar, j jVar2) {
            O o10;
            if (!jVar.f27117e || !jVar.f27120h) {
                o10 = n.f27012k.g();
            } else {
                o10 = n.f27012k;
            }
            C4763n j10 = C4763n.j();
            if (jVar.f27118f.f19853y) {
                j10 = j10.f(Integer.valueOf(jVar.f27122j), Integer.valueOf(jVar2.f27122j), n.f27012k.g());
            }
            return j10.f(Integer.valueOf(jVar.f27123k), Integer.valueOf(jVar2.f27123k), o10).f(Integer.valueOf(jVar.f27122j), Integer.valueOf(jVar2.f27122j), o10).i();
        }

        public static int j(List list, List list2) {
            return C4763n.j().f((j) Collections.max(list, new v()), (j) Collections.max(list2, new v()), new v()).d(list.size(), list2.size()).f((j) Collections.max(list, new w()), (j) Collections.max(list2, new w()), new w()).i();
        }

        public static C4770v l(int i10, I i11, e eVar, int[] iArr, int i12) {
            boolean z10;
            I i13 = i11;
            e eVar2 = eVar;
            int x10 = n.H(i13, eVar2.f19837i, eVar2.f19838j, eVar2.f19839k);
            C4770v.a t10 = C4770v.t();
            for (int i14 = 0; i14 < i13.f19785a; i14++) {
                int d10 = i13.a(i14).d();
                if (x10 == Integer.MAX_VALUE || (d10 != -1 && d10 <= x10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t10.a(new j(i10, i11, i14, eVar, iArr[i14], i12, z10));
            }
            return t10.k();
        }

        private int m(int i10, int i11) {
            if ((this.f27116d.f20075f & 16384) != 0 || !r0.E(i10, this.f27118f.f27075u0)) {
                return 0;
            }
            if (!this.f27117e && !this.f27118f.f27064j0) {
                return 0;
            }
            if (r0.E(i10, false) && this.f27119g && this.f27117e && this.f27116d.f20078i != -1) {
                e eVar = this.f27118f;
                if (eVar.f19854z || eVar.f19853y || (i10 & i11) == 0) {
                    return 1;
                }
                return 2;
            }
            return 1;
        }

        public int a() {
            return this.f27128p;
        }

        /* renamed from: o */
        public boolean b(j jVar) {
            if ((this.f27127o || L.c(this.f27116d.f20083n, jVar.f27116d.f20083n)) && (this.f27118f.f27067m0 || (this.f27129q == jVar.f27129q && this.f27130r == jVar.f27130r))) {
                return true;
            }
            return false;
        }
    }

    public n(Context context) {
        this(context, new C2751a.b());
    }

    private static void D(z.a aVar, e eVar, x.a[] aVarArr) {
        int d10 = aVar.d();
        for (int i10 = 0; i10 < d10; i10++) {
            j0 f10 = aVar.f(i10);
            if (eVar.k(i10, f10)) {
                eVar.j(i10, f10);
                aVarArr[i10] = null;
            }
        }
    }

    private static void E(z.a aVar, K k10, x.a[] aVarArr) {
        x.a aVar2;
        int d10 = aVar.d();
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < d10; i10++) {
            F(aVar.f(i10), k10, hashMap);
        }
        F(aVar.h(), k10, hashMap);
        for (int i11 = 0; i11 < d10; i11++) {
            J j10 = (J) hashMap.get(Integer.valueOf(aVar.e(i11)));
            if (j10 != null) {
                if (j10.f19793b.isEmpty() || aVar.f(i11).d(j10.f19792a) == -1) {
                    aVar2 = null;
                } else {
                    aVar2 = new x.a(j10.f19792a, com.google.common.primitives.f.n(j10.f19793b));
                }
                aVarArr[i11] = aVar2;
            }
        }
    }

    private static void F(j0 j0Var, K k10, Map map) {
        J j10;
        for (int i10 = 0; i10 < j0Var.f26271a; i10++) {
            J j11 = (J) k10.f19827A.get(j0Var.b(i10));
            if (j11 != null && ((j10 = (J) map.get(Integer.valueOf(j11.a()))) == null || (j10.f19793b.isEmpty() && !j11.f19793b.isEmpty()))) {
                map.put(Integer.valueOf(j11.a()), j11);
            }
        }
    }

    protected static int G(s sVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(sVar.f20073d)) {
            return 4;
        }
        String X10 = X(str);
        String X11 = X(sVar.f20073d);
        if (X11 == null || X10 == null) {
            if (!z10 || X11 != null) {
                return 0;
            }
            return 1;
        } else if (X11.startsWith(X10) || X10.startsWith(X11)) {
            return 3;
        } else {
            if (L.b1(X11, "-")[0].equals(L.b1(X10, "-")[0])) {
                return 2;
            }
            return 0;
        }
    }

    /* access modifiers changed from: private */
    public static int H(I i10, int i11, int i12, boolean z10) {
        int i13;
        int i14 = a.e.API_PRIORITY_OTHER;
        if (!(i11 == Integer.MAX_VALUE || i12 == Integer.MAX_VALUE)) {
            for (int i15 = 0; i15 < i10.f19785a; i15++) {
                s a10 = i10.a(i15);
                int i16 = a10.f20089t;
                if (i16 > 0 && (i13 = a10.f20090u) > 0) {
                    Point I10 = I(z10, i11, i12, i16, i13);
                    int i17 = a10.f20089t;
                    int i18 = a10.f20090u;
                    int i19 = i17 * i18;
                    if (i17 >= ((int) (((float) I10.x) * 0.98f)) && i18 >= ((int) (((float) I10.y) * 0.98f)) && i19 < i14) {
                        i14 = i19;
                    }
                }
            }
        }
        return i14;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r1 != r3) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Point I(boolean r3, int r4, int r5, int r6, int r7) {
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
            int r4 = i2.L.j(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L_0x0022:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = i2.L.j(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.n.I(boolean, int, int, int, int):android.graphics.Point");
    }

    /* access modifiers changed from: private */
    public static int K(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return a.e.API_PRIORITY_OTHER;
    }

    /* access modifiers changed from: private */
    public static int L(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1662735862:
                if (str.equals("video/av01")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 2;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: private */
    public boolean M(s sVar) {
        boolean z10;
        g gVar;
        g gVar2;
        synchronized (this.f27013d) {
            try {
                if (this.f27017h.f27074t0 && !this.f27016g && sVar.f20059B > 2) {
                    if (N(sVar)) {
                        if (L.f22072a >= 32 && (gVar2 = this.f27018i) != null && gVar2.e()) {
                        }
                    }
                    if (L.f22072a < 32 || (gVar = this.f27018i) == null || !gVar.e() || !this.f27018i.c() || !this.f27018i.d() || !this.f27018i.a(this.f27019j, sVar)) {
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

    private static boolean N(s sVar) {
        String str = sVar.f20083n;
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

    /* access modifiers changed from: private */
    public /* synthetic */ List O(e eVar, boolean z10, int[] iArr, int i10, I i11, int[] iArr2) {
        return b.f(i10, i11, eVar, iArr2, z10, new m(this), iArr[i10]);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int S(Integer num, Integer num2) {
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

    private static void T(e eVar, z.a aVar, int[][][] iArr, m2.z[] zVarArr, x[] xVarArr) {
        int i10;
        int i11 = -1;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        while (i12 < aVar.d()) {
            int e10 = aVar.e(i12);
            x xVar = xVarArr[i12];
            if (e10 == 1 || xVar == null) {
                if (e10 == 1 && xVar != null && xVar.length() == 1) {
                    if (Y(eVar, iArr[i12][aVar.f(i12).d(xVar.g())][xVar.c(0)], xVar.j())) {
                        i13++;
                        i11 = i12;
                    }
                }
                i12++;
            } else {
                return;
            }
        }
        if (i13 == 1) {
            if (eVar.f19847s.f19860b) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            m2.z zVar = zVarArr[i11];
            if (zVar != null && zVar.f23737b) {
                z10 = true;
            }
            zVarArr[i11] = new m2.z(i10, z10);
        }
    }

    private static void U(z.a aVar, int[][][] iArr, m2.z[] zVarArr, x[] xVarArr) {
        boolean z10;
        boolean z11;
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= aVar.d()) {
                z10 = true;
                break;
            }
            int e10 = aVar.e(i12);
            x xVar = xVarArr[i12];
            if ((e10 == 1 || e10 == 2) && xVar != null && Z(iArr[i12], aVar.f(i12), xVar)) {
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
        if (i11 == -1 || i10 == -1) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 && z11) {
            m2.z zVar = new m2.z(0, true);
            zVarArr[i11] = zVar;
            zVarArr[i10] = zVar;
        }
    }

    /* access modifiers changed from: private */
    public void V() {
        boolean z10;
        g gVar;
        synchronized (this.f27013d) {
            try {
                if (!this.f27017h.f27074t0 || this.f27016g || L.f22072a < 32 || (gVar = this.f27018i) == null || !gVar.e()) {
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
            f();
        }
    }

    private void W(q0 q0Var) {
        boolean z10;
        synchronized (this.f27013d) {
            z10 = this.f27017h.f27078x0;
        }
        if (z10) {
            g(q0Var);
        }
    }

    protected static String X(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* access modifiers changed from: private */
    public static boolean Y(e eVar, int i10, s sVar) {
        boolean z10;
        boolean z11;
        if (r0.I(i10) == 0) {
            return false;
        }
        if (eVar.f19847s.f19861c && (r0.I(i10) & 2048) == 0) {
            return false;
        }
        if (!eVar.f19847s.f19860b) {
            return true;
        }
        if (sVar.f20062E == 0 && sVar.f20063F == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((r0.I(i10) & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 || z11) {
            return true;
        }
        return false;
    }

    private static boolean Z(int[][] iArr, j0 j0Var, x xVar) {
        if (xVar == null) {
            return false;
        }
        int d10 = j0Var.d(xVar.g());
        for (int i10 = 0; i10 < xVar.length(); i10++) {
            if (r0.m(iArr[d10][xVar.c(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private Pair f0(int i10, z.a aVar, int[][][] iArr, i.a aVar2, Comparator comparator) {
        int i11;
        Object obj;
        z.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int d10 = aVar.d();
        int i12 = 0;
        while (i12 < d10) {
            if (i10 == aVar3.e(i12)) {
                j0 f10 = aVar3.f(i12);
                int i13 = 0;
                while (i13 < f10.f26271a) {
                    I b10 = f10.b(i13);
                    List a10 = aVar2.a(i12, b10, iArr[i12][i13]);
                    boolean[] zArr = new boolean[b10.f19785a];
                    int i14 = 0;
                    while (i14 < b10.f19785a) {
                        i iVar = (i) a10.get(i14);
                        int a11 = iVar.a();
                        if (zArr[i14] || a11 == 0) {
                            i11 = d10;
                        } else {
                            if (a11 == 1) {
                                obj = C4770v.H(iVar);
                                i11 = d10;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(iVar);
                                int i15 = i14 + 1;
                                while (i15 < b10.f19785a) {
                                    i iVar2 = (i) a10.get(i15);
                                    int i16 = d10;
                                    if (iVar2.a() == 2 && iVar.b(iVar2)) {
                                        arrayList2.add(iVar2);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    z.a aVar4 = aVar;
                                    d10 = i16;
                                }
                                i11 = d10;
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        i14++;
                        z.a aVar5 = aVar;
                        d10 = i11;
                    }
                    int i17 = d10;
                    i13++;
                    z.a aVar6 = aVar;
                }
            }
            i.a aVar7 = aVar2;
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
            iArr2[i18] = ((i) list.get(i18)).f27115c;
        }
        i iVar3 = (i) list.get(0);
        return Pair.create(new x.a(iVar3.f27114b, iArr2), Integer.valueOf(iVar3.f27113a));
    }

    private void h0(e eVar) {
        boolean equals;
        C2076a.e(eVar);
        synchronized (this.f27013d) {
            equals = this.f27017h.equals(eVar);
            this.f27017h = eVar;
        }
        if (!equals) {
            if (eVar.f27074t0 && this.f27014e == null) {
                i2.p.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            f();
        }
    }

    /* renamed from: J */
    public e b() {
        e eVar;
        synchronized (this.f27013d) {
            eVar = this.f27017h;
        }
        return eVar;
    }

    /* access modifiers changed from: protected */
    public x.a[] a0(z.a aVar, int[][][] iArr, int[] iArr2, e eVar) {
        Pair pair;
        int d10 = aVar.d();
        x.a[] aVarArr = new x.a[d10];
        Pair g02 = g0(aVar, iArr, iArr2, eVar);
        String str = null;
        if (eVar.f19852x || g02 == null) {
            pair = c0(aVar, iArr, eVar);
        } else {
            pair = null;
        }
        if (pair != null) {
            aVarArr[((Integer) pair.second).intValue()] = (x.a) pair.first;
        } else if (g02 != null) {
            aVarArr[((Integer) g02.second).intValue()] = (x.a) g02.first;
        }
        Pair b02 = b0(aVar, iArr, iArr2, eVar);
        if (b02 != null) {
            aVarArr[((Integer) b02.second).intValue()] = (x.a) b02.first;
        }
        if (b02 != null) {
            Object obj = b02.first;
            str = ((x.a) obj).f27132a.a(((x.a) obj).f27133b[0]).f20073d;
        }
        Pair e02 = e0(aVar, iArr, eVar, str);
        if (e02 != null) {
            aVarArr[((Integer) e02.second).intValue()] = (x.a) e02.first;
        }
        for (int i10 = 0; i10 < d10; i10++) {
            int e10 = aVar.e(i10);
            if (!(e10 == 2 || e10 == 1 || e10 == 3 || e10 == 4)) {
                aVarArr[i10] = d0(e10, aVar.f(i10), iArr[i10], eVar);
            }
        }
        return aVarArr;
    }

    /* access modifiers changed from: protected */
    public Pair b0(z.a aVar, int[][][] iArr, int[] iArr2, e eVar) {
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < aVar.d()) {
                if (2 == aVar.e(i10) && aVar.f(i10).f26271a > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return f0(1, aVar, iArr, new g(this, eVar, z10, iArr2), new h());
    }

    public void c(q0 q0Var) {
        W(q0Var);
    }

    /* access modifiers changed from: protected */
    public Pair c0(z.a aVar, int[][][] iArr, e eVar) {
        if (eVar.f19847s.f19859a == 2) {
            return null;
        }
        return f0(4, aVar, iArr, new e(eVar), new f());
    }

    /* access modifiers changed from: protected */
    public x.a d0(int i10, j0 j0Var, int[][] iArr, e eVar) {
        if (eVar.f19847s.f19859a == 2) {
            return null;
        }
        int i11 = 0;
        I i12 = null;
        d dVar = null;
        for (int i13 = 0; i13 < j0Var.f26271a; i13++) {
            I b10 = j0Var.b(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < b10.f19785a; i14++) {
                if (r0.E(iArr2[i14], eVar.f27075u0)) {
                    d dVar2 = new d(b10.a(i14), iArr2[i14]);
                    if (dVar == null || dVar2.compareTo(dVar) > 0) {
                        i12 = b10;
                        i11 = i14;
                        dVar = dVar2;
                    }
                }
            }
        }
        if (i12 == null) {
            return null;
        }
        return new x.a(i12, i11);
    }

    /* access modifiers changed from: protected */
    public Pair e0(z.a aVar, int[][][] iArr, e eVar, String str) {
        if (eVar.f19847s.f19859a == 2) {
            return null;
        }
        return f0(3, aVar, iArr, new k(eVar, str), new l());
    }

    /* access modifiers changed from: protected */
    public Pair g0(z.a aVar, int[][][] iArr, int[] iArr2, e eVar) {
        if (eVar.f19847s.f19859a == 2) {
            return null;
        }
        return f0(2, aVar, iArr, new i(eVar, iArr2), new j());
    }

    public boolean h() {
        return true;
    }

    public void j() {
        g gVar;
        synchronized (this.f27013d) {
            try {
                if (L.f22072a >= 32 && (gVar = this.f27018i) != null) {
                    gVar.f();
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        super.j();
    }

    public void l(C1968c cVar) {
        boolean equals;
        synchronized (this.f27013d) {
            equals = this.f27019j.equals(cVar);
            this.f27019j = cVar;
        }
        if (!equals) {
            V();
        }
    }

    public void m(K k10) {
        if (k10 instanceof e) {
            h0((e) k10);
        }
        h0(new e.a().h0(k10).C());
    }

    /* access modifiers changed from: protected */
    public final Pair q(z.a aVar, int[][][] iArr, int[] iArr2, C2615C.b bVar, H h10) {
        e eVar;
        m2.z zVar;
        g gVar;
        synchronized (this.f27013d) {
            try {
                eVar = this.f27017h;
                if (eVar.f27074t0 && L.f22072a >= 32 && (gVar = this.f27018i) != null) {
                    gVar.b(this, (Looper) C2076a.i(Looper.myLooper()));
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        int d10 = aVar.d();
        x.a[] a02 = a0(aVar, iArr, iArr2, eVar);
        E(aVar, eVar, a02);
        D(aVar, eVar, a02);
        for (int i10 = 0; i10 < d10; i10++) {
            int e10 = aVar.e(i10);
            if (eVar.i(i10) || eVar.f19828B.contains(Integer.valueOf(e10))) {
                a02[i10] = null;
            }
        }
        x[] a10 = this.f27015f.a(a02, a(), bVar, h10);
        m2.z[] zVarArr = new m2.z[d10];
        for (int i11 = 0; i11 < d10; i11++) {
            int e11 = aVar.e(i11);
            if (eVar.i(i11) || eVar.f19828B.contains(Integer.valueOf(e11)) || (aVar.e(i11) != -2 && a10[i11] == null)) {
                zVar = null;
            } else {
                zVar = m2.z.f23735c;
            }
            zVarArr[i11] = zVar;
        }
        if (eVar.f27076v0) {
            U(aVar, iArr, zVarArr, a10);
        }
        if (eVar.f19847s.f19859a != 0) {
            T(eVar, aVar, iArr, zVarArr, a10);
        }
        return Pair.create(zVarArr, a10);
    }

    public n(Context context, x.b bVar) {
        this(context, (K) e.h(context), bVar);
    }

    public n(Context context, K k10, x.b bVar) {
        this(k10, bVar, context);
    }

    private n(K k10, x.b bVar, Context context) {
        this.f27013d = new Object();
        this.f27014e = context != null ? context.getApplicationContext() : null;
        this.f27015f = bVar;
        if (k10 instanceof e) {
            this.f27017h = (e) k10;
        } else {
            this.f27017h = (context == null ? e.f27043A0 : e.h(context)).a().h0(k10).C();
        }
        this.f27019j = C1968c.f19951g;
        boolean z10 = context != null && L.G0(context);
        this.f27016g = z10;
        if (!z10 && context != null && L.f22072a >= 32) {
            this.f27018i = g.g(context);
        }
        if (this.f27017h.f27074t0 && context == null) {
            i2.p.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public r0.a d() {
        return this;
    }
}
