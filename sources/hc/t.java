package Hc;

import bc.C4473f;

public enum t implements C4473f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f51042a;

    private t(int i10) {
        this.f51042a = i10;
    }

    public int d() {
        return this.f51042a;
    }
}
