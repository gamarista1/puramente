package Tb;

import Ob.l;
import Tb.n;
import com.revenuecat.purchases.common.Constants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public abstract class k implements n {

    /* renamed from: a  reason: collision with root package name */
    protected final n f52536a;

    /* renamed from: b  reason: collision with root package name */
    private String f52537b;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f52538a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                Tb.n$b[] r0 = Tb.n.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f52538a = r0
                Tb.n$b r1 = Tb.n.b.V1     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f52538a     // Catch:{ NoSuchFieldError -> 0x001d }
                Tb.n$b r1 = Tb.n.b.V2     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Tb.k.a.<clinit>():void");
        }
    }

    protected enum b {
        DeferredValue,
        Boolean,
        Number,
        String
    }

    k(n nVar) {
        this.f52536a = nVar;
    }

    private static int b(l lVar, f fVar) {
        return Double.valueOf((double) ((Long) lVar.getValue()).longValue()).compareTo((Double) fVar.getValue());
    }

    public b B(b bVar) {
        return null;
    }

    public Object K(boolean z10) {
        if (!z10 || this.f52536a.isEmpty()) {
            return getValue();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(".value", getValue());
        hashMap.put(".priority", this.f52536a.getValue());
        return hashMap;
    }

    public String M() {
        if (this.f52537b == null) {
            this.f52537b = l.i(L(n.b.V1));
        }
        return this.f52537b;
    }

    public n U(Lb.l lVar) {
        if (lVar.isEmpty()) {
            return this;
        }
        if (lVar.E().p()) {
            return this.f52536a;
        }
        return g.A();
    }

    public n Y(Lb.l lVar, n nVar) {
        b E10 = lVar.E();
        if (E10 == null) {
            return nVar;
        }
        if (nVar.isEmpty() && !E10.p()) {
            return this;
        }
        boolean z10 = true;
        if (lVar.E().p() && lVar.size() != 1) {
            z10 = false;
        }
        l.f(z10);
        return b0(E10, g.A().Y(lVar.N(), nVar));
    }

    /* access modifiers changed from: protected */
    public abstract int a(k kVar);

    public n b0(b bVar, n nVar) {
        if (bVar.p()) {
            return V(nVar);
        }
        if (nVar.isEmpty()) {
            return this;
        }
        return g.A().b0(bVar, nVar).V(this.f52536a);
    }

    public boolean e0() {
        return true;
    }

    public int getChildCount() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator iterator() {
        return Collections.emptyList().iterator();
    }

    public n k0(b bVar) {
        if (bVar.p()) {
            return this.f52536a;
        }
        return g.A();
    }

    /* renamed from: m */
    public int compareTo(n nVar) {
        if (nVar.isEmpty()) {
            return 1;
        }
        if (nVar instanceof c) {
            return -1;
        }
        l.g(nVar.e0(), "Node is not leaf node!");
        if ((this instanceof l) && (nVar instanceof f)) {
            return b((l) this, (f) nVar);
        }
        if (!(this instanceof f) || !(nVar instanceof l)) {
            return x((k) nVar);
        }
        return b((l) nVar, (f) this) * -1;
    }

    public Iterator m0() {
        return Collections.emptyList().iterator();
    }

    public n q() {
        return this.f52536a;
    }

    /* access modifiers changed from: protected */
    public abstract b r();

    /* access modifiers changed from: protected */
    public String t(n.b bVar) {
        int i10 = a.f52538a[bVar.ordinal()];
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("Unknown hash version: " + bVar);
        } else if (this.f52536a.isEmpty()) {
            return "";
        } else {
            return "priority:" + this.f52536a.L(bVar) + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR;
        }
    }

    public String toString() {
        String obj = K(true).toString();
        if (obj.length() <= 100) {
            return obj;
        }
        return obj.substring(0, 100) + "...";
    }

    public boolean w(b bVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    public int x(k kVar) {
        b r10 = r();
        b r11 = kVar.r();
        if (r10.equals(r11)) {
            return a(kVar);
        }
        return r10.compareTo(r11);
    }
}
