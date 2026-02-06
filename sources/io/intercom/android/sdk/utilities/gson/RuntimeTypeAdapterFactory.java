package io.intercom.android.sdk.utilities.gson;

import Sc.c;
import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.reflect.a;
import com.google.gson.t;
import com.google.gson.u;
import java.util.LinkedHashMap;
import java.util.Map;

public final class RuntimeTypeAdapterFactory<T> implements u {
    /* access modifiers changed from: private */
    public final Class<?> baseType;
    private final Map<String, Class<?>> labelToIgnoreSubtype = new LinkedHashMap();
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final boolean maintainType;
    private final Map<Class<?>, String> subtypeToIgnoreLabel = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final String typeFieldName;

    private RuntimeTypeAdapterFactory(Class<?> cls, String str, boolean z10) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
        this.maintainType = z10;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str, boolean z10) {
        return new RuntimeTypeAdapterFactory<>(cls, str, z10);
    }

    public <R> t create(e eVar, a<R> aVar) {
        if (aVar.getRawType() != this.baseType) {
            return null;
        }
        final t p10 = eVar.p(h.class);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        final LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry next : this.labelToSubtype.entrySet()) {
            t q10 = eVar.q(this, a.get((Class) next.getValue()));
            linkedHashMap.put((String) next.getKey(), q10);
            linkedHashMap2.put((Class) next.getValue(), q10);
        }
        for (Map.Entry next2 : this.labelToIgnoreSubtype.entrySet()) {
            t q11 = eVar.q(this, a.get((Class) next2.getValue()));
            linkedHashMap3.put((String) next2.getKey(), q11);
            linkedHashMap4.put((Class) next2.getValue(), q11);
        }
        return new t() {
            public R read(Sc.a aVar) {
                h hVar;
                h hVar2 = (h) p10.read(aVar);
                if (RuntimeTypeAdapterFactory.this.maintainType) {
                    hVar = hVar2.b().v(RuntimeTypeAdapterFactory.this.typeFieldName);
                } else {
                    hVar = hVar2.b().A(RuntimeTypeAdapterFactory.this.typeFieldName);
                }
                if (hVar != null) {
                    t tVar = (t) linkedHashMap.get(hVar.g());
                    if (tVar == null) {
                        tVar = (t) linkedHashMap3.get("UnSupported");
                    }
                    return tVar.fromJsonTree(hVar2);
                }
                throw new l("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
            }

            public void write(c cVar, R r10) {
                Class<?> cls = r10.getClass();
                String str = (String) RuntimeTypeAdapterFactory.this.subtypeToLabel.get(cls);
                t tVar = (t) linkedHashMap2.get(cls);
                if (tVar != null) {
                    k b10 = tVar.toJsonTree(r10).b();
                    if (RuntimeTypeAdapterFactory.this.maintainType) {
                        p10.write(cVar, b10);
                        return;
                    }
                    k kVar = new k();
                    if (!b10.z(RuntimeTypeAdapterFactory.this.typeFieldName)) {
                        kVar.r(RuntimeTypeAdapterFactory.this.typeFieldName, new m(str));
                        for (Map.Entry entry : b10.t()) {
                            kVar.r((String) entry.getKey(), (h) entry.getValue());
                        }
                        p10.write(cVar, kVar);
                        return;
                    }
                    throw new l("cannot serialize " + cls.getName() + " because it already defines a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
                }
                throw new l("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
            }
        }.nullSafe();
    }

    public RuntimeTypeAdapterFactory<T> registerIgnoredSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        this.labelToIgnoreSubtype.put(str, cls);
        this.subtypeToIgnoreLabel.put(cls, str);
        return this;
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        this.labelToSubtype.put(str, cls);
        this.subtypeToLabel.put(cls, str);
        return this;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str, false);
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type", false);
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }
}
