package i0;

import Y.C1486g;
import Y.H1;
import Y.v1;
import androidx.collection.L;
import com.google.android.gms.common.api.a;
import i0.C2057k;
import i0.n;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.C6527k;
import mf.C6565s;
import yf.C6798l;

public abstract class p {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C6798l f21753a = b.f21766a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final v1 f21754b = new v1();

    /* renamed from: c  reason: collision with root package name */
    private static final Object f21755c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static n f21756d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static int f21757e;

    /* renamed from: f  reason: collision with root package name */
    private static final m f21758f = new m();

    /* renamed from: g  reason: collision with root package name */
    private static final v f21759g = new v();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static List f21760h = C6565s.n();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static List f21761i = C6565s.n();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicReference f21762j;

    /* renamed from: k  reason: collision with root package name */
    private static final C2057k f21763k;

    /* renamed from: l  reason: collision with root package name */
    private static C1486g f21764l = new C1486g(0);

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f21767a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f21768b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C6798l lVar, C6798l lVar2) {
            super(1);
            this.f21767a = lVar;
            this.f21768b = lVar2;
        }

        public final void a(Object obj) {
            this.f21767a.invoke(obj);
            this.f21768b.invoke(obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C6514M.f71813a;
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f21769a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f21770b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C6798l lVar, C6798l lVar2) {
            super(1);
            this.f21769a = lVar;
            this.f21770b = lVar2;
        }

        public final void a(Object obj) {
            this.f21769a.invoke(obj);
            this.f21770b.invoke(obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C6514M.f71813a;
        }
    }

    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f21771a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C6798l lVar) {
            super(1);
            this.f21771a = lVar;
        }

        /* renamed from: a */
        public final C2057k invoke(n nVar) {
            C2057k kVar = (C2057k) this.f21771a.invoke(nVar);
            synchronized (p.I()) {
                p.f21756d = p.f21756d.A(kVar.f());
                C6514M m10 = C6514M.f71813a;
            }
            return kVar;
        }
    }

    static {
        n.a aVar = n.f21741e;
        f21756d = aVar.a();
        f21757e = 2;
        int i10 = f21757e;
        f21757e = i10 + 1;
        C2047a aVar2 = new C2047a(i10, aVar.a());
        f21756d = f21756d.A(aVar2.f());
        AtomicReference atomicReference = new AtomicReference(aVar2);
        f21762j = atomicReference;
        f21763k = (C2057k) atomicReference.get();
    }

    /* access modifiers changed from: private */
    public static final Object A(C6798l lVar) {
        Object obj;
        L E10;
        Object a02;
        C2057k kVar = f21763k;
        C6496s.f(kVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        C2047a aVar = (C2047a) kVar;
        synchronized (I()) {
            try {
                obj = f21762j.get();
                E10 = ((C2047a) obj).E();
                if (E10 != null) {
                    f21764l.a(1);
                }
                a02 = a0((C2057k) obj, lVar);
            } finally {
            }
        }
        if (E10 != null) {
            try {
                List list = f21760h;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((yf.p) list.get(i10)).invoke(a0.e.a(E10), obj);
                }
            } finally {
                f21764l.a(-1);
            }
        }
        synchronized (I()) {
            try {
                C();
                if (E10 != null) {
                    Object[] objArr = E10.f12131b;
                    long[] jArr = E10.f12130a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j10 = jArr[i11];
                            if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((255 & j10) < 128) {
                                        U((x) objArr[(i11 << 3) + i13]);
                                    }
                                    j10 >>= 8;
                                }
                                if (i12 != 8) {
                                    break;
                                }
                            }
                            if (i11 == length) {
                                break;
                            }
                            i11++;
                        }
                    }
                    C6514M m10 = C6514M.f71813a;
                }
            } finally {
            }
        }
        return a02;
    }

    /* access modifiers changed from: private */
    public static final void B() {
        A(a.f21765a);
    }

    /* access modifiers changed from: private */
    public static final void C() {
        v vVar = f21759g;
        int e10 = vVar.e();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            Object obj = null;
            if (i10 >= e10) {
                break;
            }
            H1 h12 = vVar.f()[i10];
            if (h12 != null) {
                obj = h12.get();
            }
            if (obj != null && T((x) obj)) {
                if (i11 != i10) {
                    vVar.f()[i11] = h12;
                    vVar.d()[i11] = vVar.d()[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < e10; i12++) {
            vVar.f()[i12] = null;
            vVar.d()[i12] = 0;
        }
        if (i11 != e10) {
            vVar.g(i11);
        }
    }

    /* access modifiers changed from: private */
    public static final C2057k D(C2057k kVar, C6798l lVar, boolean z10) {
        C2049c cVar;
        boolean z11 = kVar instanceof C2049c;
        if (!z11 && kVar != null) {
            return new C2046C(kVar, lVar, false, z10);
        }
        if (z11) {
            cVar = (C2049c) kVar;
        } else {
            cVar = null;
        }
        return new C2045B(cVar, lVar, (C6798l) null, false, z10);
    }

    static /* synthetic */ C2057k E(C2057k kVar, C6798l lVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return D(kVar, lVar, z10);
    }

    public static final z F(z zVar) {
        z W10;
        C2057k.a aVar = C2057k.f21728e;
        C2057k c10 = aVar.c();
        z W11 = W(zVar, c10.f(), c10.g());
        if (W11 != null) {
            return W11;
        }
        synchronized (I()) {
            C2057k c11 = aVar.c();
            W10 = W(zVar, c11.f(), c11.g());
        }
        if (W10 != null) {
            return W10;
        }
        V();
        throw new C6527k();
    }

    public static final z G(z zVar, C2057k kVar) {
        z W10 = W(zVar, kVar.f(), kVar.g());
        if (W10 != null) {
            return W10;
        }
        V();
        throw new C6527k();
    }

    public static final C2057k H() {
        C2057k kVar = (C2057k) f21754b.a();
        if (kVar == null) {
            return (C2057k) f21762j.get();
        }
        return kVar;
    }

    public static final Object I() {
        return f21755c;
    }

    public static final C2057k J() {
        return f21763k;
    }

    /* access modifiers changed from: private */
    public static final C6798l K(C6798l lVar, C6798l lVar2, boolean z10) {
        if (!z10) {
            lVar2 = null;
        }
        if (lVar != null && lVar2 != null && lVar != lVar2) {
            return new c(lVar, lVar2);
        }
        if (lVar == null) {
            return lVar2;
        }
        return lVar;
    }

    static /* synthetic */ C6798l L(C6798l lVar, C6798l lVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return K(lVar, lVar2, z10);
    }

    /* access modifiers changed from: private */
    public static final C6798l M(C6798l lVar, C6798l lVar2) {
        if (lVar != null && lVar2 != null && lVar != lVar2) {
            return new d(lVar, lVar2);
        }
        if (lVar == null) {
            return lVar2;
        }
        return lVar;
    }

    public static final z N(z zVar, x xVar) {
        z d02 = d0(xVar);
        if (d02 != null) {
            d02.h(a.e.API_PRIORITY_OTHER);
            return d02;
        }
        z d10 = zVar.d();
        d10.h(a.e.API_PRIORITY_OTHER);
        d10.g(xVar.k());
        C6496s.f(d10, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$16");
        xVar.n(d10);
        C6496s.f(d10, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return d10;
    }

    public static final z O(z zVar, x xVar, C2057k kVar) {
        z P10;
        synchronized (I()) {
            P10 = P(zVar, xVar, kVar);
        }
        return P10;
    }

    private static final z P(z zVar, x xVar, C2057k kVar) {
        z N10 = N(zVar, xVar);
        N10.c(zVar);
        N10.h(kVar.f());
        return N10;
    }

    public static final void Q(C2057k kVar, x xVar) {
        kVar.w(kVar.j() + 1);
        C6798l k10 = kVar.k();
        if (k10 != null) {
            k10.invoke(xVar);
        }
    }

    /* access modifiers changed from: private */
    public static final Map R(C2049c cVar, C2049c cVar2, n nVar) {
        int i10;
        long[] jArr;
        HashMap hashMap;
        int i11;
        long[] jArr2;
        int i12;
        HashMap hashMap2;
        z W10;
        L E10 = cVar2.E();
        int f10 = cVar.f();
        HashMap hashMap3 = null;
        if (E10 == null) {
            return null;
        }
        n z10 = cVar2.g().A(cVar2.f()).z(cVar2.F());
        Object[] objArr = E10.f12131b;
        long[] jArr3 = E10.f12130a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            HashMap hashMap4 = null;
            int i13 = 0;
            while (true) {
                long j10 = jArr3[i13];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((255 & j10) < 128) {
                            x xVar = (x) objArr[(i13 << 3) + i16];
                            z k10 = xVar.k();
                            z W11 = W(k10, f10, nVar);
                            if (W11 == null || (W10 = W(k10, f10, z10)) == null || C6496s.c(W11, W10)) {
                                jArr2 = jArr3;
                                i11 = f10;
                            } else {
                                jArr2 = jArr3;
                                i11 = f10;
                                z W12 = W(k10, cVar2.f(), cVar2.g());
                                if (W12 != null) {
                                    z g10 = xVar.g(W10, W11, W12);
                                    if (g10 == null) {
                                        return null;
                                    }
                                    if (hashMap4 == null) {
                                        hashMap4 = new HashMap();
                                    }
                                    hashMap4.put(W11, g10);
                                    hashMap4 = hashMap4;
                                } else {
                                    V();
                                    throw new C6527k();
                                }
                            }
                            hashMap2 = null;
                            i12 = 8;
                        } else {
                            n nVar2 = nVar;
                            jArr2 = jArr3;
                            i11 = f10;
                            hashMap2 = hashMap3;
                            i12 = i14;
                        }
                        j10 >>= i12;
                        i16++;
                        hashMap3 = hashMap2;
                        i14 = i12;
                        jArr3 = jArr2;
                        f10 = i11;
                    }
                    n nVar3 = nVar;
                    jArr = jArr3;
                    i10 = f10;
                    hashMap = hashMap3;
                    if (i15 != i14) {
                        return hashMap4;
                    }
                } else {
                    n nVar4 = nVar;
                    jArr = jArr3;
                    i10 = f10;
                    hashMap = hashMap3;
                }
                if (i13 == length) {
                    hashMap3 = hashMap4;
                    break;
                }
                i13++;
                hashMap3 = hashMap;
                jArr3 = jArr;
                f10 = i10;
            }
        }
        return hashMap3;
    }

    public static final z S(z zVar, x xVar, C2057k kVar, z zVar2) {
        z N10;
        if (kVar.i()) {
            kVar.p(xVar);
        }
        int f10 = kVar.f();
        if (zVar2.f() == f10) {
            return zVar2;
        }
        synchronized (I()) {
            N10 = N(zVar, xVar);
        }
        N10.h(f10);
        if (zVar2.f() != 1) {
            kVar.p(xVar);
        }
        return N10;
    }

    private static final boolean T(x xVar) {
        z zVar;
        int e10 = f21758f.e(f21757e);
        z zVar2 = null;
        z zVar3 = null;
        int i10 = 0;
        for (z k10 = xVar.k(); k10 != null; k10 = k10.e()) {
            int f10 = k10.f();
            if (f10 != 0) {
                if (f10 >= e10) {
                    i10++;
                } else if (zVar2 == null) {
                    i10++;
                    zVar2 = k10;
                } else {
                    if (k10.f() < zVar2.f()) {
                        zVar = zVar2;
                        zVar2 = k10;
                    } else {
                        zVar = k10;
                    }
                    if (zVar3 == null) {
                        zVar3 = xVar.k();
                        z zVar4 = zVar3;
                        while (true) {
                            if (zVar3 == null) {
                                zVar3 = zVar4;
                                break;
                            } else if (zVar3.f() >= e10) {
                                break;
                            } else {
                                if (zVar4.f() < zVar3.f()) {
                                    zVar4 = zVar3;
                                }
                                zVar3 = zVar3.e();
                            }
                        }
                    }
                    zVar2.h(0);
                    zVar2.c(zVar3);
                    zVar2 = zVar;
                }
            }
        }
        if (i10 > 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final void U(x xVar) {
        if (T(xVar)) {
            f21759g.a(xVar);
        }
    }

    /* access modifiers changed from: private */
    public static final Void V() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* access modifiers changed from: private */
    public static final z W(z zVar, int i10, n nVar) {
        z zVar2 = null;
        while (zVar != null) {
            if (f0(zVar, i10, nVar) && (zVar2 == null || zVar2.f() < zVar.f())) {
                zVar2 = zVar;
            }
            zVar = zVar.e();
        }
        if (zVar2 != null) {
            return zVar2;
        }
        return null;
    }

    public static final z X(z zVar, x xVar) {
        z W10;
        C2057k.a aVar = C2057k.f21728e;
        C2057k c10 = aVar.c();
        C6798l h10 = c10.h();
        if (h10 != null) {
            h10.invoke(xVar);
        }
        z W11 = W(zVar, c10.f(), c10.g());
        if (W11 != null) {
            return W11;
        }
        synchronized (I()) {
            C2057k c11 = aVar.c();
            z k10 = xVar.k();
            C6496s.f(k10, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            W10 = W(k10, c11.f(), c11.g());
            if (W10 == null) {
                V();
                throw new C6527k();
            }
        }
        return W10;
    }

    public static final void Y(int i10) {
        f21758f.f(i10);
    }

    /* access modifiers changed from: private */
    public static final Void Z() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* access modifiers changed from: private */
    public static final Object a0(C2057k kVar, C6798l lVar) {
        Object invoke = lVar.invoke(f21756d.t(kVar.f()));
        synchronized (I()) {
            int i10 = f21757e;
            f21757e = i10 + 1;
            f21756d = f21756d.t(kVar.f());
            f21762j.set(new C2047a(i10, f21756d));
            kVar.d();
            f21756d = f21756d.A(i10);
            C6514M m10 = C6514M.f71813a;
        }
        return invoke;
    }

    /* access modifiers changed from: private */
    public static final C2057k b0(C6798l lVar) {
        return (C2057k) A(new e(lVar));
    }

    public static final int c0(int i10, n nVar) {
        int a10;
        int x10 = nVar.x(i10);
        synchronized (I()) {
            a10 = f21758f.a(x10);
        }
        return a10;
    }

    private static final z d0(x xVar) {
        int e10 = f21758f.e(f21757e) - 1;
        n a10 = n.f21741e.a();
        z zVar = null;
        for (z k10 = xVar.k(); k10 != null; k10 = k10.e()) {
            if (k10.f() == 0) {
                return k10;
            }
            if (f0(k10, e10, a10)) {
                if (zVar == null) {
                    zVar = k10;
                } else if (k10.f() < zVar.f()) {
                    return k10;
                } else {
                    return zVar;
                }
            }
        }
        return null;
    }

    private static final boolean e0(int i10, int i11, n nVar) {
        if (i11 == 0 || i11 > i10 || nVar.v(i11)) {
            return false;
        }
        return true;
    }

    private static final boolean f0(z zVar, int i10, n nVar) {
        return e0(i10, zVar.f(), nVar);
    }

    /* access modifiers changed from: private */
    public static final void g0(C2057k kVar) {
        C2049c cVar;
        Object obj;
        int e10;
        if (!f21756d.v(kVar.f())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Snapshot is not open: id=");
            sb2.append(kVar.f());
            sb2.append(", disposed=");
            sb2.append(kVar.e());
            sb2.append(", applied=");
            if (kVar instanceof C2049c) {
                cVar = (C2049c) kVar;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                obj = Boolean.valueOf(cVar.D());
            } else {
                obj = "read-only";
            }
            sb2.append(obj);
            sb2.append(", lowestPin=");
            synchronized (I()) {
                e10 = f21758f.e(-1);
            }
            sb2.append(e10);
            throw new IllegalStateException(sb2.toString().toString());
        }
    }

    public static final z h0(z zVar, x xVar, C2057k kVar) {
        z W10;
        if (kVar.i()) {
            kVar.p(xVar);
        }
        int f10 = kVar.f();
        z W11 = W(zVar, f10, kVar.g());
        if (W11 == null) {
            V();
            throw new C6527k();
        } else if (W11.f() == kVar.f()) {
            return W11;
        } else {
            synchronized (I()) {
                W10 = W(xVar.k(), f10, kVar.g());
                if (W10 == null) {
                    V();
                    throw new C6527k();
                } else if (W10.f() != f10) {
                    W10 = P(W10, xVar, kVar);
                }
            }
            C6496s.f(W10, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
            if (W11.f() != 1) {
                kVar.p(xVar);
            }
            return W10;
        }
    }

    public static final n z(n nVar, int i10, int i11) {
        while (i10 < i11) {
            nVar = nVar.A(i10);
            i10++;
        }
        return nVar;
    }

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f21765a = new a();

        a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((n) obj);
            return C6514M.f71813a;
        }

        public final void a(n nVar) {
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f21766a = new b();

        b() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((n) obj);
            return C6514M.f71813a;
        }

        public final void a(n nVar) {
        }
    }
}
