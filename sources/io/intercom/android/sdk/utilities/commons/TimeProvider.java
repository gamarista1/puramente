package io.intercom.android.sdk.utilities.commons;

import Te.C5545a;

public interface TimeProvider {
    public static final TimeProvider SYSTEM = new C5545a();

    long currentTimeMillis();
}
