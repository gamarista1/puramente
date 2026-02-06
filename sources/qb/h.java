package Qb;

import Rb.c;
import Rb.d;
import Rb.e;
import Tb.f;
import Tb.g;
import Tb.l;
import Tb.n;
import Tb.o;
import Tb.q;
import Tb.r;
import Tb.t;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class h {

    /* renamed from: i  reason: collision with root package name */
    public static final h f52272i = new h();

    /* renamed from: a  reason: collision with root package name */
    private Integer f52273a;

    /* renamed from: b  reason: collision with root package name */
    private b f52274b;

    /* renamed from: c  reason: collision with root package name */
    private n f52275c = null;

    /* renamed from: d  reason: collision with root package name */
    private Tb.b f52276d = null;

    /* renamed from: e  reason: collision with root package name */
    private n f52277e = null;

    /* renamed from: f  reason: collision with root package name */
    private Tb.b f52278f = null;

    /* renamed from: g  reason: collision with root package name */
    private Tb.h f52279g = q.j();

    /* renamed from: h  reason: collision with root package name */
    private String f52280h = null;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f52281a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                Qb.h$b[] r0 = Qb.h.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f52281a = r0
                Qb.h$b r1 = Qb.h.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f52281a     // Catch:{ NoSuchFieldError -> 0x001d }
                Qb.h$b r1 = Qb.h.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Qb.h.a.<clinit>():void");
        }
    }

    private enum b {
        LEFT,
        RIGHT
    }

    private h a() {
        h hVar = new h();
        hVar.f52273a = this.f52273a;
        hVar.f52275c = this.f52275c;
        hVar.f52276d = this.f52276d;
        hVar.f52277e = this.f52277e;
        hVar.f52278f = this.f52278f;
        hVar.f52274b = this.f52274b;
        hVar.f52279g = this.f52279g;
        return hVar;
    }

    public static h c(Map map) {
        b bVar;
        h hVar = new h();
        hVar.f52273a = (Integer) map.get("l");
        if (map.containsKey("sp")) {
            hVar.f52275c = v(o.a(map.get("sp")));
            String str = (String) map.get("sn");
            if (str != null) {
                hVar.f52276d = Tb.b.e(str);
            }
        }
        if (map.containsKey("ep")) {
            hVar.f52277e = v(o.a(map.get("ep")));
            String str2 = (String) map.get("en");
            if (str2 != null) {
                hVar.f52278f = Tb.b.e(str2);
            }
        }
        String str3 = (String) map.get("vf");
        if (str3 != null) {
            if (str3.equals("l")) {
                bVar = b.LEFT;
            } else {
                bVar = b.RIGHT;
            }
            hVar.f52274b = bVar;
        }
        String str4 = (String) map.get("i");
        if (str4 != null) {
            hVar.f52279g = Tb.h.b(str4);
        }
        return hVar;
    }

    private static n v(n nVar) {
        if ((nVar instanceof t) || (nVar instanceof Tb.a) || (nVar instanceof f) || (nVar instanceof g)) {
            return nVar;
        }
        if (nVar instanceof l) {
            return new f(Double.valueOf(((Long) nVar.getValue()).doubleValue()), r.a());
        }
        throw new IllegalStateException("Unexpected value passed to normalizeValue: " + nVar.getValue());
    }

    public h b(n nVar, Tb.b bVar) {
        boolean z10;
        if (nVar.e0() || nVar.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Ob.l.f(z10);
        Ob.l.f(!(nVar instanceof l));
        h a10 = a();
        a10.f52277e = nVar;
        a10.f52278f = bVar;
        return a10;
    }

    public Tb.h d() {
        return this.f52279g;
    }

    public Tb.b e() {
        if (m()) {
            Tb.b bVar = this.f52278f;
            if (bVar != null) {
                return bVar;
            }
            return Tb.b.i();
        }
        throw new IllegalArgumentException("Cannot get index end name if start has not been set");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        Integer num = this.f52273a;
        if (num == null ? hVar.f52273a != null : !num.equals(hVar.f52273a)) {
            return false;
        }
        Tb.h hVar2 = this.f52279g;
        if (hVar2 == null ? hVar.f52279g != null : !hVar2.equals(hVar.f52279g)) {
            return false;
        }
        Tb.b bVar = this.f52278f;
        if (bVar == null ? hVar.f52278f != null : !bVar.equals(hVar.f52278f)) {
            return false;
        }
        n nVar = this.f52277e;
        if (nVar == null ? hVar.f52277e != null : !nVar.equals(hVar.f52277e)) {
            return false;
        }
        Tb.b bVar2 = this.f52276d;
        if (bVar2 == null ? hVar.f52276d != null : !bVar2.equals(hVar.f52276d)) {
            return false;
        }
        n nVar2 = this.f52275c;
        if (nVar2 == null ? hVar.f52275c != null : !nVar2.equals(hVar.f52275c)) {
            return false;
        }
        if (r() != hVar.r()) {
            return false;
        }
        return true;
    }

    public n f() {
        if (m()) {
            return this.f52277e;
        }
        throw new IllegalArgumentException("Cannot get index end value if start has not been set");
    }

    public Tb.b g() {
        if (o()) {
            Tb.b bVar = this.f52276d;
            if (bVar != null) {
                return bVar;
            }
            return Tb.b.j();
        }
        throw new IllegalArgumentException("Cannot get index start name if start has not been set");
    }

    public n h() {
        if (o()) {
            return this.f52275c;
        }
        throw new IllegalArgumentException("Cannot get index start value if start has not been set");
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Integer num = this.f52273a;
        int i16 = 0;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        int i17 = i10 * 31;
        if (r()) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i18 = (i17 + i11) * 31;
        n nVar = this.f52275c;
        if (nVar != null) {
            i12 = nVar.hashCode();
        } else {
            i12 = 0;
        }
        int i19 = (i18 + i12) * 31;
        Tb.b bVar = this.f52276d;
        if (bVar != null) {
            i13 = bVar.hashCode();
        } else {
            i13 = 0;
        }
        int i20 = (i19 + i13) * 31;
        n nVar2 = this.f52277e;
        if (nVar2 != null) {
            i14 = nVar2.hashCode();
        } else {
            i14 = 0;
        }
        int i21 = (i20 + i14) * 31;
        Tb.b bVar2 = this.f52278f;
        if (bVar2 != null) {
            i15 = bVar2.hashCode();
        } else {
            i15 = 0;
        }
        int i22 = (i21 + i15) * 31;
        Tb.h hVar = this.f52279g;
        if (hVar != null) {
            i16 = hVar.hashCode();
        }
        return i22 + i16;
    }

    public int i() {
        if (n()) {
            return this.f52273a.intValue();
        }
        throw new IllegalArgumentException("Cannot get limit if limit has not been set");
    }

    public d j() {
        if (u()) {
            return new Rb.b(d());
        }
        if (n()) {
            return new c(this);
        }
        return new e(this);
    }

    public Map k() {
        HashMap hashMap = new HashMap();
        if (o()) {
            hashMap.put("sp", this.f52275c.getValue());
            Tb.b bVar = this.f52276d;
            if (bVar != null) {
                hashMap.put("sn", bVar.b());
            }
        }
        if (m()) {
            hashMap.put("ep", this.f52277e.getValue());
            Tb.b bVar2 = this.f52278f;
            if (bVar2 != null) {
                hashMap.put("en", bVar2.b());
            }
        }
        Integer num = this.f52273a;
        if (num != null) {
            hashMap.put("l", num);
            b bVar3 = this.f52274b;
            if (bVar3 == null) {
                if (o()) {
                    bVar3 = b.LEFT;
                } else {
                    bVar3 = b.RIGHT;
                }
            }
            int i10 = a.f52281a[bVar3.ordinal()];
            if (i10 == 1) {
                hashMap.put("vf", "l");
            } else if (i10 == 2) {
                hashMap.put("vf", "r");
            }
        }
        if (!this.f52279g.equals(q.j())) {
            hashMap.put("i", this.f52279g.c());
        }
        return hashMap;
    }

    public boolean l() {
        if (!n() || this.f52274b == null) {
            return false;
        }
        return true;
    }

    public boolean m() {
        if (this.f52277e != null) {
            return true;
        }
        return false;
    }

    public boolean n() {
        if (this.f52273a != null) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if (this.f52275c != null) {
            return true;
        }
        return false;
    }

    public boolean p() {
        if (!u() || !this.f52279g.equals(q.j())) {
            return false;
        }
        return true;
    }

    public boolean q() {
        if (!o() || !m() || !n() || l()) {
            return true;
        }
        return false;
    }

    public boolean r() {
        b bVar = this.f52274b;
        if (bVar == null) {
            return o();
        }
        if (bVar == b.LEFT) {
            return true;
        }
        return false;
    }

    public h s(int i10) {
        h a10 = a();
        a10.f52273a = Integer.valueOf(i10);
        a10.f52274b = b.LEFT;
        return a10;
    }

    public h t(int i10) {
        h a10 = a();
        a10.f52273a = Integer.valueOf(i10);
        a10.f52274b = b.RIGHT;
        return a10;
    }

    public String toString() {
        return k().toString();
    }

    public boolean u() {
        if (o() || m() || n()) {
            return false;
        }
        return true;
    }

    public h w(Tb.h hVar) {
        h a10 = a();
        a10.f52279g = hVar;
        return a10;
    }

    public h x(n nVar, Tb.b bVar) {
        boolean z10;
        if (nVar.e0() || nVar.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Ob.l.f(z10);
        Ob.l.f(!(nVar instanceof l));
        h a10 = a();
        a10.f52275c = nVar;
        a10.f52276d = bVar;
        return a10;
    }

    public String y() {
        if (this.f52280h == null) {
            try {
                this.f52280h = Vb.b.c(k());
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
        return this.f52280h;
    }
}
