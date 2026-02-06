package k9;

import N9.O;
import ja.M;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class X0 extends C3684a {

    /* renamed from: f  reason: collision with root package name */
    private final int f45413f;

    /* renamed from: g  reason: collision with root package name */
    private final int f45414g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f45415h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f45416i;

    /* renamed from: j  reason: collision with root package name */
    private final n1[] f45417j;

    /* renamed from: k  reason: collision with root package name */
    private final Object[] f45418k;

    /* renamed from: l  reason: collision with root package name */
    private final HashMap f45419l = new HashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public X0(Collection collection, O o10) {
        super(false, o10);
        int i10 = 0;
        int size = collection.size();
        this.f45415h = new int[size];
        this.f45416i = new int[size];
        this.f45417j = new n1[size];
        this.f45418k = new Object[size];
        Iterator it = collection.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            I0 i02 = (I0) it.next();
            this.f45417j[i12] = i02.b();
            this.f45416i[i12] = i10;
            this.f45415h[i12] = i11;
            i10 += this.f45417j[i12].t();
            i11 += this.f45417j[i12].m();
            this.f45418k[i12] = i02.a();
            this.f45419l.put(this.f45418k[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f45413f = i10;
        this.f45414g = i11;
    }

    /* access modifiers changed from: protected */
    public Object C(int i10) {
        return this.f45418k[i10];
    }

    /* access modifiers changed from: protected */
    public int E(int i10) {
        return this.f45415h[i10];
    }

    /* access modifiers changed from: protected */
    public int F(int i10) {
        return this.f45416i[i10];
    }

    /* access modifiers changed from: protected */
    public n1 I(int i10) {
        return this.f45417j[i10];
    }

    /* access modifiers changed from: package-private */
    public List J() {
        return Arrays.asList(this.f45417j);
    }

    public int m() {
        return this.f45414g;
    }

    public int t() {
        return this.f45413f;
    }

    /* access modifiers changed from: protected */
    public int x(Object obj) {
        Integer num = (Integer) this.f45419l.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    public int y(int i10) {
        return M.h(this.f45415h, i10 + 1, false, false);
    }

    /* access modifiers changed from: protected */
    public int z(int i10) {
        return M.h(this.f45416i, i10 + 1, false, false);
    }
}
