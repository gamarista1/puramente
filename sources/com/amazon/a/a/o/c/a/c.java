package com.amazon.a.a.o.c.a;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f37548a;

    public c(String... strArr) {
        this.f37548a = Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
    }

    public boolean a(String str) {
        return this.f37548a.contains(str);
    }
}
