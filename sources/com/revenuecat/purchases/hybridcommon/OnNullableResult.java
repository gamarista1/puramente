package com.revenuecat.purchases.hybridcommon;

import java.util.Map;

public interface OnNullableResult {
    void onError(ErrorContainer errorContainer);

    void onReceived(Map<String, ?> map);
}
