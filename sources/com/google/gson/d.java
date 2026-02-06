package com.google.gson;

import java.util.Objects;

public class d {

    /* renamed from: d  reason: collision with root package name */
    public static final d f58137d = new d("", "", false);

    /* renamed from: e  reason: collision with root package name */
    public static final d f58138e = new d("\n", "  ", true);

    /* renamed from: a  reason: collision with root package name */
    private final String f58139a;

    /* renamed from: b  reason: collision with root package name */
    private final String f58140b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f58141c;

    private d(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        } else if (str2.matches("[ \t]*")) {
            this.f58139a = str;
            this.f58140b = str2;
            this.f58141c = z10;
        } else {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
    }

    public String a() {
        return this.f58140b;
    }

    public String b() {
        return this.f58139a;
    }

    public boolean c() {
        return this.f58141c;
    }
}
