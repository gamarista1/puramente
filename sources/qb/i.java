package Qb;

import Lb.l;
import Tb.h;
import com.revenuecat.purchases.common.Constants;
import java.util.Map;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final l f52285a;

    /* renamed from: b  reason: collision with root package name */
    private final h f52286b;

    public i(l lVar, h hVar) {
        this.f52285a = lVar;
        this.f52286b = hVar;
    }

    public static i a(l lVar) {
        return new i(lVar, h.f52272i);
    }

    public static i b(l lVar, Map map) {
        return new i(lVar, h.c(map));
    }

    public h c() {
        return this.f52286b.d();
    }

    public h d() {
        return this.f52286b;
    }

    public l e() {
        return this.f52285a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f52285a.equals(iVar.f52285a) && this.f52286b.equals(iVar.f52286b)) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.f52286b.p();
    }

    public boolean g() {
        return this.f52286b.u();
    }

    public int hashCode() {
        return (this.f52285a.hashCode() * 31) + this.f52286b.hashCode();
    }

    public String toString() {
        return this.f52285a + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + this.f52286b;
    }
}
