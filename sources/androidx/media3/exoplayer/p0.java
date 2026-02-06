package androidx.media3.exoplayer;

import f2.C1967b;
import f2.H;
import i2.L;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import m2.C2192a;
import t2.C2656v;
import t2.b0;

final class p0 extends C2192a {

    /* renamed from: h  reason: collision with root package name */
    private final int f17789h;

    /* renamed from: i  reason: collision with root package name */
    private final int f17790i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f17791j;

    /* renamed from: k  reason: collision with root package name */
    private final int[] f17792k;

    /* renamed from: l  reason: collision with root package name */
    private final H[] f17793l;

    /* renamed from: m  reason: collision with root package name */
    private final Object[] f17794m;

    /* renamed from: n  reason: collision with root package name */
    private final HashMap f17795n;

    class a extends C2656v {

        /* renamed from: f  reason: collision with root package name */
        private final H.c f17796f = new H.c();

        a(H h10) {
            super(h10);
        }

        public H.b g(int i10, H.b bVar, boolean z10) {
            H.b g10 = super.g(i10, bVar, z10);
            if (super.n(g10.f19746c, this.f17796f).f()) {
                g10.t(bVar.f19744a, bVar.f19745b, bVar.f19746c, bVar.f19747d, bVar.f19748e, C1967b.f19921g, true);
            } else {
                g10.f19749f = true;
            }
            return g10;
        }
    }

    public p0(Collection collection, b0 b0Var) {
        this(G(collection), H(collection), b0Var);
    }

    private static H[] G(Collection collection) {
        H[] hArr = new H[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            hArr[i10] = ((Z) it.next()).b();
            i10++;
        }
        return hArr;
    }

    private static Object[] H(Collection collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = ((Z) it.next()).a();
            i10++;
        }
        return objArr;
    }

    /* access modifiers changed from: protected */
    public int A(int i10) {
        return this.f17792k[i10];
    }

    /* access modifiers changed from: protected */
    public H D(int i10) {
        return this.f17793l[i10];
    }

    public p0 E(b0 b0Var) {
        H[] hArr = new H[this.f17793l.length];
        int i10 = 0;
        while (true) {
            H[] hArr2 = this.f17793l;
            if (i10 >= hArr2.length) {
                return new p0(hArr, this.f17794m, b0Var);
            }
            hArr[i10] = new a(hArr2[i10]);
            i10++;
        }
    }

    /* access modifiers changed from: package-private */
    public List F() {
        return Arrays.asList(this.f17793l);
    }

    public int i() {
        return this.f17790i;
    }

    public int p() {
        return this.f17789h;
    }

    /* access modifiers changed from: protected */
    public int s(Object obj) {
        Integer num = (Integer) this.f17795n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    public int t(int i10) {
        return L.f(this.f17791j, i10 + 1, false, false);
    }

    /* access modifiers changed from: protected */
    public int u(int i10) {
        return L.f(this.f17792k, i10 + 1, false, false);
    }

    /* access modifiers changed from: protected */
    public Object x(int i10) {
        return this.f17794m[i10];
    }

    /* access modifiers changed from: protected */
    public int z(int i10) {
        return this.f17791j[i10];
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private p0(H[] hArr, Object[] objArr, b0 b0Var) {
        super(false, b0Var);
        int i10 = 0;
        int length = hArr.length;
        this.f17793l = hArr;
        this.f17791j = new int[length];
        this.f17792k = new int[length];
        this.f17794m = objArr;
        this.f17795n = new HashMap();
        int length2 = hArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            H h10 = hArr[i10];
            this.f17793l[i13] = h10;
            this.f17792k[i13] = i11;
            this.f17791j[i13] = i12;
            i11 += h10.p();
            i12 += this.f17793l[i13].i();
            this.f17795n.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.f17789h = i11;
        this.f17790i = i12;
    }
}
