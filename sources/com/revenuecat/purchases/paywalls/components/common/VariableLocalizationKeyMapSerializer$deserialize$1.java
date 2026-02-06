package com.revenuecat.purchases.paywalls.components.common;

import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "<name for destructuring parameter 0>", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class VariableLocalizationKeyMapSerializer$deserialize$1 extends C6498u implements C6798l {
    public static final VariableLocalizationKeyMapSerializer$deserialize$1 INSTANCE = new VariableLocalizationKeyMapSerializer$deserialize$1();

    VariableLocalizationKeyMapSerializer$deserialize$1() {
        super(1);
    }

    public final VariableLocalizationKey invoke(Map.Entry<String, String> entry) {
        C6496s.h(entry, "<name for destructuring parameter 0>");
        try {
            String upperCase = entry.getKey().toUpperCase(Locale.ROOT);
            C6496s.g(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return VariableLocalizationKey.valueOf(upperCase);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
