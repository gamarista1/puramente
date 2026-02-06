package com.facebook.soloader;

public class C extends UnsatisfiedLinkError {

    /* renamed from: a  reason: collision with root package name */
    private String f42481a;

    public C(String str, String str2) {
        super(str2);
        this.f42481a = str;
    }

    public String a() {
        return this.f42481a;
    }
}
