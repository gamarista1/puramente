package E5;

import android.os.Bundle;
import com.facebook.I;
import io.intercom.android.sdk.identity.UserIdentity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6531o;
import mf.Y;
import o7.C3884A;
import o7.C3906w;
import org.json.JSONArray;
import t7.C4049a;
import yf.C6787a;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f30649a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f30650b;

    /* renamed from: c  reason: collision with root package name */
    private static final Lazy f30651c = C6531o.b(a.f30653a);

    /* renamed from: d  reason: collision with root package name */
    private static HashSet f30652d;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f30653a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final HashSet invoke() {
            return Y.f("_currency", "_valueToSum", "fb_availability", "fb_body_style", "fb_checkin_date", "fb_checkout_date", "fb_city", "fb_condition_of_vehicle", "fb_content_ids", "fb_content_type", "fb_contents", "fb_country", "fb_currency", "fb_delivery_category", "fb_departing_arrival_date", "fb_departing_departure_date", "fb_destination_airport", "fb_destination_ids", "fb_dma_code", "fb_drivetrain", "fb_exterior_color", "fb_fuel_type", "fb_hotel_score", "fb_interior_color", "fb_lease_end_date", "fb_lease_start_date", "fb_listing_type", "fb_make", "fb_mileage.unit", "fb_mileage.value", "fb_model", "fb_neighborhood", "fb_num_adults", "fb_num_children", "fb_num_infants", "fb_num_items", "fb_order_id", "fb_origin_airport", "fb_postal_code", "fb_predicted_ltv", "fb_preferred_baths_range", "fb_preferred_beds_range", "fb_preferred_neighborhoods", "fb_preferred_num_stops", "fb_preferred_price_range", "fb_preferred_star_ratings", "fb_price", "fb_property_type", "fb_region", "fb_returning_arrival_date", "fb_returning_departure_date", "fb_state_of_vehicle", "fb_suggested_destinations", "fb_suggested_home_listings", "fb_suggested_hotels", "fb_suggested_jobs", "fb_suggested_local_service_businesses", "fb_suggested_location_based_items", "fb_suggested_vehicles", "fb_transmission", "fb_travel_class", "fb_travel_end", "fb_travel_start", "fb_trim", "fb_user_bucket", "fb_value", "fb_vin", "fb_year", "lead_event_source", "predicted_ltv", "product_catalog_id", "app_user_id", "appVersion", "_eventName", "_eventName_md5", "_implicitlyLogged", "_inBackground", "_isTimedEvent", "_logTime", "_session_id", "_ui", "_valueToUpdate", "_is_fb_codeless", "_is_suggested_event", "_fb_pixel_referral_id", "fb_pixel_id", "trace_id", "subscription_id", "event_id", "_restrictedParams", "_onDeviceParams", "purchase_valid_result_type", "core_lib_included", "login_lib_included", "share_lib_included", "place_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "_codeless_action", "sdk_initialized", "billing_client_lib_included", "billing_service_lib_included", "user_data_keys", "device_push_token", "fb_mobile_pckg_fp", "fb_mobile_app_cert_hash", "aggregate_id", UserIdentity.ANONYMOUS_ID, "campaign_ids", "fb_post_attachment", "receipt_data", "ad_type", "fb_content", "fb_content_id", "fb_description", "fb_level", "fb_max_rating_value", "fb_payment_info_available", "fb_registration_method", "fb_success", "pm", "_audiencePropertyIds", "cs_maca");
        }
    }

    private e() {
    }

    private final HashSet a(JSONArray jSONArray) {
        if (!C4049a.d(this) && jSONArray != null) {
            try {
                if (jSONArray.length() != 0) {
                    HashSet hashSet = new HashSet();
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        String string = jSONArray.getString(i10);
                        C6496s.g(string, "jsonArray.getString(i)");
                        hashSet.add(string);
                    }
                    return hashSet;
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
        return null;
    }

    public static final void b() {
        Class<e> cls = e.class;
        if (!C4049a.d(cls)) {
            try {
                f30650b = true;
                f30649a.e();
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final boolean d() {
        Class<e> cls = e.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            return f30650b;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }

    private final void e() {
        if (!C4049a.d(this)) {
            try {
                C3906w u10 = C3884A.u(I.m(), false);
                if (u10 != null) {
                    HashSet a10 = a(u10.o());
                    if (a10 == null) {
                        a10 = c();
                    }
                    f30652d = a10;
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public static final void f(Bundle bundle) {
        Class<e> cls = e.class;
        if (!C4049a.d(cls)) {
            try {
                if (f30650b && bundle != null && !bundle.isEmpty()) {
                    if (f30652d != null) {
                        ArrayList<String> arrayList = new ArrayList<>();
                        Set<String> keySet = bundle.keySet();
                        C6496s.g(keySet, "parameters.keySet()");
                        for (String str : keySet) {
                            HashSet hashSet = f30652d;
                            C6496s.e(hashSet);
                            if (!hashSet.contains(str)) {
                                C6496s.g(str, "param");
                                arrayList.add(str);
                            }
                        }
                        for (String remove : arrayList) {
                            bundle.remove(remove);
                        }
                        bundle.putString("pm", "1");
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public final HashSet c() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            return (HashSet) f30651c.getValue();
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public final boolean g(Bundle bundle) {
        if (C4049a.d(this) || bundle == null) {
            return false;
        }
        try {
            if (!bundle.containsKey("pm") || !C6496s.c(bundle.get("pm"), "1")) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }
}
