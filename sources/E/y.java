package E;

import H0.E;
import H0.G;
import H0.H;
import H0.f0;
import c1.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import yf.C6798l;

public final class y implements x, H {

    /* renamed from: a  reason: collision with root package name */
    private final r f1710a;

    /* renamed from: b  reason: collision with root package name */
    private final f0 f1711b;

    /* renamed from: c  reason: collision with root package name */
    private final C1150t f1712c;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap f1713d = new HashMap();

    public y(r rVar, f0 f0Var) {
        this.f1710a = rVar;
        this.f1711b = f0Var;
        this.f1712c = (C1150t) rVar.d().invoke();
    }

    public long B1(long j10) {
        return this.f1711b.B1(j10);
    }

    public float E(int i10) {
        return this.f1711b.E(i10);
    }

    public int E0(float f10) {
        return this.f1711b.E0(f10);
    }

    public float N0(long j10) {
        return this.f1711b.N0(j10);
    }

    public long P(float f10) {
        return this.f1711b.P(f10);
    }

    public long Q(long j10) {
        return this.f1711b.Q(j10);
    }

    public float V(long j10) {
        return this.f1711b.V(j10);
    }

    public G d1(int i10, int i11, Map map, C6798l lVar) {
        return this.f1711b.d1(i10, i11, map, lVar);
    }

    public long f0(int i10) {
        return this.f1711b.f0(i10);
    }

    public long g0(float f10) {
        return this.f1711b.g0(f10);
    }

    public float getDensity() {
        return this.f1711b.getDensity();
    }

    public t getLayoutDirection() {
        return this.f1711b.getLayoutDirection();
    }

    public G i0(int i10, int i11, Map map, C6798l lVar, C6798l lVar2) {
        return this.f1711b.i0(i10, i11, map, lVar, lVar2);
    }

    public List l0(int i10, long j10) {
        List list = (List) this.f1713d.get(Integer.valueOf(i10));
        if (list != null) {
            return list;
        }
        Object d10 = this.f1712c.d(i10);
        List x12 = this.f1711b.x1(d10, this.f1710a.b(i10, d10, this.f1712c.f(i10)));
        int size = x12.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(((E) x12.get(i11)).v0(j10));
        }
        this.f1713d.put(Integer.valueOf(i10), arrayList);
        return arrayList;
    }

    public float m1(float f10) {
        return this.f1711b.m1(f10);
    }

    public boolean r0() {
        return this.f1711b.r0();
    }

    public float r1() {
        return this.f1711b.r1();
    }

    public float t1(float f10) {
        return this.f1711b.t1(f10);
    }
}
