package com.amazon.device.iap.internal.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.internal.d;
import com.amazon.device.iap.internal.util.b;
import com.revenuecat.purchases.common.Constants;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f37877a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final String f37878b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f37879c;

    static {
        Class<a> cls = a.class;
        f37878b = cls.getSimpleName();
        f37879c = cls.getName() + "_PREFS_";
    }

    public static a a() {
        return f37877a;
    }

    public void a(String str, String str2, String str3) {
        String str4 = f37878b;
        b.a(str4, "enter saveEntitlementRecord for v1 Entitlement [" + str2 + "/" + str3 + "], user [" + str + "]");
        try {
            f.a(str, "userId");
            f.a(str2, com.amazon.a.a.o.b.f37447E);
            f.a(str3, "sku");
            Context b10 = d.f().b();
            f.a((Object) b10, "context");
            SharedPreferences.Editor edit = b10.getSharedPreferences(f37879c + str, 0).edit();
            edit.putString(str3, str2);
            edit.commit();
        } catch (Throwable th2) {
            String str5 = f37878b;
            b.a(str5, "error in saving v1 Entitlement:" + str2 + "/" + str3 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + th2.getMessage());
        }
        String str6 = f37878b;
        b.a(str6, "leaving saveEntitlementRecord for v1 Entitlement [" + str2 + "/" + str3 + "], user [" + str + "]");
    }

    public String a(String str, String str2) {
        String str3 = f37878b;
        b.a(str3, "enter getReceiptIdFromSku for sku [" + str2 + "], user [" + str + "]");
        String str4 = null;
        try {
            f.a(str, "userId");
            f.a(str2, "sku");
            Context b10 = d.f().b();
            f.a((Object) b10, "context");
            str4 = b10.getSharedPreferences(f37879c + str, 0).getString(str2, (String) null);
        } catch (Throwable th2) {
            String str5 = f37878b;
            b.a(str5, "error in saving v1 Entitlement:" + str2 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + th2.getMessage());
        }
        String str6 = f37878b;
        b.a(str6, "leaving saveEntitlementRecord for sku [" + str2 + "], user [" + str + "]");
        return str4;
    }
}
