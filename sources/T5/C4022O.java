package t5;

import android.os.Bundle;
import com.facebook.C3459v;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import lf.C6502A;
import mf.O;
import mf.Y;
import org.json.JSONObject;

/* renamed from: t5.O  reason: case insensitive filesystem */
public final class C4022O {

    /* renamed from: b  reason: collision with root package name */
    public static final a f48174b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final Set f48175c;

    /* renamed from: d  reason: collision with root package name */
    private static final Set f48176d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final Map f48177e;

    /* renamed from: a  reason: collision with root package name */
    private final Map f48178a = new LinkedHashMap();

    /* renamed from: t5.O$a */
    public static final class a {

        /* renamed from: t5.O$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C0725a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f48179a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    t5.Q[] r0 = t5.Q.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    t5.Q r1 = t5.Q.CustomData     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    t5.Q r1 = t5.Q.OperationalData     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    t5.Q r1 = t5.Q.CustomAndOperationalData     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f48179a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: t5.C4022O.a.C0725a.<clinit>():void");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(C4023P p10, String str, String str2, Bundle bundle, C4022O o10) {
            C6496s.h(p10, "typeOfParameter");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(str2, "value");
            C6496s.h(bundle, "customEventsParams");
            C6496s.h(o10, "operationalData");
            int i10 = C0725a.f48179a[d(p10, str).ordinal()];
            if (i10 == 1) {
                bundle.putCharSequence(str, str2);
            } else if (i10 == 2) {
                o10.b(p10, str, str2);
            } else if (i10 == 3) {
                o10.b(p10, str, str2);
                bundle.putCharSequence(str, str2);
            }
        }

        public final Pair b(C4023P p10, String str, String str2, Bundle bundle, C4022O o10) {
            C6496s.h(p10, "typeOfParameter");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(str2, "value");
            int i10 = C0725a.f48179a[d(p10, str).ordinal()];
            if (i10 == 1) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putCharSequence(str, str2);
            } else if (i10 == 2) {
                if (o10 == null) {
                    o10 = new C4022O();
                }
                o10.b(p10, str, str2);
            } else if (i10 == 3) {
                if (o10 == null) {
                    o10 = new C4022O();
                }
                if (bundle == null) {
                    bundle = new Bundle();
                }
                o10.b(p10, str, str2);
                bundle.putCharSequence(str, str2);
            }
            return new Pair(bundle, o10);
        }

        public final Object c(C4023P p10, String str, Bundle bundle, C4022O o10) {
            Object obj;
            C6496s.h(p10, "typeOfParameter");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            CharSequence charSequence = null;
            if (o10 != null) {
                obj = o10.d(p10, str);
            } else {
                obj = null;
            }
            if (bundle != null) {
                charSequence = bundle.getCharSequence(str);
            }
            if (obj == null) {
                return charSequence;
            }
            return obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.util.Set} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final t5.Q d(t5.C4023P r4, java.lang.String r5) {
            /*
                r3 = this;
                java.lang.String r0 = "typeOfParameter"
                kotlin.jvm.internal.C6496s.h(r4, r0)
                java.lang.String r0 = "parameter"
                kotlin.jvm.internal.C6496s.h(r5, r0)
                java.util.Map r0 = t5.C4022O.f48177e
                java.lang.Object r0 = r0.get(r4)
                kotlin.Pair r0 = (kotlin.Pair) r0
                r1 = 0
                if (r0 == 0) goto L_0x001e
                java.lang.Object r0 = r0.c()
                java.util.Set r0 = (java.util.Set) r0
                goto L_0x001f
            L_0x001e:
                r0 = r1
            L_0x001f:
                java.util.Map r2 = t5.C4022O.f48177e
                java.lang.Object r4 = r2.get(r4)
                kotlin.Pair r4 = (kotlin.Pair) r4
                if (r4 == 0) goto L_0x0032
                java.lang.Object r4 = r4.d()
                r1 = r4
                java.util.Set r1 = (java.util.Set) r1
            L_0x0032:
                if (r0 == 0) goto L_0x003d
                boolean r4 = r0.contains(r5)
                if (r4 == 0) goto L_0x003d
                t5.Q r4 = t5.Q.OperationalData
                return r4
            L_0x003d:
                if (r1 == 0) goto L_0x0048
                boolean r4 = r1.contains(r5)
                if (r4 == 0) goto L_0x0048
                t5.Q r4 = t5.Q.CustomAndOperationalData
                return r4
            L_0x0048:
                t5.Q r4 = t5.Q.CustomData
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: t5.C4022O.a.d(t5.P, java.lang.String):t5.Q");
        }

        private a() {
        }
    }

    static {
        Set j10 = Y.j("fb_iap_package_name", "fb_iap_subs_auto_renewing", "fb_free_trial_period", "fb_intro_price_amount_micros", "fb_intro_price_cycles", "fb_iap_base_plan", "is_implicit_purchase_logging_enabled", "fb_iap_sdk_supported_library_versions", "is_autolog_app_events_enabled", "fb_iap_client_library_version", "fb_iap_subs_period", "fb_iap_purchase_token", "fb_iap_non_deduped_event_time", "fb_iap_actual_dedup_result", "fb_iap_actual_dedup_key_used", "fb_iap_test_dedup_result", "fb_iap_test_dedup_key_used");
        f48175c = j10;
        Set j11 = Y.j("fb_iap_product_id", "fb_iap_product_type", "fb_iap_purchase_time");
        f48176d = j11;
        f48177e = O.f(C6502A.a(C4023P.IAPParameters, new Pair(j10, j11)));
    }

    public final void b(C4023P p10, String str, Object obj) {
        C6496s.h(p10, "type");
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(obj, "value");
        try {
            C4028e.f48221f.a(str);
            if (!(obj instanceof String)) {
                if (!(obj instanceof Number)) {
                    U u10 = U.f71764a;
                    String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2));
                    C6496s.g(format, "format(format, *args)");
                    throw new C3459v(format);
                }
            }
            if (!this.f48178a.containsKey(p10)) {
                this.f48178a.put(p10, new LinkedHashMap());
            }
            Map map = (Map) this.f48178a.get(p10);
            if (map != null) {
                map.put(str, obj);
            }
        } catch (Exception unused) {
        }
    }

    public final C4022O c() {
        C4022O o10 = new C4022O();
        for (C4023P p10 : this.f48178a.keySet()) {
            Map map = (Map) this.f48178a.get(p10);
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        o10.b(p10, str, obj);
                    }
                }
            }
        }
        return o10;
    }

    public final Object d(C4023P p10, String str) {
        Map map;
        C6496s.h(p10, "type");
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        if (this.f48178a.containsKey(p10) && (map = (Map) this.f48178a.get(p10)) != null) {
            return map.get(str);
        }
        return null;
    }

    public final JSONObject e() {
        JSONObject jSONObject;
        try {
            Map map = this.f48178a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(O.e(map.size()));
            for (Object next : map.entrySet()) {
                linkedHashMap.put(((C4023P) ((Map.Entry) next).getKey()).b(), ((Map.Entry) next).getValue());
            }
            jSONObject = new JSONObject(O.y(linkedHashMap));
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }
}
