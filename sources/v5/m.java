package v5;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum m {
    EVENT_TIME("_logTime"),
    EVENT_NAME("_eventName"),
    VALUE_TO_SUM("_valueToSum"),
    CONTENT_IDS("fb_content_id"),
    CONTENTS("fb_content"),
    CONTENT_TYPE("fb_content_type"),
    DESCRIPTION("fb_description"),
    LEVEL("fb_level"),
    MAX_RATING_VALUE("fb_max_rating_value"),
    NUM_ITEMS("fb_num_items"),
    PAYMENT_INFO_AVAILABLE("fb_payment_info_available"),
    REGISTRATION_METHOD("fb_registration_method"),
    SEARCH_STRING("fb_search_string"),
    SUCCESS("fb_success"),
    ORDER_ID("fb_order_id"),
    AD_TYPE("ad_type"),
    CURRENCY("fb_currency");
    

    /* renamed from: b  reason: collision with root package name */
    public static final a f48822b = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f48841a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a(String str) {
            C6496s.h(str, "rawValue");
            for (m mVar : m.values()) {
                if (C6496s.c(mVar.b(), str)) {
                    return mVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    static {
        f48822b = new a((DefaultConstructorMarker) null);
    }

    private m(String str) {
        this.f48841a = str;
    }

    public final String b() {
        return this.f48841a;
    }
}
