package com.facebook;

/* renamed from: com.facebook.h  reason: case insensitive filesystem */
public enum C3293h {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true),
    INSTAGRAM_APPLICATION_WEB(true),
    INSTAGRAM_CUSTOM_CHROME_TAB(true),
    INSTAGRAM_WEB_VIEW(true);
    

    /* renamed from: a  reason: collision with root package name */
    private final boolean f39518a;

    private C3293h(boolean z10) {
        this.f39518a = z10;
    }

    public final boolean b() {
        return this.f39518a;
    }
}
