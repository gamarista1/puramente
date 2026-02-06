package com.amazon.a.a.o.c.a;

import java.util.regex.Pattern;

final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Pattern f37556a;

    public e(String str) {
        this(Pattern.compile(str));
    }

    public boolean a(String str) {
        return this.f37556a.matcher(str).matches();
    }

    public e(Pattern pattern) {
        if (pattern != null) {
            this.f37556a = pattern;
            return;
        }
        throw new IllegalArgumentException("Null pattern");
    }
}
