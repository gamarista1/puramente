package com.amazon.a.a.o.c.a;

import java.io.Serializable;

public enum d implements Serializable {
    SENSITIVE("Sensitive", true),
    INSENSITIVE("Insensitive", false),
    SYSTEM("System", !b.a());
    

    /* renamed from: d  reason: collision with root package name */
    private static final long f37552d = -6343169151696340687L;

    /* renamed from: e  reason: collision with root package name */
    private final String f37554e;

    /* renamed from: f  reason: collision with root package name */
    private final transient boolean f37555f;

    private d(String str, boolean z10) {
        this.f37554e = str;
        this.f37555f = z10;
    }

    public static d a(String str) {
        for (d dVar : values()) {
            if (dVar.a().equals(str)) {
                return dVar;
            }
        }
        throw new IllegalArgumentException("Invalid IOCase name: " + str);
    }

    private Object c() {
        return a(this.f37554e);
    }

    public boolean b() {
        return this.f37555f;
    }

    public boolean d(String str, String str2) {
        int length = str2.length();
        return str.regionMatches(!this.f37555f, str.length() - length, str2, 0, length);
    }

    public String toString() {
        return this.f37554e;
    }

    public boolean b(String str, String str2) {
        if (str != null && str2 != null) {
            return this.f37555f ? str.equals(str2) : str.equalsIgnoreCase(str2);
        }
        throw new NullPointerException("The strings must not be null");
    }

    public boolean c(String str, String str2) {
        return str.regionMatches(!this.f37555f, 0, str2, 0, str2.length());
    }

    public String a() {
        return this.f37554e;
    }

    public boolean b(String str, int i10, String str2) {
        return str.regionMatches(!this.f37555f, i10, str2, 0, str2.length());
    }

    public int a(String str, String str2) {
        if (str != null && str2 != null) {
            return this.f37555f ? str.compareTo(str2) : str.compareToIgnoreCase(str2);
        }
        throw new NullPointerException("The strings must not be null");
    }

    public int a(String str, int i10, String str2) {
        int length = str.length() - str2.length();
        if (length < i10) {
            return -1;
        }
        while (i10 <= length) {
            if (b(str, i10, str2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
