package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.collect.q  reason: case insensitive filesystem */
public abstract class C4766q extends r implements Map {
    protected C4766q() {
    }

    /* access modifiers changed from: protected */
    public abstract Map b();

    /* access modifiers changed from: protected */
    public boolean c(Object obj) {
        return G.b(this, obj);
    }

    public void clear() {
        b().clear();
    }

    public boolean containsKey(Object obj) {
        return b().containsKey(obj);
    }

    /* access modifiers changed from: protected */
    public boolean e(Object obj) {
        return G.c(this, obj);
    }

    public Set entrySet() {
        return b().entrySet();
    }

    /* access modifiers changed from: protected */
    public int g() {
        return a0.d(entrySet());
    }

    public Object get(Object obj) {
        return b().get(obj);
    }

    public boolean isEmpty() {
        return b().isEmpty();
    }

    public Set keySet() {
        return b().keySet();
    }

    public Object put(Object obj, Object obj2) {
        return b().put(obj, obj2);
    }

    public void putAll(Map map) {
        b().putAll(map);
    }

    public Object remove(Object obj) {
        return b().remove(obj);
    }

    public int size() {
        return b().size();
    }

    public Collection values() {
        return b().values();
    }
}
