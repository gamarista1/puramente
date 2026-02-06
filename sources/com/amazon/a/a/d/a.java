package com.amazon.a.a.d;

public class a extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private static final long f37154a = 1;

    public a(String str) {
        super(str);
    }

    public a(String str, Throwable th2) {
        super("Failed to authenticate data: " + str, th2);
    }
}
