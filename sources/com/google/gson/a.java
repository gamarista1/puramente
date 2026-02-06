package com.google.gson;

import java.lang.reflect.Field;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Field f58128a;

    public a(Field field) {
        Objects.requireNonNull(field);
        this.f58128a = field;
    }

    public String toString() {
        return this.f58128a.toString();
    }
}
