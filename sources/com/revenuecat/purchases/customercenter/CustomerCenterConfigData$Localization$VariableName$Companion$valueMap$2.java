package com.revenuecat.purchases.customercenter;

import Ef.m;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import mf.O;
import yf.C6787a;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2 extends C6498u implements C6787a {
    public static final CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2 INSTANCE = new CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2();

    CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2() {
        super(0);
    }

    public final Map<String, CustomerCenterConfigData.Localization.VariableName> invoke() {
        CustomerCenterConfigData.Localization.VariableName[] values = CustomerCenterConfigData.Localization.VariableName.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(values.length), 16));
        for (CustomerCenterConfigData.Localization.VariableName variableName : values) {
            linkedHashMap.put(variableName.getIdentifier(), variableName);
        }
        return linkedHashMap;
    }
}
