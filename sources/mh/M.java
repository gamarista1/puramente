package mh;

import ih.d;
import ih.f;
import ih.j;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jh.c;
import kh.J;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lh.C6538b;
import lh.i;
import lh.t;
import lh.v;
import lh.x;
import lh.z;
import mf.Y;

class M extends C6586c {

    /* renamed from: f  reason: collision with root package name */
    private final v f72128f;

    /* renamed from: g  reason: collision with root package name */
    private final String f72129g;

    /* renamed from: h  reason: collision with root package name */
    private final f f72130h;

    /* renamed from: i  reason: collision with root package name */
    private int f72131i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f72132j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(C6538b bVar, v vVar, String str, f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, vVar, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : fVar);
    }

    private final boolean u0(f fVar, int i10) {
        boolean z10;
        if (d().f().i() || fVar.j(i10) || !fVar.g(i10).b()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f72132j = z10;
        return z10;
    }

    private final boolean v0(f fVar, int i10, String str) {
        x xVar;
        C6538b d10 = d();
        if (!fVar.j(i10)) {
            return false;
        }
        f g10 = fVar.g(i10);
        if (g10.b() || !(e0(str) instanceof t)) {
            if (!C6496s.c(g10.h(), j.b.f68505a)) {
                return false;
            }
            if (g10.b() && (e0(str) instanceof t)) {
                return false;
            }
            i e02 = e0(str);
            String str2 = null;
            if (e02 instanceof x) {
                xVar = (x) e02;
            } else {
                xVar = null;
            }
            if (xVar != null) {
                str2 = lh.j.f(xVar);
            }
            if (str2 == null || G.h(g10, d10, str2) != -3) {
                return false;
            }
        }
        return true;
    }

    public boolean D() {
        if (this.f72132j || !super.D()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public String a0(f fVar, int i10) {
        Object obj;
        C6496s.h(fVar, "descriptor");
        G.l(fVar, d());
        String e10 = fVar.e(i10);
        if (!this.f72190e.n() || s0().keySet().contains(e10)) {
            return e10;
        }
        Map e11 = G.e(d(), fVar);
        Iterator it = s0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer num = (Integer) e11.get((String) obj);
            if (num != null && num.intValue() == i10) {
                break;
            }
        }
        String str = (String) obj;
        if (str != null) {
            return str;
        }
        return e10;
    }

    public c b(f fVar) {
        C6496s.h(fVar, "descriptor");
        if (fVar != this.f72130h) {
            return super.b(fVar);
        }
        C6538b d10 = d();
        i f02 = f0();
        f fVar2 = this.f72130h;
        if (f02 instanceof v) {
            return new M(d10, (v) f02, this.f72129g, fVar2);
        }
        throw F.e(-1, "Expected " + O.b(v.class) + " as the serialized body of " + fVar2.i() + ", but had " + O.b(f02.getClass()));
    }

    public void c(f fVar) {
        Set set;
        Set set2;
        C6496s.h(fVar, "descriptor");
        if (!this.f72190e.j() && !(fVar.h() instanceof d)) {
            G.l(fVar, d());
            if (!this.f72190e.n()) {
                set = J.a(fVar);
            } else {
                Set a10 = J.a(fVar);
                Map map = (Map) z.a(d()).a(fVar, G.f());
                if (map != null) {
                    set2 = map.keySet();
                } else {
                    set2 = null;
                }
                if (set2 == null) {
                    set2 = Y.e();
                }
                set = Y.n(a10, set2);
            }
            for (String str : s0().keySet()) {
                if (!set.contains(str) && !C6496s.c(str, this.f72129g)) {
                    throw F.g(str, s0().toString());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public i e0(String str) {
        C6496s.h(str, "tag");
        return (i) mf.O.j(s0(), str);
    }

    public int o(f fVar) {
        C6496s.h(fVar, "descriptor");
        while (this.f72131i < fVar.d()) {
            int i10 = this.f72131i;
            this.f72131i = i10 + 1;
            String b02 = V(fVar, i10);
            int i11 = this.f72131i - 1;
            this.f72132j = false;
            if ((s0().containsKey(b02) || u0(fVar, i11)) && (!this.f72190e.f() || !v0(fVar, i11, b02))) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: w0 */
    public v s0() {
        return this.f72128f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public M(C6538b bVar, v vVar, String str, f fVar) {
        super(bVar, vVar, (DefaultConstructorMarker) null);
        C6496s.h(bVar, "json");
        C6496s.h(vVar, "value");
        this.f72128f = vVar;
        this.f72129g = str;
        this.f72130h = fVar;
    }
}
