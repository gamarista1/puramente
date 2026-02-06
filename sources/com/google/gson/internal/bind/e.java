package com.google.gson.internal.bind;

import Pc.t;
import com.google.gson.u;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class e implements u {

    /* renamed from: c  reason: collision with root package name */
    private static final u f58214c = new b();

    /* renamed from: d  reason: collision with root package name */
    private static final u f58215d = new b();

    /* renamed from: a  reason: collision with root package name */
    private final t f58216a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap f58217b = new ConcurrentHashMap();

    private static class b implements u {
        private b() {
        }

        public com.google.gson.t create(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
            throw new AssertionError("Factory should not be used");
        }
    }

    public e(t tVar) {
        this.f58216a = tVar;
    }

    private static Object a(t tVar, Class cls) {
        return tVar.u(com.google.gson.reflect.a.get(cls), true).a();
    }

    private static Oc.b b(Class cls) {
        return (Oc.b) cls.getAnnotation(Oc.b.class);
    }

    private u e(Class cls, u uVar) {
        u uVar2 = (u) this.f58217b.putIfAbsent(cls, uVar);
        if (uVar2 != null) {
            return uVar2;
        }
        return uVar;
    }

    /* access modifiers changed from: package-private */
    public com.google.gson.t c(t tVar, com.google.gson.e eVar, com.google.gson.reflect.a aVar, Oc.b bVar, boolean z10) {
        com.google.gson.t tVar2;
        Object a10 = a(tVar, bVar.value());
        boolean nullSafe = bVar.nullSafe();
        if (a10 instanceof com.google.gson.t) {
            tVar2 = (com.google.gson.t) a10;
        } else if (a10 instanceof u) {
            u uVar = (u) a10;
            if (z10) {
                uVar = e(aVar.getRawType(), uVar);
            }
            tVar2 = uVar.create(eVar, aVar);
        } else {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a10.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        if (tVar2 == null || !nullSafe) {
            return tVar2;
        }
        return tVar2.nullSafe();
    }

    public com.google.gson.t create(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
        Oc.b b10 = b(aVar.getRawType());
        if (b10 == null) {
            return null;
        }
        return c(this.f58216a, eVar, aVar, b10, true);
    }

    public boolean d(com.google.gson.reflect.a aVar, u uVar) {
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(uVar);
        if (uVar == f58214c) {
            return true;
        }
        Class rawType = aVar.getRawType();
        u uVar2 = (u) this.f58217b.get(rawType);
        if (uVar2 == null) {
            Oc.b b10 = b(rawType);
            if (b10 == null) {
                return false;
            }
            Class value = b10.value();
            if (!u.class.isAssignableFrom(value)) {
                return false;
            }
            if (e(rawType, (u) a(this.f58216a, value)) == uVar) {
                return true;
            }
            return false;
        } else if (uVar2 == uVar) {
            return true;
        } else {
            return false;
        }
    }
}
