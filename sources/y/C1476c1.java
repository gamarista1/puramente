package Y;

import androidx.collection.C;
import j0.C2116a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import zf.C6828a;

/* renamed from: Y.c1  reason: case insensitive filesystem */
public final class C1476c1 implements C2116a, Iterable, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private int[] f9958a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    private int f9959b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f9960c = new Object[0];

    /* renamed from: d  reason: collision with root package name */
    private int f9961d;

    /* renamed from: e  reason: collision with root package name */
    private int f9962e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9963f;

    /* renamed from: g  reason: collision with root package name */
    private int f9964g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList f9965h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private HashMap f9966i;

    /* renamed from: j  reason: collision with root package name */
    private C f9967j;

    private final C1477d Z(int i10) {
        int i11;
        if (this.f9963f) {
            C1506p.r("use active SlotWriter to crate an anchor for location instead");
        }
        if (i10 < 0 || i10 >= (i11 = this.f9959b)) {
            return null;
        }
        return C1482e1.G(this.f9965h, i10, i11);
    }

    public final int A() {
        return this.f9959b;
    }

    public final Object[] C() {
        return this.f9960c;
    }

    public final int D() {
        return this.f9961d;
    }

    public final HashMap E() {
        return this.f9966i;
    }

    public final int H() {
        return this.f9964g;
    }

    public final boolean I() {
        return this.f9963f;
    }

    public final boolean N(int i10, C1477d dVar) {
        boolean z10;
        if (this.f9963f) {
            C1506p.r("Writer is active");
        }
        if (i10 < 0 || i10 >= this.f9959b) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            C1506p.r("Invalid group index");
        }
        if (R(dVar)) {
            int h10 = C1482e1.I(this.f9958a, i10) + i10;
            int a10 = dVar.a();
            if (i10 <= a10 && a10 < h10) {
                return true;
            }
        }
        return false;
    }

    public final C1473b1 P() {
        if (!this.f9963f) {
            this.f9962e++;
            return new C1473b1(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending");
    }

    public final C1485f1 Q() {
        boolean z10;
        if (this.f9963f) {
            C1506p.r("Cannot start a writer when another writer is pending");
        }
        if (this.f9962e <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C1506p.r("Cannot start a writer when a reader is pending");
        }
        this.f9963f = true;
        this.f9964g++;
        return new C1485f1(this);
    }

    public final boolean R(C1477d dVar) {
        int t10;
        if (!dVar.b() || (t10 = C1482e1.U(this.f9965h, dVar.a(), this.f9959b)) < 0 || !C6496s.c(this.f9965h.get(t10), dVar)) {
            return false;
        }
        return true;
    }

    public final void S(int[] iArr, int i10, Object[] objArr, int i11, ArrayList arrayList, HashMap hashMap, C c10) {
        this.f9958a = iArr;
        this.f9959b = i10;
        this.f9960c = objArr;
        this.f9961d = i11;
        this.f9965h = arrayList;
        this.f9966i = hashMap;
        this.f9967j = c10;
    }

    public final V W(int i10) {
        C1477d Z10;
        HashMap hashMap = this.f9966i;
        if (hashMap == null || (Z10 = Z(i10)) == null) {
            return null;
        }
        return (V) hashMap.get(Z10);
    }

    public final C1477d a(int i10) {
        if (this.f9963f) {
            C1506p.r("use active SlotWriter to create an anchor location instead");
        }
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f9959b) {
            z10 = true;
        }
        if (!z10) {
            C0.a("Parameter index is out of range");
        }
        ArrayList arrayList = this.f9965h;
        int t10 = C1482e1.U(arrayList, i10, this.f9959b);
        if (t10 >= 0) {
            return (C1477d) arrayList.get(t10);
        }
        C1477d dVar = new C1477d(i10);
        arrayList.add(-(t10 + 1), dVar);
        return dVar;
    }

    public final int b(C1477d dVar) {
        if (this.f9963f) {
            C1506p.r("Use active SlotWriter to determine anchor location instead");
        }
        if (!dVar.b()) {
            C0.a("Anchor refers to a group that was removed");
        }
        return dVar.a();
    }

    public final void g(C1473b1 b1Var, HashMap hashMap) {
        boolean z10;
        if (b1Var.y() != this || this.f9962e <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            C1506p.r("Unexpected reader close()");
        }
        this.f9962e--;
        if (hashMap != null) {
            synchronized (this) {
                try {
                    HashMap hashMap2 = this.f9966i;
                    if (hashMap2 != null) {
                        hashMap2.putAll(hashMap);
                    } else {
                        this.f9966i = hashMap;
                    }
                    C6514M m10 = C6514M.f71813a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public boolean isEmpty() {
        if (this.f9959b == 0) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return new T(this, 0, this.f9959b);
    }

    public final void k(C1485f1 f1Var, int[] iArr, int i10, Object[] objArr, int i11, ArrayList arrayList, HashMap hashMap, C c10) {
        boolean z10;
        if (f1Var.f0() != this || !this.f9963f) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            C0.a("Unexpected writer close()");
        }
        this.f9963f = false;
        S(iArr, i10, objArr, i11, arrayList, hashMap, c10);
    }

    public final void n() {
        this.f9967j = new C(0, 1, (DefaultConstructorMarker) null);
    }

    public final void r() {
        this.f9966i = new HashMap();
    }

    public final boolean t() {
        if (this.f9959b <= 0 || !C1482e1.D(this.f9958a, 0)) {
            return false;
        }
        return true;
    }

    public final ArrayList v() {
        return this.f9965h;
    }

    public final C x() {
        return this.f9967j;
    }

    public final int[] z() {
        return this.f9958a;
    }
}
