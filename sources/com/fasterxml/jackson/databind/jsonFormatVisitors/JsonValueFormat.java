package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.amazon.a.a.h.a;
import com.fasterxml.jackson.annotation.JsonValue;
import io.intercom.android.sdk.models.AttributeType;

public enum JsonValueFormat {
    COLOR("color"),
    DATE(AttributeType.DATE),
    DATE_TIME("date-time"),
    EMAIL("email"),
    HOST_NAME("host-name"),
    IP_ADDRESS("ip-address"),
    IPV6("ipv6"),
    PHONE(AttributeType.PHONE),
    REGEX("regex"),
    STYLE("style"),
    TIME(a.f37179b),
    URI("uri"),
    UTC_MILLISEC("utc-millisec");
    
    private final String _desc;

    private JsonValueFormat(String str) {
        this._desc = str;
    }

    @JsonValue
    public String toString() {
        return this._desc;
    }
}
