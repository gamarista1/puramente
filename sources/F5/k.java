package F5;

import D5.s;
import D5.u;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.amazon.a.a.o.b;
import com.facebook.I;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import o7.C3884A;
import o7.C3906w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t5.C4021N;
import t5.C4022O;
import t5.C4023P;
import t5.C4039p;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f30773a = new k();

    /* renamed from: b  reason: collision with root package name */
    private static final String f30774b = k.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private static final C4021N f30775c = new C4021N(I.l());

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private BigDecimal f30776a;

        /* renamed from: b  reason: collision with root package name */
        private Currency f30777b;

        /* renamed from: c  reason: collision with root package name */
        private Bundle f30778c;

        /* renamed from: d  reason: collision with root package name */
        private C4022O f30779d;

        public a(BigDecimal bigDecimal, Currency currency, Bundle bundle, C4022O o10) {
            C6496s.h(bigDecimal, "purchaseAmount");
            C6496s.h(currency, b.f37469a);
            C6496s.h(bundle, "param");
            C6496s.h(o10, "operationalData");
            this.f30776a = bigDecimal;
            this.f30777b = currency;
            this.f30778c = bundle;
            this.f30779d = o10;
        }

        public final Currency a() {
            return this.f30777b;
        }

        public final C4022O b() {
            return this.f30779d;
        }

        public final Bundle c() {
            return this.f30778c;
        }

        public final BigDecimal d() {
            return this.f30776a;
        }
    }

    private k() {
    }

    public static final synchronized Bundle a(List list) {
        Bundle f10;
        synchronized (k.class) {
            C6496s.h(list, "purchaseLoggingParametersList");
            a aVar = (a) list.get(0);
            f10 = s.f(C6565s.e(new D5.a("fb_mobile_purchase", aVar.d().doubleValue(), aVar.a())), System.currentTimeMillis(), true, C6565s.e(new Pair(aVar.c(), aVar.b())));
        }
        return f10;
    }

    private final List b(String str, String str2, u.a aVar) {
        return c(str, str2, new HashMap(), aVar);
    }

    private final List c(String str, String str2, Map map, u.a aVar) {
        List list = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            C4022O o10 = new C4022O();
            if (aVar != null) {
                C4022O.f48174b.a(C4023P.IAPParameters, "fb_iap_sdk_supported_library_versions", aVar.b(), bundle, o10);
            }
            C4022O.a aVar2 = C4022O.f48174b;
            C4023P p10 = C4023P.IAPParameters;
            String string = jSONObject.getString("productId");
            C6496s.g(string, "purchaseJSON.getString(C…stants.GP_IAP_PRODUCT_ID)");
            aVar2.a(p10, "fb_iap_product_id", string, bundle, o10);
            String string2 = jSONObject.getString("productId");
            C6496s.g(string2, "purchaseJSON.getString(C…stants.GP_IAP_PRODUCT_ID)");
            aVar2.a(p10, "fb_content_id", string2, bundle, o10);
            aVar2.a(p10, "android_dynamic_ads_content_id", "client_implicit", bundle, o10);
            String string3 = jSONObject.getString("purchaseTime");
            C6496s.g(string3, "purchaseJSON.getString(C…nts.GP_IAP_PURCHASE_TIME)");
            aVar2.a(p10, "fb_iap_purchase_time", string3, bundle, o10);
            String string4 = jSONObject.getString("purchaseToken");
            C6496s.g(string4, "purchaseJSON.getString(C…ts.GP_IAP_PURCHASE_TOKEN)");
            aVar2.a(p10, "fb_iap_purchase_token", string4, bundle, o10);
            String optString = jSONObject.optString("packageName");
            C6496s.g(optString, "purchaseJSON.optString(C…ants.GP_IAP_PACKAGE_NAME)");
            aVar2.a(p10, "fb_iap_package_name", optString, bundle, o10);
            String optString2 = jSONObject2.optString(b.f37461S);
            C6496s.g(optString2, "skuDetailsJSON.optString(Constants.GP_IAP_TITLE)");
            aVar2.a(p10, "fb_iap_product_title", optString2, bundle, o10);
            String optString3 = jSONObject2.optString(b.f37480c);
            C6496s.g(optString3, "skuDetailsJSON.optString…tants.GP_IAP_DESCRIPTION)");
            aVar2.a(p10, "fb_iap_product_description", optString3, bundle, o10);
            String optString4 = jSONObject2.optString("type");
            C6496s.g(optString4, "type");
            aVar2.a(p10, "fb_iap_product_type", optString4, bundle, o10);
            String e10 = s.e();
            if (e10 != null) {
                aVar2.a(p10, "fb_iap_client_library_version", e10, bundle, o10);
            }
            for (Map.Entry entry : map.entrySet()) {
                C4022O.f48174b.a(C4023P.IAPParameters, (String) entry.getKey(), (String) entry.getValue(), bundle, o10);
            }
            if (jSONObject2.has("price_amount_micros")) {
                list = C6565s.t(d(optString4, bundle, o10, jSONObject, jSONObject2));
            } else if (jSONObject2.has("subscriptionOfferDetails") || jSONObject2.has("oneTimePurchaseOfferDetails")) {
                try {
                    return e(optString4, bundle, o10, jSONObject2);
                } catch (JSONException e11) {
                    e = e11;
                    Log.e(f30774b, "Error parsing in-app purchase/subscription data.", e);
                    return null;
                } catch (Exception e12) {
                    e = e12;
                    Log.e(f30774b, "Failed to get purchase logging parameters,", e);
                    return null;
                }
            }
            return list;
        } catch (JSONException e13) {
            e = e13;
            Log.e(f30774b, "Error parsing in-app purchase/subscription data.", e);
            return null;
        } catch (Exception e14) {
            e = e14;
            Log.e(f30774b, "Failed to get purchase logging parameters,", e);
            return null;
        }
    }

    private final a d(String str, Bundle bundle, C4022O o10, JSONObject jSONObject, JSONObject jSONObject2) {
        if (C6496s.c(str, u.b.SUBS.b())) {
            C4022O.a aVar = C4022O.f48174b;
            C4023P p10 = C4023P.IAPParameters;
            String bool = Boolean.toString(jSONObject.optBoolean("autoRenewing", false));
            C6496s.g(bool, "toString(\n              …      )\n                )");
            C4022O.a aVar2 = aVar;
            C4023P p11 = p10;
            Bundle bundle2 = bundle;
            C4022O o11 = o10;
            aVar2.a(p11, "fb_iap_subs_auto_renewing", bool, bundle2, o11);
            String optString = jSONObject2.optString(b.f37492o);
            C6496s.g(optString, "skuDetailsJSON.optString…_IAP_SUBSCRIPTION_PERIOD)");
            aVar2.a(p11, "fb_iap_subs_period", optString, bundle2, o11);
            String optString2 = jSONObject2.optString(b.f37493p);
            C6496s.g(optString2, "skuDetailsJSON.optString…GP_IAP_FREE_TRIAL_PERIOD)");
            aVar2.a(p11, "fb_free_trial_period", optString2, bundle2, o11);
            String optString3 = jSONObject2.optString("introductoryPriceCycles");
            C6496s.g(optString3, "introductoryPriceCycles");
            if (optString3.length() > 0) {
                aVar.a(p10, "fb_intro_price_cycles", optString3, bundle, o10);
            }
            String optString4 = jSONObject2.optString("introductoryPricePeriod");
            C6496s.g(optString4, "introductoryPricePeriod");
            if (optString4.length() > 0) {
                aVar.a(p10, "fb_intro_period", optString4, bundle, o10);
            }
            String optString5 = jSONObject2.optString("introductoryPriceAmountMicros");
            C6496s.g(optString5, "introductoryPriceAmountMicros");
            if (optString5.length() > 0) {
                aVar.a(p10, "fb_intro_price_amount_micros", optString5, bundle, o10);
            }
        }
        BigDecimal bigDecimal = new BigDecimal(((double) jSONObject2.getLong("price_amount_micros")) / 1000000.0d);
        Currency instance = Currency.getInstance(jSONObject2.getString("price_currency_code"));
        C6496s.g(instance, "getInstance(skuDetailsJS…RICE_CURRENCY_CODE_V2V4))");
        return new a(bigDecimal, instance, bundle, o10);
    }

    private final List e(String str, Bundle bundle, C4022O o10, JSONObject jSONObject) {
        Bundle bundle2 = bundle;
        JSONObject jSONObject2 = jSONObject;
        if (C6496s.c(str, u.b.SUBS.b())) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject2.getJSONArray("subscriptionOfferDetails");
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject3 = jSONObject2.getJSONArray("subscriptionOfferDetails").getJSONObject(i10);
                if (jSONObject3 == null) {
                    return null;
                }
                Bundle bundle3 = new Bundle(bundle2);
                C4022O c10 = o10.c();
                String string = jSONObject3.getString("basePlanId");
                C4022O.a aVar = C4022O.f48174b;
                C4023P p10 = C4023P.IAPParameters;
                C6496s.g(string, "basePlanId");
                C4022O o11 = c10;
                Bundle bundle4 = bundle3;
                aVar.a(p10, "fb_iap_base_plan", string, bundle4, o11);
                JSONArray jSONArray2 = jSONObject3.getJSONArray("pricingPhases");
                JSONObject jSONObject4 = jSONArray2.getJSONObject(jSONArray2.length() - 1);
                if (jSONObject4 == null) {
                    return null;
                }
                String optString = jSONObject4.optString("billingPeriod");
                C6496s.g(optString, "subscriptionJSON.optStri…IOD\n                    )");
                aVar.a(p10, "fb_iap_subs_period", optString, bundle4, o11);
                if (!jSONObject4.has("recurrenceMode") || jSONObject4.getInt("recurrenceMode") == 3) {
                    aVar.a(p10, "fb_iap_subs_auto_renewing", b.f37476ag, bundle4, o11);
                } else {
                    aVar.a(p10, "fb_iap_subs_auto_renewing", b.f37475af, bundle4, o11);
                }
                BigDecimal bigDecimal = new BigDecimal(((double) jSONObject4.getLong("priceAmountMicros")) / 1000000.0d);
                Currency instance = Currency.getInstance(jSONObject4.getString("priceCurrencyCode"));
                C6496s.g(instance, "getInstance(subscription…RICE_CURRENCY_CODE_V5V7))");
                arrayList.add(new a(bigDecimal, instance, bundle4, o11));
            }
            return arrayList;
        }
        JSONObject jSONObject5 = jSONObject2.getJSONObject("oneTimePurchaseOfferDetails");
        if (jSONObject5 == null) {
            return null;
        }
        BigDecimal bigDecimal2 = new BigDecimal(((double) jSONObject5.getLong("priceAmountMicros")) / 1000000.0d);
        Currency instance2 = Currency.getInstance(jSONObject5.getString("priceCurrencyCode"));
        C6496s.g(instance2, "getInstance(oneTimePurch…RICE_CURRENCY_CODE_V5V7))");
        return C6565s.t(new a(bigDecimal2, instance2, bundle2, o10));
    }

    public static final synchronized Bundle f(List list, String str) {
        Bundle f10;
        synchronized (k.class) {
            try {
                C6496s.h(list, "purchaseLoggingParametersList");
                C6496s.h(str, "eventName");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    arrayList.add(new D5.a(str, aVar.d().doubleValue(), aVar.a()));
                }
                long currentTimeMillis = System.currentTimeMillis();
                Iterable<a> iterable = list;
                ArrayList arrayList2 = new ArrayList(C6565s.y(iterable, 10));
                for (a aVar2 : iterable) {
                    arrayList2.add(new Pair(aVar2.c(), aVar2.b()));
                }
                f10 = s.f(arrayList, currentTimeMillis, true, arrayList2);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f10;
    }

    public static final boolean g() {
        C3906w f10 = C3884A.f(I.m());
        if (f10 == null || !I.p() || !f10.j()) {
            return false;
        }
        return true;
    }

    public static final void h() {
        Context l10 = I.l();
        String m10 = I.m();
        if (!I.p()) {
            return;
        }
        if (l10 instanceof Application) {
            C4039p.f48255b.a((Application) l10, m10);
        } else {
            Log.w(f30774b, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
        }
    }

    public static final void i(String str, long j10) {
        Context l10 = I.l();
        C3906w u10 = C3884A.u(I.m(), false);
        if (u10 != null && u10.a() && j10 > 0) {
            C4021N n10 = new C4021N(l10);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            n10.c("fb_aa_time_spent_on_view", (double) j10, bundle);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(java.lang.String r7, java.lang.String r8, boolean r9, D5.u.a r10, boolean r11) {
        /*
            java.lang.String r0 = "purchase"
            kotlin.jvm.internal.C6496s.h(r7, r0)
            java.lang.String r0 = "skuDetails"
            kotlin.jvm.internal.C6496s.h(r8, r0)
            boolean r0 = g()
            if (r0 != 0) goto L_0x0011
            return
        L_0x0011:
            F5.k r0 = f30773a
            java.util.List r7 = r0.b(r7, r8, r10)
            if (r7 != 0) goto L_0x001a
            return
        L_0x001a:
            boolean r10 = r7.isEmpty()
            if (r10 == 0) goto L_0x0021
            return
        L_0x0021:
            java.lang.String r10 = "fb_mobile_purchase"
            r0 = 0
            if (r9 == 0) goto L_0x0046
            java.lang.String r1 = "app_events_if_auto_log_subs"
            java.lang.String r2 = com.facebook.I.m()
            boolean r1 = o7.C3905v.d(r1, r2, r0)
            if (r1 == 0) goto L_0x0046
            if (r11 == 0) goto L_0x0038
            java.lang.String r8 = "SubscriptionRestore"
        L_0x0036:
            r2 = r8
            goto L_0x004c
        L_0x0038:
            D5.q r11 = D5.q.f30515a
            boolean r8 = r11.m(r8)
            if (r8 == 0) goto L_0x0043
            java.lang.String r8 = "StartTrial"
            goto L_0x0036
        L_0x0043:
            java.lang.String r8 = "Subscribe"
            goto L_0x0036
        L_0x0046:
            if (r11 == 0) goto L_0x004b
            java.lang.String r8 = "fb_mobile_purchase_restored"
            goto L_0x0036
        L_0x004b:
            r2 = r10
        L_0x004c:
            if (r9 == 0) goto L_0x005b
            o7.s$b r8 = o7.C3902s.b.AndroidManualImplicitSubsDedupe
            boolean r8 = o7.C3902s.g(r8)
            if (r8 == 0) goto L_0x005b
            android.os.Bundle r8 = f(r7, r2)
            goto L_0x006b
        L_0x005b:
            if (r9 != 0) goto L_0x006a
            o7.s$b r8 = o7.C3902s.b.AndroidManualImplicitPurchaseDedupe
            boolean r8 = o7.C3902s.g(r8)
            if (r8 == 0) goto L_0x006a
            android.os.Bundle r8 = a(r7)
            goto L_0x006b
        L_0x006a:
            r8 = 0
        L_0x006b:
            D5.p r9 = D5.p.f30510a
            java.lang.Object r11 = r7.get(r0)
            F5.k$a r11 = (F5.k.a) r11
            android.os.Bundle r11 = r11.c()
            java.lang.Object r1 = r7.get(r0)
            F5.k$a r1 = (F5.k.a) r1
            t5.O r1 = r1.b()
            r9.a(r8, r11, r1)
            boolean r8 = kotlin.jvm.internal.C6496s.c(r2, r10)
            if (r8 != 0) goto L_0x00b8
            t5.N r1 = f30775c
            java.lang.Object r8 = r7.get(r0)
            F5.k$a r8 = (F5.k.a) r8
            java.math.BigDecimal r3 = r8.d()
            java.lang.Object r8 = r7.get(r0)
            F5.k$a r8 = (F5.k.a) r8
            java.util.Currency r4 = r8.a()
            java.lang.Object r8 = r7.get(r0)
            F5.k$a r8 = (F5.k.a) r8
            android.os.Bundle r5 = r8.c()
            java.lang.Object r7 = r7.get(r0)
            F5.k$a r7 = (F5.k.a) r7
            t5.O r6 = r7.b()
            r1.i(r2, r3, r4, r5, r6)
            goto L_0x00e5
        L_0x00b8:
            t5.N r8 = f30775c
            java.lang.Object r9 = r7.get(r0)
            F5.k$a r9 = (F5.k.a) r9
            java.math.BigDecimal r9 = r9.d()
            java.lang.Object r10 = r7.get(r0)
            F5.k$a r10 = (F5.k.a) r10
            java.util.Currency r10 = r10.a()
            java.lang.Object r11 = r7.get(r0)
            F5.k$a r11 = (F5.k.a) r11
            android.os.Bundle r11 = r11.c()
            java.lang.Object r7 = r7.get(r0)
            F5.k$a r7 = (F5.k.a) r7
            t5.O r7 = r7.b()
            r8.j(r9, r10, r11, r7)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.k.j(java.lang.String, java.lang.String, boolean, D5.u$a, boolean):void");
    }

    public static /* synthetic */ void k(String str, String str2, boolean z10, u.a aVar, boolean z11, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        j(str, str2, z10, aVar, z11);
    }
}
