package Tb;

import Ob.l;
import Tb.k;
import Tb.n;

public class t extends k {

    /* renamed from: c  reason: collision with root package name */
    private final String f52558c;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f52559a;

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
                f52559a = r0
                Tb.n$b r1 = Tb.n.b.V1     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f52559a     // Catch:{ NoSuchFieldError -> 0x001d }
                Tb.n$b r1 = Tb.n.b.V2     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Tb.t.a.<clinit>():void");
        }
    }

    public t(String str, n nVar) {
        super(nVar);
        this.f52558c = str;
    }

    /* renamed from: A */
    public t V(n nVar) {
        return new t(this.f52558c, nVar);
    }

    public String L(n.b bVar) {
        int i10 = a.f52559a[bVar.ordinal()];
        if (i10 == 1) {
            return t(bVar) + "string:" + this.f52558c;
        } else if (i10 == 2) {
            return t(bVar) + "string:" + l.j(this.f52558c);
        } else {
            throw new IllegalArgumentException("Invalid hash version for string node: " + bVar);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (!this.f52558c.equals(tVar.f52558c) || !this.f52536a.equals(tVar.f52536a)) {
            return false;
        }
        return true;
    }

    public Object getValue() {
        return this.f52558c;
    }

    public int hashCode() {
        return this.f52558c.hashCode() + this.f52536a.hashCode();
    }

    /* access modifiers changed from: protected */
    public k.b r() {
        return k.b.String;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int a(t tVar) {
        return this.f52558c.compareTo(tVar.f52558c);
    }
}
