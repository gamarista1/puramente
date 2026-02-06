package Sh;

import Qh.b;
import com.revenuecat.purchases.common.Constants;

class g implements b {

    /* renamed from: a  reason: collision with root package name */
    Class f65134a;

    /* renamed from: b  reason: collision with root package name */
    String f65135b;

    /* renamed from: c  reason: collision with root package name */
    int f65136c;

    g(Class cls, String str, int i10) {
        this.f65134a = cls;
        this.f65135b = str;
        this.f65136c = i10;
    }

    public String a() {
        return this.f65135b;
    }

    public int b() {
        return this.f65136c;
    }

    public String toString() {
        return a() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + b();
    }
}
