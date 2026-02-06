package v5;

import com.amazon.a.a.o.b;
import com.amazon.device.simplesignin.a.a.a;

public enum i {
    VALUE_TO_SUM("value"),
    EVENT_TIME("event_time"),
    EVENT_NAME("event_name"),
    CONTENT_IDS("content_ids"),
    CONTENTS("contents"),
    CONTENT_TYPE("content_type"),
    DESCRIPTION(b.f37480c),
    LEVEL("level"),
    MAX_RATING_VALUE("max_rating_value"),
    NUM_ITEMS("num_items"),
    PAYMENT_INFO_AVAILABLE("payment_info_available"),
    REGISTRATION_METHOD("registration_method"),
    SEARCH_STRING("search_string"),
    SUCCESS(a.f38020s),
    ORDER_ID("order_id"),
    AD_TYPE("ad_type"),
    CURRENCY(b.f37469a);
    

    /* renamed from: a  reason: collision with root package name */
    private final String f48780a;

    private i(String str) {
        this.f48780a = str;
    }

    public final String b() {
        return this.f48780a;
    }
}
