package com.revenuecat.purchases.models;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"toRecurrenceMode", "Lcom/revenuecat/purchases/models/RecurrenceMode;", "", "(Ljava/lang/Integer;)Lcom/revenuecat/purchases/models/RecurrenceMode;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RecurrenceModeKt {
    public static final RecurrenceMode toRecurrenceMode(Integer num) {
        RecurrenceMode recurrenceMode;
        RecurrenceMode[] values = RecurrenceMode.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                recurrenceMode = null;
                break;
            }
            recurrenceMode = values[i10];
            if (C6496s.c(recurrenceMode.getIdentifier(), num)) {
                break;
            }
            i10++;
        }
        if (recurrenceMode == null) {
            return RecurrenceMode.UNKNOWN;
        }
        return recurrenceMode;
    }
}
