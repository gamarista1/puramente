package io.intercom.android.sdk.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import sf.C6714a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/models/TicketAttributeType;", "", "<init>", "(Ljava/lang/String;I)V", "STRING", "INTEGER", "FLOAT", "BOOLEAN", "DATETIME", "LIST", "FILES", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum TicketAttributeType {
    STRING,
    INTEGER,
    FLOAT,
    BOOLEAN,
    DATETIME,
    LIST,
    FILES;

    static {
        TicketAttributeType[] $values;
        $ENTRIES = C6714a.a($values);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }
}
