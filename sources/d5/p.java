package D5;

import android.os.Bundle;
import com.facebook.I;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6565s;
import o7.C3884A;
import o7.C3906w;
import t5.C4022O;
import t5.C4023P;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f30510a = new p();

    /* renamed from: b  reason: collision with root package name */
    private static final List f30511b = C6565s.e("fb_currency");

    /* renamed from: c  reason: collision with root package name */
    private static final List f30512c = C6565s.e("_valueToSum");

    /* renamed from: d  reason: collision with root package name */
    private static final long f30513d = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: e  reason: collision with root package name */
    private static final List f30514e = C6565s.q(C6502A.a("fb_iap_product_id", C6565s.e("fb_iap_product_id")), C6502A.a("fb_iap_product_description", C6565s.e("fb_iap_product_description")), C6502A.a("fb_iap_product_title", C6565s.e("fb_iap_product_title")), C6502A.a("fb_iap_purchase_token", C6565s.e("fb_iap_purchase_token")));

    private p() {
    }

    public final Pair a(Bundle bundle, Bundle bundle2, C4022O o10) {
        if (bundle == null) {
            return new Pair(bundle2, o10);
        }
        try {
            for (String next : bundle.keySet()) {
                String string = bundle.getString(next);
                if (string != null) {
                    C4022O.a aVar = C4022O.f48174b;
                    C4023P p10 = C4023P.IAPParameters;
                    C6496s.g(next, SubscriberAttributeKt.JSON_NAME_KEY);
                    Pair b10 = aVar.b(p10, next, string, bundle2, o10);
                    Bundle bundle3 = (Bundle) b10.a();
                    o10 = (C4022O) b10.b();
                    bundle2 = bundle3;
                }
            }
        } catch (Exception unused) {
        }
        return new Pair(bundle2, o10);
    }

    public final Currency b(Bundle bundle) {
        Iterator it = c().iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                return null;
            }
            String str2 = (String) it.next();
            if (bundle != null) {
                try {
                    str = bundle.getString(str2);
                } catch (Exception unused) {
                    continue;
                }
            }
            if (str == null) {
                continue;
            } else if (str.length() != 0) {
                return Currency.getInstance(str);
            }
        }
    }

    public final List c() {
        List list;
        C3906w f10 = C3884A.f(I.m());
        if (f10 != null) {
            list = f10.e();
        } else {
            list = null;
        }
        if (list == null || f10.e().isEmpty()) {
            return f30511b;
        }
        return f10.e();
    }

    public final List d(boolean z10) {
        List list;
        C3906w f10 = C3884A.f(I.m());
        if (f10 != null) {
            list = f10.n();
        } else {
            list = null;
        }
        if (list == null || f10.n().isEmpty()) {
            return f30514e;
        }
        if (!z10) {
            return f10.n();
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : f10.n()) {
            for (String pair2 : (List) pair.d()) {
                arrayList.add(new Pair(pair2, C6565s.e(pair.c())));
            }
        }
        return arrayList;
    }

    public final long e() {
        Long l10;
        Long f10;
        C3906w f11 = C3884A.f(I.m());
        if (f11 != null) {
            l10 = f11.f();
        } else {
            l10 = null;
        }
        if (l10 == null || ((f10 = f11.f()) != null && f10.longValue() == 0)) {
            return f30513d;
        }
        return f11.f().longValue();
    }

    public final List f(boolean z10) {
        Collection z11;
        C3906w f10 = C3884A.f(I.m());
        if (f10 == null || (z11 = f10.z()) == null || z11.isEmpty()) {
            return null;
        }
        if (!z10) {
            return f10.z();
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : f10.z()) {
            for (String pair2 : (List) pair.d()) {
                arrayList.add(new Pair(pair2, C6565s.e(pair.c())));
            }
        }
        return arrayList;
    }

    public final Double g(Double d10, Bundle bundle) {
        if (d10 != null) {
            return d10;
        }
        for (String str : h()) {
            if (bundle != null) {
                try {
                    return Double.valueOf(bundle.getDouble(str));
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public final List h() {
        List list;
        C3906w f10 = C3884A.f(I.m());
        if (f10 != null) {
            list = f10.p();
        } else {
            list = null;
        }
        if (list == null || f10.p().isEmpty()) {
            return f30512c;
        }
        return f10.p();
    }
}
