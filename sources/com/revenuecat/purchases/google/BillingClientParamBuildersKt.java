package com.revenuecat.purchases.google;

import J4.C3048n;
import J4.o;
import com.android.billingclient.api.C3202i;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\n\u001a\u00020\t*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "LJ4/n;", "buildQueryPurchaseHistoryParams", "(Ljava/lang/String;)LJ4/n;", "LJ4/o;", "buildQueryPurchasesParams", "(Ljava/lang/String;)LJ4/o;", "", "productIds", "Lcom/android/billingclient/api/i;", "buildQueryProductDetailsParams", "(Ljava/lang/String;Ljava/util/Set;)Lcom/android/billingclient/api/i;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BillingClientParamBuildersKt {
    public static final C3202i buildQueryProductDetailsParams(String str, Set<String> set) {
        C6496s.h(str, "<this>");
        C6496s.h(set, "productIds");
        Iterable<String> iterable = set;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (String b10 : iterable) {
            arrayList.add(C3202i.b.a().b(b10).c(str).a());
        }
        C3202i a10 = C3202i.a().b(arrayList).a();
        C6496s.g(a10, "newBuilder()\n        .se…List(productList).build()");
        return a10;
    }

    public static final C3048n buildQueryPurchaseHistoryParams(String str) {
        boolean z10;
        C6496s.h(str, "<this>");
        if (C6496s.c(str, "inapp")) {
            z10 = true;
        } else {
            z10 = C6496s.c(str, "subs");
        }
        if (z10) {
            return C3048n.a().b(str).a();
        }
        return null;
    }

    public static final o buildQueryPurchasesParams(String str) {
        boolean z10;
        C6496s.h(str, "<this>");
        if (C6496s.c(str, "inapp")) {
            z10 = true;
        } else {
            z10 = C6496s.c(str, "subs");
        }
        if (z10) {
            return o.a().b(str).a();
        }
        return null;
    }
}
