package Lb;

import Yb.a;
import com.revenuecat.purchases.common.Constants;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public String f51879a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f51880b;

    /* renamed from: c  reason: collision with root package name */
    public String f51881c;

    /* renamed from: d  reason: collision with root package name */
    public String f51882d;

    public void a(a aVar) {
        if (aVar != null) {
            String str = aVar.a() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + aVar.b();
            this.f51879a = str;
            this.f51882d = str;
            this.f51880b = false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f51880b == qVar.f51880b && this.f51879a.equals(qVar.f51879a)) {
            return this.f51881c.equals(qVar.f51881c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f51879a.hashCode() * 31) + (this.f51880b ? 1 : 0)) * 31) + this.f51881c.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("http");
        if (this.f51880b) {
            str = "s";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("://");
        sb2.append(this.f51879a);
        return sb2.toString();
    }
}
