package com.learnium.RNDeviceInfo;

public enum a {
    HANDSET("Handset"),
    TABLET("Tablet"),
    TV("Tv"),
    UNKNOWN("unknown");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f59140a;

    private a(String str) {
        this.f59140a = str;
    }

    public String b() {
        return this.f59140a;
    }
}
